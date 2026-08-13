package p170r;

/* JADX INFO: loaded from: classes.dex */
public final class F extends p170r.AbstractC7044t {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f53289e;

    public F(int i6) {
        super(null);
        if (!(i6 >= 0)) {
            p180s.d.a("Capacity must be a positive value.");
        }
        k(p170r.V.g(i6));
    }

    private final void e() {
        if (this.f53412c <= 8 || java.lang.Long.compare(p087i7.G.g(p087i7.G.g(this.f53413d) * 32) ^ Long.MIN_VALUE, p087i7.G.g(p087i7.G.g(this.f53412c) * 25) ^ Long.MIN_VALUE) > 0) {
            o(p170r.V.e(this.f53412c));
        } else {
            f();
        }
    }

    private final void f() {
        int i6;
        long[] jArr = this.f53410a;
        int i10 = this.f53412c;
        long[] jArr2 = this.f53411b;
        p170r.V.a(jArr, i10);
        char c6 = 0;
        int i11 = 0;
        int iB = -1;
        while (i11 != i10) {
            int i12 = i11 >> 3;
            int i13 = (i11 & 7) << 3;
            long j6 = (jArr[i12] >> i13) & 255;
            if (j6 == 128) {
                iB = i11;
                i11++;
            } else {
                if (j6 == 254) {
                    int iA = p170r.r.a(jArr2[i11]) * (-862048943);
                    int i14 = iA ^ (iA << 16);
                    int i15 = i14 >>> 7;
                    int iH = h(i15);
                    int i16 = i15 & i10;
                    if (((iH - i16) & i10) / 8 == ((i11 - i16) & i10) / 8) {
                        jArr[i12] = ((i14 & com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor.MODULE_VERSION) << i13) | ((~(255 << i13)) & jArr[i12]);
                        jArr[p097j7.AbstractC6872n.d0(jArr)] = (jArr[c6] & 72057594037927935L) | Long.MIN_VALUE;
                    } else {
                        int i17 = iH >> 3;
                        long j10 = jArr[i17];
                        int i18 = (iH & 7) << 3;
                        if (((j10 >> i18) & 255) == 128) {
                            int i19 = i11;
                            jArr[i17] = (((long) (i14 & com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor.MODULE_VERSION)) << i18) | (j10 & (~(255 << i18)));
                            jArr[i12] = (jArr[i12] & (~(255 << i13))) | (128 << i13);
                            jArr2[iH] = jArr2[i19];
                            jArr2[i19] = 0;
                            i6 = i19;
                            iB = i6;
                        } else {
                            int i20 = i11;
                            jArr[i17] = (((long) (i14 & com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor.MODULE_VERSION)) << i18) | (j10 & (~(255 << i18)));
                            if (iB == -1) {
                                iB = p170r.V.b(jArr, i20 + 1, i10);
                            }
                            jArr2[iB] = jArr2[iH];
                            jArr2[iH] = jArr2[i20];
                            jArr2[i20] = jArr2[iB];
                            i6 = i20 - 1;
                        }
                        jArr[p097j7.AbstractC6872n.d0(jArr)] = (jArr[0] & 72057594037927935L) | Long.MIN_VALUE;
                        i11 = i6 + 1;
                        c6 = 0;
                    }
                }
                i11++;
            }
        }
        i();
    }

