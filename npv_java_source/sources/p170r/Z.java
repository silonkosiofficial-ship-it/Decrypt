package p170r;

/* JADX INFO: loaded from: classes.dex */
public class Z implements java.lang.Cloneable {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public /* synthetic */ boolean f53350C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public /* synthetic */ int[] f53351D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public /* synthetic */ java.lang.Object[] f53352E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public /* synthetic */ int f53353F;

    public Z() {
        this(0, 1, null);
    }

    public Z(int i6) {
        if (i6 == 0) {
            this.f53351D = p180s.a.f54036a;
            this.f53352E = p180s.a.f54038c;
        } else {
            int iE = p180s.a.e(i6);
            this.f53351D = new int[iE];
            this.f53352E = new java.lang.Object[iE];
        }
    }

    public /* synthetic */ Z(int i6, int i10, p247y7.AbstractC7342k abstractC7342k) {
        this((i10 & 1) != 0 ? 10 : i6);
    }

    public void a(int i6, java.lang.Object obj) {
        int i10 = this.f53353F;
        if (i10 != 0 && i6 <= this.f53351D[i10 - 1]) {
            m(i6, obj);
            return;
        }
        if (this.f53350C && i10 >= this.f53351D.length) {
            p170r.a0.e(this);
        }
        int i11 = this.f53353F;
        if (i11 >= this.f53351D.length) {
            int iE = p180s.a.e(i11 + 1);
            int[] iArrCopyOf = java.util.Arrays.copyOf(this.f53351D, iE);
            p247y7.AbstractC7350t.e(iArrCopyOf, "copyOf(this, newSize)");
            this.f53351D = iArrCopyOf;
            java.lang.Object[] objArrCopyOf = java.util.Arrays.copyOf(this.f53352E, iE);
            p247y7.AbstractC7350t.e(objArrCopyOf, "copyOf(this, newSize)");
            this.f53352E = objArrCopyOf;
        }
        this.f53351D[i11] = i6;
        this.f53352E[i11] = obj;
        this.f53353F = i11 + 1;
    }

    public void b() {
        int i6 = this.f53353F;
        java.lang.Object[] objArr = this.f53352E;
        for (int i10 = 0; i10 < i6; i10++) {
            objArr[i10] = null;
        }
        this.f53353F = 0;
        this.f53350C = false;
    }

    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public p170r.Z clone() throws java.lang.CloneNotSupportedException {
        java.lang.Object objClone = super.clone();
        p247y7.AbstractC7350t.d(objClone, "null cannot be cast to non-null type androidx.collection.SparseArrayCompat<E of androidx.collection.SparseArrayCompat>");
        p170r.Z z6 = (p170r.Z) objClone;
        z6.f53351D = (int[]) this.f53351D.clone();
        z6.f53352E = (java.lang.Object[]) this.f53352E.clone();
        return z6;
    }

    public boolean d(int i6) {
        return j(i6) >= 0;
    }

    public java.lang.Object e(int i6) {
        return p170r.a0.c(this, i6);
    }

    public java.lang.Object h(int i6, java.lang.Object obj) {
        return p170r.a0.d(this, i6, obj);
    }

    public int j(int i6) {
        if (this.f53350C) {
            p170r.a0.e(this);
        }
        return p180s.a.a(this.f53351D, this.f53353F, i6);
    }

    public int k(java.lang.Object obj) {
        if (this.f53350C) {
            p170r.a0.e(this);
        }
        int i6 = this.f53353F;
        for (int i10 = 0; i10 < i6; i10++) {
            if (this.f53352E[i10] == obj) {
                return i10;
            }
        }
        return -1;
    }

    public int l(int i6) {
        if (this.f53350C) {
            p170r.a0.e(this);
        }
        return this.f53351D[i6];
    }

    public void m(int i6, java.lang.Object obj) {
        int iA = p180s.a.a(this.f53351D, this.f53353F, i6);
        if (iA >= 0) {
            this.f53352E[iA] = obj;
            return;
        }
        int i10 = ~iA;
        if (i10 < this.f53353F && this.f53352E[i10] == p170r.a0.f53366a) {
            this.f53351D[i10] = i6;
            this.f53352E[i10] = obj;
            return;
        }
        if (this.f53350C && this.f53353F >= this.f53351D.length) {
            p170r.a0.e(this);
            i10 = ~p180s.a.a(this.f53351D, this.f53353F, i6);
        }
        int i11 = this.f53353F;
        if (i11 >= this.f53351D.length) {
            int iE = p180s.a.e(i11 + 1);
            int[] iArrCopyOf = java.util.Arrays.copyOf(this.f53351D, iE);
            p247y7.AbstractC7350t.e(iArrCopyOf, "copyOf(this, newSize)");
            this.f53351D = iArrCopyOf;
            java.lang.Object[] objArrCopyOf = java.util.Arrays.copyOf(this.f53352E, iE);
            p247y7.AbstractC7350t.e(objArrCopyOf, "copyOf(this, newSize)");
            this.f53352E = objArrCopyOf;
        }
        int i12 = this.f53353F;
        if (i12 - i10 != 0) {
            int[] iArr = this.f53351D;
            int i13 = i10 + 1;
            p097j7.AbstractC6872n.j(iArr, iArr, i13, i10, i12);
            java.lang.Object[] objArr = this.f53352E;
            p097j7.AbstractC6872n.l(objArr, objArr, i13, i10, this.f53353F);
        }
        this.f53351D[i10] = i6;
        this.f53352E[i10] = obj;
        this.f53353F++;
    }

    public int n() {
        if (this.f53350C) {
            p170r.a0.e(this);
        }
        return this.f53353F;
    }

    public java.lang.Object p(int i6) {
        if (this.f53350C) {
            p170r.a0.e(this);
        }
        return this.f53352E[i6];
    }

    public java.lang.String toString() {
        if (n() <= 0) {
            return "{}";
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(this.f53353F * 28);
        sb.append('{');
        int i6 = this.f53353F;
        for (int i10 = 0; i10 < i6; i10++) {
            if (i10 > 0) {
                sb.append(", ");
            }
            sb.append(l(i10));
            sb.append('=');
            java.lang.Object objP = p(i10);
            if (objP != this) {
                sb.append(objP);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        java.lang.String string = sb.toString();
        p247y7.AbstractC7350t.e(string, "buffer.toString()");
        return string;
    }
}
