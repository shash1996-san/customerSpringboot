-- V1__baseline.sql
CREATE TABLE IF NOT EXISTS flyway_schema_history (
                                                     installed_rank INT NOT NULL,
                                                     version VARCHAR(50),
    description VARCHAR(200) NOT NULL,
    type VARCHAR(20) NOT NULL,
    script VARCHAR(1000) NOT NULL,
    checksum INT,
    installed_by VARCHAR(100) NOT NULL,
    installed_on TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    execution_time INT NOT NULL,
    success BOOLEAN NOT NULL
    );

-- Other initialization statements for your schema, if needed
