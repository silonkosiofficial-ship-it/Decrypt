package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Fr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class RunnableC2364Fr implements java.lang.Runnable {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.TextureViewSurfaceTextureListenerC2475Ir f27466C;

    RunnableC2364Fr(com.google.android.gms.internal.ads.TextureViewSurfaceTextureListenerC2475Ir textureViewSurfaceTextureListenerC2475Ir) {
        this.f27466C = textureViewSurfaceTextureListenerC2475Ir;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.internal.ads.TextureViewSurfaceTextureListenerC2475Ir textureViewSurfaceTextureListenerC2475Ir = this.f27466C;
        if (textureViewSurfaceTextureListenerC2475Ir.f28516R != null) {
            if (!textureViewSurfaceTextureListenerC2475Ir.f28517S) {
                textureViewSurfaceTextureListenerC2475Ir.f28516R.i();
                this.f27466C.f28517S = true;
            }
            this.f27466C.f28516R.d();
        }
    }
}
