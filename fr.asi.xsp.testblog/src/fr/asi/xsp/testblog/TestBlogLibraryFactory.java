package fr.asi.xsp.testblog;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import com.ibm.commons.util.io.StreamUtil;
import com.ibm.jscript.ILibraryFactory;
import com.ibm.jscript.InterpretException;
public class TestBlogLibraryFactory implements ILibraryFactory {
    public String loadLibrary(String libName) throws InterpretException {
        if( !libName.endsWith(".extjss.jss") )
            return null;
        libName = libName.substring(0, libName.length() - 4);
        URL url = Activator.getDefault().getBundle().getEntry("/jss" + libName);
        if( url == null )
            return null;
        InputStream is = null;
        try {
            URLConnection conn = url.openConnection();
            is = conn.getInputStream();
            return StreamUtil.readString(is, "Cp1252");
        } catch (IOException ex) {
            throw new InterpretException(ex);
        } finally {
            StreamUtil.close(is);
        }
    }
}