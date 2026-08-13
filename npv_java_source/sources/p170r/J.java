package p170r;

/* JADX INFO: loaded from: classes.dex */
public final class J extends p170r.S {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f53292f;

    public J(int i6) {
        super(null);
        if (!(i6 >= 0)) {
            p180s.d.a("Capacity must be a positive value.");
        }
        n(p170r.V.g(i6));
    }

    public /* synthetic */ J(int i6, int i10, p247y7.AbstractC7342k abstractC7342k) {
        this((i10 & 1) != 0 ? 6 : i6);
    }

    private final void h() {
        if (this.f53330d <= 8 || java.lang.Long.compare(p087i7.G.g(p087i7.G.g(this.f53331e) * 32) ^ Long.MIN_VALUE, p087i7.G.g(p087i7.G.g(this.f53330d) * 25) ^ Long.MIN_VALUE) > 0) {
            o(p170r.V.e(this.f53330d));
        } else {
            i();
        }
    }

    private final void i() {
        java.lang.Object[] objArr;
        int i6;
        int i10;
        long[] jArr = this.f53327a;
        int i11 = this.f53330d;
        java.lang.Object[] objArr2 = this.f53328b;
        long[] jArr2 = this.f53329c;
        p170r.V.a(jArr, i11);
        int i12 = 0;
        int i13 = 0;
        int iB = -1;
        while (i13 != i11) {
            int i14 = i13 >> 3;
            int i15 = (i13 & 7) << 3;
            long j6 = (jArr[i14] >> i15) & 255;
            if (j6 == 128) {
                iB = i13;
                i13++;
            } else {
                if (j6 == 254) {
                    java.lang.Object obj = objArr2[i13];
                    int iHashCode = (obj != null ? obj.hashCode() : i12) * (-862048943);
                    int i16 = iHashCode ^ (iHashCode << 16);
                    int i17 = i16 >>> 7;
                    int iJ = j(i17);
                    int i18 = i17 & i11;
                    if (((iJ - i18) & i11) / 8 == ((i13 - i18) & i11) / 8) {
                        jArr[i14] = (((long) (i16 & com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor.MODULE_VERSION)) << i15) | ((~(255 << i15)) & jArr[i14]);
                        jArr[p097j7.AbstractC6872n.d0(jArr)] = (jArr[i12] & 72057594037927935L) | Long.MIN_VALUE;
                    } else {
                        int i19 = iJ >> 3;
                        long j10 = jArr[i19];
                        int i20 = (iJ & 7) << 3;
                        if (((j10 >> i20) & 255) == 128) {
                            int i21 = i13;
                            objArr = objArr2;
                            jArr[i19] = (j10 & (~(255 << i20))) | (((long) (i16 & com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor.MODULE_VERSION)) << i20);
                            jArr[i14] = (jArr[i14] & (~(255 << i15))) | (128 << i15);
                            objArr[iJ] = objArr[i21];
                            objArr[i21] = null;
                            jArr2[iJ] = jArr2[i21];
                            jArr2[i21] = 0;
                            i10 = i21;
                            iB = i10;
                            i6 = i11;
                        } else {
                            int i22 = i11;
                            objArr = objArr2;
                            int i23 = i13;
                            jArr[i19] = (((long) (i16 & com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor.MODULE_VERSION)) << i20) | (j10 & (~(255 << i20)));
                            if (iB == -1) {
                                i6 = i22;
                                iB = p170r.V.b(jArr, i23 + 1, i6);
                            } else {
                                i6 = i22;
                            }
                            objArr[iB] = objArr[iJ];
                            objArr[iJ] = objArr[i23];
                            objArr[i23] = objArr[iB];
                            jArr2[iB] = jArr2[iJ];
                            jArr2[iJ] = jArr2[i23];
                            jArr2[i23] = jArr2[iB];
                            i10 = i23 - 1;
                        }
                        i12 = 0;
                        jArr[p097j7.AbstractC6872n.d0(jArr)] = (jArr[0] & 72057594037927935L) | Long.MIN_VALUE;
                        i13 = i10 + 1;
                        i11 = i6;
                        objArr2 = objArr;
                    }
                }
                i13++;
            }
        }
        l();
    }

