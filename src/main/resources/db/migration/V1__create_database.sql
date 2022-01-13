create TABLE IF NOT EXISTS task(_id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,
                _subject TEXT,
                _task_type INTEGER REFERENCES task_type(_id) ON update CASCADE ON delete CASCADE,
                _duration REAL,
                _difficulties INTEGER,
                _deadline TEXT
                );

CREATE TABLE task_type (_id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, _task_type TEXT);