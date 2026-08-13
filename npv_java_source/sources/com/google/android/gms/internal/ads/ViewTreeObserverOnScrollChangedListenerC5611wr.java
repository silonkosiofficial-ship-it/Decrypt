package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.wr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class ViewTreeObserverOnScrollChangedListenerC5611wr extends com.google.android.gms.internal.ads.AbstractC5721xr implements android.view.ViewTreeObserver.OnScrollChangedListener {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final java.lang.ref.WeakReference f39690D;

    public ViewTreeObserverOnScrollChangedListenerC5611wr(android.view.View view, android.view.ViewTreeObserver.OnScrollChangedListener onScrollChangedListener) {
        super(view);
        this.f39690D = new java.lang.ref.WeakReference(onScrollChangedListener);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5721xr
    protected final void a(android.view.ViewTreeObserver viewTreeObserver) {
        viewTreeObserver.addOnScrollChangedListener(this);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5721xr
    protected final void b(android.view.ViewTreeObserver viewTreeObserver) {
        viewTreeObserver.removeOnScrollChangedListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        android.view.ViewTreeObserver.OnScrollChangedListener onScrollChangedListener = (android.view.ViewTreeObserver.OnScrollChangedListener) this.f39690D.get();
        if (onScrollChangedListener != null) {
            onScrollChangedListener.onScrollChanged();
        } else {
            e();
        }
    }
}
