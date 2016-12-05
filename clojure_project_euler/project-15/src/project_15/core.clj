(ns project-15.core)

(defn factorial [n] (reduce *' (range 1 n)))

(defn lattice-paths
  ([s] (lattice-paths s s))
  ([m n]
   (/ (factorial (+ m n))
      (factorial m)
      (factorial n))))

(defn -main
  [& args]
  (println (lattice-paths 20)))
