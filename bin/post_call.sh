X_VALUE=$((RANDOM%100))
Y_VALUE=$((RANDOM%100))
curl localhost:8888/wastes -X POST -H "Content-Type: application/json" -d '{"id":"007","name":"Brodwino 7","description":"Brodwino środek", "x":"$X_VALUE", "y":"$Y_VALUE"}'
