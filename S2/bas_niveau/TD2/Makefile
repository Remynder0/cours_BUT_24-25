# Règle par défaut
all: programme

# Règle pour générer l'exécutable
programme: principal.o fonction.o fonction2.o
	gcc -Wall -g principal.o fonction.o fonction2.o -o programme

# Compilation séparée des fichiers sources
principal.o: principal.c
	gcc -Wall -g -c principal.c -o principal.o

fonction.o: fonction.c
	gcc -Wall -g -c fonction.c -o fonction.o

fonction2.o: fonction2.c
	gcc -Wall -g -c fonction2.c -o fonction2.o

# Nettoyage des fichiers objets et de l'exécutable
clean:
	rm -f principal.o fonction.o fonction2.o programme
