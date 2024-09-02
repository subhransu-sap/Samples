DROP TABLE IF EXISTS players;
DROP TABLE IF EXISTS matches;
DROP TABLE IF EXISTS records;



CREATE TABLE players (
    id INT PRIMARY KEY,
    name VARCHAR(255),
    role VARCHAR(255)
);

CREATE TABLE matches (
    id INT PRIMARY KEY,
    score INT,
    status VARCHAR(255)
);

CREATE TABLE records (
    id INT PRIMARY KEY,
    record_date TIMESTAMP,
    last_updated TIMESTAMP
);