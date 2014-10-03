package fr.asi.xsp.testblog;
import com.ibm.xsp.library.AbstractXspLibrary;
public class TestBlogLibrary extends AbstractXspLibrary {
    @Override
    public String getLibraryId() {
        return "fr.asi.xsp.testblog.library";
    }
    @Override
    public String getPluginId() {
        return Activator.PLUGIN_ID;
    }
    @Override
    public String[] getFacesConfigFiles() {
        return new String[] {};
    }
    @Override
    public String[] getXspConfigFiles() {
        return new String[] {};
    }
}