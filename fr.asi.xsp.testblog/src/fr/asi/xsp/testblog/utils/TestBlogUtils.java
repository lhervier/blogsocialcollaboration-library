package fr.asi.xsp.testblog.utils;
import lotus.domino.Base;
import lotus.domino.NotesException;
public class TestBlogUtils {
    public static void recycleQuietly(Base ...o) {
        if( o == null )
            return;
        for( Base b : o ) {
            if( b == null )
                continue;
            try {
                b.recycle();
            } catch(NotesException e) {
                e.printStackTrace(System.err);
            }
        }
    }
}