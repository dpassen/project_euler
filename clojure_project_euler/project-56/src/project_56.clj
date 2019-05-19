(ns project-56
  (:require
   [clojure.math.numeric-tower :refer [expt]]
   [net.cgrand.xforms.rfs :as rfs]))

(defn -main [& args]
  (letfn [(digital-sum [n]
            (transduce (comp (map str) (map #(Long/parseLong %))) + (str n)))]
    (->> (for [a (range 1 101)
               b (range 1 101)]
           (expt a b))
         (transduce (map digital-sum) rfs/max)
         println)))
