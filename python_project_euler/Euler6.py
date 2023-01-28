#!/usr/bin/env python

a = (i**2 for i in range(1, 101))
b = (i for i in range(1, 101))

print(abs(sum(a) - sum(b) ** 2))
