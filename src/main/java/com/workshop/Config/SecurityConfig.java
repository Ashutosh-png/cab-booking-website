package com.workshop.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

import com.workshop.Service.UserDetailServiceImpl;
import com.workshop.Service.UserService;


@Configuration
@EnableWebSecurity
public class SecurityConfig {
	
	
	private  UserService userService;

    public SecurityConfig(@Lazy UserService userService) {
        this.userService = userService;
    }
    
//    public UserService userService() {
//    	return new UserDetailServiceImpl();
//    }
   
	   
	      @Bean
	    public BCryptPasswordEncoder passwordEncoder() {
	        return new BCryptPasswordEncoder();
	    }
	    
	    @Bean
		@Primary
		AuthenticationManagerBuilder  authenticationManager(AuthenticationManagerBuilder auth) throws Exception {
			
	    	auth.authenticationProvider(authenticationProvider());
	    
		    return auth;
		}
	    
	    @Bean
	    public DaoAuthenticationProvider authenticationProvider() {
	        DaoAuthenticationProvider auth = new DaoAuthenticationProvider();
	        auth.setUserDetailsService( userService);
	        auth.setPasswordEncoder(passwordEncoder());
	        return auth;
	    }
	    
	    
	    @Bean
		 public SecurityFilterChain filterChain(HttpSecurity http) throws Exception{
	    	
	    	http
            .authorizeHttpRequests()
                .requestMatchers("/resources/**", "/registration", "/home","/forgot-pass","/change-pass","/fonts/**","/register","/css/**","/js/**","/images/**","/cab","/invoice","/getUserBooking","/thankyou","/testpage","/book","/contact","/about","/services","/pune","/error").permitAll()
                .requestMatchers("/admin/**").hasAuthority("ADMIN")
                .requestMatchers("/user/**").hasAuthority("USER")
                .requestMatchers("/vendor/**").hasAuthority("VENDOR")
                .anyRequest().authenticated()
                .and()
            .formLogin()
                .loginPage("/login")
                .permitAll()
                .successHandler(roleBasedAuthenticationSuccessHandler())
                .defaultSuccessUrl("/home")

                .and()
            .logout()
            .logoutUrl("/logout")
            .logoutSuccessUrl("/login?logout")

                .permitAll()
                .and()
                .csrf().disable();
	    	
			return http.build();

	    }
	    
	    @Bean
	    public RoleBasedAuthenticationSuccessHandler roleBasedAuthenticationSuccessHandler() {
	        RoleBasedAuthenticationSuccessHandler successHandler = new RoleBasedAuthenticationSuccessHandler();
	        successHandler.setAdminTargetUrl("/admin/dashboard");
	        successHandler.setDoctorTargetUrl("/doctor/dashboard");
             successHandler.setUserTargetUrl("/user/dashboard");
	        return successHandler;
	    }
	 // @Autowired
		   // private PasswordEncoder passwordEncoder;

}
