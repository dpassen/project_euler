#!/usr/bin/env python3

from functools import reduce
import operator


def product(xs):
    return reduce(operator.mul, xs, 1)


def test(number, series_length):
    for index, value in enumerate(number[: (-1 * (series_length - 1))]):
        yield int(value) * product(
            int(x) for x in number[index + 1 : index + series_length]
        )


with open("../data_files/8.txt") as f:
    large_number = f.read().strip()
    print(max(test(large_number, 13)))
