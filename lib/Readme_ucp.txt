Oracle Universal Connection Pool
Patch Release 18.3.0.0.0

Production README
=======================================================================


Contents Of This Release
------------------------

For all platforms:

  [ORACLE_HOME]/ucp/lib contains:

  - ucp.jar
    Classes for use with JDK 8. It contains the Universal Connection Pool
    classes, as well as the built-in JDBC Pool Adapter classes for
    standalone UCP / JDBC applications.

  - ucpdemos.jar
    Classes for use with JDK 8. It contains the Universal Connection Pool
    demos and code samples, sample logging configurations, and a
    quick-start toolkit for Fast Connection Failover.

  Javadoc / Documentation / Demo:

    All of the above are also available for download on OTN.


Installation
------------

The Oracle Installer puts the Universal Connection Pool files in the
[ORACLE_HOME]/ucp directory.


Setting Up Your Environment
---------------------------

On Windows platforms:
  - Add [ORACLE_HOME]\ucp\lib\ucp.jar to your CLASSPATH.

On all Unix platforms:
  - Add [ORACLE_HOME]/ucp/lib/ucp.jar to your CLASSPATH.


Key Problems Fixed in This Patch Release (on top of 18c/18.1)
-------------------------------------------------------------

BUG-26843664
    NullPointerException at ServiceMember.averageAdvisedLoad

BUG-26894737
    UCP does not close Statement or ResultSet when Connection is closed

BUG-26933599
    High CPU when running sharding benchmark

BUG-27030974
    Stuck thread in LoadBalancer.underloadedInstance() causing high CPU usage

BUG-27307868
    NullPointerException at java.base/java.util.AbstractCollection.addAll

BUG-27036408
    Connection creation attempt failed with ORA-12521

BUG-27869339
    Borrow-related semaphore problem causing threads to wait after failovers

