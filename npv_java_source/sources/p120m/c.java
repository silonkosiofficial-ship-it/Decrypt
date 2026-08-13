package p120m;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {
    public static android.graphics.drawable.Drawable a(android.content.res.Resources resources, org.xmlpull.v1.XmlPullParser xmlPullParser, android.util.AttributeSet attributeSet, android.content.res.Resources.Theme theme) {
        return android.graphics.drawable.Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet, theme);
    }

    public static int b(android.content.res.TypedArray typedArray) {
        return typedArray.getChangingConfigurations();
    }

    public static void c(android.graphics.drawable.Drawable drawable, android.content.res.Resources resources, org.xmlpull.v1.XmlPullParser xmlPullParser, android.util.AttributeSet attributeSet, android.content.res.Resources.Theme theme) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        drawable.inflate(resources, xmlPullParser, attributeSet, theme);
    }
}
