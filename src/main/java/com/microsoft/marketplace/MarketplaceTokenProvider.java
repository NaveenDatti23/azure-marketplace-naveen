/*
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 */
package com.microsoft.marketplace;

import java.io.IOException;

public interface MarketplaceTokenProvider {
    String acquireToken() throws IOException;
}