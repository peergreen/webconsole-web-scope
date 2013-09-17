/**
 * Peergreen S.A.S. All rights reserved.
 * Proprietary and confidential.
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

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
