package p170r;

/* JADX INFO: loaded from: classes.dex */
public final class E extends p170r.AbstractC7043s {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f53288f;

    public E(int i6) {
        super(null);
        if (!(i6 >= 0)) {
            p180s.d.a("Capacity must be a positive value.");
        }
        m(p170r.V.g(i6));
    }

    private final void f() {
        if (this.f53408d <= 8 || java.lang.Long.compare(p087i7.G.g(p087i7.G.g(this.f53409e) * 32) ^ Long.MIN_VALUE, p087i7.G.g(p087i7.G.g(this.f53408d) * 25) ^ Long.MIN_VALUE) > 0) {
            n(p170r.V.e(this.f53408d));
        } else {
            h();
        }
    }

    private final void h() {
        long[] jArr;
        int i6;
        int i10;
        long[] jArr2 = this.f53405a;
        int i11 = this.f53408d;
        long[] jArr3 = this.f53406b;
        java.lang.Object[] objArr = this.f53407c;
        p170r.V.a(jArr2, i11);
        char c6 = 0;
        int i12 = 0;
        int iB = -1;
        while (i12 != i11) {
            int i13 = i12 >> 3;
            int i14 = (i12 & 7) << 3;
            long j6 = (jArr2[i13] >> i14) & 255;
            if (j6 == 128) {
                iB = i12;
                i12++;
            } else {
                if (j6 == 254) {
                    int iA = p170r.r.a(jArr3[i12]) * (-862048943);
                    int i15 = iA ^ (iA << 16);
                    int i16 = i15 >>> 7;
                    int iJ = j(i16);
                    int i17 = i16 & i11;
                    if (((iJ - i17) & i11) / 8 == ((i12 - i17) & i11) / 8) {
                        jArr2[i13] = ((i15 & com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor.MODULE_VERSION) << i14) | ((~(255 << i14)) & jArr2[i13]);
                        jArr2[p097j7.AbstractC6872n.d0(jArr2)] = (jArr2[c6] & 72057594037927935L) | Long.MIN_VALUE;
                    } else {
                        int i18 = iJ >> 3;
                        long j10 = jArr2[i18];
                        int i19 = (iJ & 7) << 3;
                        if (((j10 >> i19) & 255) == 128) {
                            int i20 = i12;
                            jArr = jArr3;
                            jArr2[i18] = (j10 & (~(255 << i19))) | (((long) (i15 & com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor.MODULE_VERSION)) << i19);
                            jArr2[i13] = (jArr2[i13] & (~(255 << i14))) | (128 << i14);
                            jArr[iJ] = jArr[i20];
                            jArr[i20] = 0;
                            objArr[iJ] = objArr[i20];
                            objArr[i20] = null;
                            i10 = i20;
                            iB = i10;
                            i6 = i11;
                        } else {
                            int i21 = i11;
                            jArr = jArr3;
                            int i22 = i12;
                            jArr2[i18] = (((long) (i15 & com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor.MODULE_VERSION)) << i19) | (j10 & (~(255 << i19)));
                            if (iB == -1) {
                                i6 = i21;
                                iB = p170r.V.b(jArr2, i22 + 1, i6);
                            } else {
                                i6 = i21;
                            }
                            jArr[iB] = jArr[iJ];
                            jArr[iJ] = jArr[i22];
                            jArr[i22] = jArr[iB];
                            objArr[iB] = objArr[iJ];
                            objArr[iJ] = objArr[i22];
                            objArr[i22] = objArr[iB];
                            i10 = i22 - 1;
                        }
                        c6 = 0;
                        jArr2[p097j7.AbstractC6872n.d0(jArr2)] = (jArr2[0] & 72057594037927935L) | Long.MIN_VALUE;
                        i12 = i10 + 1;
                        i11 = i6;
                        jArr3 = jArr;
                    }
                }
                i12++;
            }
        }
        k();
    }

