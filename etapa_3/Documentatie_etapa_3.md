
# Etapa 3:

## Probleme speciale sau dificultăți întâmpinate + design pattern-uri
Dificultăți în încărcarea pe Github și conflicte pe Github între membri.
Dificultăți la utilizarea metodei POST. 

## Liderul va face o apreciere critică a membrilor
Membrii echipei s-au descurcat foarte bine în realizarea taskurilor. Deși au avut dificultăți în unele cazuri, am reușit să ne organizăm foarte bine și am reușit să finalizăm majoritatea taskurilor.

## Bază de date
Am creat o bază de date, care conține tabelele: utilizator, test, întrebări și tutoriale. 

Tabelul utilizator conține coloanele: ID de tip int NOT NULL AUTO_INCREMENT, Nume_utilizator de tip Varchar(30) NOT NULL, Email de tip Varchar(30) NOT NULL și Parola de tip Varchar(30) NOT NULL. Cheia primară a acestui tabel este ID. În tabel au fost inserate 3 rânduri de date. 

Tabelul întrebări conține coloanele: Id_test de tip Numeric(2) NOT NULL, Nr_întrebare de tip Numeric(2) NOT NULL, Enunț de tip  Varchar(500) NOT NULL,Rasp1 de tip Varchar(300) NOT NULL,Rasp2 de tip Varchar(300) NOT NULL,Rasp3 de tip Varchar(300) NOT NULL,Rasp4 de tip Varchar(300) NOT NULL și Soluție de tip Varchar(300) NOT NULL. În tabel au fost inserate date. În funcție de Id_test, fiecare test are câte 5 întrebări asociate, acestea fiind autentificate prin Nr_întrebare. 

Tabelul tutoriale conține coloane: Id_tutorial de tip Numeric(2) NOT NULL, Titlu de tip Varchar(200), Image de tip Varchar(200), Teach de tip MEDIUMTEXT NOT NULL, Use de tip MEDIUMTEXT NOT NULL, de tip Level MEDIUMTEXT NOT NUL și Type de tip Varchar(200). În tabel au fost inserate 6 rânduri de date.Fiecare tutorial, identificat prin Id_tutorial, are o imagine sau video (câmp Image), aceeasta fiind identificată în baza de date printr-un URL către locația acesteia. 

## Servicii web
Serverul de servicii web contine serviciul web de teste. Prin metodele Get se obtine lista de teste totala, dar se poate obtine si testul dupa numarul lui.

## Server web
Aplcație WEB Responsive ce accesează serverul de servicii web și obține lista testelor.

## Aplicaţii Desktop

### Aplicație Desktop C#
Aplicația este realizată în C#. Aplicația primește un JSON și, după afișarea acestuia, putem face și deserializarea lui. Pe interfața grafică se află două butoane, unul pentru afișarea JSON-ului și al doilea pentru deserializarea acestuia. După deserializare, utilizator va avea la dispoziție un set de întrebări din tutorialele urmate anterior. Fiecare întrebare are alte răspunsuri, din care unul singur este cel corect. 
 
### Aplicație Desktop JAVA
Scopul aplicației este de a trimite o cerere la serverul de baze de date prin care se ațteaptă să primească un JSON. După primirea acestuia  se va realiza deserializarea lui. Pe interfața grafică se află un buton cu scopul de a afișa conținutul testelor atunci când utilizatorul este pregătit.  Testele vor vi afișate intr-ul Text Field.

## Aprecierea liderului de către membrii echipei

Iuliana Luncanu: După părerea mea, având în vedere complexitatea acestui proiect, Alex a reușit să ne coordoneze foarte bine. Organizarea a fost bună, task-urile au fost împărțite în mod egal și am clarificat  lucrurile oricând nu înțelegeam. Per total, mie mi s-a părut un lider bun. 

Andreea Bodnariu: În opinia mea, Alex s-a descurcat foarte bine în rolul său de lider. A reușit sa ne coordoneze pe toți și să organizeze taskurile foarte bine. Pe lângă asta, a menținut în permanență comunicarea cu noi.

Ioan Suflet: Am doar cuvinte de laudă pentru Alex! Acesta a reușit să managerieze foarte bine proiectul și taskurile noastre. A reușit să rămână obiectiv cu fiecare dintre noi.

## Concluzii
Proiectul a descurs foarte bine și fiecare membru a reuși să învețe despre Tehnologiile WEB de tip REST, despre Servleturi, JSP, Sisteme de versionare, în final obținând o aplicație funcțională.

## Extinderea aplicaţiei

Pe viitor, ar putea fi implementate:
  - controlul restricționat în funcție de utilizatori 
  - validarea datelor de intrare în formularul de log-in
  - urmărirea progresului fiecărui utilizator 
