#!/usr/bin/env python -tt

from functools import reduce

def gcd(a, b):
    if not b:
        return a
    else:
        return gcd(b, a % b)
       
def lcm(a, b):
    return abs(a * b) // gcd(a, b)
    
print(reduce(lcm, range(2,21)))
