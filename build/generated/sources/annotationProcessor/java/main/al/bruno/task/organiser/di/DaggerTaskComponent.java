package al.bruno.task.organiser.di;

import al.bruno.task.organiser.Main;
import dagger.internal.DaggerGenerated;
import dagger.internal.Preconditions;
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
public final class DaggerTaskComponent implements TaskComponent {
  private final DaggerTaskComponent taskComponent = this;

  private DaggerTaskComponent(Main appParam) {


  }

  public static TaskComponent.Factory factory() {
    return new Factory();
  }

  @Override
  public void inject(Main app) {
  }

  private static final class Factory implements TaskComponent.Factory {
    @Override
    public TaskComponent create(Main app) {
      Preconditions.checkNotNull(app);
      return new DaggerTaskComponent(app);
    }
  }
}
