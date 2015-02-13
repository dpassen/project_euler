(ns project-28.core)

(defn corners [n]
  (set
   (for [x (range 4)]
     (- (* n n) (* x (dec n))))))

(defn -main [& args]
  (->> (range 1 1002 2)
       (map corners)
       (map (partial reduce +))
       (reduce +)
       println))
