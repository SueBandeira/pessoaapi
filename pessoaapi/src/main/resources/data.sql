-- Criação da tabela tb_users (caso não exista)
CREATE TABLE IF NOT EXISTS tb_pessoa
(
    id         SERIAL PRIMARY KEY,
    apelido    VARCHAR(50),
    nome       VARCHAR(100),
    nascimento VARCHAR(15),
    stack      VARCHAR(100)
--    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
--    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
);
--CREATE SCHEMA IF NOT EXISTS pessoas
-- Inserção de dados
INSERT INTO tb_pessoa (apelido, nome, nascimento, stack)
VALUES
('Sue', 'Susan Oliveira', '1990-05-12', 'Java,Spring,SQL'),
('Leo', 'Leonardo Lima', '1988-11-20', 'Java,Python,Docker'),
('José', 'José Roberto', '2000-10-01', 'C#,Node,Oracle'),
('Sue', 'Suelly', '2000-01-02', 'C#,Node,Oracle'),
('View', 'Djair', '2000-05-01', 'C#,Node,Oracle'),
('Dedê', 'Denilson', '2000-02-01', 'C#,Node,Oracle');
