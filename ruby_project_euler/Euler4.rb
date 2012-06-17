#!/usr/bin/env ruby

palindromes = Enumerator::Generator.new do |g|
    (100..999).each do |i|
        (100..999).each do |j|
            product = i * j
            g.yield product if product.to_s == product.to_s.reverse
        end
    end
end

puts palindromes.max
