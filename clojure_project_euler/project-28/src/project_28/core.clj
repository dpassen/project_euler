(ns project-28.core)

(defn -main [& args]
  (letfn [(corners [n]
            (into #{} (map (fn [x] (- (* n n) (* x (dec n))))) (range 4)))]
    (println (transduce (mapcat corners) + (range 1 1002 2)))))
