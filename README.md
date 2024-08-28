# Ejecutar docker compose # 

$ docker compose up -d

# Ejecutar consultas a la base de datos # 
**_Create Table Clientes_**

CREATE TABLE clientes (
id INT PRIMARY KEY AUTO_INCREMENT,
nombre VARCHAR(255),
edad INT);

**_Insert into Clientes_**

INSERT INTO clientes (nombre, edad) VALUES ('Zaira', 27);

**_Select Clientes_**

SELECT * FROM clientes;

**_Update Clientes_**

UPDATE clientes SET nombre='Juan', edad=39 WHERE id=1;

**_Delete Clientes_**

DELETE FROM clientes WHERE edad >= 70;