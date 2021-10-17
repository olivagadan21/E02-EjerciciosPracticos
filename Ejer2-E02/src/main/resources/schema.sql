CREATE TABLE producto (
    id   INTEGER      NOT NULL AUTO_INCREMENT,
    nombre VARCHAR(255) NOT NULL,
    precio REAL        NOT NULL,
    imagen TEXT,
    descripcion TEXT,
    PRIMARY KEY (id)
);
