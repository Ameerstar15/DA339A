


/*  Author: Alameer Albadrani
 Id: Am2541
Study program: Datateknik
*/


import java.util.Scanner;
import java.util.Arrays;

public class Untitled{
  // Deklaring the array above all methods,
  //will make it accessable for all the methods
    static String[][] guestList= {{"Adam Ason","35"} ,
                            {"Berta Bson","70"} ,
                            {"Ceasar Cson","12"} ,
                            {"",""} ,
                            {"",""} ,
                            {"",""} ,
                            {"",""} ,
                            {"",""} ,
                            {"",""} ,
                            {"",""}
                          };


    public static void main(String[] args) {
      // Main method
      Scanner input = new Scanner(System.in);
      boolean finish = false;
      do {


      Showmenu();
      int choise = input.nextInt();

      switch(choise){

        case 0:
          System.out.println(" Your choise : " +choise);
          System.out.println("***** Thanks for using our program *****");
          finish = true;
        break;
        case 1:
        System.out.println("******************************");
          printGuestList();
          System.out.println();
        break;
        case 2:
        System.out.println("******************************");
          ShowStatics();
          System.out.println();
        break;
        case 3:
        System.out.println("******************************");
          AddGuest();
          System.out.println();
        break;
        case 4:
        System.out.println("******************************");
          ChangeName();
          System.out.println();
        break;
        case 5:
        System.out.println("******************************");
          ChangeAge();
          System.out.println();
        break;
        case 6:
        System.out.println("******************************");
          ChangePlace();
          System.out.println();
        break;
        case 7:
        System.out.println("******************************");
          DeleteGuest();
          System.out.println();
        break;


      }
  }while (finish != true);{
  }
}





    public static void Showmenu(){


      System.out.println("1. Show guestlist  ");
      System.out.println("2. Show statics ");
      System.out.println("3. Add a guest");
      System.out.println("4. Change a guest's name ");
      System.out.println("5. Change a guest's age ");
      System.out.println("6. Change a guest's place in guest list");
      System.out.println("7. Delete a guest");
      System.out.println("0. Exit");
    }
    // this method will print all the guests that we have in
    // our guestslist
    public static void printGuestList(){
      System.out.println("You chose to print the guestlist");
      for(int row= 0; row < guestList.length; row++){ //a for loop will go through the array
        if((guestList[row][0] != "")&& (guestList[row][1] !="")) { // a condition that will only be applied if the elements in the array isnt emtpy
          System.out.println(guestList[row][0] +" , " +guestList[row][1]); // print the non-empty elements array
        }
    }
}

