package p170r;

/* JADX INFO: loaded from: classes.dex */
public final class C extends p170r.AbstractC7039n {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f53286f;

    public C(int i6) {
        super(null);
        if (!(i6 >= 0)) {
            p180s.d.a("Capacity must be a positive value.");
        }
        o(p170r.V.g(i6));
    }

    public /* synthetic */ C(int i6, int i10, p247y7.AbstractC7342k abstractC7342k) {
        this((i10 & 1) != 0 ? 6 : i6);
    }

    private final void h() {
        if (this.f53396d <= 8 || java.lang.Long.compare(p087i7.G.g(p087i7.G.g(this.f53397e) * 32) ^ Long.MIN_VALUE, p087i7.G.g(p087i7.G.g(this.f53396d) * 25) ^ Long.MIN_VALUE) > 0) {
            r(p170r.V.e(this.f53396d));
        } else {
            j();
        }
    }

    private final void j() {
        int[] iArr;
        int i6;
        int i10;
        long[] jArr = this.f53393a;
        int i11 = this.f53396d;
        int[] iArr2 = this.f53394b;
        java.lang.Object[] objArr = this.f53395c;
        p170r.V.a(jArr, i11);
        char c6 = 0;
        int i12 = 0;
        int iB = -1;
        while (i12 != i11) {
            int i13 = i12 >> 3;
            int i14 = (i12 & 7) << 3;
            long j6 = (jArr[i13] >> i14) & 255;
            if (j6 == 128) {
                iB = i12;
                i12++;
            } else {
                if (j6 == 254) {
                    int i15 = iArr2[i12] * (-862048943);
                    int i16 = i15 ^ (i15 << 16);
                    int i17 = i16 >>> 7;
                    int iL = l(i17);
                    int i18 = i17 & i11;
                    if (((iL - i18) & i11) / 8 == ((i12 - i18) & i11) / 8) {
                        jArr[i13] = ((i16 & com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor.MODULE_VERSION) << i14) | ((~(255 << i14)) & jArr[i13]);
                        jArr[p097j7.AbstractC6872n.d0(jArr)] = (jArr[c6] & 72057594037927935L) | Long.MIN_VALUE;
                    } else {
                        int i19 = iL >> 3;
                        long j10 = jArr[i19];
                        int i20 = (iL & 7) << 3;
                        if (((j10 >> i20) & 255) == 128) {
                            int i21 = i12;
                            iArr = iArr2;
                            jArr[i19] = (j10 & (~(255 << i20))) | (((long) (i16 & com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor.MODULE_VERSION)) << i20);
                            jArr[i13] = (jArr[i13] & (~(255 << i14))) | (128 << i14);
                            iArr[iL] = iArr[i21];
                            iArr[i21] = 0;
                            objArr[iL] = objArr[i21];
                            objArr[i21] = null;
                            i10 = i21;
                            iB = i10;
                            i6 = i11;
                        } else {
                            int i22 = i11;
                            iArr = iArr2;
                            int i23 = i12;
                            jArr[i19] = (((long) (i16 & com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor.MODULE_VERSION)) << i20) | (j10 & (~(255 << i20)));
                            if (iB == -1) {
                                i6 = i22;
                                iB = p170r.V.b(jArr, i23 + 1, i6);
                            } else {
                                i6 = i22;
                            }
                            iArr[iB] = iArr[iL];
                            iArr[iL] = iArr[i23];
                            iArr[i23] = iArr[iB];
                            objArr[iB] = objArr[iL];
                            objArr[iL] = objArr[i23];
                            objArr[i23] = objArr[iB];
                            i10 = i23 - 1;
                        }
                        c6 = 0;
                        jArr[p097j7.AbstractC6872n.d0(jArr)] = (jArr[0] & 72057594037927935L) | Long.MIN_VALUE;
                        i12 = i10 + 1;
                        i11 = i6;
                        iArr2 = iArr;
                    }
                }
                i12++;
            }
        }
        m();
    }

