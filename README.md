# scala-jdbc-adwc
Connect to Oracle's Autonomous Data Warehouse with JDBC in scala


## steps 
1. make your adwc
1. download the wallet files to this directory & unzip
1. download the jdbc driver, I used v 18.3
1. download scala libraries, `scala-library-2.11.8.jar`
1. put all the jars in the `lib` folder
1. package the code with `sbt package`
1. edit and run `launch.sh`

## Resources 

download the driver   
http://www.oracle.com/technetwork/database/application-development/jdbc/downloads/index.html

ADWC JDBC docs   
https://docs.oracle.com/en/cloud/paas/autonomous-data-warehouse-cloud/user/connect-jdbc-thin-wallet.html 

Oracle DB 18 JDBC docs  
https://docs.oracle.com/en/database/oracle/oracle-database/18/jjdbc/introducing-JDBC.html 

jdbc docs  
https://docs.oracle.com/en/database/oracle/oracle-database/18/jajdb/index.html  


more on oracle's jdbc and ssl   
https://www.oracle.com/technetwork/database/enterprise-edition/wp-oracle-jdbc-thin-ssl-130128.pdf