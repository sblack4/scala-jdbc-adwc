package com.github.sblack4.scalajdbcadwc

import java.sql._
import java.security.Security
import oracle.jdbc.pool.OracleDataSource
import oracle.security.pki.OraclePKIProvider
 
object Main {
    val usage = """
    Usage: user password connection 
    """
    def main(args: scala.Array[String]) = {

        if (args.length == 0) println(usage)
        // val wallet_location = args(0)
        // val tns_admin = args(1)
        // val user = args(2)
        // val password = args(3)
        // val connection = args(4)
        // val url = "jdbc:oracle:oci8:@"

        val wallet_dir = "/Users/DV79FN/Git/kafka-streams-adwc/scala-jdbc-adwc/wallet_LUIGI"
        val wallet_location = s"(SOURCE=(METHOD=file)(METHOD_DATA=(DIRECTORY=$wallet_dir)))"
        val tns_admin = wallet_dir
        val user = "admin"
        val password = "Welcome123321"
        val connection = s"jdbc:oracle:thin:@luigi_low?TNS_ADMIN=$tns_admin"
        println("connection: ")
        println(connection)

        // when you're debugging it's best to leave out 
        // any try-catch blocks
        // - that way you get to see all the errors in all their glory!

        // try {

            Security.insertProviderAt(new OraclePKIProvider, 3)

            val ods = new OracleDataSource()
            ods.setURL(connection)
            ods.setUser(user)
            ods.setPassword(password)

            val conn = ods.getConnection()
            
            val stmt = conn.createStatement()

            // val query = "SELECT count(*) from ssb.lineorder where rownum < 5"
            // val query = "select 'hello world' from dual"
            val query = "insert into tickets values ('992303772928262318', '2017-07-06','feature','Moment bring offi...')"

            println(query)
            val rset = stmt.executeQuery(query)

            // uncomment these two lines for any SELECT queries

            // while (rset.next())
            //    println(rset.getString(1))

            rset.close()
            stmt.close()
            conn.close()
        // } catch {
        //     case e: SQLException => {
        //         println("Connection Failed")
        //         println(e.getStackTrace)
        //     }
        // }
    }
}

