package  al.bruno.task.organiser.di;

import dagger.Module;
import dagger.Provides;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import javax.inject.Singleton;

/**
 *
 * Connect to a sample database
 *
 * https://github.com/xerial/sqlite-jdbc
 *
 * https://www.baeldung.com/spring-boot-sqlite
 */

@Module
public class CoreModule {
    @Singleton
    @Provides
    public SessionFactory sessionFactory() {
        return new Configuration().configure().buildSessionFactory();
    }

    @Provides
    @Singleton
    public Session session(SessionFactory sessionFactory) {
        return sessionFactory.openSession();
    }
}
