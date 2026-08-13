package p170r;

/* JADX INFO: loaded from: classes.dex */
public abstract class N {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long[] f53316a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public java.lang.Object[] f53317b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int[] f53318c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f53319d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f53320e;

    private N() {
        this.f53316a = p170r.V.f53338a;
        this.f53317b = p180s.a.f54038c;
        this.f53318c = p170r.AbstractC7042q.a();
    }

    public /* synthetic */ N(p247y7.AbstractC7342k abstractC7342k) {
        this();
    }

    public final boolean a(java.lang.Object obj) {
        return b(obj) >= 0;
    }

    public final int b(java.lang.Object obj) {
        int i6 = 0;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i10 = iHashCode ^ (iHashCode << 16);
        int i11 = i10 & com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor.MODULE_VERSION;
        int i12 = this.f53319d;
        int i13 = i10 >>> 7;
        while (true) {
            int i14 = i13 & i12;
            long[] jArr = this.f53316a;
            int i15 = i14 >> 3;
            int i16 = (i14 & 7) << 3;
            long j6 = ((jArr[i15 + 1] << (64 - i16)) & ((-i16) >> 63)) | (jArr[i15] >>> i16);
            long j10 = (((long) i11) * 72340172838076673L) ^ j6;
            for (long j11 = (~j10) & (j10 - 72340172838076673L) & (-9187201950435737472L); j11 != 0; j11 &= j11 - 1) {
                int iNumberOfTrailingZeros = ((java.lang.Long.numberOfTrailingZeros(j11) >> 3) + i14) & i12;
                if (p247y7.AbstractC7350t.b(this.f53317b[iNumberOfTrailingZeros], obj)) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((j6 & ((~j6) << 6) & (-9187201950435737472L)) != 0) {
                return -1;
            }
            i6 += 8;
            i13 = i14 + i6;
        }
    }

    public final int c(java.lang.Object obj) {
        int iB = b(obj);
        if (iB >= 0) {
            return this.f53318c[iB];
        }
        throw new java.util.NoSuchElementException("There is no key " + obj + " in the map");
    }

    public final int d() {
        return this.f53319d;
    }

    public final int e(java.lang.Object obj, int i6) {
        int iB = b(obj);
        return iB >= 0 ? this.f53318c[iB] : i6;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0060 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x0062 A[LOOP:0: B:14:0x0027->B:26:0x0062, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:30:0x0065 A[SYNTHETIC] */
    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p170r.N)) {
            return false;
        }
        p170r.N n6 = (p170r.N) obj;
        if (n6.f() != f()) {
            return false;
        }
        java.lang.Object[] objArr = this.f53317b;
        int[] iArr = this.f53318c;
        long[] jArr = this.f53316a;
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
                            if (iArr[i12] != n6.c(objArr[i12])) {
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
        return this.f53320e;
    }

    public final boolean g() {
        return this.f53320e == 0;
    }

    public final boolean h() {
        return this.f53320e != 0;
    }

    public int hashCode() {
        java.lang.Object[] objArr = this.f53317b;
        int[] iArr = this.f53318c;
        long[] jArr = this.f53316a;
        int length = jArr.length - 2;
        int i6 = 0;
        if (length >= 0) {
            int i10 = 0;
            int iHashCode = 0;
            while (true) {
                long j6 = jArr[i10];
                if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j6) < 128) {
                            int i13 = (i10 << 3) + i12;
                            java.lang.Object obj = objArr[i13];
                            iHashCode += iArr[i13] ^ (obj != null ? obj.hashCode() : 0);
                        }
                        j6 >>= 8;
                    }
                    if (i11 != 8) {
                        return iHashCode;
                    }
                }
                if (i10 != length) {
                    i10++;
                } else {
                    i6 = iHashCode;
                }
            }
        }
        return i6;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0074 A[DONT_INVERT, PHI: r8
  0x0074: PHI (r8v2 int) = (r8v1 int), (r8v3 int) binds: [B:10:0x0031, B:22:0x0072] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:24:0x0076 A[LOOP:0: B:9:0x0023->B:24:0x0076, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:28:0x0079 A[EDGE_INSN: B:28:0x0079->B:25:0x0079 BREAK  A[LOOP:0: B:9:0x0023->B:24:0x0076], SYNTHETIC] */
    public java.lang.String toString() {
        if (g()) {
            return "{}";
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append('{');
        java.lang.Object[] objArr = this.f53317b;
        int[] iArr = this.f53318c;
        long[] jArr = this.f53316a;
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
                            java.lang.Object obj = objArr[i13];
                            int i14 = iArr[i13];
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb.append(obj);
                            sb.append("=");
                            sb.append(i14);
                            i10++;
                            if (i10 < this.f53320e) {
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
