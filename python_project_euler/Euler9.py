#!/usr/bin/env python


def generate_triplets_equal_to(sum):
    for c in range((sum // 2) + 1):
        ab_sum = sum - c
        for a, b in ((i, ab_sum - i) for i in range(1, (ab_sum // 2) + 1)):
            if a**2 + b**2 == c**2:
                yield a, b, c


a, b, c = next(generate_triplets_equal_to(1000))
print(a * b * c)
