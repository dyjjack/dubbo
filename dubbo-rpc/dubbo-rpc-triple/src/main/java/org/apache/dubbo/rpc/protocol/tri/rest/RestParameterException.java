/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.dubbo.rpc.protocol.tri.rest;

import org.apache.dubbo.remoting.http12.HttpStatus;

public class RestParameterException extends RestException {

    private static final long serialVersionUID = 1L;

    public RestParameterException(Messages message, Object... arguments) {
        super(message, arguments);
    }

    public RestParameterException(Throwable cause, Messages message, Object... arguments) {
        super(cause, message, arguments);
    }

    public RestParameterException(String message, Throwable cause) {
        super(message, cause);
    }

    public RestParameterException(String message) {
        super(message);
    }

    public RestParameterException(Throwable cause) {
        super(cause);
    }

    @Override
    public int getStatusCode() {
        return HttpStatus.PRECONDITION_FAILED.getCode();
    }
}
