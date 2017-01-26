/*
 * Copyright 2017 Tirasa
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.syncope.common.rest.api.service;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import org.apache.syncope.common.lib.to.CASSimplePrincipal;

@Path("casAuthN")
public interface CASAuthNService extends JAXRSService {

    /**
     * Generates principal information suitable for CAS REST Authentication, related to the authenticating user.
     *
     * @return principal information suitable for CAS REST Authentication, related to the authenticating user
     */
    @POST
    @Produces({ MediaType.APPLICATION_JSON })
    CASSimplePrincipal authenticate();
}
