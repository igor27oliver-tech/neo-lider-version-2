CREATE DATABASE IF NOT EXISTS neolider_db;
USE neolider_db;

DROP TABLE IF EXISTS users;
CREATE TABLE users (
                       id INT PRIMARY KEY,
                       nome VARCHAR(100) NOT NULL,
                       senha VARCHAR(100) NOT NULL,
                       cargo VARCHAR(50) NOT NULL
);

INSERT INTO users (id, nome, senha, cargo) VALUES
                                               (1, 'Igor', '123', 'ADMIN'),
                                               (2, 'maria', '123', 'PCP'),
                                               (3, 'machado', '123', 'ESTOQ'),
                                               (4, 'Leo', '123', 'PCP'),
                                               (5, 'Nogueira', '123', 'ESTOQ'),
                                               (6, 'dan', '123', 'ADMIN');

DROP TABLE IF EXISTS estoq;
CREATE TABLE estoq (
                       id INT PRIMARY KEY,
                       nome VARCHAR(100) NOT NULL,
                       descricao VARCHAR(255),
                       categoria VARCHAR(100) NOT NULL,
                       quantidade INT NOT NULL
);

INSERT INTO estoq (nome, descricao, id, categoria, quantidade) VALUES
                                                                   ('Chapa Aço 2mm', 'Chapa aço carbono 2mm', 1, 'ACO', 150),
                                                                   ('Chapa Aço 3mm', 'Chapa aço carbono 3mm', 2, 'ACO', 120),
                                                                   ('Barra Aço 1/2', 'Barra redonda aço carbono', 3, 'ACO', 90),
                                                                   ('Tubo Galvanizado 2pol', 'Tubo aço galvanizado', 4, 'ACO', 60),
                                                                   ('Perfil U 4m', 'Perfil estrutural aço', 5, 'ACO', 45),
                                                                   ('Cantoneira 1pol', 'Cantoneira aço estrutural', 6, 'ACO', 70),

                                                                   ('Resina PEBD', 'Polietileno baixa densidade', 7, 'PLASTICO', 500),
                                                                   ('Resina PEAD', 'Polietileno alta densidade', 8, 'PLASTICO', 380),
                                                                   ('Resina PP', 'Polipropileno industrial', 9, 'PLASTICO', 420),
                                                                   ('Masterbatch Preto', 'Pigmento concentrado preto', 10, 'PLASTICO', 200),
                                                                   ('Filme Tubular 30cm', 'Filme plástico industrial', 11, 'PLASTICO', 150),
                                                                   ('Filme Folha 40cm', 'Filme folha tratada', 12, 'PLASTICO', 130),

                                                                   ('Parafuso 10mm', 'Parafuso sextavado aço', 13, 'FERRAMENTA', 1500),
                                                                   ('Porca 10mm', 'Porca zincada', 14, 'FERRAMENTA', 1800),
                                                                   ('Arruela 10mm', 'Arruela aço carbono', 15, 'FERRAMENTA', 2000),
                                                                   ('Chave Inglesa', 'Ferramenta ajuste manual', 16, 'FERRAMENTA', 30),
                                                                   ('Alicate Universal', 'Ferramenta manual', 17, 'FERRAMENTA', 45),
                                                                   ('Martelo 1kg', 'Martelo aço forjado', 18, 'FERRAMENTA', 35),
                                                                   ('Furadeira Industrial', 'Furadeira elétrica 220V', 19, 'FERRAMENTA', 12),

                                                                   ('Capacete Segurança', 'Capacete classe B', 20, 'EPI', 80),
                                                                   ('Luva Raspa', 'Luva proteção solda', 21, 'EPI', 300),
                                                                   ('Óculos Proteção', 'Proteção contra partículas', 22, 'EPI', 200),
                                                                   ('Protetor Auricular', 'Proteção auditiva', 23, 'EPI', 250),
                                                                   ('Botina Biqueira Aço', 'Calçado segurança', 24, 'EPI', 95),
                                                                   ('Máscara Respiratória', 'Máscara filtrante PFF2', 25, 'EPI', 400),

                                                                   ('Motor Elétrico 5CV', 'Motor trifásico industrial', 26, 'MANUTENCAO', 10),
                                                                   ('Motor Elétrico 10CV', 'Motor trifásico pesado', 27, 'MANUTENCAO', 6),
                                                                   ('Rolamento 6205', 'Rolamento industrial', 28, 'MANUTENCAO', 150),
                                                                   ('Correia A-45', 'Correia transmissão industrial', 29, 'MANUTENCAO', 75),
                                                                   ('Sensor Temperatura', 'Sensor digital industrial', 30, 'MANUTENCAO', 40),
                                                                   ('Inversor Frequência', 'Controle motor elétrico', 31, 'MANUTENCAO', 8),

                                                                   ('Produto Final A', 'Peça finalizada modelo A', 32, 'PRODUTO_FINAL', 220),
                                                                   ('Produto Final B', 'Peça finalizada modelo B', 33, 'PRODUTO_FINAL', 180),
                                                                   ('Produto Final C', 'Peça finalizada modelo C', 34, 'PRODUTO_FINAL', 140),

                                                                   ('Embalagem Plástica', 'Saco plástico industrial', 35, 'PRODUTO_EXTERNO', 600),
                                                                   ('Caixa Papelão Reforçada', 'Caixa transporte pesado', 36, 'PRODUTO_EXTERNO', 450),
                                                                   ('Etiqueta Identificação', 'Etiqueta código barras', 37, 'PRODUTO_EXTERNO', 1200),
                                                                   ('Stretch Film', 'Filme stretch paletização', 38, 'PRODUTO_EXTERNO', 300);