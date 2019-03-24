CREATE TABLE produto(
  id INTEGER AUTO_INCREMENT PRIMARY KEY,
  nome VARCHAR(100) NOT NULL,
  referencia INTEGER UNIQUE,
  estoque_minimo INTEGER NOT NULL
);

CREATE TABLE lote(
  referencia INTEGER PRIMARY KEY,
  quantidade INTEGER NOT NULL,
  produto_id INTEGER,
  FOREIGN KEY (produto_id) REFERENCES produto (id)
)