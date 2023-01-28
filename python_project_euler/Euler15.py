#!/usr/bin/env python

from math import factorial


def count_routes(m, n):
    return factorial(m + n) / (factorial(m) * factorial(n))


print(count_routes(20, 20))
