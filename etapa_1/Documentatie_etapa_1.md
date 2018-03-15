# Etapa 1
### 1. Titlul proiectului 
Imprimarea 3D. Sfaturi și trucuri

### 2. Componența echipei de implementare (evidențierea liderului)
* Grigoraș Alexandru (lider)
* Bodnariu Andreea
* Luncanu Iuliana
* Suflet Ioan

### 3. Prezentarea temei alese + motivația alegerii
Imprimarea 3D este un subiect care mă pasioneaza de mulți ani. Datorită lui am avut inițiativa de a-mi construi propria imprimantă. Am ajuns la concluzia că mai mulți oameni ar trebui să cunoască acest subiect, așa că am decis să realizăm un site care sa îi indrume în acest scop. Platfoma va conține informații, tutoriale, teste. Ne dorim, pe de o parte, să educăm publicul la noile posibilități de a ne concretiza invențiile prin imprimarea acestora. Astfel, vom participa la o augmentare a unor domenii precum arhitectura, arta, contrucțiile, robotica sau chiar domeniul culinar. Toate acestea vor conduce la o creștere în nevoia de imprimante 3D, care pot aparea în diferite forme și mărimi. Această creștere a interesului ne motivează să aprofundăm subiectul și să îl dezvoltăm. Aici este momentul în care intervenim noi atât prin oferirea unui suport de informații organizate pentru construirea unei imprimante 3D, cât și prin servicii de printare.

### 4. Scurtă analiză a tipurilor de aplicații existente din perspectiva temei alese
După o scurtă analiză a aplicațiilor deja existe (tutoriale pentru imprimarea 3D), acestea ar fi cele mai competitive aplicații.
https://all3dp.com/best-3d-printing-tutorial/
https://www.shapeways.com/tutorials
https://www.shapeways.com/tutorials/easy-3d-modeling-for-3d-printing-tutorial-for-beginners
Aceste site-uri conțin tutoriale care te vor introduce, pas cu pas, în printarea 3D. O parte din aceste tutoriale sunt însoțite și de un video pentru ca informația să fie cât mai clară. Deși aceste site-uri conțin informații folositoare și bine structurate, nu dispun și de o metodă de evaluare (de exemplu teste, teme). O metodă de evaluare este necesară pentru a ne asigura ca informațiile au fost pe înțelesul utilizatorului. De asemenea, punerea în practică a cunoștințelor dobândite ajută la fixarea informației.

### 5. Descrierea generală a implementării (caracteristici așteptate de la aplicație)
Aplicația va conține o secțiune dedicată știrilor de actualitate în domeniu, urmate de activitatea altor utilizatori care doresc să facă public progresul lor. Când utilizatorul accesează secțiunea cu tutoriale el va observa istoricul vizualizărilor și va putea alege să continue.După fiecare tutorial vor fi puse la dispoziție o serie de întrebări și exerciții care îl vor asigura pe utilizator că informația a fost înțeleasă. În cele din urmă, ieșirea din secțiunea cu tutoriale va fi precedată de salvarea stadiului curent. Pentru a oferi un nivel de calitate ridicat vom oferi asistență pentru fiecare tutorial, aceasta putând fi solicitată prin e-mail. Aplicația va conține și un serviciu de plasare a comenzilor pentru imprimări 3D.

### 6. Resursele hardware/software utilizate
* Computer desktop sau laptop cu procesor minim intel Pentium, 1 GB memorie RAM, conexiune internet, sistem de operare Windows 7
* Dispozitiv mobil cu sistem de operare Android (minim versiunea 5)
 
### 7. Identificarea actorilor și a componentelor principale
Actorii sunt reprezentați de utilizatorii aplicației (elevi, studenți sau orice persoană interesată de printarea 3D). Componentele principale ale aplicației sunt server-ul de servicii, server-ul de mail, server-ul ftp, server-ul de control al accesului, server-ul de baze de date, server-ul web.
 
