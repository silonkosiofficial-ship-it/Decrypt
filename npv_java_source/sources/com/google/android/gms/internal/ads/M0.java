package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class M0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f29624a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public java.lang.String f29625b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f29626c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f29627d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f29628e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f29629f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f29630g;

    public M0() {
    }

    public M0(com.google.android.gms.internal.ads.M0 m6) {
        this.f29624a = m6.f29624a;
        this.f29625b = m6.f29625b;
        this.f29626c = m6.f29626c;
        this.f29627d = m6.f29627d;
        this.f29628e = m6.f29628e;
        this.f29629f = m6.f29629f;
        this.f29630g = m6.f29630g;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0050 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:23:0x0052  */
    /* JADX WARN: Code duplicated, block: B:24:0x0059  */
    /* JADX WARN: Code duplicated, block: B:27:0x006a  */
    /* JADX WARN: Code duplicated, block: B:29:0x006e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x0070  */
    /* JADX WARN: Code duplicated, block: B:31:0x0077  */
    /* JADX WARN: Code duplicated, block: B:33:0x0083  */
    /* JADX WARN: Code duplicated, block: B:35:0x008d  */
    /* JADX WARN: Code duplicated, block: B:39:0x0099  */
    /* JADX WARN: Instruction removed from duplicated block: B:27:0x006a, please report this as an issue */
    public final boolean a(int i6) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        if (!com.google.android.gms.internal.ads.N0.m(i6) || (i10 = (i6 >>> 19) & 3) == 1 || (i11 = (i6 >>> 17) & 3) == 0 || (i12 = (i6 >>> 12) & 15) == 0 || i12 == 15 || (i13 = (i6 >>> 10) & 3) == 3) {
            return false;
        }
        int i18 = i12 - 1;
        this.f29624a = i10;
        this.f29625b = com.google.android.gms.internal.ads.N0.f30130a[3 - i11];
        int i19 = com.google.android.gms.internal.ads.N0.f30131b[i13];
        this.f29627d = i19;
        if (i10 != 2) {
            if (i10 == 0) {
                i19 /= 4;
            }
            i14 = (i6 >>> 9) & 1;
            this.f29630g = com.google.android.gms.internal.ads.N0.l(i10, i11);
            if (i11 == 3) {
                if (i10 == 3) {
                    if (i11 == 2) {
                        i15 = com.google.android.gms.internal.ads.N0.f30134e[i18];
                    } else {
                        i15 = com.google.android.gms.internal.ads.N0.f30135f[i18];
                    }
                    this.f29629f = i15;
                    i16 = ((i15 * 144) / i19) + i14;
                } else {
                    int i20 = com.google.android.gms.internal.ads.N0.f30136g[i18];
                    this.f29629f = i20;
                    this.f29626c = (((i11 == 1 ? 72 : 144) * i20) / i19) + i14;
                }
                this.f29628e = ((i6 >> 6) & 3) == 3 ? 1 : 2;
                return true;
            }
            if (i10 == 3) {
                i17 = com.google.android.gms.internal.ads.N0.f30132c[i18];
            } else {
                i17 = com.google.android.gms.internal.ads.N0.f30133d[i18];
            }
            this.f29629f = i17;
            i16 = (((i17 * 12) / i19) + i14) * 4;
            this.f29626c = i16;
            this.f29628e = ((i6 >> 6) & 3) == 3 ? 1 : 2;
            return true;
        }
        i19 /= 2;
        this.f29627d = i19;
        i14 = (i6 >>> 9) & 1;
        this.f29630g = com.google.android.gms.internal.ads.N0.l(i10, i11);
        if (i11 == 3) {
            if (i10 == 3) {
                if (i11 == 2) {
                    i15 = com.google.android.gms.internal.ads.N0.f30134e[i18];
                } else {
                    i15 = com.google.android.gms.internal.ads.N0.f30135f[i18];
                }
                this.f29629f = i15;
                i16 = ((i15 * 144) / i19) + i14;
            } else {
                int i21 = com.google.android.gms.internal.ads.N0.f30136g[i18];
                this.f29629f = i21;
                this.f29626c = (((i11 == 1 ? 72 : 144) * i21) / i19) + i14;
            }
            this.f29628e = ((i6 >> 6) & 3) == 3 ? 1 : 2;
            return true;
        }
        if (i10 == 3) {
            i17 = com.google.android.gms.internal.ads.N0.f30132c[i18];
        } else {
            i17 = com.google.android.gms.internal.ads.N0.f30133d[i18];
        }
        this.f29629f = i17;
        i16 = (((i17 * 12) / i19) + i14) * 4;
        this.f29626c = i16;
        this.f29628e = ((i6 >> 6) & 3) == 3 ? 1 : 2;
        return true;
    }
}
