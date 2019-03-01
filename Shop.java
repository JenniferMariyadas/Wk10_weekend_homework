import java.util.*;

public class Shop {

  private ArrayList<IPlay> myInstruments;

  private String myName;

  public Shop(String name){
    this.myName = name;
    this.myInstruments = new ArrayList<IPlay>();
  }

  public void addInstrument(IPlay instrument) {
    this.myInstruments.add(instrument);
  }

  public ArrayList<IPlay> getInstruments(){
    return this.myInstruments;
  }

  public static void main(String[] args){
    Shop candyshop = new Shop("Candyshop");

    Guitar d = new Guitar();
    Drum c = new Drum();

    candyshop.addInstrument(d);
    candyshop.addInstrument(c);

    for (int i=0; i<candyshop.getInstruments().size(); i++ ) {
      System.out.println(candyshop.getInstruments().get(i).makeNoise());
    }


  }

}
