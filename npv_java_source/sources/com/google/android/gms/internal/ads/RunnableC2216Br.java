package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Br, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class RunnableC2216Br implements java.lang.Runnable {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    final /* synthetic */ java.lang.String f26031C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    final /* synthetic */ java.lang.String f26032D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.TextureViewSurfaceTextureListenerC2475Ir f26033E;

    RunnableC2216Br(com.google.android.gms.internal.ads.TextureViewSurfaceTextureListenerC2475Ir textureViewSurfaceTextureListenerC2475Ir, java.lang.String str, java.lang.String str2) {
        this.f26031C = str;
        this.f26032D = str2;
        this.f26033E = textureViewSurfaceTextureListenerC2475Ir;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.internal.ads.TextureViewSurfaceTextureListenerC2475Ir textureViewSurfaceTextureListenerC2475Ir = this.f26033E;
        if (textureViewSurfaceTextureListenerC2475Ir.f28516R != null) {
            textureViewSurfaceTextureListenerC2475Ir.f28516R.q(this.f26031C, this.f26032D);
        }
    }
}
