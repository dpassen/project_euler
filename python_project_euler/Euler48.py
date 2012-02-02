#!/usr/bin/env python -tt

def series_generator(bound):
    return (num ** num for num in range(1, bound + 1))

example = series_generator(1000)
print(str(sum(example))[-10:])
