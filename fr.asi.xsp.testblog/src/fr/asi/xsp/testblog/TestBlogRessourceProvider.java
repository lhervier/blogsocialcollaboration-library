package fr.asi.xsp.testblog;
import java.net.URL;
import javax.servlet.http.HttpServletRequest;
import com.ibm.xsp.webapp.resources.BundleResourceProvider;
public class TestBlogRessourceProvider extends BundleResourceProvider {
    public TestBlogRessourceProvider() {
        super(Activator.getDefault().getBundle(), "testblog");
    }
    @Override
    protected boolean shouldCacheResources() {
        return true;
    }
    @Override
    protected URL getResourceURL(HttpServletRequest request, String path) {
        return super.getResourceURL(request, "/ressources/" + path);
    }
}