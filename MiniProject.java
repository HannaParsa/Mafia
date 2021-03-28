import java.util.Scanner;
public class MiniProject {
    public static boolean nameFound = false ;
    public static int num = 0 ;
    public static boolean isMafia = false ;
    public static boolean isVillager = false ;
    public static boolean isNight = false ;
    public static String isKilled = null ;
    public static String isTriedToBeKilled = null ;
    public static String isSaved = null ;
    public static String isSilent = null ;
    public static String isGodFather = null ;
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
        for (int i = 0; i < playersNum - 1; i++)//khone aval space hast pas pak mikonimesh
             playersName[i] = playersName[i + 1];
             playersNum--;
             playersNewName= new String[ playersNum];//array jadid dige khone khali nadare
             playersNewName=playersName;
        gameIsCreated = true;
        return playersNewName;
    }
    public static void assign_role ( ) {
         String enteredName = scanner.next();
        String enteredRole = scanner.next();
        if (gameIsCreated == false )
            System.out.println("no game created");
            else {
                if ( enteredRole.equals("mafia")){
                    for (String name : playersNewName){
                        if (enteredName.equals(name)) {
                            players[num] = new Mafia(enteredName, enteredRole);
                            num++;
                            nameFound = true ;
                            break;
                        }
                        else nameFound = false ;
                    }
                    if ( nameFound == false )
                        System.out.println("user not found");
                }
                    else if (enteredRole.equals("villager")){
                    for (String name : playersNewName){
                        if (enteredName.equals(name)) {
                            players[num] = new Villager(enteredName, enteredRole);
                            num++;
                            nameFound = true ;
                            break;
                        }
                        else nameFound = false ;
                    }
                    if ( nameFound == false )
                        System.out.println("user not found");
                }
                        else if (enteredRole.equals("doctor")){
                    for (String name : playersNewName){
                        if (enteredName.equals(name)) {
                            players[num] = new Doctor(enteredName, enteredRole);
                            num++;
                            nameFound = true ;
                            break;
                        }
                        else nameFound = false ;
                    }
                    if ( nameFound == false )
                        System.out.println("user not found");
                }
                            else if (enteredRole.equals("detective")){
                    for (String name : playersNewName){
                        if (enteredName.equals(name)) {
                            players[num] = new Detective(enteredName, enteredRole);
                            num++;
                            nameFound = true ;
                            break;
                        }
                        else nameFound = false ;
                    }
                    if ( nameFound == false )
                        System.out.println("user not found");
                }
                                else if (enteredRole.equals("bulletproof")){
                    for (String name : playersNewName){
                        if (enteredName.equals(name)) {
                            players[num] = new Bullerprof(enteredName, enteredRole);
                            num++;
                            nameFound = true ;
                            break;
                        }
                        else nameFound = false ;
                    }
                    if ( nameFound == false )
                        System.out.println("user not found");
                }
                                    else if (enteredRole.equals("silencer")){
                    for (String name : playersNewName){
                        if (enteredName.equals(name)) {
                            players[num] = new Silencer(enteredName, enteredRole);
                            num++;
                            nameFound = true ;
                            break;
                        }
                        else nameFound = false ;
                    }
                    if ( nameFound == false )
                        System.out.println("user not found");
                }
                                        else if (enteredRole.equals("joker")){
                    for (String name : playersNewName){
                        if (enteredName.equals(name)) {
                            players[num] = new Joker(enteredName, enteredRole);
                            num++;
                            nameFound = true ;
                            break;
                        }
                        else nameFound = false ;
                    }
                    if ( nameFound == false )
                        System.out.println("user not found");
                }
                                            else if(enteredRole.equals("godfather")){
                    for (String name : playersNewName){
                        if (enteredName.equals(name)) {
                            players[num] = new GodFather(enteredName, enteredRole);
                            num++;
                            nameFound = true ;
                            break;
                        }
                        else nameFound = false ;
                    }
                    if ( nameFound == false )
                        System.out.println("user not found");
                }
                                            else System.out.println("role not found");
        }
            }
    public static void main ( String [] arg){
        String comment = scanner.next();
        while(true){
            switch(comment){
                case"create_game":  System.out.println("enter the names to start the game");create_game() ;
                    System.out.println("the game has begun");
                break;
                case"assign_role":assign_role();break;
            }
        }
    }
}


