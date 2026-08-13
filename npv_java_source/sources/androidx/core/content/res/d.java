package androidx.core.content.res;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.graphics.Shader f21498a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final android.content.res.ColorStateList f21499b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f21500c;

    private d(android.graphics.Shader shader, android.content.res.ColorStateList colorStateList, int i6) {
        this.f21498a = shader;
        this.f21499b = colorStateList;
        this.f21500c = i6;
    }

    private static androidx.core.content.res.d a(android.content.res.Resources resources, int i6, android.content.res.Resources.Theme theme) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        int next;
        android.content.res.XmlResourceParser xml = resources.getXml(i6);
        android.util.AttributeSet attributeSetAsAttributeSet = android.util.Xml.asAttributeSet(xml);
        do {
            next = xml.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new org.xmlpull.v1.XmlPullParserException("No start tag found");
        }
        java.lang.String name = xml.getName();
        name.hashCode();
        if (name.equals("gradient")) {
            return d(androidx.core.content.res.f.b(resources, xml, attributeSetAsAttributeSet, theme));
        }
        if (name.equals("selector")) {
            return c(androidx.core.content.res.c.b(resources, xml, attributeSetAsAttributeSet, theme));
        }
        throw new org.xmlpull.v1.XmlPullParserException(xml.getPositionDescription() + ": unsupported complex color tag " + name);
    }

    static androidx.core.content.res.d b(int i6) {
        return new androidx.core.content.res.d(null, null, i6);
    }

    static androidx.core.content.res.d c(android.content.res.ColorStateList colorStateList) {
        return new androidx.core.content.res.d(null, colorStateList, colorStateList.getDefaultColor());
    }

    static androidx.core.content.res.d d(android.graphics.Shader shader) {
        return new androidx.core.content.res.d(shader, null, 0);
    }

    public static androidx.core.content.res.d g(android.content.res.Resources resources, int i6, android.content.res.Resources.Theme theme) {
        try {
            return a(resources, i6, theme);
        } catch (java.lang.Exception e6) {
            return null;
        }
    }

    public int e() {
        return this.f21500c;
    }

    public android.graphics.Shader f() {
        return this.f21498a;
    }

    public boolean h() {
        return this.f21498a != null;
    }

    public boolean i() {
        android.content.res.ColorStateList colorStateList;
        return this.f21498a == null && (colorStateList = this.f21499b) != null && colorStateList.isStateful();
    }

    public boolean j(int[] iArr) {
        if (i()) {
            android.content.res.ColorStateList colorStateList = this.f21499b;
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (colorForState != this.f21500c) {
                this.f21500c = colorForState;
                return true;
            }
        }
        return false;
    }

    public void k(int i6) {
        this.f21500c = i6;
    }

    public boolean l() {
        return h() || this.f21500c != 0;
    }
}
