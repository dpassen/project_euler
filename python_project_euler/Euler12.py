#!/usr/bin/env python -tt

from math import sqrt, ceil
from itertools import count


def triangle_number(num):
    return (num * (num + 1)) // 2


def get_factors(num):
    factors = []
    for i in range(1, ceil(sqrt(num))):
        if not num % i:
            recip = num // i
            factors.append(i)
            factors.append(recip)
    return factors


for i in count():
    num = triangle_number(i)
    if len(get_factors(num)) > 500:
        print(num)
        break
