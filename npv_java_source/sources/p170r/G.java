package p170r;

/* JADX INFO: loaded from: classes.dex */
public final class G extends p170r.M {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f53290f;

    public G(int i6) {
        super(null);
        if (!(i6 >= 0)) {
            p180s.d.a("Capacity must be a positive value.");
        }
        o(p170r.V.g(i6));
    }

    public /* synthetic */ G(int i6, int i10, p247y7.AbstractC7342k abstractC7342k) {
        this((i10 & 1) != 0 ? 6 : i6);
    }

    private final void h() {
        if (this.f53314d <= 8 || java.lang.Long.compare(p087i7.G.g(p087i7.G.g(this.f53315e) * 32) ^ Long.MIN_VALUE, p087i7.G.g(p087i7.G.g(this.f53314d) * 25) ^ Long.MIN_VALUE) > 0) {
            q(p170r.V.e(this.f53314d));
        } else {
            j();
        }
    }

    private final void j() {
        java.lang.Object[] objArr;
        int i6;
        int i10;
        long[] jArr = this.f53311a;
        int i11 = this.f53314d;
        java.lang.Object[] objArr2 = this.f53312b;
        float[] fArr = this.f53313c;
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
                    int iK = k(i17);
                    int i18 = i17 & i11;
                    if (((iK - i18) & i11) / 8 == ((i13 - i18) & i11) / 8) {
                        jArr[i14] = (((long) (i16 & com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor.MODULE_VERSION)) << i15) | ((~(255 << i15)) & jArr[i14]);
                        jArr[p097j7.AbstractC6872n.d0(jArr)] = (jArr[i12] & 72057594037927935L) | Long.MIN_VALUE;
                    } else {
                        int i19 = iK >> 3;
                        long j10 = jArr[i19];
                        int i20 = (iK & 7) << 3;
                        if (((j10 >> i20) & 255) == 128) {
                            int i21 = i13;
                            objArr = objArr2;
                            jArr[i19] = (j10 & (~(255 << i20))) | (((long) (i16 & com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor.MODULE_VERSION)) << i20);
                            jArr[i14] = (jArr[i14] & (~(255 << i15))) | (128 << i15);
                            objArr[iK] = objArr[i21];
                            objArr[i21] = null;
                            fArr[iK] = fArr[i21];
                            fArr[i21] = 0.0f;
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
                            objArr[iB] = objArr[iK];
                            objArr[iK] = objArr[i23];
                            objArr[i23] = objArr[iB];
                            fArr[iB] = fArr[iK];
                            fArr[iK] = fArr[i23];
                            fArr[i23] = fArr[iB];
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
        m();
    }

    private final int k(int i6) {
        int i10 = this.f53314d;
        int i11 = i6 & i10;
        int i12 = 0;
        while (true) {
            long[] jArr = this.f53311a;
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

    private final int l(java.lang.Object obj) {
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i6 = iHashCode ^ (iHashCode << 16);
        int i10 = i6 >>> 7;
        int i11 = i6 & com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor.MODULE_VERSION;
        int i12 = this.f53314d;
        int i13 = i10 & i12;
        int i14 = 0;
        while (true) {
            long[] jArr = this.f53311a;
            int i15 = i13 >> 3;
            int i16 = (i13 & 7) << 3;
            long j6 = ((jArr[i15 + 1] << (64 - i16)) & ((-i16) >> 63)) | (jArr[i15] >>> i16);
            long j10 = i11;
            int i17 = i11;
            long j11 = j6 ^ (j10 * 72340172838076673L);
            for (long j12 = (~j11) & (j11 - 72340172838076673L) & (-9187201950435737472L); j12 != 0; j12 &= j12 - 1) {
                int iNumberOfTrailingZeros = (i13 + (java.lang.Long.numberOfTrailingZeros(j12) >> 3)) & i12;
                if (p247y7.AbstractC7350t.b(this.f53312b[iNumberOfTrailingZeros], obj)) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((((~j6) << 6) & j6 & (-9187201950435737472L)) != 0) {
                int iK = k(i10);
                if (this.f53290f == 0 && ((this.f53311a[iK >> 3] >> ((iK & 7) << 3)) & 255) != 254) {
                    h();
                    iK = k(i10);
                }
                this.f53315e++;
                int i18 = this.f53290f;
                long[] jArr2 = this.f53311a;
                int i19 = iK >> 3;
                long j13 = jArr2[i19];
                int i20 = (iK & 7) << 3;
                this.f53290f = i18 - (((j13 >> i20) & 255) == 128 ? 1 : 0);
                int i21 = this.f53314d;
                long j14 = ((~(255 << i20)) & j13) | (j10 << i20);
                jArr2[i19] = j14;
                jArr2[(((iK - 7) & i21) + (i21 & 7)) >> 3] = j14;
                return ~iK;
            }
            i14 += 8;
            i13 = (i13 + i14) & i12;
            i11 = i17;
        }
    }

    private final void m() {
        this.f53290f = p170r.V.c(d()) - this.f53315e;
    }

    private final void n(int i6) {
        long[] jArr;
        if (i6 == 0) {
            jArr = p170r.V.f53338a;
        } else {
            jArr = new long[((i6 + 15) & (-8)) >> 3];
            p097j7.AbstractC6872n.A(jArr, -9187201950435737472L, 0, 0, 6, null);
        }
        this.f53311a = jArr;
        int i10 = i6 >> 3;
        long j6 = 255 << ((i6 & 7) << 3);
        jArr[i10] = (jArr[i10] & (~j6)) | j6;
        m();
    }

    private final void o(int i6) {
        int iMax = i6 > 0 ? java.lang.Math.max(7, p170r.V.f(i6)) : 0;
        this.f53314d = iMax;
        n(iMax);
        this.f53312b = new java.lang.Object[iMax];
        this.f53313c = new float[iMax];
    }

    private final void q(int i6) {
        int i10;
        long[] jArr = this.f53311a;
        java.lang.Object[] objArr = this.f53312b;
        float[] fArr = this.f53313c;
        int i11 = this.f53314d;
        o(i6);
        long[] jArr2 = this.f53311a;
        java.lang.Object[] objArr2 = this.f53312b;
        float[] fArr2 = this.f53313c;
        int i12 = this.f53314d;
        int i13 = 0;
        while (i13 < i11) {
            if (((jArr[i13 >> 3] >> ((i13 & 7) << 3)) & 255) < 128) {
                java.lang.Object obj = objArr[i13];
                int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
                int i14 = iHashCode ^ (iHashCode << 16);
                int iK = k(i14 >>> 7);
                i10 = i13;
                long j6 = i14 & com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor.MODULE_VERSION;
                int i15 = iK >> 3;
                int i16 = (iK & 7) << 3;
                long j10 = (j6 << i16) | (jArr2[i15] & (~(255 << i16)));
                jArr2[i15] = j10;
                jArr2[(((iK - 7) & i12) + (i12 & 7)) >> 3] = j10;
                objArr2[iK] = obj;
                fArr2[iK] = fArr[i10];
            } else {
                i10 = i13;
            }
            i13 = i10 + 1;
        }
    }

    public final void i() {
        this.f53315e = 0;
        long[] jArr = this.f53311a;
        if (jArr != p170r.V.f53338a) {
            p097j7.AbstractC6872n.A(jArr, -9187201950435737472L, 0, 0, 6, null);
            long[] jArr2 = this.f53311a;
            int i6 = this.f53314d;
            int i10 = i6 >> 3;
            long j6 = 255 << ((i6 & 7) << 3);
            jArr2[i10] = (jArr2[i10] & (~j6)) | j6;
        }
        p097j7.AbstractC6872n.w(this.f53312b, null, 0, this.f53314d);
        m();
    }

    public final void p(p170r.M m6) {
        p247y7.AbstractC7350t.f(m6, "from");
        java.lang.Object[] objArr = m6.f53312b;
        float[] fArr = m6.f53313c;
        long[] jArr = m6.f53311a;
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
                        int i12 = (i6 << 3) + i11;
                        r(objArr[i12], fArr[i12]);
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

    public final void r(java.lang.Object obj, float f6) {
        int iL = l(obj);
        if (iL < 0) {
            iL = ~iL;
        }
        this.f53312b[iL] = obj;
        this.f53313c[iL] = f6;
    }
}
