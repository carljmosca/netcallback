/*
 * Virtual Active Network (VAN) Java API
 * Copyright (C) 2000 Alexander V. Konstantinou <akonstan@acm.org>
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 * 
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 */
package net.sourceforge.netcallback;

import com.beust.jcommander.JCommander;
import net.sourceforge.netcallback.options.BaseOptions;

/**
 * Command-line de-multiplexing between PrivateServer and PublicServer
 *
 * @author Alexander V. Konstantinou (akonstan@acm.org)
 * @version $Revision: 1.1.1.1 $ ; $Date: 2004/02/16 01:17:52 $
 */
public class NetCallback {

    public static final String PUBLIC_SERVER = "public";
    public static final String PRIVATE_SERVER = "private";
    
    /**
     * Prevent instantiation
     */
    private NetCallback() {
    }

    public static void main(String[] args) {
        
        BaseOptions options = new BaseOptions();
        JCommander jCommander = new JCommander(options, args);
        
        if (options.getParameters().contains(PUBLIC_SERVER)) {
            PublicServer.main(args);    
        } else if (options.getParameters().contains(PRIVATE_SERVER)) {
            PrivateServer.main(args);
        } else {
            jCommander.usage();
            System.exit(1);
        }
    }
}
