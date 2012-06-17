#!/usr/bin/env ruby

fib = Enumerator::Generator.new do |g|
    a, b = 0, 1
    loop do
        g.yield a
        a, b = b, a + b
    end
end

puts fib.take_while {|a| a < 4000000}.select {|i| i % 2 == 1}.reduce(:+)
