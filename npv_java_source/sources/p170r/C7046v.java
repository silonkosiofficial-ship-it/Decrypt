package p170r;

/* JADX INFO: renamed from: r.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C7046v implements java.lang.Cloneable {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public /* synthetic */ boolean f53416C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public /* synthetic */ long[] f53417D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public /* synthetic */ java.lang.Object[] f53418E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public /* synthetic */ int f53419F;

    public C7046v() {
        this(0, 1, null);
    }

    public C7046v(int i6) {
        if (i6 == 0) {
            this.f53417D = p180s.a.f54037b;
            this.f53418E = p180s.a.f54038c;
        } else {
            int iF = p180s.a.f(i6);
            this.f53417D = new long[iF];
            this.f53418E = new java.lang.Object[iF];
        }
    }

    public /* synthetic */ C7046v(int i6, int i10, p247y7.AbstractC7342k abstractC7342k) {
        this((i10 & 1) != 0 ? 10 : i6);
    }

    public void a(long j6, java.lang.Object obj) {
        int i6 = this.f53419F;
        if (i6 != 0 && j6 <= this.f53417D[i6 - 1]) {
            m(j6, obj);
            return;
        }
        if (this.f53416C) {
            long[] jArr = this.f53417D;
            if (i6 >= jArr.length) {
                java.lang.Object[] objArr = this.f53418E;
                int i10 = 0;
                for (int i11 = 0; i11 < i6; i11++) {
                    java.lang.Object obj2 = objArr[i11];
                    if (obj2 != p170r.AbstractC7047w.f53420a) {
                        if (i11 != i10) {
                            jArr[i10] = jArr[i11];
                            objArr[i10] = obj2;
                            objArr[i11] = null;
                        }
                        i10++;
                    }
                }
                this.f53416C = false;
                this.f53419F = i10;
            }
        }
        int i12 = this.f53419F;
        if (i12 >= this.f53417D.length) {
            int iF = p180s.a.f(i12 + 1);
            long[] jArrCopyOf = java.util.Arrays.copyOf(this.f53417D, iF);
            p247y7.AbstractC7350t.e(jArrCopyOf, "copyOf(this, newSize)");
            this.f53417D = jArrCopyOf;
            java.lang.Object[] objArrCopyOf = java.util.Arrays.copyOf(this.f53418E, iF);
            p247y7.AbstractC7350t.e(objArrCopyOf, "copyOf(this, newSize)");
            this.f53418E = objArrCopyOf;
        }
        this.f53417D[i12] = j6;
        this.f53418E[i12] = obj;
        this.f53419F = i12 + 1;
    }

    public void b() {
        int i6 = this.f53419F;
        java.lang.Object[] objArr = this.f53418E;
        for (int i10 = 0; i10 < i6; i10++) {
            objArr[i10] = null;
        }
        this.f53419F = 0;
        this.f53416C = false;
    }

    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public p170r.C7046v clone() throws java.lang.CloneNotSupportedException {
        java.lang.Object objClone = super.clone();
        p247y7.AbstractC7350t.d(objClone, "null cannot be cast to non-null type androidx.collection.LongSparseArray<E of androidx.collection.LongSparseArray>");
        p170r.C7046v c7046v = (p170r.C7046v) objClone;
        c7046v.f53417D = (long[]) this.f53417D.clone();
        c7046v.f53418E = (java.lang.Object[]) this.f53418E.clone();
        return c7046v;
    }

    public boolean d(long j6) {
        return j(j6) >= 0;
    }

    public java.lang.Object e(long j6) {
        int iB = p180s.a.b(this.f53417D, this.f53419F, j6);
        if (iB < 0 || this.f53418E[iB] == p170r.AbstractC7047w.f53420a) {
            return null;
        }
        return this.f53418E[iB];
    }

    public java.lang.Object h(long j6, java.lang.Object obj) {
        int iB = p180s.a.b(this.f53417D, this.f53419F, j6);
        return (iB < 0 || this.f53418E[iB] == p170r.AbstractC7047w.f53420a) ? obj : this.f53418E[iB];
    }

    public int j(long j6) {
        if (this.f53416C) {
            int i6 = this.f53419F;
            long[] jArr = this.f53417D;
            java.lang.Object[] objArr = this.f53418E;
            int i10 = 0;
            for (int i11 = 0; i11 < i6; i11++) {
                java.lang.Object obj = objArr[i11];
                if (obj != p170r.AbstractC7047w.f53420a) {
                    if (i11 != i10) {
                        jArr[i10] = jArr[i11];
                        objArr[i10] = obj;
                        objArr[i11] = null;
                    }
                    i10++;
                }
            }
            this.f53416C = false;
            this.f53419F = i10;
        }
        return p180s.a.b(this.f53417D, this.f53419F, j6);
    }

    public boolean k() {
        return q() == 0;
    }

    public long l(int i6) {
        if (!(i6 >= 0 && i6 < this.f53419F)) {
            p180s.d.a("Expected index to be within 0..size()-1, but was " + i6);
        }
        if (this.f53416C) {
            int i10 = this.f53419F;
            long[] jArr = this.f53417D;
            java.lang.Object[] objArr = this.f53418E;
            int i11 = 0;
            for (int i12 = 0; i12 < i10; i12++) {
                java.lang.Object obj = objArr[i12];
                if (obj != p170r.AbstractC7047w.f53420a) {
                    if (i12 != i11) {
                        jArr[i11] = jArr[i12];
                        objArr[i11] = obj;
                        objArr[i12] = null;
                    }
                    i11++;
                }
            }
            this.f53416C = false;
            this.f53419F = i11;
        }
        return this.f53417D[i6];
    }

    public void m(long j6, java.lang.Object obj) {
        int iB = p180s.a.b(this.f53417D, this.f53419F, j6);
        if (iB >= 0) {
            this.f53418E[iB] = obj;
            return;
        }
        int i6 = ~iB;
        if (i6 < this.f53419F && this.f53418E[i6] == p170r.AbstractC7047w.f53420a) {
            this.f53417D[i6] = j6;
            this.f53418E[i6] = obj;
            return;
        }
        if (this.f53416C) {
            int i10 = this.f53419F;
            long[] jArr = this.f53417D;
            if (i10 >= jArr.length) {
                java.lang.Object[] objArr = this.f53418E;
                int i11 = 0;
                for (int i12 = 0; i12 < i10; i12++) {
                    java.lang.Object obj2 = objArr[i12];
                    if (obj2 != p170r.AbstractC7047w.f53420a) {
                        if (i12 != i11) {
                            jArr[i11] = jArr[i12];
                            objArr[i11] = obj2;
                            objArr[i12] = null;
                        }
                        i11++;
                    }
                }
                this.f53416C = false;
                this.f53419F = i11;
                i6 = ~p180s.a.b(this.f53417D, i11, j6);
            }
        }
        int i13 = this.f53419F;
        if (i13 >= this.f53417D.length) {
            int iF = p180s.a.f(i13 + 1);
            long[] jArrCopyOf = java.util.Arrays.copyOf(this.f53417D, iF);
            p247y7.AbstractC7350t.e(jArrCopyOf, "copyOf(this, newSize)");
            this.f53417D = jArrCopyOf;
            java.lang.Object[] objArrCopyOf = java.util.Arrays.copyOf(this.f53418E, iF);
            p247y7.AbstractC7350t.e(objArrCopyOf, "copyOf(this, newSize)");
            this.f53418E = objArrCopyOf;
        }
        int i14 = this.f53419F;
        if (i14 - i6 != 0) {
            long[] jArr2 = this.f53417D;
            int i15 = i6 + 1;
            p097j7.AbstractC6872n.k(jArr2, jArr2, i15, i6, i14);
            java.lang.Object[] objArr2 = this.f53418E;
            p097j7.AbstractC6872n.l(objArr2, objArr2, i15, i6, this.f53419F);
        }
        this.f53417D[i6] = j6;
        this.f53418E[i6] = obj;
        this.f53419F++;
    }

    public void n(long j6) {
        int iB = p180s.a.b(this.f53417D, this.f53419F, j6);
        if (iB < 0 || this.f53418E[iB] == p170r.AbstractC7047w.f53420a) {
            return;
        }
        this.f53418E[iB] = p170r.AbstractC7047w.f53420a;
        this.f53416C = true;
    }

    public void p(int i6) {
        if (this.f53418E[i6] != p170r.AbstractC7047w.f53420a) {
            this.f53418E[i6] = p170r.AbstractC7047w.f53420a;
            this.f53416C = true;
        }
    }

    public int q() {
        if (this.f53416C) {
            int i6 = this.f53419F;
            long[] jArr = this.f53417D;
            java.lang.Object[] objArr = this.f53418E;
            int i10 = 0;
            for (int i11 = 0; i11 < i6; i11++) {
                java.lang.Object obj = objArr[i11];
                if (obj != p170r.AbstractC7047w.f53420a) {
                    if (i11 != i10) {
                        jArr[i10] = jArr[i11];
                        objArr[i10] = obj;
                        objArr[i11] = null;
                    }
                    i10++;
                }
            }
            this.f53416C = false;
            this.f53419F = i10;
        }
        return this.f53419F;
    }

    public java.lang.Object r(int i6) {
        if (!(i6 >= 0 && i6 < this.f53419F)) {
            p180s.d.a("Expected index to be within 0..size()-1, but was " + i6);
        }
        if (this.f53416C) {
            int i10 = this.f53419F;
            long[] jArr = this.f53417D;
            java.lang.Object[] objArr = this.f53418E;
            int i11 = 0;
            for (int i12 = 0; i12 < i10; i12++) {
                java.lang.Object obj = objArr[i12];
                if (obj != p170r.AbstractC7047w.f53420a) {
                    if (i12 != i11) {
                        jArr[i11] = jArr[i12];
                        objArr[i11] = obj;
                        objArr[i12] = null;
                    }
                    i11++;
                }
            }
            this.f53416C = false;
            this.f53419F = i11;
        }
        return this.f53418E[i6];
    }

    public java.lang.String toString() {
        if (q() <= 0) {
            return "{}";
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(this.f53419F * 28);
        sb.append('{');
        int i6 = this.f53419F;
        for (int i10 = 0; i10 < i6; i10++) {
            if (i10 > 0) {
                sb.append(", ");
            }
            sb.append(l(i10));
            sb.append('=');
            java.lang.Object objR = r(i10);
            if (objR != sb) {
                sb.append(objR);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        java.lang.String string = sb.toString();
        p247y7.AbstractC7350t.e(string, "StringBuilder(capacity).…builderAction).toString()");
        return string;
    }
}
