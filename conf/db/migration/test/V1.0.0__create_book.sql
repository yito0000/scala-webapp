DROP TABLE IF EXISTS book CASCADE;

CREATE TABLE book
(
    id     VARCHAR(36)  NOT NULL,
    title  VARCHAR(200) NOT NULL,
    author VARCHAR(200) NOT NULL,
    created_date TIMESTAMP NOT NULL,
    updated_date TIMESTAMP NOT NULL,
    CONSTRAINT book_pk PRIMARY KEY (id)
);