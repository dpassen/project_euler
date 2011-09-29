#!/usr/bin/env python -tt

def other_ones(num):
    val = 1000 - num
    for i in range(1, val // 2):
        yield (i, val - i)

def generate_triplets_equal_to_1000():
    for i in range(500):
        for j in other_ones(i):
            if j[0] ** 2 + j[1] ** 2 == i ** 2:
                return (i, j[0], j[1])
                
a,b,c = generate_triplets_equal_to_1000()
print(a * b * c)

