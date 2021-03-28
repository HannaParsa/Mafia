import java.util.Scanner;
public class MiniProject {
    public static  int DayNum = 0 ;
    public static boolean nameFound_votee = false ;
    public static String voter_name = null;
    public static String votee_name = null;
    public static boolean nameFound = false ;
    //public static boolean isMafia = false ;
    //public static boolean isVillager = false ;
    public static boolean isNight = false ;
    //public static String isKilled = null ;
    //public static String isTriedToBeKilled = null ;
    //public static String isSaved = null ;
    //public static String isSilent = null ;
    //public static boolean isSilencer = false ;
    //public static String isGodFather = null ;
    static Scanner scanner = new Scanner(System.in);
    public static int playersNum = 0 ;
    public static boolean gameIsStarted = false ;
    public static boolean gameIsCreated = false ;
    public static String [] playersName = null ;
    public static Player [] players = null ;
    public static String [] playersNewName = null ;
    public static String [] create_game () {
        String nameList = scanner.nextLine();
        playersName = nameList.split(" ");
        playersNum = playersName.length;
        for (int i = 0; i < playersNum - 1; i++)//khone aval space hast pas pak mikonimesh.
             playersName[i] = playersName[i + 1];
             playersNum--;
             playersNewName= new String[ playersNum];//array jadid dige khone khali nadare.
             playersNewName=playersName;
        gameIsCreated = true;
        players=new Player[playersNum];
        return playersNewName;
    }
    public static void assign_role ( ) { //naghsh haro dade va sheye dorost karde bara har naghsh.
         String enteredName = scanner.next();
        String enteredRole = scanner.next();
        if (gameIsCreated == false ) {
            System.out.println("no game created");
            System.out.println("please create the games first");
        }
            else {
                if ( enteredRole.equals("mafia")){
                    for (int i = 0 ; i < playersNum ; i ++){
                        if (enteredName.equals(playersName[i])) {
                            players[i] = new Mafia(enteredName, enteredRole);
                            nameFound = true ;
                            break;
                        }
                        else nameFound = false ;
                    }
                    if ( nameFound == false ) {
                        System.out.println("user not found");
                        System.out.println("please enter the right name");
                    }
                }
                    else if (enteredRole.equals("villager")){
                    for (int i = 0 ; i < playersNum ; i ++){
                        if (enteredName.equals(playersName[i])) {
                            players[i] = new Villager(enteredName, enteredRole);
                            nameFound = true ;
                            break;
                        }
                        else nameFound = false ;
                    }
                    if ( nameFound == false ) {
                        System.out.println("user not found");
                        System.out.println("please enter the right name");
                    }
                }
                        else if (enteredRole.equals("doctor")){
                    for (int i = 0 ; i < playersNum ; i ++){
                        if (enteredName.equals(playersName[i])) {
                            players[i] = new Doctor(enteredName, enteredRole);
                            nameFound = true ;
                            break;
                        }
                        else nameFound = false ;
                    }
                    if ( nameFound == false ) {
                        System.out.println("user not found");
                        System.out.println("please enter the right name");
                    }
                }
                            else if (enteredRole.equals("detective")){
                    for (int i = 0 ; i < playersNum ; i ++){
                        if (enteredName.equals(playersName[i])) {
                            players[i] = new Detective(enteredName, enteredRole);
                            nameFound = true ;
                            break;
                        }
                        else nameFound = false ;
                    }
                    if ( nameFound == false ) {
                        System.out.println("user not found");
                        System.out.println("please enter the right name");
                    }
                }
                                else if (enteredRole.equals("bulletproof")){
                    for (int i = 0 ; i < playersNum ; i ++){
                        if (enteredName.equals(playersName[i])) {
                            players[i] = new Bulletproof(enteredName, enteredRole);
                            nameFound = true ;
                            break;
                        }
                        else nameFound = false ;
                    }
                    if ( nameFound == false ) {
                        System.out.println("user not found");
                        System.out.println("please enter the right name");
                    }
                }
                                    else if (enteredRole.equals("silencer")){
                    for (int i = 0 ; i < playersNum ; i ++){
                        if (enteredName.equals(playersName[i])) {
                            players[i] = new Silencer(enteredName, enteredRole);
                            nameFound = true ;
                            break;
                        }
                        else nameFound = false ;
                    }
                    if ( nameFound == false ) {
                        System.out.println("user not found");
                        System.out.println("please enter the right name");
                    }
                }
                                        else if (enteredRole.equals("joker")){
                    for (int i = 0 ; i < playersNum ; i ++){
                        if (enteredName.equals(playersName[i])) {
                            players[i] = new Joker(enteredName, enteredRole);
                            nameFound = true ;
                            break;
                        }
                        else nameFound = false ;
                    }
                    if ( nameFound == false ) {
                        System.out.println("user not found");
                        System.out.println("please enter the right name");
                    }
                }
                                            else if(enteredRole.equals("godfather")){
                    for (int i = 0 ; i < playersNum ; i ++){
                        if (enteredName.equals(playersName[i])) {
                            players[i] = new GodFather(enteredName, enteredRole);
                            nameFound = true ;
                            break;
                        }
                        else nameFound = false ;
                    }
                    if ( nameFound == false ) {
                        System.out.println("user not found");
                        System.out.println("please enter the right name");
                    }
                }
                                            else {
                    System.out.println("role not found");
                    System.out.println("please enter the right rol");
                }
        }
            nameFound = false ;
            }
            public static void playesr_list() {
         if ( gameIsStarted == true )
            System.out.println("game has already started");
          else if ( gameIsCreated == false ) {
             System.out.println("no game created");
             System.out.println("please create the game at first");
         }
          else {
              for ( int i = 0 ; i< playersNum ; i ++){
                  if(players[i].Role.equals("mafia"))
                      System.out.println(playersNewName[i] + ": mafia" );
                  else if (players[i].Role.equals("villager"))
                      System.out.println(playersNewName[i] + ": villager" );
                  else if (players[i].Role.equals("doctor"))
                      System.out.println(playersNewName[i] + ": doctor" );
                  else if (players[i].Role.equals("bulletproof"))
                      System.out.println(playersNewName[i] + ": bulletproof" );
                  else if (players[i].Role.equals("detective"))
                      System.out.println(playersNewName[i] + ": detective" );
                  else if (players[i].Role.equals("silencer"))
                      System.out.println(playersNewName[i] + ": silencer" );
                  else if (players[i].Role.equals("godfather"))
                      System.out.println(playersNewName[i] + ": godfather" );
                  else if (players[i].Role.equals("joker"))
                      System.out.println(playersNewName[i] + ": joker" );
                  else
                      System.out.println("one or more player do not have a role");
              }
              isNight=false;
              gameIsStarted = true ;
         }
            }
            public static void announcement_of_day(){
              if (isNight==false)
                  DayNum++;
                  System.out.println("Day " + DayNum);
            }
            public static void vote () {
              voter_name = scanner.next();
              votee_name = scanner.next();
             for ( int i = 0 ; i <playersNum ; i ++ ) {
                 if ( voter_name.equals(playersNewName[i])){
                     nameFound = true ;
                     for ( int j = 0 ; j < playersNum ; j ++ ){
                         if ( votee_name.equals(playersNewName[j])){
                             nameFound_votee = true ;
                             if(players[i].Role.equals("silencer"))
                             System.out.println("voter is silence");
                             else if (players[j].isKilled == true )
                                 System.out.println("votee already dead");
                         }
                         else nameFound_votee = false ;
                     }
                     if ( nameFound_votee == false )
                         System.out.println("user not found");
                 }
                 else nameFound = false ;
             }
             if (nameFound == false )
                 System.out.println("user not found");
            }

    public static void main ( String [] arg){
        while(true){
            String comment = scanner.next();
            switch(comment){
                case"create_game":  System.out.println("entered names will be the competitors");create_game() ;
                    System.out.println("the game has begun");
                break;
                case"assign_role":assign_role();break;
                case"start_game": playesr_list();announcement_of_day();
                System.out.println(" pleas enter the voter and voted name");
                vote();break;
            }
        }
    }
}


