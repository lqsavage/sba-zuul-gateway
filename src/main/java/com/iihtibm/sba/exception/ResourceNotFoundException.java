package com.iihtibm.sba.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author savagelee
 */
@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	private Exception ex;

	public ResourceNotFoundException(String message) {
		super(message);
	}

	public ResourceNotFoundException(Exception e, String message) {
		super(message);
		ex = e;
	}

	public Exception getEx() {
		return ex;
	}
}
