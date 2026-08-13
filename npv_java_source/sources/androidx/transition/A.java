package androidx.transition;

/* JADX INFO: loaded from: classes.dex */
abstract class A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final androidx.transition.D f23521a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final android.util.Property f23522b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final android.util.Property f23523c;

    class a extends android.util.Property {
        a(java.lang.Class cls, java.lang.String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public java.lang.Float get(android.view.View view) {
            return java.lang.Float.valueOf(androidx.transition.A.b(view));
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(android.view.View view, java.lang.Float f6) {
            androidx.transition.A.e(view, f6.floatValue());
        }
    }

    class b extends android.util.Property {
        b(java.lang.Class cls, java.lang.String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public android.graphics.Rect get(android.view.View view) {
            return view.getClipBounds();
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(android.view.View view, android.graphics.Rect rect) {
            view.setClipBounds(rect);
        }
    }

    static {
        f23521a = android.os.Build.VERSION.SDK_INT >= 29 ? new androidx.transition.L() : new androidx.transition.K();
        f23522b = new androidx.transition.A.a(java.lang.Float.class, "translationAlpha");
        f23523c = new androidx.transition.A.b(android.graphics.Rect.class, "clipBounds");
    }

    static void a(android.view.View view) {
        f23521a.a(view);
    }

    static float b(android.view.View view) {
        return f23521a.b(view);
    }

    static void c(android.view.View view) {
        f23521a.c(view);
    }

    static void d(android.view.View view, int i6, int i10, int i11, int i12) {
        f23521a.d(view, i6, i10, i11, i12);
    }

    static void e(android.view.View view, float f6) {
        f23521a.e(view, f6);
    }

    static void f(android.view.View view, int i6) {
        f23521a.f(view, i6);
    }

    static void g(android.view.View view, android.graphics.Matrix matrix) {
        f23521a.g(view, matrix);
    }

    static void h(android.view.View view, android.graphics.Matrix matrix) {
        f23521a.h(view, matrix);
    }
}
