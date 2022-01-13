package al.bruno.task.organiser.data.source.local;

import java.time.LocalDateTime;

public class Metadata {
    private final long id;
    private final LocalDateTime created;
    private final LocalDateTime updated;
    private final String version;
    private final String name;

    public Metadata(
            long id,
            LocalDateTime created,
            LocalDateTime updated,
            String version,
            String name) {
        this.id = id;
        this.created = created;
        this.updated = updated;
        this.version = version;
        this.name = name;
    }
}
