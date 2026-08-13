package com.google.android.material.internal;

/* JADX INFO: loaded from: classes3.dex */
public abstract class n {

    class a implements androidx.core.view.G {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        final /* synthetic */ com.google.android.material.internal.n.c f43465C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ com.google.android.material.internal.n.d f43466D;

        a(com.google.android.material.internal.n.c cVar, com.google.android.material.internal.n.d dVar) {
            this.f43465C = cVar;
            this.f43466D = dVar;
        }

        @Override // androidx.core.view.G
        public androidx.core.view.C2038y0 a(android.view.View view, androidx.core.view.C2038y0 c2038y0) {
            return this.f43465C.a(view, c2038y0, new com.google.android.material.internal.n.d(this.f43466D));
        }
    }

    class b implements android.view.View.OnAttachStateChangeListener {
        b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(android.view.View view) {
            view.removeOnAttachStateChangeListener(this);
            androidx.core.view.X.k0(view);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(android.view.View view) {
        }
    }

    public interface c {
        androidx.core.view.C2038y0 a(android.view.View view, androidx.core.view.C2038y0 c2038y0, com.google.android.material.internal.n.d dVar);
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f43467a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f43468b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f43469c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f43470d;

        public d(int i6, int i10, int i11, int i12) {
            this.f43467a = i6;
            this.f43468b = i10;
            this.f43469c = i11;
            this.f43470d = i12;
        }

        public d(com.google.android.material.internal.n.d dVar) {
            this.f43467a = dVar.f43467a;
            this.f43468b = dVar.f43468b;
            this.f43469c = dVar.f43469c;
            this.f43470d = dVar.f43470d;
        }
    }

    public static void b(android.view.View view, com.google.android.material.internal.n.c cVar) {
        androidx.core.view.X.A0(view, new com.google.android.material.internal.n.a(cVar, new com.google.android.material.internal.n.d(androidx.core.view.X.E(view), view.getPaddingTop(), androidx.core.view.X.D(view), view.getPaddingBottom())));
        j(view);
    }

    public static float c(android.content.Context context, int i6) {
        return android.util.TypedValue.applyDimension(1, i6, context.getResources().getDisplayMetrics());
    }

    public static java.lang.Integer d(android.view.View view) {
        android.content.res.ColorStateList colorStateListF = com.google.android.material.drawable.d.f(view.getBackground());
        if (colorStateListF != null) {
            return java.lang.Integer.valueOf(colorStateListF.getDefaultColor());
        }
        return null;
    }

    private static android.view.inputmethod.InputMethodManager e(android.view.View view) {
        return (android.view.inputmethod.InputMethodManager) androidx.core.content.a.f(view.getContext(), android.view.inputmethod.InputMethodManager.class);
    }

    public static float f(android.view.View view) {
        float fU = 0.0f;
        for (android.view.ViewParent parent = view.getParent(); parent instanceof android.view.View; parent = parent.getParent()) {
            fU += androidx.core.view.X.u((android.view.View) parent);
        }
        return fU;
    }

    public static boolean g(android.view.View view) {
        return androidx.core.view.X.z(view) == 1;
    }

    public static android.graphics.PorterDuff.Mode i(int i6, android.graphics.PorterDuff.Mode mode) {
        if (i6 == 3) {
            return android.graphics.PorterDuff.Mode.SRC_OVER;
        }
        if (i6 == 5) {
            return android.graphics.PorterDuff.Mode.SRC_IN;
        }
        if (i6 == 9) {
            return android.graphics.PorterDuff.Mode.SRC_ATOP;
        }
        switch (i6) {
            case 14:
                return android.graphics.PorterDuff.Mode.MULTIPLY;
            case 15:
                return android.graphics.PorterDuff.Mode.SCREEN;
            case 16:
                return android.graphics.PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    public static void j(android.view.View view) {
        if (androidx.core.view.X.Q(view)) {
            androidx.core.view.X.k0(view);
        } else {
            view.addOnAttachStateChangeListener(new com.google.android.material.internal.n.b());
        }
    }

    public static void k(final android.view.View view, final boolean z6) {
        view.requestFocus();
        view.post(new java.lang.Runnable() { // from class: com.google.android.material.internal.m
            @Override // java.lang.Runnable
            public final void run() {
                com.google.android.material.internal.n.l(view, z6);
            }
        });
    }

    public static void l(android.view.View view, boolean z6) {
        androidx.core.view.X0 x0J;
        if (!z6 || (x0J = androidx.core.view.X.J(view)) == null) {
            e(view).showSoftInput(view, 1);
        } else {
            x0J.e(androidx.core.view.C2038y0.m.c());
        }
    }
}
