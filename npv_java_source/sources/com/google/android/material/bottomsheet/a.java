package com.google.android.material.bottomsheet;

/* JADX INFO: loaded from: classes3.dex */
class a extends androidx.core.view.C2013l0.b {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final android.view.View f42962E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private int f42963F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private int f42964G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private final int[] f42965H;

    public a(android.view.View view) {
        super(0);
        this.f42965H = new int[2];
        this.f42962E = view;
    }

    @Override // androidx.core.view.C2013l0.b
    public void c(androidx.core.view.C2013l0 c2013l0) {
        this.f42962E.setTranslationY(0.0f);
    }

    @Override // androidx.core.view.C2013l0.b
    public void d(androidx.core.view.C2013l0 c2013l0) {
        this.f42962E.getLocationOnScreen(this.f42965H);
        this.f42963F = this.f42965H[1];
    }

    @Override // androidx.core.view.C2013l0.b
    public androidx.core.view.C2038y0 e(androidx.core.view.C2038y0 c2038y0, java.util.List list) {
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            androidx.core.view.C2013l0 c2013l0 = (androidx.core.view.C2013l0) it.next();
            if ((c2013l0.c() & androidx.core.view.C2038y0.m.c()) != 0) {
                this.f42962E.setTranslationY(p135n4.a.c(this.f42964G, 0, c2013l0.b()));
                break;
            }
        }
        return c2038y0;
    }

    @Override // androidx.core.view.C2013l0.b
    public androidx.core.view.C2013l0.a f(androidx.core.view.C2013l0 c2013l0, androidx.core.view.C2013l0.a aVar) {
        this.f42962E.getLocationOnScreen(this.f42965H);
        int i6 = this.f42963F - this.f42965H[1];
        this.f42964G = i6;
        this.f42962E.setTranslationY(i6);
        return aVar;
    }
}
