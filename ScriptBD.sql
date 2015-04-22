-- creamos base de datos
create database bd_crud1;

-- usamos la base de datos creada
use bd_crud1;

-- creamos la tabla pais
create table pais(
  id_pais varchar(12),
  nombre_pais varchar(100),
  primary key(id_pais)
);

-- insertamos los primeros registros.
insert into pais 
   values('ve','Venezuela'),
   ('co','Colombia');
   
   