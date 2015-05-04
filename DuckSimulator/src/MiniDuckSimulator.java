import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


public class MiniDuckSimulator {
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
//		Duck mallard = new MallardDuck();
//		mallard.display();
//		mallard.performQuack();
//		mallard.performFly();
		
		Duck model = new ModelDuck();
		model.display();
		model.performFly();
		model.performQuack();
		model.setFlyBehavior(new FlyWithRocket());
		model.performFly();
	}

}
