package androidx.appcompat.app;

/* JADX INFO: loaded from: classes.dex */
class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.Deque f17650a = new java.util.ArrayDeque();

    y() {
    }

    private static boolean b(org.xmlpull.v1.XmlPullParser xmlPullParser) {
        if (xmlPullParser == null) {
            return true;
        }
        try {
            return xmlPullParser.getEventType() == 3 || xmlPullParser.getEventType() == 1;
        } catch (org.xmlpull.v1.XmlPullParserException unused) {
            return true;
        }
    }

    private static org.xmlpull.v1.XmlPullParser c(java.util.Deque deque) {
        while (!deque.isEmpty()) {
            org.xmlpull.v1.XmlPullParser xmlPullParser = (org.xmlpull.v1.XmlPullParser) ((java.lang.ref.WeakReference) deque.peek()).get();
            if (!b(xmlPullParser)) {
                return xmlPullParser;
            }
            deque.pop();
        }
        return null;
    }

    private static boolean d(org.xmlpull.v1.XmlPullParser xmlPullParser, org.xmlpull.v1.XmlPullParser xmlPullParser2) {
        if (xmlPullParser2 == null || xmlPullParser == xmlPullParser2) {
            return false;
        }
        try {
            if (xmlPullParser2.getEventType() == 2) {
                return "include".equals(xmlPullParser2.getName());
            }
            return false;
        } catch (org.xmlpull.v1.XmlPullParserException unused) {
            return false;
        }
    }

    boolean a(android.util.AttributeSet attributeSet) {
        if (!(attributeSet instanceof org.xmlpull.v1.XmlPullParser)) {
            return false;
        }
        org.xmlpull.v1.XmlPullParser xmlPullParser = (org.xmlpull.v1.XmlPullParser) attributeSet;
        if (xmlPullParser.getDepth() != 1) {
            return false;
        }
        org.xmlpull.v1.XmlPullParser xmlPullParserC = c(this.f17650a);
        this.f17650a.push(new java.lang.ref.WeakReference(xmlPullParser));
        return d(xmlPullParser, xmlPullParserC);
    }
}
