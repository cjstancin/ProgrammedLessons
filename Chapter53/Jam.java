public class Jam {
    private String contents;
    private String date;
    private int capacity;
  
  
    public Jam(String contents, String date, int size) {
      this.contents = contents;
      this.date = date;
      capacity = size;
    }
  
    public boolean empty() {
      return (capacity== 0) ;
    }
  
    public String toString() {
      return contents + "   " +  date + "   " +  capacity + " fluid ounces"  ;
    }
  
    public void spread (int ounces) {
        if (!empty()) {
            if (ounces <= capacity){
            System.out.println("Spreading " + ounces + " fluid ounces of " + contents);
            capacity = capacity - ounces;
            } else {
            System.out.println("Spreading " + capacity + " fluid ounces of " + contents);
            capacity =  0 ;
            }
        } else {
            System.out.println("No jam in the jar");
        }
    }

    public int amtJam(){
      return capacity;
    }

    public String getDate(){
      return date;
    }
  
  }