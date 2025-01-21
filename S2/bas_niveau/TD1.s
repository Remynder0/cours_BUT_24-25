	.file	"TD1.c"
	.text
	.globl	GetParentProcessId
	.def	GetParentProcessId;	.scl	2;	.type	32;	.endef
	.seh_proc	GetParentProcessId
GetParentProcessId:
	pushq	%rbp
	.seh_pushreg	%rbp
	subq	$352, %rsp
	.seh_stackalloc	352
	leaq	128(%rsp), %rbp
	.seh_setframe	%rbp, 128
	.seh_endprologue
	movl	%ecx, 240(%rbp)
	movl	$0, 220(%rbp)
	movl	$0, %edx
	movl	$2, %ecx
	call	CreateToolhelp32Snapshot
	movq	%rax, 208(%rbp)
	cmpq	$-1, 208(%rbp)
	jne	.L2
	movl	$0, %eax
	jmp	.L7
.L2:
	movl	$304, -96(%rbp)
	leaq	-96(%rbp), %rax
	movq	208(%rbp), %rcx
	movq	%rax, %rdx
	call	Process32First
	testl	%eax, %eax
	je	.L4
.L6:
	movl	-88(%rbp), %eax
	cmpl	%eax, 240(%rbp)
	jne	.L5
	movl	-64(%rbp), %eax
	movl	%eax, 220(%rbp)
	jmp	.L4
.L5:
	leaq	-96(%rbp), %rax
	movq	208(%rbp), %rcx
	movq	%rax, %rdx
	call	Process32Next
	testl	%eax, %eax
	jne	.L6
.L4:
	movq	208(%rbp), %rax
	movq	%rax, %rcx
	movq	__imp_CloseHandle(%rip), %rax
	call	*%rax
	movl	220(%rbp), %eax
.L7:
	addq	$352, %rsp
	popq	%rbp
	ret
	.seh_endproc
	.def	__main;	.scl	2;	.type	32;	.endef
	.section .rdata,"dr"
.LC0:
	.ascii "%d : %s\12\0"
	.align 8
.LC1:
	.ascii " entrez un nom de variable d'environnement, FIN pour sortir : \0"
.LC2:
	.ascii "%s\0"
.LC3:
	.ascii "FIN\0"
.LC4:
	.ascii "%s : non definie\12\0"
.LC5:
	.ascii "%s : %s\12\0"
	.align 8
.LC6:
	.ascii "mon PID =%d, le PID du SHELL =%lu\12\0"
	.text
	.globl	main
	.def	main;	.scl	2;	.type	32;	.endef
	.seh_proc	main
main:
	pushq	%rbp
	.seh_pushreg	%rbp
	pushq	%rbx
	.seh_pushreg	%rbx
	subq	$168, %rsp
	.seh_stackalloc	168
	leaq	160(%rsp), %rbp
	.seh_setframe	%rbp, 160
	.seh_endprologue
	call	__main
	movl	$0, -4(%rbp)
	movl	$0, -4(%rbp)
	jmp	.L9
.L10:
	call	__p__environ
	movq	(%rax), %rdx
	movl	-4(%rbp), %eax
	cltq
	salq	$3, %rax
	addq	%rdx, %rax
	movq	(%rax), %rbx
	movl	$1, %ecx
	movq	__imp___acrt_iob_func(%rip), %rax
	call	*%rax
	movq	%rax, %rcx
	movl	-4(%rbp), %eax
	movq	%rbx, %r9
	movl	%eax, %r8d
	leaq	.LC0(%rip), %rax
	movq	%rax, %rdx
	call	fprintf
	addl	$1, -4(%rbp)
.L9:
	call	__p__environ
	movq	(%rax), %rdx
	movl	-4(%rbp), %eax
	cltq
	salq	$3, %rax
	addq	%rdx, %rax
	movq	(%rax), %rax
	testq	%rax, %rax
	jne	.L10
.L15:
	movl	$1, %ecx
	movq	__imp___acrt_iob_func(%rip), %rax
	call	*%rax
	movq	%rax, %r9
	movl	$62, %r8d
	movl	$1, %edx
	leaq	.LC1(%rip), %rax
	movq	%rax, %rcx
	call	fwrite
	leaq	-128(%rbp), %rax
	movq	%rax, %rdx
	leaq	.LC2(%rip), %rax
	movq	%rax, %rcx
	call	scanf
	leaq	-128(%rbp), %rax
	leaq	.LC3(%rip), %rdx
	movq	%rax, %rcx
	call	strcmp
	testl	%eax, %eax
	je	.L18
	leaq	-128(%rbp), %rax
	movq	%rax, %rcx
	call	getenv
	movq	%rax, -16(%rbp)
	cmpq	$0, -16(%rbp)
	jne	.L13
	movl	$1, %ecx
	movq	__imp___acrt_iob_func(%rip), %rax
	call	*%rax
	movq	%rax, %rcx
	leaq	-128(%rbp), %rax
	movq	%rax, %r8
	leaq	.LC4(%rip), %rax
	movq	%rax, %rdx
	call	fprintf
	jmp	.L15
.L13:
	movl	$1, %ecx
	movq	__imp___acrt_iob_func(%rip), %rax
	call	*%rax
	movq	%rax, %rcx
	movq	-16(%rbp), %rdx
	leaq	-128(%rbp), %rax
	movq	%rdx, %r9
	movq	%rax, %r8
	leaq	.LC5(%rip), %rax
	movq	%rax, %rdx
	call	fprintf
	jmp	.L15
.L18:
	nop
	movq	__imp_GetCurrentProcessId(%rip), %rax
	call	*%rax
	movl	%eax, %ecx
	call	GetParentProcessId
	movl	%eax, %ebx
	call	getpid
	movl	%ebx, %r8d
	movl	%eax, %edx
	leaq	.LC6(%rip), %rax
	movq	%rax, %rcx
	call	printf
	movl	$0, %eax
	addq	$168, %rsp
	popq	%rbx
	popq	%rbp
	ret
	.seh_endproc
	.ident	"GCC: (x86_64-posix-seh-rev0, Built by MinGW-Builds project) 13.2.0"
	.def	CreateToolhelp32Snapshot;	.scl	2;	.type	32;	.endef
	.def	Process32First;	.scl	2;	.type	32;	.endef
	.def	Process32Next;	.scl	2;	.type	32;	.endef
	.def	__p__environ;	.scl	2;	.type	32;	.endef
	.def	fprintf;	.scl	2;	.type	32;	.endef
	.def	fwrite;	.scl	2;	.type	32;	.endef
	.def	scanf;	.scl	2;	.type	32;	.endef
	.def	strcmp;	.scl	2;	.type	32;	.endef
	.def	getenv;	.scl	2;	.type	32;	.endef
	.def	getpid;	.scl	2;	.type	32;	.endef
	.def	printf;	.scl	2;	.type	32;	.endef
