package j$.util.stream;

/* JADX INFO: loaded from: classes4.dex */
final class R2 implements j$.util.Spliterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int f48333a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final int f48334b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f48335c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final int f48336d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    java.lang.Object[] f48337e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ j$.util.stream.C6731a3 f48338f;

    R2(j$.util.stream.C6731a3 c6731a3, int i6, int i10, int i11, int i12) {
        this.f48338f = c6731a3;
        this.f48333a = i6;
        this.f48334b = i10;
        this.f48335c = i11;
        this.f48336d = i12;
        java.lang.Object[][] objArr = c6731a3.f48407f;
        this.f48337e = objArr == null ? c6731a3.f48406e : objArr[i6];
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return 16464;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        int i6 = this.f48333a;
        int i10 = this.f48336d;
        int i11 = this.f48334b;
        if (i6 == i11) {
            return ((long) i10) - ((long) this.f48335c);
        }
        long[] jArr = this.f48338f.f48428d;
        return ((jArr[i11] + ((long) i10)) - jArr[i6]) - ((long) this.f48335c);
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(java.util.function.Consumer consumer) {
        j$.util.stream.C6731a3 c6731a3;
        j$.util.Objects.requireNonNull(consumer);
        int i6 = this.f48333a;
        int i10 = this.f48336d;
        int i11 = this.f48334b;
        if (i6 < i11 || (i6 == i11 && this.f48335c < i10)) {
            int i12 = this.f48335c;
            while (true) {
                c6731a3 = this.f48338f;
                if (i6 >= i11) {
                    break;
                }
                java.lang.Object[] objArr = c6731a3.f48407f[i6];
                while (i12 < objArr.length) {
                    consumer.accept(objArr[i12]);
                    i12++;
                }
                i6++;
                i12 = 0;
            }
            java.lang.Object[] objArr2 = this.f48333a == i11 ? this.f48337e : c6731a3.f48407f[i11];
            while (i12 < i10) {
                consumer.accept(objArr2[i12]);
                i12++;
            }
            this.f48333a = i11;
            this.f48335c = i10;
        }
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

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(java.util.function.Consumer consumer) {
        j$.util.Objects.requireNonNull(consumer);
        int i6 = this.f48333a;
        int i10 = this.f48334b;
        if (i6 >= i10 && (i6 != i10 || this.f48335c >= this.f48336d)) {
            return false;
        }
        java.lang.Object[] objArr = this.f48337e;
        int i11 = this.f48335c;
        this.f48335c = i11 + 1;
        consumer.accept(objArr[i11]);
        if (this.f48335c == this.f48337e.length) {
            this.f48335c = 0;
            int i12 = this.f48333a + 1;
            this.f48333a = i12;
            java.lang.Object[][] objArr2 = this.f48338f.f48407f;
            if (objArr2 != null && i12 <= i10) {
                this.f48337e = objArr2[i12];
            }
        }
        return true;
    }

    @Override // j$.util.Spliterator
    public final j$.util.Spliterator trySplit() {
        int i6 = this.f48333a;
        int i10 = this.f48334b;
        if (i6 < i10) {
            int i11 = i10 - 1;
            int i12 = this.f48335c;
            j$.util.stream.C6731a3 c6731a3 = this.f48338f;
            j$.util.stream.R2 r6 = new j$.util.stream.R2(c6731a3, i6, i11, i12, c6731a3.f48407f[i11].length);
            this.f48333a = i10;
            this.f48335c = 0;
            this.f48337e = c6731a3.f48407f[i10];
            return r6;
        }
        if (i6 != i10) {
            return null;
        }
        int i13 = this.f48335c;
        int i14 = (this.f48336d - i13) / 2;
        if (i14 == 0) {
            return null;
        }
        j$.util.Spliterator spliteratorM = j$.util.Spliterators.m(this.f48337e, i13, i13 + i14);
        this.f48335c += i14;
        return spliteratorM;
    }
}
