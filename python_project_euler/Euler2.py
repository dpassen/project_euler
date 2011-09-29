#!/usr/bin/env python -tt

from itertools import takewhile

def fib():
    a, b = 1, 2
    while True:
        yield a
        a, b = b, a + b
        

fibs = takewhile(lambda x : x < 4000000, fib())
print(sum(i for i in fibs if not i % 2))
