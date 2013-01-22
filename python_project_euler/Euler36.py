#!/usr/bin/env python -tt


def is_palindrome(value):
    str_value = str(value)
    return str_value == str_value[::-1]

print(sum(num for num in range(1000000) if is_palindrome(num) and is_palindrome(bin(num)[2:])))
