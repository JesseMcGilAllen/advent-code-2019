(ns day-one.fuel-requirements)

(defn calculate-fuel-requirements [mass]
  "calculates the fuel required for the module
   first divide the mass by 3, then round down and finally substract 2."
  (- (Math/floor (/ mass 3.0)) 2))
