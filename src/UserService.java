public class UserService {
    public boolean checkUser(String username) {
        if (username == null || username.isEmpty()) {
            System.out.println("Username is empty!");
            return false;
        }
        System.out.println("User checked: "+ username);
        return true;
    }
}