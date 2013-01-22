#!/usr/bin/env python -tt

from itertools import count


def contains_same_terms_as_multiples(num):
    return set(str(num)) == set(str(num * 2)) == set(str(num * 3)) == set(str(num * 4)) == set(str(num * 5)) == set(str(num * 6))

print(next(num for num in count(1) if contains_same_terms_as_multiples(num)))
