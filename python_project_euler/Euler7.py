#!/usr/bin/env python


from itertools import islice


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


def get_prime(num):
    return next(islice(primes(), num - 1, num))


print(get_prime(10001))
