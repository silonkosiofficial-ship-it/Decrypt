package j$.util;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: renamed from: j$.util.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C6708a implements j$.util.Spliterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.List f48035a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f48036b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f48037c;

    private C6708a(j$.util.C6708a c6708a, int i6, int i10) {
        this.f48035a = c6708a.f48035a;
        this.f48036b = i6;
        this.f48037c = i10;
    }

    C6708a(java.util.List list) {
        this.f48035a = list;
        this.f48036b = 0;
        this.f48037c = -1;
    }

    private int a() {
        int i6 = this.f48037c;
        if (i6 >= 0) {
            return i6;
        }
        int size = this.f48035a.size();
        this.f48037c = size;
        return size;
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return 16464;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return a() - this.f48036b;
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(java.util.function.Consumer consumer) {
        j$.util.Objects.requireNonNull(consumer);
        int iA = a();
        this.f48036b = iA;
        for (int i6 = this.f48036b; i6 < iA; i6++) {
            try {
                consumer.accept(this.f48035a.get(i6));
            } catch (java.lang.IndexOutOfBoundsException unused) {
                throw new java.util.ConcurrentModificationException();
            }
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
        consumer.getClass();
        int iA = a();
        int i6 = this.f48036b;
        if (i6 >= iA) {
            return false;
        }
        this.f48036b = i6 + 1;
        try {
            consumer.accept(this.f48035a.get(i6));
            return true;
        } catch (java.lang.IndexOutOfBoundsException unused) {
            throw new java.util.ConcurrentModificationException();
        }
    }

    @Override // j$.util.Spliterator
    public final j$.util.Spliterator trySplit() {
        int iA = a();
        int i6 = this.f48036b;
        int i10 = (iA + i6) >>> 1;
        if (i6 >= i10) {
            return null;
        }
        this.f48036b = i10;
        return new j$.util.C6708a(this, i6, i10);
    }
}
