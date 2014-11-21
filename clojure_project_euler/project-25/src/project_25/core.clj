(ns project-25.core)

(defn fibs
  "Returns a lazy sequence of all the Fibonacci numbers.
  Stolen from old clojure.contrib code."
  []
  (map first (iterate (fn [[a b]] [b (+ a b)]) [0M 1M])))

(defn -main [& args]
  (->>
    (fibs)
    (take-while (comp (partial > 1000) count str))
    count
    println))
