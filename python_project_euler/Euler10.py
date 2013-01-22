#!/usr/bin/env python -tt

from itertools import takewhile
from math import sqrt, floor


def primes():
    composites = {}
    n = 2
    while True:
        if n not in composites:
            yield n
            composites[n**2] = n
        else:
            witness = composites.pop(n)
            next = n + witness
            while next in composites:
                next += witness
            composites[next] = witness
        n += 1


def primes_up_to(limit):
    return takewhile(lambda p: p <= limit, primes())

print(sum(primes_up_to(2000000)))
