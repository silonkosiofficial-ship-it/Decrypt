package j$.util.stream;

/* JADX INFO: renamed from: j$.util.stream.o1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
abstract class AbstractC6799o1 implements j$.util.Spliterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    j$.util.stream.K0 f48517a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f48518b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    j$.util.Spliterator f48519c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    j$.util.Spliterator f48520d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    java.util.ArrayDeque f48521e;

    AbstractC6799o1(j$.util.stream.K0 k6) {
        this.f48517a = k6;
    }

    protected static j$.util.stream.K0 a(java.util.Deque deque) {
        while (true) {
            j$.util.stream.K0 k6 = (j$.util.stream.K0) deque.pollFirst();
            if (k6 == null) {
                return null;
            }
            if (k6.p() != 0) {
                for (int iP = k6.p() - 1; iP >= 0; iP--) {
                    deque.addFirst(k6.b(iP));
                }
            } else if (k6.count() > 0) {
                return k6;
            }
        }
    }

    protected final java.util.ArrayDeque b() {
        java.util.ArrayDeque arrayDeque = new java.util.ArrayDeque(8);
        int iP = this.f48517a.p();
        while (true) {
            iP--;
            if (iP < this.f48518b) {
                return arrayDeque;
            }
            arrayDeque.addFirst(this.f48517a.b(iP));
        }
    }

    protected final boolean c() {
        if (this.f48517a == null) {
            return false;
        }
        if (this.f48520d != null) {
            return true;
        }
        j$.util.Spliterator spliterator = this.f48519c;
        if (spliterator == null) {
            java.util.ArrayDeque arrayDequeB = b();
            this.f48521e = arrayDequeB;
            j$.util.stream.K0 k0A = a(arrayDequeB);
            if (k0A == null) {
                this.f48517a = null;
                return false;
            }
            spliterator = k0A.spliterator();
        }
        this.f48520d = spliterator;
        return true;
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return 64;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        long jCount = 0;
        if (this.f48517a == null) {
            return 0L;
        }
        j$.util.Spliterator spliterator = this.f48519c;
        if (spliterator != null) {
            return spliterator.estimateSize();
        }
        for (int i6 = this.f48518b; i6 < this.f48517a.p(); i6++) {
            jCount += this.f48517a.b(i6).count();
        }
        return jCount;
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
    public final j$.util.Spliterator trySplit() {
        j$.util.stream.K0 k6 = this.f48517a;
        if (k6 == null || this.f48520d != null) {
            return null;
        }
        j$.util.Spliterator spliterator = this.f48519c;
        if (spliterator != null) {
            return spliterator.trySplit();
        }
        if (this.f48518b < k6.p() - 1) {
            j$.util.stream.K0 k10 = this.f48517a;
            int i6 = this.f48518b;
            this.f48518b = i6 + 1;
            return k10.b(i6).spliterator();
        }
        j$.util.stream.K0 k0B = this.f48517a.b(this.f48518b);
        this.f48517a = k0B;
        if (k0B.p() == 0) {
            j$.util.Spliterator spliterator2 = this.f48517a.spliterator();
            this.f48519c = spliterator2;
            return spliterator2.trySplit();
        }
        j$.util.stream.K0 k11 = this.f48517a;
        this.f48518b = 1;
        return k11.b(0).spliterator();
    }

    @Override // j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.U trySplit() {
        return (j$.util.U) trySplit();
    }

    @Override // j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.X trySplit() {
        return (j$.util.X) trySplit();
    }

    @Override // j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.a0 trySplit() {
        return (j$.util.a0) trySplit();
    }

    @Override // j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.d0 trySplit() {
        return (j$.util.d0) trySplit();
    }
}
