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
package org.apache.syncope.core.logic;

import java.lang.reflect.Method;
import org.apache.syncope.common.lib.to.CASSimplePrincipal;
import org.apache.syncope.common.lib.to.UserTO;
import org.apache.syncope.core.provisioning.api.data.UserDataBinder;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Component;

@Component
public class CASAuthNLogic extends AbstractTransactionalLogic<CASSimplePrincipal> {

    private UserDataBinder userDataBinder;

    @PreAuthorize("isAuthenticated()")
    public CASSimplePrincipal authenticate() {
        UserTO user = userDataBinder.getAuthenticatedUserTO();

        CASSimplePrincipal principal = new CASSimplePrincipal();
        principal.setId(user.getUsername());
        return principal;
    }

    @Override
    protected CASSimplePrincipal resolveReference(final Method method, final Object... args)
            throws UnresolvedReferenceException {

        throw new UnresolvedReferenceException();
    }

}
