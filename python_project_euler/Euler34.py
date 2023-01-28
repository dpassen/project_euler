#!/usr/bin/env python

from math import factorial


def generate_curious_numbers_up_to(upper_bound):
    for num in range(3, upper_bound):
        if num == sum(factorial(int(digit)) for digit in str(num)):
            yield num


print(sum(generate_curious_numbers_up_to(1000000)))
