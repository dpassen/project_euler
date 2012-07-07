(ns project-2.core)

(defn fibs
  "Returns a lazy sequence of all the Fibonacci numbers.
   Stolen from old clojure.contrib code."
    []
      (map first (iterate (fn [[a b]] [b (+ a b)]) [0 1])))

(defn -main [& args]
  (println
    (reduce +
      (filter
        even?
        (take-while
          #(< % 4000000)
          (fibs))))))
