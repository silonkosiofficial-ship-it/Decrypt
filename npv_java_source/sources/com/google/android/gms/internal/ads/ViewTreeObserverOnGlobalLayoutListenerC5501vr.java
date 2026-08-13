package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.vr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class ViewTreeObserverOnGlobalLayoutListenerC5501vr extends com.google.android.gms.internal.ads.AbstractC5721xr implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final java.lang.ref.WeakReference f39467D;

    public ViewTreeObserverOnGlobalLayoutListenerC5501vr(android.view.View view, android.view.ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        super(view);
        this.f39467D = new java.lang.ref.WeakReference(onGlobalLayoutListener);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5721xr
    protected final void a(android.view.ViewTreeObserver viewTreeObserver) {
        viewTreeObserver.addOnGlobalLayoutListener(this);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5721xr
    protected final void b(android.view.ViewTreeObserver viewTreeObserver) {
        viewTreeObserver.removeOnGlobalLayoutListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        android.view.ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = (android.view.ViewTreeObserver.OnGlobalLayoutListener) this.f39467D.get();
        if (onGlobalLayoutListener != null) {
            onGlobalLayoutListener.onGlobalLayout();
        } else {
            e();
        }
    }
}
