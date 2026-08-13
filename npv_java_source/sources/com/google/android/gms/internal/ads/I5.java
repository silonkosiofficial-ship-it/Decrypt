package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class I5 implements com.google.android.gms.internal.ads.InterfaceC5750y5 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.google.android.gms.internal.ads.InterfaceC3107a1 f28391b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f28392c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f28394e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f28395f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C5128sR f28390a = new com.google.android.gms.internal.ads.C5128sR(10);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f28393d = -9223372036854775807L;

    @Override // com.google.android.gms.internal.ads.InterfaceC5750y5
    public final void a(boolean z6) {
        int i6;
        com.google.android.gms.internal.ads.LC.b(this.f28391b);
        if (this.f28392c && (i6 = this.f28394e) != 0 && this.f28395f == i6) {
            com.google.android.gms.internal.ads.LC.f(this.f28393d != -9223372036854775807L);
            this.f28391b.b(this.f28393d, 1, this.f28394e, 0, null);
            this.f28392c = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5750y5
    public final void b(com.google.android.gms.internal.ads.C5128sR c5128sR) {
        com.google.android.gms.internal.ads.LC.b(this.f28391b);
        if (this.f28392c) {
            int iR = c5128sR.r();
            int i6 = this.f28395f;
            if (i6 < 10) {
                int iMin = java.lang.Math.min(iR, 10 - i6);
                java.lang.System.arraycopy(c5128sR.n(), c5128sR.t(), this.f28390a.n(), this.f28395f, iMin);
                if (this.f28395f + iMin == 10) {
                    this.f28390a.l(0);
                    if (this.f28390a.C() != 73 || this.f28390a.C() != 68 || this.f28390a.C() != 51) {
                        com.google.android.gms.internal.ads.AbstractC3586eM.f("Id3Reader", "Discarding invalid ID3 tag");
                        this.f28392c = false;
                        return;
                    } else {
                        this.f28390a.m(3);
                        this.f28394e = this.f28390a.B() + 10;
                    }
                }
            }
            int iMin2 = java.lang.Math.min(iR, this.f28394e - this.f28395f);
            this.f28391b.a(c5128sR, iMin2);
            this.f28395f += iMin2;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5750y5
    public final void c(com.google.android.gms.internal.ads.InterfaceC5520w0 interfaceC5520w0, com.google.android.gms.internal.ads.C4543n6 c4543n6) {
        c4543n6.c();
        com.google.android.gms.internal.ads.InterfaceC3107a1 interfaceC3107a1S = interfaceC5520w0.S(c4543n6.a(), 5);
        this.f28391b = interfaceC3107a1S;
        com.google.android.gms.internal.ads.C4682oK0 c4682oK0 = new com.google.android.gms.internal.ads.C4682oK0();
        c4682oK0.m(c4543n6.b());
        c4682oK0.B("application/id3");
        interfaceC3107a1S.c(c4682oK0.H());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5750y5
    public final void d() {
        this.f28392c = false;
        this.f28393d = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5750y5
    public final void e(long j6, int i6) {
        if ((i6 & 4) == 0) {
            return;
        }
        this.f28392c = true;
        this.f28393d = j6;
        this.f28394e = 0;
        this.f28395f = 0;
    }
}
