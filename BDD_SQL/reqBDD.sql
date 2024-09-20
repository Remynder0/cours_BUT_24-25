-- Saisir la requ�te suivante : select nom from vt_equipe; Ex�cuter et commenter
--le r�sultat
select nom from prof.vt_sponsor;

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

select sysdate from dual;

select date-etape from prof.vt_etape;

select sysdate-date_etape from dual;


select sysdate-date_etape from prof.vt_etape;

desc prof.vt_coureur; 



----------------------------------------------------------------------------------------
-- La projection et la restriction (lire le cours de 1.1 � 1.2 et tester les exemples)
----------------------------------------------------------------------------------------

/* 1) �tablir la liste des �tapes dont le n� est compris entre 5 et 10. Afficher le n� de l'�tape, 
la ville d�part, la ville arriv�e et la distance. */

select * from prof.vt_etape
where n_etape>= 5;

select * from prof.vt_etape
where n_etape>= 5 and n_etape <=10;

select * from prof.vt_etape
where n_etape between 5 and 10;


select n_etape,ville_d,ville_a,distance
from prof.vt_etape
where n_etape>= 5 and n_etape<=10;


/* 2) M�me requ�te que pr�c�demment mais pour l'ann�e 2024. */
select n_etape,ville_d,ville_a,distance
from prof.vt_etape
where n_etape between 5 and 10
and annee = 2024;
/* 3) Afficher la liste des �tapes dont le n� est inf�rieur � 5 ou sup�rieur � 10 pour l'ann�e 2024 (2 solutions). */
select n_etape,ville_d,ville_a,distance
from prof.vt_etape
where n_etape NOT between 5 and 10
and annee = 2024;

select n_etape,ville_d,ville_a,distance
from prof.vt_etape
here (n_etape<5 or n_etape>10)
and annee = 2024;
/* 4) �tablir la liste des �tapes "prologue" (relire 1_Pres_TDF.pdf). Afficher le code pays d�part, 
le code pays arriv�e, la ville d�part, la ville arriv�e, la distance, la vitesse moyenne, ann�e et le type d'�tape.
 La liste affich�e sera pr�sent�e par ordre croissant de la distance. */
 select CODE_CIO_A,VILLE_D, VILLE_A,DISTANCE, MOYENNE ,ANNEE ,CAT_CODE
 from prof.vt_etape
 where CAT_CODE = 'PRO'
order by DISTANCE ;

 
/* 5) Projeter les �tapes r�pondant � l'une ou l'autre des restrictions suivantes (une seule requ�te)�:
    � le premier caract�re de la ville de d�part est un 'B', 
    � le dernier caract�re de la ville de d�part est un 'A',
    � la ville de d�part contient un 'U'.
*/
select * from prof.vt_etape
 where lower(ville_d) like 'b%' 
 or upper(ville_d) like '%A' 
 or upper(ville_d) like '%U%';


/* 6) Projeter l'�tape courue le 14 juillet 2024 */
select * from prof.vt_etape
where date_etape = '14/07/2024' ;
/* 7) Projeter le pr�nom, le nom et l��ge des coureurs ayant particip� � leur premier tour en 2024. */
select nom, prenom,annee_naissance
from prof.vt_coureur
where annee_prem ='2024';
/* 8) Donner la liste des sponsors dont le nom abr�g� est vide avant 1986. */
select * from prof.vt_sponsor
where annee_sponsor < '1986'
and na_sponsor is null;

/* 9) Projeter par ordre alphab�tique croissant des pr�noms et par nom des coureurs d�croissant, 
la liste des coureurs dont le nom commence par un 'V'. */
select nom,prenom from prof.vt_coureur
where upper(nom) like 'V%'
order by prenom ;
/* 10) Projeter la liste des nations d00es coureurs (app_nation) dont le pays d'origine
 a pour code�: "SUI", "JAP" ou "POL". */
select n_coureur from prof.vt_app_nation
where code_cio = 'SUI'
or code_cio = 'JAP'
or code_cio = 'POL';
----------------------------------------------------------------------------------------
-- La jointure (lire le cours chap 1.3.1 et 1.3.5 et tester aide_jointures.pdf)


select *
from prof.vt_typeaban
where c_typeaban='NP';

select *
from prof.vt_abandon
where annee=2015 and c_typeaban='NP';
-- jointure SQL1
select *
from prof.vt_abandon , prof.vt_coureur 
where prof.vt_abandon.n_coureur = prof.vt_coureur.n_coureur
and annee=2015 and c_typeaban='NP';

