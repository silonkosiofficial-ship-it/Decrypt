package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class S5 implements com.google.android.gms.internal.ads.InterfaceC3117a6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.google.android.gms.internal.ads.D f31545a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.google.android.gms.internal.ads.C3267bV f31546b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private com.google.android.gms.internal.ads.InterfaceC3107a1 f31547c;

    public S5(java.lang.String str) {
        com.google.android.gms.internal.ads.C4682oK0 c4682oK0 = new com.google.android.gms.internal.ads.C4682oK0();
        c4682oK0.B(str);
        this.f31545a = c4682oK0.H();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3117a6
    public final void a(com.google.android.gms.internal.ads.C3267bV c3267bV, com.google.android.gms.internal.ads.InterfaceC5520w0 interfaceC5520w0, com.google.android.gms.internal.ads.C4543n6 c4543n6) {
        this.f31546b = c3267bV;
        c4543n6.c();
        com.google.android.gms.internal.ads.InterfaceC3107a1 interfaceC3107a1S = interfaceC5520w0.S(c4543n6.a(), 5);
        this.f31547c = interfaceC3107a1S;
        interfaceC3107a1S.c(this.f31545a);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3117a6
    public final void b(com.google.android.gms.internal.ads.C5128sR c5128sR) {
        com.google.android.gms.internal.ads.LC.b(this.f31546b);
        int i6 = com.google.android.gms.internal.ads.EW.f27061a;
        long jE = this.f31546b.e();
        long jF = this.f31546b.f();
        if (jE == -9223372036854775807L || jF == -9223372036854775807L) {
            return;
        }
        com.google.android.gms.internal.ads.D d6 = this.f31545a;
        if (jF != d6.f26579t) {
            com.google.android.gms.internal.ads.C4682oK0 c4682oK0B = d6.b();
            c4682oK0B.F(jF);
            com.google.android.gms.internal.ads.D dH = c4682oK0B.H();
            this.f31545a = dH;
            this.f31547c.c(dH);
        }
        int iR = c5128sR.r();
        this.f31547c.a(c5128sR, iR);
        this.f31547c.b(jE, 1, iR, 0, null);
    }
}
