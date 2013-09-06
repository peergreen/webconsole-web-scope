package com.peergreen.webconsole.scope.web;

import com.peergreen.webconsole.Extension;
import com.peergreen.webconsole.ExtensionPoint;
import com.peergreen.webconsole.Scope;
import com.peergreen.webconsole.vaadin.tabs.TabScope;

/**
 * @author Mohammed Boukada
 */
@Extension
@ExtensionPoint("com.peergreen.webconsole.scope")
@Scope(value = "web", iconClass = "icon-at")
public class WebScope extends TabScope {

    public WebScope() {
        super("Web", false);
    }
}
