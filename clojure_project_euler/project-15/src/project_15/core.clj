(ns project-15.core)

(defn factorial
  [n]
  (->> (inc n)
       (range 1N)
       (reduce *)))

(defn lattice-paths
  ([s]
   (lattice-paths s s))
  ([m n]
   (/ (factorial (+ m n))
      (factorial m)
      (factorial n))))

(defn -main
  [& args]
  (-> 20
      lattice-paths
      println))
