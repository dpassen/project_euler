(ns project-5
  (:require
   [clojure.math.numeric-tower :refer [lcm]]))

(defn -main [& _args]
  (println (reduce lcm (range 2 21))))
