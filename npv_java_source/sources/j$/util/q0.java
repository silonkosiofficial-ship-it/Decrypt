package j$.util;

/* JADX INFO: loaded from: classes4.dex */
class q0 implements j$.util.Spliterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.Collection f48179a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private java.util.Iterator f48180b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f48181c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f48182d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f48183e;

    public q0(java.util.Collection collection, int i6) {
        this.f48179a = collection;
        this.f48181c = (i6 & 4096) == 0 ? i6 | 16448 : i6;
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return this.f48181c;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        if (this.f48180b != null) {
            return this.f48182d;
        }
        java.util.Collection collection = this.f48179a;
        this.f48180b = collection.iterator();
        long size = collection.size();
        this.f48182d = size;
        return size;
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(java.util.function.Consumer consumer) {
        consumer.getClass();
        java.util.Iterator it = this.f48180b;
        if (it == null) {
            java.util.Collection collection = this.f48179a;
            java.util.Iterator it2 = collection.iterator();
            this.f48180b = it2;
            this.f48182d = collection.size();
            it = it2;
        }
        j$.util.Q.q(it, consumer);
    }

    @Override // j$.util.Spliterator
    public java.util.Comparator getComparator() {
        if (j$.util.Q.e(this, 4)) {
            return null;
        }
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
        if (this.f48180b == null) {
            java.util.Collection collection = this.f48179a;
            this.f48180b = collection.iterator();
            this.f48182d = collection.size();
        }
        if (!this.f48180b.hasNext()) {
            return false;
        }
        consumer.accept(this.f48180b.next());
        return true;
    }

    @Override // j$.util.Spliterator
    public final j$.util.Spliterator trySplit() {
        long size;
        java.util.Iterator it = this.f48180b;
        if (it == null) {
            java.util.Collection collection = this.f48179a;
            java.util.Iterator it2 = collection.iterator();
            this.f48180b = it2;
            size = collection.size();
            this.f48182d = size;
            it = it2;
        } else {
            size = this.f48182d;
        }
        if (size <= 1 || !it.hasNext()) {
            return null;
        }
        int i6 = this.f48183e + 1024;
        if (i6 > size) {
            i6 = (int) size;
        }
        if (i6 > 33554432) {
            i6 = 33554432;
        }
        java.lang.Object[] objArr = new java.lang.Object[i6];
        int i10 = 0;
        do {
            objArr[i10] = it.next();
            i10++;
            if (i10 >= i6) {
                break;
            }
        } while (it.hasNext());
        this.f48183e = i10;
        long j6 = this.f48182d;
        if (j6 != Long.MAX_VALUE) {
            this.f48182d = j6 - ((long) i10);
        }
        return new j$.util.j0(objArr, 0, i10, this.f48181c);
    }
}
