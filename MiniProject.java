import java.util.Scanner;

public class MiniProject {
    public static int has_same_voteNum_atNigh = 0 ;
    public static int num_mafia = 0;
    public static int num_villager = 0;
    public static String first_player = null;
    public static String second_player = null;
    public static String max_beVoted_role = null;
    public static int has_same_voteNum = 0;
    public static String max_beVoted = null;
    public static int DayNum = 0;
    public static int NightNum = 0;
    public static boolean nameFound_votee = false;
    public static String voter_name = null;
    public static String votee_name = null;
    public static boolean nameFound = false;
    //public static boolean isMafia = false ;
    //public static boolean isVillager = false ;
    public static boolean isNight = false;
    //public static String isKilled = null ;
    //public static String isTriedToBeKilled = null ;
    //public static String isSaved = null ;
    //public static String isSilent = null ;
    //public static boolean isSilencer = false ;
    //public static String isGodFather = null ;
    static Scanner scanner = new Scanner(System.in);
    public static int playersNum = 0;
    public static boolean gameIsStarted = false;
    public static boolean gameIsCreated = false;
    public static String[] playersName = null;
    public static Player[] players = null;
    public static String[] playersNewName = null;

    public static String[] create_game() {
        String nameList = scanner.nextLine();
        playersName = nameList.split(" ");
        playersNum = playersName.length;
        for (int i = 0; i < playersNum - 1; i++)//khone aval space hast pas pak mikonimesh.
            playersName[i] = playersName[i + 1];
        playersNum--;
        playersNewName = new String[playersNum];//array jadid dige khone khali nadare.
        playersNewName = playersName;
        gameIsCreated = true;
        players = new Player[playersNum];
        return playersNewName;
    }

    public static void assign_role() { //naghsh haro dade va sheye dorost karde bara har naghsh.
        String enteredName = scanner.next();
        String enteredRole = scanner.next();
        if (gameIsCreated == false) {
            System.out.println("no game created");
            System.out.println("please create the games first");
        } else {
            if (enteredRole.equals("mafia")) {
                for (int i = 0; i < playersNum; i++) {
                    if (enteredName.equals(playersName[i])) {
                        players[i] = new Mafia(enteredName, enteredRole);
                        num_mafia++;
                        nameFound = true;
                        break;
                    } else nameFound = false;
                }
                if (nameFound == false) {
                    System.out.println("user not found");
                    System.out.println("please enter the right name");
                }
            } else if (enteredRole.equals("villager")) {
                for (int i = 0; i < playersNum; i++) {
                    if (enteredName.equals(playersName[i])) {
                        players[i] = new Villager(enteredName, enteredRole);
                        num_villager++;
                        nameFound = true;
                        break;
                    } else nameFound = false;
                }
                if (nameFound == false) {
                    System.out.println("user not found");
                    System.out.println("please enter the right name");
                }
            } else if (enteredRole.equals("doctor")) {
                for (int i = 0; i < playersNum; i++) {
                    if (enteredName.equals(playersName[i])) {
                        players[i] = new Doctor(enteredName, enteredRole);
                        num_villager++;
                        nameFound = true;
                        break;
                    } else nameFound = false;
                }
                if (nameFound == false) {
                    System.out.println("user not found");
                    System.out.println("please enter the right name");
                }
            } else if (enteredRole.equals("detective")) {
                for (int i = 0; i < playersNum; i++) {
                    if (enteredName.equals(playersName[i])) {
                        players[i] = new Detective(enteredName, enteredRole);
                        num_villager++;
                        nameFound = true;
                        break;
                    } else nameFound = false;
                }
                if (nameFound == false) {
                    System.out.println("user not found");
                    System.out.println("please enter the right name");
                }
            } else if (enteredRole.equals("bulletproof")) {
                for (int i = 0; i < playersNum; i++) {
                    if (enteredName.equals(playersName[i])) {
                        players[i] = new Bulletproof(enteredName, enteredRole);
                        num_villager++;
                        nameFound = true;
                        break;
                    } else nameFound = false;
                }
                if (nameFound == false) {
                    System.out.println("user not found");
                    System.out.println("please enter the right name");
                }
            } else if (enteredRole.equals("silencer")) {
                for (int i = 0; i < playersNum; i++) {
                    if (enteredName.equals(playersName[i])) {
                        players[i] = new Silencer(enteredName, enteredRole);
                        num_mafia++;
                        nameFound = true;
                        break;
                    } else nameFound = false;
                }
                if (nameFound == false) {
                    System.out.println("user not found");
                    System.out.println("please enter the right name");
                }
            } else if (enteredRole.equals("joker")) {
                for (int i = 0; i < playersNum; i++) {
                    if (enteredName.equals(playersName[i])) {
                        players[i] = new Joker(enteredName, enteredRole);
                        nameFound = true;
                        break;
                    } else nameFound = false;
                }
                if (nameFound == false) {
                    System.out.println("user not found");
                    System.out.println("please enter the right name");
                }
            } else if (enteredRole.equals("godfather")) {
                for (int i = 0; i < playersNum; i++) {
                    if (enteredName.equals(playersName[i])) {
                        players[i] = new GodFather(enteredName, enteredRole);
                        num_mafia++;
                        nameFound = true;
                        break;
                    } else nameFound = false;
                }
                if (nameFound == false) {
                    System.out.println("user not found");
                    System.out.println("please enter the right name");
                }
            } else {
                System.out.println("role not found");
                System.out.println("please enter the right rol");
            }
        }
        nameFound = false;
    }

