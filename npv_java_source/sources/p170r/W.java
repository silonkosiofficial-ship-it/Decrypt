package p170r;

/* JADX INFO: loaded from: classes.dex */
public abstract class W {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long[] f53340a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public java.lang.Object[] f53341b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f53342c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f53343d;

    public class a implements java.util.Set, p256z7.a {
        public a() {
        }

        @Override // java.util.Set, java.util.Collection
        public boolean contains(java.lang.Object obj) {
            return p170r.W.this.a(obj);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean containsAll(java.util.Collection collection) {
            p247y7.AbstractC7350t.f(collection, "elements");
            p170r.W w6 = p170r.W.this;
            java.util.Iterator it = collection.iterator();
            while (it.hasNext()) {
                if (!w6.a(it.next())) {
                    return false;
                }
            }
            return true;
        }

        public int d() {
            return p170r.W.this.f53343d;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean isEmpty() {
            return p170r.W.this.d();
        }

        @Override // java.util.Set, java.util.Collection
        public final /* bridge */ int size() {
            return d();
        }

        @Override // java.util.Set, java.util.Collection
        public java.lang.Object[] toArray() {
            return p247y7.AbstractC7341j.a(this);
        }

        @Override // java.util.Set, java.util.Collection
        public java.lang.Object[] toArray(java.lang.Object[] objArr) {
            p247y7.AbstractC7350t.f(objArr, "array");
            return p247y7.AbstractC7341j.b(this, objArr);
        }
    }

    static final class b extends p247y7.AbstractC7352v implements p237x7.l {
        b() {
            super(1);
        }

        @Override // p237x7.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.CharSequence l(java.lang.Object obj) {
            return obj == p170r.W.this ? "(this)" : java.lang.String.valueOf(obj);
        }
    }

    private W() {
        this.f53340a = p170r.V.f53338a;
        this.f53341b = p180s.a.f54038c;
    }

    public /* synthetic */ W(p247y7.AbstractC7342k abstractC7342k) {
        this();
    }

    public static /* synthetic */ java.lang.String g(p170r.W w6, java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, java.lang.CharSequence charSequence3, int i6, java.lang.CharSequence charSequence4, p237x7.l lVar, int i10, java.lang.Object obj) {
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
        java.lang.CharSequence charSequence7 = charSequence4;
        if ((i10 & 32) != 0) {
            lVar = null;
        }
        return w6.f(charSequence, charSequence5, charSequence6, i11, charSequence7, lVar);
    }

    public final boolean a(java.lang.Object obj) {
        int iNumberOfTrailingZeros;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i6 = iHashCode ^ (iHashCode << 16);
        int i10 = i6 & com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor.MODULE_VERSION;
        int i11 = this.f53342c;
        int i12 = (i6 >>> 7) & i11;
        int i13 = 0;
        loop0: while (true) {
            long[] jArr = this.f53340a;
            int i14 = i12 >> 3;
            int i15 = (i12 & 7) << 3;
            long j6 = ((jArr[i14 + 1] << (64 - i15)) & ((-i15) >> 63)) | (jArr[i14] >>> i15);
            long j10 = (((long) i10) * 72340172838076673L) ^ j6;
            for (long j11 = (~j10) & (j10 - 72340172838076673L) & (-9187201950435737472L); j11 != 0; j11 &= j11 - 1) {
                iNumberOfTrailingZeros = ((java.lang.Long.numberOfTrailingZeros(j11) >> 3) + i12) & i11;
                if (p247y7.AbstractC7350t.b(this.f53341b[iNumberOfTrailingZeros], obj)) {
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
        return this.f53342c;
    }

    public final int c() {
        return this.f53343d;
    }

    public final boolean d() {
        return this.f53343d == 0;
    }

    public final boolean e() {
        return this.f53343d != 0;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x005c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x005e A[LOOP:0: B:14:0x0025->B:26:0x005e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:30:0x0061 A[SYNTHETIC] */
    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p170r.W)) {
            return false;
        }
        p170r.W w6 = (p170r.W) obj;
        if (w6.c() != c()) {
            return false;
        }
        java.lang.Object[] objArr = this.f53341b;
        long[] jArr = this.f53340a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i6 = 0;
            while (true) {
                long j6 = jArr[i6];
                if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i10 = 8 - ((~(i6 - length)) >>> 31);
                    for (int i11 = 0; i11 < i10; i11++) {
                        if ((255 & j6) < 128 && !w6.a(objArr[(i6 << 3) + i11])) {
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

    public final java.lang.String f(java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, java.lang.CharSequence charSequence3, int i6, java.lang.CharSequence charSequence4, p237x7.l lVar) {
        p247y7.AbstractC7350t.f(charSequence, "separator");
        p247y7.AbstractC7350t.f(charSequence2, "prefix");
        p247y7.AbstractC7350t.f(charSequence3, "postfix");
        p247y7.AbstractC7350t.f(charSequence4, "truncated");
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(charSequence2);
        java.lang.Object[] objArr = this.f53341b;
        long[] jArr = this.f53340a;
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
                for (int i14 = 0; i14 < i13; i14++) {
                    if ((j6 & 255) < 128) {
                        java.lang.Object obj = objArr[(i10 << 3) + i14];
                        if (i11 == i6) {
                            sb.append(charSequence4);
                            break loop0;
                        }
                        if (i11 != 0) {
                            sb.append(charSequence);
                        }
                        if (lVar == null) {
                            sb.append(obj);
                        } else {
                            sb.append((java.lang.CharSequence) lVar.l(obj));
                        }
                        i11++;
                        i12 = 8;
                    }
                    j6 >>= i12;
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

    public int hashCode() {
        java.lang.Object[] objArr = this.f53341b;
        long[] jArr = this.f53340a;
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
                            java.lang.Object obj = objArr[(i10 << 3) + i12];
                            iHashCode += obj != null ? obj.hashCode() : 0;
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
        return g(this, null, "[", "]", 0, null, new r.W.b(), 25, null);
    }
}
