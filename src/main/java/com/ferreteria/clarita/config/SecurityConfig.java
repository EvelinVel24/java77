package src.main.java.com.ferreteria.clarita.config;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable()
            .authorizeRequests()
            .antMatchers("/productos/**").hasAnyRole("ADMIN", "CLIENTE")
            .antMatchers("/admin/**").hasRole("ADMIN")
            .and()
            .formLogin();
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}
