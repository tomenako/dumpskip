# build spring jar locally
# mvn clean package
# build local docker image
docker build -t=dumpskip .
# manage containers (raise fresh one eventually)
docker stop dumpy
docker rm dumpy
docker run -d --name dumpy -p 8888:8899 dumpskip 
# docker run -it --name dumpy -p 8888:8899 dumpskip "/bin/bash"
