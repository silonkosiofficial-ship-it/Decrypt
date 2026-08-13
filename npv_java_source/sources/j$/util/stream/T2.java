package j$.util.stream;

/* JADX INFO: loaded from: classes4.dex */
class T2 extends j$.util.stream.Z2 implements java.util.function.DoubleConsumer {
    @Override // java.util.function.DoubleConsumer
    public void accept(double d6) {
        w();
        double[] dArr = (double[]) this.f48401e;
        int i6 = this.f48426b;
        this.f48426b = i6 + 1;
        dArr[i6] = d6;
    }

    public final /* synthetic */ java.util.function.DoubleConsumer andThen(java.util.function.DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.a(this, doubleConsumer);
    }

    @Override // j$.util.stream.Z2
    public final java.lang.Object c(int i6) {
        return new double[i6];
    }

    @Override // java.lang.Iterable, j$.lang.a
    public final void forEach(java.util.function.Consumer consumer) {
        if (consumer instanceof java.util.function.DoubleConsumer) {
            e((java.util.function.DoubleConsumer) consumer);
        } else {
            if (j$.util.stream.O3.f48308a) {
                j$.util.stream.O3.a(getClass(), "{0} calling SpinedBuffer.OfDouble.forEach(Consumer)");
                throw null;
            }
            j$.util.Q.a((j$.util.stream.S2) spliterator(), consumer);
        }
    }

    @Override // java.lang.Iterable
    public final java.util.Iterator iterator() {
        return j$.util.Spliterators.f(spliterator());
    }

    @Override // j$.util.stream.Z2
    protected final void r(java.lang.Object obj, int i6, int i10, java.lang.Object obj2) {
        double[] dArr = (double[]) obj;
        java.util.function.DoubleConsumer doubleConsumer = (java.util.function.DoubleConsumer) obj2;
        while (i6 < i10) {
            doubleConsumer.accept(dArr[i6]);
            i6++;
        }
    }

    @Override // j$.util.stream.Z2
    protected final int s(java.lang.Object obj) {
        return ((double[]) obj).length;
    }

    public final java.lang.String toString() {
        double[] dArr = (double[]) d();
        if (dArr.length < 200) {
            return java.lang.String.format("%s[length=%d, chunks=%d]%s", getClass().getSimpleName(), java.lang.Integer.valueOf(dArr.length), java.lang.Integer.valueOf(this.f48427c), java.util.Arrays.toString(dArr));
        }
        return java.lang.String.format("%s[length=%d, chunks=%d]%s...", getClass().getSimpleName(), java.lang.Integer.valueOf(dArr.length), java.lang.Integer.valueOf(this.f48427c), java.util.Arrays.toString(java.util.Arrays.copyOf(dArr, 200)));
    }

    @Override // j$.util.stream.Z2
    protected final java.lang.Object[] v() {
        return new double[8][];
    }

    @Override // j$.util.stream.Z2, java.lang.Iterable
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public j$.util.U spliterator() {
        return new j$.util.stream.S2(this, 0, this.f48427c, 0, this.f48426b);
    }
}
