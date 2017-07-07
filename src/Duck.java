import eatBehaviour.IEatBehaviour;
import flyBehaviour.IflyBehaviour;

public class Duck {
	private IflyBehaviour fly;
	private IEatBehaviour eat;
	public Duck(IflyBehaviour fly, IEatBehaviour eat) {
		super();
		this.fly = fly;
		this.eat = eat;
	}
	
	public void run()
	{
		this.fly.fly();
		this.eat.eat();
	}
	
	

}
