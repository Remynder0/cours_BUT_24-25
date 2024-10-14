-- Saisir la requ�te suivante : select nom from vt_equipe; Ex�cuter et commenter
--le r�sultat
select Nom from prof.vt_sponsor;

select nom from vt_sponsor;

Select Nom From prof.vt_Coureur;

select prenom from prof.vt_coureur;

select distinct prenom from prof.vt_coureur;

select * from prof.vt_coureur;

select nom ,annee_prem from prof.vt_coureur;
select nom as n,annee_prem b from prof.vt_coureur;

select nom as " Nom du sponsor " from prof.vt_sponsor;

select nom,prenom from prof.vt_sponsor;

select nom,prenom,annee_naissance from prof.vt_coureur;

select * from vt_etape;

select prenom,nom,annee_prem-annee_naissance as age_prem from prof.vt_coureur;

select syshour from dual;

select date-etape from prof.vt_etape;

select sysdate-date_etape from dual;


select sysdate-date_etape from prof.vt_etape;

desc prof.vt_coureur; 

----------------------------------------------------------------------------------------
-- La projection et la restriction (lire le cours de 1.1 � 1.2 et tester les exemples)
----------------------------------------------------------------------------------------

/* 1) �tablir la liste des �tapes dont le n� est compris entre 5 et 10. Afficher le n� de l'�tape, 
la ville d�part, la ville arriv�e et la distance. */
select * from prof.vt_etape;

select * from prof.vt_etape 
where N_ETAPE > 5 and N_ETAPE < 10 ;

select N_ETAPE , VILLE_D , VILLE_A , DISTANCE from prof.vt_etape 
where N_ETAPE >= 5 and N_ETAPE <= 10 ;

/* 2) M�me requ�te que pr�c�demment mais pour l'ann�e 2024. */
select N_ETAPE , VILLE_D , VILLE_A , DISTANCE from prof.vt_etape 
where N_ETAPE >= 5 and N_ETAPE <= 10 
and ANNEE = 2024;


/* 3) Afficher la liste des �tapes dont le n� est inf�rieur � 5 ou sup�rieur � 10 pour l'ann�e 2024 (2 solutions). */
select * from prof.vt_etape 
where (N_Etape<5 or n_etape>10) and annee=2024; 


/* 4) �tablir la liste des �tapes "prologue" (relire 1_Pres_TDF.pdf). Afficher le code pays d�part, 
le code pays arriv�e, la ville d�part, la ville arriv�e, la distance, la vitesse moyenne, ann�e et le type d'�tape.
 La liste affich�e sera pr�sent�e par ordre croissant de la distance. */
 select code_cio_d , code_cio_a , ville_d , ville_a , distance , moyenne , annee , cat_code from prof.vt_etape
 where n_etape = 0
 order by distance ;
/* 5) Projeter les �tapes r�pondant � l'une ou l'autre des restrictions suivantes (une seule requ�te)�:
    � le premier caract�re de la ville de d�part est un 'B', 
    � le dernier caract�re de la ville de d�part est un 'A',
    � la ville de d�part contient un 'U'.
*/
select * from prof.vt_etape
where ville_d like 'B%'
or ville_d like '%a'
or ville_d like '%u%';

select * from prof.vt_etape
where lower(ville_d) like 'b%'
or upper(ville_d) like '%A'
or upper(ville_d) like '%U%';

/* 6) Projeter l'�tape courue le 14 juillet 2024 */
select * from prof.vt_etape
where (date_etape) = '14/07/24';

select * from prof.vt_etape
where to_char(date_etape,'dd/mm/yyyy')='14/07/2024';


/* 7) Projeter le pr�nom, le nom et l��ge des coureurs ayant particip� � leur premier tour en 2024. */

select nom,prenom,2024-annee_naissance as age 
from prof.vt_coureur where annee_prem=2024;

/* 8) Donner la liste des sponsors dont le nom abr�g� est vide avant 1986. */
select * from prof.vt_sponsor
where na_sponsor is null and annee_sponsor<1986;
/* 9) Projeter par ordre alphab�tique croissant des pr�noms et par nom des coureurs d�croissant, 
la liste des coureurs dont le nom commence par un 'V'. */
select * from prof.vt_coureur
where nom like 'V%'
order by prenom, nom desc;

