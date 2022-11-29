(ns project-9
  (:require
   [clojure.math.numeric-tower :refer [expt]]))

(defn triplets-equal-to
  [sum]
  (sequence
   (comp
    (mapcat (fn [c]
              (map (juxt identity (partial - sum c) (constantly c))
                   (range 1 (inc (quot (- sum c) 2))))))
    (filter (fn [[a b c]] (= (expt c 2) (+ (expt a 2) (expt b 2))))))
   (range 1 (inc (quot sum 2)))))

(defn -main
  [& _args]
  (let [[a b c] (first (triplets-equal-to 1000))]
    (println (* a b c))))
