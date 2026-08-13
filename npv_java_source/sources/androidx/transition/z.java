package androidx.transition;

/* JADX INFO: loaded from: classes.dex */
abstract class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static boolean f23684a = true;

    static class a {
        static int a(android.view.ViewGroup viewGroup, int i6) {
            return viewGroup.getChildDrawingOrder(i6);
        }

        static void b(android.view.ViewGroup viewGroup, boolean z6) {
            viewGroup.suppressLayout(z6);
        }
    }

    private static void a(android.view.ViewGroup viewGroup, boolean z6) {
        if (f23684a) {
            try {
                androidx.transition.z.a.b(viewGroup, z6);
            } catch (java.lang.NoSuchMethodError unused) {
                f23684a = false;
            }
        }
    }

    static void b(android.view.ViewGroup viewGroup, boolean z6) {
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            androidx.transition.z.a.b(viewGroup, z6);
        } else {
            a(viewGroup, z6);
        }
    }
}
