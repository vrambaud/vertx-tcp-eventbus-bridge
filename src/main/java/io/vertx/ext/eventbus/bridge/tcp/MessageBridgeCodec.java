/*
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  and Apache License v2.0 which accompanies this distribution.
 *
 *  The Eclipse Public License is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *  The Apache License v2.0 is available at
 *  http://www.opensource.org/licenses/apache2.0.php
 *
 *  You may elect to redistribute this code under either of these licenses.
 */
package io.vertx.ext.eventbus.bridge.tcp;

/**
 * Represents a codec for body in bridge messages.
 * 
 * @author vrambaud
 *
 * @param <T> Type of the body.
 */
public interface MessageBridgeCodec<T> {
    
    /**
     * Transform body content string in instance of T. 
     * @param msg content of body
     * @return T instance
     */
    T decode(String msg);
    
    /**
     * Transform T instance in String representation
     * @param obj
     * @return String representation of T instance
     */
    String encode(T obj);
}
