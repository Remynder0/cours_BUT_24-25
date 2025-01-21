#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <unistd.h>
#ifdef _WIN32
    #include <windows.h>
    #include <tlhelp32.h>
#endif

#define SIZE 100

#if defined(_WIN32) && defined(__MINGW32__)
    #pragma GCC diagnostic ignored "-Wattributes"
#endif

extern char **environ;

#ifdef _WIN32
    #define getppid() (GetParentProcessId(GetCurrentProcessId()))

    DWORD GetParentProcessId(DWORD processID) {
        HANDLE hProcessSnap;
        PROCESSENTRY32 pe32;
        DWORD ppid = 0;

        hProcessSnap = CreateToolhelp32Snapshot(TH32CS_SNAPPROCESS, 0);
        if (hProcessSnap == INVALID_HANDLE_VALUE) {
            return 0;
        }

        pe32.dwSize = sizeof(PROCESSENTRY32);

        if (Process32First(hProcessSnap, &pe32)) {
            do {
                if (pe32.th32ProcessID == processID) {
                    ppid = pe32.th32ParentProcessID;
                    break;
                }
            } while (Process32Next(hProcessSnap, &pe32));
        }

        CloseHandle(hProcessSnap);
        return ppid;
    }
#endif

int main(void) {
    int i = 0;
    char nom[SIZE];
    char *variable;

    for (i = 0; environ[i] != NULL; i++) {
        fprintf(stdout, "%d : %s\n", i, environ[i]);
    }

    while (1) {
        fprintf(stdout, " entrez un nom de variable d'environnement, FIN pour sortir : ");
        scanf("%s", nom);
        if (!strcmp(nom, "FIN")) break; // sortie de la boucle
        variable = getenv(nom);
        if (variable == NULL) {
            fprintf(stdout, "%s : non definie\n", nom);
        } else {
            fprintf(stdout, "%s : %s\n", nom, variable);
        }
    }

    #ifdef _WIN32
        printf("mon PID =%d, le PID du SHELL =%lu\n", getpid(), getppid());
    #else
        printf("mon PID =%d, le PID du SHELL =%d\n", getpid(), getppid());
    #endif

    return 0;
}
