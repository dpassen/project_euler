(ns project-2)

(def fibs (map first (iterate (fn [[a b]] [b (+ a b)]) [0 1])))

(defn -main [& _args]
  (println
   (transduce
    (comp
     (take-while (partial > 4000000))
     (filter even?)) + fibs)))
