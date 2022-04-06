package hotel;

public class NewOutHotel {
    IData iData;
    public NewOutHotel(IData iData)
    {this.iData=iData;}
    public NewOutHotel(){}
    public String out(int roomNo)
    {
        return iData.in_Out_Room(roomNo,"EMPTY");
    }
}
