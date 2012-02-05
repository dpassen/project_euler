#!/usr/bin/env python -tt

def sum_ordinal_values_of_text(word):
    return sum(ord(char) - 64 for char in word)

def scale_name_by_index(names):
    for index, name in enumerate(names):
        yield (index + 1) * sum_ordinal_values_of_text(name)

with open('data_files/names.txt') as f:
    names = f.read().replace('"','').split(',')
    names.sort()

    print(sum(scale_name_by_index(names)))

