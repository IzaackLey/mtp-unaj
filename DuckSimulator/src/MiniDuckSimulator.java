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
		//ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(".\\sample.txt"));
		//oos.writeObject(new String("Hello my dear friends"));
		//oos.writeInt(10);
		//oos.writeObject(new Integer(5));
		//oos.writeObject(mallard);
		//oos.close();
		
		//ObjectInputStream ois = new ObjectInputStream(new FileInputStream(".\\sample.txt"));
		//System.out.println("First : object : " + ois.readObject() );
		//System.out.println("Second : int : " + ois.readInt() );
		//System.out.println("Third : Integer : " + ois.readObject() );
		//MallardDuck duck = ((MallardDuck)ois.readObject();
		//ois.close();
	}

}
