(ns financial_market.calculate-total-cost.core)

(defn calculate-total-cost [operations]
  (map (fn [op] (* (:unit-cost op) (:quantity op))) operations))

;; Example usage
(calculate-total-cost [{:operation "buy" :unit-cost 10.00 :quantity 100}
                       {:operation "sell" :unit-cost 15.00 :quantity 50}
                       {:operation "sell" :unit-cost 15.00 :quantity 50}])
