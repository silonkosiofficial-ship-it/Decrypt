package j$.util.stream;

/* JADX INFO: renamed from: j$.util.stream.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
abstract class AbstractC6737c extends j$.util.stream.AbstractC6747e {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected final java.util.concurrent.atomic.AtomicReference f48422h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected volatile boolean f48423i;

    protected AbstractC6737c(j$.util.stream.AbstractC6732b abstractC6732b, j$.util.Spliterator spliterator) {
        super(abstractC6732b, spliterator);
        this.f48422h = new java.util.concurrent.atomic.AtomicReference(null);
    }

    protected AbstractC6737c(j$.util.stream.AbstractC6737c abstractC6737c, j$.util.Spliterator spliterator) {
        super(abstractC6737c, spliterator);
        this.f48422h = abstractC6737c.f48422h;
    }

    @Override // j$.util.stream.AbstractC6747e
    public final java.lang.Object c() {
        if (!d()) {
            return super.c();
        }
        java.lang.Object obj = this.f48422h.get();
        return obj == null ? j() : obj;
    }

    @Override // j$.util.stream.AbstractC6747e, java.util.concurrent.CountedCompleter
    public final void compute() {
        java.lang.Object objJ;
        j$.util.Spliterator spliteratorTrySplit;
        j$.util.Spliterator spliterator = this.f48437b;
        long jEstimateSize = spliterator.estimateSize();
        long jG = this.f48438c;
        if (jG == 0) {
            jG = j$.util.stream.AbstractC6747e.g(jEstimateSize);
            this.f48438c = jG;
        }
        java.util.concurrent.atomic.AtomicReference atomicReference = this.f48422h;
        boolean z6 = false;
        j$.util.stream.AbstractC6737c abstractC6737c = this;
        while (true) {
            objJ = atomicReference.get();
            if (objJ != null) {
                break;
            }
            boolean z10 = abstractC6737c.f48423i;
            if (!z10) {
                java.util.concurrent.CountedCompleter<?> completer = abstractC6737c.getCompleter();
                while (true) {
                    j$.util.stream.AbstractC6737c abstractC6737c2 = (j$.util.stream.AbstractC6737c) ((j$.util.stream.AbstractC6747e) completer);
                    if (z10 || abstractC6737c2 == null) {
                        break;
                    }
                    z10 = abstractC6737c2.f48423i;
                    completer = abstractC6737c2.getCompleter();
                }
            }
            if (z10) {
                objJ = abstractC6737c.j();
                break;
            }
            if (jEstimateSize <= jG || (spliteratorTrySplit = spliterator.trySplit()) == null) {
                objJ = abstractC6737c.a();
                break;
            }
            j$.util.stream.AbstractC6737c abstractC6737c3 = (j$.util.stream.AbstractC6737c) abstractC6737c.e(spliteratorTrySplit);
            abstractC6737c.f48439d = abstractC6737c3;
            j$.util.stream.AbstractC6737c abstractC6737c4 = (j$.util.stream.AbstractC6737c) abstractC6737c.e(spliterator);
            abstractC6737c.f48440e = abstractC6737c4;
            abstractC6737c.setPendingCount(1);
            if (z6) {
                spliterator = spliteratorTrySplit;
                abstractC6737c = abstractC6737c3;
                abstractC6737c3 = abstractC6737c4;
            } else {
                abstractC6737c = abstractC6737c4;
            }
            z6 = !z6;
            abstractC6737c3.fork();
            jEstimateSize = spliterator.estimateSize();
        }
        abstractC6737c.f(objJ);
        abstractC6737c.tryComplete();
    }

    @Override // j$.util.stream.AbstractC6747e
    protected final void f(java.lang.Object obj) {
        if (!d()) {
            super.f(obj);
        } else if (obj != null) {
            java.util.concurrent.atomic.AtomicReference atomicReference = this.f48422h;
            while (!atomicReference.compareAndSet(null, obj) && atomicReference.get() == null) {
            }
        }
    }

    @Override // j$.util.stream.AbstractC6747e, java.util.concurrent.CountedCompleter, java.util.concurrent.ForkJoinTask
    public final java.lang.Object getRawResult() {
        return c();
    }

    protected void h() {
        this.f48423i = true;
    }

    protected final void i() {
        j$.util.stream.AbstractC6737c abstractC6737c = this;
        for (j$.util.stream.AbstractC6737c abstractC6737c2 = (j$.util.stream.AbstractC6737c) ((j$.util.stream.AbstractC6747e) getCompleter()); abstractC6737c2 != null; abstractC6737c2 = (j$.util.stream.AbstractC6737c) ((j$.util.stream.AbstractC6747e) abstractC6737c2.getCompleter())) {
            if (abstractC6737c2.f48439d == abstractC6737c) {
                j$.util.stream.AbstractC6737c abstractC6737c3 = (j$.util.stream.AbstractC6737c) abstractC6737c2.f48440e;
                if (!abstractC6737c3.f48423i) {
                    abstractC6737c3.h();
                }
            }
            abstractC6737c = abstractC6737c2;
        }
    }

    protected abstract java.lang.Object j();
}
