/* 
 * Copyright 2019 Alexander Akhtyamov
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.elpy.sip.module.context;

/**
 * Response context interface for web modules
 * if {@link #getRedirectUrl()} is not null, then {@link #getResponseBody()} must not be used
 * @author Alexander Akhtyamov
 */
public interface ResponseContext {
    
    public int getStatusCode();

    public String getStatusMessage();

    public String getRedirectUrl();

    public byte[] getResponseBody();
}
