/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.camel.resume;

import java.nio.ByteBuffer;

/**
 * An interface to represent offset keys (addressable for an offset)
 * 
 * @param <K> the type of the offset key
 */
public interface OffsetKey<K> extends Serializable {
    /**
     * Sets the key
     * 
     * @param key the key valeu
     */
    void setKey(K key);

    /**
     * Gets the key
     * 
     * @return the key instance
     */
    K getKey();

    @Override
    default ByteBuffer serialize() {
        return serialize(getKey());
    }
}
