
	 --Database: dekamilk

 --DROP DATABASE dekamilk;
/*CREATE DATABASE dekamilk
    WITH
    OWNER = postgres
    ENCODING = 'UTF8'
    LC_COLLATE = 'Portuguese_Brazil.1252'
    LC_CTYPE = 'Portuguese_Brazil.1252'
    TABLESPACE = pg_default
    CONNECTION LIMIT = -1
    IS_TEMPLATE = False;
*/	





CREATE TABLE cliente (
	id_cliente Serial not null,
	nome VARCHAR(60) NOT NULL,
	cpf VARCHAR(14)UNIQUE DEFAULT '000.000.000-00',
	cep VARCHAR(9),
	cnpj VARCHAR(14),
	endereco VARCHAR(150),
	cidade VARCHAR(70),
	bairro VARCHAR(70),
	uf VARCHAR(2),
	telefone VARCHAR(15)  DEFAULT '00 00000-0000',
	telefone_fixo VARCHAR(15)  DEFAULT '00 00000-0000',
	email VARCHAR(70),
	
		CONSTRAINT PK_cliente PRIMARY KEY (id_cliente)
	);


CREATE TABLE fornecedor (
	id_fornecedor Serial,
	nome VARCHAR(60) NOT NULL,
	cpf VARCHAR(14) UNIQUE DEFAULT '000.000.000-00',
	cep VARCHAR(10),
	cnpj VARCHAR(14),
	endereco VARCHAR(150),
	cidade VARCHAR(70),
	bairro VARCHAR(70),
	uf VARCHAR(2),
	telefone VARCHAR(15) DEFAULT '00 00000-0000',
	telefone_fixo VARCHAR(15)  DEFAULT '00 00000-0000',
	email VARCHAR(70),
		CONSTRAINT PK_fornecedor PRIMARY KEY (id_fornecedor)
);
	
CREATE TABLE operacao (
	id_operacao serial not null,
	descricao VARCHAR(300) NOT NULL,
	tipo VARCHAR(1), -- pode ser "E" de Entrada e "S" de Saida 
	    CONSTRAINT PK_operacao PRIMARY KEY (id_operacao)
);



CREATE TABLE lancamento_entrada (
	id_entrada serial not null,
	operacao_entrada int NOT NULL,
	cliente bigint NOT NULL,
	valor_recebido double precision not null,
	descricao_entrada VARCHAR(150),
	data_entrada DATE NOT NULL,
		CONSTRAINT PK_id_entrada PRIMARY KEY (id_entrada),
			CONSTRAINT FK_cliente FOREIGN KEY (cliente) REFERENCES cliente(id_cliente), 
			CONSTRAINT FK_operacao_entrada FOREIGN KEY (operacao_entrada) REFERENCES operacao(id_operacao)
);

CREATE TABLE lancamento_saida (
	id_saida serial not null4,
	operacao_saida bigint NOT NULL,
	fornecedor bigint NOT NULL,
	valor_gasto double precision not null,
	descricao_saida VARCHAR(90),
	data_saida DATE NOT NULL,
	    CONSTRAINT PK_id_saida PRIMARY KEY (id_saida), 
			CONSTRAINT FK_fornecedor FOREIGN KEY (fornecedor) REFERENCES fornecedor(id_fornecedor),
			CONSTRAINT FK_operacao_saida FOREIGN KEY (operacao_saida) REFERENCES operacao(id_operacao)

);


CREATE TABLE preco_unitario_litro (
    id_preco_unitario serial not null,
	valor_unitario numeric (38, 2) NOT NULL,
	data_recebida DATE NOT NULL,
	cliente bigint NOT NULL,
		CONSTRAINT PK_id_preco_unitario PRIMARY KEY (id_preco_unitario),
			CONSTRAINT FK_cliente FOREIGN KEY (cliente) REFERENCES cliente(id_cliente)
);

CREATE TABLE funcao(
	id_funcao serial,
	nome varchar (20) not null,
		CONSTRAINT PK_id_funcao PRIMARY KEY (id_funcao)

);

