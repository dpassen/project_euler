#!/usr/bin/env python -tt

from math import factorial

def count_routes(points):
    return factorial(2 * points) / (factorial(points) * factorial(points))

print(count_routes(20))

