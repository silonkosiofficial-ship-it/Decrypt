package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.h6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C3885h6 implements com.google.android.gms.internal.ads.InterfaceC3117a6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.RQ f36004a = new com.google.android.gms.internal.ads.RQ(new byte[4], 4);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.C4103j6 f36005b;

    public C3885h6(com.google.android.gms.internal.ads.C4103j6 c4103j6) {
        this.f36005b = c4103j6;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3117a6
    public final void a(com.google.android.gms.internal.ads.C3267bV c3267bV, com.google.android.gms.internal.ads.InterfaceC5520w0 interfaceC5520w0, com.google.android.gms.internal.ads.C4543n6 c4543n6) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3117a6
    public final void b(com.google.android.gms.internal.ads.C5128sR c5128sR) {
        if (c5128sR.C() == 0 && (c5128sR.C() & 128) != 0) {
            c5128sR.m(6);
            int iR = c5128sR.r() / 4;
            for (int i6 = 0; i6 < iR; i6++) {
                c5128sR.g(this.f36004a, 4);
                com.google.android.gms.internal.ads.RQ rq = this.f36004a;
                int iD = rq.d(16);
                rq.n(3);
                if (iD == 0) {
                    this.f36004a.n(13);
                } else {
                    int iD2 = this.f36004a.d(13);
                    if (this.f36005b.f36574g.get(iD2) == null) {
                        com.google.android.gms.internal.ads.C4103j6 c4103j6 = this.f36005b;
                        c4103j6.f36574g.put(iD2, new com.google.android.gms.internal.ads.C3227b6(new com.google.android.gms.internal.ads.C3995i6(c4103j6, iD2)));
                        this.f36005b.f36580m++;
                    }
                }
            }
            this.f36005b.f36574g.remove(0);
        }
    }
}
