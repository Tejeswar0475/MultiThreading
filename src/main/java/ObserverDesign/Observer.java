package ObserverDesign;

public class Observer {
	
	
	public static void main(String[] args) {
	
		ObserverOne observerone=new ObserverOne();
		ObserverTwo observertwo=new ObserverTwo();
		ObserverThree observerthree=new ObserverThree();
		Subject subject=new Subject();
		
		subject.attach(observerone);
		subject.attach(observertwo);
		
		subject.notifyUpdate(new Message("First Message"));
		
		subject.detach(observerone);
		subject.attach(observerthree);
		
		subject.notifyUpdate(new Message("Two Message"));
		
	}

}