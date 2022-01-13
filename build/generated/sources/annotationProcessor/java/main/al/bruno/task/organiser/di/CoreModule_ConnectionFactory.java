package al.bruno.task.organiser.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import java.sql.Connection;
import javax.annotation.processing.Generated;

@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class CoreModule_ConnectionFactory implements Factory<Connection> {
  private final CoreModule module;

  public CoreModule_ConnectionFactory(CoreModule module) {
    this.module = module;
  }

  @Override
  public Connection get() {
    return connection(module);
  }

  public static CoreModule_ConnectionFactory create(CoreModule module) {
    return new CoreModule_ConnectionFactory(module);
  }

  public static Connection connection(CoreModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.connection());
  }
}
