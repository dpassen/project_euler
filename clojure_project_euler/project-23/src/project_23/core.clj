(ns project-23.core
  (:require
   [clojure.math.numeric-tower :refer [floor sqrt]]))

(defn factors [num]
  (->> (for [x (range 1 (inc (floor (sqrt num))))
             :when (zero? (mod num x))]
         [x (/ num x)])
       flatten
       distinct))

(defn abundant? [num]
  (> (reduce + (factors num)) (* 2 num)))

(defn -main [& args]
  (let [high 28123
        abundants (->> (range 1 high)
                       (filter abundant?)
                       set)]
    (->> (range 1 high)
         (remove (fn [num] (some (fn [x] (and (abundants x) (abundants (- num x)))) abundants)))
         (reduce +)
         println)))
