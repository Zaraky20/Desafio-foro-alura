CREATE TABLE topicos (
    id BIGINT NOT NULL AUTO_INCREMENT,
    titulo VARCHAR(255) NOT NULL,
    mensaje TEXT NOT NULL UNIQUE,  -- Aseguramos que los mensajes sean únicos
    fechaCreacion TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL,
    estado VARCHAR(50) DEFAULT 'ABIERTO' NOT NULL,
    usuario VARCHAR(100) NOT NULL,
    curso VARCHAR(255) NOT NULL,
    PRIMARY KEY(id)
);

