class Main {
    public static void main(String[] args) {
      String nama[]={"Andri Hariadi", "Dewi Lestari", "Dewi Agustian", "Reni Indrayanti", "Toni Sukmawan", "Toni Gunawan"};
       String cari = "Andri";
       String List[];
       for(int i= 0; i<nama.length;i++){
         boolean found= false;
         String splitnama[] = nama[i].split(" ");
         for(int j=0;j<splitnama.length;j++){
           if(cari.equals(splitnama[j])&&found==false){
             found = true;
             System.out.println("nama:"+nama[i]+" Ditemukan di indeks ke: "+ (i+1));
           }
         }
       }
    }
  }