    private final int g(long j6) {
        int iA = p170r.r.a(j6) * (-862048943);
        int i6 = iA ^ (iA << 16);
        int i10 = i6 >>> 7;
        int i11 = i6 & com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor.MODULE_VERSION;
        int i12 = this.f53412c;
        int i13 = i10 & i12;
        int i14 = 0;
        while (true) {
            long[] jArr = this.f53410a;
            int i15 = i13 >> 3;
            int i16 = (i13 & 7) << 3;
            long j10 = ((jArr[i15 + 1] << (64 - i16)) & ((-i16) >> 63)) | (jArr[i15] >>> i16);
            long j11 = i11;
            int i17 = i14;
            long j12 = j10 ^ (j11 * 72340172838076673L);
            for (long j13 = (~j12) & (j12 - 72340172838076673L) & (-9187201950435737472L); j13 != 0; j13 &= j13 - 1) {
                int iNumberOfTrailingZeros = ((java.lang.Long.numberOfTrailingZeros(j13) >> 3) + i13) & i12;
                if (this.f53411b[iNumberOfTrailingZeros] == j6) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((((~j10) << 6) & j10 & (-9187201950435737472L)) != 0) {
                int iH = h(i10);
                if (this.f53289e == 0 && ((this.f53410a[iH >> 3] >> ((iH & 7) << 3)) & 255) != 254) {
                    e();
                    iH = h(i10);
                }
                this.f53413d++;
                int i18 = this.f53289e;
                long[] jArr2 = this.f53410a;
                int i19 = iH >> 3;
                long j14 = jArr2[i19];
                int i20 = (iH & 7) << 3;
                this.f53289e = i18 - (((j14 >> i20) & 255) == 128 ? 1 : 0);
                int i21 = this.f53412c;
                long j15 = ((~(255 << i20)) & j14) | (j11 << i20);
                jArr2[i19] = j15;
                jArr2[(((iH - 7) & i21) + (i21 & 7)) >> 3] = j15;
                return iH;
            }
            i14 = i17 + 8;
            i13 = (i13 + i14) & i12;
        }
    }

    private final int h(int i6) {
        int i10 = this.f53412c;
        int i11 = i6 & i10;
        int i12 = 0;
        while (true) {
            long[] jArr = this.f53410a;
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

    private final void i() {
        this.f53289e = p170r.V.c(b()) - this.f53413d;
    }

    private final void j(int i6) {
        long[] jArr;
        if (i6 == 0) {
            jArr = p170r.V.f53338a;
        } else {
            jArr = new long[((i6 + 15) & (-8)) >> 3];
            p097j7.AbstractC6872n.A(jArr, -9187201950435737472L, 0, 0, 6, null);
        }
        this.f53410a = jArr;
        int i10 = i6 >> 3;
        long j6 = 255 << ((i6 & 7) << 3);
        jArr[i10] = (jArr[i10] & (~j6)) | j6;
        i();
    }

    private final void k(int i6) {
        int iMax = i6 > 0 ? java.lang.Math.max(7, p170r.V.f(i6)) : 0;
        this.f53412c = iMax;
        j(iMax);
        this.f53411b = new long[iMax];
    }

    private final void n(int i6) {
        this.f53413d--;
        long[] jArr = this.f53410a;
        int i10 = this.f53412c;
        int i11 = i6 >> 3;
        int i12 = (i6 & 7) << 3;
        long j6 = (jArr[i11] & (~(255 << i12))) | (254 << i12);
        jArr[i11] = j6;
        jArr[(((i6 - 7) & i10) + (i10 & 7)) >> 3] = j6;
    }

    private final void o(int i6) {
        long[] jArr = this.f53410a;
        long[] jArr2 = this.f53411b;
        int i10 = this.f53412c;
        k(i6);
        long[] jArr3 = this.f53410a;
        long[] jArr4 = this.f53411b;
        int i11 = this.f53412c;
        for (int i12 = 0; i12 < i10; i12++) {
            if (((jArr[i12 >> 3] >> ((i12 & 7) << 3)) & 255) < 128) {
                long j6 = jArr2[i12];
                int iA = p170r.r.a(j6) * (-862048943);
                int i13 = iA ^ (iA << 16);
                int iH = h(i13 >>> 7);
                long j10 = i13 & com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor.MODULE_VERSION;
                int i14 = iH >> 3;
                int i15 = (iH & 7) << 3;
                long j11 = (jArr3[i14] & (~(255 << i15))) | (j10 << i15);
                jArr3[i14] = j11;
                jArr3[(((iH - 7) & i11) + (i11 & 7)) >> 3] = j11;
                jArr4[iH] = j6;
            }
        }
    }

    public final void l(long j6) {
        this.f53411b[g(j6)] = j6;
    }

    public final boolean m(long j6) {
        int iNumberOfTrailingZeros;
        int iA = p170r.r.a(j6) * (-862048943);
        int i6 = iA ^ (iA << 16);
        int i10 = i6 & com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor.MODULE_VERSION;
        int i11 = this.f53412c;
        int i12 = (i6 >>> 7) & i11;
        int i13 = 0;
        loop0: while (true) {
            long[] jArr = this.f53410a;
            int i14 = i12 >> 3;
            int i15 = (i12 & 7) << 3;
            long j10 = ((jArr[i14 + 1] << (64 - i15)) & ((-i15) >> 63)) | (jArr[i14] >>> i15);
            long j11 = (((long) i10) * 72340172838076673L) ^ j10;
            for (long j12 = (~j11) & (j11 - 72340172838076673L) & (-9187201950435737472L); j12 != 0; j12 &= j12 - 1) {
                iNumberOfTrailingZeros = ((java.lang.Long.numberOfTrailingZeros(j12) >> 3) + i12) & i11;
                if (this.f53411b[iNumberOfTrailingZeros] == j6) {
                    break loop0;
                }
            }
            if ((j10 & ((~j10) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            }
            i13 += 8;
            i12 = (i12 + i13) & i11;
        }
        boolean z6 = iNumberOfTrailingZeros >= 0;
        if (z6) {
            n(iNumberOfTrailingZeros);
        }
        return z6;
    }
}
