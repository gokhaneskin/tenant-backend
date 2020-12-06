  DROP TABLE IF EXISTS announcement;
create table announcement (
	id INT NOT NULL,
	title TEXT NULL,
	description TEXT NULL,
	price decimal NULL,
	CONSTRAINT announcement_pk PRIMARY KEY (id)
);