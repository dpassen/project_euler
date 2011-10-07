#!/usr/bin/env ruby

puts (1...1000).select {|i| i % 3 == 0 || i % 5 == 0}.reduce(0, &:+)
