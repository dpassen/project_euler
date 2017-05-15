(ns project-12.core
  (:require
   [clojure.math.numeric-tower :refer [floor sqrt]]))

(defn triangle-num [n]
  (quot (* n (inc n)) 2))

(defn factors [num]
  (into
   #{}
   (comp
    (filter (comp zero? (partial mod num)))
    (mapcat (juxt identity (partial / num))))
   (range 1 (inc (floor (sqrt num))))))

(defn -main [& args]
  (->> (eduction
        (comp
         (map triangle-num)
         (map (juxt identity factors)))
        (range))
       (some (fn [[n fs]] (when (< 500 (count fs)) n)))
       println))
