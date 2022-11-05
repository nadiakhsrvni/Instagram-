/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.util.Scanner;

/**
 *
 * @author Namayan
 */
public class Project {

    /**
     * @param args the command line arguments
     */
    
    public static void showSelectionList(){
        System.out.println("******* Selection list *******");
        System.out.println("Enter 1 to show page info");
        System.out.println("Enter 2 to show page posts");
        System.out.println("Enter 3 to show page following");
        System.out.println("Enter 4 to show page followers");
        System.out.println("Enter 0 to quit");
    }
    
    public static void showSelectionListForFollowing(){
        System.out.println("******* Selection list for following *******");
        System.out.println("Enter following userid to open it");
        System.out.println("Enter 1 to add following");
        System.out.println("Enter 0 to exit Selection list for following");
    }
    
    public static void showSelectionListForFollower(){
        System.out.println("******* Selection list for follower *******");
        System.out.println("Enter follower userid to open it");
        System.out.println("Enter 0 to exit Selection list for follower");
    }
    
    public static void separator(){
        System.out.println("------------------------------------------------------------------------------");
    }
    
    public static void main(String[] args) {
        
        //USERS
        
        user[] userArray = new user[10];
        userArray[0] = new user("mohammadii" , "mohammadii10", 20);
        userArray[1] = new user("sobhaani" , "sobhaani10", 21);
        userArray[2] = new user("amini" , "amini10", 22);
        userArray[3] = new user("bharrr" , "bharrr10", 23);
        userArray[4] = new user("saamiiraa" , "saamiiraa10", 24);
        userArray[5] = new user("rahimian" , "rahimian10", 25);
        userArray[6] = new user("n.a.v.i.d" , "n.a.v.i.d10", 26);
        userArray[7] = new user("negar.vg" , "negar.vg10", 27);
        userArray[8] = new user("parham25" , "parham2510", 28);
        userArray[9] = new user("hannna" , "hannna10", 29);
        
        //BIOS:
        
        userArray[0].setBio("Life is short, so always keep smiling :) ");
        userArray[1].setBio("Success is in my veins");
        userArray[2].setBio("Welcome to my world");
        userArray[3].setBio("Life is what happens to you while you scroll through Instagram");
        userArray[4].setBio("Midnight snacker 🌝");
        userArray[5].setBio("Cancer survivor");
        userArray[6].setBio("Adventurer");
        userArray[7].setBio("Personal Trainer, Dancer");
        userArray[8].setBio("Kanye attitude with Drake feelings");
        userArray[9].setBio("Relationship status: Netflix and ice cream");
        
        //FOLLOWS:
        
        userArray[0].follow(userArray[1]);
        userArray[0].follow(userArray[2]);
        userArray[0].follow(userArray[3]);
        
        userArray[1].follow(userArray[2]);
        userArray[1].follow(userArray[3]);
        userArray[1].follow(userArray[4]);
        
        userArray[2].follow(userArray[3]);
        userArray[2].follow(userArray[4]);
        
        userArray[3].follow(userArray[4]);
        userArray[3].follow(userArray[5]);
        userArray[3].follow(userArray[6]);
        
        userArray[4].follow(userArray[5]);
        
        userArray[5].follow(userArray[6]);
        userArray[5].follow(userArray[7]);
        
        userArray[6].follow(userArray[7]);
        
        userArray[7].follow(userArray[8]);
        userArray[7].follow(userArray[9]);
        userArray[7].follow(userArray[0]);
        
        userArray[8].follow(userArray[9]);
        userArray[8].follow(userArray[0]);
        userArray[8].follow(userArray[1]);
        
        userArray[9].follow(userArray[0]);
        userArray[9].follow(userArray[1]);
        
        
        //POSTS:
        
        userArray[0].addPost("All we have is NOW");
        userArray[0].addPost("Be self-starter");
        
        userArray[1].addPost("Dream bigger...");
        userArray[1].addPost("Live Love Laugh");
        userArray[1].addPost("Push yourself");  
        
        userArray[2].addPost("Just Do It");
        
        userArray[3].addPost("Dream it, Wish it, Do it");
        userArray[3].addPost("Don't stop when you're tired. Stop when you're done");
        
        userArray[4].addPost(" <3 :) ");
        
        userArray[5].addPost("Little things make big days");
        userArray[5].addPost("It's going to be hard but hard doesn't mean impossible");
        userArray[5].addPost("Create opportunities");
        
        userArray[6].addPost("When you can't find the sunshine, be the sunshine");
        userArray[6].addPost("Be happy");
        
        userArray[7].addPost("Say yes to new adventures");
        userArray[7].addPost("The idea is to die young . . . as late as possible.");
        userArray[7].addPost("Friends are the family we choose for ourselves");
        
        userArray[8].addPost("I'll stop wearing black when they make a darker color");
        userArray[8].addPost("Every moment matters");
        
        userArray[9].addPost("I tell the truth even when I lie");
        
        
        Scanner input = new Scanner(System.in);
        int x;
        int z;
        while(true){
            System.out.println("**Welcome to Instagram**");
            System.out.println("Enter your username:");
            int k=10;
            while(k==10){
                String u = input.next();
                for(int i=0; i<10; i++){
                    if(userArray[i].getUsername().equals(u)){
                        k=i;
                    }
                }
                if(k<10)
                    break;
                System.out.println("This username does not exist. Please enter your username again.");
            }
            System.out.println("Enter your password:");
            String p = input.next();
            while(!userArray[k].getPassword().equals(p)){
                System.out.println("Password is wrong. Please re-enter your password");
                p = input.next();
            }
            // LOGIN SUCCESSFUL!
            separator();
            
            showSelectionList();
            x = input.nextInt();
            separator();
            
            while(x!=0){
                //PAGE INFO
                if(x==1){
                    System.out.println("******* page info *******");
                    System.out.printf("your bio: %s%n",userArray[k].getBio());
                    System.out.printf("your followers count: %d%n",userArray[k].getCountFollowers());
                    System.out.printf("your following count: %d%n",userArray[k].getCountFollowings());
                    System.out.printf("your post count: %d%n%n",userArray[k].getCountPosts());
                    
                    showSelectionList();
                    x = input.nextInt(); 
                    separator();
                }
                //PAGE POSTS
                if(x==2){
                    System.out.println("******* your post captions and ids *******");
                    for(int i=0; i<userArray[k].getCountPosts(); i++){
                        System.out.printf("post%d:%ncaption: %s%nid: %d%n%n",userArray[k].posts[i].getNumber(), userArray[k].posts[i].getCaption(), userArray[k].posts[i].getId());
                    }
                    System.out.println("******* Selection list for posts *******");
                    System.out.println("Enter post id to show post");
                    System.out.println("Enter 1 to add new post");
                    System.out.println("Enter 0 to exit post selection");
                    int y = input.nextInt();
                    separator();
                    
                    switch (y) {
                        case 0:
                            //goes back to Selection list
                            showSelectionList();
                            x = input.nextInt();
                            separator();
                            break;
                        case 1:
                            // adds new post
                            System.out.println("Enter caption:");
                            Scanner scanner = new Scanner(System.in).useDelimiter("\n");
                            String cap = scanner.next();
                            userArray[k].addPost(cap);
                            separator();
                            break;
                        default:
                            // user has entered post id
                            for(int i=0; i<userArray[k].getCountPosts(); i++){
                                if(y == userArray[k].posts[i].getId()){
                                    System.out.println("******* Post Info *******");
                                    System.out.printf("post%d:%ncaption: %s%nid: %d%nlikes:%d%n%n",userArray[k].posts[i].getNumber(), userArray[k].posts[i].getCaption(), userArray[k].posts[i].getId(), userArray[k].posts[i].getLikes());
                                }
                            }   separator();
                            break;
                    }
                }
                //PAGE FOLLOWINGS
                if(x==3){
                    
                    OUTER:
                    while (true) {
                        System.out.println("******* following UserNames *******");
                        for(int i=0; i<userArray[k].getCountFollowings(); i++){
                            System.out.printf("%n%s , UserId: %d%n%n",userArray[k].followings[i].getUsername(), userArray[k].followings[i].getId());
                        }   showSelectionListForFollowing();
                        int y = input.nextInt();
                        separator();
                        switch (y) {
                            case 0:
                                // goes back to Selection list
                                showSelectionList();
                                x = input.nextInt();
                                separator();
                                break OUTER;
                            case 1:
                                // add followings
                                
                                while(true){
                                    System.out.println("************ All pages ************");
                                    for(int i=0; i<10; i++){
                                        System.out.printf("%s , UserId: %d%n", userArray[i].getUsername(), userArray[i].getId());
                                    }
                                    
                                    System.out.println("******* Selection list for pages *******");
                                    System.out.println("Enter UserId to follow");
                                    System.out.println("Enter 0 to exit all pages");
                                    
                                    z = input.nextInt();
                                    
                                    if(z==0){
                                        break;
                                    }
                                    else{ // user has entered UserId
                                        int a=0;
                                        int comp=0;
                                        while(true){
                                            // a is the index of the person who's UserId has been entered
                                            for(int i=0; i<10; i++){
                                                if(z == userArray[i].getId())
                                                    a=i;
                                            }
                                            comp = 0;
                                            for(int i=0; i<userArray[k].getCountFollowings(); i++){ // checking to see if the user already follows this account
                                                if(userArray[k].followings[i].getId() == z){
                                                    comp++;
                                                    System.out.println("WARNING : You already follow this user. Enter another ID:");
                                                    break;
                                                }
                                            }
                                            if(a == k){ // users can't follow themselves
                                                comp++;
                                                System.out.println("WARNING : You can't follow yourself. Enter another ID:");
                                            }
                                            if(comp == 0)
                                                break;
                                            z = input.nextInt(); 
                                        }
                                        if(comp == 0){ // if comp = 0 then the two warnings checked above are clear and the user can follow the chosen account
                                            userArray[k].follow(userArray[a]);
                                        }
                                    }
                                }   break;
                            default:
                                while(true){
                                    System.out.println("********* page info *********");
                                    int a=0;
                                    // a is the index of the person who's UserId has been entered
                                    for(int i=0; i<10; i++){
                                        if(y == userArray[i].getId())
                                            a=i;
                                    }
                                    System.out.printf("following UserName: %s%n",userArray[a].getUsername());
                                    System.out.printf("bio: %s%n", userArray[a].getBio());
                                    System.out.printf("followers count: %d%n", userArray[a].getCountFollowers());
                                    System.out.printf("following count: %d%n", userArray[a].getCountFollowings());
                                    System.out.printf("post count: %d%n%n", userArray[a].getCountPosts());
                                    
                                    System.out.println("******** Selection list for posts ********");
                                    System.out.println("Enter 1 to show page posts");
                                    System.out.println("Enter 0 to exit Selection list for posts");
                                    
                                    z = input.nextInt();
                                    
                                    if(z==1){
                                        while(true){
                                            separator();
                                            System.out.println("******* page posts *******");
                                            for(int i=0; i<userArray[a].getCountPosts(); i++){
                                                System.out.printf("post%d:%ncaption: %s%nid: %d%n%n",userArray[a].posts[i].getNumber(), userArray[a].posts[i].getCaption(), userArray[a].posts[i].getId());
                                            }
                                            System.out.println("Enter post ID to open the post");
                                            System.out.println("Enter 0 to exit page posts");
                                            int t = input.nextInt();
                                            separator();
                                            if(t==0){
                                                break;
                                            }
                                            int h=0; // h is the index of the chosen postId
                                            for(int i=0; i<10; i++){
                                                if(t == userArray[z].posts[i].getId())
                                                    h=i;
                                            }    
                                            System.out.printf("post%d:%ncaption: %s%nid: %d%nlikes: %d%n%n",userArray[a].posts[h].getNumber(), userArray[a].posts[h].getCaption(), userArray[a].posts[h].getId(), userArray[a].posts[h].getLikes());
                                            System.out.println("Press 'L' to like this post");
                                            System.out.println("Enter 0 to skip");
                                            String like = input.next();
                                            if(like.equals("L") || like.equals("l")){
                                                userArray[a].posts[h].setLikes(userArray[a].posts[h].getLikes()+1);
                                            }
                                        }
                                    }
                                    if(z==0)
                                        break;
                                }   break;
                        }
                        separator();
                    }
                }
                //PAGE FOLLOWERS
                if(x==4){
                    
                    while(true){
                        System.out.println("******* follower UserNames *******");
                        for(int i=0; i<userArray[k].getCountFollowers(); i++){
                            System.out.printf("%n%s , UserId: %d%n%n",userArray[k].followers[i].getUsername(), userArray[k].followers[i].getId());
                        }

                        showSelectionListForFollower();
                        int y = input.nextInt();
                        separator();
                       
                        if(y==0){ // goes back to Selection list
                            showSelectionList();
                            x = input.nextInt();
                            separator();
                            break;
                        }

                        // user has entered a page ID (y=id)
                        else{
                            while(true){
                                System.out.println("********* page info *********");
                                int a=0;
                                // a is the index of the person who's UserId has been entered
                                for(int i=0; i<10; i++){
                                    if(y == userArray[i].getId())
                                        a=i;
                                } 
                                System.out.printf("follower UserName: %s%n",userArray[a].getUsername());
                                System.out.printf("bio: %s%n", userArray[a].getBio());
                                System.out.printf("followers count: %d%n", userArray[a].getCountFollowers());
                                System.out.printf("following count: %d%n", userArray[a].getCountFollowings());
                                System.out.printf("post count: %d%n%n", userArray[a].getCountPosts());

                                System.out.println("******** Selection list for posts ********");
                                System.out.println("Enter 1 to show page posts");
                                System.out.println("Enter 0 to exit Selection list for posts");

                                z = input.nextInt();
                                
                                if(z==1){
                                    while(true){
                                        separator();
                                        System.out.println("******* page posts *******");                                 
                                        for(int i=0; i<userArray[a].getCountPosts(); i++){
                                            System.out.printf("post%d:%ncaption: %s%nid: %d%n%n",userArray[a].posts[i].getNumber(), userArray[a].posts[i].getCaption(), userArray[a].posts[i].getId());    
                                        }
                                        System.out.println("Enter post ID to open the post");
                                        System.out.println("Enter 0 to exit page posts");
                                        int t = input.nextInt();
                                        separator();
                                        if(t==0){
                                           break; 
                                        }
                                        int h=0; // h is the index of the chosen postId
                                        for(int i=0; i<10; i++){
                                            if(t == userArray[z].posts[i].getId())
                                                h=i;
                                        } 
                                        System.out.printf("post%d:%ncaption: %s%nid: %d%nlikes: %d%n%n",userArray[a].posts[h].getNumber(), userArray[a].posts[h].getCaption(), userArray[a].posts[h].getId(), userArray[a].posts[h].getLikes());
                                        System.out.println("Press 'L' to like this post");
                                        System.out.println("Enter 0 to skip");
                                        String like = input.next();
                                        if(like.equals("L") || like.equals("l")){
                                            userArray[a].posts[h].setLikes(userArray[a].posts[h].getLikes()+1);
                                        } 
                                    }
                                }
                                if(z==0)
                                    break;
                            }
                        }
                        separator();
                    }
                }
            }
        }
    } 
}    