#!/usr/bin/env python -tt

with open('../data_files/triangle.txt') as f:
    triangle = f.read().strip().split('\n')
    triangle = [[int(num) for num in row.split()] for row in triangle]
    triangle.reverse()

    for row_index, row in enumerate(triangle):
        if row_index != 0:
            for index, num in enumerate(row):
                triangle[row_index][index] += max(triangle[row_index - 1][index], triangle[row_index - 1][index + 1])

    print(triangle[-1][0])

