package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.zr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class RunnableC5941zr implements java.lang.Runnable {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    final /* synthetic */ android.media.MediaPlayer f40403C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.TextureViewSurfaceTextureListenerC2475Ir f40404D;

    RunnableC5941zr(com.google.android.gms.internal.ads.TextureViewSurfaceTextureListenerC2475Ir textureViewSurfaceTextureListenerC2475Ir, android.media.MediaPlayer mediaPlayer) {
        this.f40403C = mediaPlayer;
        this.f40404D = textureViewSurfaceTextureListenerC2475Ir;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.internal.ads.TextureViewSurfaceTextureListenerC2475Ir.L(this.f40404D, this.f40403C);
        com.google.android.gms.internal.ads.TextureViewSurfaceTextureListenerC2475Ir textureViewSurfaceTextureListenerC2475Ir = this.f40404D;
        if (textureViewSurfaceTextureListenerC2475Ir.f28516R != null) {
            textureViewSurfaceTextureListenerC2475Ir.f28516R.e();
        }
    }
}
