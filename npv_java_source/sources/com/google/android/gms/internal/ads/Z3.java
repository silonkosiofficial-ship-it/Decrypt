package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
final class Z3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f33465a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f33466b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f33467c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f33468d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f33469e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int[] f33470f = new int[255];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C5128sR f33471g = new com.google.android.gms.internal.ads.C5128sR(255);

    Z3() {
    }

    public final void a() {
        this.f33465a = 0;
        this.f33466b = 0L;
        this.f33467c = 0;
        this.f33468d = 0;
        this.f33469e = 0;
    }

    public final boolean b(com.google.android.gms.internal.ads.InterfaceC5300u0 interfaceC5300u0, boolean z6) throws com.google.android.gms.internal.ads.C4708of {
        a();
        this.f33471g.i(27);
        if (com.google.android.gms.internal.ads.AbstractC5630x0.c(interfaceC5300u0, this.f33471g.n(), 0, 27, z6) && this.f33471g.K() == 1332176723) {
            if (this.f33471g.C() != 0) {
                if (z6) {
                    return false;
                }
                throw com.google.android.gms.internal.ads.C4708of.c("unsupported bit stream revision");
            }
            this.f33465a = this.f33471g.C();
            this.f33466b = this.f33471g.H();
            this.f33471g.I();
            this.f33471g.I();
            this.f33471g.I();
            int iC = this.f33471g.C();
            this.f33467c = iC;
            this.f33468d = iC + 27;
            this.f33471g.i(iC);
            if (com.google.android.gms.internal.ads.AbstractC5630x0.c(interfaceC5300u0, this.f33471g.n(), 0, this.f33467c, z6)) {
                for (int i6 = 0; i6 < this.f33467c; i6++) {
                    this.f33470f[i6] = this.f33471g.C();
                    this.f33469e += this.f33470f[i6];
                }
                return true;
            }
        }
        return false;
    }

    public final boolean c(com.google.android.gms.internal.ads.InterfaceC5300u0 interfaceC5300u0, long j6) {
        com.google.android.gms.internal.ads.LC.d(interfaceC5300u0.e() == interfaceC5300u0.d());
        this.f33471g.i(4);
        while (true) {
            if ((j6 != -1 && interfaceC5300u0.e() + 4 >= j6) || !com.google.android.gms.internal.ads.AbstractC5630x0.c(interfaceC5300u0, this.f33471g.n(), 0, 4, true)) {
                break;
            }
            this.f33471g.l(0);
            if (this.f33471g.K() == 1332176723) {
                interfaceC5300u0.j();
                return true;
            }
            interfaceC5300u0.I(1);
        }
        do {
            if (j6 != -1 && interfaceC5300u0.e() >= j6) {
                break;
            }
        } while (interfaceC5300u0.G(1) != -1);
        return false;
    }
}
