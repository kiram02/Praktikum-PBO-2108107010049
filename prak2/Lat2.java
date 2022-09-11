

class lat2 {
  public static void main(String[] args) {
    int nilai = 90;
    
    if (nilai >= 87){
        System.out.println("A");
    } 
    else if ( nilai <= 78 || nilai < 87) {
        System.out.println("AB");
    }
    else if (nilai <= 69 || nilai < 78) {
        System.out.println("B");
    }
    else if ( nilai <=60 || nilai < 69) {
        System.out.println("BC");
    }
    else if ( nilai  <= 51  || nilai < 60) {
        System.out.println("C");
    }
    else if ( nilai <= 41 || nilai < 51) {
        System.out.println("D");
    }
    else {
        System.out.println("E");
    }
  }
}
