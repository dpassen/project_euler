#!/usr/bin/env python -tt

def _fib():
    a, b = 0, 1
    while True:
        yield a
        a, b = b, a + b

for i, v in enumerate(_fib()):
    if len(str(v)) == 1000:
        print(i)
        break

