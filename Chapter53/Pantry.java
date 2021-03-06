public class Pantry {
    private Jam  jar1;
    private Jam  jar2;
    private Jam  jar3;
    private Jam  selected;
  
    Pantry(Jam jar1, Jam jar2, Jam jar3) {
      this.jar1 = jar1;
      this.jar2 = jar2;
      this.jar3 = jar3;
      selected = null;
    }
    
    Pantry(Jam jar1, Jam jar2) {
      this.jar1 = jar1;
      this.jar2 = jar2;
      this.jar3 = null;
      selected = null;
    }
  
    Pantry(Jam jar1) {
      this.jar1 = jar1;
      this.jar2 = null;
      this.jar3 = null;
      selected = null;
    }
  
    public String toString() {
      String str = "";
      if (jar1 != null) str += "1: " + jar1.toString() + "\n";
      if (jar2 != null) str += "2: " + jar2.toString() + "\n";
      if (jar3 != null) str += "3: " + jar3.toString() + "\n";     
      return str;
    }
  
    public boolean select(int jarNumber) {
        if (jarNumber == 1) {
            if (jar1 != null) {
                selected =  jar1;
                return true;
            }
        } else if (jarNumber == 2) {
            if (jar2 != null) {
                selected = jar2;
                return true;
            }
            return false;
        } else {
            if (jar3 != null) {
              selected = jar3;
              return true;
            }
            return false;
        }
        return false;
    }
  
    public void spread(int ounces) {
      selected.spread(ounces);
    }

    public void replace(Jam j, int slot) {
      if (slot == 1){
        jar1 = j;
      } else if (slot == 2){
        jar2 = j;
      } else if (slot == 3){
        jar3 = j;
      }
    }
  
    public void mixedFruit() {
      int amtTotal = jar1.amtJam()  + jar2.amtJam() + jar3.amtJam();
      jar1 = new Jam("Mixed fruit", jar1.getDate(), amtTotal);
      jar2 = null;
      jar3 = null;
    }
  }