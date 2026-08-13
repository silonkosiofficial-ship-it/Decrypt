package androidx.core.graphics.drawable;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: androidx.core.graphics.drawable.a$a, reason: collision with other inner class name */
    static class C0406a {
        static void a(android.graphics.drawable.Drawable drawable, android.content.res.Resources.Theme theme) {
            drawable.applyTheme(theme);
        }

        static boolean b(android.graphics.drawable.Drawable drawable) {
            return drawable.canApplyTheme();
        }

        static android.graphics.ColorFilter c(android.graphics.drawable.Drawable drawable) {
            return drawable.getColorFilter();
        }

        static void d(android.graphics.drawable.Drawable drawable, android.content.res.Resources resources, org.xmlpull.v1.XmlPullParser xmlPullParser, android.util.AttributeSet attributeSet, android.content.res.Resources.Theme theme) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
        }

        static void e(android.graphics.drawable.Drawable drawable, float f6, float f10) {
            drawable.setHotspot(f6, f10);
        }

        static void f(android.graphics.drawable.Drawable drawable, int i6, int i10, int i11, int i12) {
            drawable.setHotspotBounds(i6, i10, i11, i12);
        }

        static void g(android.graphics.drawable.Drawable drawable, int i6) {
            drawable.setTint(i6);
        }

        static void h(android.graphics.drawable.Drawable drawable, android.content.res.ColorStateList colorStateList) {
            drawable.setTintList(colorStateList);
        }

        static void i(android.graphics.drawable.Drawable drawable, android.graphics.PorterDuff.Mode mode) {
            drawable.setTintMode(mode);
        }
    }

    static class b {
        static int a(android.graphics.drawable.Drawable drawable) {
            return drawable.getLayoutDirection();
        }

        static boolean b(android.graphics.drawable.Drawable drawable, int i6) {
            return drawable.setLayoutDirection(i6);
        }
    }

    public static void a(android.graphics.drawable.Drawable drawable, android.content.res.Resources.Theme theme) {
        androidx.core.graphics.drawable.a.C0406a.a(drawable, theme);
    }

    public static boolean b(android.graphics.drawable.Drawable drawable) {
        return androidx.core.graphics.drawable.a.C0406a.b(drawable);
    }

    public static void c(android.graphics.drawable.Drawable drawable) {
        drawable.clearColorFilter();
    }

    public static int d(android.graphics.drawable.Drawable drawable) {
        return drawable.getAlpha();
    }

    public static android.graphics.ColorFilter e(android.graphics.drawable.Drawable drawable) {
        return androidx.core.graphics.drawable.a.C0406a.c(drawable);
    }

    public static int f(android.graphics.drawable.Drawable drawable) {
        return androidx.core.graphics.drawable.a.b.a(drawable);
    }

    public static void g(android.graphics.drawable.Drawable drawable, android.content.res.Resources resources, org.xmlpull.v1.XmlPullParser xmlPullParser, android.util.AttributeSet attributeSet, android.content.res.Resources.Theme theme) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        androidx.core.graphics.drawable.a.C0406a.d(drawable, resources, xmlPullParser, attributeSet, theme);
    }

    public static boolean h(android.graphics.drawable.Drawable drawable) {
        return drawable.isAutoMirrored();
    }

    public static void i(android.graphics.drawable.Drawable drawable) {
        drawable.jumpToCurrentState();
    }

    public static void j(android.graphics.drawable.Drawable drawable, boolean z6) {
        drawable.setAutoMirrored(z6);
    }

    public static void k(android.graphics.drawable.Drawable drawable, float f6, float f10) {
        androidx.core.graphics.drawable.a.C0406a.e(drawable, f6, f10);
    }

    public static void l(android.graphics.drawable.Drawable drawable, int i6, int i10, int i11, int i12) {
        androidx.core.graphics.drawable.a.C0406a.f(drawable, i6, i10, i11, i12);
    }

    public static boolean m(android.graphics.drawable.Drawable drawable, int i6) {
        return androidx.core.graphics.drawable.a.b.b(drawable, i6);
    }

    public static void n(android.graphics.drawable.Drawable drawable, int i6) {
        androidx.core.graphics.drawable.a.C0406a.g(drawable, i6);
    }

    public static void o(android.graphics.drawable.Drawable drawable, android.content.res.ColorStateList colorStateList) {
        androidx.core.graphics.drawable.a.C0406a.h(drawable, colorStateList);
    }

    public static void p(android.graphics.drawable.Drawable drawable, android.graphics.PorterDuff.Mode mode) {
        androidx.core.graphics.drawable.a.C0406a.i(drawable, mode);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static android.graphics.drawable.Drawable q(android.graphics.drawable.Drawable drawable) {
        return drawable instanceof androidx.core.graphics.drawable.b ? ((androidx.core.graphics.drawable.b) drawable).b() : drawable;
    }

    public static android.graphics.drawable.Drawable r(android.graphics.drawable.Drawable drawable) {
        return drawable;
    }
}
