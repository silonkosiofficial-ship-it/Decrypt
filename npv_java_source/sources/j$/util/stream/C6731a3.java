package j$.util.stream;

/* JADX INFO: renamed from: j$.util.stream.a3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
class C6731a3 extends j$.util.stream.AbstractC6742d implements java.util.function.Consumer, java.lang.Iterable, j$.lang.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected java.lang.Object[] f48406e = new java.lang.Object[1 << 4];

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected java.lang.Object[][] f48407f;

    C6731a3() {
    }

    @Override // java.util.function.Consumer
    public void accept(java.lang.Object obj) {
        long length;
        int i6 = this.f48426b;
        java.lang.Object[] objArr = this.f48406e;
        if (i6 == objArr.length) {
            if (this.f48407f == null) {
                java.lang.Object[][] objArr2 = new java.lang.Object[8][];
                this.f48407f = objArr2;
                this.f48428d = new long[8];
                objArr2[0] = objArr;
            }
            int i10 = this.f48427c;
            int i11 = i10 + 1;
            java.lang.Object[][] objArr3 = this.f48407f;
            if (i11 >= objArr3.length || objArr3[i11] == null) {
                if (i10 == 0) {
                    length = objArr.length;
                } else {
                    length = ((long) objArr3[i10].length) + this.f48428d[i10];
                }
                r(length + 1);
            }
            this.f48426b = 0;
            int i12 = this.f48427c + 1;
            this.f48427c = i12;
            this.f48406e = this.f48407f[i12];
        }
        java.lang.Object[] objArr4 = this.f48406e;
        int i13 = this.f48426b;
        this.f48426b = i13 + 1;
        objArr4[i13] = obj;
    }

    public final /* synthetic */ java.util.function.Consumer andThen(java.util.function.Consumer consumer) {
        return j$.util.function.Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.AbstractC6742d
    public final void clear() {
        java.lang.Object[][] objArr = this.f48407f;
        if (objArr != null) {
            this.f48406e = objArr[0];
            int i6 = 0;
            while (true) {
                java.lang.Object[] objArr2 = this.f48406e;
                if (i6 >= objArr2.length) {
                    break;
                }
                objArr2[i6] = null;
                i6++;
            }
            this.f48407f = null;
            this.f48428d = null;
        } else {
            for (int i10 = 0; i10 < this.f48426b; i10++) {
                this.f48406e[i10] = null;
            }
        }
        this.f48426b = 0;
        this.f48427c = 0;
    }

    @Override // java.lang.Iterable, j$.lang.a
    public void forEach(java.util.function.Consumer consumer) {
        for (int i6 = 0; i6 < this.f48427c; i6++) {
            for (java.lang.Object obj : this.f48407f[i6]) {
                consumer.accept(obj);
            }
        }
        for (int i10 = 0; i10 < this.f48426b; i10++) {
            consumer.accept(this.f48406e[i10]);
        }
    }

    @Override // java.lang.Iterable
    public final java.util.Iterator iterator() {
        return j$.util.Spliterators.i(spliterator());
    }

    protected final void r(long j6) {
        int i6 = this.f48427c;
        long length = i6 == 0 ? this.f48406e.length : this.f48428d[i6] + ((long) this.f48407f[i6].length);
        if (j6 > length) {
            if (this.f48407f == null) {
                java.lang.Object[][] objArr = new java.lang.Object[8][];
                this.f48407f = objArr;
                this.f48428d = new long[8];
                objArr[0] = this.f48406e;
            }
            int i10 = i6 + 1;
            while (j6 > length) {
                java.lang.Object[][] objArr2 = this.f48407f;
                if (i10 >= objArr2.length) {
                    int length2 = objArr2.length * 2;
                    this.f48407f = (java.lang.Object[][]) java.util.Arrays.copyOf(objArr2, length2);
                    this.f48428d = java.util.Arrays.copyOf(this.f48428d, length2);
                }
                int iMin = this.f48425a;
                if (i10 != 0 && i10 != 1) {
                    iMin = java.lang.Math.min((iMin + i10) - 1, 30);
                }
                int i11 = 1 << iMin;
                java.lang.Object[][] objArr3 = this.f48407f;
                objArr3[i10] = new java.lang.Object[i11];
                long[] jArr = this.f48428d;
                int i12 = i10 - 1;
                jArr[i10] = jArr[i12] + ((long) objArr3[i12].length);
                length += (long) i11;
                i10++;
            }
        }
    }

    @Override // java.lang.Iterable
    public j$.util.Spliterator spliterator() {
        return new j$.util.stream.R2(this, 0, this.f48427c, 0, this.f48426b);
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ java.util.Spliterator spliterator() {
        return j$.util.Spliterator.Wrapper.convert(spliterator());
    }

    public final java.lang.String toString() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        j$.util.Objects.requireNonNull(arrayList);
        forEach(new j$.util.stream.C6727a(10, arrayList));
        return "SpinedBuffer:" + arrayList.toString();
    }
}
