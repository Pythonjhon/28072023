package coman;



public class ConcreteComand extends comman {
    private Reciver reciver;

    @Override
    public void excute(Reciver receiver) {
        reciver.doAction();
      this.reciver = reciver;
    }
  
    
}