    public static void playesr_list() {
        if (gameIsStarted == true)
            System.out.println("game has already started");
        else if (gameIsCreated == false) {
            System.out.println("no game created");
            System.out.println("please create the game at first");
        } else {
            for (int i = 0; i < playersNum; i++) {
                if (players[i].Role.equals("mafia"))
                    System.out.println(playersNewName[i] + ": mafia");
                else if (players[i].Role.equals("villager"))
                    System.out.println(playersNewName[i] + ": villager");
                else if (players[i].Role.equals("doctor"))
                    System.out.println(playersNewName[i] + ": doctor");
                else if (players[i].Role.equals("bulletproof"))
                    System.out.println(playersNewName[i] + ": bulletproof");
                else if (players[i].Role.equals("detective"))
                    System.out.println(playersNewName[i] + ": detective");
                else if (players[i].Role.equals("silencer"))
                    System.out.println(playersNewName[i] + ": silencer");
                else if (players[i].Role.equals("godfather"))
                    System.out.println(playersNewName[i] + ": godfather");
                else if (players[i].Role.equals("joker"))
                    System.out.println(playersNewName[i] + ": joker");
                else {
                    System.out.println("one or more player do not have a role");
                    System.out.println("make sure everybody has a role ans try again");
                }
            }
            isNight = false;
            gameIsStarted = true;
        }
    }

    public static void announcement_of_day() {
        if (isNight == false)
            DayNum++;
        System.out.println("Day " + DayNum);
    }

