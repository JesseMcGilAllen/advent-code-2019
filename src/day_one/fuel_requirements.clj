(ns day-one.fuel-requirements)

(defn calculate-fuel-requirements [mass]
  "calculates the fuel required for the module
   first divide the mass by 3, then round down and finally substract 2."
  (- (Math/floor (/ mass 3.0)) 2))

(defn read-lines [file-path]
 "reads file at file path and stores in a sequence."
  (with-open [rdr (clojure.java.io/reader file-path)]
    (doall  (line-seq rdr))))


(defn calculate-total-mass-needed []
  "Calculates the total mass required from all modules provided by the input file by calling calculate-fuel-requirements on each."
  (reduce +
          (map calculate-fuel-requirements
               (map #(Integer/parseInt %)
                    (read-lines "/Users/caissa/clojure/advent-code-2019/resources/input.txt")))))
