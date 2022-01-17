package al.bruno.task.organiser.hibernate.config;

import dagger.internal.Preconditions;
import org.hibernate.Session;

import javax.inject.Inject;
import java.io.Serializable;
import java.util.List;
import java.util.Optional;

/**
 * https://www.baeldung.com/persistence-layer-with-spring-and-hibernate
 * https://www.baeldung.com/java-dao-pattern
 * @param <T>
 */

public abstract class DaoImpl<T extends Serializable> implements Dao<T> {
    private Class<T> clazz;

    public final void setClazz(final Class<T> clazzToSet) {
        clazz = Preconditions.checkNotNull(clazzToSet);
    }
    private final Session session;
    @Inject
    public DaoImpl(Session session) {
        this.session = session;
    }

    @Override
    public Optional<T> get(long id) {
        return Optional.ofNullable(session.find(clazz, id));
    }

    @Override
    public List<T> getAll() {
        return session.createQuery( "from Task", clazz).getResultList();
    }

    @Override
    public void save(T t) {

    }

    @Override
    public void update(T t, String[] params) {

    }

    @Override
    public void delete(T t) {

    }
}
