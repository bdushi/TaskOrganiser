package al.bruno.task.organiser.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import java.sql.Connection;
import java.sql.Statement;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class CoreModule_StatementFactory implements Factory<Statement> {
  private final CoreModule module;

  private final Provider<Connection> connectionProvider;

  public CoreModule_StatementFactory(CoreModule module, Provider<Connection> connectionProvider) {
    this.module = module;
    this.connectionProvider = connectionProvider;
  }

  @Override
  public Statement get() {
    return statement(module, connectionProvider.get());
  }

  public static CoreModule_StatementFactory create(CoreModule module,
      Provider<Connection> connectionProvider) {
    return new CoreModule_StatementFactory(module, connectionProvider);
  }

  public static Statement statement(CoreModule instance, Connection connection) {
    return Preconditions.checkNotNullFromProvides(instance.statement(connection));
  }
}
