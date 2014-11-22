package com.aestasit.infrastructure.exceptions;

public class RemoteException extends RuntimeException {

  public RemoteException() {
    super();
  }

  public RemoteException(String message) {
    super(message);
  }

  public RemoteException(String message, Throwable cause) {
    super(message, cause);
  }

  public RemoteException(Throwable cause) {
    super(cause);
  }

  public RemoteException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
    super(message, cause, enableSuppression, writableStackTrace);
  }

}
