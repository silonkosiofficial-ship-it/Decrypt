package j$.util.stream;

/* JADX INFO: loaded from: classes4.dex */
final class M extends j$.util.stream.AbstractC6737c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final j$.util.stream.G f48284j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final boolean f48285k;

    M(j$.util.stream.G g6, boolean z6, j$.util.stream.AbstractC6732b abstractC6732b, j$.util.Spliterator spliterator) {
        super(abstractC6732b, spliterator);
        this.f48285k = z6;
        this.f48284j = g6;
    }

    M(j$.util.stream.M m6, j$.util.Spliterator spliterator) {
        super(m6, spliterator);
        this.f48285k = m6.f48285k;
        this.f48284j = m6.f48284j;
    }

    @Override // j$.util.stream.AbstractC6747e
    protected final java.lang.Object a() {
        j$.util.stream.AbstractC6732b abstractC6732b = this.f48436a;
        j$.util.stream.M3 m6 = (j$.util.stream.M3) this.f48284j.f48239d.get();
        abstractC6732b.R(this.f48437b, m6);
        java.lang.Object obj = m6.get();
        if (!this.f48285k) {
            if (obj != null) {
                java.util.concurrent.atomic.AtomicReference atomicReference = this.f48422h;
                while (!atomicReference.compareAndSet(null, obj) && atomicReference.get() == null) {
                }
            }
            return null;
        }
        if (obj == null) {
            return null;
        }
        j$.util.stream.AbstractC6747e abstractC6747e = this;
        while (abstractC6747e != null) {
            j$.util.stream.AbstractC6747e abstractC6747e2 = (j$.util.stream.AbstractC6747e) abstractC6747e.getCompleter();
            if (abstractC6747e2 != null && abstractC6747e2.f48439d != abstractC6747e) {
                i();
                return obj;
            }
            abstractC6747e = abstractC6747e2;
        }
        java.util.concurrent.atomic.AtomicReference atomicReference2 = this.f48422h;
        while (!atomicReference2.compareAndSet(null, obj) && atomicReference2.get() == null) {
        }
        return obj;
    }

    @Override // j$.util.stream.AbstractC6747e
    protected final j$.util.stream.AbstractC6747e e(j$.util.Spliterator spliterator) {
        return new j$.util.stream.M(this, spliterator);
    }

    @Override // j$.util.stream.AbstractC6737c
    protected final java.lang.Object j() {
        return this.f48284j.f48237b;
    }

    @Override // j$.util.stream.AbstractC6747e, java.util.concurrent.CountedCompleter
    public final void onCompletion(java.util.concurrent.CountedCompleter countedCompleter) {
        if (this.f48285k) {
            j$.util.stream.M m6 = (j$.util.stream.M) this.f48439d;
            j$.util.stream.M m10 = null;
            while (m6 != m10) {
                java.lang.Object objC = m6.c();
                if (objC != null && this.f48284j.f48238c.test(objC)) {
                    f(objC);
                    j$.util.stream.AbstractC6747e abstractC6747e = this;
                    while (abstractC6747e != null) {
                        j$.util.stream.AbstractC6747e abstractC6747e2 = (j$.util.stream.AbstractC6747e) abstractC6747e.getCompleter();
                        if (abstractC6747e2 != null && abstractC6747e2.f48439d != abstractC6747e) {
                            i();
                            break;
                        }
                        abstractC6747e = abstractC6747e2;
                    }
                    java.util.concurrent.atomic.AtomicReference atomicReference = this.f48422h;
                    while (!atomicReference.compareAndSet(null, objC) && atomicReference.get() == null) {
                    }
                    break;
                }
                m10 = m6;
                m6 = (j$.util.stream.M) this.f48440e;
            }
        }
        super.onCompletion(countedCompleter);
    }
}
