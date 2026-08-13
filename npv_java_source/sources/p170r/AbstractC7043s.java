package p170r;

/* JADX INFO: renamed from: r.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7043s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long[] f53405a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long[] f53406b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public java.lang.Object[] f53407c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f53408d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f53409e;

    private AbstractC7043s() {
        this.f53405a = p170r.V.f53338a;
        this.f53406b = p170r.AbstractC7045u.a();
        this.f53407c = p180s.a.f54038c;
    }

    public /* synthetic */ AbstractC7043s(p247y7.AbstractC7342k abstractC7342k) {
        this();
    }

    public final boolean a(long j6) {
        int iNumberOfTrailingZeros;
        int iA = p170r.r.a(j6) * (-862048943);
        int i6 = iA ^ (iA << 16);
        int i10 = i6 & com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor.MODULE_VERSION;
        int i11 = this.f53408d;
        int i12 = (i6 >>> 7) & i11;
        int i13 = 0;
        loop0: while (true) {
            long[] jArr = this.f53405a;
            int i14 = i12 >> 3;
            int i15 = (i12 & 7) << 3;
            long j10 = ((jArr[i14 + 1] << (64 - i15)) & ((-i15) >> 63)) | (jArr[i14] >>> i15);
            long j11 = (((long) i10) * 72340172838076673L) ^ j10;
            for (long j12 = (~j11) & (j11 - 72340172838076673L) & (-9187201950435737472L); j12 != 0; j12 &= j12 - 1) {
                iNumberOfTrailingZeros = ((java.lang.Long.numberOfTrailingZeros(j12) >> 3) + i12) & i11;
                if (this.f53406b[iNumberOfTrailingZeros] == j6) {
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
        return iNumberOfTrailingZeros >= 0;
    }

    public final java.lang.Object b(long j6) {
        int iNumberOfTrailingZeros;
        int iA = p170r.r.a(j6) * (-862048943);
        int i6 = iA ^ (iA << 16);
        int i10 = i6 & com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor.MODULE_VERSION;
        int i11 = this.f53408d;
        int i12 = (i6 >>> 7) & i11;
        int i13 = 0;
        loop0: while (true) {
            long[] jArr = this.f53405a;
            int i14 = i12 >> 3;
            int i15 = (i12 & 7) << 3;
            long j10 = ((jArr[i14 + 1] << (64 - i15)) & ((-i15) >> 63)) | (jArr[i14] >>> i15);
            long j11 = (((long) i10) * 72340172838076673L) ^ j10;
            for (long j12 = (~j11) & (j11 - 72340172838076673L) & (-9187201950435737472L); j12 != 0; j12 &= j12 - 1) {
                iNumberOfTrailingZeros = ((java.lang.Long.numberOfTrailingZeros(j12) >> 3) + i12) & i11;
                if (this.f53406b[iNumberOfTrailingZeros] == j6) {
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
        if (iNumberOfTrailingZeros >= 0) {
            return this.f53407c[iNumberOfTrailingZeros];
        }
        return null;
    }

    public final int c() {
        return this.f53408d;
    }

    public final int d() {
        return this.f53409e;
    }

    public final boolean e() {
        return this.f53409e == 0;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0078 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x007a A[LOOP:0: B:14:0x0027->B:35:0x007a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:38:0x007d A[EDGE_INSN: B:38:0x007d->B:36:0x007d BREAK  A[LOOP:0: B:14:0x0027->B:35:0x007a], SYNTHETIC] */
    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p170r.AbstractC7043s)) {
            return false;
        }
        p170r.AbstractC7043s abstractC7043s = (p170r.AbstractC7043s) obj;
        if (abstractC7043s.d() != d()) {
            return false;
        }
        long[] jArr = this.f53406b;
        java.lang.Object[] objArr = this.f53407c;
        long[] jArr2 = this.f53405a;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i6 = 0;
            while (true) {
                long j6 = jArr2[i6];
                if ((((~j6) << 7) & j6 & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i6 != length) {
                        break;
                        break;
                    }
                    i6++;
                } else {
                    int i10 = 8;
                    int i11 = 8 - ((~(i6 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j6) < 128) {
                            int i13 = (i6 << 3) + i12;
                            long j10 = jArr[i13];
                            java.lang.Object obj2 = objArr[i13];
                            if (obj2 == null) {
                                if (abstractC7043s.b(j10) != null || !abstractC7043s.a(j10)) {
                                    return false;
                                }
                            } else if (!p247y7.AbstractC7350t.b(obj2, abstractC7043s.b(j10))) {
                                return false;
                            }
                            i10 = 8;
                        }
                        j6 >>= i10;
                    }
                    if (i11 != i10) {
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

    public int hashCode() {
        long[] jArr = this.f53406b;
        java.lang.Object[] objArr = this.f53407c;
        long[] jArr2 = this.f53405a;
        int length = jArr2.length - 2;
        int i6 = 0;
        if (length >= 0) {
            int i10 = 0;
            int iHashCode = 0;
            while (true) {
                long j6 = jArr2[i10];
                if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j6) < 128) {
                            int i13 = (i10 << 3) + i12;
                            long j10 = jArr[i13];
                            java.lang.Object obj = objArr[i13];
                            iHashCode += (obj != null ? obj.hashCode() : 0) ^ p170r.r.a(j10);
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

    public java.lang.String toString() {
        int i6;
        int i10;
        if (e()) {
            return "{}";
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append('{');
        long[] jArr = this.f53406b;
        java.lang.Object[] objArr = this.f53407c;
        long[] jArr2 = this.f53405a;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i11 = 0;
            int i12 = 0;
            while (true) {
                long j6 = jArr2[i11];
                if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i13 = 8 - ((~(i11 - length)) >>> 31);
                    int i14 = 0;
                    while (i14 < i13) {
                        if ((255 & j6) < 128) {
                            int i15 = (i11 << 3) + i14;
                            i10 = i11;
                            long j10 = jArr[i15];
                            java.lang.Object obj = objArr[i15];
                            sb.append(j10);
                            sb.append("=");
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb.append(obj);
                            i12++;
                            if (i12 < this.f53409e) {
                                sb.append(',');
                                sb.append(' ');
                            }
                        } else {
                            i10 = i11;
                        }
                        j6 >>= 8;
                        i14++;
                        i11 = i10;
                    }
                    int i16 = i11;
                    if (i13 != 8) {
                        break;
                    }
                    i6 = i16;
                } else {
                    i6 = i11;
                }
                if (i6 == length) {
                    break;
                }
                i11 = i6 + 1;
            }
        }
        sb.append('}');
        java.lang.String string = sb.toString();
        p247y7.AbstractC7350t.e(string, "s.append('}').toString()");
        return string;
    }
}
