create TABLE IF NOT EXISTS task(_id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,
                _subject TEXT,
                _task_type INTEGER REFERENCES task_type(_id) ON update CASCADE ON delete CASCADE,
                _duration INTEGER,
                _difficulties INTEGER,
                _deadline TEXT
                );

CREATE TABLE task_type (_id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, _task_type TEXT);

INSERT INTO task_type(_task_type) values ('test');