/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flightschedulingsystem;

/**
 *
 * @author Rabbiya Shaikh
 */
public class Link {
     int flightNo; 
     String source; 
     String destination; 
     String HaltStation;
     String Airline;
     int arrivalHour; 
    int arrivalMinutes;   
    int departurehour;
    int departureMinute;
    int halthour;
    int haltMinute;
    
     
     Link next;
     // ------------------------------------------------------------- 
     public Link(int flightNo,String source,String destination,String Airline,String HaltStation,int arrivalHour,int arrivalMinutes,int departurehour,int departureMinute,int halthour,int haltMinute) 
     {
      this.flightNo=flightNo;
     this.source=source; 
     this.destination=destination;
     this.HaltStation=HaltStation;
     this.Airline=Airline;
     
     this.arrivalHour=arrivalHour;
     this.departurehour=departurehour;
     this.halthour=halthour;
     this.arrivalMinutes=arrivalMinutes;
     this.departureMinute=departureMinute;
     this.haltMinute=haltMinute;
    
     }

   public void set(int flightNo,String source,String destination,String Airline,String HaltStation,int arrivalHour,int arrivalMinutes,int departurehour,int departureMinute,int halthour,int haltMinute,int totalDuration) 
     {
       this.flightNo=flightNo;
     this.source=source; 
     this.destination=destination;
     this.HaltStation=HaltStation;
     this.arrivalHour=arrivalHour;
     this.departurehour=departurehour;
     this.halthour=halthour;
     this.arrivalMinutes=arrivalMinutes;
     this.departureMinute=departureMinute;
     this.haltMinute=haltMinute;
     
       this.Airline=Airline;
   }
   public int getFlightNo()
   {
       return flightNo; 
   }
    public String getSource()
    {
     return source; 
    }
    public String getDestination()
    {
     return destination; 
    }
    public String getHaltStation()
    {
     return HaltStation;
    }
     public String getAirline()
    {
     return Airline; 
    }
    public int getarrivalHour()
    {
        
     return arrivalHour;
    }
    public int getDeparturehour()
    {
     return departurehour;
    }
    public int getHalthour()
    {
     return halthour;
    } public int getarrivalMinutes()
    {
        
     return arrivalMinutes;
    }
    public int getDepartureMinute()
    {
     return departureMinute;
    }
    public int getHaltMinute()
    {
     return haltMinute;
    }
    
    public void display()
    {
        System.out.println("{"+flightNo+","+source+","+ destination+","+HaltStation+","+ Airline+","+arrivalHour+","+departurehour);
    }
        // -------------------------------------------------------------
}

    


    
    

