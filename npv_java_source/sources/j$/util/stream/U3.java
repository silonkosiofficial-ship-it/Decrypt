package j$.util.stream;

/* JADX INFO: loaded from: classes4.dex */
final class U3 implements java.util.function.Consumer, j$.util.Spliterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final j$.util.Spliterator f48372a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final boolean f48373b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final java.util.concurrent.atomic.AtomicBoolean f48374c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    boolean f48375d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f48376e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final java.util.function.Predicate f48377f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    java.lang.Object f48378g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f48379h;

    public U3(j$.util.Spliterator spliterator, j$.util.stream.U3 u6, int i6) {
        this.f48379h = i6;
        this.f48375d = true;
        this.f48372a = spliterator;
        this.f48373b = u6.f48373b;
        this.f48374c = u6.f48374c;
        this.f48377f = u6.f48377f;
    }

    public U3(j$.util.Spliterator spliterator, java.util.function.Predicate predicate, int i6) {
        this.f48379h = i6;
        this.f48375d = true;
        this.f48372a = spliterator;
        this.f48373b = false;
        this.f48374c = new java.util.concurrent.atomic.AtomicBoolean();
        this.f48377f = predicate;
    }

    @Override // java.util.function.Consumer
    public final void accept(java.lang.Object obj) {
        this.f48376e = (this.f48376e + 1) & 63;
        this.f48378g = obj;
    }

    public final /* synthetic */ java.util.function.Consumer andThen(java.util.function.Consumer consumer) {
        return j$.util.function.Consumer$CC.$default$andThen(this, consumer);
    }

    final j$.util.Spliterator b(j$.util.Spliterator spliterator) {
        switch (this.f48379h) {
            case 0:
                return new j$.util.stream.U3(spliterator, this, 0);
            default:
                return new j$.util.stream.U3(spliterator, this, 1);
        }
    }

    public final j$.util.Spliterator c() {
        j$.util.Spliterator spliteratorTrySplit = this.f48373b ? null : this.f48372a.trySplit();
        if (spliteratorTrySplit != null) {
            return b(spliteratorTrySplit);
        }
        return null;
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return this.f48372a.characteristics() & (-16449);
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return this.f48372a.estimateSize();
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(java.util.function.Consumer consumer) {
        while (tryAdvance(consumer)) {
        }
    }

    @Override // j$.util.Spliterator
    public final java.util.Comparator getComparator() {
        return this.f48372a.getComparator();
    }

    @Override // j$.util.Spliterator
    public final long getExactSizeIfKnown() {
        return -1L;
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i6) {
        return j$.util.Q.e(this, i6);
    }

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(java.util.function.Consumer consumer) {
        boolean zTryAdvance;
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean;
        boolean zTest;
        switch (this.f48379h) {
            case 0:
                boolean z6 = this.f48375d;
                j$.util.Spliterator spliterator = this.f48372a;
                if (!z6) {
                    return spliterator.tryAdvance(consumer);
                }
                boolean z10 = false;
                this.f48375d = false;
                while (true) {
                    zTryAdvance = spliterator.tryAdvance(this);
                    atomicBoolean = this.f48374c;
                    if (zTryAdvance && ((this.f48376e != 0 || !atomicBoolean.get()) && this.f48377f.test(this.f48378g))) {
                        z10 = true;
                    }
                }
                if (!zTryAdvance) {
                    return zTryAdvance;
                }
                if (z10) {
                    atomicBoolean.set(true);
                }
                consumer.accept(this.f48378g);
                return zTryAdvance;
            default:
                boolean z11 = this.f48375d;
                java.util.concurrent.atomic.AtomicBoolean atomicBoolean2 = this.f48374c;
                if (!z11 || ((this.f48376e == 0 && atomicBoolean2.get()) || !this.f48372a.tryAdvance(this))) {
                    zTest = true;
                } else {
                    zTest = this.f48377f.test(this.f48378g);
                    if (zTest) {
                        consumer.accept(this.f48378g);
                        return true;
                    }
                }
                this.f48375d = false;
                if (!zTest) {
                    atomicBoolean2.set(true);
                }
                return false;
        }
    }

    @Override // j$.util.Spliterator
    public j$.util.Spliterator trySplit() {
        switch (this.f48379h) {
            case 1:
                if (this.f48374c.get()) {
                    return null;
                }
                return c();
            default:
                return c();
        }
    }
}
