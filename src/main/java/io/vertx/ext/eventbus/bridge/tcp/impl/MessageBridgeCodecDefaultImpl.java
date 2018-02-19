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
package io.vertx.ext.eventbus.bridge.tcp.impl;

import io.vertx.core.json.JsonObject;
import io.vertx.ext.eventbus.bridge.tcp.MessageBridgeCodec;

/**
 * Default codec implementation based on JsonObject.
 * 
 * @author vrambaud
 *
 */
public class MessageBridgeCodecDefaultImpl implements MessageBridgeCodec<JsonObject> {

    /* (non-Javadoc)
     * @see io.vertx.ext.eventbus.bridge.tcp.MessageBridgeCodec#decode(java.lang.String)
     */
    @Override
    public JsonObject decode(String msg) {
        JsonObject obj = new JsonObject(msg);
        return obj;
    }

    /* (non-Javadoc)
     * @see io.vertx.ext.eventbus.bridge.tcp.MessageBridgeCodec#encode(java.lang.Object)
     */
    @Override
    public String encode(JsonObject obj) {
        return obj.encode();
    }

}
