package j$.util.stream;

/* JADX INFO: loaded from: classes4.dex */
final class T extends java.util.concurrent.CountedCompleter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final j$.util.stream.AbstractC6732b f48351a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private j$.util.Spliterator f48352b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f48353c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final j$.util.concurrent.ConcurrentHashMap f48354d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final j$.util.stream.InterfaceC6810q2 f48355e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final j$.util.stream.T f48356f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private j$.util.stream.K0 f48357g;

    T(j$.util.stream.T t6, j$.util.Spliterator spliterator, j$.util.stream.T t10) {
        super(t6);
        this.f48351a = t6.f48351a;
        this.f48352b = spliterator;
        this.f48353c = t6.f48353c;
        this.f48354d = t6.f48354d;
        this.f48355e = t6.f48355e;
        this.f48356f = t10;
    }

    protected T(j$.util.stream.AbstractC6732b abstractC6732b, j$.util.Spliterator spliterator, j$.util.stream.InterfaceC6810q2 interfaceC6810q2) {
        super(null);
        this.f48351a = abstractC6732b;
        this.f48352b = spliterator;
        this.f48353c = j$.util.stream.AbstractC6747e.g(spliterator.estimateSize());
        this.f48354d = new j$.util.concurrent.ConcurrentHashMap(java.lang.Math.max(16, j$.util.stream.AbstractC6747e.b() << 1));
        this.f48355e = interfaceC6810q2;
        this.f48356f = null;
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void compute() {
        j$.util.Spliterator spliteratorTrySplit;
        j$.util.Spliterator spliterator = this.f48352b;
        long j6 = this.f48353c;
        boolean z6 = false;
        j$.util.stream.T t6 = this;
        while (spliterator.estimateSize() > j6 && (spliteratorTrySplit = spliterator.trySplit()) != null) {
            j$.util.stream.T t10 = new j$.util.stream.T(t6, spliteratorTrySplit, t6.f48356f);
            j$.util.stream.T t11 = new j$.util.stream.T(t6, spliterator, t10);
            t6.addToPendingCount(1);
            t11.addToPendingCount(1);
            t6.f48354d.put(t10, t11);
            if (t6.f48356f != null) {
                t10.addToPendingCount(1);
                if (t6.f48354d.replace(t6.f48356f, t6, t10)) {
                    t6.addToPendingCount(-1);
                } else {
                    t10.addToPendingCount(-1);
                }
            }
            if (z6) {
                spliterator = spliteratorTrySplit;
                t6 = t10;
                t10 = t11;
            } else {
                t6 = t11;
            }
            z6 = !z6;
            t10.fork();
        }
        if (t6.getPendingCount() > 0) {
            j$.util.stream.C6816s c6816s = new j$.util.stream.C6816s(5);
            j$.util.stream.AbstractC6732b abstractC6732b = t6.f48351a;
            j$.util.stream.C0 c0J = abstractC6732b.J(abstractC6732b.C(spliterator), c6816s);
            t6.f48351a.R(spliterator, c0J);
            t6.f48357g = c0J.a();
            t6.f48352b = null;
        }
        t6.tryComplete();
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void onCompletion(java.util.concurrent.CountedCompleter countedCompleter) {
        j$.util.stream.K0 k6 = this.f48357g;
        if (k6 != null) {
            k6.forEach(this.f48355e);
            this.f48357g = null;
        } else {
            j$.util.Spliterator spliterator = this.f48352b;
            if (spliterator != null) {
                this.f48351a.R(spliterator, this.f48355e);
                this.f48352b = null;
            }
        }
        j$.util.stream.T t6 = (j$.util.stream.T) this.f48354d.remove(this);
        if (t6 != null) {
            t6.tryComplete();
        }
    }
}
