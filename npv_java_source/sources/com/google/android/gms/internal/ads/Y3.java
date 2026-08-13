package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
final class Y3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.Z3 f33264a = new com.google.android.gms.internal.ads.Z3();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C5128sR f33265b = new com.google.android.gms.internal.ads.C5128sR(new byte[65025], 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f33266c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f33267d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f33268e;

    Y3() {
    }

    private final int f(int i6) {
        int i10;
        int i11 = 0;
        this.f33267d = 0;
        do {
            int i12 = this.f33267d;
            int i13 = i6 + i12;
            com.google.android.gms.internal.ads.Z3 z6 = this.f33264a;
            if (i13 >= z6.f33467c) {
                break;
            }
            this.f33267d = i12 + 1;
            i10 = z6.f33470f[i13];
            i11 += i10;
        } while (i10 == 255);
        return i11;
    }

    public final com.google.android.gms.internal.ads.C5128sR a() {
        return this.f33265b;
    }

    public final com.google.android.gms.internal.ads.Z3 b() {
        return this.f33264a;
    }

    public final void c() {
        this.f33264a.a();
        this.f33265b.i(0);
        this.f33266c = -1;
        this.f33268e = false;
    }

    public final void d() {
        com.google.android.gms.internal.ads.C5128sR c5128sR = this.f33265b;
        if (c5128sR.n().length == 65025) {
            return;
        }
        c5128sR.j(java.util.Arrays.copyOf(c5128sR.n(), java.lang.Math.max(65025, c5128sR.u())), this.f33265b.u());
    }

    public final boolean e(com.google.android.gms.internal.ads.InterfaceC5300u0 interfaceC5300u0) {
        if (this.f33268e) {
            this.f33268e = false;
            this.f33265b.i(0);
        }
        while (true) {
            if (this.f33268e) {
                return true;
            }
            int i6 = this.f33266c;
            if (i6 < 0) {
                if (!this.f33264a.c(interfaceC5300u0, -1L) || !this.f33264a.b(interfaceC5300u0, true)) {
                    return false;
                }
                com.google.android.gms.internal.ads.Z3 z6 = this.f33264a;
                int iF = z6.f33468d;
                if ((z6.f33465a & 1) == 1 && this.f33265b.u() == 0) {
                    iF += f(0);
                    i6 = this.f33267d;
                } else {
                    i6 = 0;
                }
                if (!com.google.android.gms.internal.ads.AbstractC5630x0.e(interfaceC5300u0, iF)) {
                    return false;
                }
                this.f33266c = i6;
            }
            int iF2 = f(i6);
            int i10 = this.f33266c + this.f33267d;
            if (iF2 > 0) {
                com.google.android.gms.internal.ads.C5128sR c5128sR = this.f33265b;
                c5128sR.f(c5128sR.u() + iF2);
                com.google.android.gms.internal.ads.C5128sR c5128sR2 = this.f33265b;
                if (!com.google.android.gms.internal.ads.AbstractC5630x0.d(interfaceC5300u0, c5128sR2.n(), c5128sR2.u(), iF2)) {
                    return false;
                }
                com.google.android.gms.internal.ads.C5128sR c5128sR3 = this.f33265b;
                c5128sR3.k(c5128sR3.u() + iF2);
                this.f33268e = this.f33264a.f33470f[i10 + (-1)] != 255;
            }
            if (i10 == this.f33264a.f33467c) {
                i10 = -1;
            }
            this.f33266c = i10;
        }
    }
}
