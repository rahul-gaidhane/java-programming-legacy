package exampleListener;

import java.util.EventObject;

@SuppressWarnings("serial")
public class MoodEvent extends EventObject {
	private Mood _mood;
	
	public MoodEvent(Object source, Mood mood) {
		super(source);
		_mood = mood;
	}
	
	public Mood mood() {
		return _mood;
	}

}


