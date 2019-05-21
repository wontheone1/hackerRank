(ns hacker-rank.birthday-cake-candles
  "https://www.hackerrank.com/challenges/birthday-cake-candles/problem")

; Complete the birthdayCakeCandles function below.
(defn birthdayCakeCandles [ar]
  (let [freq (frequencies ar)
        max-key (apply max (keys freq))]
    (freq max-key)))

(def fptr (get (System/getenv) "OUTPUT_PATH"))

(def ar-count (Integer/parseInt (clojure.string/trim (read-line))))

(def ar (vec (map #(Integer/parseInt %) (clojure.string/split (read-line) #" "))))

(def result (birthdayCakeCandles ar))

(spit fptr (str result "\n") :append true)
