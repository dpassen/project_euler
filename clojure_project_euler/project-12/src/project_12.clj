(ns project-12
  (:require
   [clojure.math :as math]))

(defn triangle-num
  [n]
  (quot (* n (inc n)) 2))

(defn factors
  [num]
  (into
   #{}
   (comp
    (filter (comp zero? (partial mod num)))
    (mapcat (juxt identity (partial / num))))
   (range 1 (inc (math/floor (math/sqrt num))))))

(defn -main
  [& _args]
  (->> (eduction
        (map triangle-num)
        (map (juxt identity factors))
        (range))
       (some (fn [[n fs]] (when (< 500 (count fs)) n)))
       (println)))
