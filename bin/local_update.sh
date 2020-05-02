ID_VALUE=$1
TIME=$(date '+%s%N')
curl localhost:8899/wastes/$ID_VALUE -X PUT -H "Content-Type: application/json" -d '{"name":"Podmiana","description":"Podmiana", "x":"X", "y":"Y", "device":"lux_device", "time":"'$TIME'"}'
