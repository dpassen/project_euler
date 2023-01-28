#!/usr/bin/env python


def sum_of_nth_power_of_digits(n, num):
    return sum(int(digit) ** n for digit in str(num))


def generate_nth_power_equalities(n, upper_bound):
    for num in range(2, upper_bound):
        if num == sum_of_nth_power_of_digits(n, num):
            yield num


print(sum(generate_nth_power_equalities(5, 1000000)))
