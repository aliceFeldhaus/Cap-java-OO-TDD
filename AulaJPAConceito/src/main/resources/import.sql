insert into contato (nome, email) values ('maria','maria@gmail.com');
insert into contato (nome, email) values ('ana','ana@gmail.com');
insert into contato (nome, email) values ('joao','joao@gmail.com');
insert into contato (nome, email) values ('fernando','fernando@gmail.com');

insert into compromisso (data, hora, local, idcontato) values ('25-09-22','12:56:00','Sala B11', 1);
insert into compromisso (data, hora, local, idcontato) values ('11-08-23','00:00:00','Fazenda', 2);
insert into compromisso (data, hora, local, idcontato) values ('31-09-22','15:06:09','Na ponte', 3);
insert into compromisso (data, hora, local, idcontato) values ('23-04-23','14:56:00','Praça', 4);

insert into tb_cliente (nome, email) values ('maria','maria@gmail.com');
insert into tb_cliente (nome, email) values ('ana','ana@gmail.com');
insert into tb_cliente (nome, email) values ('lucas','lucas@gmail.com');

insert into tb_venda (dia_compra, cliente_id) values ('2022-05-20', 1);
insert into tb_venda (dia_compra, cliente_id) values ('2022-05-24', 1);
insert into tb_venda (dia_compra, cliente_id) values ('2022-05-25', 1);

insert into tb_venda (dia_compra, cliente_id) values ('2022-05-13', 2);
insert into tb_venda (dia_compra, cliente_id) values ('2022-05-18', 2);

insert into tb_venda (dia_compra, cliente_id) values ('2022-05-09', 3);
insert into tb_venda (dia_compra, cliente_id) values ('2022-10-19', 3);
insert into tb_venda (dia_compra, cliente_id) values ('2022-12-29', 3);

insert into autores (nome) values ('Machado de Assis');
insert into autores (nome) values ('Jose de Alencar');
insert into autores (nome) values ('Clarice Lispector');

insert into livro (titulo) values ('Dom Casmurro');
insert into livro (titulo) values ('O Guarani');
insert into livro (titulo) values ('A Paixão segundo GH');

insert into livro_autores(livro_id, autores_id) values (1,1);
insert into livro_autores(livro_id, autores_id) values (2,2);
insert into livro_autores(livro_id, autores_id) values (3,3);