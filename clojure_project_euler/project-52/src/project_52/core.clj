(ns project-52.core)

(defn -main [& args]
  (println
   (ffirst
    (filter
     (fn [nums] (apply = (map (comp set str) nums)))
     (eduction
      (map (fn [n] (map (partial * n) (range 1 7))))
      (iterate inc 1))))))
