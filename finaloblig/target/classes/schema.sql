CREATE TABLE Billett
(
    id INTEGER AUTO_INCREMENT NOT NULL,
    film VARCHAR (255) NOT NULL,
    antall INT NOT NULL,
    fornavn VARCHAR(255) NOT NULL,
    etternavn VARCHAR(255) NOT NULL,
    telefon VARCHAR(255) NOT NULL,
    Epost VARCHAR(255) NOT NULL,
    PRIMARY KEY (id)
);