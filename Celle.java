// det opprettes 4 innsats variabler, men det bruktes ikke private metod.
class Celle {
    public boolean levende;
    public Celle[] naboer;
    public int antLevendeNaboer;
    public int antNaboer;


    public Celle(){ // en celle har maks 8 naboer.
       levende=false;
       naboer= new Celle[8];
       antLevendeNaboer=0;
       antNaboer=0;

    }
    public void settDoed(){
        levende= false;
    }
    public void settLevende(){
        levende= true;
    }

    public boolean erLevende(){
        return levende;
    }

    public char hentStatusTegn(){
        if(levende){
            return 'O';
        }
        else{
            return '.';
        }
    }

    public void leggTilNabo(Celle nabo){
        // antNaboer begynnte fra 0. Så det trenges ikke noen andre variabel.
       naboer[antNaboer++]=nabo;

        }
    public void tellLevendeNaboer(){
         antLevendeNaboer=0;
        for(int teller=0; teller<antNaboer; teller++){
            if(naboer[teller] != null && naboer[teller].erLevende()){
                antLevendeNaboer++;
                
            }
            }
            
        } 
    

    public void oppdaterStatus(){
        
        if(levende==false){
            if(antLevendeNaboer==3){
               settLevende();
            }
         }
        else{ 
            if ( antLevendeNaboer < 2 || antLevendeNaboer >3){
                settDoed();
        }
            
        }

    }
   


}


    

