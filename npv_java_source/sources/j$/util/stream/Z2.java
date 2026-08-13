package j$.util.stream;

/* JADX INFO: loaded from: classes4.dex */
abstract class Z2 extends j$.util.stream.AbstractC6742d implements java.lang.Iterable, j$.lang.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    java.lang.Object f48401e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    java.lang.Object[] f48402f;

    Z2() {
        this.f48401e = c(16);
    }

    Z2(int i6) {
        super(i6);
        this.f48401e = c(1 << this.f48425a);
    }

    public abstract java.lang.Object c(int i6);

    @Override // j$.util.stream.AbstractC6742d
    public final void clear() {
        java.lang.Object[] objArr = this.f48402f;
        if (objArr != null) {
            this.f48401e = objArr[0];
            this.f48402f = null;
            this.f48428d = null;
        }
        this.f48426b = 0;
        this.f48427c = 0;
    }

    public java.lang.Object d() {
        long jCount = count();
        if (jCount >= 2147483639) {
            throw new java.lang.IllegalArgumentException("Stream size exceeds max array size");
        }
        java.lang.Object objC = c((int) jCount);
        q(0, objC);
        return objC;
    }

    public void e(java.lang.Object obj) {
        for (int i6 = 0; i6 < this.f48427c; i6++) {
            java.lang.Object obj2 = this.f48402f[i6];
            r(obj2, 0, s(obj2), obj);
        }
        r(this.f48401e, 0, this.f48426b, obj);
    }

    public void q(int i6, java.lang.Object obj) {
        long j6 = i6;
        long jCount = count() + j6;
        if (jCount > s(obj) || jCount < j6) {
            throw new java.lang.IndexOutOfBoundsException("does not fit");
        }
        if (this.f48427c == 0) {
            java.lang.System.arraycopy(this.f48401e, 0, obj, i6, this.f48426b);
            return;
        }
        for (int i10 = 0; i10 < this.f48427c; i10++) {
            java.lang.Object obj2 = this.f48402f[i10];
            java.lang.System.arraycopy(obj2, 0, obj, i6, s(obj2));
            i6 += s(this.f48402f[i10]);
        }
        int i11 = this.f48426b;
        if (i11 > 0) {
            java.lang.System.arraycopy(this.f48401e, 0, obj, i6, i11);
        }
    }

    protected abstract void r(java.lang.Object obj, int i6, int i10, java.lang.Object obj2);

    protected abstract int s(java.lang.Object obj);

    public abstract j$.util.Spliterator spliterator();

    @Override // java.lang.Iterable
    public final /* synthetic */ java.util.Spliterator spliterator() {
        return j$.util.Spliterator.Wrapper.convert(spliterator());
    }

    protected final int t(long j6) {
        if (this.f48427c == 0) {
            if (j6 < this.f48426b) {
                return 0;
            }
            throw new java.lang.IndexOutOfBoundsException(java.lang.Long.toString(j6));
        }
        if (j6 >= count()) {
            throw new java.lang.IndexOutOfBoundsException(java.lang.Long.toString(j6));
        }
        for (int i6 = 0; i6 <= this.f48427c; i6++) {
            if (j6 < this.f48428d[i6] + ((long) s(this.f48402f[i6]))) {
                return i6;
            }
        }
        throw new java.lang.IndexOutOfBoundsException(java.lang.Long.toString(j6));
    }

    protected final void u(long j6) {
        long jS;
        int i6 = this.f48427c;
        if (i6 == 0) {
            jS = s(this.f48401e);
        } else {
            jS = ((long) s(this.f48402f[i6])) + this.f48428d[i6];
        }
        if (j6 > jS) {
            if (this.f48402f == null) {
                java.lang.Object[] objArrV = v();
                this.f48402f = objArrV;
                this.f48428d = new long[8];
                objArrV[0] = this.f48401e;
            }
            int i10 = this.f48427c + 1;
            while (j6 > jS) {
                java.lang.Object[] objArr = this.f48402f;
                if (i10 >= objArr.length) {
                    int length = objArr.length * 2;
                    this.f48402f = java.util.Arrays.copyOf(objArr, length);
                    this.f48428d = java.util.Arrays.copyOf(this.f48428d, length);
                }
                int iMin = this.f48425a;
                if (i10 != 0 && i10 != 1) {
                    iMin = java.lang.Math.min((iMin + i10) - 1, 30);
                }
                int i11 = 1 << iMin;
                this.f48402f[i10] = c(i11);
                long[] jArr = this.f48428d;
                int i12 = i10 - 1;
                jArr[i10] = jArr[i12] + ((long) s(this.f48402f[i12]));
                jS += (long) i11;
                i10++;
            }
        }
    }

    protected abstract java.lang.Object[] v();

    protected final void w() {
        long jS;
        if (this.f48426b == s(this.f48401e)) {
            if (this.f48402f == null) {
                java.lang.Object[] objArrV = v();
                this.f48402f = objArrV;
                this.f48428d = new long[8];
                objArrV[0] = this.f48401e;
            }
            int i6 = this.f48427c;
            int i10 = i6 + 1;
            java.lang.Object[] objArr = this.f48402f;
            if (i10 >= objArr.length || objArr[i10] == null) {
                if (i6 == 0) {
                    jS = s(this.f48401e);
                } else {
                    jS = ((long) s(objArr[i6])) + this.f48428d[i6];
                }
                u(jS + 1);
            }
            this.f48426b = 0;
            int i11 = this.f48427c + 1;
            this.f48427c = i11;
            this.f48401e = this.f48402f[i11];
        }
    }
}
