import java.io.*;
import java.util.*;

    




class Sports{ 
 
        String getName(){
            return "Generic Sports";
        }
      
        void getNumberOfTeamMembers(){
            System.out.println( "Each team has n players in " + getName() );
        }
    }




class Soccer extends Sports{
        @Override
        String getName(){
            return "Soccer Class";
        }

        void getNumberOfTeamMembers(){
            System.out.println( "Each team has 11 players in " + getName() );
        }

    }





public class javaOverridemethodwork {
        
        public static void main(String []args){
            
            Sports mySportsclass = new Sports();
            Soccer mySoccerclass = new Soccer();
            
            System.out.println(mySportsclass.getName());
            mySportsclass.getNumberOfTeamMembers();
            
            System.out.println(mySoccerclass.getName());
            mySoccerclass.getNumberOfTeamMembers();
        
           
        
        }
}
