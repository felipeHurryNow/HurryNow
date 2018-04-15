/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hn.hurrynow.persistence;

/**
 *
 * @author Felipe Brasil
 */
public class ServicesHurryNowException extends Exception{
    

    public ServicesHurryNowException(String message) {
        super(message);
    }

    public ServicesHurryNowException(String message, Throwable cause) {
        super(message, cause);
    }

    public ServicesHurryNowException(Throwable cause) {
        super(cause);
    }
}
