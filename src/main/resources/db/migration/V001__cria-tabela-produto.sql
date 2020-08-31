create table produto (
id bigint not null auto_increment,
 nome VARCHAR(50) NOT NULL,
  descricao VARCHAR(255),
  
  primary key(id)
   ) engine=InnoDB default charset=utf8;