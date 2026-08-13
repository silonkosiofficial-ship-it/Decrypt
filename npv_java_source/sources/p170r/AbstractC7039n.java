package p170r;

/* JADX INFO: renamed from: r.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7039n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long[] f53393a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f53394b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public java.lang.Object[] f53395c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f53396d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f53397e;

    private AbstractC7039n() {
        this.f53393a = p170r.V.f53338a;
        this.f53394b = p170r.AbstractC7042q.a();
        this.f53395c = p180s.a.f54038c;
    }

    public /* synthetic */ AbstractC7039n(p247y7.AbstractC7342k abstractC7342k) {
        this();
    }

    public final boolean a(int i6) {
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
        return iNumberOfTrailingZeros >= 0;
    }

    public final boolean b(int i6) {
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
        return iNumberOfTrailingZeros >= 0;
    }

    public final java.lang.Object c(int i6) {
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
            return this.f53395c[iNumberOfTrailingZeros];
        }
        return null;
    }

    public final int d() {
        return this.f53396d;
    }

    public final int e() {
        return this.f53397e;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0073 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:33:0x0075 A[LOOP:0: B:14:0x0027->B:33:0x0075, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:35:0x0078 A[EDGE_INSN: B:35:0x0078->B:34:0x0078 BREAK  A[LOOP:0: B:14:0x0027->B:33:0x0075], SYNTHETIC] */
    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p170r.AbstractC7039n)) {
            return false;
        }
        p170r.AbstractC7039n abstractC7039n = (p170r.AbstractC7039n) obj;
        if (abstractC7039n.e() != e()) {
            return false;
        }
        int[] iArr = this.f53394b;
        java.lang.Object[] objArr = this.f53395c;
        long[] jArr = this.f53393a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i6 = 0;
            while (true) {
                long j6 = jArr[i6];
                if ((((~j6) << 7) & j6 & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i6 != length) {
                        break;
                        break;
                    }
                    i6++;
                } else {
                    int i10 = 8 - ((~(i6 - length)) >>> 31);
                    for (int i11 = 0; i11 < i10; i11++) {
                        if ((255 & j6) < 128) {
                            int i12 = (i6 << 3) + i11;
                            int i13 = iArr[i12];
                            java.lang.Object obj2 = objArr[i12];
                            if (obj2 == null) {
                                if (abstractC7039n.c(i13) != null || !abstractC7039n.b(i13)) {
                                    return false;
                                }
                            } else if (!p247y7.AbstractC7350t.b(obj2, abstractC7039n.c(i13))) {
                                return false;
                            }
                        }
                        j6 >>= 8;
                    }
                    if (i10 != 8) {
                        break;
                    }
                    if (i6 != length) {
                        break;
                    }
                    i6++;
                }
            }
        }
        return true;
    }

    public final boolean f() {
        return this.f53397e == 0;
    }

    public final boolean g() {
        return this.f53397e != 0;
    }

    public int hashCode() {
        int[] iArr = this.f53394b;
        java.lang.Object[] objArr = this.f53395c;
        long[] jArr = this.f53393a;
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
                            int i14 = iArr[i13];
                            java.lang.Object obj = objArr[i13];
                            iHashCode += (obj != null ? obj.hashCode() : 0) ^ i14;
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
        if (f()) {
            return "{}";
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append('{');
        int[] iArr = this.f53394b;
        java.lang.Object[] objArr = this.f53395c;
        long[] jArr = this.f53393a;
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
                            java.lang.Object obj = objArr[i13];
                            sb.append(i14);
                            sb.append("=");
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb.append(obj);
                            i10++;
                            if (i10 < this.f53397e) {
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
