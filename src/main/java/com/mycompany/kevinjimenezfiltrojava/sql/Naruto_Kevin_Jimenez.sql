CREATE DATABASE IF NOT EXISTS Naruto_Kevin_Jimenez;
USE Naruto_Kevin_Jimenez;
CREATE TABLE Ninja(
    ID INT NOT NULL PRIMARY KEY,
    Nombre VARCHAR(255) NOT NULL,
    Rango VARCHAR(255) NOT NULL,
    Aldea VARCHAR(255) NOT NULL
);
CREATE TABLE MisionNinja(
    ID_Ninja INT NOT NULL,
    ID_Mision INT NOT NULL,
    FechaInicio DATE NOT NULL,
    FechaFin DATE,
    PRIMARY KEY (ID_Ninja,ID_Mision)
);
CREATE TABLE Mision(
    ID INT NOT NULL PRIMARY KEY,
    Descripcion VARCHAR(255) NOT NULL,
    Rango VARCHAR(255) NOT NULL,
    Recompensa VARCHAR(255) NOT NULL
);
CREATE TABLE Habilidad(
    ID_Ninja INT NOT NULL,
    Nombre VARCHAR(255) NOT NULL,
    Descripcion VARCHAR(255) NOT NULL
);
ALTER TABLE
    MisionNinja ADD CONSTRAINT misionninja_id_mision_foreign FOREIGN KEY(ID_Mision) REFERENCES Mision(ID);
ALTER TABLE
    Habilidad ADD CONSTRAINT habilidad_id_ninja_foreign FOREIGN KEY(ID_Ninja) REFERENCES Ninja(ID);
ALTER TABLE
    MisionNinja ADD CONSTRAINT misionninja_id_ninja_foreign FOREIGN KEY(ID_Ninja) REFERENCES Ninja(ID);

INSERT INTO Ninja (ID,Nombre,Rango,Aldea) VALUES (1,"Juan","Alto","pueblo paleta");
INSERT INTO Ninja (ID,Nombre,Rango,Aldea) VALUES (2,"Miguel","Medio","Sodoma");
INSERT INTO Ninja (ID,Nombre,Rango,Aldea) VALUES (3,"Pedro","Bajo","Gomorra");
INSERT INTO Mision (ID,Descripcion,Rango,Recompensa) VALUES (1,"Capturar un pokemon legendario","Alto","100 monedas de oro");
INSERT INTO Mision (ID,Descripcion,Rango,Recompensa) VALUES (2,"Matar un demonio de nivel superior","Alto","50 monedas de oro");
INSERT INTO Mision (ID,Descripcion,Rango,Recompensa) VALUES (3,"Vigilar la aldea","Bajo","5 monedas de plata");
INSERT INTO Habilidad(ID_Ninja,Nombre,Descripcion) VALUES (1,"Gran maestro pokemon","Capaz de capturar cualquier pokemon");
INSERT INTO Habilidad(ID_Ninja,Nombre,Descripcion) VALUES (2,"Asesino de demonios","Con su katana mata cualquier demonio");
INSERT INTO Habilidad(ID_Ninja,Nombre,Descripcion) VALUES (3,"Gran vigilante","No duerme en vigias nocturnas");
INSERT INTO MisionNinja(ID_Ninja,ID_Mision,FechaInicio,FechaFin) VALUES (1,1,'1960-12-18','1960-12-31');
INSERT INTO MisionNinja(ID_Ninja,ID_Mision,FechaInicio,FechaFin) VALUES (2,2,'2000-01-20','2000-01-30');
INSERT INTO MisionNinja(ID_Ninja,ID_Mision,FechaInicio) VALUES (3,3,'2020-06-20');