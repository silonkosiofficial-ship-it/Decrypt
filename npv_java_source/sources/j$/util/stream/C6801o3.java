package j$.util.stream;

/* JADX INFO: renamed from: j$.util.stream.o3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
final class C6801o3 implements j$.util.Spliterator, java.util.function.Consumer {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final java.lang.Object f48522d = new java.lang.Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final j$.util.Spliterator f48523a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final j$.util.concurrent.ConcurrentHashMap f48524b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private java.lang.Object f48525c;

    C6801o3(j$.util.Spliterator spliterator) {
        this(spliterator, new j$.util.concurrent.ConcurrentHashMap());
    }

    private C6801o3(j$.util.Spliterator spliterator, j$.util.concurrent.ConcurrentHashMap concurrentHashMap) {
        this.f48523a = spliterator;
        this.f48524b = concurrentHashMap;
    }

    @Override // java.util.function.Consumer
    public final void accept(java.lang.Object obj) {
        this.f48525c = obj;
    }

    public final /* synthetic */ java.util.function.Consumer andThen(java.util.function.Consumer consumer) {
        return j$.util.function.Consumer$CC.$default$andThen(this, consumer);
    }

    final void b(java.util.function.Consumer consumer, java.lang.Object obj) {
        if (this.f48524b.putIfAbsent(obj != null ? obj : f48522d, java.lang.Boolean.TRUE) == null) {
            consumer.accept(obj);
        }
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return (this.f48523a.characteristics() & (-16469)) | 1;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return this.f48523a.estimateSize();
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(java.util.function.Consumer consumer) {
        this.f48523a.forEachRemaining(new j$.util.stream.C6803p0(1, this, consumer));
    }

    @Override // j$.util.Spliterator
    public final java.util.Comparator getComparator() {
        return this.f48523a.getComparator();
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
        while (this.f48523a.tryAdvance(this)) {
            java.lang.Object obj = this.f48525c;
            if (obj == null) {
                obj = f48522d;
            }
            if (this.f48524b.putIfAbsent(obj, java.lang.Boolean.TRUE) == null) {
                consumer.accept(this.f48525c);
                this.f48525c = null;
                return true;
            }
        }
        return false;
    }

    @Override // j$.util.Spliterator
    public final j$.util.Spliterator trySplit() {
        j$.util.Spliterator spliteratorTrySplit = this.f48523a.trySplit();
        if (spliteratorTrySplit != null) {
            return new j$.util.stream.C6801o3(spliteratorTrySplit, this.f48524b);
        }
        return null;
    }
}
