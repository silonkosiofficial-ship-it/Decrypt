package p170r;

/* JADX INFO: loaded from: classes.dex */
public abstract class S {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long[] f53327a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public java.lang.Object[] f53328b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long[] f53329c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f53330d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f53331e;

    private S() {
        this.f53327a = p170r.V.f53338a;
        this.f53328b = p180s.a.f54038c;
        this.f53329c = p170r.AbstractC7045u.a();
    }

    public /* synthetic */ S(p247y7.AbstractC7342k abstractC7342k) {
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
        int i12 = this.f53330d;
        int i13 = i10 >>> 7;
        while (true) {
            int i14 = i13 & i12;
            long[] jArr = this.f53327a;
            int i15 = i14 >> 3;
            int i16 = (i14 & 7) << 3;
            long j6 = ((jArr[i15 + 1] << (64 - i16)) & ((-i16) >> 63)) | (jArr[i15] >>> i16);
            long j10 = (((long) i11) * 72340172838076673L) ^ j6;
            for (long j11 = (~j10) & (j10 - 72340172838076673L) & (-9187201950435737472L); j11 != 0; j11 &= j11 - 1) {
                int iNumberOfTrailingZeros = ((java.lang.Long.numberOfTrailingZeros(j11) >> 3) + i14) & i12;
                if (p247y7.AbstractC7350t.b(this.f53328b[iNumberOfTrailingZeros], obj)) {
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

    public final long c(java.lang.Object obj) {
        int iB = b(obj);
        if (iB >= 0) {
            return this.f53329c[iB];
        }
        throw new java.util.NoSuchElementException("There is no key " + obj + " in the map");
    }

    public final int d() {
        return this.f53330d;
    }

    public final long e(java.lang.Object obj, long j6) {
        int iB = b(obj);
        return iB >= 0 ? this.f53329c[iB] : j6;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0062 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x0064 A[LOOP:0: B:14:0x0027->B:26:0x0064, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:30:0x0067 A[SYNTHETIC] */
    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p170r.S)) {
            return false;
        }
        p170r.S s6 = (p170r.S) obj;
        if (s6.f() != f()) {
            return false;
        }
        java.lang.Object[] objArr = this.f53328b;
        long[] jArr = this.f53329c;
        long[] jArr2 = this.f53327a;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i6 = 0;
            while (true) {
                long j6 = jArr2[i6];
                if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i10 = 8 - ((~(i6 - length)) >>> 31);
                    for (int i11 = 0; i11 < i10; i11++) {
                        if ((255 & j6) < 128) {
                            int i12 = (i6 << 3) + i11;
                            if (jArr[i12] != s6.c(objArr[i12])) {
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
        return this.f53331e;
    }

    public final boolean g() {
        return this.f53331e == 0;
    }

    public int hashCode() {
        java.lang.Object[] objArr = this.f53328b;
        long[] jArr = this.f53329c;
        long[] jArr2 = this.f53327a;
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
                            java.lang.Object obj = objArr[i13];
                            iHashCode += (obj != null ? obj.hashCode() : 0) ^ p170r.r.a(jArr[i13]);
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
        if (g()) {
            return "{}";
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append('{');
        java.lang.Object[] objArr = this.f53328b;
        long[] jArr = this.f53329c;
        long[] jArr2 = this.f53327a;
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
                            java.lang.Object obj = objArr[i15];
                            i10 = i11;
                            long j10 = jArr[i15];
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb.append(obj);
                            sb.append("=");
                            sb.append(j10);
                            i12++;
                            if (i12 < this.f53331e) {
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
