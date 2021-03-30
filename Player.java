class Player {
    //parent class for roles in the game.
     String Name ;
     String Role ;
     public boolean beVoted = false ;
   public boolean isKilled = false ;
   //public boolean isTriedToBeKilled = false ;
   public boolean isSaved_byDoctor = false ;
   public boolean isSilent = false ;
   //public boolean isGodFather = false ;
   public int VotedNum = 0 ;
     public Player(String Name , String Role ) {
         this.Name = Name;
         this.Role=Role;
     }
     public Player ( String Name ){
         this.Name = Name;
     }
  }