    public static void vote() {
        while (true) {
            voter_name = scanner.next();
            if (voter_name.equals("end_vote")) {
                end_vote();
                return;
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

    public static void announcment_nigh() {
        isNight = true;
        NightNum++;
        System.out.println("Night " + NightNum);
    }

    public static void end_vote() {
        Player is_killed = null;
        int max_num_beVoted = 0;
        for (int i = 0; i < playersNum; i++) {
            if (players[i].VotedNum > max_num_beVoted) {
                max_num_beVoted = players[i].VotedNum;
                max_beVoted = players[i].Name;
                max_beVoted_role = players[i].Role;
                is_killed = players[i];
            } else if (players[i].VotedNum == max_num_beVoted && max_num_beVoted > 0)
                has_same_voteNum++;
        }
        if (has_same_voteNum > 0) {
            System.out.println("nobody died");
            for (int i = 0; i < playersNum; i++)
                players[i].VotedNum = 0;
            has_same_voteNum = 0;
            announcment_nigh();
            night_list_name();
            nigh_duty();
        } else if (max_beVoted_role.equals("joker")) {
            System.out.println("Joker won!");
            System.out.println("game is over now");
            System.exit(1);
        } else {
            System.out.println(max_beVoted + " died");
            if (is_killed.Role.equals("mafia") || is_killed.Role.equals("godfather") || is_killed.Role.equals("silencer"))
                num_mafia--;
            else if (is_killed.Role.equals("doctor") || is_killed.Role.equals("detective") || is_killed.Role.equals("bulletproof") || is_killed.Role.equals("villager"))
                num_villager--;
            is_killed.isKilled = true;
            for (int i = 0; i < playersNum; i++)
                players[i].VotedNum = 0;
            has_same_voteNum = 0;
            announcment_nigh();
            night_list_name();
            nigh_duty();
        }

    }

    public static void night_list_name() {
        for (int i = 0; i < playersNum; i++) {
            if (players[i].isKilled == false) {
                if (players[i].Role.equals("mafia"))
                    System.out.println(players[i].Name + ": " + players[i].Role);
                else if (players[i].Role.equals("doctor"))
                    System.out.println(players[i].Name + ": " + players[i].Role);
                else if (players[i].Role.equals("detective"))
                    System.out.println(players[i].Name + ": " + players[i].Role);
                else if (players[i].Role.equals("godfather"))
                    System.out.println(players[i].Name + ": " + players[i].Role);
                else if (players[i].Role.equals("silencer"))
                    System.out.println(players[i].Name + ": " + players[i].Role);
            }
        }
    }

    public static void nigh_duty() {
        boolean isSilencerSilentAnyone = false;
        System.out.println("please enter the voter and votee name for night");
        while (true) {
            first_player = scanner.next();
            if (first_player.equals("end_night")) {
                vote_atNight();
                return ;
            }
            second_player = scanner.next();
            for (int i = 0; i < playersNum; i++) {
                if (first_player.equals(players[i].Name)) {
                    nameFound = true;
                    if (players[i].isKilled == true)
                        System.out.println("user is dead");
                    else {
                        if (players[i].Role.equals("mafia")) {
                            for (int j = 0; j < playersNum; j++) {
                                if (second_player.equals(players[j].Name)) {
                                    nameFound_votee = true;
                                    if (players[j].isKilled == true)
                                        System.out.println("votee already dead");
                                    else {
                                        players[j].VotedNum++;
                                    }
                                    break;
                                } else nameFound_votee = false;
                            }
                            if (nameFound_votee == false)
                                System.out.println("user not joined");
                        } else if (players[i].Role.equals("doctor")) {
                            for (int j = 0; j < playersNum; j++) {
                                if (second_player.equals(players[j].Name)) {
                                    nameFound_votee = true;
                                    if (players[j].isKilled == true)
                                        System.out.println("votee already dead");
                                    else {
                                        players[j].isSaved_byDoctor = true;
                                    }
                                    break;
                                } else nameFound_votee = false;
                            }
                            if (nameFound_votee == false)
                                System.out.println("user not joined");
                        } else if (players[i].Role.equals("detective")) {
                            for (int j = 0; j < playersNum; j++) {
                                if (second_player.equals(players[j].Name)) {
                                    nameFound_votee = true;
                                    if (players[j].isKilled == true)
                                        System.out.println("suspect is dead");
                                    else {
                                        if (players[j].Role.equals("mafia"))
                                            System.out.println("Yes");
                                        else if (players[j].Role.equals("silencer"))
                                            System.out.println("Yes");
                                        else
                                            System.out.println("No");
                                    }
                                    break;
                                } else nameFound_votee = false;
                            }
                            if (nameFound_votee == false)
                                System.out.println("user not joined");
                        } else if (players[i].Role.equals("godfather")) {
                            for (int j = 0; j < playersNum; j++) {
                                if (second_player.equals(players[j].Name)) {
                                    nameFound_votee = true;
                                    if (players[j].isKilled == true)
                                        System.out.println("votee already dead");
                                    else {
                                        players[j].VotedNum++;
                                    }
                                    break;
                                } else nameFound_votee = false;
                            }
                            if (nameFound_votee == false)
                                System.out.println("user not joined");
                        } else if (players[i].Role.equals("silencer")) {
                            for (int j = 0; j < playersNum; j++) {
                                if (second_player.equals(players[j].Name)) {
                                    nameFound_votee = true;
                                    if (players[j].isKilled == true)
                                        System.out.println("votee is already dead");
                                    else {
                                        if (!isSilencerSilentAnyone) {
                                            players[j].isSilent = true;
                                            isSilencerSilentAnyone = true;
                                        }
                                        else{
                                            players[j].VotedNum++;
                                        }
                                    }
                                    break;
                                } else nameFound_votee = false;
                            }
                            if (nameFound_votee == false)
                                System.out.println("user not joined");
                        } else System.out.println("user can not wake up during night");

                    }
                }
            }
            if (nameFound == false)
                System.out.println("user not joined");
        }
    }

    public static void get_game_state() {
        System.out.println("Mafia = " + num_mafia);
        System.out.println("Villager = " + num_villager);
    }
    public static void vote_atNight () {
        announcement_of_day();
        int same_vote_num [] = new int [2] ;
        int max_num_voted_atNight = 0 ;
        Player is_killed_atNight = null;
        for (int i = 0 ; i < playersNum ; i ++) {
            if (players[i].VotedNum > max_num_voted_atNight) {
                max_num_voted_atNight = players[i].VotedNum;
                max_beVoted = players[i].Name;
                max_beVoted_role = players[i].Role;
                if (players[i].isSaved_byDoctor == true )
                players[i].alive_byDoctor= true ;
                else if (players[i].Role.equals("bulletproof"))
                    players[i].lost_extraLife = true ;
                else if (players[i].isSilent == true)
                    players[i].is_silence_now = true ;
                else
                    is_killed_atNight = players[i];
            }
            else if (players[i].VotedNum == max_num_voted_atNight && max_num_voted_atNight > 0)
                has_same_voteNum_atNigh++;
        }
         if (has_same_voteNum == 2 ){
             int j = 0 ;
             for (int i = 0 ; i < playersNum ; i++){
                 if (players[i].VotedNum == max_num_voted_atNight ){
                     same_vote_num[j] = i ;
                     j ++ ;
                 }
         }
        }
          if (has_same_voteNum_atNigh == 1 ){
             if (players[same_vote_num[0]].isSaved_byDoctor == true && players[same_vote_num[1]].isSaved_byDoctor == false ) {
                 System.out.println(players[same_vote_num[1]].Name + "was killed");
                 System.out.println("Mafia tried to kill " +players[same_vote_num[0]].Name );
                 if (players[same_vote_num[1]].Role.equals("doctor") || players[same_vote_num[1]].Role.equals("detective") || players[same_vote_num[1]].Role.equals("bulletproof")|| players[same_vote_num[0]].Role.equals("villager"))
                 num_villager--;
                 else if (players[same_vote_num[1]].Role.equals("mafia") || players[same_vote_num[1]].Role.equals("godfather") || players[same_vote_num[1]].Role.equals("silencer"))
                     num_mafia--;
             }
             else if (players[same_vote_num[0]].isSaved_byDoctor == false && players[same_vote_num[1]].isSaved_byDoctor == true ) {
                 System.out.println(players[same_vote_num[0]].Name + "was killed");
                 System.out.println("Mafia tried to kill " +players[same_vote_num[1]].Name );
                 if (players[same_vote_num[0]].Role.equals("doctor") || players[same_vote_num[0]].Role.equals("detective") || players[same_vote_num[0]].Role.equals("bulletproof")|| players[same_vote_num[0]].Role.equals("villager"))
                     num_villager--;
                 else if (players[same_vote_num[0]].Role.equals("mafia") || players[same_vote_num[0]].Role.equals("godfather") || players[same_vote_num[0]].Role.equals("silencer"))
                     num_mafia--;
             }
             else if (players[same_vote_num[0]].lost_extraLife == false && players[same_vote_num[1]].lost_extraLife == true){
                 System.out.println(players[same_vote_num[0]].Name + "was killed");
                 System.out.println("Mafia tried to kill " +players[same_vote_num[1]].Name );
                 if (players[same_vote_num[0]].Role.equals("doctor") || players[same_vote_num[0]].Role.equals("detective") || players[same_vote_num[0]].Role.equals("bulletproof")|| players[same_vote_num[0]].Role.equals("villager"))
                     num_villager--;
                 else if (players[same_vote_num[0]].Role.equals("mafia") || players[same_vote_num[0]].Role.equals("godfather") || players[same_vote_num[0]].Role.equals("silencer"))
                     num_mafia--;
             }
             else if (players[same_vote_num[0]].lost_extraLife == true && players[same_vote_num[1]].lost_extraLife == false){
                 System.out.println(players[same_vote_num[1]].Name + "was killed");
                 System.out.println("Mafia tried to kill " +players[same_vote_num[0]].Name );
                 if (players[same_vote_num[0]].Role.equals("doctor") || players[same_vote_num[0]].Role.equals("detective") || players[same_vote_num[0]].Role.equals("bulletproof")|| players[same_vote_num[0]].Role.equals("villager"))
                     num_villager--;
                 else if (players[same_vote_num[0]].Role.equals("mafia") || players[same_vote_num[0]].Role.equals("godfather") || players[same_vote_num[0]].Role.equals("silencer"))
                     num_mafia--;
             }
         }
         else if (has_same_voteNum_atNigh == 0 ) {
             System.out.println(is_killed_atNight.Name + "was killed");
               if (is_killed_atNight.Role.equals("doctor") || is_killed_atNight.Role.equals("detective") || is_killed_atNight.Role.equals("bulletproof")||is_killed_atNight.Role.equals("villager"))
                   num_villager--;
               else if (is_killed_atNight.Role.equals("mafia") || is_killed_atNight.Role.equals("godfather") || is_killed_atNight.Role.equals("silencer"))
                   num_mafia--;
         }
         else
              System.out.println("nobody died");
         if (num_villager<= num_mafia ) {
             System.out.println("Mafia won");
             System.exit(1);
         }
         else if (num_mafia < num_villager ) {
             System.out.println("Villager won");
             System.exit(1);
         }
         else  {
             has_same_voteNum_atNigh = 0 ;
             for (int i = 0 ; i <playersNum ; i ++)
                 players[i].VotedNum = 0 ;
             //to continue the game
             System.out.println("enter the voter and votee name fon day");
             vote();
         }
    }

    public static void main(String[] arg) {
        while (true) {
            String comment = scanner.next();
            switch (comment) {
                case "create_game":
                    System.out.println("entered names will be the competitors");
                    create_game();
                    System.out.println("the game has begun");
                    System.out.println("please assign the roles");
                    break;
                case "assign_role":
                    assign_role();
                    break;
                case "start_game":
                    playesr_list();
                    announcement_of_day();
                    System.out.println(" pleas enter the voter and voted name");
                    vote();
                    break;
                case "get_game_state":
                    get_game_state();
                    break;
            }
        }
    }
}


