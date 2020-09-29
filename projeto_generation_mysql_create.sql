CREATE TABLE `tb_usuario` (
	`id_usuario` INT(255) NOT NULL AUTO_INCREMENT UNIQUE,
	`nome_usario` varchar(255) NOT NULL,
	`email_usario` varchar(255) NOT NULL,
	`data_nasc` DATETIME NOT NULL,
	`sexo_usuario` varchar(255) NOT NULL,
	`telefone_usuario` varchar(100) NOT NULL,
	`cpf_usuario` varchar(100) NOT NULL,
	`data_usuario` DATETIME(255) NOT NULL DEFAULT 'now()',
	`login_usuario` varchar(40) NOT NULL,
	`senha_usuario` varchar(40) NOT NULL,
	PRIMARY KEY (`id_usuario`)
);

CREATE TABLE `tb_categoria` (
	`id_categoria` INT(255) NOT NULL AUTO_INCREMENT,
	`categoria_nome` varchar(255) NOT NULL,
	PRIMARY KEY (`id_categoria`)
);

CREATE TABLE `tb_produto` (
	`id_produto` INT NOT NULL AUTO_INCREMENT,
	`nome_produto` varchar(255) NOT NULL,
	`qtde_produto` INT(255) NOT NULL,
	`descricao_produto` TEXT NOT NULL,
	`preco_produto` DECIMAL NOT NULL,
	`id_categoria` varchar(255) NOT NULL,
	PRIMARY KEY (`id_produto`)
);

CREATE TABLE `tb_parceiros` (
	`id_parceiros` INT NOT NULL AUTO_INCREMENT,
	`nome_parceiro` varchar(255) NOT NULL AUTO_INCREMENT,
	`cnpj_parceiro` INT(255) AUTO_INCREMENT,
	`cpf_parceiro` INT(255) AUTO_INCREMENT,
	`dados_bancarios` TEXT(255) NOT NULL AUTO_INCREMENT,
	`data_registro` DATETIME(255) NOT NULL DEFAULT 'now()',
	PRIMARY KEY (`id_parceiros`)
);

CREATE TABLE `tb_pagamento` (
	`forma_pagamento` varchar(100) NOT NULL,
	`valor_total` DECIMAL(100) NOT NULL,
	`cartao_pagamento` varchar(100) NOT NULL,
	`boleto_pagamento` varchar(100) NOT NULL,
	`id_produto` INT(255) NOT NULL,
	`id_usuario` INT(255) NOT NULL
);

ALTER TABLE `tb_produto` ADD CONSTRAINT `tb_produto_fk0` FOREIGN KEY (`id_categoria`) REFERENCES `tb_categoria`(`id_categoria`);

ALTER TABLE `tb_pagamento` ADD CONSTRAINT `tb_pagamento_fk0` FOREIGN KEY (`id_produto`) REFERENCES `tb_produto`(`id_produto`);

ALTER TABLE `tb_pagamento` ADD CONSTRAINT `tb_pagamento_fk1` FOREIGN KEY (`id_usuario`) REFERENCES `tb_usuario`(`id_usuario`);

