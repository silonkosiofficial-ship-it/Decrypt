package j$.util.stream;

/* JADX INFO: loaded from: classes4.dex */
class X2 extends j$.util.stream.Z2 implements java.util.function.LongConsumer {
    @Override // java.util.function.LongConsumer
    public void accept(long j6) {
        w();
        long[] jArr = (long[]) this.f48401e;
        int i6 = this.f48426b;
        this.f48426b = i6 + 1;
        jArr[i6] = j6;
    }

    public final /* synthetic */ java.util.function.LongConsumer andThen(java.util.function.LongConsumer longConsumer) {
        return j$.com.android.tools.r8.a.c(this, longConsumer);
    }

    @Override // j$.util.stream.Z2
    public final java.lang.Object c(int i6) {
        return new long[i6];
    }

    @Override // java.lang.Iterable, j$.lang.a
    public final void forEach(java.util.function.Consumer consumer) {
        if (consumer instanceof java.util.function.LongConsumer) {
            e((java.util.function.LongConsumer) consumer);
        } else {
            if (j$.util.stream.O3.f48308a) {
                j$.util.stream.O3.a(getClass(), "{0} calling SpinedBuffer.OfLong.forEach(Consumer)");
                throw null;
            }
            j$.util.Q.c((j$.util.stream.W2) spliterator(), consumer);
        }
    }

    @Override // java.lang.Iterable
    public final java.util.Iterator iterator() {
        return j$.util.Spliterators.h(spliterator());
    }

    @Override // j$.util.stream.Z2
    protected final void r(java.lang.Object obj, int i6, int i10, java.lang.Object obj2) {
        long[] jArr = (long[]) obj;
        java.util.function.LongConsumer longConsumer = (java.util.function.LongConsumer) obj2;
        while (i6 < i10) {
            longConsumer.accept(jArr[i6]);
            i6++;
        }
    }

    @Override // j$.util.stream.Z2
    protected final int s(java.lang.Object obj) {
        return ((long[]) obj).length;
    }

    public final java.lang.String toString() {
        long[] jArr = (long[]) d();
        if (jArr.length < 200) {
            return java.lang.String.format("%s[length=%d, chunks=%d]%s", getClass().getSimpleName(), java.lang.Integer.valueOf(jArr.length), java.lang.Integer.valueOf(this.f48427c), java.util.Arrays.toString(jArr));
        }
        return java.lang.String.format("%s[length=%d, chunks=%d]%s...", getClass().getSimpleName(), java.lang.Integer.valueOf(jArr.length), java.lang.Integer.valueOf(this.f48427c), java.util.Arrays.toString(java.util.Arrays.copyOf(jArr, 200)));
    }

    @Override // j$.util.stream.Z2
    protected final java.lang.Object[] v() {
        return new long[8][];
    }

    @Override // j$.util.stream.Z2, java.lang.Iterable
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public j$.util.a0 spliterator() {
        return new j$.util.stream.W2(this, 0, this.f48427c, 0, this.f48426b);
    }
}
