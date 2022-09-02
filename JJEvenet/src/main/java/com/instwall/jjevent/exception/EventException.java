package com.instwall.jjevent.exception;

public class EventException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	
	public EventException() {
		super();
	}
	
	public EventException(String msg) {
		super(msg);
	}
	
	public EventException(Throwable ex) {
		super(ex);
	}
	
	public EventException(String msg, Throwable ex) {
		super(msg,ex);
	}

}
