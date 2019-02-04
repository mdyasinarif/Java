
package enam;


public enum Season {
    
    WINTER(10),SUMMER(20);
    
   /* WINTER(10) {// for abstract
        @Override
        public String dispSeason() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    },SUMMER(20) {// for abstract
        @Override
        public String dispSeason() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    };
    */
    public int value;

    private Season(int value) {
        this.value = value;
    }
}
  // public abstract String dispSeason();
    
    class EnumExample{
        public static void main(String[] args) {
            for (Season s : Season.values()) {
                System.out.println(s+" "+s.value);
                //System.out.println(s+" "+s.value+" "+s.dispSeason());
            }
        }
    }
    


