package ObserverDesign;

public class ObserverThree implements IObserver {
	public void update(Message m)
	{
		System.out.println("This is ObserverThree"+m.getMessageContent());
	}

}
