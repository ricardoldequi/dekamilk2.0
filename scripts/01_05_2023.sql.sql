-- Database: dekamilk

-- DROP DATABASE IF EXISTS dekamilk;

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



CREATE TABLE Cliente (
	id_cliente Serial,
	nome VARCHAR(60) NOT NULL,
	cpf VARCHAR(14) NOT NULL UNIQUE  DEFAULT '000.000.000-00',
	cep VARCHAR(9),
	cnpj VARCHAR(14),
	endereco VARCHAR(150),
	cidade VARCHAR(70),
	bairro VARCHAR(70),
	uf VARCHAR(2),
	telefone VARCHAR(15) UNIQUE  DEFAULT '00 00000-0000',
	email VARCHAR(70),
	
		CONSTRAINT PK_cliente PRIMARY KEY (id_cliente)
	);


CREATE TABLE Fornecedor (
	id_fornecedor Serial,
	nome VARCHAR(60) NOT NULL,
	cpf VARCHAR(14) NOT NULL UNIQUE DEFAULT '000.000.000-00',
	cep VARCHAR(10),
	cnpj VARCHAR(14),
	endereco VARCHAR(150),
	cidade VARCHAR(70),
	bairro VARCHAR(70),
	uf VARCHAR(2),
	telefone VARCHAR(15) UNIQUE  DEFAULT '00 00000-0000',
	email VARCHAR(70),
		CONSTRAINT PK_fornecedor PRIMARY KEY (id_fornecedor)
);
	
	CREATE TABLE Operacao (
	id_operacao serial,
	descricao VARCHAR(300) NOT NULL,
	tipo varchar(1) NOT NULL, -- pode ser "E" de Entrada e "S" de Saida 
	    CONSTRAINT PK_Operacao PRIMARY KEY (id_operacao)
);


CREATE TABLE LancamentoEntrada (
	id_entrada serial,
	operacao_entrada int NOT NULL,
	cliente int NOT NULL,
	valor_recebido DECIMAL(7,2),
	descricao_entrada VARCHAR(150),
	data_entrada DATE NOT NULL,
		CONSTRAINT PK_id_entrada PRIMARY KEY (id_entrada),
			CONSTRAINT FK_cliente_entrada FOREIGN KEY (Cliente) REFERENCES Cliente(id_cliente), 
			CONSTRAINT FK_operacao_entrada FOREIGN KEY (operacao_entrada) REFERENCES Operacao(id_operacao)
);

CREATE TABLE LancamentoSaida (
	lancamento_saida serial,
	operacao_saida int NOT NULL,
	fornecedor INT NOT NULL,
	valor_gasto DECIMAL(7,2),
	descricao_saida VARCHAR(90),
	data_saida DATE NOT NULL,
	    CONSTRAINT PK_Lancamento_Saida PRIMARY KEY (lancamento_saida), 
			CONSTRAINT FK_Fornecedor FOREIGN KEY (Fornecedor) REFERENCES Fornecedor(id_fornecedor),
			CONSTRAINT FK_operacao_saida FOREIGN KEY (operacao_saida) REFERENCES Operacao(id_operacao)

);


CREATE TABLE PrecoUnitarioLitro (
    id_preco_unitario serial,
	valor_unitario FLOAT NOT NULL DEFAULT '0.00',
	data_recebida DATE NOT NULL,
	cliente INT NOT NULL,
		CONSTRAINT PK_id_preco_unitario PRIMARY KEY (id_preco_unitario),
			CONSTRAINT FK_cliente FOREIGN KEY (cliente) REFERENCES Cliente(id_cliente)
);

CREATE TABLE Funcao(
id_funcao serial,
nome varchar (20) not null,
	CONSTRAINT PK_id_funcao PRIMARY KEY (id_funcao)

);

CREATE TABLE Usuario (
	id_usuario serial,
	nome_usuario VARCHAR(60) NOT NULL UNIQUE,
	senha_usuario VARCHAR(20) NOT NULL,
	cpf VARCHAR(14) NOT NULL UNIQUE DEFAULT '000.000.000-00',
    email VARCHAR(70),
	funcao int not null,
	telefone varchar(15) UNIQUE  DEFAULT '00 00000-0000',
	CONSTRAINT PK_id_usuario PRIMARY KEY (id_usuario),
	CONSTRAINT FK_funcao FOREIGN KEY (funcao) REFERENCES Funcao(id_funcao)

);

-- incerção de dados primários


INSERT INTO Cliente( Nome, cpf, cep, endereco, cidade, bairro, uf, telefone, email)VALUES
('Coperida cooperativa', '651.551.390-90', '99830-000', 'R. Dr. Maruri, 1586', 'Gaurama', 'Centro', 'RS', '49 3441-4200', 'coperdia@hotmail.com');

INSERT INTO Fornecedor( nome, Cpf, cep, endereco, cidade, bairro, uf, telefone, email)VALUES
('Nutribov', '924.445.570-69', '15084-160', 'Rua Jose Polachini Sobrinho, 896', 'Sao Paulo', 'Centro', 'SP', ' (17) 3304-8387', 'nutribov@hotmail.com');

INSERT INTO Operacao( Descricao, Tipo)VALUES
('Venda de Leite','E'),
('Venda de Terneiros','E'),
('Compra de Vacinas','S'),
('Compra de Ração', 'S'),
 ('Compra de Pastagem' ,'S');
 
 INSERT INTO LancamentoEntrada( operacao_entrada, cliente, valor_recebido, descricao_entrada, data_entrada)VALUES 
 ( 11,1,54000.50,'venda  de 5320 litros', '2023-05-01'),
 (12,1,4500.00,'venda novilha brinco 439', '2023-04-04');
 
 INSERT INTO LancamentoSaida (operacao_saida, Fornecedor, valor_gasto, descricao_saida, data_saida) VALUES
(13,4,450.00,'Compra Ivomec', '2023-05-02'),
(14,4, 4500.00, 'Ração crescimento', '2023-04-13');

INSERT INTO Funcao(nome)VALUES
('administrador'),
('funcionario');

INSERT INTO Usuario (nome_usuario, senha_usuario, cpf, email, funcao, telefone) VALUES
('Dekamilk', 'deka','924.445.570-69', 'administrativo@dekamilk.com.br', 1, '54 70707-7070');

