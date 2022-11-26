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


def prime_factors(limit):
    for prime in primes_up_to(floor(sqrt(limit)) + 1):
        if not limit % prime:
            yield prime


print(max(prime_factors(600851475143)))
