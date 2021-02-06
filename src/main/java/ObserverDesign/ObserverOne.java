package ObserverDesign;

public class ObserverOne implements IObserver{
	
	public void update(Message m)
	{
		System.out.println("This is ObserverOne"+m.getMessageContent());
	}

}