### 8. Diagrame UML de use-case
Atunci când accesează aplicația, utilizatorul se poate înregistra pentru a putea fi membru. De asemenea, el poate vizualiza conținutul public(tutoriale, evenimente). Dacă se înregistrează, utilizatorul poate vedea și conținutul privat (teste, fișiere) și poate adăuga sau modifica conținutul paginii. Dacă părăsește aplicația și apoi revine, utilizatorul se poate autentifica folosind un nume de utilizator și o parolă. Administratorul poate adăuga sau șterge conținutul aplicației (evenimente, teste, fișiere, tutoriale) și, de asemenea, poate face managementul utilizatorilor, adăugându-i sau ștergându-i și dându-le drepturi de acces la informații.

### 9. Diagrame UML de information flow
Prin information flow arătăm parcursul informației de la emițător la receptor. Spre exemplu, utilizatorul doreste să acceseze o secțiune a siteului, acesta comunică cu serverul web care va trimite înapoi interfața web urmând să primească de la serverul de baze de date informațiile necesare.

### 10. Diagrame UML de componente
Organizarea componentelor software fizice este alcatuită dintr-un server web de servicii (ce va oferi servicii de printare 3D, tutoriale), un server de mail (pentru contact și abonare), server ftp (pentru încărcarea temelor pe site sau a fișierelor 3D pentru printare), server de control al accesului (pentru a oferi conținut personalizat în funcție de utilizator), server de baze de date (pentru stocarea utilizatorilor, tutorialelor). La acestea se vor conecta un utilizator dintr-o aplicație de mobile (S.O. Android), dar și un server web. Un site web responsive se va conecta la serverul web.
 
### 11. Diagrame UML de activitate
Activitatea utilizatorului începe cu deschiderea aplicației unde va fi prezent Ecranul 0 care va cere datele de autentificare. Dupa introducerea datelor se va cere validarea acestora, astfel vor fi aduse prin intermediul server-ului de servicii ultimele știri, notificările, recomandări și alte date oferite de widget-uri. Toate aceste date vor fi organizare pe o pagina scroll-down numita Ecran 1. In continuare activitatea utilizatorului depinde de ce servicii doreste sa beneficieze. In final, inaintea delogarii se v-a salva stadiul in care a rămas.

### 12. Diagrame UML de secvență
Diagramele de secvenţe descriu interacţiunile dintre două sau mai multe entităţi şi ordinea în care mesajele sunt schimbate între acestea. Sun folosite în special pentru a reprezentat interacţiunile dintre obiecte. Mesajele sunt utilizate pentru a reprezenta schimburile de date şi informaţii dintre liniile de viaţă. Astfel, vom ilustra schimburile de mesaje dintre browser, aplicație și server atunci când se cere accesarea unor resurse protejate de catre un utilizator autentificat.
 
### 13. Diagrame UML de stare
În diagrama de stare vom ilustra serviciul de monitorizare a progresului construirii imprimantei. Când utilizatorul accesează secțiunea cu tutoriale el va observa istoricul vizualizărilor și va putea alege să continue. În unele cazuri nu toți pașii sunt accesibili așa că se va verifica dacă clientul are acces, aceasta fiind urmată de un feedback. După fiecare tutorial vor fi puse la dispoziție o serie de întrebări și exerciții care îl vor asigura pe utilizator că informația a fost înțeleasă. În cele din urmă, ieșirea din secțiunea cu tutoriale va fi precedată de salvarea stadiului curent.
 
### 14. Diagrame ER pentru baza de date
Atunci când se înregistrează un utilizator, în baza de date se reține un id (unic utilizatorului), un nume, email, parolă și progres. Progresul acestuia se va face pe baza unui procentaj, a numărului de teste parcurse, a mediei lor și a fișierelor încărcate. Media testelor și numărul acestora parcurse se vor lua dintr-un alt tabel, în care se vor reține numărul testului, dificultatea lui, numărul de întrebări și nota obținută la testul respectiv.

