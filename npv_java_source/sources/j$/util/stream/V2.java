package j$.util.stream;

/* JADX INFO: loaded from: classes4.dex */
class V2 extends j$.util.stream.Z2 implements java.util.function.IntConsumer {
    @Override // java.util.function.IntConsumer
    public void accept(int i6) {
        w();
        int[] iArr = (int[]) this.f48401e;
        int i10 = this.f48426b;
        this.f48426b = i10 + 1;
        iArr[i10] = i6;
    }

    public final /* synthetic */ java.util.function.IntConsumer andThen(java.util.function.IntConsumer intConsumer) {
        return j$.com.android.tools.r8.a.b(this, intConsumer);
    }

    @Override // j$.util.stream.Z2
    public final java.lang.Object c(int i6) {
        return new int[i6];
    }

    @Override // java.lang.Iterable, j$.lang.a
    public final void forEach(java.util.function.Consumer consumer) {
        if (consumer instanceof java.util.function.IntConsumer) {
            e((java.util.function.IntConsumer) consumer);
        } else {
            if (j$.util.stream.O3.f48308a) {
                j$.util.stream.O3.a(getClass(), "{0} calling SpinedBuffer.OfInt.forEach(Consumer)");
                throw null;
            }
            j$.util.Q.b((j$.util.stream.U2) spliterator(), consumer);
        }
    }

    @Override // java.lang.Iterable
    public final java.util.Iterator iterator() {
        return j$.util.Spliterators.g(spliterator());
    }

    @Override // j$.util.stream.Z2
    protected final void r(java.lang.Object obj, int i6, int i10, java.lang.Object obj2) {
        int[] iArr = (int[]) obj;
        java.util.function.IntConsumer intConsumer = (java.util.function.IntConsumer) obj2;
        while (i6 < i10) {
            intConsumer.accept(iArr[i6]);
            i6++;
        }
    }

    @Override // j$.util.stream.Z2
    protected final int s(java.lang.Object obj) {
        return ((int[]) obj).length;
    }

    public final java.lang.String toString() {
        int[] iArr = (int[]) d();
        if (iArr.length < 200) {
            return java.lang.String.format("%s[length=%d, chunks=%d]%s", getClass().getSimpleName(), java.lang.Integer.valueOf(iArr.length), java.lang.Integer.valueOf(this.f48427c), java.util.Arrays.toString(iArr));
        }
        return java.lang.String.format("%s[length=%d, chunks=%d]%s...", getClass().getSimpleName(), java.lang.Integer.valueOf(iArr.length), java.lang.Integer.valueOf(this.f48427c), java.util.Arrays.toString(java.util.Arrays.copyOf(iArr, 200)));
    }

    @Override // j$.util.stream.Z2
    protected final java.lang.Object[] v() {
        return new int[8][];
    }

    @Override // j$.util.stream.Z2, java.lang.Iterable
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public j$.util.X spliterator() {
        return new j$.util.stream.U2(this, 0, this.f48427c, 0, this.f48426b);
    }
}
