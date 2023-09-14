package comandas;

import java.util.List;

public class TurnOfDiveice implements Command{
    List<ElectronicDriver>allDivice;
    public TurnOfDiveice(List<ElectronicDriver>newDevice){
        allDivice = newDevice;
    }
    @Override
    public void execute() {
        for(ElectronicDriver divice : allDivice){
            divice.off();
        }
        
    }
    @Override
    public void undo() {
      for(ElectronicDriver device : allDivice){
        device.on();

      }
        
    }

    
    
}
