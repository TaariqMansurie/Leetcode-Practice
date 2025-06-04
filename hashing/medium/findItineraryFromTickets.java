package hashing.medium;
import java.util.*; 

public class findItineraryFromTickets {
    public static String getStart(HashMap<String,String> tickets){
        HashMap<String,String> revMap = new HashMap<>();

        for(String key: tickets.keySet()){ //small syntax to iterate through ticekts
             //og map's value will be key here and key will be value here
            revMap.put(tickets.get(key),key);
        }
        System.out.println("Reverse of tickets set" +revMap);
        //now since map is reversed, we will find out the starting of it i.e. it should be in from posn but not in to posn. (should be in tickets but not revMap)
        for(String key: tickets.keySet()){ // which exists in ticket 
            if(!revMap.containsKey(key)){ // but not in revMap
                return key; //starting point --> mumbai will be returned
            }
        }

        return null;
    }

    public static void main(String[] args) {
        HashMap<String, String> tickets = new HashMap<>();
        tickets.put("Chennai","Bengaluru");
        tickets.put("Mumbai","Delhi");
        tickets.put("Goa","Chennai");
        tickets.put("Delhi","Goa");
        System.out.println("Initial Tickets: " +tickets);
        //t ofind the starting point
        //call getStart function
        String start = getStart(tickets);
        //we will print we are at the starting point
        System.out.print(start);
        //loping through ticekts
        for (String key : tickets.keySet()) {
            System.out.print(" -> "+tickets.get(start));
            start = tickets.get(start);
        }
    }    
}

