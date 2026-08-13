package p170r;

/* JADX INFO: renamed from: r.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7036k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long[] f53385a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f53386b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int[] f53387c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f53388d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f53389e;

    private AbstractC7036k() {
        this.f53385a = p170r.V.f53338a;
        this.f53386b = p170r.AbstractC7042q.a();
        this.f53387c = p170r.AbstractC7042q.a();
    }

    public /* synthetic */ AbstractC7036k(p247y7.AbstractC7342k abstractC7342k) {
        this();
    }

    public final boolean a(int i6) {
        return b(i6) >= 0;
    }

    public final int b(int i6) {
        int i10 = (-862048943) * i6;
        int i11 = i10 ^ (i10 << 16);
        int i12 = i11 & com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor.MODULE_VERSION;
        int i13 = this.f53388d;
        int i14 = (i11 >>> 7) & i13;
        int i15 = 0;
        while (true) {
            long[] jArr = this.f53385a;
            int i16 = i14 >> 3;
            int i17 = (i14 & 7) << 3;
            long j6 = ((jArr[i16 + 1] << (64 - i17)) & ((-i17) >> 63)) | (jArr[i16] >>> i17);
            long j10 = (((long) i12) * 72340172838076673L) ^ j6;
            for (long j11 = (~j10) & (j10 - 72340172838076673L) & (-9187201950435737472L); j11 != 0; j11 &= j11 - 1) {
                int iNumberOfTrailingZeros = ((java.lang.Long.numberOfTrailingZeros(j11) >> 3) + i14) & i13;
                if (this.f53386b[iNumberOfTrailingZeros] == i6) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((j6 & ((~j6) << 6) & (-9187201950435737472L)) != 0) {
                return -1;
            }
            i15 += 8;
            i14 = (i14 + i15) & i13;
        }
    }

    public final int c(int i6) {
        int iB = b(i6);
        if (iB >= 0) {
            return this.f53387c[iB];
        }
        throw new java.util.NoSuchElementException("Cannot find value for key " + i6);
    }

    public final int d() {
        return this.f53388d;
    }

    public final int e(int i6, int i10) {
        int iB = b(i6);
        return iB >= 0 ? this.f53387c[iB] : i10;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0060 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x0062 A[LOOP:0: B:14:0x0027->B:26:0x0062, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:30:0x0065 A[SYNTHETIC] */
    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p170r.AbstractC7036k)) {
            return false;
        }
        p170r.AbstractC7036k abstractC7036k = (p170r.AbstractC7036k) obj;
        if (abstractC7036k.f() != f()) {
            return false;
        }
        int[] iArr = this.f53386b;
        int[] iArr2 = this.f53387c;
        long[] jArr = this.f53385a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i6 = 0;
            while (true) {
                long j6 = jArr[i6];
                if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i10 = 8 - ((~(i6 - length)) >>> 31);
                    for (int i11 = 0; i11 < i10; i11++) {
                        if ((255 & j6) < 128) {
                            int i12 = (i6 << 3) + i11;
                            if (iArr2[i12] != abstractC7036k.c(iArr[i12])) {
                                return false;
                            }
                        }
                        j6 >>= 8;
                    }
                    if (i10 == 8) {
                        if (i6 != length) {
                            i6++;
                        }
                    }
                } else if (i6 != length) {
                    i6++;
                }
            }
        }
        return true;
    }

    public final int f() {
        return this.f53389e;
    }

    public final boolean g() {
        return this.f53389e == 0;
    }

    public int hashCode() {
        int[] iArr = this.f53386b;
        int[] iArr2 = this.f53387c;
        long[] jArr = this.f53385a;
        int length = jArr.length - 2;
        int i6 = 0;
        if (length >= 0) {
            int i10 = 0;
            int i11 = 0;
            while (true) {
                long j6 = jArr[i10];
                if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i12 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i13 = 0; i13 < i12; i13++) {
                        if ((255 & j6) < 128) {
                            int i14 = (i10 << 3) + i13;
                            i11 += iArr2[i14] ^ iArr[i14];
                        }
                        j6 >>= 8;
                    }
                    if (i12 != 8) {
                        return i11;
                    }
                }
                if (i10 != length) {
                    i10++;
                } else {
                    i6 = i11;
                }
            }
        }
        return i6;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0070 A[DONT_INVERT, PHI: r8
  0x0070: PHI (r8v2 int) = (r8v1 int), (r8v3 int) binds: [B:10:0x0031, B:19:0x006e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:21:0x0072 A[LOOP:0: B:9:0x0023->B:21:0x0072, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:25:0x0075 A[EDGE_INSN: B:25:0x0075->B:22:0x0075 BREAK  A[LOOP:0: B:9:0x0023->B:21:0x0072], SYNTHETIC] */
    public java.lang.String toString() {
        if (g()) {
            return "{}";
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append('{');
        int[] iArr = this.f53386b;
        int[] iArr2 = this.f53387c;
        long[] jArr = this.f53385a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i6 = 0;
            int i10 = 0;
            while (true) {
                long j6 = jArr[i6];
                if ((((~j6) << 7) & j6 & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i6 != length) {
                        break;
                        break;
                    }
                    i6++;
                } else {
                    int i11 = 8 - ((~(i6 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j6) < 128) {
                            int i13 = (i6 << 3) + i12;
                            int i14 = iArr[i13];
                            int i15 = iArr2[i13];
                            sb.append(i14);
                            sb.append("=");
                            sb.append(i15);
                            i10++;
                            if (i10 < this.f53389e) {
                                sb.append(',');
                                sb.append(' ');
                            }
                        }
                        j6 >>= 8;
                    }
                    if (i11 != 8) {
                        break;
                    }
                    if (i6 != length) {
                        break;
                    }
                    i6++;
                }
            }
        }
        sb.append('}');
        java.lang.String string = sb.toString();
        p247y7.AbstractC7350t.e(string, "s.append('}').toString()");
        return string;
    }
}