/* 10) Projeter la liste des nations des coureurs (app_nation) dont le pays d'origine
 a pour code�: "SUI", "JAP" ou "POL". */
 select* from prof.vt_app_nation
 where code_cio ='SUI'or code_cio ='JAP'or code_cio ='POL';


----------------------------------------------------------------------------------------
-- La jointure (lire le cours chap 1.3.1 et 1.3.5 et tester aide_jointures.pdf)
----------------------------------------------------------------------------------------
/* 11) Donner la liste des coureurs ayant particip� au Tour 2024. Afficher le nom, le pr�nom, 
le num�ro de dossard  le n�de l'�quipe et le num�ro de coureur. 
Utiliser au moins 2 m�thodes pour effectuer la jointure. */
select*from prof.vt_parti_coureur;
select*from prof.vt_coureur;

select nom,prenom,n_dossard, cour.n_coureur,n_equipe
from prof.vt_coureur cour,prof.vt_parti_coureur
where cour.n_coureur= prof.vt_parti_coureur.n_coureur
and annee=2024;


select nom,prenom,n_equipe,n_dossard,n_coureur
from prof.vt_coureur
join prof.vt_parti_coureur
using (n_coureur)
where annee=2024;

/*11bis) M�me requ�te que pr�c�demment mais pour les dossards compris entre 1 et 9. Justifier le nombre de r�ponses.*/
select nom,prenom,n_equipe,n_dossard,n_coureur
from prof.vt_coureur
join prof.vt_parti_coureur
using (n_coureur)
where annee=2024
and n_dossard<10 ;



/*11ter) (un peu difficile). M�me requ�te que pr�c�demment mais en projetant en compl�ment le nom du sponsor.*/



select cour.nom,prenom,n_dossard, cour.n_coureur,prof.vt_sponsor.n_equipe,prof.vt_parti_coureur.n_sponsor
from prof.vt_parti_coureur,prof.vt_sponsor,prof.vt_coureur cour
where cour.n_coureur= prof.vt_parti_coureur.n_coureur and vt_parti_coureur.n_sponsor = prof.vt_sponsor.n_sponsor and vt_parti_coureur.n_equipe = prof.vt_sponsor.n_equipe
and annee=2024 and n_dossard<10;

/*exoplus 1*/
Drop table Exoplus1A;
Drop table Exoplus1B;
create table Exoplus1A(numVille int, nom char(10));
create table Exoplus1B(numVille int, ville char(10));
insert into Exoplus1A values (1,'L�a');
insert into Exoplus1A values (1,'L�on');
insert into Exoplus1A values (10,'Bernard');
insert into Exoplus1A values (100,'Jacques');
insert into Exoplus1A values (999,'Sylvie');
insert into Exoplus1B values (1,'Caen');
insert into Exoplus1B values (10,'Paris');
insert into Exoplus1B values (98,'Bordeaux');
commit;

select*from Exoplus1A;
select*from Exoplus1B;

select*from Exoplus1A,Exoplus1B;
select e1.* from  Exoplus1A e1,Exoplus1B e2;

select *
from Exoplus1A,Exoplus1B
where Exoplus1A.numville=Exoplus1B.numville;

select *
from Exoplus1A
join Exoplus1B on exoplus1A.numville=exoplus1b.numville;

select *
from Exoplus1A
join Exoplus1B 
using(numville);

select *
from Exoplus1A
natural join Exoplus1B;

select ville
from Exoplus1A
join Exoplus1B 
using(numville);

select *
from Exoplus1A
right join Exoplus1B on exoplus1A.numville=exoplus1b.numville;

select *
from Exoplus1A
left join Exoplus1B on exoplus1A.numville=exoplus1b.numville;

select *
from Exoplus1A
full join Exoplus1B on exoplus1A.numville=exoplus1b.numville;


