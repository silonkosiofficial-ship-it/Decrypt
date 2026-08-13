package j$.util.stream;

/* JADX INFO: renamed from: j$.util.stream.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
abstract class AbstractC6747e extends java.util.concurrent.CountedCompleter {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f48435g = java.util.concurrent.ForkJoinPool.getCommonPoolParallelism() << 2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final j$.util.stream.AbstractC6732b f48436a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected j$.util.Spliterator f48437b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected long f48438c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected j$.util.stream.AbstractC6747e f48439d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected j$.util.stream.AbstractC6747e f48440e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private java.lang.Object f48441f;

    protected AbstractC6747e(j$.util.stream.AbstractC6732b abstractC6732b, j$.util.Spliterator spliterator) {
        super(null);
        this.f48436a = abstractC6732b;
        this.f48437b = spliterator;
        this.f48438c = 0L;
    }

    protected AbstractC6747e(j$.util.stream.AbstractC6747e abstractC6747e, j$.util.Spliterator spliterator) {
        super(abstractC6747e);
        this.f48437b = spliterator;
        this.f48436a = abstractC6747e.f48436a;
        this.f48438c = abstractC6747e.f48438c;
    }

    public static int b() {
        return f48435g;
    }

    public static long g(long j6) {
        long j10 = j6 / ((long) f48435g);
        if (j10 > 0) {
            return j10;
        }
        return 1L;
    }

    protected abstract java.lang.Object a();

    protected java.lang.Object c() {
        return this.f48441f;
    }

    @Override // java.util.concurrent.CountedCompleter
    public void compute() {
        j$.util.Spliterator spliteratorTrySplit;
        j$.util.Spliterator spliterator = this.f48437b;
        long jEstimateSize = spliterator.estimateSize();
        long jG = this.f48438c;
        if (jG == 0) {
            jG = g(jEstimateSize);
            this.f48438c = jG;
        }
        boolean z6 = false;
        j$.util.stream.AbstractC6747e abstractC6747e = this;
        while (jEstimateSize > jG && (spliteratorTrySplit = spliterator.trySplit()) != null) {
            j$.util.stream.AbstractC6747e abstractC6747eE = abstractC6747e.e(spliteratorTrySplit);
            abstractC6747e.f48439d = abstractC6747eE;
            j$.util.stream.AbstractC6747e abstractC6747eE2 = abstractC6747e.e(spliterator);
            abstractC6747e.f48440e = abstractC6747eE2;
            abstractC6747e.setPendingCount(1);
            if (z6) {
                spliterator = spliteratorTrySplit;
                abstractC6747e = abstractC6747eE;
                abstractC6747eE = abstractC6747eE2;
            } else {
                abstractC6747e = abstractC6747eE2;
            }
            z6 = !z6;
            abstractC6747eE.fork();
            jEstimateSize = spliterator.estimateSize();
        }
        abstractC6747e.f(abstractC6747e.a());
        abstractC6747e.tryComplete();
    }

    protected final boolean d() {
        return ((j$.util.stream.AbstractC6747e) getCompleter()) == null;
    }

    protected abstract j$.util.stream.AbstractC6747e e(j$.util.Spliterator spliterator);

    protected void f(java.lang.Object obj) {
        this.f48441f = obj;
    }

    @Override // java.util.concurrent.CountedCompleter, java.util.concurrent.ForkJoinTask
    public java.lang.Object getRawResult() {
        return this.f48441f;
    }

    @Override // java.util.concurrent.CountedCompleter
    public void onCompletion(java.util.concurrent.CountedCompleter countedCompleter) {
        this.f48437b = null;
        this.f48440e = null;
        this.f48439d = null;
    }

    @Override // java.util.concurrent.CountedCompleter, java.util.concurrent.ForkJoinTask
    protected final void setRawResult(java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.IllegalStateException();
        }
    }
}
