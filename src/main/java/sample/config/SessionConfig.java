package sample.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.session.ExpiringSession;
import org.springframework.session.MapSessionRepository;
import org.springframework.session.SessionRepository;
import org.springframework.session.web.http.SessionRepositoryFilter;

import javax.servlet.ServletContext;

/**
 * Created by igor.mukhin on 14.11.2015.
 */
@Configuration
public class SessionConfig {

    private Integer maxInactiveIntervalInSeconds = 60;

    @Bean
    public MapSessionRepository mapSessionRepository() {
        MapSessionRepository sessionRepository = new MapSessionRepository();
        sessionRepository.setDefaultMaxInactiveInterval(maxInactiveIntervalInSeconds);
        return sessionRepository;
    }

    @Bean
    public <S extends ExpiringSession> SessionRepositoryFilter<? extends ExpiringSession>
    springSessionRepositoryFilter(SessionRepository<S> sessionRepository, ServletContext servletContext) {
        SessionRepositoryFilter<S> sessionRepositoryFilter = new SessionRepositoryFilter<S>(sessionRepository);
        sessionRepositoryFilter.setServletContext(servletContext);
        return sessionRepositoryFilter;
    }

}
