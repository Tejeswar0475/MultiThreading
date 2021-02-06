package ObserverDesign;

public class ObserverTwo implements IObserver {
	public void update(Message m)
	{
		System.out.println("This is ObserverTwo"+m.getMessageContent());
	}

}
