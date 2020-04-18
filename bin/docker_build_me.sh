docker build -t=dumpskip .
# docker run -it --name dumpy -p 8888:8899 dumpskip "/bin/bash"
docker run -d --name dumpy -p 8888:8899 dumpskip 
