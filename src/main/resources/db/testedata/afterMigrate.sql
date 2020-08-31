
set foreign_key_checks = 0;

delete from produto;
delete from categoria;

set foreign_key_checks = 1;

alter table produto auto_increment = 1;
alter table categoria auto_increment = 1;


INSERT INTO categoria (id,nome) VALUES (1,'ELETRONICOS');
INSERT INTO categoria (id,nome) VALUES (2,'ELETRODOMESTICOS');
INSERT INTO categoria (id,nome) VALUES (3,'MOVEIS');

insert into produto (id,nome,descricao,categoria_id) values (1,'NOTEBOOK','NOTEBOOK SAMSUNG',1);
insert into produto (id,nome,descricao,categoria_id) values (2,'GELADEIRA','GELADEIRA AZUL',2);
insert into produto (id,nome,descricao,categoria_id) values (3,'Mouse','Mouse sem fio',3);