select prof.vt_abandon.n_coureur,nom, c_typeaban
from prof.vt_abandon , prof.vt_coureur 
where prof.vt_abandon.n_coureur = prof.vt_coureur.n_coureur
and annee=2015 and c_typeaban='NP';
-- jointure SQL1 avec alias de tables
select aba.n_coureur,nom,c_typeaban
from prof.vt_abandon aba , prof.vt_coureur cou
where aba.n_coureur = cou.n_coureur
and annee=2015 and c_typeaban='NP';
-- jointure SQL2 join
select ab.n_coureur, nom, c_typeaban
from prof.vt_abandon ab
join prof.vt_coureur co on ab.n_coureur = co.n_coureur
where annee=2015 and c_typeaban='NP';
-- jointure SQL2 join using
select n_coureur, nom, c_typeaban
from prof.vt_abandon ab
join prof.vt_coureur co using (n_coureur)
where annee=2015 and c_typeaban='NP';
-- jointure SQL2 natural join
select n_coureur, nom, c_typeaban
from prof.vt_abandon 
natural join prof.vt_coureur
where annee=2015 and c_typeaban='NP'
----------------------------------------------------------------------------------------
/* 11) Donner la liste des coureurs ayant particip� au Tour 2024. Afficher le nom, le pr�nom, 
le num�ro de dossard  le n�de l'�quipe et le num�ro de coureur. 
Utiliser au moins 2 m�thodes pour effectuer la jointure. */




select prenom , nom , n_dossard , n_equipe ,prof.vt_coureur.n_coureur
from prof.vt_coureur, prof.vt_parti_coureur
where prof.vt_coureur.n_coureur = prof.vt_parti_coureur.n_coureur
and annee = 2024 ;

select prenom , nom , n_dossard , n_equipe ,co.n_coureur
from prof.vt_coureur co 
join prof.vt_parti_coureur pco on co.n_coureur = pco.n_coureur
where annee = 2024 ;



-- Continuer � faire des copier-coller des questions avant d'y r�pondre	
--11bis) M�me requ�te que pr�c�demment mais pour les dossards compris entre 1 et 9. Justifier le nombre de r�ponses

select prenom , nom , n_dossard , n_equipe ,co.n_coureur
from prof.vt_coureur co 
join prof.vt_parti_coureur pco on co.n_coureur = pco.n_coureur
where annee = 2024 and n_dossard between 1 and 9 ;
/*car on changee de disaine et que il n'y a que 8 joueur par equipe*/
select prenom , nom , n_dossard , n_equipe ,co.n_coureur
from prof.vt_coureur co 
join prof.vt_parti_coureur pco on co.n_coureur = pco.n_coureur
where annee = 2024 and n_dossard between 1 and 9 ;

--11ter) (un peu difficile). M�me requ�te que pr�c�demment mais en projetant en compl�ment le nom du sponsor.
select prenom , co.nom as nom_coureur , n_dossard , n_equipe, sp.nom as nom_sponsor
from prof.vt_parti_coureur pco
join prof.vt_coureur co using (n_coureur)
join prof.vt_sponsor sp using (n_equipe, n_sponsor)
where pco.annee = 2024 and n_dossard between 1 and 9;
order by co.nom;

--exopus num 1

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

select *
from Exoplus1B;

select *
from exoplus1A,exoplus1B;

select e1.* from exoplus1A e1,exoplus1B e2;

-- q4)
select *
from exoplus1A ,exoplus1B
where exoplus1a.numVille =exoplus1B.Num


-- jointure where req4
select *
from exoplus1A exoA , exoplus1B exoB
where exoA.numVille = exoB.numVille;
-- jointure join req5
select *
from exoplus1A
join exoplus1B on exoplus1A.numVille = exoplus1B.numVille;
-- jointure join using req6
select *
from exoplus1A
join exoplus1B co using (n_coureur);
-- jointure natural join req7
select *
from prof.vt_abandon 
natural join prof.vt_coureur;
-- jointure right join req8
select *
from prof.vt_abandon 
natural join prof.vt_coureur;
-- jointure left join req9
select *
from prof.vt_abandon 
natural join prof.vt_coureur;
-- jointure full join req10
select *
from prof.vt_abandon 
natural join prof.vt_coureur;


/* 12) Donner la liste des coureurs dont les num�ros de dossard sont compris entre 25 et 27 et dont le nom contient soit
�OR�, soit �RO�. Afficher le nom, le pr�nom, le n� d��quipe, le n� de sponsor et l�ann�e du Tour de France. Le r�sultat
sera class� sur l�ann�e du Tour.*/
