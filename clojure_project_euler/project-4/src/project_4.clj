(ns project-4
  (:require
   [clojure.math.combinatorics :as combinatorics]
   [clojure.string :as str]))

(defn -main
  [& _args]
  (println
   (transduce
    (comp
     (map (partial apply *))
     (filter (comp (fn [product] (= product (str/reverse product))) str)))
    max
    0
    (combinatorics/combinations (range 100 1000) 2))))
