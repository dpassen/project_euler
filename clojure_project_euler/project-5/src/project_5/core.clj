(ns project-5.core
  (:require
   [clojure.math.numeric-tower :refer [lcm]]))

(defn -main [& args]
  (->> (range 2 21)
       (reduce lcm)
       println))
