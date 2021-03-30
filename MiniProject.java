import java.util.Scanner;
public class MiniProject {
    public static String max_beVoted_role = null;
    public static int has_same_voteNum = 0 ;
    public static String  max_beVoted =null;
    public static  int DayNum = 0 ;
    public static int NightNum = 0 ;
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
    public static Player [] players = null;
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
                  else {
                      System.out.println("one or more player do not have a role");
                      System.out.println("make sure everybody has a role ans try again");
                  }
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
        while (true) {
            voter_name = scanner.next();
            if (voter_name.equals("end_vote")){
                end_vote();
            }
            votee_name = scanner.next();
            Outer:
            for (int i = 0; i < playersNum; i++) {
                if (voter_name.equals(playersNewName[i])) {
                    nameFound = true;
                    for (int j = 0; j < playersNum; j++) {
                        if (votee_name.equals(playersNewName[j])) {
                            nameFound_votee = true;
                            if (players[i].Role.equals("silencer"))
                                System.out.println("voter is silence");
                            else if (players[j].isKilled == true)
                                System.out.println("votee already dead");
                            else {
                                players[j].beVoted = true;
                                players[j].VotedNum++;
                            }
                            break Outer;
                        } else nameFound_votee = false;
                    }
                    if (nameFound_votee == false)
                        System.out.println("user not found");
                } else nameFound = false;
            }
            if (nameFound == false)
                System.out.println("user not found");
        }
            }
            public static void announcment_nigh (){
        isNight = true ;
        NightNum ++ ;
        System.out.println("Night " + NightNum);
            }
            public static void end_vote(){
        int max_num_beVoted = 0 ;
            for ( int i = 0 ; i <playersNum ; i++){
              if (players[i].VotedNum > max_num_beVoted) {
                  max_num_beVoted=players[i].VotedNum;
                  max_beVoted = players[i].Name;
                  max_beVoted_role=players[i].Role;
              }
               else if (players[i].VotedNum == max_num_beVoted && max_num_beVoted>0 )
                    has_same_voteNum++;
            }
              if (has_same_voteNum > 0 ) {
                  System.out.println("nobody died");
                  announcment_nigh();
              }
              else if (max_beVoted_role.equals("joker")) {
                  System.out.println("Joker won!");
                  System.out.println("game is over now");
                  System.exit(1);
              }
             else
                 System.out.println(max_beVoted + " died");

             announcment_nigh();
            }
            //public static void night_list_name () {
             //for (int i = 0 ; i < playersNum ; i++){
                // if (players[i].isKilled == false ) {
                 //if (players[i].Role.equals("mafia"))
                    // System.out.println(players[i].Name +": " + players[i].Role);
                 //}
                // else if ()
             //}
            //}

    public static void main ( String [] arg){
        while(true){
            String comment = scanner.next();
            switch(comment){
                case"create_game":  System.out.println("entered names will be the competitors");create_game() ;
                    System.out.println("the game has begun");
                    System.out.println("please assign the roles");
                break;
                case"assign_role":assign_role();break;
                case"start_game": playesr_list();announcement_of_day();
                    System.out.println(" pleas enter the voter and voted name");
                vote();break;
            }
        }
    }
}


