package androidx.transition;

/* JADX INFO: loaded from: classes.dex */
abstract class G extends androidx.transition.D {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static boolean f23527d = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static boolean f23528e = true;

    static class a {
        static void a(android.view.View view, android.graphics.Matrix matrix) {
            view.setAnimationMatrix(matrix);
        }

        static void b(android.view.View view, android.graphics.Matrix matrix) {
            view.transformMatrixToGlobal(matrix);
        }

        static void c(android.view.View view, android.graphics.Matrix matrix) {
            view.transformMatrixToLocal(matrix);
        }
    }

    G() {
    }

    @Override // androidx.transition.D
    public void g(android.view.View view, android.graphics.Matrix matrix) {
        if (f23527d) {
            try {
                androidx.transition.G.a.b(view, matrix);
            } catch (java.lang.NoSuchMethodError unused) {
                f23527d = false;
            }
        }
    }

    @Override // androidx.transition.D
    public void h(android.view.View view, android.graphics.Matrix matrix) {
        if (f23528e) {
            try {
                androidx.transition.G.a.c(view, matrix);
            } catch (java.lang.NoSuchMethodError unused) {
                f23528e = false;
            }
        }
    }
}