CREATE TABLE usuario (
	id_usuario serial,
	nome_usuario VARCHAR(60) NOT NULL UNIQUE,
	senha_usuario VARCHAR(20) NOT NULL,
	cpf VARCHAR(14) NOT NULL UNIQUE DEFAULT '000.000.000-00',
    email VARCHAR(70),
	funcao int not null,
	telefone varchar(15) UNIQUE  DEFAULT '00 00000-0000',
		CONSTRAINT PK_id_usuario PRIMARY KEY (id_usuario),
			CONSTRAINT FK_funcao FOREIGN KEY (funcao) REFERENCES funcao(id_funcao)

);
CREATE TABLE classificacao_bovina( --basia-se na declaracao anual de rebanho obrigatoria lei estadual n13.467/2010
	id_classificacao SERIAL not null,
	nome varchar (35) not null,
	sexo varchar(1), -- 'F' ou 'M'

		CONSTRAINT PK_id_classificacao PRIMARY KEY (id_classificacao)
);
CREATE TABLE raca(
	id_raca SERIAL not null,
	nome varchar (20) not null,
		CONSTRAINT PK_id_raca PRIMARY KEY (id_raca)
);



create table cadastro_animal(
	id_animal serial not null,
	id_classificacao bigint not null,
	id_raca bigint not null,
	numero_brinco  integer not null,
	nome varchar (15) not null,
	nome_pai varchar (15),
	nome_mae varchar (15),
	inseminada boolean,
	lactante varchar(1),
	numero_crias integer,
	peso numeric(38, 2),
	sexo varchar(1),
	data_cria date,
		CONSTRAINT PK_id_animal PRIMARY KEY (id_animal),
       		CONSTRAINT FK_id_classificacao FOREIGN KEY (id_classificacao) REFERENCES classificacao_bovina(id_classificacao),
            CONSTRAINT FK_id_raca FOREIGN KEY (id_raca) REFERENCES raca(id_raca)

	
);

-- incerÃ§Ã£o de dados primÃ¡rios


INSERT INTO cliente( Nome, cpf, cep, endereco, cidade, bairro, uf, telefone, telefone_fixo, email)VALUES
('Coperida cooperativa', '651.551.390-90', '99830-000', 'R. Dr. Maruri, 1586', 'Gaurama', 'Centro', 'RS', '49 3441-4200', null, 'coperdia@hotmail.com');

INSERT INTO fornecedor( nome, Cpf, cep, endereco, cidade, bairro, uf, telefone,telefone_fixo, email)VALUES
('Nutribov', '924.445.570-69', '15084-160', 'Rua Jose Polachini Sobrinho, 896', 'Sao Paulo', 'Centro', 'SP', ' (17) 3304-8387',null, 'nutribov@hotmail.com');

INSERT INTO operacao( Descricao, Tipo)VALUES
('Venda de Leite','E'),
('Venda de Terneiros','E'),
('Compra de Vacinas','S'),
('Compra de Ração', 'S'),
 ('Compra de Pastagem' ,'S');
 

 
 INSERT INTO lancamento_entrada( operacao_entrada, cliente, valor_recebido, descricao_entrada, data_entrada)VALUES 
 ( 1,1,54000.50,'venda  de 5320 litros', '2023-05-01'),
 (2,1,4500.00,'venda novilha brinco 439', '2023-04-04');
 
 INSERT INTO lancamento_saida (operacao_saida, fornecedor, valor_gasto, descricao_saida, data_saida) VALUES
(3,1,450.00,'Compra Ivomec', '2023-05-02'),
(4,1, 4500.00, 'Ração crescimento', '2023-04-13');

INSERT INTO funcao(nome)VALUES
('administrador'),
('funcionario');

INSERT INTO usuario (nome_usuario, senha_usuario, cpf, email, funcao, telefone) VALUES
('Dekamilk', 'deka','924.445.570-69', 'administrativo@dekamilk.com.br', 1, '54 70707-7070');

INSERT INTO classificacao_bovina (nome) VALUES
('0 a 12 meses'), 
('13 a 24 meses'),
('25 a 36 meses'),
('mais de 36 meses');

INSERT INTO raca (nome) VALUES
('Holandesa(ês)'),
('Jersey'),
('Pardo Suíço'),
('Gir'),
('Girolando'),
('Guzerá'),
('Sindi'),
('Angus');

INSERT INTO cadastro_animal(id_classificacao,id_raca, numero_brinco,nome, nome_pai, nome_mae, inseminada, lactante, numero_crias, sexo, data_cria)VALUES
(3, 1, 211, 'Jeniffer', null, null, true, 'S', 1, 'F', '13/03/2022'),
(2, 1, 212, 'Mimosa', 'Tonhao', 'Alberta', false, 'S', 1, 'F', '15/09/2022'),
(3, 1, 213, 'Xuxinha', null, null, true, 'N', 1, 'F', '12/02/2022'),
(3, 1, 214, 'Chapisco', null, null, false, 'N', 1, 'M', '22/02/2022');