package p170r;

/* JADX INFO: renamed from: r.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7033h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long[] f53376a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float[] f53377b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f53378c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f53379d;

    private AbstractC7033h() {
        this.f53376a = p170r.V.f53338a;
        this.f53377b = p170r.AbstractC7034i.a();
    }

    public /* synthetic */ AbstractC7033h(p247y7.AbstractC7342k abstractC7342k) {
        this();
    }

    public static /* synthetic */ java.lang.String d(p170r.AbstractC7033h abstractC7033h, java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, java.lang.CharSequence charSequence3, int i6, java.lang.CharSequence charSequence4, int i10, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: joinToString");
        }
        if ((i10 & 1) != 0) {
            charSequence = ", ";
        }
        java.lang.CharSequence charSequence5 = (i10 & 2) != 0 ? "" : charSequence2;
        java.lang.CharSequence charSequence6 = (i10 & 4) == 0 ? charSequence3 : "";
        if ((i10 & 8) != 0) {
            i6 = -1;
        }
        int i11 = i6;
        if ((i10 & 16) != 0) {
            charSequence4 = "...";
        }
        return abstractC7033h.c(charSequence, charSequence5, charSequence6, i11, charSequence4);
    }

    public final boolean a(float f6) {
        int iNumberOfTrailingZeros;
        int iFloatToIntBits = java.lang.Float.floatToIntBits(f6) * (-862048943);
        int i6 = iFloatToIntBits ^ (iFloatToIntBits << 16);
        int i10 = i6 & com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor.MODULE_VERSION;
        int i11 = this.f53378c;
        int i12 = (i6 >>> 7) & i11;
        int i13 = 0;
        loop0: while (true) {
            long[] jArr = this.f53376a;
            int i14 = i12 >> 3;
            int i15 = (i12 & 7) << 3;
            long j6 = ((jArr[i14 + 1] << (64 - i15)) & ((-i15) >> 63)) | (jArr[i14] >>> i15);
            long j10 = (((long) i10) * 72340172838076673L) ^ j6;
            for (long j11 = (~j10) & (j10 - 72340172838076673L) & (-9187201950435737472L); j11 != 0; j11 &= j11 - 1) {
                iNumberOfTrailingZeros = ((java.lang.Long.numberOfTrailingZeros(j11) >> 3) + i12) & i11;
                if (this.f53377b[iNumberOfTrailingZeros] == f6) {
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

    public final int b() {
        return this.f53378c;
    }

    public final java.lang.String c(java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, java.lang.CharSequence charSequence3, int i6, java.lang.CharSequence charSequence4) {
        p247y7.AbstractC7350t.f(charSequence, "separator");
        p247y7.AbstractC7350t.f(charSequence2, "prefix");
        p247y7.AbstractC7350t.f(charSequence3, "postfix");
        p247y7.AbstractC7350t.f(charSequence4, "truncated");
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(charSequence2);
        float[] fArr = this.f53377b;
        long[] jArr = this.f53376a;
        int length = jArr.length - 2;
        if (length < 0) {
            sb.append(charSequence3);
            break;
        }
        int i10 = 0;
        int i11 = 0;
        loop0: while (true) {
            long j6 = jArr[i10];
            if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i12 = 8;
                int i13 = 8 - ((~(i10 - length)) >>> 31);
                int i14 = 0;
                while (i14 < i13) {
                    if ((j6 & 255) < 128) {
                        float f6 = fArr[(i10 << 3) + i14];
                        if (i11 == i6) {
                            sb.append(charSequence4);
                            break loop0;
                        }
                        if (i11 != 0) {
                            sb.append(charSequence);
                        }
                        sb.append(f6);
                        i11++;
                    }
                    j6 >>= 8;
                    i14++;
                    i12 = 8;
                }
                if (i13 == i12) {
                }
                sb.append(charSequence3);
                break;
            }
            if (i10 == length) {
                sb.append(charSequence3);
                break;
            }
            i10++;
        }
        java.lang.String string = sb.toString();
        p247y7.AbstractC7350t.e(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0058 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x005a A[LOOP:0: B:14:0x0021->B:26:0x005a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:30:0x005d A[SYNTHETIC] */
    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p170r.AbstractC7033h)) {
            return false;
        }
        p170r.AbstractC7033h abstractC7033h = (p170r.AbstractC7033h) obj;
        if (abstractC7033h.f53379d != this.f53379d) {
            return false;
        }
        float[] fArr = this.f53377b;
        long[] jArr = this.f53376a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i6 = 0;
            while (true) {
                long j6 = jArr[i6];
                if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i10 = 8 - ((~(i6 - length)) >>> 31);
                    for (int i11 = 0; i11 < i10; i11++) {
                        if ((255 & j6) < 128 && !abstractC7033h.a(fArr[(i6 << 3) + i11])) {
                            return false;
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

    public int hashCode() {
        float[] fArr = this.f53377b;
        long[] jArr = this.f53376a;
        int length = jArr.length - 2;
        int i6 = 0;
        if (length >= 0) {
            int i10 = 0;
            int iFloatToIntBits = 0;
            while (true) {
                long j6 = jArr[i10];
                if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j6) < 128) {
                            iFloatToIntBits += java.lang.Float.floatToIntBits(fArr[(i10 << 3) + i12]);
                        }
                        j6 >>= 8;
                    }
                    if (i11 != 8) {
                        return iFloatToIntBits;
                    }
                }
                if (i10 != length) {
                    i10++;
                } else {
                    i6 = iFloatToIntBits;
                }
            }
        }
        return i6;
    }

    public java.lang.String toString() {
        return d(this, null, "[", "]", 0, null, 25, null);
    }
}
