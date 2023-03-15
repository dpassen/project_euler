(ns project-23
  (:require
   [clojure.math :as math]))

(defn factors
  [num]
  (into
   #{}
   (comp
    (filter (comp zero? (partial mod num)))
    (mapcat (juxt identity (partial / num))))
   (range 1 (inc (math/floor (math/sqrt num))))))

(defn abundant?
  [num]
  (> (reduce + (factors num)) (* 2 num)))

(defn -main
  [& _args]
  (let [high      28123
        abundants (into #{} (filter abundant?) (range 1 high))]
    (println
     (transduce
      (remove (fn [num]
                (some (fn [x]
                        (and (abundants x) (abundants (- num x))))
                      abundants))) + (range 1 high)))))
