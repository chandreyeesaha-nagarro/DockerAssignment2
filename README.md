# DockerAssignment2

Docker Advance Assignment
This project demonstrates a Dockerized Spring Boot application with MySQL integration,
optimized Dockerfiles, and security best practices.
Build the docker image:
● docker pull chandreyees20/docker-assignment:02
● docker run -d -p 8080:8080 chandreyees20/docker-assignment:02
Access the Application:
● The Spring Boot application will be available at http://localhost:8080.
● MySQL can be accessed at localhost:3306 (use a MySQL client with the credentials
you specified).
Backup:
To create a backup of the MySQL database, use the following command (replace the path with
your project's directory):
● docker run --rm -v db_data:/volume -v $(pwd)/backup:/backup busybox tar cvf
/backup/db_backup.tar /volume
Restore:
To restore the database from the backup, use the following command:
● docker run --rm -v db_data:/volume -v $(pwd)/backup:/backup busybox tar xvf
/backup/db_backup.tar -C 
