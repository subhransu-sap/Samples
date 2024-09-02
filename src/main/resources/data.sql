-- Data for players table
INSERT INTO players (id, name, role) VALUES
(1, 'Virat Kohli', 'Batsman'),
(2, 'Jasprit Bumrah', 'Bowler'),
(3, 'Rohit Sharma', 'Batsman'),
(4, 'Ravindra Jadeja', 'All-Rounder'),
(5, 'Rishabh Pant', 'Wicketkeeper'),
(6, 'Hardik Pandya', 'All-Rounder'),
(7, 'KL Rahul', 'Batsman'),
(8, 'Shikhar Dhawan', 'Batsman'),
(9, 'Mohammed Shami', 'Bowler'),
(10, 'Yuzvendra Chahal', 'Bowler');

-- Data for matches table
INSERT INTO matches (id, score, status) VALUES
(1, 250, 'Won'),
(2, 200, 'Lost'),
(3, 300, 'Won'),
(4, 220, 'No Result'),
(5, 180, 'Lost'),
(6, 310, 'Won'),
(7, 260, 'Won'),
(8, 210, 'Lost'),
(9, 280, 'Won'),
(10, 240, 'Lost');

-- Data for records table
INSERT INTO records (id, record_date, last_updated) VALUES
(1, '2023-01-01 10:00:00', '2023-01-02 12:00:00'),
(2, '2023-02-15 14:30:00', '2023-02-16 16:00:00'),
(3, '2023-03-20 09:00:00', '2023-03-21 10:00:00'),
(4, '2023-04-05 11:15:00', '2023-04-06 13:45:00'),
(5, '2023-05-10 08:00:00', '2023-05-11 09:30:00'),
(6, '2023-06-18 17:00:00', '2023-06-19 18:30:00'),
(7, '2023-07-22 19:45:00', '2023-07-23 21:00:00'),
(8, '2023-08-30 13:30:00', '2023-08-31 15:00:00'),
(9, '2023-09-10 16:00:00', '2023-09-11 17:30:00'),
(10, '2023-10-02 07:00:00', '2023-10-03 08:30:00');