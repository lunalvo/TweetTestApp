package com.Francisco.TweetTest;

import java.io.Serializable;

public class Tweet implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 2310698779687082782L;
	
	public String id_str;
    public String message;

    public Tweet(String id_str, String message) {
    	super();
      this.id_str = id_str;
      this.message = message;
    }
    
    public String toString() {
    	return message;
    }
  }
