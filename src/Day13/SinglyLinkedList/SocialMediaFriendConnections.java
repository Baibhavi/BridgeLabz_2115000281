package Day13.SinglyLinkedList;
import java.util.List;
import java.util.ArrayList;
class User {
    int userId;
    String name;
    int age;
    List<Integer> friendIds;
    User next;
    public User(int userId, String name, int age){
        this.userId = userId;
        this.name = name;
        this.age = age;
        this.friendIds = new ArrayList<>();
        this.next = null;
    }
}
class FriendConnection {
    User head;
    public FriendConnection() {
        this.head = null;
    }
    public void addUser(int userId, String name, int age) {
        User newUser = new User(userId, name, age);
        newUser.next = head;
        head = newUser;
    }
    public User findUserById(int userId){
        User temp = head;
        while(temp != null){
            if(temp.userId == userId){
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }
    public User findUserByName(String name){
        User temp = head;
        while(temp != null){
            if(temp.name == name){
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }
    public void addFriend(int userId1, int userId2){
        User user1 = findUserById(userId1);
        User user2 = findUserById(userId2);
        if(user1 == null || user2 == null){
            System.out.println("One or both users not found.");
            return;
        }
        if(!user1.friendIds.contains(userId2)){
            user1.friendIds.add(userId2);
        }
        if(!user2.friendIds.contains(userId1)){
            user2.friendIds.add(userId1);
        }
    }
    public void removeFriend(int userId1, int userId2){
        User user1 = findUserById(userId1);
        User user2 = findUserById(userId2);
        if(user1 == null || user2 == null){
            System.out.println("One or both users not found");
            return;
        }
        user1.friendIds.remove(Integer.valueOf(userId2));
        user2.friendIds.remove(Integer.valueOf(userId1));
    }
    public void displayFriends(int userId){
        User user = findUserById(userId);
        if (user == null) {
            System.out.println("User not found.");
            return;
        }
        System.out.println("Friends of " + user.name + ":");
        for(int friendIds : user.friendIds){
            User friend = findUserById(userId);
            System.out.println(friend.name);
        }
    }
    public void findMutualFriends(int userId1, int userId2) {
        User user1 = findUserById(userId1);
        User user2 = findUserById(userId2);
        if (user1 == null || user2 == null) {
            System.out.println("One or both users not found.");
            return;
        }
        System.out.println("Mutual Friends of " + user1.name + " and " + user2.name + ":");
        for(int friendId1 : user1.friendIds){
            if(user2.friendIds.contains(friendId1)){
                User mutualFriend = findUserById(friendId1);
                System.out.println(mutualFriend.name);
            }
        }
    }
    public void countFriends(int userId) {
        User user = findUserById(userId);
        if (user == null) {
            System.out.println("User not found.");
            return;
        }
        System.out.println(user.name + " has " + user.friendIds.size() + " friends.");
    }
    public void displayAllUsers() {
        User temp = head;
        while (temp != null) {
            System.out.println("User: " + temp.name + ", ID: " + temp.userId + ", Age: " + temp.age);
            temp = temp.next;
        }
    }
}
public class SocialMediaFriendConnections {
    public static void main(String[] args) {
        FriendConnection connection = new FriendConnection();
        connection.addUser(1, "Alice", 25);
        connection.addUser(2, "Bob", 24);
        connection.addUser(3, "Charlie", 23);
        connection.addFriend(1, 2);
        connection.addFriend(1, 3);
        connection.addFriend(2, 3);
        connection.displayAllUsers();
        connection.displayFriends(1);
        connection.findMutualFriends(1, 2);
        connection.countFriends(3);
    }
}
