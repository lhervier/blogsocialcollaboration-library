/*
 * Generated file. 
 * 
 * BibliothequeJss.java
 */
package fr.asi.xsp.testblog.composants.xsp;

import com.ibm.xsp.page.compiled.AbstractCompiledPage;
import com.ibm.xsp.page.compiled.AbstractCompiledPageDispatcher;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import com.ibm.xsp.page.compiled.NoSuchComponentException;
import com.ibm.xsp.page.compiled.PageExpressionEvaluator;
import java.lang.String;
import com.ibm.xsp.resource.ScriptResource;
import com.ibm.xsp.component.FacesPageProvider;
import com.ibm.xsp.component.UIViewRootEx2;
import com.ibm.xsp.component.xp.XspCommandButton;
import com.ibm.xsp.component.xp.XspEventHandler;
import javax.faces.el.MethodBinding;

@SuppressWarnings("all")
public class BibliothequeJss extends AbstractCompiledPageDispatcher{
    
    public BibliothequeJss() {
        super("3.0");
    }

    protected AbstractCompiledPage createPage(int pageIndex) {
        return new BibliothequeJssPage();
    }
    
    protected boolean isCustomControl() {
        return true;
    }

    public static class BibliothequeJssPage extends AbstractCompiledPage {
        
        private static final ComponentInfo[] s_infos = new ComponentInfo[]{
            ComponentInfo.EMPTY_NORMAL, // 0 eventHandler
            new ComponentInfo(false, new int[]{0}), // 1 "button1"
            new ComponentInfo(false, new int[]{1}), // 2 view
        };
        
        public BibliothequeJssPage() {
            super(2, s_infos );
        }
        
        public int getComponentForId(String id) throws NoSuchComponentException { 
            if( "button1".equals(id) )
                return 1;
            return -1;
        }
        
        public UIComponent createComponent(int id, FacesContext context,
                UIComponent parent, PageExpressionEvaluator evaluator)
                throws NoSuchComponentException { 
            switch (id) {
            case 2:
                return createView(context, parent, evaluator);
            case 1:
                return createButton1(context, parent, evaluator);
            case 0:
                return createEventHandler(context, parent, evaluator);
            }
            throw new NoSuchComponentException(id);
        }
        
        protected void initIncluderAsRoot(FacesContext context,
                PageExpressionEvaluator evaluator, UIComponent root) {
            ScriptResource resources = new ScriptResource();
            resources.setComponent(root);
            resources.setClientSide(false);
            resources.setSrc("/maBiblio.extjss");
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
            ScriptResource resources = new ScriptResource();
            resources.setComponent(result);
            resources.setClientSide(false);
            resources.setSrc("/maBiblio.extjss");
            result.addResource(resources);
            return result;
        }

        private UIComponent createButton1(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspCommandButton result = new XspCommandButton();
            result.setValue("Message");
            setId(result, "button1");
            return result;
        }

        private UIComponent createEventHandler(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspEventHandler result = new XspEventHandler();
            String sourceId = "button1/xp:eventHandler[1]/xp:this.action[1]/text()";
            MethodBinding action = evaluator.createMethodBinding(result,
                    "#{javascript:\n\t\t\t\tmessage(\"hello world !\");\n\t\t\t}",
                    null,null, sourceId);
            result.setAction(action);
            result.setSubmit(true);
            result.setEvent("onclick");
            result.setRefreshMode("complete");
            return result;
        }

    }
}
