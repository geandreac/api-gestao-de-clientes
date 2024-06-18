INSERT INTO usuarios(id,username,password, cargo) VALUES (1, "arlindo", "$2a$10$2X6UbJnflWt5W4Hv5lW.DOnPG8s/JlryT6yt1ECxZ2f8XYwHR7Ezi", "ADMINISTRADOR");
INSERT INTO usuarios(id,username,password,cargo) VALUES (2, "usuario", "$2a$10$2X6UbJnflWt5W4Hv5lW.DOnPG8s/JlryT6yt1ECxZ2f8XYwHR7Ezi", "USUARIO");


INSERT INTO enderecos(id,rua,bairro,numero,cep) VALUES (1,"Rua Francisco Colto","Petropolis","561","69063-310");
INSERT INTO enderecos(id,rua,bairro,numero,cep) VALUES (2,"Rua Bejamin Constant","Petropolis","123","69063-310");
INSERT INTO enderecos(id,rua,bairro,numero,cep) VALUES (3,"Rua Almir Pedreira","Raiz","12","69063-310");
INSERT INTO enderecos(id,rua,bairro,numero,cep) VALUES (4,"Rua Major Gabriel","Centro","134","69063-310");
INSERT INTO enderecos(id,rua,bairro,numero,cep) VALUES (5,"Rua 10 De Julho","Centro","156","69063-310");
INSERT INTO enderecos(id,rua,bairro,numero,cep) VALUES (6,"Rua Maceió","Nossa Senhora das Graças","753","69063-310");
INSERT INTO enderecos(id,rua,bairro,numero,cep) VALUES (7,"Rua Salvado","Centro","856","69063-310");
INSERT INTO enderecos(id,rua,bairro,numero,cep) VALUES (8,"Rua do Comércio","Centro","8823","69063-310");
INSERT INTO enderecos(id,rua,bairro,numero,cep) VALUES (9,"Avenida Tefé","Raiz","1867","69063-310");

INSERT INTO clientes(id,nome,email,senha,telefone, endereco_id) VALUES (1,"Luan", "luan7@gmail.com", "$2a$10$2X6UbJnflWt5W4Hv5lW.DOnPG8s/JlryT6yt1ECxZ2f8XYwHR7Ezi","929999999", 1);
INSERT INTO clientes(id,nome,email,senha,telefone, endereco_id) VALUES (2,"Geandre", "geandre7@gmail.com", "$2a$10$2X6UbJnflWt5W4Hv5lW.DOnPG8s/JlryT6yt1ECxZ2f8XYwHR7Ezi","929999999", 2);
INSERT INTO clientes(id,nome,email,senha,telefone, endereco_id) VALUES (3,"Jean", "pitucho7@gmail.com", "$2a$10$2X6UbJnflWt5W4Hv5lW.DOnPG8s/JlryT6yt1ECxZ2f8XYwHR7Ezi","929999999", 3);
INSERT INTO clientes(id,nome,email,senha,telefone, endereco_id) VALUES (4,"Gustavo", "gustavo7@gmail.com", "$2a$10$2X6UbJnflWt5W4Hv5lW.DOnPG8s/JlryT6yt1ECxZ2f8XYwHR7Ezi","929999999", 4);
INSERT INTO clientes(id,nome,email,senha,telefone, endereco_id) VALUES (5,"Aira", "aira7@gmail.com", "$2a$10$2X6UbJnflWt5W4Hv5lW.DOnPG8s/JlryT6yt1ECxZ2f8XYwHR7Ezi","929999999", 5);
INSERT INTO clientes(id,nome,email,senha,telefone, endereco_id) VALUES (6,"Kauan", "kauan7@gmail.com", "$2a$10$2X6UbJnflWt5W4Hv5lW.DOnPG8s/JlryT6yt1ECxZ2f8XYwHR7Ezi","929999999", 6);
INSERT INTO clientes(id,nome,email,senha,telefone, endereco_id) VALUES (7,"Pedro", "pedro7@gmail.com", "$2a$10$2X6UbJnflWt5W4Hv5lW.DOnPG8s/JlryT6yt1ECxZ2f8XYwHR7Ezi","929999999", 7);
INSERT INTO clientes(id,nome,email,senha,telefone, endereco_id) VALUES (8,"Cristian", "cristian7@gmail.com", "$2a$10$2X6UbJnflWt5W4Hv5lW.DOnPG8s/JlryT6yt1ECxZ2f8XYwHR7Ezi","929999999", 8);
INSERT INTO clientes(id,nome,email,senha,telefone, endereco_id) VALUES (9,"Lucas", "lucas7@gmail.com", "$2a$10$2X6UbJnflWt5W4Hv5lW.DOnPG8s/JlryT6yt1ECxZ2f8XYwHR7Ezi","929999999", 9);

INSERT INTO historico_interacoes(id, clientes_id,data,tipo,descricao) VALUES (1,1,"24/02/2005","AVALIACAO","bom");
INSERT INTO historico_interacoes(id, clientes_id,data,tipo,descricao) VALUES (2,1,"24/02/2005","AVALIACAO","otimo");
INSERT INTO historico_interacoes(id, clientes_id,data,tipo,descricao) VALUES (3,2,"24/02/2005","AVALIACAO","excelente");
INSERT INTO historico_interacoes(id, clientes_id,data,tipo,descricao) VALUES (4,3,"24/02/2005","AVALIACAO","midia demais");
INSERT INTO historico_interacoes(id, clientes_id,data,tipo,descricao) VALUES (5,4,"24/02/2005","AVALIACAO","muito bom");
INSERT INTO historico_interacoes(id, clientes_id,data,tipo,descricao) VALUES (6,5,"24/02/2005","AVALIACAO","excelente");
INSERT INTO historico_interacoes(id, clientes_id,data,tipo,descricao) VALUES (7,6,"24/02/2005","AVALIACAO","recomendo muito");
INSERT INTO historico_interacoes(id, clientes_id,data,tipo,descricao) VALUES (8,6,"24/02/2005","AVALIACAO","excelente");
INSERT INTO historico_interacoes(id, clientes_id,data,tipo,descricao) VALUES (9,6,"24/02/2005","AVALIACAO","otimo");
INSERT INTO historico_interacoes(id, clientes_id,data,tipo,descricao) VALUES (10,7,"24/02/2005","AVALIACAO","muito bom");
INSERT INTO historico_interacoes(id, clientes_id,data,tipo,descricao) VALUES (11,8,"24/02/2005","AVALIACAO","amei o atendente luan");
INSERT INTO historico_interacoes(id, clientes_id,data,tipo,descricao) VALUES (12,9,"24/02/2005","AVALIACAO","atendimento ótimo");
INSERT INTO historico_interacoes(id, clientes_id,data,tipo,descricao) VALUES (13,9,"24/02/2005","AVALIACAO","muito bom");
INSERT INTO historico_interacoes(id, clientes_id,data,tipo,descricao) VALUES (14,9,"24/02/2005","AVALIACAO","recomendo muito");
