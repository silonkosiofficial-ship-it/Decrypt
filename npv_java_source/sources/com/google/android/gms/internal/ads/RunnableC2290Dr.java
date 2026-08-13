package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Dr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class RunnableC2290Dr implements java.lang.Runnable {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    final /* synthetic */ int f26776C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    final /* synthetic */ int f26777D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.TextureViewSurfaceTextureListenerC2475Ir f26778E;

    RunnableC2290Dr(com.google.android.gms.internal.ads.TextureViewSurfaceTextureListenerC2475Ir textureViewSurfaceTextureListenerC2475Ir, int i6, int i10) {
        this.f26776C = i6;
        this.f26777D = i10;
        this.f26778E = textureViewSurfaceTextureListenerC2475Ir;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.internal.ads.TextureViewSurfaceTextureListenerC2475Ir textureViewSurfaceTextureListenerC2475Ir = this.f26778E;
        if (textureViewSurfaceTextureListenerC2475Ir.f28516R != null) {
            textureViewSurfaceTextureListenerC2475Ir.f28516R.F0(this.f26776C, this.f26777D);
        }
    }
}
