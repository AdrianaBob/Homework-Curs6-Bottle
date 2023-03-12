public class Bottle {
    private float capacity;
    private boolean availableliquid;
    private boolean open;

    Bottle(){
        capacity = 15;
        open = true;
        availableliquid = true;
    }

    public Bottle(float capacity, boolean availableliquid, boolean open) {
        this.capacity=capacity;
        this.availableliquid=availableliquid;
        this.open = open;
    }

    public float getCapacity() {

        return capacity;
    }
    public void isOpen(){
        System.out.println("Bottle is open " + open);
        open = true;
    }

    public void isClosed(){
        System.out.println("Bottle is closed ");
        open = false;
    }

    public void availableLiquid(){
        System.out.println("Available liquid " + availableliquid);
        availableliquid = true;
    }

    public float emptyCapacity() {
        if (capacity != 0) {
            System.out.println(capacity);
        } else {
            System.out.println("empty");
        }
        return 0;
    }
    public void openBottle() {
       open = true;
       System.out.println("Bottle is opened");
    }
    public  void closesBottle(){
        open = false;
        System.out.println("Bottle is closed");
    }
}
