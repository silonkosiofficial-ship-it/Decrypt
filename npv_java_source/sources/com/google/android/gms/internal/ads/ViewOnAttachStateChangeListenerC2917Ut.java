package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Ut, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class ViewOnAttachStateChangeListenerC2917Ut implements android.view.View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.InterfaceC3194aq f32297C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.AbstractC3097Zt f32298D;

    ViewOnAttachStateChangeListenerC2917Ut(com.google.android.gms.internal.ads.AbstractC3097Zt abstractC3097Zt, com.google.android.gms.internal.ads.InterfaceC3194aq interfaceC3194aq) {
        this.f32297C = interfaceC3194aq;
        this.f32298D = abstractC3097Zt;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(android.view.View view) {
        this.f32298D.B(view, this.f32297C, 10);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(android.view.View view) {
    }
}
