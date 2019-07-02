/*
 * Copyright 2015-2018 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, 
 * either express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 */
package io.cabos;

import org.dbflute.jetty.JettyBoot;

/**
 * @author jflute
 */
public class CabosappBoot { // #change_it_first

    private static final int PORT = 9001;
    private static final String CONTEXT = "/cabosapp";
    private static final String HOST_KEY = "app.host";

    public static void main(String[] args) { // e.g. java -Dlasta.env=production -jar cabosapp.war
        createJettyBoot().asDevelopment(isDevelopment()).bootAwait();
    }

    private static JettyBoot createJettyBoot() {
        return new JettyBoot(getPort(), CONTEXT) { // no context path
            @Override
            protected String getServerHost() {
                return getHost();
            }
        };
    }

    private static int getPort() {
        return PORT;
    }

    private static String getContext() {
        return CONTEXT;
    }

    private static String getHost() {
        return System.getProperty(HOST_KEY, "localhost");
    }

    private static boolean isDevelopment() {
        return System.getProperty("lasta.env") == null;
    }
}
