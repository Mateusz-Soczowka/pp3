public class TV implements CanOnOff, CanChangeChannel
{
    boolean isOn;
    int nrkanalu;
    
    public TV(boolean isOn)
    {
        this.isOn = isOn;
    }
    
    @Override
    public void on()
    {
        isOn = true;
    }
    
    @Override
    public void off()
    {
        isOn = false;
    }
    
    @Override
    public void channelUp()
    {
        nrkanalu++;
    }
    
    @Override
    public void channelDown()
    {
        if(nrkanalu > 1)
        {
            --nrkanalu;
        }
    }
    
    @Override
    public void setChannel(int channelNo)
    {
        if(channelNo > 0){
            nrkanalu = channelNo;
        }
    }
    
    
    public void display()
    {
        if(isOn = true)
        {
            System.out.println("TV is on");
        }
        else 
        {
            System.out.println("TV is off");
        }
    }
    
    public static void main(String[] args)
    {
        TV tv = new TV(false);
        tv.display();
        tv.on();
        tv.display();
        tv.off();
        tv.display();
    }
}