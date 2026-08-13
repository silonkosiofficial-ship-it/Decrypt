package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
final class A3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.google.android.gms.internal.ads.InterfaceC3107a1 f25022a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public com.google.android.gms.internal.ads.Q3 f25025d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public com.google.android.gms.internal.ads.C5526w3 f25026e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f25027f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f25028g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f25029h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f25030i;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f25033l;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.google.android.gms.internal.ads.P3 f25023b = new com.google.android.gms.internal.ads.P3();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.google.android.gms.internal.ads.C5128sR f25024c = new com.google.android.gms.internal.ads.C5128sR();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C5128sR f25031j = new com.google.android.gms.internal.ads.C5128sR(1);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C5128sR f25032k = new com.google.android.gms.internal.ads.C5128sR();

    public A3(com.google.android.gms.internal.ads.InterfaceC3107a1 interfaceC3107a1, com.google.android.gms.internal.ads.Q3 q6, com.google.android.gms.internal.ads.C5526w3 c5526w3) {
        this.f25022a = interfaceC3107a1;
        this.f25025d = q6;
        this.f25026e = c5526w3;
        h(q6, c5526w3);
    }

    public final int a() {
        int i6;
        if (this.f25033l) {
            i6 = this.f25023b.f30630j[this.f25027f] ? 1 : 0;
        } else {
            i6 = this.f25025d.f30871g[this.f25027f];
        }
        return f() != null ? i6 | 1073741824 : i6;
    }

    public final int b() {
        return !this.f25033l ? this.f25025d.f30868d[this.f25027f] : this.f25023b.f30628h[this.f25027f];
    }

    public final int c(int i6, int i10) {
        com.google.android.gms.internal.ads.C5128sR c5128sR;
        com.google.android.gms.internal.ads.O3 o3F = f();
        if (o3F == null) {
            return 0;
        }
        int i11 = o3F.f30440d;
        if (i11 != 0) {
            c5128sR = this.f25023b.f30634n;
        } else {
            byte[] bArr = o3F.f30441e;
            int i12 = com.google.android.gms.internal.ads.EW.f27061a;
            com.google.android.gms.internal.ads.C5128sR c5128sR2 = this.f25032k;
            int length = bArr.length;
            c5128sR2.j(bArr, length);
            c5128sR = this.f25032k;
            i11 = length;
        }
        boolean zB = this.f25023b.b(this.f25027f);
        boolean z6 = zB || i10 != 0;
        com.google.android.gms.internal.ads.C5128sR c5128sR3 = this.f25031j;
        c5128sR3.n()[0] = (byte) ((true != z6 ? 0 : 128) | i11);
        c5128sR3.l(0);
        this.f25022a.g(this.f25031j, 1, 1);
        this.f25022a.g(c5128sR, i11, 1);
        if (!z6) {
            return i11 + 1;
        }
        if (!zB) {
            this.f25024c.i(8);
            com.google.android.gms.internal.ads.C5128sR c5128sR4 = this.f25024c;
            byte[] bArrN = c5128sR4.n();
            bArrN[0] = 0;
            bArrN[1] = 1;
            bArrN[2] = 0;
            bArrN[3] = (byte) i10;
            bArrN[4] = (byte) ((i6 >> 24) & 255);
            bArrN[5] = (byte) ((i6 >> 16) & 255);
            bArrN[6] = (byte) ((i6 >> 8) & 255);
            bArrN[7] = (byte) (i6 & 255);
            this.f25022a.g(c5128sR4, 8, 1);
            return i11 + 9;
        }
        int i13 = i11 + 1;
        com.google.android.gms.internal.ads.C5128sR c5128sR5 = this.f25023b.f30634n;
        int iG = c5128sR5.G();
        c5128sR5.m(-2);
        int i14 = (iG * 6) + 2;
        if (i10 != 0) {
            this.f25024c.i(i14);
            byte[] bArrN2 = this.f25024c.n();
            c5128sR5.h(bArrN2, 0, i14);
            int i15 = (((bArrN2[2] & 255) << 8) | (bArrN2[3] & 255)) + i10;
            bArrN2[2] = (byte) ((i15 >> 8) & 255);
            bArrN2[3] = (byte) (i15 & 255);
            c5128sR5 = this.f25024c;
        }
        this.f25022a.g(c5128sR5, i14, 1);
        return i13 + i14;
    }

    public final long d() {
        return !this.f25033l ? this.f25025d.f30867c[this.f25027f] : this.f25023b.f30626f[this.f25029h];
    }

    public final long e() {
        if (!this.f25033l) {
            return this.f25025d.f30870f[this.f25027f];
        }
        com.google.android.gms.internal.ads.P3 p6 = this.f25023b;
        return p6.f30629i[this.f25027f];
    }

    public final com.google.android.gms.internal.ads.O3 f() {
        if (!this.f25033l) {
            return null;
        }
        com.google.android.gms.internal.ads.P3 p6 = this.f25023b;
        com.google.android.gms.internal.ads.C5526w3 c5526w3 = p6.f30621a;
        int i6 = com.google.android.gms.internal.ads.EW.f27061a;
        int i10 = c5526w3.f39510a;
        com.google.android.gms.internal.ads.O3 o3B = p6.f30633m;
        if (o3B == null) {
            o3B = this.f25025d.f30865a.b(i10);
        }
        if (o3B == null || !o3B.f30437a) {
            return null;
        }
        return o3B;
    }

    public final void h(com.google.android.gms.internal.ads.Q3 q6, com.google.android.gms.internal.ads.C5526w3 c5526w3) {
        this.f25025d = q6;
        this.f25026e = c5526w3;
        this.f25022a.c(q6.f30865a.f30153g);
        i();
    }

    public final void i() {
        com.google.android.gms.internal.ads.P3 p6 = this.f25023b;
        p6.f30624d = 0;
        p6.f30636p = 0L;
        p6.f30637q = false;
        p6.f30631k = false;
        p6.f30635o = false;
        p6.f30633m = null;
        this.f25027f = 0;
        this.f25029h = 0;
        this.f25028g = 0;
        this.f25030i = 0;
        this.f25033l = false;
    }

    public final boolean k() {
        this.f25027f++;
        if (!this.f25033l) {
            return false;
        }
        int i6 = this.f25028g + 1;
        this.f25028g = i6;
        int[] iArr = this.f25023b.f30627g;
        int i10 = this.f25029h;
        if (i6 != iArr[i10]) {
            return true;
        }
        this.f25029h = i10 + 1;
        this.f25028g = 0;
        return false;
    }
}
