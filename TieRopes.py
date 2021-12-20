def solution(K, A):
    cont = 0
    length = 0
    for soga in A:
        length += soga 
        if length >= K:     cont += 1; length = 0
    return cont
