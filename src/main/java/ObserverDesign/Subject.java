package ObserverDesign;

import java.util.*;

public class Subject implements ISubject {

	List<IObserver> observers = new ArrayList<>();

	public void attach(IObserver o)
	{
		observers.add(o);
	}
	
	public void detach(IObserver o)
	{
		observers.remove(o);
	}
	
	public void notifyUpdate(Message m)
	{
		for(IObserver o:observers)
		{
			o.update(m);
		}	
	}
}