    private final int j(int i6) {
        int i10 = this.f53330d;
        int i11 = i6 & i10;
        int i12 = 0;
        while (true) {
            long[] jArr = this.f53327a;
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

    private final int k(java.lang.Object obj) {
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i6 = iHashCode ^ (iHashCode << 16);
        int i10 = i6 >>> 7;
        int i11 = i6 & com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor.MODULE_VERSION;
        int i12 = this.f53330d;
        int i13 = i10 & i12;
        int i14 = 0;
        while (true) {
            long[] jArr = this.f53327a;
            int i15 = i13 >> 3;
            int i16 = (i13 & 7) << 3;
            long j6 = ((jArr[i15 + 1] << (64 - i16)) & ((-i16) >> 63)) | (jArr[i15] >>> i16);
            long j10 = i11;
            int i17 = i11;
            long j11 = j6 ^ (j10 * 72340172838076673L);
            for (long j12 = (~j11) & (j11 - 72340172838076673L) & (-9187201950435737472L); j12 != 0; j12 &= j12 - 1) {
                int iNumberOfTrailingZeros = (i13 + (java.lang.Long.numberOfTrailingZeros(j12) >> 3)) & i12;
                if (p247y7.AbstractC7350t.b(this.f53328b[iNumberOfTrailingZeros], obj)) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((((~j6) << 6) & j6 & (-9187201950435737472L)) != 0) {
                int iJ = j(i10);
                if (this.f53292f == 0 && ((this.f53327a[iJ >> 3] >> ((iJ & 7) << 3)) & 255) != 254) {
                    h();
                    iJ = j(i10);
                }
                this.f53331e++;
                int i18 = this.f53292f;
                long[] jArr2 = this.f53327a;
                int i19 = iJ >> 3;
                long j13 = jArr2[i19];
                int i20 = (iJ & 7) << 3;
                this.f53292f = i18 - (((j13 >> i20) & 255) == 128 ? 1 : 0);
                int i21 = this.f53330d;
                long j14 = ((~(255 << i20)) & j13) | (j10 << i20);
                jArr2[i19] = j14;
                jArr2[(((iJ - 7) & i21) + (i21 & 7)) >> 3] = j14;
                return ~iJ;
            }
            i14 += 8;
            i13 = (i13 + i14) & i12;
            i11 = i17;
        }
    }

    private final void l() {
        this.f53292f = p170r.V.c(d()) - this.f53331e;
    }

    private final void m(int i6) {
        long[] jArr;
        if (i6 == 0) {
            jArr = p170r.V.f53338a;
        } else {
            jArr = new long[((i6 + 15) & (-8)) >> 3];
            p097j7.AbstractC6872n.A(jArr, -9187201950435737472L, 0, 0, 6, null);
        }
        this.f53327a = jArr;
        int i10 = i6 >> 3;
        long j6 = 255 << ((i6 & 7) << 3);
        jArr[i10] = (jArr[i10] & (~j6)) | j6;
        l();
    }

    private final void n(int i6) {
        int iMax = i6 > 0 ? java.lang.Math.max(7, p170r.V.f(i6)) : 0;
        this.f53330d = iMax;
        m(iMax);
        this.f53328b = new java.lang.Object[iMax];
        this.f53329c = new long[iMax];
    }

    private final void o(int i6) {
        int i10;
        long[] jArr = this.f53327a;
        java.lang.Object[] objArr = this.f53328b;
        long[] jArr2 = this.f53329c;
        int i11 = this.f53330d;
        n(i6);
        long[] jArr3 = this.f53327a;
        java.lang.Object[] objArr2 = this.f53328b;
        long[] jArr4 = this.f53329c;
        int i12 = this.f53330d;
        int i13 = 0;
        while (i13 < i11) {
            if (((jArr[i13 >> 3] >> ((i13 & 7) << 3)) & 255) < 128) {
                java.lang.Object obj = objArr[i13];
                int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
                int i14 = iHashCode ^ (iHashCode << 16);
                int iJ = j(i14 >>> 7);
                i10 = i13;
                long j6 = i14 & com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor.MODULE_VERSION;
                int i15 = iJ >> 3;
                int i16 = (iJ & 7) << 3;
                long j10 = (j6 << i16) | (jArr3[i15] & (~(255 << i16)));
                jArr3[i15] = j10;
                jArr3[(((iJ - 7) & i12) + (i12 & 7)) >> 3] = j10;
                objArr2[iJ] = obj;
                jArr4[iJ] = jArr2[i10];
            } else {
                i10 = i13;
            }
            i13 = i10 + 1;
        }
    }

    public final void p(java.lang.Object obj, long j6) {
        int iK = k(obj);
        if (iK < 0) {
            iK = ~iK;
        }
        this.f53328b[iK] = obj;
        this.f53329c[iK] = j6;
    }
}
