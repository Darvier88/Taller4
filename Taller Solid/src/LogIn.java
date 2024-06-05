public class LogIn {
	private DataBase db;
    public void log (User user) {
        System.out.println("Has access to the website");
        db.insertUser(user);
        // Logic
    }
}

