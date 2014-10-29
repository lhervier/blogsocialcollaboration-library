/*
 * Generated file. 
 * 
 * Cc1.java
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
import com.ibm.xsp.component.xp.XspLineBreak;
import com.ibm.xsp.component.UIIncludeComposite;

@SuppressWarnings("all")
public class Cc1 extends AbstractCompiledPageDispatcher{
    
    public Cc1() {
        super("3.0");
    }

    protected AbstractCompiledPage createPage(int pageIndex) {
        return new Cc1Page();
    }
    
    protected boolean isCustomControl() {
        return true;
    }

    public static class Cc1Page extends AbstractCompiledPage {
        
        private static final ComponentInfo[] s_infos = new ComponentInfo[]{
            ComponentInfo.EMPTY_MARKUP, // 0 text
            ComponentInfo.EMPTY_NORMAL, // 1 br
            ComponentInfo.EMPTY_NORMAL, // 2 cc2
            new ComponentInfo(false, new int[]{0, 1, 2}), // 3 view
        };
        
        public Cc1Page() {
            super(3, s_infos );
        }
        
        public int getComponentForId(String id) throws NoSuchComponentException { 
            return -1;
        }
        
        public UIComponent createComponent(int id, FacesContext context,
                UIComponent parent, PageExpressionEvaluator evaluator)
                throws NoSuchComponentException { 
            switch (id) {
            case 3:
                return createView(context, parent, evaluator);
            case 0:
                return createText(context, parent, evaluator);
            case 1:
                return createBr(context, parent, evaluator);
            case 2:
                return createCc2(context, parent, evaluator);
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
            String text = "Custom control contenant le second :";
            UIPassThroughText textComp = new UIPassThroughText();
            textComp.setText(text);
            return textComp;
        }

        private UIComponent createBr(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            XspLineBreak result = new XspLineBreak();
            return result;
        }

        private UIComponent createCc2(FacesContext context, 
                UIComponent parent, PageExpressionEvaluator evaluator) {
            String resultPage = "/fr/asi/xsp/testblog/composants/xsp/cc2";
            UIIncludeComposite result = new UIIncludeComposite();
            result.setPageDriver(getPageParam().getPageDriver());
            result.setPageName(resultPage);
            return result;
        }

    }
}
