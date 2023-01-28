#!/usr/bin/env python


def prime_factors(num):
    i = 2
    while i <= num:
        if not num % i:
            yield i
            num /= i
        i += 1


print(max(prime_factors(600851475143)))
