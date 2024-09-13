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
----------------------------------------------------------------------------------------
/* 11) Donner la liste des coureurs ayant particip� au Tour 2024. Afficher le nom, le pr�nom, 
le num�ro de dossard  le n�de l'�quipe et le num�ro de coureur. 
Utiliser au moins 2 m�thodes pour effectuer la jointure. */

-- Continuer � faire des copier-coller des questions avant d'y r�pondre	