(ns project-1)

(defn -main
  [& _args]
  (println
   (transduce
    (filter #(or (zero? (mod % 3))
                 (zero? (mod % 5)))) + (range 1 1000))))
