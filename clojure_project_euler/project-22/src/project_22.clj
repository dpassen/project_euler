(ns project-22
  (:require
   [clojure.string :as str]))

(def ^:const offset (dec (int \A)))

(defn -main [& args]
  (letfn [(scale-name [idx name]
            (* (inc idx) (transduce (map #(- (int %) offset)) + name)))]
    (-> (slurp "../../data_files/22.txt")
        (str/replace #"\"" "")
        (str/split #",")
        sort
        (->> (transduce (map-indexed scale-name) +))
        println)))
