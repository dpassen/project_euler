(ns project-24
  (:require
   [clojure.math.combinatorics :as combinatorics]))

(defn -main
  [& _args]
  (-> (range 0 10)
      combinatorics/permutations
      (nth 999999)
      println))