  // this method will give us some statistics about our guestlist
    public static void ShowStatics(){
      int NumberOfGuests =0 ;
      int Adults = 0;
      int Children = 0;
      int minAge =0;
      int youngestRow =-1;
      int maxAge =0;
      int oldestRow =-1;
      // here we run the for loop through the array to identify the elements that arent empty
      for(int row=0; row < guestList.length; row++)
    {
      if(guestList[row][0] !=null && guestList[row][0]!= "")
      {
        youngestRow = row;
        oldestRow = row;
        minAge = Integer.parseInt(guestList[row][1]);
        maxAge = Integer.parseInt(guestList[row][1]);
        break;
      }
    }
    if(youngestRow != -1)
    {
      for (int row =0; row < guestList.length; row++) // this for loop will count how many guests we have
      {
        if(guestList[row][0] !="" )
        if(guestList[row][0] !=null)
        {
        {
          NumberOfGuests++;
          // we change the String to Int to compare ages and determine whos the oldest and whos the youngest
          if(Integer.parseInt(guestList[row][1]) > 13)
          {
            Adults++;
          }
          else
          {
            Children++;
          }
          if(Integer.parseInt(guestList[row][1]) < minAge)
          {
            minAge = Integer.parseInt(guestList[row][1]);
            youngestRow = row;
          }
          if( Integer.parseInt(guestList[row][1]) > maxAge)
          {
            maxAge = Integer.parseInt(guestList[row][1]);
            oldestRow = row;
          }
        }
        }
      }
      System.out.println("****** Statistics *******");
      System.out.println("Total number of guests : "+ NumberOfGuests);
      System.out.println("Number of adults : "+ Adults);
      System.out.println("Number of children : "+ Children);
      System.out.println("The youngest guest is : "+ guestList[youngestRow][0]+" , " +guestList[youngestRow][1] +" years old");
      System.out.println("The oldest guest is : "+ guestList[oldestRow][0]+ " , "+ guestList[oldestRow][1]+ " yeas old");
      System.out.println();
    }
    else
    {
      System.out.println("The gueslist is empty. ");
      System.out.println();
    }

  /*    System.out.println("Number of guests :");
      for(int row =0; row < guestList.length ; row++){
        if(guestList[row][0] != ""){
          NumberOfGuests++;
        }
      }

      System.out.println(NumberOfGuests);

      System.out.println("Number of adults : ");
      for( int row =0; row < guestList.length; row++){
        if(guestList[row][1] != ""){
          int Age = Integer.parseInt(guestList[row][1]);
            if(Age > 13){
              Adults++;
            } else{
              Children++;
      }
    }
  }
      System.out.println(Adults);
      System.out.println("Number of children :");
      System.out.println(Children);


      System.out.println("Oldest guest is :");
      for( int row =1; row < guestList.length; row++){
        for(int row2 =0; row2 < guestList.length; row2++){
          if(guestList[row][1] != ""){
          if( guestList[row2][1] != ""){
            int Age = Integer.parseInt(guestList[row][1]);
            int Age2 = Integer.parseInt(guestList[row2][1]);
            if(Age > Age2){
              Oldest = Age;
            }
            }
            }
          }
        }


      System.out.println(Oldest);

      System.out.println("Youngest guest is :");
      for(int row =1; row < guestList.length; row++){
        for(int row2= 0 ; row2 < guestList.length; row2++){
          if( guestList[row2][1] != ""){
            if(guestList[row][1] != ""){
            int Age = Integer.parseInt(guestList[row][1]);
            int Age2 =Integer.parseInt(guestList[row2][1]);
            if(Age < Age2){
              Youngest = Age;
            }

       }
      }
    }
  }

      System.out.println(Youngest);*/
    }
// this method will allow us to add guests
public static void AddGuest(){
        Scanner input =new Scanner(System.in);
          System.out.println("Please enter the guests name below :");
          String Name = input.nextLine();
          System.out.println("Please enter the guests age below :");
          String Age = input.nextLine();
          for(int i=0; i <guestList.length; i++){
            if((guestList[i][0]=="") || (guestList[i][1]=="")){
              guestList[i][0] = Name;
              guestList[i][1] = Age;
              System.out.println("You have added :"+ Name);
              break;
            }
          }
        }




// a method to change a guests name inside the array
public static void ChangeName(){
      Scanner input = new Scanner(System.in);
      for(int row= 0; row < guestList.length; row++){
        if((guestList[row][0] != "")&& (guestList[row][1] !="")) {
          System.out.println(guestList[row][0] +" , " +guestList[row][1]);
    }
  }
  System.out.println("Enter the guests name that you'd like to change :");
  String Name = input.nextLine();
  for(int row = 0; row < guestList.length; row++){
    if(Name.equals(guestList[row][0])){
    System.out.println("Guest found");
    System.out.println("Enter the new name : ");
    String newName = input.nextLine();
    guestList[row][0] = newName;
    System.out.println("Name changed !");
    break;
  }

  }

          }

public static void ChangeAge(){
  Scanner input = new Scanner(System.in);
  for(int row= 0; row < guestList.length; row++){
    if((guestList[row][0] != "")&& (guestList[row][1] !="")) {
      System.out.println(guestList[row][0] +" , " +guestList[row][1]);
}
}
  System.out.println("Please enter the guest's name that you would like to change his/her age :");
  String Name = input.nextLine();
  for(int row = 0; row < guestList.length; row++){
    if(Name.equals(guestList[row][0])){
    System.out.println("Guest found");
    System.out.println("Enter the new age : ");
    String NewAge =input.nextLine();
    guestList[row][1] = NewAge;
    System.out.println("Age changed successfully !");
    break;
  }
}



}

public static void ChangePlace(){
  Scanner input = new Scanner(System.in);
  int place =0;
  System.out.print("Please enter the guest's name that you'd like to chang his/her posetion :");
  String Name = input.nextLine();
  for(int row = 0; row < guestList.length; row++){
    if(Name.equals(guestList[row][0])){
    System.out.println("Guest found");
    System.out.println("Please write where you want to move your guest :");
    place = input.nextInt();
    String Age = guestList[row][1];
    Name = guestList[row][0];
    String guest2Name =guestList[place-1][0];
    String guest2Age = guestList[place-1][1];
    guestList[row][0] = guest2Name;
    guestList[row][1] =guest2Age;
    guestList[place-1][0]= Name;
    guestList[place-1][1]= Age;
    System.out.println(Name +" is now moved to place "+place+" in the list");
    break;

          }
    }

}


public static void DeleteGuest(){
  Scanner input = new Scanner(System.in);
  System.out.println("Please enter the guest's name that you would like to erase :");
    String Name = input.nextLine();
    for(int row = 0; row < guestList.length; row++){
      if(Name.equals(guestList[row][0])){
        guestList[row][0] = "";
        guestList[row][1] = "";
        break;
          }
        }

  System.out.println(Name+" is now deleted ");

}
}
