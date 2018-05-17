
# Etapa 3:

## Probleme speciale sau dificultăți întâmpinate + design pattern-uri

## Evidențierea clară a contribuțiilor fiecărui membru al echipei

## Liderul va face o apreciere critică a membrilor

## Managementul proiectului (Bitbucket/GitHub)

## Bază de date
Am creat o bază de date, care conține tabelele: utilizator, test, întrebări și tutoriale. 

Tabelul utilizator conține coloanele: ID de tip int NOT NULL AUTO_INCREMENT, Nume_utilizator de tip Varchar(30) NOT NULL, Email de tip Varchar(30) NOT NULL și Parola de tip Varchar(30) NOT NULL. Cheia primară a acestui tabel este ID. În tabel au fost inserate 3 rânduri de date. 

Tabelul întrebări conține coloanele: Id_test de tip Numeric(2) NOT NULL, Nr_întrebare de tip Numeric(2) NOT NULL, Enunț de tip  Varchar(500) NOT NULL,Rasp1 de tip Varchar(300) NOT NULL,Rasp2 de tip Varchar(300) NOT NULL,Rasp3 de tip Varchar(300) NOT NULL,Rasp4 de tip Varchar(300) NOT NULL și Soluție de tip Varchar(300) NOT NULL. În tabel au fost inserate date. În funcție de Id_test, fiecare test are câte 5 întrebări asociate, acestea fiind autentificate prin Nr_întrebare. 

Tabelul tutoriale conține coloane: Id_tutorial de tip Numeric(2) NOT NULL, Titlu de tip Varchar(200), Image de tip Varchar(200), Teach de tip MEDIUMTEXT NOT NULL, Use de tip MEDIUMTEXT NOT NULL, de tip Level MEDIUMTEXT NOT NUL și Type de tip Varchar(200). În tabel au fost inserate 6 rânduri de date.Fiecare tutorial, identificat prin Id_tutorial, are o imagine sau video (câmp Image), aceeasta fiind identificată în baza de date printr-un URL către locația acesteia. 


## Servicii web

## Server web

## Aplicaţie Mobile

## Aprecierea liderului de către membrii echipei

## Concluzii

## Extinderea aplicaţiei
