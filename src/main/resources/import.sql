INSERT INTO TB_CRIMES(CRIME_DESCRIPTION) VALUES('Terrorismo.');
INSERT INTO TB_CRIMES(CRIME_DESCRIPTION) VALUES('Corrupção.');
INSERT INTO TB_CRIMES(CRIME_DESCRIPTION) VALUES('Moeda e Documentos Falsificados.');
INSERT INTO TB_CRIMES(CRIME_DESCRIPTION) VALUES('Crimes contra crianças.');
INSERT INTO TB_CRIMES(CRIME_DESCRIPTION) VALUES('Crime de Patrimônio Cultural.');
INSERT INTO TB_CRIMES(CRIME_DESCRIPTION) VALUES('Cybercrime.');
INSERT INTO TB_CRIMES(CRIME_DESCRIPTION) VALUES('Tráfico De Drogas.');
INSERT INTO TB_CRIMES(CRIME_DESCRIPTION) VALUES('Crime Ambiental.');
INSERT INTO TB_CRIMES(CRIME_DESCRIPTION) VALUES('Crime Financeira.');
INSERT INTO TB_CRIMES(CRIME_DESCRIPTION) VALUES('Tráfico de Armas De Fogo.');
INSERT INTO TB_CRIMES(CRIME_DESCRIPTION) VALUES('Tráfico Humano e Contrabando De Migrantes.');
INSERT INTO TB_CRIMES(CRIME_DESCRIPTION) VALUES('Bens ilícitos.');
INSERT INTO TB_CRIMES(CRIME_DESCRIPTION) VALUES('Crime marítimo.');
INSERT INTO TB_CRIMES(CRIME_DESCRIPTION) VALUES('Crime organizado.');
INSERT INTO TB_CRIMES(CRIME_DESCRIPTION) VALUES('Crime de veículo.');
INSERT INTO TB_CRIMES(CRIME_DESCRIPTION) VALUES('Crimes de Guerra.');

INSERT INTO TB_WANTED(BIRTHDATE, CPF, GENDER, NAME) VALUES(DATE '1999-12-15', '67222758330', 'F', 'Gabrielle Lima Carvalho');
INSERT INTO TB_WANTED(BIRTHDATE, CPF, GENDER, NAME) VALUES(DATE '1988-07-04', '65906700218', 'M', 'Diego Castro Carvalho');
INSERT INTO TB_WANTED(BIRTHDATE, CPF, GENDER, NAME) VALUES(DATE '1965-10-14', '24665310386', 'F', 'Júlia Oliveira Gomes');
INSERT INTO TB_WANTED(BIRTHDATE, CPF, GENDER, NAME) VALUES(DATE '1980-09-21', '73926644257', 'M', 'Arthur Lima Martins');
INSERT INTO TB_WANTED(BIRTHDATE, CPF, GENDER, NAME) VALUES(DATE '1985-06-19', '78545750536', 'M', 'Vitór Costa Araujo');
INSERT INTO TB_WANTED(BIRTHDATE, CPF, GENDER, NAME) VALUES(DATE '1965-01-03', '36372766230', 'F', 'Bruna Lima Alves');
INSERT INTO TB_WANTED(BIRTHDATE, CPF, GENDER, NAME) VALUES(DATE '1949-09-10', '26890811801', 'F', 'Lara Carvalho Azevedo');
INSERT INTO TB_WANTED(BIRTHDATE, CPF, GENDER, NAME) VALUES(DATE '1999-03-04', '62776758421', 'M', 'José Martins Cunha');
INSERT INTO TB_WANTED(BIRTHDATE, CPF, GENDER, NAME) VALUES(DATE '1980-03-26', '56865624904', 'F', 'Ágatha Ferreira Santos');
INSERT INTO TB_WANTED(BIRTHDATE, CPF, GENDER, NAME) VALUES(DATE '1988-02-19', '83695222891', 'M', 'André Ribeiro Fernandes');
INSERT INTO TB_WANTED(BIRTHDATE, CPF, GENDER, NAME) VALUES(DATE '1992-02-11', '45114213903', 'M', 'João Costa Almeida');
INSERT INTO TB_WANTED(BIRTHDATE, CPF, GENDER, NAME) VALUES(DATE '1984-05-06', '36064424087', 'F', 'Melissa Ferreira Pereira');
INSERT INTO TB_WANTED(BIRTHDATE, CPF, GENDER, NAME) VALUES(DATE '1995-09-10', '78512784652', 'F', 'Bianca Correia Ribeiro');
INSERT INTO TB_WANTED(BIRTHDATE, CPF, GENDER, NAME) VALUES(DATE '1984-12-31', '78755262210', 'M', 'Eduardo Lima Cavalcanti');
INSERT INTO TB_WANTED(BIRTHDATE, CPF, GENDER, NAME) VALUES(DATE '1998-02-17', '55537415640', 'M', 'Danilo Melo Araujo');
INSERT INTO TB_WANTED(BIRTHDATE, CPF, GENDER, NAME) VALUES(DATE '1995-09-24', '74332593170', 'M', 'Arthur Alves Ribeiro');
INSERT INTO TB_WANTED(BIRTHDATE, CPF, GENDER, NAME) VALUES(DATE '1949-10-20', '12142525679', 'M', 'Guilherme Dias Rodrigues');
INSERT INTO TB_WANTED(BIRTHDATE, CPF, GENDER, NAME) VALUES(DATE '1993-01-31', '91153014270', 'M', 'Vinícius Cavalcanti Ferreira');
INSERT INTO TB_WANTED(BIRTHDATE, CPF, GENDER, NAME) VALUES(DATE '1971-11-04', '75973880800', 'M', 'Martim Araujo Fernandes');
INSERT INTO TB_WANTED(BIRTHDATE, CPF, GENDER, NAME) VALUES(DATE '1984-02-17', '88574642967', 'M', 'Samuel Cunha Alves');
INSERT INTO TB_WANTED(BIRTHDATE, CPF, GENDER, NAME) VALUES(DATE '1971-03-19', '46713388078', 'M', 'Nicolash Santos Costa');

