/*
 *   Licensed to the Apache Software Foundation (ASF) under one
 *   or more contributor license agreements.  See the NOTICE file
 *   distributed with this work for additional information
 *   regarding copyright ownership.  The ASF licenses this file
 *   to you under the Apache License, Version 2.0 (the
 *   "License"); you may not use this file except in compliance
 *   with the License.  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing,
 *  software distributed under the License is distributed on an
 *   "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *   KIND, either express or implied.  See the License for the
 *   specific language governing permissions and limitations
 *   under the License.
 */

package org.apache.airavata.mft.core.api;

import java.util.Properties;

/**
 * This represents the output connector, where to write
 * data from the application.
 */
public interface SinkConnector extends Connector{

    /**
     * provides the channel to write data to external location
     * @return ConnectorChannel
     */
     ConnectorChannel openChannel(Properties properties) throws Exception;

    /**
     * Verify content upload of the given channel is completed
     * @param channel
     * @return true if succes else false
     */
    boolean verifyUpload(ConnectorChannel channel);
}
