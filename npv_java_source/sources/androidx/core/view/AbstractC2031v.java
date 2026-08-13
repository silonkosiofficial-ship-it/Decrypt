package androidx.core.view;

/* JADX INFO: renamed from: androidx.core.view.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2031v {
    public static int a(android.view.ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.getMarginEnd();
    }

    public static int b(android.view.ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.getMarginStart();
    }

    public static void c(android.view.ViewGroup.MarginLayoutParams marginLayoutParams, int i6) {
        marginLayoutParams.setMarginEnd(i6);
    }

    public static void d(android.view.ViewGroup.MarginLayoutParams marginLayoutParams, int i6) {
        marginLayoutParams.setMarginStart(i6);
    }
}
