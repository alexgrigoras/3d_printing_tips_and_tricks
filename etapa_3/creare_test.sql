create table test(Id_test Numeric(2) NOT NULL, Dificultate Varchar(20));
alter table test add constraint test_id_pk PRIMARY KEY(Id_test);
insert into test values(1,'usor');
insert into test values(2,'greu');
insert into test values(3,'mediu');