(ns project-21.core
  (:require
   [clojure.math.numeric-tower :refer [floor sqrt]]))

(defn divisors [num]
  (->> (for [x (range 1 (inc (floor (sqrt num))))
             :when (zero? (mod num x))]
         [x (/ num x)])
       flatten
       distinct))

(defn proper-divisors [num]
  (remove #{num} (divisors num)))

(defn amicable? [num]
  (let [pair (reduce + (proper-divisors num))]
    (and
     (not= num pair)
     (= num (reduce + (proper-divisors pair))))))

(defn -main [& args]
  (->> (range 1 10000)
       (filter amicable?)
       (reduce +)
       println))
