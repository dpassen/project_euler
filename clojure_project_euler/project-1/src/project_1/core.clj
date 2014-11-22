(ns project-1.core)

(defn -main [& args]
  (->> (range 1 1000)
       (filter #(or (zero? (mod % 3))
                    (zero? (mod % 5))))
       (reduce +)
       println))
