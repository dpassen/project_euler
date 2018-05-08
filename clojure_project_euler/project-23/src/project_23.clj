(ns project-23
  (:require
   [clojure.math.numeric-tower :refer [floor sqrt]]))

(defn factors [num]
  (into
   #{}
   (comp
    (filter (comp zero? (partial mod num)))
    (mapcat (juxt identity (partial / num))))
   (range 1 (inc (floor (sqrt num))))))

(defn abundant? [num]
  (> (reduce + (factors num)) (* 2 num)))

(defn -main [& args]
  (let [high      28123
        abundants (into #{} (filter abundant?) (range 1 high))]
    (println
     (transduce
      (remove (fn [num]
                (some (fn [x]
                        (and (abundants x) (abundants (- num x))))
                      abundants))) + (range 1 high)))))
