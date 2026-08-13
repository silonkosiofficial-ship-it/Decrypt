package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
final class BA0 implements android.view.SurfaceHolder.Callback, android.view.TextureView.SurfaceTextureListener, com.google.android.gms.internal.ads.G, com.google.android.gms.internal.ads.KE0, com.google.android.gms.internal.ads.SI0, com.google.android.gms.internal.ads.InterfaceC4126jH0, com.google.android.gms.internal.ads.Dz0, com.google.android.gms.internal.ads.InterfaceC5848yz0 {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.GA0 f25912C;

    /* synthetic */ BA0(com.google.android.gms.internal.ads.GA0 ga0, com.google.android.gms.internal.ads.EA0 ea0) {
        this.f25912C = ga0;
    }

    @Override // com.google.android.gms.internal.ads.KE0
    public final void E(java.lang.String str) {
        this.f25912C.f27743p.w(str);
    }

    @Override // com.google.android.gms.internal.ads.G
    public final void J0(java.lang.String str) {
        this.f25912C.f27743p.l(str);
    }

    @Override // com.google.android.gms.internal.ads.G
    public final void K0(com.google.android.gms.internal.ads.Gz0 gz0) {
        this.f25912C.f27743p.j(gz0);
    }

    @Override // com.google.android.gms.internal.ads.G
    public final void L0(java.lang.String str, long j6, long j10) {
        this.f25912C.f27743p.f(str, j6, j10);
    }

    @Override // com.google.android.gms.internal.ads.G
    public final void M0(java.lang.Object obj, long j6) {
        this.f25912C.f27743p.h(obj, j6);
        com.google.android.gms.internal.ads.GA0 ga0 = this.f25912C;
        if (ga0.f27712E == obj) {
            com.google.android.gms.internal.ads.DL dl = ga0.f27738k;
            dl.d(26, new com.google.android.gms.internal.ads.InterfaceC3145aK() { // from class: com.google.android.gms.internal.ads.AA0
                @Override // com.google.android.gms.internal.ads.InterfaceC3145aK
                public final void b(java.lang.Object obj2) {
                }
            });
            dl.c();
        }
    }

    @Override // com.google.android.gms.internal.ads.G
    public final void N0(com.google.android.gms.internal.ads.Gz0 gz0) {
        this.f25912C.f27743p.d(gz0);
    }

    @Override // com.google.android.gms.internal.ads.KE0
    public final void O(final boolean z6) {
        com.google.android.gms.internal.ads.GA0 ga0 = this.f25912C;
        if (ga0.f27719L == z6) {
            return;
        }
        ga0.f27719L = z6;
        com.google.android.gms.internal.ads.DL dl = this.f25912C.f27738k;
        dl.d(23, new com.google.android.gms.internal.ads.InterfaceC3145aK() { // from class: com.google.android.gms.internal.ads.yA0
            @Override // com.google.android.gms.internal.ads.InterfaceC3145aK
            public final void b(java.lang.Object obj) {
                ((com.google.android.gms.internal.ads.InterfaceC2793Rh) obj).O(z6);
            }
        });
        dl.c();
    }

    @Override // com.google.android.gms.internal.ads.G
    public final void O0(java.lang.Exception exc) {
        this.f25912C.f27743p.e(exc);
    }

    @Override // com.google.android.gms.internal.ads.G
    public final void P0(com.google.android.gms.internal.ads.D d6, com.google.android.gms.internal.ads.Hz0 hz0) {
        this.f25912C.f27743p.m(d6, hz0);
    }

    @Override // com.google.android.gms.internal.ads.G
    public final void Q0(int i6, long j6) {
        this.f25912C.f27743p.o(i6, j6);
    }

    @Override // com.google.android.gms.internal.ads.G
    public final void R0(long j6, int i6) {
        this.f25912C.f27743p.q(j6, i6);
    }

    @Override // com.google.android.gms.internal.ads.G
    public final void S0(final com.google.android.gms.internal.ads.C2697Os c2697Os) {
        com.google.android.gms.internal.ads.DL dl = this.f25912C.f27738k;
        dl.d(25, new com.google.android.gms.internal.ads.InterfaceC3145aK() { // from class: com.google.android.gms.internal.ads.zA0
            @Override // com.google.android.gms.internal.ads.InterfaceC3145aK
            public final void b(java.lang.Object obj) {
                ((com.google.android.gms.internal.ads.InterfaceC2793Rh) obj).W(c2697Os);
            }
        });
        dl.c();
    }

    @Override // com.google.android.gms.internal.ads.KE0
    public final void a(java.lang.Exception exc) {
        this.f25912C.f27743p.D(exc);
    }

    @Override // com.google.android.gms.internal.ads.KE0
    public final void b(long j6) {
        this.f25912C.f27743p.b(j6);
    }

    @Override // com.google.android.gms.internal.ads.KE0
    public final void c(com.google.android.gms.internal.ads.LE0 le0) {
        this.f25912C.f27743p.G(le0);
    }

    @Override // com.google.android.gms.internal.ads.KE0
    public final void d(com.google.android.gms.internal.ads.LE0 le0) {
        this.f25912C.f27743p.u(le0);
    }

    @Override // com.google.android.gms.internal.ads.KE0
    public final void e(int i6, long j6, long j10) {
        this.f25912C.f27743p.E(i6, j6, j10);
    }

    @Override // com.google.android.gms.internal.ads.KE0
    public final void f(java.lang.String str, long j6, long j10) {
        this.f25912C.f27743p.z(str, j6, j10);
    }

    @Override // com.google.android.gms.internal.ads.KE0
    public final void g(com.google.android.gms.internal.ads.D d6, com.google.android.gms.internal.ads.Hz0 hz0) {
        this.f25912C.f27743p.g(d6, hz0);
    }

    @Override // com.google.android.gms.internal.ads.KE0
    public final void h(java.lang.Exception exc) {
        this.f25912C.f27743p.C(exc);
    }

    @Override // com.google.android.gms.internal.ads.KE0
    public final void i(com.google.android.gms.internal.ads.Gz0 gz0) {
        this.f25912C.f27743p.p(gz0);
    }

    @Override // com.google.android.gms.internal.ads.KE0
    public final void j(com.google.android.gms.internal.ads.Gz0 gz0) {
        this.f25912C.f27743p.c(gz0);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(android.graphics.SurfaceTexture surfaceTexture, int i6, int i10) {
        com.google.android.gms.internal.ads.GA0.F(this.f25912C, surfaceTexture);
        this.f25912C.Z(i6, i10);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(android.graphics.SurfaceTexture surfaceTexture) {
        this.f25912C.c0(null);
        this.f25912C.Z(0, 0);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(android.graphics.SurfaceTexture surfaceTexture, int i6, int i10) {
        this.f25912C.Z(i6, i10);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(android.graphics.SurfaceTexture surfaceTexture) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(android.view.SurfaceHolder surfaceHolder, int i6, int i10, int i11) {
        this.f25912C.Z(i10, i11);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(android.view.SurfaceHolder surfaceHolder) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(android.view.SurfaceHolder surfaceHolder) {
        this.f25912C.Z(0, 0);
    }
}
