
// 2 innsatsvariabler.
class Verden {
    public int genNr=0;
    private Rutenett rutenett;
    
   
    
    public Verden(int antRader3,int antKolonner3){// nye rutenett objekt.
        rutenett= new Rutenett(antRader3,antKolonner3);
        rutenett.fyllMedTilfeldigeCeller();
        rutenett.kobleAlleCeller();
    }
    public void tegn(){
        
        System.out.println("GenerasjonsNummeret:"+ genNr);
        rutenett.tegnRutenett();
        System.out.println("Det er "+rutenett.antallLevende()+" levende celler.");
        
    }
    public void oppdatering(){// Det trenges to for løkker for å sjekke.
       
        for(int rader=0; rader<rutenett.antRader; rader++){
            for(int kol=0; kol<rutenett.antRader; kol++){
                rutenett.rutene[rader][kol].tellLevendeNaboer();
            }

        }
        for(int rader=0; rader<rutenett.antRader; rader++){
            for(int kol=0; kol<rutenett.antKolonner; kol++){
                rutenett.rutene[rader][kol].oppdaterStatus();
            }
        }
        genNr++;
    }
}
