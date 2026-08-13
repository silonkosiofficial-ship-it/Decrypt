package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.tu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class BinderC5287tu extends p184s3.X0 {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC3746fs f39044C;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final boolean f39046E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final boolean f39047F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private int f39048G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private p184s3.InterfaceC7081b1 f39049H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private boolean f39050I;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private float f39052K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private float f39053L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private float f39054M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private boolean f39055N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private boolean f39056O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private com.google.android.gms.internal.ads.C2974Wh f39057P;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final java.lang.Object f39045D = new java.lang.Object();

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private boolean f39051J = true;

    public BinderC5287tu(com.google.android.gms.internal.ads.InterfaceC3746fs interfaceC3746fs, float f6, boolean z6, boolean z10) {
        this.f39044C = interfaceC3746fs;
        this.f39052K = f6;
        this.f39046E = z6;
        this.f39047F = z10;
    }

    private final void v6(final int i6, final int i10, final boolean z6, final boolean z10) {
        com.google.android.gms.internal.ads.AbstractC3524dr.f34800f.execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.su
            @Override // java.lang.Runnable
            public final void run() {
                this.f38813C.q6(i6, i10, z6, z10);
            }
        });
    }

    private final void w6(java.lang.String str, java.util.Map map) {
        final java.util.HashMap map2 = map == null ? new java.util.HashMap() : new java.util.HashMap(map);
        map2.put("action", str);
        com.google.android.gms.internal.ads.AbstractC3524dr.f34800f.execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.ru
            @Override // java.lang.Runnable
            public final void run() {
                this.f38571C.r6(map2);
            }
        });
    }

    public final void A() {
        boolean z6;
        int i6;
        synchronized (this.f39045D) {
            z6 = this.f39051J;
            i6 = this.f39048G;
            this.f39048G = 3;
        }
        v6(i6, 3, z6, z6);
    }

    @Override // p184s3.Y0
    public final void b4(p184s3.InterfaceC7081b1 interfaceC7081b1) {
        synchronized (this.f39045D) {
            this.f39049H = interfaceC7081b1;
        }
    }

    @Override // p184s3.Y0
    public final float d() {
        float f6;
        synchronized (this.f39045D) {
            f6 = this.f39054M;
        }
        return f6;
    }

    @Override // p184s3.Y0
    public final float e() {
        float f6;
        synchronized (this.f39045D) {
            f6 = this.f39053L;
        }
        return f6;
    }

    @Override // p184s3.Y0
    public final int g() {
        int i6;
        synchronized (this.f39045D) {
            i6 = this.f39048G;
        }
        return i6;
    }

    @Override // p184s3.Y0
    public final p184s3.InterfaceC7081b1 h() {
        p184s3.InterfaceC7081b1 interfaceC7081b1;
        synchronized (this.f39045D) {
            interfaceC7081b1 = this.f39049H;
        }
        return interfaceC7081b1;
    }

    @Override // p184s3.Y0
    public final float i() {
        float f6;
        synchronized (this.f39045D) {
            f6 = this.f39052K;
        }
        return f6;
    }

    @Override // p184s3.Y0
    public final void k() {
        w6("pause", null);
    }

    @Override // p184s3.Y0
    public final void l() {
        w6("play", null);
    }

    @Override // p184s3.Y0
    public final void l0(boolean z6) {
        w6(true != z6 ? "unmute" : "mute", null);
    }

    @Override // p184s3.Y0
    public final void n() {
        w6("stop", null);
    }

    @Override // p184s3.Y0
    public final boolean p() {
        boolean z6;
        java.lang.Object obj = this.f39045D;
        boolean zQ = q();
        synchronized (obj) {
            z6 = false;
            if (!zQ) {
                try {
                    if (this.f39056O && this.f39047F) {
                        z6 = true;
                    }
                } catch (java.lang.Throwable th) {
                    throw th;
                }
            }
        }
        return z6;
    }

    public final void p6(float f6, float f10, int i6, boolean z6, float f11) {
        boolean z10;
        boolean z11;
        int i10;
        synchronized (this.f39045D) {
            try {
                z10 = true;
                if (f10 == this.f39052K && f11 == this.f39054M) {
                    z10 = false;
                }
                this.f39052K = f10;
                if (!((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.Gc)).booleanValue()) {
                    this.f39053L = f6;
                }
                z11 = this.f39051J;
                this.f39051J = z6;
                i10 = this.f39048G;
                this.f39048G = i6;
                float f12 = this.f39054M;
                this.f39054M = f11;
                if (java.lang.Math.abs(f11 - f12) > 1.0E-4f) {
                    this.f39044C.N().invalidate();
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        if (z10) {
            try {
                com.google.android.gms.internal.ads.C2974Wh c2974Wh = this.f39057P;
                if (c2974Wh != null) {
                    c2974Wh.d();
                }
            } catch (android.os.RemoteException e6) {
                p224w3.p.i("#007 Could not call remote method.", e6);
            }
        }
        v6(i10, i6, z11, z6);
    }

    @Override // p184s3.Y0
    public final boolean q() {
        boolean z6;
        synchronized (this.f39045D) {
            try {
                z6 = false;
                if (this.f39046E && this.f39055N) {
                    z6 = true;
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        return z6;
    }

    final /* synthetic */ void q6(int i6, int i10, boolean z6, boolean z10) {
        int i11;
        boolean z11;
        boolean z12;
        p184s3.InterfaceC7081b1 interfaceC7081b1;
        p184s3.InterfaceC7081b1 interfaceC7081b2;
        p184s3.InterfaceC7081b1 interfaceC7081b3;
        synchronized (this.f39045D) {
            try {
                boolean z13 = this.f39050I;
                if (z13 || i10 != 1) {
                    i11 = i10;
                    z11 = false;
                } else {
                    i10 = 1;
                    i11 = 1;
                    z11 = true;
                }
                boolean z14 = i6 != i10;
                if (z14 && i11 == 1) {
                    z12 = true;
                    i11 = 1;
                } else {
                    z12 = false;
                }
                boolean z15 = z14 && i11 == 2;
                boolean z16 = z14 && i11 == 3;
                this.f39050I = z13 || z11;
                if (z11) {
                    try {
                        p184s3.InterfaceC7081b1 interfaceC7081b4 = this.f39049H;
                        if (interfaceC7081b4 != null) {
                            interfaceC7081b4.h();
                        }
                    } catch (android.os.RemoteException e6) {
                        p224w3.p.i("#007 Could not call remote method.", e6);
                    }
                }
                if (z12 && (interfaceC7081b3 = this.f39049H) != null) {
                    interfaceC7081b3.g();
                }
                if (z15 && (interfaceC7081b2 = this.f39049H) != null) {
                    interfaceC7081b2.i();
                }
                if (z16) {
                    p184s3.InterfaceC7081b1 interfaceC7081b5 = this.f39049H;
                    if (interfaceC7081b5 != null) {
                        interfaceC7081b5.d();
                    }
                    this.f39044C.z();
                }
                if (z6 != z10 && (interfaceC7081b1 = this.f39049H) != null) {
                    interfaceC7081b1.F0(z10);
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    final /* synthetic */ void r6(java.util.Map map) {
        this.f39044C.O("pubVideoCmd", map);
    }

    @Override // p184s3.Y0
    public final boolean s() {
        boolean z6;
        synchronized (this.f39045D) {
            z6 = this.f39051J;
        }
        return z6;
    }

    public final void s6(p184s3.Q1 q6) {
        java.lang.Object obj = this.f39045D;
        boolean z6 = q6.f54139C;
        boolean z10 = q6.f54140D;
        boolean z11 = q6.f54141E;
        synchronized (obj) {
            this.f39055N = z10;
            this.f39056O = z11;
        }
        w6("initialState", V3.g.c("muteStart", true != z6 ? "0" : "1", "customControlsRequested", true != z10 ? "0" : "1", "clickToExpandRequested", true != z11 ? "0" : "1"));
    }

    public final void t6(float f6) {
        synchronized (this.f39045D) {
            this.f39053L = f6;
        }
    }

    public final void u6(com.google.android.gms.internal.ads.C2974Wh c2974Wh) {
        synchronized (this.f39045D) {
            this.f39057P = c2974Wh;
        }
    }
}
