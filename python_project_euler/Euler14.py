#!/usr/bin/env python -tt


def generate_seq(seed):
    seq = [seed]
    while seed > 1:
        seed = (3 * seed + 1) if seed % 2 else seed // 2
        seq.append(seed)
    return seq


def generate_seqlength(max):
    for i in range(1, max + 1):
        yield len(generate_seq(i)), i


print(max(generate_seqlength(1000000))[1])
