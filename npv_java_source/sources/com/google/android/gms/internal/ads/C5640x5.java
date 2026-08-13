package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.x5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5640x5 implements com.google.android.gms.internal.ads.InterfaceC5750y5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.List f39780a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC3107a1[] f39781b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f39782c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f39783d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f39784e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f39785f = -9223372036854775807L;

    public C5640x5(java.util.List list) {
        this.f39780a = list;
        this.f39781b = new com.google.android.gms.internal.ads.InterfaceC3107a1[list.size()];
    }

    private final boolean f(com.google.android.gms.internal.ads.C5128sR c5128sR, int i6) {
        if (c5128sR.r() == 0) {
            return false;
        }
        if (c5128sR.C() != i6) {
            this.f39782c = false;
        }
        this.f39783d--;
        return this.f39782c;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5750y5
    public final void a(boolean z6) {
        if (this.f39782c) {
            com.google.android.gms.internal.ads.LC.f(this.f39785f != -9223372036854775807L);
            for (com.google.android.gms.internal.ads.InterfaceC3107a1 interfaceC3107a1 : this.f39781b) {
                interfaceC3107a1.b(this.f39785f, 1, this.f39784e, 0, null);
            }
            this.f39782c = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5750y5
    public final void b(com.google.android.gms.internal.ads.C5128sR c5128sR) {
        if (this.f39782c) {
            if (this.f39783d != 2 || f(c5128sR, 32)) {
                if (this.f39783d != 1 || f(c5128sR, 0)) {
                    int iT = c5128sR.t();
                    int iR = c5128sR.r();
                    for (com.google.android.gms.internal.ads.InterfaceC3107a1 interfaceC3107a1 : this.f39781b) {
                        c5128sR.l(iT);
                        interfaceC3107a1.a(c5128sR, iR);
                    }
                    this.f39784e += iR;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5750y5
    public final void c(com.google.android.gms.internal.ads.InterfaceC5520w0 interfaceC5520w0, com.google.android.gms.internal.ads.C4543n6 c4543n6) {
        for (int i6 = 0; i6 < this.f39781b.length; i6++) {
            com.google.android.gms.internal.ads.C4213k6 c4213k6 = (com.google.android.gms.internal.ads.C4213k6) this.f39780a.get(i6);
            c4543n6.c();
            com.google.android.gms.internal.ads.InterfaceC3107a1 interfaceC3107a1S = interfaceC5520w0.S(c4543n6.a(), 3);
            com.google.android.gms.internal.ads.C4682oK0 c4682oK0 = new com.google.android.gms.internal.ads.C4682oK0();
            c4682oK0.m(c4543n6.b());
            c4682oK0.B("application/dvbsubs");
            c4682oK0.n(java.util.Collections.singletonList(c4213k6.f36897b));
            c4682oK0.q(c4213k6.f36896a);
            interfaceC3107a1S.c(c4682oK0.H());
            this.f39781b[i6] = interfaceC3107a1S;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5750y5
    public final void d() {
        this.f39782c = false;
        this.f39785f = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5750y5
    public final void e(long j6, int i6) {
        if ((i6 & 4) == 0) {
            return;
        }
        this.f39782c = true;
        this.f39785f = j6;
        this.f39784e = 0;
        this.f39783d = 2;
    }
}