INSERT INTO TB_WANTED_CRIMES (WANTED_PERSON_ID, CRIMES_ID) VALUES(4, 5); 
INSERT INTO TB_WANTED_CRIMES (WANTED_PERSON_ID, CRIMES_ID) VALUES(20, 10); 
INSERT INTO TB_WANTED_CRIMES (WANTED_PERSON_ID, CRIMES_ID) VALUES(6, 14); 
INSERT INTO TB_WANTED_CRIMES (WANTED_PERSON_ID, CRIMES_ID) VALUES(9, 15); 
INSERT INTO TB_WANTED_CRIMES (WANTED_PERSON_ID, CRIMES_ID) VALUES(18, 8);  
INSERT INTO TB_WANTED_CRIMES (WANTED_PERSON_ID, CRIMES_ID) VALUES(10, 1);  
INSERT INTO TB_WANTED_CRIMES (WANTED_PERSON_ID, CRIMES_ID) VALUES(15, 7);  
INSERT INTO TB_WANTED_CRIMES (WANTED_PERSON_ID, CRIMES_ID) VALUES(14, 13);  
INSERT INTO TB_WANTED_CRIMES (WANTED_PERSON_ID, CRIMES_ID) VALUES(13, 12);  
INSERT INTO TB_WANTED_CRIMES (WANTED_PERSON_ID, CRIMES_ID) VALUES(11, 6);  
INSERT INTO TB_WANTED_CRIMES (WANTED_PERSON_ID, CRIMES_ID) VALUES(12, 3);  
INSERT INTO TB_WANTED_CRIMES (WANTED_PERSON_ID, CRIMES_ID) VALUES(7, 2); 
INSERT INTO TB_WANTED_CRIMES (WANTED_PERSON_ID, CRIMES_ID) VALUES(1, 16); 
INSERT INTO TB_WANTED_CRIMES (WANTED_PERSON_ID, CRIMES_ID) VALUES(1, 4); 
INSERT INTO TB_WANTED_CRIMES (WANTED_PERSON_ID, CRIMES_ID) VALUES(16, 9);  
INSERT INTO TB_WANTED_CRIMES (WANTED_PERSON_ID, CRIMES_ID) VALUES(3, 9); 
INSERT INTO TB_WANTED_CRIMES (WANTED_PERSON_ID, CRIMES_ID) VALUES(17, 4);  
INSERT INTO TB_WANTED_CRIMES (WANTED_PERSON_ID, CRIMES_ID) VALUES(5, 2); 
INSERT INTO TB_WANTED_CRIMES (WANTED_PERSON_ID, CRIMES_ID) VALUES(19, 8);  
INSERT INTO TB_WANTED_CRIMES (WANTED_PERSON_ID, CRIMES_ID) VALUES(2, 5);
INSERT INTO TB_WANTED_CRIMES (WANTED_PERSON_ID, CRIMES_ID) VALUES(16, 14); 
INSERT INTO TB_WANTED_CRIMES (WANTED_PERSON_ID, CRIMES_ID) VALUES(9, 3); 
INSERT INTO TB_WANTED_CRIMES (WANTED_PERSON_ID, CRIMES_ID) VALUES(14, 1);  
INSERT INTO TB_WANTED_CRIMES (WANTED_PERSON_ID, CRIMES_ID) VALUES(8, 13); 