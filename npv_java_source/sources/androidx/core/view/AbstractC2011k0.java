package androidx.core.view;

/* JADX INFO: renamed from: androidx.core.view.k0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2011k0 {

    /* JADX INFO: renamed from: androidx.core.view.k0$a */
    static class a {
        static void a(android.view.Window window, boolean z6) {
            android.view.View decorView = window.getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            decorView.setSystemUiVisibility(z6 ? systemUiVisibility & (-1793) : systemUiVisibility | 1792);
        }
    }

    /* JADX INFO: renamed from: androidx.core.view.k0$b */
    static class b {
        static void a(android.view.Window window, boolean z6) {
            window.setDecorFitsSystemWindows(z6);
        }
    }

    public static androidx.core.view.X0 a(android.view.Window window, android.view.View view) {
        return new androidx.core.view.X0(window, view);
    }

    public static void b(android.view.Window window, boolean z6) {
        if (android.os.Build.VERSION.SDK_INT >= 30) {
            androidx.core.view.AbstractC2011k0.b.a(window, z6);
        } else {
            androidx.core.view.AbstractC2011k0.a.a(window, z6);
        }
    }
}
