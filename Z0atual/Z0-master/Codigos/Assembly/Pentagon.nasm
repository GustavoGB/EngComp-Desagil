; Pentagon.nasm

; Desenha um pentâgono na tela.

;1
leaw $384,%A
movw %A,%D
leaw $16384,%A
movw %D,(%A)

;2
leaw $576,%A
movw %A,%D
leaw $16416,%A
movw %D,(%A)

;3
leaw $1056,%A
movw %A,%D
leaw $16448,%A
movw %D,(%A)

;4
leaw $6168,%A
movw %A,%D
leaw $16480,%A
movw %D,(%A)

;5
leaw $8196,%A
movw %A,%D
leaw $16512,%A
movw %D,(%A)

;6
leaw $16386,%A
movw %A,%D
leaw $16544,%A
movw %D,(%A)











;7
leaw $32766,%A
not %A
movw %A,%D
leaw $16576,%A
movw %D,(%A)

;8
leaw $32766,%A
not %A
movw %A,%D
leaw $16608,%A
movw %D,(%A)
















;9
leaw $16386,%A
movw %A,%D
leaw $16640,%A
movw %D,(%A)

;10
leaw $16386,%A
movw %A,%D
leaw $16672,%A
movw %D,(%A)

;11
leaw $16386,%A
movw %A,%D
leaw $16704,%A
movw %D,(%A)

;12
leaw $8196,%A
movw %A,%D
leaw $16736,%A
movw %D,(%A)

;13
leaw $8196,%A
movw %A,%D
leaw $16768,%A
movw %D,(%A)

;14
leaw $8196,%A
movw %A,%D
leaw $16800,%A
movw %D,(%A)

;15
leaw $4104,%A
movw %A,%D
leaw $16832,%A
movw %D,(%A)

;16
leaw $8184,%A
movw %A,%D
leaw $16864,%A
movw %D,(%A) 