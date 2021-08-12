package mylistener;

import java.util.EventObject;

@SuppressWarnings("serial")
public class LineAddEvent extends EventObject {
	OperationPanel thePanel;
	public LineAddEvent(OperationPanel source) {
		super((Object)source);
		thePanel = (OperationPanel)source;
	}
	
	//Actually I need to implement toString and getsource() method

}
