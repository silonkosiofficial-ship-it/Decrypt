package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.xr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
abstract class AbstractC5721xr {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final java.lang.ref.WeakReference f39934C;

    public AbstractC5721xr(android.view.View view) {
        this.f39934C = new java.lang.ref.WeakReference(view);
    }

    protected abstract void a(android.view.ViewTreeObserver viewTreeObserver);

    protected abstract void b(android.view.ViewTreeObserver viewTreeObserver);

    protected final android.view.ViewTreeObserver c() {
        android.view.ViewTreeObserver viewTreeObserver;
        android.view.View view = (android.view.View) this.f39934C.get();
        if (view == null || (viewTreeObserver = view.getViewTreeObserver()) == null || !viewTreeObserver.isAlive()) {
            return null;
        }
        return viewTreeObserver;
    }

    public final void d() {
        android.view.ViewTreeObserver viewTreeObserverC = c();
        if (viewTreeObserverC != null) {
            a(viewTreeObserverC);
        }
    }

    public final void e() {
        android.view.ViewTreeObserver viewTreeObserverC = c();
        if (viewTreeObserverC != null) {
            b(viewTreeObserverC);
        }
    }
}
