(ns financial_market.transform-json-to-map.core
  (:require [cheshire.core :as json]))

(defn parse-input-json [json-input]
  (json/parse-string json-input true))

;; Example usage:
(let [json-input "[{\"operation\":\"buy\",\"unit-cost\":10.00,\"quantity\":100},{\"operation\":\"sell\",\"unit-cost\":15.00,\"quantity\":50}]"
      parsed-data (parse-input-json json-input)]
  (println parsed-data))
