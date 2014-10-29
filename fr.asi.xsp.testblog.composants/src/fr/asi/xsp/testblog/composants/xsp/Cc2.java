/*
 * Generated file. 
 * 
 * Cc2.java
 */
package fr.asi.xsp.testblog.composants.xsp;

import com.ibm.xsp.page.compiled.AbstractCompiledPage;
import com.ibm.xsp.page.compiled.AbstractCompiledPageDispatcher;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import com.ibm.xsp.page.compiled.NoSuchComponentException;
import com.ibm.xsp.page.compiled.PageExpressionEvaluator;
import java.lang.String;
import com.ibm.xsp.component.UIViewRootEx2;
import com.ibm.xsp.component.UIPassThroughText;

@SuppressWarnings("all")
public class Cc2 extends AbstractCompiledPageDispatcher{
    
    public Cc2() {
        super("3.0");
    }

    protected AbstractCompiledPage createPage(int pageIndex) {
        return new Cc2Page();
    }
    
    protected boolean isCustomControl() {
        return true;
    }

    public static class Cc2Page extends AbstractCompiledPage {
        
        private static final ComponentInfo[] s_infos = new ComponentInfo[]{
            ComponentInfo.EMPTY_MARKUP, // 0 text
            new ComponentInfo(false, new int[]{0}), // 1 view
        };
        
        public Cc2Page() {
            super(1, s_infos );
        }
        
        public int getComponentForId(String id) throws NoSuchComponentException { 
            return -1;
        }
        
        public UIComponent createComponent(int id, FacesContext context,
                UIComponent parent, PageExpressionEvaluator evaluator)
                throws NoSuchComponentException { 
            switch (id) {
            case 1:
                return createView(context, parent, evaluator);
            case 0:
                return createText(context, parent, evaluator);
            }
            throw new NoSuchComponentException(id);
        }
        
        private UIComponent createView(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            UIViewRootEx2 result = new UIViewRootEx2();
            initViewRoot(result);
            return result;
        }

        private UIComponent createText(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            String text = "Custom control contenu dans cc1.";
            UIPassThroughText textComp = new UIPassThroughText();
            textComp.setText(text);
            return textComp;
        }

    }
}
