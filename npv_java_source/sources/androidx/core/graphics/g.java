package androidx.core.graphics;

/* JADX INFO: loaded from: classes.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final java.lang.ThreadLocal f21554a = new java.lang.ThreadLocal();

    static class a {
        static boolean a(android.graphics.Paint paint, java.lang.String str) {
            return paint.hasGlyph(str);
        }
    }

    public static boolean a(android.graphics.Paint paint, java.lang.String str) {
        return androidx.core.graphics.g.a.a(paint, str);
    }
}
