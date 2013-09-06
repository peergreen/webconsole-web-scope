package com.peergreen.webconsole.scope.web.documentation;

import com.peergreen.webconsole.Extension;
import com.peergreen.webconsole.ExtensionPoint;
import com.peergreen.webconsole.vaadin.tabs.Tab;
import com.vaadin.server.ExternalResource;
import com.vaadin.ui.BrowserFrame;
import com.vaadin.ui.VerticalLayout;

import javax.annotation.PostConstruct;

/**
 * @author Mohammed Boukada
 */
@Extension
@ExtensionPoint("com.peergreen.webconsole.scope.web.WebScope.tab")
@Tab("Peergreen Documentation")
public class PeergreenDocumentation extends VerticalLayout {

    @PostConstruct
    public void init() {
        setMargin(true);
        setSpacing(true);
        BrowserFrame browser = new BrowserFrame("", new ExternalResource("http://docs.peergreen.com/peergreen_server/latest/reference/xhtml-single/user-guide.xhtml"));
        browser.setSizeFull();
        addComponent(browser);
        setExpandRatio(browser, 1.5f);
    }
}
