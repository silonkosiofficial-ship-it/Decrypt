package androidx.core.widget;

/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    static class a {
        static void a(android.widget.EdgeEffect edgeEffect, float f6, float f10) {
            edgeEffect.onPull(f6, f10);
        }
    }

    private static class b {
        public static android.widget.EdgeEffect a(android.content.Context context, android.util.AttributeSet attributeSet) {
            try {
                return new android.widget.EdgeEffect(context, attributeSet);
            } catch (java.lang.Throwable unused) {
                return new android.widget.EdgeEffect(context);
            }
        }

        public static float b(android.widget.EdgeEffect edgeEffect) {
            try {
                return edgeEffect.getDistance();
            } catch (java.lang.Throwable unused) {
                return 0.0f;
            }
        }

        public static float c(android.widget.EdgeEffect edgeEffect, float f6, float f10) {
            try {
                return edgeEffect.onPullDistance(f6, f10);
            } catch (java.lang.Throwable unused) {
                edgeEffect.onPull(f6, f10);
                return 0.0f;
            }
        }
    }

    public static android.widget.EdgeEffect a(android.content.Context context, android.util.AttributeSet attributeSet) {
        return android.os.Build.VERSION.SDK_INT >= 31 ? androidx.core.widget.d.b.a(context, attributeSet) : new android.widget.EdgeEffect(context);
    }

    public static float b(android.widget.EdgeEffect edgeEffect) {
        if (android.os.Build.VERSION.SDK_INT >= 31) {
            return androidx.core.widget.d.b.b(edgeEffect);
        }
        return 0.0f;
    }

    public static void c(android.widget.EdgeEffect edgeEffect, float f6, float f10) {
        androidx.core.widget.d.a.a(edgeEffect, f6, f10);
    }

    public static float d(android.widget.EdgeEffect edgeEffect, float f6, float f10) {
        if (android.os.Build.VERSION.SDK_INT >= 31) {
            return androidx.core.widget.d.b.c(edgeEffect, f6, f10);
        }
        c(edgeEffect, f6, f10);
        return f6;
    }
}
