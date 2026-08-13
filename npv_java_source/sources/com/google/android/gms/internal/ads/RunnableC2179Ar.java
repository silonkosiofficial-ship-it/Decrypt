package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Ar, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class RunnableC2179Ar implements java.lang.Runnable {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.TextureViewSurfaceTextureListenerC2475Ir f25794C;

    RunnableC2179Ar(com.google.android.gms.internal.ads.TextureViewSurfaceTextureListenerC2475Ir textureViewSurfaceTextureListenerC2475Ir) {
        this.f25794C = textureViewSurfaceTextureListenerC2475Ir;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.internal.ads.TextureViewSurfaceTextureListenerC2475Ir textureViewSurfaceTextureListenerC2475Ir = this.f25794C;
        if (textureViewSurfaceTextureListenerC2475Ir.f28516R != null) {
            textureViewSurfaceTextureListenerC2475Ir.f28516R.a();
        }
    }
}
