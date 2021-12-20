def solution(A, B):
    if len(A) < 1:
        return 0
     
    cont = 1
    pe = B[0]
     
    for index in range(1, len(A)):
        if A[index] > pe:
            cont += 1
            pe = B[index]
     
    return cont
