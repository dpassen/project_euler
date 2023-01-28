#!/usr/bin/env python

from functools import reduce
from operator import mul
from fractions import Fraction


def is_palindrome(str):
    return str == str[::-1]


def is_curious(num, den):
    if is_palindrome(str(num)) and is_palindrome(str(den)):
        return False
    else:
        first_num = num // 10
        second_num = num % 10
        first_den = den // 10
        second_den = den % 10
        return (
            second_den
            and (first_num / second_den) == (num / den)
            and second_num == first_den
        )


curious_fractions = (
    Fraction(a, b) for b in range(10, 100) for a in range(10, b) if is_curious(a, b)
)

print(reduce(mul, curious_fractions).denominator)