    private final int k(int i6) {
        int i10 = (-862048943) * i6;
        int i11 = i10 ^ (i10 << 16);
        int i12 = i11 >>> 7;
        int i13 = i11 & com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor.MODULE_VERSION;
        int i14 = this.f53396d;
        int i15 = i12 & i14;
        int i16 = 0;
        while (true) {
            long[] jArr = this.f53393a;
            int i17 = i15 >> 3;
            int i18 = (i15 & 7) << 3;
            long j6 = ((jArr[i17 + 1] << (64 - i18)) & ((-i18) >> 63)) | (jArr[i17] >>> i18);
            long j10 = i13;
            int i19 = i16;
            long j11 = j6 ^ (j10 * 72340172838076673L);
            for (long j12 = (~j11) & (j11 - 72340172838076673L) & (-9187201950435737472L); j12 != 0; j12 &= j12 - 1) {
                int iNumberOfTrailingZeros = (i15 + (java.lang.Long.numberOfTrailingZeros(j12) >> 3)) & i14;
                if (this.f53394b[iNumberOfTrailingZeros] == i6) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((((~j6) << 6) & j6 & (-9187201950435737472L)) != 0) {
                int iL = l(i12);
                if (this.f53286f == 0 && ((this.f53393a[iL >> 3] >> ((iL & 7) << 3)) & 255) != 254) {
                    h();
                    iL = l(i12);
                }
                this.f53397e++;
                int i20 = this.f53286f;
                long[] jArr2 = this.f53393a;
                int i21 = iL >> 3;
                long j13 = jArr2[i21];
                int i22 = (iL & 7) << 3;
                this.f53286f = i20 - (((j13 >> i22) & 255) == 128 ? 1 : 0);
                int i23 = this.f53396d;
                long j14 = ((~(255 << i22)) & j13) | (j10 << i22);
                jArr2[i21] = j14;
                jArr2[(((iL - 7) & i23) + (i23 & 7)) >> 3] = j14;
                return iL;
            }
            i16 = i19 + 8;
            i15 = (i15 + i16) & i14;
        }
    }

    private final int l(int i6) {
        int i10 = this.f53396d;
        int i11 = i6 & i10;
        int i12 = 0;
        while (true) {
            long[] jArr = this.f53393a;
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

    private final void m() {
        this.f53286f = p170r.V.c(d()) - this.f53397e;
    }

    private final void n(int i6) {
        long[] jArr;
        if (i6 == 0) {
            jArr = p170r.V.f53338a;
        } else {
            jArr = new long[((i6 + 15) & (-8)) >> 3];
            p097j7.AbstractC6872n.A(jArr, -9187201950435737472L, 0, 0, 6, null);
        }
        this.f53393a = jArr;
        int i10 = i6 >> 3;
        long j6 = 255 << ((i6 & 7) << 3);
        jArr[i10] = (jArr[i10] & (~j6)) | j6;
        m();
    }

    private final void o(int i6) {
        int iMax = i6 > 0 ? java.lang.Math.max(7, p170r.V.f(i6)) : 0;
        this.f53396d = iMax;
        n(iMax);
        this.f53394b = new int[iMax];
        this.f53395c = new java.lang.Object[iMax];
    }

    private final void r(int i6) {
        p170r.C c6 = this;
        long[] jArr = c6.f53393a;
        int[] iArr = c6.f53394b;
        java.lang.Object[] objArr = c6.f53395c;
        int i10 = c6.f53396d;
        o(i6);
        long[] jArr2 = c6.f53393a;
        int[] iArr2 = c6.f53394b;
        java.lang.Object[] objArr2 = c6.f53395c;
        int i11 = c6.f53396d;
        int i12 = 0;
        while (i12 < i10) {
            if (((jArr[i12 >> 3] >> ((i12 & 7) << 3)) & 255) < 128) {
                int i13 = iArr[i12];
                int i14 = (-862048943) * i13;
                int i15 = i14 ^ (i14 << 16);
                int iL = c6.l(i15 >>> 7);
                long j6 = i15 & com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor.MODULE_VERSION;
                int i16 = iL >> 3;
                int i17 = (iL & 7) << 3;
                long j10 = (jArr2[i16] & (~(255 << i17))) | (j6 << i17);
                jArr2[i16] = j10;
                jArr2[(((iL - 7) & i11) + (i11 & 7)) >> 3] = j10;
                iArr2[iL] = i13;
                objArr2[iL] = objArr[i12];
            }
            i12++;
            c6 = this;
            jArr = jArr;
        }
    }

    public final void i() {
        this.f53397e = 0;
        long[] jArr = this.f53393a;
        if (jArr != p170r.V.f53338a) {
            p097j7.AbstractC6872n.A(jArr, -9187201950435737472L, 0, 0, 6, null);
            long[] jArr2 = this.f53393a;
            int i6 = this.f53396d;
            int i10 = i6 >> 3;
            long j6 = 255 << ((i6 & 7) << 3);
            jArr2[i10] = (jArr2[i10] & (~j6)) | j6;
        }
        p097j7.AbstractC6872n.w(this.f53395c, null, 0, this.f53396d);
        m();
    }

    public final java.lang.Object p(int i6) {
        int iNumberOfTrailingZeros;
        int i10 = (-862048943) * i6;
        int i11 = i10 ^ (i10 << 16);
        int i12 = i11 & com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor.MODULE_VERSION;
        int i13 = this.f53396d;
        int i14 = (i11 >>> 7) & i13;
        int i15 = 0;
        loop0: while (true) {
            long[] jArr = this.f53393a;
            int i16 = i14 >> 3;
            int i17 = (i14 & 7) << 3;
            long j6 = ((jArr[i16 + 1] << (64 - i17)) & ((-i17) >> 63)) | (jArr[i16] >>> i17);
            long j10 = (((long) i12) * 72340172838076673L) ^ j6;
            for (long j11 = (~j10) & (j10 - 72340172838076673L) & (-9187201950435737472L); j11 != 0; j11 &= j11 - 1) {
                iNumberOfTrailingZeros = ((java.lang.Long.numberOfTrailingZeros(j11) >> 3) + i14) & i13;
                if (this.f53394b[iNumberOfTrailingZeros] == i6) {
                    break loop0;
                }
            }
            if ((j6 & ((~j6) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            }
            i15 += 8;
            i14 = (i14 + i15) & i13;
        }
        if (iNumberOfTrailingZeros >= 0) {
            return q(iNumberOfTrailingZeros);
        }
        return null;
    }

    public final java.lang.Object q(int i6) {
        this.f53397e--;
        long[] jArr = this.f53393a;
        int i10 = this.f53396d;
        int i11 = i6 >> 3;
        int i12 = (i6 & 7) << 3;
        long j6 = (jArr[i11] & (~(255 << i12))) | (254 << i12);
        jArr[i11] = j6;
        jArr[(((i6 - 7) & i10) + (i10 & 7)) >> 3] = j6;
        java.lang.Object[] objArr = this.f53395c;
        java.lang.Object obj = objArr[i6];
        objArr[i6] = null;
        return obj;
    }

    public final void s(int i6, java.lang.Object obj) {
        int iK = k(i6);
        this.f53394b[iK] = i6;
        this.f53395c[iK] = obj;
    }
}
