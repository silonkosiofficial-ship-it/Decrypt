package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
final class U3 implements com.google.android.gms.internal.ads.InterfaceC3113a4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.Z3 f32085a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f32086b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f32087c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.AbstractC3661f4 f32088d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f32089e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f32090f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f32091g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f32092h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f32093i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f32094j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f32095k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f32096l;

    public U3(com.google.android.gms.internal.ads.AbstractC3661f4 abstractC3661f4, long j6, long j10, long j11, long j12, boolean z6) {
        com.google.android.gms.internal.ads.LC.d(j6 >= 0 && j10 > j6);
        this.f32088d = abstractC3661f4;
        this.f32086b = j6;
        this.f32087c = j10;
        if (j11 == j10 - j6 || z6) {
            this.f32090f = j12;
            this.f32089e = 4;
        } else {
            this.f32089e = 0;
        }
        this.f32085a = new com.google.android.gms.internal.ads.Z3();
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001e  */
    @Override // com.google.android.gms.internal.ads.InterfaceC3113a4
    public final long a(com.google.android.gms.internal.ads.InterfaceC5300u0 interfaceC5300u0) throws java.io.IOException {
        long j6;
        com.google.android.gms.internal.ads.Z3 z6;
        long jMax;
        int i6 = this.f32089e;
        if (i6 == 0) {
            long jE = interfaceC5300u0.e();
            this.f32091g = jE;
            this.f32089e = 1;
            long j10 = this.f32087c - 65307;
            if (j10 > jE) {
                return j10;
            }
        } else if (i6 != 1) {
            if (i6 == 2) {
                long j11 = this.f32093i;
                long j12 = this.f32094j;
                if (j11 == j12) {
                    jMax = -1;
                } else {
                    long jE2 = interfaceC5300u0.e();
                    if (this.f32085a.c(interfaceC5300u0, j12)) {
                        this.f32085a.b(interfaceC5300u0, false);
                        interfaceC5300u0.j();
                        long j13 = this.f32092h;
                        com.google.android.gms.internal.ads.Z3 z10 = this.f32085a;
                        long j14 = z10.f33466b;
                        long j15 = j13 - j14;
                        int i10 = z10.f33468d + z10.f33469e;
                        if (j15 < 0 || j15 >= 72000) {
                            if (j15 < 0) {
                                this.f32094j = jE2;
                                this.f32096l = j14;
                            } else {
                                this.f32093i = ((long) i10) + interfaceC5300u0.e();
                                this.f32095k = j14;
                            }
                            long j16 = this.f32094j;
                            long j17 = this.f32093i;
                            long j18 = j16 - j17;
                            if (j18 < 100000) {
                                this.f32094j = j17;
                                jMax = j17;
                            } else {
                                jMax = java.lang.Math.max(j17, java.lang.Math.min((interfaceC5300u0.e() - (((long) i10) * (j15 <= 0 ? 2L : 1L))) + ((j15 * j18) / (this.f32096l - this.f32095k)), j16 - 1));
                            }
                        } else {
                            jMax = -1;
                        }
                    } else {
                        jMax = this.f32093i;
                        if (jMax == jE2) {
                            throw new java.io.IOException("No ogg page can be found.");
                        }
                    }
                }
                if (jMax != -1) {
                    return jMax;
                }
                this.f32089e = 3;
            } else if (i6 != 3) {
                return -1L;
            }
            while (true) {
                this.f32085a.c(interfaceC5300u0, -1L);
                this.f32085a.b(interfaceC5300u0, false);
                com.google.android.gms.internal.ads.Z3 z11 = this.f32085a;
                if (z11.f33466b > this.f32092h) {
                    interfaceC5300u0.j();
                    this.f32089e = 4;
                    return -(this.f32095k + 2);
                }
                interfaceC5300u0.I(z11.f33468d + z11.f33469e);
                this.f32093i = interfaceC5300u0.e();
                this.f32095k = this.f32085a.f33466b;
            }
        }
        this.f32085a.a();
        if (!this.f32085a.c(interfaceC5300u0, -1L)) {
            throw new java.io.EOFException();
        }
        this.f32085a.b(interfaceC5300u0, false);
        com.google.android.gms.internal.ads.Z3 z12 = this.f32085a;
        interfaceC5300u0.I(z12.f33468d + z12.f33469e);
        do {
            j6 = this.f32085a.f33466b;
            com.google.android.gms.internal.ads.Z3 z13 = this.f32085a;
            if ((z13.f33465a & 4) == 4 || !z13.c(interfaceC5300u0, -1L) || interfaceC5300u0.e() >= this.f32087c || !this.f32085a.b(interfaceC5300u0, true)) {
                break;
            }
            z6 = this.f32085a;
        } while (com.google.android.gms.internal.ads.AbstractC5630x0.e(interfaceC5300u0, z6.f33468d + z6.f33469e));
        this.f32090f = j6;
        this.f32089e = 4;
        return this.f32091g;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3113a4
    public final void b(long j6) {
        this.f32092h = java.lang.Math.max(0L, java.lang.Math.min(j6, this.f32090f - 1));
        this.f32089e = 2;
        this.f32093i = this.f32086b;
        this.f32094j = this.f32087c;
        this.f32095k = 0L;
        this.f32096l = this.f32090f;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3113a4
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.T0 d() {
        com.google.android.gms.internal.ads.T3 t6 = null;
        if (this.f32090f != 0) {
            return new com.google.android.gms.internal.ads.S3(this, t6);
        }
        return null;
    }
}