/*12) Donner la liste des coureurs dont les num�ros de dossard sont compris entre 25 et 27 et dont le nom contient soit
�OR�, soit �RO�. Afficher le nom, le pr�nom, le n� d��quipe, le n� de sponsor et l�ann�e du Tour de France. Le r�sultat
sera class� sur l�ann�e du Tour.*/

select nom, prenom, n_equipe, n_sponsor, annee, n_dossard
from prof.vt_coureur
join prof.vt_parti_coureur using (n_coureur)
where (nom like '%OR%'or nom like '%RO%') 
and(n_dossard between 25 and 27);

select nom, prenom, n_equipe, n_sponsor, annee, n_dossard
from prof.vt_coureur
join prof.vt_parti_coureur on prof.vt_coureur.n_coureur=prof.vt_parti_coureur.n_coureur
where (nom like '%OR%'or nom like '%RO%') 
and(n_dossard >= 25 and n_dossard<=27);



/*13) Donner la liste des coureurs consid�r�s comme jeunes (voir 1-Pres_TDF) pour le Tour 2024. Afficher le nom, le
pr�nom, le num�ro du sponsor et d'�quipe, class�s par ordre alphab�tique sur le nom du coureur.*/

select nom,prenom,n_sponsor,n_equipe
from prof.vt_coureur
join prof.vt_parti_coureur on prof.vt_coureur.n_coureur=prof.vt_parti_coureur.n_coureur
where annee = 2024 and jeune = 'o'
order by nom;





/*13 bis) Donner la liste des coureurs consid�r�s comme jeunes (voir 1-Pres_TDF) pour le Tour 2024. Afficher le nom, le
pr�nom et le nom du sponsor, class�s par ordre alphab�tique sur le nom du sponsor et sur le nom du coureur.*/

select  prof.vt_coureur.nom,prof.vt_sponsor.nom,prenom
from prof.vt_coureur
join prof.vt_parti_coureur on prof.vt_coureur.n_coureur=prof.vt_parti_coureur.n_coureur
join prof.vt_sponsor on prof.vt_sponsor.n_sponsor=prof.vt_parti_coureur.n_sponsor and prof.vt_sponsor.n_equipe=prof.vt_parti_coureur.n_equipe
where annee = 2024 and jeune = 'o'
order by prof.vt_sponsor.nom, prof.vt_coureur.nom;

/*14) : Donner la liste des coureurs (pr�nom et nom) ayant particip� au tour 2024 et pour ceux ayant abandonn�, le type
d�abandon. Attention, les coureurs n�ayant pas abandonn� doivent �tre �galement projet�s.*/

select prenom,nom,c_typeaban
from prof.vt_coureur
join prof.vt_parti_coureur using (n_coureur)
left join  prof.vt_abandon using(n_coureur,annee)
where annee=2024  ;

/*Exoplus2*/
drop table exoplus2;
create table exoplus2(num number(3), nom varchar2(20));
insert into exoplus2 values (1,'Julian');
insert into exoplus2 values (2,'Julian');
insert into exoplus2 values (3,'lance');
insert into exoplus2 values (4,'Romain');
insert into exoplus2 values (5,'Romain');
insert into exoplus2 values (6,'Romain');
insert into exoplus2 values (7,'Thibaut');
insert into exoplus2 values (8,'Thibaut');
commit;

/*R1*/
select nom from exoplus2;
/*R2*/
select e2.nom from exoplus2 e1,exoplus2 e2;
/*R3*/
select nom from exoplus2 e1
join exoplus2 e2 using (nom);

select e1.nom from exoplus2 e1
join exoplus2 e2 on e1.nom=e2.nom;

/*R4*/
select nom from exoplus2 e1
join exoplus2 e2 using (nom)
where e1.num<>e2.num;

/*R5*/
select distinct nom
from exoplus2 e1
join exoplus2 e2 using (nom)
where e1.num<>e2.num;