    private final int i(long j6) {
        int iA = p170r.r.a(j6) * (-862048943);
        int i6 = iA ^ (iA << 16);
        int i10 = i6 >>> 7;
        int i11 = i6 & com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor.MODULE_VERSION;
        int i12 = this.f53408d;
        int i13 = i10 & i12;
        int i14 = 0;
        while (true) {
            long[] jArr = this.f53405a;
            int i15 = i13 >> 3;
            int i16 = (i13 & 7) << 3;
            long j10 = ((jArr[i15 + 1] << (64 - i16)) & ((-i16) >> 63)) | (jArr[i15] >>> i16);
            long j11 = i11;
            int i17 = i14;
            long j12 = j10 ^ (j11 * 72340172838076673L);
            for (long j13 = (~j12) & (j12 - 72340172838076673L) & (-9187201950435737472L); j13 != 0; j13 &= j13 - 1) {
                int iNumberOfTrailingZeros = ((java.lang.Long.numberOfTrailingZeros(j13) >> 3) + i13) & i12;
                if (this.f53406b[iNumberOfTrailingZeros] == j6) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((((~j10) << 6) & j10 & (-9187201950435737472L)) != 0) {
                int iJ = j(i10);
                if (this.f53288f == 0 && ((this.f53405a[iJ >> 3] >> ((iJ & 7) << 3)) & 255) != 254) {
                    f();
                    iJ = j(i10);
                }
                this.f53409e++;
                int i18 = this.f53288f;
                long[] jArr2 = this.f53405a;
                int i19 = iJ >> 3;
                long j14 = jArr2[i19];
                int i20 = (iJ & 7) << 3;
                this.f53288f = i18 - (((j14 >> i20) & 255) == 128 ? 1 : 0);
                int i21 = this.f53408d;
                long j15 = ((~(255 << i20)) & j14) | (j11 << i20);
                jArr2[i19] = j15;
                jArr2[(((iJ - 7) & i21) + (i21 & 7)) >> 3] = j15;
                return iJ;
            }
            i14 = i17 + 8;
            i13 = (i13 + i14) & i12;
        }
    }

    private final int j(int i6) {
        int i10 = this.f53408d;
        int i11 = i6 & i10;
        int i12 = 0;
        while (true) {
            long[] jArr = this.f53405a;
            int i13 = i11 >> 3;
            int i14 = (i11 & 7) << 3;
            long j6 = ((jArr[i13 + 1] << (64 - i14)) & ((-i14) >> 63)) | (jArr[i13] >>> i14);
            long j10 = j6 & ((~j6) << 7) & (-9187201950435737472L);
            if (j10 != 0) {
                return (i11 + (java.lang.Long.numberOfTrailingZeros(j10) >> 3)) & i10;
            }
            i12 += 8;
            i11 = (i11 + i12) & i10;
        }
    }

    private final void k() {
        this.f53288f = p170r.V.c(c()) - this.f53409e;
    }

    private final void l(int i6) {
        long[] jArr;
        if (i6 == 0) {
            jArr = p170r.V.f53338a;
        } else {
            jArr = new long[((i6 + 15) & (-8)) >> 3];
            p097j7.AbstractC6872n.A(jArr, -9187201950435737472L, 0, 0, 6, null);
        }
        this.f53405a = jArr;
        int i10 = i6 >> 3;
        long j6 = 255 << ((i6 & 7) << 3);
        jArr[i10] = (jArr[i10] & (~j6)) | j6;
        k();
    }

    private final void m(int i6) {
        int iMax = i6 > 0 ? java.lang.Math.max(7, p170r.V.f(i6)) : 0;
        this.f53408d = iMax;
        l(iMax);
        this.f53406b = new long[iMax];
        this.f53407c = new java.lang.Object[iMax];
    }

    private final void n(int i6) {
        p170r.E e6 = this;
        long[] jArr = e6.f53405a;
        long[] jArr2 = e6.f53406b;
        java.lang.Object[] objArr = e6.f53407c;
        int i10 = e6.f53408d;
        m(i6);
        long[] jArr3 = e6.f53405a;
        long[] jArr4 = e6.f53406b;
        java.lang.Object[] objArr2 = e6.f53407c;
        int i11 = e6.f53408d;
        int i12 = 0;
        while (i12 < i10) {
            if (((jArr[i12 >> 3] >> ((i12 & 7) << 3)) & 255) < 128) {
                long j6 = jArr2[i12];
                int iA = p170r.r.a(j6) * (-862048943);
                int i13 = iA ^ (iA << 16);
                int iJ = e6.j(i13 >>> 7);
                long j10 = i13 & com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor.MODULE_VERSION;
                int i14 = iJ >> 3;
                int i15 = (iJ & 7) << 3;
                long j11 = (jArr3[i14] & (~(255 << i15))) | (j10 << i15);
                jArr3[i14] = j11;
                jArr3[(((iJ - 7) & i11) + (i11 & 7)) >> 3] = j11;
                jArr4[iJ] = j6;
                objArr2[iJ] = objArr[i12];
            }
            i12++;
            e6 = this;
            jArr = jArr;
        }
    }

    public final void g() {
        this.f53409e = 0;
        long[] jArr = this.f53405a;
        if (jArr != p170r.V.f53338a) {
            p097j7.AbstractC6872n.A(jArr, -9187201950435737472L, 0, 0, 6, null);
            long[] jArr2 = this.f53405a;
            int i6 = this.f53408d;
            int i10 = i6 >> 3;
            long j6 = 255 << ((i6 & 7) << 3);
            jArr2[i10] = (jArr2[i10] & (~j6)) | j6;
        }
        p097j7.AbstractC6872n.w(this.f53407c, null, 0, this.f53408d);
        k();
    }

    public final void o(long j6, java.lang.Object obj) {
        int i6 = i(j6);
        this.f53406b[i6] = j6;
        this.f53407c[i6] = obj;
    }
}
