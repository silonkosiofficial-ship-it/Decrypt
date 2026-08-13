package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.r3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C4976r3 implements com.google.android.gms.internal.ads.InterfaceC4647o3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f38425a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f38426b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C5128sR f38427c;

    public C4976r3(com.google.android.gms.internal.ads.LZ lz, com.google.android.gms.internal.ads.D d6) {
        com.google.android.gms.internal.ads.C5128sR c5128sR = lz.f29519b;
        this.f38427c = c5128sR;
        c5128sR.l(12);
        int iF = c5128sR.F();
        if ("audio/raw".equals(d6.f26574o)) {
            int iC = com.google.android.gms.internal.ads.EW.C(d6.f26553F) * d6.f26551D;
            if (iF == 0 || iF % iC != 0) {
                com.google.android.gms.internal.ads.AbstractC3586eM.f("BoxParsers", "Audio sample size mismatch. stsd sample size: " + iC + ", stsz sample size: " + iF);
                iF = iC;
            }
        }
        this.f38425a = iF == 0 ? -1 : iF;
        this.f38426b = c5128sR.F();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4647o3
    public final int a() {
        return this.f38425a;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4647o3
    public final int b() {
        return this.f38426b;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4647o3
    public final int c() {
        int i6 = this.f38425a;
        return i6 == -1 ? this.f38427c.F() : i6;
    }
}
