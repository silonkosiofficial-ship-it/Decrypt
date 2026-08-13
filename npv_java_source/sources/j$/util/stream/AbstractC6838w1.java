package j$.util.stream;

/* JADX INFO: renamed from: j$.util.stream.w1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
abstract class AbstractC6838w1 extends java.util.concurrent.CountedCompleter implements j$.util.stream.InterfaceC6810q2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final j$.util.Spliterator f48575a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final j$.util.stream.AbstractC6732b f48576b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final long f48577c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected long f48578d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected long f48579e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected int f48580f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected int f48581g;

    AbstractC6838w1(j$.util.Spliterator spliterator, j$.util.stream.AbstractC6732b abstractC6732b, int i6) {
        this.f48575a = spliterator;
        this.f48576b = abstractC6732b;
        this.f48577c = j$.util.stream.AbstractC6747e.g(spliterator.estimateSize());
        this.f48578d = 0L;
        this.f48579e = i6;
    }

    AbstractC6838w1(j$.util.stream.AbstractC6838w1 abstractC6838w1, j$.util.Spliterator spliterator, long j6, long j10, int i6) {
        super(abstractC6838w1);
        this.f48575a = spliterator;
        this.f48576b = abstractC6838w1.f48576b;
        this.f48577c = abstractC6838w1.f48577c;
        this.f48578d = j6;
        this.f48579e = j10;
        if (j6 < 0 || j10 < 0 || (j6 + j10) - 1 >= i6) {
            throw new java.lang.IllegalArgumentException(java.lang.String.format("offset and length interval [%d, %d + %d) is not within array size interval [0, %d)", java.lang.Long.valueOf(j6), java.lang.Long.valueOf(j6), java.lang.Long.valueOf(j10), java.lang.Integer.valueOf(i6)));
        }
    }

    public /* synthetic */ void accept(double d6) {
        j$.util.stream.AbstractC6845y0.a();
        throw null;
    }

    public /* synthetic */ void accept(int i6) {
        j$.util.stream.AbstractC6845y0.k();
        throw null;
    }

    public /* synthetic */ void accept(long j6) {
        j$.util.stream.AbstractC6845y0.l();
        throw null;
    }

    public final /* synthetic */ java.util.function.Consumer andThen(java.util.function.Consumer consumer) {
        return j$.util.function.Consumer$CC.$default$andThen(this, consumer);
    }

    abstract j$.util.stream.AbstractC6838w1 b(j$.util.Spliterator spliterator, long j6, long j10);

    @Override // java.util.concurrent.CountedCompleter
    public final void compute() {
        j$.util.Spliterator spliteratorTrySplit;
        j$.util.Spliterator spliterator = this.f48575a;
        j$.util.stream.AbstractC6838w1 abstractC6838w1B = this;
        while (spliterator.estimateSize() > abstractC6838w1B.f48577c && (spliteratorTrySplit = spliterator.trySplit()) != null) {
            abstractC6838w1B.setPendingCount(1);
            long jEstimateSize = spliteratorTrySplit.estimateSize();
            abstractC6838w1B.b(spliteratorTrySplit, abstractC6838w1B.f48578d, jEstimateSize).fork();
            abstractC6838w1B = abstractC6838w1B.b(spliterator, abstractC6838w1B.f48578d + jEstimateSize, abstractC6838w1B.f48579e - jEstimateSize);
        }
        abstractC6838w1B.f48576b.R(spliterator, abstractC6838w1B);
        abstractC6838w1B.propagateCompletion();
    }

    @Override // j$.util.stream.InterfaceC6810q2
    public final /* synthetic */ void j() {
    }

    @Override // j$.util.stream.InterfaceC6810q2
    public final void k(long j6) {
        long j10 = this.f48579e;
        if (j6 > j10) {
            throw new java.lang.IllegalStateException("size passed to Sink.begin exceeds array length");
        }
        int i6 = (int) this.f48578d;
        this.f48580f = i6;
        this.f48581g = i6 + ((int) j10);
    }

    @Override // j$.util.stream.InterfaceC6810q2
    public final /* synthetic */ boolean m() {
        return false;
    }
}
