
public class DataBase {
	 private Data d;

	 public DataBase(Data d) {
	    this.d = d;
	 }

	 public void insertUser(User user) {
	     // Logic to insert user into database
	     d.insert("INSERT INTO users VALUES ...");
	 }
}
