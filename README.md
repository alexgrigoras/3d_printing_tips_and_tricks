# ti_proiect 

TUTORIALS - 3D Printing

UPDATE: commit from linux

MEMBERS: 
  - Grigoras Alexandru
  - Suflet Ioan
  - Bodnariu Andreea
  - Luncanu Iuliana

MILESTONES:
  - Etapa 1: - creare repository GitHub
             - impartire sarcini de lucru
             - intocmire documentatie
             
UML use-case:
  
    Atunci când accesează aplicația, utilizatorul se poate înregistra pentru a putea fi membru. De asemenea, el poate vizualiza conținutul public(tutoriale, evenimente). Dacă se înregistrează, utilizatorul poate vedea și conținutul privat (teste, fișiere) și poate adăuga sau modifica conținutul paginii. Dacă părăsește aplicația și apoi revine, utilizatorul se poate autentifica folosind un nume de utilizator și o parolă. Administratorul poate adăuga sau șterge conținutul aplicației (evenimente, teste, fișiere, tutoriale) și, de asemenea, poate face managementul utilizatorilor, adăugându-i sau ștergându-i și dându-le drepturi de acces la informații.

Diagrama ER de baze de date:

    Atunci când se înregistrează un utilizator, în baza de date se reține un id (unic utilizatorului), un nume, email, parolă și progres. Progresul acestuia se va face pe baza unui procentaj, a numărului de teste parcurse, a mediei lor și a fișierelor încărcate. Media testelor și numărul acestora parcurse se vor lua dintr-un alt tabel, în care se vor reține numărul testului, dificultatea lui, numărul de întrebări și nota obținută la testul respectiv.
