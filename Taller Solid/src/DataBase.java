
public class DataBase {
	 private MySQL mySQL;

	 public DataBase(MySQL mySQL) {
	    this.mySQL = mySQL;
	 }

	 public void insertUser(User user) {
	     // Logic to insert user into database
	     mySQL.insert("INSERT INTO users VALUES ...");
	 }
}
