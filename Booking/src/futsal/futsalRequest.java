package futsal;

import bookingFrame.BookingRequest;
import APP.DB;

public class futsalRequest {
    
    public static void main(String[] args) {
        BookingRequest bookingRequest = new BookingRequest();
        bookingRequest.show(); 
        
        DB.loadConnection();
    }
}
