
# BUT 2024-2025 (R1)

## Intro C (R1.01)

### TD [12/09/2024]

```c
// ex2
void affiche_nombres(int n){
	for(int i=1; i<=n ;i++){
		printf("%d",i);
	}
}

void affiche_nombres_pairs(int n){
	for(int i=2; i<=n ;i+=2){
		printf("%d",i);
	}
}

void affiche_nombres_decroissants(int n){
	for(int i=n; i>0 ;i--){
		printf("%d",i);
	}
}

//ex3

int somme_impairs(int n){
	int somme=0;
	for(int i=1; i<n ;i+=2){
		somme+=i;
	}
	return somme;
}

int factoriel(int n){
	return n!;

}

```
### TD [12/09/2024]
```c
#include <stdlib.h>

int lance_un_de(){
	return (rand()%6)+1;
}

void lance_1000(){
	int n1,n2,n3,n4,n5,n6;
	n1=n2=n3=n4=n5=n6;
	
	for (int i=0; i < 1000 ;i++){
		int tmp=lance_un_de();
		if (tmp == 1) n1++;
		if (tmp == 2) n2++;
		if (tmp == 3) n3++;
		if (tmp == 4) n4++;
		if (tmp == 5) n5++;
		if (tmp == 6) n6++;
	}
	
	printf("1000 tirages : \n1 : %d \n2 : %d \n3 : %d \n4 : %d \n5 : %d \n6 : %d",n1,n2,n3,n4,n5,n6);
}

void lance_x_fois(){
	int n1,n2,n3,n4,n5,n6;
	n1=n2=n3=n4=n5=n6;
	
	int fois;
	printf("entrer un nombre")
	scanf("%d",&fois);
	
	for (int i=0; i < fois ;i++){
		int tmp=lance_un_de();
		if (tmp == 1) n1++;
		if (tmp == 2) n2++;
		if (tmp == 3) n3++;
		if (tmp == 4) n4++;
		if (tmp == 5) n5++;
		if (tmp == 6) n6++;
	}
	
	printf("%d tirages : \n1 : %d \n2 : %d \n3 : %d \n4 : %d \n5 : %d \n6 : %d",fois,n1,n2,n3,n4,n5,n6);
}


int main(){
	srand(2);
	lance_1000();
	return 0;
}
```



## Web (R1.02)

## Architecture PC (R1.03)

### CM 2 [10/09/24]

##### base 2
 **additions**
- logique de retenue : 1 -> 10 -> 11 -> 100 -> ...
- 
##### base 16
**additions**
- transformation en décimal : F + B *(10)=>* 15 +11 = 26 *(16)=>* 1A 
- 
**multiplications**
- table de multiplications fourni
- 

## Intro système d'exploitation (R1.04)

## Merise (R1.05)

### TD 1 [05/09/24]

[tableau merise](./merise/merise.ods)

### TD 1 [05/09/24]

N|  |Etudiant  |ordinateur|achat|club-sport
   |--|--|--|--|--|--|
0|  | 1 |4|7|10|
1 |**num-etudiant**|*||||
2|nom-etudiant|1||||
3|num-etudiant|1||||
4|num-serie||*|||
5|taille||1|||
6|memoire||1|||
7|num-etudiant|||*||
8|date_achat|||1||
9|magasin|||1||
10|num_club|(1)|||*|
11|taille||||1|
12|num-etudiant||||1|
---

N|Données|Reservation|Client|appartement|
|--|--|:--:|:--:|:--:|
0 | | 1 | 8 | 7 | 10 |
1 |numero_reservation|*|||
2 |date_reservation|1|||
3 |reference_client|(1)|*||
4 |nom_client||1||
5 |prenom_client||1||
6 |rue_client||1||
7 |cp_client||1||
8 |ville_client||1||
9 |||1||
10 |||1||
11 |num-etudiant|||1|
12 |ville_appartement|||1|
13 |tarif|||1|
14 |num-etudiant||||
15 |nb_semaine|1|||
16 |nb_personne|1|||

---

N|Données|Voyage|Salarie|Categorie|insciption|
|--|--|:--:|:--:|:--:|:--:|
0 | | 1 | 9 | 10 | 16 |
1 |==num_voyage==|*|||
2 |type_voyage|1|||
3 |destination_voyage|1|||
4|date_depart_voyage|1||
5 |duree_voyage|1|||
6 |prix_base_adulte|1|||
7 |prix_base_enfant|1|||
8 |date_inscription_voyage||||1
9 |==matricule_salarie==||*||
10 |==csp_salarie==||(1)|*|
11 |coef_multiplicateur|||1|
12 |nom_salarie||1||
13 |prenom_salarie||1||
14 |nb_adultes_inscrit||||1|
15 |nb_enfants_inscrits||||1|
16 |==1+9==||||*|

