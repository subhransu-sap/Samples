DROP TABLE IF EXISTS NOTES;

CREATE TABLE NOTES
(
  id VARCHAR
  AUTO_INCREMENT PRIMARY KEY,
  body VARCHAR
  (250) NOT NULL,

);


CREATE TABLE AUTHOR
(
  id VARCHAR
  AUTO_INCREMENT PRIMARY KEY,
  name VARCHAR
  (250) NOT NULL,

);