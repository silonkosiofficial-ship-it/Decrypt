package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class V0 implements com.google.android.gms.internal.ads.InterfaceC5190t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f32323a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f32324b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.lang.String f32325c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f32326d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f32327e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private com.google.android.gms.internal.ads.InterfaceC5520w0 f32328f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private com.google.android.gms.internal.ads.InterfaceC3107a1 f32329g;

    public V0(int i6, int i10, java.lang.String str) {
        this.f32323a = i6;
        this.f32324b = i10;
        this.f32325c = str;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5190t0
    public final /* synthetic */ com.google.android.gms.internal.ads.InterfaceC5190t0 c() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5190t0
    public final void e(long j6, long j10) {
        if (j6 == 0 || this.f32327e == 1) {
            this.f32327e = 1;
            this.f32326d = 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5190t0
    public final /* synthetic */ java.util.List f() {
        return com.google.android.gms.internal.ads.AbstractC3398ci0.O();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5190t0
    public final int i(com.google.android.gms.internal.ads.InterfaceC5300u0 interfaceC5300u0, com.google.android.gms.internal.ads.Q0 q6) {
        int i6 = this.f32327e;
        if (i6 != 1) {
            if (i6 == 2) {
                return -1;
            }
            throw new java.lang.IllegalStateException();
        }
        com.google.android.gms.internal.ads.InterfaceC3107a1 interfaceC3107a1 = this.f32329g;
        interfaceC3107a1.getClass();
        int iE = interfaceC3107a1.e(interfaceC5300u0, 1024, true);
        if (iE == -1) {
            this.f32327e = 2;
            this.f32329g.b(0L, 1, this.f32326d, 0, null);
            this.f32326d = 0;
        } else {
            this.f32326d += iE;
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5190t0
    public final boolean j(com.google.android.gms.internal.ads.InterfaceC5300u0 interfaceC5300u0) {
        com.google.android.gms.internal.ads.LC.f((this.f32323a == -1 || this.f32324b == -1) ? false : true);
        com.google.android.gms.internal.ads.C5128sR c5128sR = new com.google.android.gms.internal.ads.C5128sR(this.f32324b);
        ((com.google.android.gms.internal.ads.C3983i0) interfaceC5300u0).L(c5128sR.n(), 0, this.f32324b, false);
        return c5128sR.G() == this.f32323a;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5190t0
    public final void k(com.google.android.gms.internal.ads.InterfaceC5520w0 interfaceC5520w0) {
        this.f32328f = interfaceC5520w0;
        com.google.android.gms.internal.ads.InterfaceC3107a1 interfaceC3107a1S = interfaceC5520w0.S(1024, 4);
        this.f32329g = interfaceC3107a1S;
        com.google.android.gms.internal.ads.C4682oK0 c4682oK0 = new com.google.android.gms.internal.ads.C4682oK0();
        c4682oK0.B(this.f32325c);
        interfaceC3107a1S.c(c4682oK0.H());
        this.f32328f.Q();
        this.f32328f.R(new com.google.android.gms.internal.ads.W0(-9223372036854775807L));
        this.f32327e = 1;
    }
}
