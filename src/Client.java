import eatBehaviour.Eat;
import flyBehaviour.JetFly;
import flyBehaviour.NoFly;

public class Client {
	
	public static void main(String[] args)
	{
		Duck jetDuck=new Duck(new JetFly(), new Eat());
		jetDuck.run();
		Duck rubberFly=new Duck(new NoFly(), new Eat());
		rubberFly.run();
	}

}