/*15) Donner la liste alphab�tique, class�e sur le nom et le pr�nom, des coureurs ayant des homonymes (m�me nom).*/
select distinct c1.nom,c1.prenom
from prof.vt_coureur c1
join prof.vt_coureur c2 on c1.nom=c2.nom
where c1.n_coureur<>c2.n_coureur;
/*16) Donner la liste des villes ayant �t� plusieurs fois ville d�arriv�e (ville_a). Afficher le n� �tape, le n� comp, la ville
d�part, la ville arriv�e et l'ann�e du Tour de France.*/
select distinct e1.n_etape, e1.n_comp, e1.ville_d, e1.ville_a, e1.annee
from prof.vt_etape e1
join prof.vt_etape e2 on e1.ville_a=e2.ville_a
where e1.n_etape<>e2.n_etape
or e1.annee<>e2.annee
or e1.n_comp<>e2.n_comp;



/*16bis) M�me question mais sans afficher l'ann�e.
Pourquoi perd-on des lignes ?*/
select distinct e1.n_etape, e1.n_comp, e1.ville_d, e1.ville_a
from prof.vt_etape e1
join prof.vt_etape e2 on e1.ville_a=e2.ville_a
where e1.n_etape<>e2.n_etape
or e1.annee<>e2.annee
or e1.n_comp<>e2.n_comp;

/*17) Donner la liste des diff�rents types d'abandon, m�me les types pour lesquels il n'existe aucun abandon. Ne pas
utiliser join using. Afficher type_aban de vt_abandon et de vt_typeaban ainsi que le libell� de vt_typeaban.*/
select distinct t1.c_typeaban,libelle,t2.c_typeaban
from prof.vt_typeaban t1
left join prof.vt_abandon t2 on t1.c_typeaban=t2.c_typeaban
;

/*18) Difficile : Donner la liste des coureurs des ?quipes "Astana", "Cofidis" et " Movistar" (v?rifier les noms exacts) ayant
abandonn? dans le Tour 2024. Afficher le nom, le pr?nom, le type d'abandon et les directeurs d'?quipe.
Attention : Chercher le nom exact des ?quipes.*/

sur l ent la correction
/*aide ensemble*/

select to_char(nom) as nom from prof.vt_coureur 
intersect
select to_char(prenom) from prof.vt_coureur
order by nom;

select to_char(nom) from prof.vt_coureur
intersect
select upper(to_char(prenom)) from prof.vt_coureur;


select ville_d from prof.vt_etape
intersect
select n_etape from prof.vt_etape;

select to_char(ville_d) from prof.vt_etape
intersect
select to_char(n_etape) from prof.vt_etape;

select to_char(date_etape,'DD') as lejour from prof.vt_etape
intersect
select to_char(n_etape) as lejour from prof.vt_etape
order by 1;

select * from prof.vt_typeaban
minus
select * from prof.vt_abandon;

select nom from prof.vt_coureur
intersect
select date_etape from prof.vt_etape;

select nom,prenom from prof.vt_coureur
intersect
select nom from prof.vt_directeur;

select nom,prenom from prof.vt_coureur
intersect
select nom,prenom from prof.vt_directeur;

select nom,prenom from prof.vt_coureur
minus
select nom,prenom from prof.vt_directeur;

/*exo19*/

select c_typeaban from prof.vt_typeaban
minus
select c_typeaban  from prof.vt_abandon  ;
/*19 bis */
select c_typeaban, libelle  from prof.vt_typeaban 
minus
select distinct c_typeaban,libelle from prof.vt_abandon
join prof.vt_typeaban ab using(c_typeaban);
;

/*20*/
select ville_d from prof.vt_etape
intersect
select ville_a from prof.vt_etape;

/*21*/
select n_coureur from



/*22*/

select n_coureur from prof.vt_coureur where annee =2015 intersect
select n_coureur from prof.vt_coureur where annee =2016 intersect
select n_coureur from prof.vt_coureur where annee =2017 intersect
select n_coureur from prof.vt_coureur where annee =2018 intersect
select n_coureur from prof.vt_coureur where annee =2019 intersect
select n_coureur from prof.vt_coureur where annee =2020 intersect
select n_coureur from prof.vt_coureur where annee =2021 intersect
select n_coureur from prof.vt_coureur where annee =2022 intersect
select n_coureur from prof.vt_coureur where annee =2023 intersect
select n_coureur from prof.vt_coureur where annee =2024;

/*23*/
select numero_ordre from prof.vt_ordrequi
where numero_ordre <10;
