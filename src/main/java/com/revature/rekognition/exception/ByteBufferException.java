package com.revature.rekognition.exception;

/**
 * Thrown if an error occurs converting an image into a ByteBuffer.
 */
public class ByteBufferException extends RuntimeException {

  private static final long serialVersionUID = -3318779952814543987L;

  public ByteBufferException(String message) {
    super(message);
  }

  public ByteBufferException(String message, Throwable cause) {
    super(message, cause);
  }

}
