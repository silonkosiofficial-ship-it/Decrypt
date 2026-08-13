package p170r;

/* JADX INFO: loaded from: classes.dex */
public final class A extends p170r.AbstractC7036k {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f53285f;

    public A(int i6) {
        super(null);
        if (!(i6 >= 0)) {
            p180s.d.a("Capacity must be a positive value.");
        }
        o(p170r.V.g(i6));
    }

    public /* synthetic */ A(int i6, int i10, p247y7.AbstractC7342k abstractC7342k) {
        this((i10 & 1) != 0 ? 6 : i6);
    }

    private final void h() {
        if (this.f53388d <= 8 || java.lang.Long.compare(p087i7.G.g(p087i7.G.g(this.f53389e) * 32) ^ Long.MIN_VALUE, p087i7.G.g(p087i7.G.g(this.f53388d) * 25) ^ Long.MIN_VALUE) > 0) {
            p(p170r.V.e(this.f53388d));
        } else {
            j();
        }
    }

    private final void j() {
        int[] iArr;
        int i6;
        int i10;
        long[] jArr = this.f53385a;
        int i11 = this.f53388d;
        int[] iArr2 = this.f53386b;
        int[] iArr3 = this.f53387c;
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
                    int iK = k(i17);
                    int i18 = i17 & i11;
                    if (((iK - i18) & i11) / 8 == ((i12 - i18) & i11) / 8) {
                        jArr[i13] = ((i16 & com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor.MODULE_VERSION) << i14) | ((~(255 << i14)) & jArr[i13]);
                        jArr[p097j7.AbstractC6872n.d0(jArr)] = (jArr[c6] & 72057594037927935L) | Long.MIN_VALUE;
                    } else {
                        int i19 = iK >> 3;
                        long j10 = jArr[i19];
                        int i20 = (iK & 7) << 3;
                        if (((j10 >> i20) & 255) == 128) {
                            int i21 = i12;
                            iArr = iArr2;
                            jArr[i19] = (j10 & (~(255 << i20))) | (((long) (i16 & com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor.MODULE_VERSION)) << i20);
                            jArr[i13] = (jArr[i13] & (~(255 << i14))) | (128 << i14);
                            iArr[iK] = iArr[i21];
                            iArr[i21] = 0;
                            iArr3[iK] = iArr3[i21];
                            iArr3[i21] = 0;
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
                            iArr[iB] = iArr[iK];
                            iArr[iK] = iArr[i23];
                            iArr[i23] = iArr[iB];
                            iArr3[iB] = iArr3[iK];
                            iArr3[iK] = iArr3[i23];
                            iArr3[i23] = iArr3[iB];
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
        int i10 = this.f53388d;
        int i11 = i6 & i10;
        int i12 = 0;
        while (true) {
            long[] jArr = this.f53385a;
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

    private final int l(int i6) {
        int i10 = (-862048943) * i6;
        int i11 = i10 ^ (i10 << 16);
        int i12 = i11 >>> 7;
        int i13 = i11 & com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor.MODULE_VERSION;
        int i14 = this.f53388d;
        int i15 = i12 & i14;
        int i16 = 0;
        while (true) {
            long[] jArr = this.f53385a;
            int i17 = i15 >> 3;
            int i18 = (i15 & 7) << 3;
            long j6 = ((jArr[i17 + 1] << (64 - i18)) & ((-i18) >> 63)) | (jArr[i17] >>> i18);
            long j10 = i13;
            int i19 = i16;
            long j11 = j6 ^ (j10 * 72340172838076673L);
            for (long j12 = (~j11) & (j11 - 72340172838076673L) & (-9187201950435737472L); j12 != 0; j12 &= j12 - 1) {
                int iNumberOfTrailingZeros = (i15 + (java.lang.Long.numberOfTrailingZeros(j12) >> 3)) & i14;
                if (this.f53386b[iNumberOfTrailingZeros] == i6) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((((~j6) << 6) & j6 & (-9187201950435737472L)) != 0) {
                int iK = k(i12);
                if (this.f53285f == 0 && ((this.f53385a[iK >> 3] >> ((iK & 7) << 3)) & 255) != 254) {
                    h();
                    iK = k(i12);
                }
                this.f53389e++;
                int i20 = this.f53285f;
                long[] jArr2 = this.f53385a;
                int i21 = iK >> 3;
                long j13 = jArr2[i21];
                int i22 = (iK & 7) << 3;
                this.f53285f = i20 - (((j13 >> i22) & 255) == 128 ? 1 : 0);
                int i23 = this.f53388d;
                long j14 = ((~(255 << i22)) & j13) | (j10 << i22);
                jArr2[i21] = j14;
                jArr2[(((iK - 7) & i23) + (i23 & 7)) >> 3] = j14;
                return ~iK;
            }
            i16 = i19 + 8;
            i15 = (i15 + i16) & i14;
        }
    }

    private final void m() {
        this.f53285f = p170r.V.c(d()) - this.f53389e;
    }

    private final void n(int i6) {
        long[] jArr;
        if (i6 == 0) {
            jArr = p170r.V.f53338a;
        } else {
            jArr = new long[((i6 + 15) & (-8)) >> 3];
            p097j7.AbstractC6872n.A(jArr, -9187201950435737472L, 0, 0, 6, null);
        }
        this.f53385a = jArr;
        int i10 = i6 >> 3;
        long j6 = 255 << ((i6 & 7) << 3);
        jArr[i10] = (jArr[i10] & (~j6)) | j6;
        m();
    }

    private final void o(int i6) {
        int iMax = i6 > 0 ? java.lang.Math.max(7, p170r.V.f(i6)) : 0;
        this.f53388d = iMax;
        n(iMax);
        this.f53386b = new int[iMax];
        this.f53387c = new int[iMax];
    }

    private final void p(int i6) {
        p170r.A a6 = this;
        long[] jArr = a6.f53385a;
        int[] iArr = a6.f53386b;
        int[] iArr2 = a6.f53387c;
        int i10 = a6.f53388d;
        o(i6);
        long[] jArr2 = a6.f53385a;
        int[] iArr3 = a6.f53386b;
        int[] iArr4 = a6.f53387c;
        int i11 = a6.f53388d;
        int i12 = 0;
        while (i12 < i10) {
            if (((jArr[i12 >> 3] >> ((i12 & 7) << 3)) & 255) < 128) {
                int i13 = iArr[i12];
                int i14 = (-862048943) * i13;
                int i15 = i14 ^ (i14 << 16);
                int iK = a6.k(i15 >>> 7);
                long j6 = i15 & com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor.MODULE_VERSION;
                int i16 = iK >> 3;
                int i17 = (iK & 7) << 3;
                long j10 = (jArr2[i16] & (~(255 << i17))) | (j6 << i17);
                jArr2[i16] = j10;
                jArr2[(((iK - 7) & i11) + (i11 & 7)) >> 3] = j10;
                iArr3[iK] = i13;
                iArr4[iK] = iArr2[i12];
            }
            i12++;
            a6 = this;
            jArr = jArr;
        }
    }

    public final void i() {
        this.f53389e = 0;
        long[] jArr = this.f53385a;
        if (jArr != p170r.V.f53338a) {
            p097j7.AbstractC6872n.A(jArr, -9187201950435737472L, 0, 0, 6, null);
            long[] jArr2 = this.f53385a;
            int i6 = this.f53388d;
            int i10 = i6 >> 3;
            long j6 = 255 << ((i6 & 7) << 3);
            jArr2[i10] = (jArr2[i10] & (~j6)) | j6;
        }
        m();
    }

    public final void q(int i6, int i10) {
        int iL = l(i6);
        if (iL < 0) {
            iL = ~iL;
        }
        this.f53386b[iL] = i6;
        this.f53387c[iL] = i10;
    }
}
