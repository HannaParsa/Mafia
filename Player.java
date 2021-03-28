class Player {
    //parent class for roles in the game
     String Name ;
     String Role ;
   public boolean isKilled = false ;
   public boolean isTriedToBeKilled = false ;
   public boolean isSaved = false ;
   public boolean isSilent = false ;
   public boolean isGodFather = false ;
   public boolean hasVoted = false ; // only one vote is llegal ;
   public int VoteNum = 0 ;
     public Player(String Name , String Role ) {
         this.Name = Name;
         this.Role=Role;
     }
     public Player ( String Name ){
         this.Name = Name;
     }
     //public abstract void RoleAtNight (Player target );
  }
