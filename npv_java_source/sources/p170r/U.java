package p170r;

/* JADX INFO: loaded from: classes.dex */
public abstract class U {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long[] f53333a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public java.lang.Object[] f53334b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public java.lang.Object[] f53335c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f53336d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f53337e;

    private U() {
        this.f53333a = p170r.V.f53338a;
        java.lang.Object[] objArr = p180s.a.f54038c;
        this.f53334b = objArr;
        this.f53335c = objArr;
    }

    public /* synthetic */ U(p247y7.AbstractC7342k abstractC7342k) {
        this();
    }

    public final boolean a(java.lang.Object obj) {
        int iNumberOfTrailingZeros;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i6 = iHashCode ^ (iHashCode << 16);
        int i10 = i6 & com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor.MODULE_VERSION;
        int i11 = this.f53336d;
        int i12 = (i6 >>> 7) & i11;
        int i13 = 0;
        loop0: while (true) {
            long[] jArr = this.f53333a;
            int i14 = i12 >> 3;
            int i15 = (i12 & 7) << 3;
            long j6 = ((jArr[i14 + 1] << (64 - i15)) & ((-i15) >> 63)) | (jArr[i14] >>> i15);
            long j10 = (((long) i10) * 72340172838076673L) ^ j6;
            for (long j11 = (~j10) & (j10 - 72340172838076673L) & (-9187201950435737472L); j11 != 0; j11 &= j11 - 1) {
                iNumberOfTrailingZeros = ((java.lang.Long.numberOfTrailingZeros(j11) >> 3) + i12) & i11;
                if (p247y7.AbstractC7350t.b(this.f53334b[iNumberOfTrailingZeros], obj)) {
                    break loop0;
                }
            }
            if ((j6 & ((~j6) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            }
            i13 += 8;
            i12 = (i12 + i13) & i11;
        }
        return iNumberOfTrailingZeros >= 0;
    }

    public final boolean b(java.lang.Object obj) {
        int iNumberOfTrailingZeros;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i6 = iHashCode ^ (iHashCode << 16);
        int i10 = i6 & com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor.MODULE_VERSION;
        int i11 = this.f53336d;
        int i12 = (i6 >>> 7) & i11;
        int i13 = 0;
        loop0: while (true) {
            long[] jArr = this.f53333a;
            int i14 = i12 >> 3;
            int i15 = (i12 & 7) << 3;
            long j6 = ((jArr[i14 + 1] << (64 - i15)) & ((-i15) >> 63)) | (jArr[i14] >>> i15);
            long j10 = (((long) i10) * 72340172838076673L) ^ j6;
            for (long j11 = (~j10) & (j10 - 72340172838076673L) & (-9187201950435737472L); j11 != 0; j11 &= j11 - 1) {
                iNumberOfTrailingZeros = ((java.lang.Long.numberOfTrailingZeros(j11) >> 3) + i12) & i11;
                if (p247y7.AbstractC7350t.b(this.f53334b[iNumberOfTrailingZeros], obj)) {
                    break loop0;
                }
            }
            if ((j6 & ((~j6) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            }
            i13 += 8;
            i12 = (i12 + i13) & i11;
        }
        return iNumberOfTrailingZeros >= 0;
    }

    public final java.lang.Object c(java.lang.Object obj) {
        int iNumberOfTrailingZeros;
        int i6 = 0;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i10 = iHashCode ^ (iHashCode << 16);
        int i11 = i10 & com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor.MODULE_VERSION;
        int i12 = this.f53336d;
        int i13 = i10 >>> 7;
        loop0: while (true) {
            int i14 = i13 & i12;
            long[] jArr = this.f53333a;
            int i15 = i14 >> 3;
            int i16 = (i14 & 7) << 3;
            long j6 = ((jArr[i15 + 1] << (64 - i16)) & ((-i16) >> 63)) | (jArr[i15] >>> i16);
            long j10 = (((long) i11) * 72340172838076673L) ^ j6;
            for (long j11 = (~j10) & (j10 - 72340172838076673L) & (-9187201950435737472L); j11 != 0; j11 &= j11 - 1) {
                iNumberOfTrailingZeros = ((java.lang.Long.numberOfTrailingZeros(j11) >> 3) + i14) & i12;
                if (p247y7.AbstractC7350t.b(this.f53334b[iNumberOfTrailingZeros], obj)) {
                    break loop0;
                }
            }
            if ((j6 & ((~j6) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            }
            i6 += 8;
            i13 = i14 + i6;
        }
        if (iNumberOfTrailingZeros >= 0) {
            return this.f53335c[iNumberOfTrailingZeros];
        }
        return null;
    }

    public final int d() {
        return this.f53336d;
    }

    public final int e() {
        return this.f53337e;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0073 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:33:0x0075 A[LOOP:0: B:14:0x0027->B:33:0x0075, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:35:0x0078 A[EDGE_INSN: B:35:0x0078->B:34:0x0078 BREAK  A[LOOP:0: B:14:0x0027->B:33:0x0075], SYNTHETIC] */
    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p170r.U)) {
            return false;
        }
        p170r.U u6 = (p170r.U) obj;
        if (u6.e() != e()) {
            return false;
        }
        java.lang.Object[] objArr = this.f53334b;
        java.lang.Object[] objArr2 = this.f53335c;
        long[] jArr = this.f53333a;
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
                            java.lang.Object obj2 = objArr[i12];
                            java.lang.Object obj3 = objArr2[i12];
                            if (obj3 == null) {
                                if (u6.c(obj2) != null || !u6.b(obj2)) {
                                    return false;
                                }
                            } else if (!p247y7.AbstractC7350t.b(obj3, u6.c(obj2))) {
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
        return this.f53337e == 0;
    }

    public final boolean g() {
        return this.f53337e != 0;
    }

    public int hashCode() {
        java.lang.Object[] objArr = this.f53334b;
        java.lang.Object[] objArr2 = this.f53335c;
        long[] jArr = this.f53333a;
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
                            java.lang.Object obj2 = objArr2[i13];
                            iHashCode += (obj2 != null ? obj2.hashCode() : 0) ^ (obj != null ? obj.hashCode() : 0);
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

    /* JADX WARN: Code duplicated, block: B:26:0x007a A[DONT_INVERT, PHI: r8
  0x007a: PHI (r8v2 int) = (r8v1 int), (r8v3 int) binds: [B:10:0x0031, B:25:0x0078] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:27:0x007c A[LOOP:0: B:9:0x0023->B:27:0x007c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:31:0x007f A[EDGE_INSN: B:31:0x007f->B:28:0x007f BREAK  A[LOOP:0: B:9:0x0023->B:27:0x007c], SYNTHETIC] */
    public java.lang.String toString() {
        if (f()) {
            return "{}";
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append('{');
        java.lang.Object[] objArr = this.f53334b;
        java.lang.Object[] objArr2 = this.f53335c;
        long[] jArr = this.f53333a;
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
                            java.lang.Object obj2 = objArr2[i13];
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb.append(obj);
                            sb.append("=");
                            if (obj2 == this) {
                                obj2 = "(this)";
                            }
                            sb.append(obj2);
                            i10++;
                            if (i10 < this.f53337e) {
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
