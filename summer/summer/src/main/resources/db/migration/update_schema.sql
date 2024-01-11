-- V2__update_customer_table.sql
ALTER TABLE cutomer
    MODIFY active_state TINYINT DEFAULT 1;