---

N|Données|Ligne|Reseaux|Station|Zone|Coupon|Classe|acheter
|--|--|:--:|:--:|:--:|:--:|:--:|:--:|:--:|
0 | | 1 | 6 | 3 | 8 | 11 | 13 | 14 |
1 |==num_ligne==|*|||
2 |nom_ligne|1|||
3 |==code_type_reseaux==|(1)|*||
4 |longueur_ligne|1||
5 |libelle_reseaux||1||
6 |==num_station==|||*|
7 |nom_station|||1|
8 |==num_zone==|||(1)|*|
9 |heure_ouverture|||1|
10 |heure_fermeture|||1|
11 |code_type_coupon|||||*
12 |==libelle_type_coupon==|||||1
13 |==num_classe==||||||*
14 |==13+8+11==|||||||*
15 |prix_coupon|||||||1
16 ||||||



### CM 2 [10/09/24]

 - **Super clé** : contient/ donne accès à plusieurs clé
 
## ~~Math discrète (R1.06)~~
*sur feuille*

## ~~algèbre linéaire (R1.07)~~
*sur feuille*

## Gestion  (R1.08)

## Economie (R1.09)

## ~~Anglais (R1.10)~~
*sur feuille*

## Expression Com. (R1.11)
 
### TP libre office

- [TP1](./R1.11/TP1.odt)

___
### sensibilisation à l'ergonomie [11/09/24]

Définition : 
- compréhension des interaction entre humain et système
- Améliorer le bien être des hommes et l'efficacité

On distingue :
- **l’ergonomie physique** -> position du corps, posture et force, vision, audition, etc.
- **l’ergonomie cognitive** -> perception, attention, langage, mémoire, traitement, etc.

> problématique: Comment l'informatique qui apparait a l’écran peut elle être compatible avec la pensée de l’utilisateur qui est nécessairement multiple ?

**note**
-importance de la démarche de conception

**3 niveaux d'ergonomie**

 1. Utilité : réalisation de l’objectif de son utilisateur
 2. Utilisabilité
	 - facilité : temps d’apprentissage, vitesse d’exécution de la tache, nombre d'erreur commises.
3. Acceptabilité : satisfaction de l'utilisateur (contrainte, but,...)

**relations entre ces trois niveaux**
- un site difficilement utilisable mais très utile sera très utilisé
___
### sensibilisation à l'ergonomie [16/09/24]

**Elements a prendre en compte dans la demarche d'analyse**
- **Utilisateur** : la personne réelle qui va utiliser l'application.
- **Contexte** : les conditions d'utilisation de l'application.
- **Tache** : ce que l'utiliqateur veut/doit faire.
- **Activité** : les actions physique/mentale à executer

**Utilisateur**
- Ses objectif, ses besoins : qu'attend-il de l'application ?
- Ses connaisances : dans le domaine de la tache, en informatique
- Ses caractéristiques démographique : age, sexe, etc.
- Ses caractéristiques physique : handicap ?
- Ses caractéristiques psychologiques : Visuel/Auditif, logique/intuitif
- Ses caractéristiques socio-culturelles : sens d'ecriture, format des dates

**Contexte**
- Où ? Dans quel environement ?
- L' *a priori* lors de l'utilisation ?
- L'impact de l'erreur ?
- Le temps de realisation ?
- Les interactions eventuelles avec les autres ?



## PPP (R1.12)
<!--stackedit_data:
eyJoaXN0b3J5IjpbNzc1NjgyMjc1LC0xNjU4NjAzMDE4LC0xMD
U5ODE4ODIwLDE3NTk5NTAzODIsLTE1NDkyMDE2NzEsLTE2MzAy
ODU3OTQsLTEwMTMwNDE3ODksMTYxNDIyNjg4NCwtMTIxNDY3Mj
Q1LC0xMzc2MTQxNTUsLTQxODA4NDc0LDI5MzExMTE3MCw5ODAz
OTcyODMsLTcyMDY0ODIwMywtNDY5MTY5MDU1LC03NDMyOTUyMT
UsLTUxNjMzNjg2NCwtMTY4NzIxMDYwNSwtNTQ0NDUwMzMxLDU1
Mzc1ODExMV19
-->