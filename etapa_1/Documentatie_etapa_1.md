# Etapa 1
### 1. Titlul proiectului 
Imprimarea 3D. Sfaturi și trucuri

### 2. Componența echipei de implementare (evidențierea liderului)
* Grigoraș Alexandru (master of puppets)
* Bodnariu Andreea
* Luncanu Iuliana
* Suflet Ioan

### 3. Prezentarea temei alese + motivația alegerii
Imprimarea 3D este un subiect care ma pasioneaza de multi ani. Datorita lui am avut initiativa de a-mi construi propria imprimanta. Am ajuns la concl ca mai multi oameni ar trebui sa cunoasca acest subiect, asa ca am decis sa realizam un site care sa ii indrume in acest scop. Platfoma va contine informatii, tutoriale, teste.

### 4. Scurtă analiză a tipurilor de aplicații existente din perspectiva temei alese

### 5. Descrierea generală a implementării (caracteristici așteptate de la aplicație)
Fiecare utilizator se poate inregistra pe site pentru a avea acces la o structura clar definita a pasilor necesari contruirii unuei imprimante 3D. In aceslasi timp progresul utilizatorului va fi inregistrat. Verificarea cunostiintelor dobandite. FAQ

### 6. Resursele hardware/software utilizate
* Computer desktop sau laptop cu procesor minim intel Pentium, 1 GB memorie RAM, conexiune internet, sistem de operare Windows 7
* Dispozitiv mobil cu sistem de operare Android (minim versiunea 5)
 
### 7. Identificarea actorilor și a componentelor principale
 
### 8. Diagrame UML de use-case
Atunci când accesează aplicația, utilizatorul se poate înregistra pentru a putea fi membru. De asemenea, el poate vizualiza conținutul public(tutoriale, evenimente). Dacă se înregistrează, utilizatorul poate vedea și conținutul privat (teste, fișiere) și poate adăuga sau modifica conținutul paginii. Dacă părăsește aplicația și apoi revine, utilizatorul se poate autentifica folosind un nume de utilizator și o parolă. Administratorul poate adăuga sau șterge conținutul aplicației (evenimente, teste, fișiere, tutoriale) și, de asemenea, poate face managementul utilizatorilor, adăugându-i sau ștergându-i și dându-le drepturi de acces la informații.
 
### 9. Diagrame UML de information flow
 
### 10. Diagrame UML de componente
Organizarea componentelor software fizice este alcatuită dintr-un server web de servicii (ce va oferi servicii de printare 3D, tutoriale), un server de mail (pentru contact și abonare), server ftp (pentru încărcarea temelor pe site sau a fișierelor 3D pentru printare), server de control al accesului (pentru a oferi conținut personalizat în funcție de utilizator), server de baze de date (pentru stocarea utilizatorilor, tutorialelor). La acestea se vor conecta un utilizator dintr-o aplicație de mobile (S.O. Android), dar și un server web. Un site web responsive se va conecta la serverul web.
 
### 11. Diagrame UML de activitate
 
### 12. Diagrame UML de secvență
 
### 13. Diagrame UML de stare
 
### 14. Diagrame ER pentru baza de date
Atunci când se înregistrează un utilizator, în baza de date se reține un id (unic utilizatorului), un nume, email, parolă și progres. Progresul acestuia se va face pe baza unui procentaj, a numărului de teste parcurse, a mediei lor și a fișierelor încărcate. Media testelor și numărul acestora parcurse se vor lua dintr-un alt tabel, în care se vor reține numărul testului, dificultatea lui, numărul de întrebări și nota obținută la testul respectiv.
 
### 15. Referirea și descrierea în text a fiecărei figuri/diagrame

