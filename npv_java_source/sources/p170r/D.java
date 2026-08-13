package p170r;

/* JADX INFO: loaded from: classes.dex */
public final class D extends p170r.AbstractC7041p {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f53287e;

    public D(int i6) {
        super(null);
        if (!(i6 >= 0)) {
            p180s.d.a("Capacity must be a positive value.");
        }
        n(p170r.V.g(i6));
    }

    public /* synthetic */ D(int i6, int i10, p247y7.AbstractC7342k abstractC7342k) {
        this((i10 & 1) != 0 ? 6 : i6);
    }

    private final void g() {
        if (this.f53401c <= 8 || java.lang.Long.compare(p087i7.G.g(p087i7.G.g(this.f53402d) * 32) ^ Long.MIN_VALUE, p087i7.G.g(p087i7.G.g(this.f53401c) * 25) ^ Long.MIN_VALUE) > 0) {
            t(p170r.V.e(this.f53401c));
        } else {
            i();
        }
    }

    private final void i() {
        int i6;
        long[] jArr = this.f53399a;
        int i10 = this.f53401c;
        int[] iArr = this.f53400b;
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
                    int i14 = iArr[i11] * (-862048943);
                    int i15 = i14 ^ (i14 << 16);
                    int i16 = i15 >>> 7;
                    int iK = k(i16);
                    int i17 = i16 & i10;
                    if (((iK - i17) & i10) / 8 == ((i11 - i17) & i10) / 8) {
                        jArr[i12] = ((i15 & com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor.MODULE_VERSION) << i13) | ((~(255 << i13)) & jArr[i12]);
                        jArr[p097j7.AbstractC6872n.d0(jArr)] = (jArr[c6] & 72057594037927935L) | Long.MIN_VALUE;
                    } else {
                        int i18 = iK >> 3;
                        long j10 = jArr[i18];
                        int i19 = (iK & 7) << 3;
                        if (((j10 >> i19) & 255) == 128) {
                            int i20 = i11;
                            jArr[i18] = (((long) (i15 & com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor.MODULE_VERSION)) << i19) | (j10 & (~(255 << i19)));
                            jArr[i12] = (jArr[i12] & (~(255 << i13))) | (128 << i13);
                            iArr[iK] = iArr[i20];
                            iArr[i20] = 0;
                            i6 = i20;
                            iB = i6;
                        } else {
                            int i21 = i11;
                            jArr[i18] = (((long) (i15 & com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor.MODULE_VERSION)) << i19) | (j10 & (~(255 << i19)));
                            if (iB == -1) {
                                iB = p170r.V.b(jArr, i21 + 1, i10);
                            }
                            iArr[iB] = iArr[iK];
                            iArr[iK] = iArr[i21];
                            iArr[i21] = iArr[iB];
                            i6 = i21 - 1;
                        }
                        jArr[p097j7.AbstractC6872n.d0(jArr)] = (jArr[0] & 72057594037927935L) | Long.MIN_VALUE;
                        i11 = i6 + 1;
                        c6 = 0;
                    }
                }
                i11++;
            }
        }
        l();
    }

    private final int j(int i6) {
        int i10 = (-862048943) * i6;
        int i11 = i10 ^ (i10 << 16);
        int i12 = i11 >>> 7;
        int i13 = i11 & com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor.MODULE_VERSION;
        int i14 = this.f53401c;
        int i15 = i12 & i14;
        int i16 = 0;
        while (true) {
            long[] jArr = this.f53399a;
            int i17 = i15 >> 3;
            int i18 = (i15 & 7) << 3;
            long j6 = ((jArr[i17 + 1] << (64 - i18)) & ((-i18) >> 63)) | (jArr[i17] >>> i18);
            long j10 = i13;
            int i19 = i16;
            long j11 = j6 ^ (j10 * 72340172838076673L);
            for (long j12 = (~j11) & (j11 - 72340172838076673L) & (-9187201950435737472L); j12 != 0; j12 &= j12 - 1) {
                int iNumberOfTrailingZeros = (i15 + (java.lang.Long.numberOfTrailingZeros(j12) >> 3)) & i14;
                if (this.f53400b[iNumberOfTrailingZeros] == i6) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((((~j6) << 6) & j6 & (-9187201950435737472L)) != 0) {
                int iK = k(i12);
                if (this.f53287e == 0 && ((this.f53399a[iK >> 3] >> ((iK & 7) << 3)) & 255) != 254) {
                    g();
                    iK = k(i12);
                }
                this.f53402d++;
                int i20 = this.f53287e;
                long[] jArr2 = this.f53399a;
                int i21 = iK >> 3;
                long j13 = jArr2[i21];
                int i22 = (iK & 7) << 3;
                this.f53287e = i20 - (((j13 >> i22) & 255) == 128 ? 1 : 0);
                int i23 = this.f53401c;
                long j14 = ((~(255 << i22)) & j13) | (j10 << i22);
                jArr2[i21] = j14;
                jArr2[(((iK - 7) & i23) + (i23 & 7)) >> 3] = j14;
                return iK;
            }
            i16 = i19 + 8;
            i15 = (i15 + i16) & i14;
        }
    }

    private final int k(int i6) {
        int i10 = this.f53401c;
        int i11 = i6 & i10;
        int i12 = 0;
        while (true) {
            long[] jArr = this.f53399a;
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

    private final void l() {
        this.f53287e = p170r.V.c(b()) - this.f53402d;
    }

    private final void m(int i6) {
        long[] jArr;
        if (i6 == 0) {
            jArr = p170r.V.f53338a;
        } else {
            jArr = new long[((i6 + 15) & (-8)) >> 3];
            p097j7.AbstractC6872n.A(jArr, -9187201950435737472L, 0, 0, 6, null);
        }
        this.f53399a = jArr;
        int i10 = i6 >> 3;
        long j6 = 255 << ((i6 & 7) << 3);
        jArr[i10] = (jArr[i10] & (~j6)) | j6;
        l();
    }

    private final void n(int i6) {
        int iMax = i6 > 0 ? java.lang.Math.max(7, p170r.V.f(i6)) : 0;
        this.f53401c = iMax;
        m(iMax);
        this.f53400b = new int[iMax];
    }

    private final void s(int i6) {
        this.f53402d--;
        long[] jArr = this.f53399a;
        int i10 = this.f53401c;
        int i11 = i6 >> 3;
        int i12 = (i6 & 7) << 3;
        long j6 = (jArr[i11] & (~(255 << i12))) | (254 << i12);
        jArr[i11] = j6;
        jArr[(((i6 - 7) & i10) + (i10 & 7)) >> 3] = j6;
    }

    private final void t(int i6) {
        long[] jArr = this.f53399a;
        int[] iArr = this.f53400b;
        int i10 = this.f53401c;
        n(i6);
        long[] jArr2 = this.f53399a;
        int[] iArr2 = this.f53400b;
        int i11 = this.f53401c;
        for (int i12 = 0; i12 < i10; i12++) {
            if (((jArr[i12 >> 3] >> ((i12 & 7) << 3)) & 255) < 128) {
                int i13 = iArr[i12];
                int i14 = (-862048943) * i13;
                int i15 = i14 ^ (i14 << 16);
                int iK = k(i15 >>> 7);
                long j6 = i15 & com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor.MODULE_VERSION;
                int i16 = iK >> 3;
                int i17 = (iK & 7) << 3;
                long j10 = (jArr2[i16] & (~(255 << i17))) | (j6 << i17);
                jArr2[i16] = j10;
                jArr2[(((iK - 7) & i11) + (i11 & 7)) >> 3] = j10;
                iArr2[iK] = i13;
            }
        }
    }

    public final boolean f(int i6) {
        int i10 = this.f53402d;
        this.f53400b[j(i6)] = i6;
        return this.f53402d != i10;
    }

    public final void h() {
        this.f53402d = 0;
        long[] jArr = this.f53399a;
        if (jArr != p170r.V.f53338a) {
            p097j7.AbstractC6872n.A(jArr, -9187201950435737472L, 0, 0, 6, null);
            long[] jArr2 = this.f53399a;
            int i6 = this.f53401c;
            int i10 = i6 >> 3;
            long j6 = 255 << ((i6 & 7) << 3);
            jArr2[i10] = (jArr2[i10] & (~j6)) | j6;
        }
        l();
    }

    public final void o(int i6) {
        int iNumberOfTrailingZeros;
        int i10 = (-862048943) * i6;
        int i11 = i10 ^ (i10 << 16);
        int i12 = i11 & com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor.MODULE_VERSION;
        int i13 = this.f53401c;
        int i14 = (i11 >>> 7) & i13;
        int i15 = 0;
        loop0: while (true) {
            long[] jArr = this.f53399a;
            int i16 = i14 >> 3;
            int i17 = (i14 & 7) << 3;
            long j6 = ((jArr[i16 + 1] << (64 - i17)) & ((-i17) >> 63)) | (jArr[i16] >>> i17);
            long j10 = (((long) i12) * 72340172838076673L) ^ j6;
            for (long j11 = (~j10) & (j10 - 72340172838076673L) & (-9187201950435737472L); j11 != 0; j11 &= j11 - 1) {
                iNumberOfTrailingZeros = ((java.lang.Long.numberOfTrailingZeros(j11) >> 3) + i14) & i13;
                if (this.f53400b[iNumberOfTrailingZeros] == i6) {
                    break loop0;
                }
            }
            if ((j6 & ((~j6) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            } else {
                i15 += 8;
                i14 = (i14 + i15) & i13;
            }
        }
        if (iNumberOfTrailingZeros >= 0) {
            s(iNumberOfTrailingZeros);
        }
    }

    public final void p(p170r.AbstractC7041p abstractC7041p) {
        p247y7.AbstractC7350t.f(abstractC7041p, "elements");
        int[] iArr = abstractC7041p.f53400b;
        long[] jArr = abstractC7041p.f53399a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i6 = 0;
        while (true) {
            long j6 = jArr[i6];
            if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i10 = 8 - ((~(i6 - length)) >>> 31);
                for (int i11 = 0; i11 < i10; i11++) {
                    if ((255 & j6) < 128) {
                        o(iArr[(i6 << 3) + i11]);
                    }
                    j6 >>= 8;
                }
                if (i10 != 8) {
                    return;
                }
            }
            if (i6 == length) {
                return;
            } else {
                i6++;
            }
        }
    }

    public final boolean q(int i6) {
        int iNumberOfTrailingZeros;
        int i10 = (-862048943) * i6;
        int i11 = i10 ^ (i10 << 16);
        int i12 = i11 & com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor.MODULE_VERSION;
        int i13 = this.f53401c;
        int i14 = (i11 >>> 7) & i13;
        int i15 = 0;
        loop0: while (true) {
            long[] jArr = this.f53399a;
            int i16 = i14 >> 3;
            int i17 = (i14 & 7) << 3;
            long j6 = ((jArr[i16 + 1] << (64 - i17)) & ((-i17) >> 63)) | (jArr[i16] >>> i17);
            long j10 = (((long) i12) * 72340172838076673L) ^ j6;
            for (long j11 = (~j10) & (j10 - 72340172838076673L) & (-9187201950435737472L); j11 != 0; j11 &= j11 - 1) {
                iNumberOfTrailingZeros = ((java.lang.Long.numberOfTrailingZeros(j11) >> 3) + i14) & i13;
                if (this.f53400b[iNumberOfTrailingZeros] == i6) {
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
        boolean z6 = iNumberOfTrailingZeros >= 0;
        if (z6) {
            s(iNumberOfTrailingZeros);
        }
        return z6;
    }

    public final boolean r(p170r.AbstractC7041p abstractC7041p) {
        p247y7.AbstractC7350t.f(abstractC7041p, "elements");
        int i6 = this.f53402d;
        p(abstractC7041p);
        return i6 != this.f53402d;
    }
}
