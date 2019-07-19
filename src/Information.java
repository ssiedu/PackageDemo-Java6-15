import family.*;
import friends.*;
import friends.best.*;



public class Information {
    public static void main(String[] args) {
        System.out.println("Showing Info About Friends & Family");
        FamilyInfo ob1=new FamilyInfo();
        ob1.showMembersNames();
        FriendsInfo ob2=new FriendsInfo();
        ob2.showFriendsNames();
        System.out.println("Information Completed");
        FriendsContact ob3=new FriendsContact();
        friends.Demo ob4=new friends.Demo();
        
        BestFriendsInfo bestFriend=new BestFriendsInfo();
    }
}

