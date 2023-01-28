#!/usr/bin/env python

with open("../data_files/67.txt") as f:
    triangle = f.read().strip().split("\n")
    triangle = [[int(num) for num in row.split()] for row in triangle]
    triangle.reverse()

    for row_index, row in enumerate(triangle):
        if row_index != 0:
            for index, num in enumerate(row):
                previous_row = triangle[row_index - 1]
                triangle[row_index][index] += max(
                    previous_row[index], previous_row[index + 1]
                )

    print(triangle[-1][0])
