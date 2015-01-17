(ns project-26.core)

(defn cycle-length [num]
  (loop [rem 1
         acc #{}]
    (if (or (zero? rem) (acc rem))
      (dec (count acc))
      (recur (* 10 (mod rem num)) (conj acc rem)))))

(defn -main [& args]
  (->> (range 1 1000)
       (map (juxt identity cycle-length))
       (apply max-key second)
       first
       println))
