(ns financial_market.add-total-cost-to-map.core)

(def transactions
  [{:operation "buy" :unit-cost 10.00 :quantity 100}
   {:operation "sell" :unit-cost 15.00 :quantity 50}
   {:operation "sell" :unit-cost 15.00 :quantity 50}])

(def costs [1000.0 750.0 750.0])

(defn add-total-cost-to-map [transaction cost]
  (assoc transaction :total-cost cost))

(map add-total-cost-to-map transactions costs)
