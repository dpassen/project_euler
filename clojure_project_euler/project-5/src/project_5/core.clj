(ns project-5.core
  (:require
   [clojure.math.numeric-tower :refer [lcm]]))

(defn -main [& args]
  (println (reduce lcm (range 2 21))))
