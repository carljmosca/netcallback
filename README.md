netcallback
### orignal version
This version of netcallback is a modification of Copyright © 2001 Alexander V. Konstantinou
[found here](http://netcallback.sourceforge.net/)

The original work, and therefore this update, is licensed under the GPL.

This program is free software; you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation; either version 2 of the License, or (at your option) any later version.

This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License for more details.

You should have received a copy of the GNU General Public License along with this program (see included COPYRIGHT.txt file); if not, write to the Free Software Foundation Inc., 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA

### examples
```
java -jar netcallback.jar public --service-port 9999 --tcp-port 81
java -jar netcallback.jar private --service-host 10.11.10.11 --service-port 9999 --tcp-host my-inside.service.localdomain --tcp-port 8090
```

### Docker
In addition to the command line parameters described above, netcallback can be configured using environment variables.
This allows configuration consistent with what one might expect to deploy in a containerized Docker environment.
The environment variables are:
- NCB_SERVER_TYPE
- NCB_SERVICE_PORT
- NCB_SERVICE_HOST
- NCB_INITIAL_ANONYMOUS_PORT
- NCB_FINAL_ANONYMOUS_PORT
- NCB_TCP_HOST
- NCB_TCP_PORT
- NCB_UDP_HOST
- NCB_UDP_PORT
- NCB_SSL

Running a Docker container might look like this
```
docker run -d -p 8081:8081 -p 9999:9999 -p 57000-57100:57000-57100 \
-e NCB_SERVER_TYPE=public \
-e NCB_SERVICE_PORT=9999 \
-e NCB_TCP_PORT=8081 \
-e NCB_INITIAL_ANONYMOUS_PORT=57000 \
-e NCB_FINAL_ANONYMOUS_PORT=57100 \
--restart=always --name netcallback netcallback

docker run -d -p 9999:9999 \
-e NCB_SERVER_TYPE=private \
-e NCB_SERVICE_HOST=10.200.100.10 \
-e NCB_SERVICE_PORT=9999 \
-e NCB_TCP_HOST=service.host \
-e NCB_TCP_PORT=8080 \
--restart=always --name netcallback netcallback
```
