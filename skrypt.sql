DROP TABLE IF EXISTS Players;
CREATE TABLE Players(
	ID SERIAL PRIMARY KEY NOT NULL,
	NAME TEXT NOT NULL,
	SURNAME TEXT NOT NULL,
	REKA TEXT NOT NULL,
	DATAUR INT NOT NULL
	);

INSERT INTO Players (NAME, SURNAME, REKA, DATAUR)  VALUES ('Roger', 'Federer', 'R', 1980-12-12);
INSERT INTO Players (NAME, SURNAME, REKA, DATAUR)  VALUES ('Rafael', 'Nadal', 'L', 1980-12-12);
INSERT INTO Players (NAME, SURNAME, REKA, DATAUR)  VALUES ('Novak', 'Djocovic', 'R', 1980-12-12);
INSERT INTO Players (NAME, SURNAME, REKA, DATAUR)  VALUES ('Stan', 'Wawrinka', 'R', 1980-12-12);
INSERT INTO Players (NAME, SURNAME, REKA, DATAUR)  VALUES ('Szymon', 'Krasowski', 'R', 1980-12-12);
INSERT INTO Players (NAME, SURNAME, REKA, DATAUR)  VALUES ('Mateusz', 'Kacprzycki', 'R', 1980-12-12);
INSERT INTO Players (NAME, SURNAME, REKA, DATAUR)  VALUES ('Stan', 'Wawi', 'R', 1980-12-12);
INSERT INTO Players (NAME, SURNAME, REKA, DATAUR)  VALUES ('Nikolas', 'Dmitrov', 'R', 1980-12-12);
INSERT INTO Players (NAME, SURNAME, REKA, DATAUR)  VALUES ('Juan', 'Del-Potro', 'R', 1980-12-12);
INSERT INTO Players (NAME, SURNAME, REKA, DATAUR)  VALUES ('Andy', 'Murray', 'R', 1980-12-12);
