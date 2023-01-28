#!/usr/bin/env python

print(
    max(
        sum(int(digit) for digit in str(a**b))
        for a in range(1, 101)
        for b in range(1, 101)
    )
)
