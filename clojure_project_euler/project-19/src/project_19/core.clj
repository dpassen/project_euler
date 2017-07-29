(ns project-19.core
  (:require [java-time :as time]))

(defn -main [& args]
  (println
   (count
    (filter
     time/sunday?
     (take-while
      (fn [date] ((complement time/after?) (time/year date) (time/year 2000)))
      (time/iterate time/plus (time/local-date 1901 1 1) (time/months 1)))))))
