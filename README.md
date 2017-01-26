<!--
Copyright 2017 Tirasa

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

  http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
-->
# Tirasa Extensions for [Apache Syncope](http://syncope.apache.org)

As part of its [involvement](www.tirasa.net/businessproposition/apache-syncope.html) with the Apache Software Foundation in general
and the Apache Syncope project in particular, [Tirasa](http://www.tirasa.net) maintains a set of Open Source
[extensions](https://syncope.apache.org/docs/reference-guide.html#extensions) which can be optionally enabled into any
Apache Syncope deployment.

## CAS REST Authentication

Support for [CAS REST Authentication](https://apereo.github.io/cas/5.0.x/installation/Rest-Authentication.html), providing:

* a dedicated REST endpoint on Syncope suitable for
[configuration](https://apereo.github.io/cas/5.0.x/installation/Configuration-Properties.html#rest-authentication) as
`cas.authn.rest.uri`
* support - via REST or [Admin Console](https://syncope.apache.org/docs/reference-guide.html#admin-console) - for tuning the
CAS [SimplePrincipal](https://github.com/apereo/cas/blob/master/core/cas-server-core-authentication/src/main/java/org/apereo/cas/authentication/principal/SimplePrincipal.java)
instances returned by the REST endpoint
