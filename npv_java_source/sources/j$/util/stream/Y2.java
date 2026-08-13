package j$.util.stream;

/* JADX INFO: loaded from: classes4.dex */
abstract class Y2 implements j$.util.d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int f48392a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final int f48393b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f48394c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final int f48395d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    java.lang.Object f48396e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ j$.util.stream.Z2 f48397f;

    Y2(j$.util.stream.Z2 z6, int i6, int i10, int i11, int i12) {
        this.f48397f = z6;
        this.f48392a = i6;
        this.f48393b = i10;
        this.f48394c = i11;
        this.f48395d = i12;
        java.lang.Object[] objArr = z6.f48402f;
        this.f48396e = objArr == null ? z6.f48401e : objArr[i6];
    }

    abstract void a(int i6, java.lang.Object obj, java.lang.Object obj2);

    abstract j$.util.d0 b(java.lang.Object obj, int i6, int i10);

    abstract j$.util.d0 c(int i6, int i10, int i11, int i12);

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return 16464;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        int i6 = this.f48392a;
        int i10 = this.f48395d;
        int i11 = this.f48393b;
        if (i6 == i11) {
            return ((long) i10) - ((long) this.f48394c);
        }
        long[] jArr = this.f48397f.f48428d;
        return ((jArr[i11] + ((long) i10)) - jArr[i6]) - ((long) this.f48394c);
    }

    @Override // j$.util.d0
    public final void forEachRemaining(java.lang.Object obj) {
        j$.util.stream.Z2 z6;
        j$.util.Objects.requireNonNull(obj);
        int i6 = this.f48392a;
        int i10 = this.f48395d;
        int i11 = this.f48393b;
        if (i6 < i11 || (i6 == i11 && this.f48394c < i10)) {
            int i12 = this.f48394c;
            while (true) {
                z6 = this.f48397f;
                if (i6 >= i11) {
                    break;
                }
                java.lang.Object obj2 = z6.f48402f[i6];
                z6.r(obj2, i12, z6.s(obj2), obj);
                i6++;
                i12 = 0;
            }
            z6.r(this.f48392a == i11 ? this.f48396e : z6.f48402f[i11], i12, i10, obj);
            this.f48392a = i11;
            this.f48394c = i10;
        }
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(java.util.function.DoubleConsumer doubleConsumer) {
        forEachRemaining((java.lang.Object) doubleConsumer);
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(java.util.function.IntConsumer intConsumer) {
        forEachRemaining((java.lang.Object) intConsumer);
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(java.util.function.LongConsumer longConsumer) {
        forEachRemaining((java.lang.Object) longConsumer);
    }

    @Override // j$.util.Spliterator
    public final java.util.Comparator getComparator() {
        throw new java.lang.IllegalStateException();
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return j$.util.Q.d(this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i6) {
        return j$.util.Q.e(this, i6);
    }

    @Override // j$.util.d0
    public final boolean tryAdvance(java.lang.Object obj) {
        j$.util.Objects.requireNonNull(obj);
        int i6 = this.f48392a;
        int i10 = this.f48393b;
        if (i6 >= i10 && (i6 != i10 || this.f48394c >= this.f48395d)) {
            return false;
        }
        java.lang.Object obj2 = this.f48396e;
        int i11 = this.f48394c;
        this.f48394c = i11 + 1;
        a(i11, obj2, obj);
        int i12 = this.f48394c;
        java.lang.Object obj3 = this.f48396e;
        j$.util.stream.Z2 z6 = this.f48397f;
        if (i12 == z6.s(obj3)) {
            this.f48394c = 0;
            int i13 = this.f48392a + 1;
            this.f48392a = i13;
            java.lang.Object[] objArr = z6.f48402f;
            if (objArr != null && i13 <= i10) {
                this.f48396e = objArr[i13];
            }
        }
        return true;
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(java.util.function.DoubleConsumer doubleConsumer) {
        return tryAdvance((java.lang.Object) doubleConsumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(java.util.function.IntConsumer intConsumer) {
        return tryAdvance((java.lang.Object) intConsumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(java.util.function.LongConsumer longConsumer) {
        return tryAdvance((java.lang.Object) longConsumer);
    }

    @Override // j$.util.d0, j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.U trySplit() {
        return (j$.util.U) trySplit();
    }

    @Override // j$.util.d0, j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.X trySplit() {
        return (j$.util.X) trySplit();
    }

    @Override // j$.util.d0, j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.a0 trySplit() {
        return (j$.util.a0) trySplit();
    }

    @Override // j$.util.Spliterator
    public final j$.util.d0 trySplit() {
        int i6 = this.f48392a;
        int i10 = this.f48393b;
        if (i6 < i10) {
            int i11 = i10 - 1;
            int i12 = this.f48394c;
            j$.util.stream.Z2 z6 = this.f48397f;
            j$.util.d0 d0VarC = c(i6, i11, i12, z6.s(z6.f48402f[i11]));
            this.f48392a = i10;
            this.f48394c = 0;
            this.f48396e = z6.f48402f[i10];
            return d0VarC;
        }
        if (i6 != i10) {
            return null;
        }
        int i13 = this.f48394c;
        int i14 = (this.f48395d - i13) / 2;
        if (i14 == 0) {
            return null;
        }
        j$.util.d0 d0VarB = b(this.f48396e, i13, i14);
        this.f48394c += i14;
        return d0VarB;
    }
}
