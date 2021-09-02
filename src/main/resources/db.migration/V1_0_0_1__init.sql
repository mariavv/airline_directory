CREATE SEQUENCE IF NOT EXISTS hibernate_sequence start 100 increment 1;

CREATE TABLE IF NOT EXISTS alliance
(
    id       serial          PRIMARY KEY,
    name     varchar(255)    UNIQUE NOT NULL,
    created  timestamp       NOT NULL,
    INDEX name_index (name)
);

CREATE TABLE IF NOT EXISTS airline
(
    id                   serial       PRIMARY KEY,
    alliance_id          integer,
    iata_code            integer      UNIQUE NOT NULL,
    icao_code            integer      UNIQUE NOT NULL,
    low_cost_carrier     bit          NOT NULL,
    name                 varchar(255) UNIQUE NOT NULL,
    website              varchar(255) UNIQUE,
    created              timestamp    NOT NULL,
    FOREIGN KEY (alliance_id) REFERENCES alliance (id),
    INDEX alliance_id_index (alliance_id)
);