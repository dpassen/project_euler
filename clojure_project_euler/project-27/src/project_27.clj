(ns project-27
  (:require
   [clojure.math.numeric-tower :refer [floor sqrt]]))

(defn prime?
  [num]
  (when (< 1 num)
    (empty?
     (for [x     (range 2 (inc (floor (sqrt num))))
           :when (zero? (mod num x))]
       x))))

(def primes (filter prime? (range)))

(defn quadratic-primes
  [a b]
  (sequence
   (comp (map (fn [n] (+ (* n n) (* a n) b)))
         (take-while prime?))
   (range)))

(defn -main
  [& _args]
  (->> (for [a (range -1000 1001)
             b (take-while (partial > 1001) primes)] ;; for n^2 + an + b to be prime when n = 0,
                                                     ;; b must be prime
         [a b])
       (map (juxt identity (comp count (partial apply quadratic-primes))))
       (apply max-key second)
       first
       (reduce *)
       println))
