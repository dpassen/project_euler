(ns project-21
  (:require
   [clojure.math :as math]))

(defn proper-divisors
  [num]
  (into
   #{}
   (comp
    (filter (comp zero? (partial mod num)))
    (mapcat (juxt identity (partial / num)))
    (remove #{num}))
   (range 1 (inc (math/floor (math/sqrt num))))))

(defn amicable?
  [num]
  (let [pair (reduce + (proper-divisors num))]
    (and
     (not= num pair)
     (= num (reduce + (proper-divisors pair))))))

(defn -main
  [& _args]
  (println (transduce (filter amicable?) + (range 1 10000))))
