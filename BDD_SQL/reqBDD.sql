-- Saisir la requête suivante : select nom from vt_equipe; Exécuter et commenter
--le résultat
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
-- La projection et la restriction (lire le cours de 1.1 à 1.2 et tester les exemples)
----------------------------------------------------------------------------------------

/* 1) Établir la liste des étapes dont le n° est compris entre 5 et 10. Afficher le n° de l'étape, 
la ville départ, la ville arrivée et la distance. */

select n_etape,ville_a,ville_d,distance from prof.vt_etape
where n_etape<5;

/* 2) Même requête que précédemment mais pour l'année 2024. */

/* 3) Afficher la liste des étapes dont le n° est inférieur à 5 ou supérieur à 10 pour l'année 2024 (2 solutions). */

/* 4) Établir la liste des étapes "prologue" (relire 1_Pres_TDF.pdf). Afficher le code pays départ, 
le code pays arrivée, la ville départ, la ville arrivée, la distance, la vitesse moyenne, année et le type d'étape.
 La liste affichée sera présentée par ordre croissant de la distance. */
 
/* 5) Projeter les étapes répondant à l'une ou l'autre des restrictions suivantes (une seule requête) :
    • le premier caractère de la ville de départ est un 'B', 
    • le dernier caractère de la ville de départ est un 'A',
    • la ville de départ contient un 'U'.
*/

/* 6) Projeter l'étape courue le 14 juillet 2024 */

/* 7) Projeter le prénom, le nom et l’âge des coureurs ayant participé à leur premier tour en 2024. */

/* 8) Donner la liste des sponsors dont le nom abrégé est vide avant 1986. */

/* 9) Projeter par ordre alphabétique croissant des prénoms et par nom des coureurs décroissant, 
la liste des coureurs dont le nom commence par un 'V'. */

/* 10) Projeter la liste des nations d00es coureurs (app_nation) dont le pays d'origine
 a pour code : "SUI", "JAP" ou "POL". */

----------------------------------------------------------------------------------------
-- La jointure (lire le cours chap 1.3.1 et 1.3.5 et tester aide_jointures.pdf)
----------------------------------------------------------------------------------------
/* 11) Donner la liste des coureurs ayant participé au Tour 2024. Afficher le nom, le prénom, 
le numéro de dossard  le n°de l'équipe et le numéro de coureur. 
Utiliser au moins 2 méthodes pour effectuer la jointure. */

-- Continuer à faire des copier-coller des questions avant d'y répondre	