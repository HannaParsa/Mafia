class Player {
    //parent class for roles in the game.
     String Name ;
     String Role ;
     public boolean is_saved_is_bulletproof = false ;
     public boolean is_silence_now = false ;
     public boolean beVoted = false ;
   public boolean isKilled = false ;
   public boolean isSaved_byDoctor = false ;
   public boolean isSilent = false ;
   public boolean lost_extraLife = false ;
   public int VotedNum = 0 ;
   public boolean alive_byDoctor = false ;
     public Player(String Name , String Role ) {
         this.Name = Name;
         this.Role=Role;
     }
     public Player ( String Name ){
         this.Name = Name;
     }
  }

