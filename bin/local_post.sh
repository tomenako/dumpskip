ID_VALUE=$((RANDOM%7777))
TIME=$(date '+%s%N')
curl localhost:8899/wastes -X POST -H "Content-Type: application/json" -d '{"id":"'$ID_VALUE'","name":"Brodwino '$ID_VALUE'","description":"Brodwino desc", "x":"'$ID_VALUE'", "y":"'$ID_VALUE'", "device":"baba1234fefe", "time":"'$TIME'"}'
