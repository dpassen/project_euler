#!/usr/bin/env python -tt

def series_generator(bound):
    return (num ** num for num in range(bound + 1) if num)

example = series_generator(1000)
print(str(sum(example))[-10:])
