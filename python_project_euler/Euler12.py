#!/usr/bin/env python -tt

from math import sqrt, ceil
from itertools import count


def triangle_number(num):
    return (num * (num + 1)) // 2


def get_factors(num):
    for i in range(1, int(ceil(sqrt(num)))):
        if not num % i:
            yield i
            yield num // i


print(
    next(
        t
        for t in (triangle_number(i) for i in count())
        if len(list(get_factors(t))) > 500
    )
)
