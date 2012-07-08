(ns project-5.core
  (:use [clojure.math.numeric-tower :only (lcm)]))

(defn -main [& args]
  (println
    (reduce lcm
      (range 2 21))))
