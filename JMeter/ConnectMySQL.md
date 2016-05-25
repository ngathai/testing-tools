**How to connect MySQL in Jmeter:** <br>
<ul>
1. Install the JDBC Driver for MySQL: <br>
- Download Connector/J here: http://www.mysql.com/products/connector/j/ <br>
- Unzip <br>
- Copy jar file "mysql-connector-java-version-bin" to folder "apache-jmeter-3.0/lib" <br>
- Restart Jmeter
</ul>
<ul>
2. Test plan: <br>
- Test plan > Thread Group > Add > Config Element > JDBC Connection Configuration <br>
- Enter Variable name (ex: testJmeter) <br>
- Enter Database URL "jdbc:mysql://localhost/<database-name> <br>
- Enter JDBC Driver class "com.mysql.jdbc.Driver" <br>
- Enter Username (ex: root) <br>
- Enter Password (ex: let it empty if dont set password) <br>
- Thread group > Add > Sampler > JDBC Request <br>
- Enter variable name must be the same as the name entered at JDBC Connection <br>
- Enter SQL Query (ex: select * from users) <br>
- Enter Parameter values (ex: getAllUsers) <br>
- Add View Result in tree <br>
- Run test plan
</ul>
