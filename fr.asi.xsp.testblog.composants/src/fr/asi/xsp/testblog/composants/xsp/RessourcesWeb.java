/*
 * Generated file. 
 * 
 * RessourcesWeb.java
 */
package fr.asi.xsp.testblog.composants.xsp;

import com.ibm.xsp.page.compiled.AbstractCompiledPage;
import com.ibm.xsp.page.compiled.AbstractCompiledPageDispatcher;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import com.ibm.xsp.page.compiled.NoSuchComponentException;
import com.ibm.xsp.page.compiled.PageExpressionEvaluator;
import java.lang.String;
import com.ibm.xsp.resource.StyleSheetResource;
import com.ibm.xsp.component.FacesPageProvider;
import com.ibm.xsp.component.UIViewRootEx2;
import com.ibm.xsp.component.xp.XspDiv;
import com.ibm.xsp.component.xp.XspOutputLabel;

@SuppressWarnings("all")
public class RessourcesWeb extends AbstractCompiledPageDispatcher{
    
    public RessourcesWeb() {
        super("3.0");
    }

    protected AbstractCompiledPage createPage(int pageIndex) {
        return new RessourcesWebPage();
    }
    
    protected boolean isCustomControl() {
        return true;
    }

    public static class RessourcesWebPage extends AbstractCompiledPage {
        
        private static final ComponentInfo[] s_infos = new ComponentInfo[]{
            ComponentInfo.EMPTY_NORMAL, // 0 label
            new ComponentInfo(false, new int[]{0}), // 1 div
            new ComponentInfo(false, new int[]{1}), // 2 view
        };
        
        public RessourcesWebPage() {
            super(2, s_infos );
        }
        
        public int getComponentForId(String id) throws NoSuchComponentException { 
            return -1;
        }
        
        public UIComponent createComponent(int id, FacesContext context,
                UIComponent parent, PageExpressionEvaluator evaluator)
                throws NoSuchComponentException { 
            switch (id) {
            case 2:
                return createView(context, parent, evaluator);
            case 1:
                return createDiv(context, parent, evaluator);
            case 0:
                return createLabel(context, parent, evaluator);
            }
            throw new NoSuchComponentException(id);
        }
        
        protected void initIncluderAsRoot(FacesContext context,
                PageExpressionEvaluator evaluator, UIComponent root) {
            StyleSheetResource resources = new StyleSheetResource();
            resources.setComponent(root);
            resources.setHref("/.ibmxspres/testblog/testblog.css");
            FacesPageProvider asPageProvider = root instanceof FacesPageProvider ?
                    (FacesPageProvider) root : null;
            if( null != asPageProvider ){
                asPageProvider.addResource(resources);
            }
        }

        private UIComponent createView(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            UIViewRootEx2 result = new UIViewRootEx2();
            initViewRoot(result);
            StyleSheetResource resources = new StyleSheetResource();
            resources.setComponent(result);
            resources.setHref("/.ibmxspres/testblog/testblog.css");
            result.addResource(resources);
            return result;
        }

        private UIComponent createDiv(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspDiv result = new XspDiv();
            result.setStyleClass("testblog");
            return result;
        }

        private UIComponent createLabel(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspOutputLabel result = new XspOutputLabel();
            result.setValue("Hello World!");
            return result;
        }

    }
}
