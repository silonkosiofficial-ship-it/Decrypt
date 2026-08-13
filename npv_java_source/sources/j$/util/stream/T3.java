package j$.util.stream;

/* JADX INFO: loaded from: classes4.dex */
final class T3 extends j$.util.stream.AbstractC6737c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final j$.util.stream.AbstractC6732b f48361j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final java.util.function.IntFunction f48362k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final boolean f48363l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f48364m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f48365n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private volatile boolean f48366o;

    T3(j$.util.stream.T3 t6, j$.util.Spliterator spliterator) {
        super(t6, spliterator);
        this.f48361j = t6.f48361j;
        this.f48362k = t6.f48362k;
        this.f48363l = t6.f48363l;
    }

    T3(j$.util.stream.AbstractC6732b abstractC6732b, j$.util.stream.AbstractC6732b abstractC6732b2, j$.util.Spliterator spliterator, java.util.function.IntFunction intFunction) {
        super(abstractC6732b2, spliterator);
        this.f48361j = abstractC6732b;
        this.f48362k = intFunction;
        this.f48363l = j$.util.stream.EnumC6756f3.ORDERED.u(abstractC6732b2.G());
    }

    @Override // j$.util.stream.AbstractC6747e
    protected final java.lang.Object a() {
        j$.util.stream.C0 c0J = this.f48436a.J(-1L, this.f48362k);
        j$.util.stream.InterfaceC6810q2 interfaceC6810q2N = this.f48361j.N(this.f48436a.G(), c0J);
        j$.util.stream.AbstractC6732b abstractC6732b = this.f48436a;
        boolean zX = abstractC6732b.x(this.f48437b, abstractC6732b.S(interfaceC6810q2N));
        this.f48365n = zX;
        if (zX) {
            i();
        }
        j$.util.stream.K0 k0A = c0J.a();
        this.f48364m = k0A.count();
        return k0A;
    }

    @Override // j$.util.stream.AbstractC6747e
    protected final j$.util.stream.AbstractC6747e e(j$.util.Spliterator spliterator) {
        return new j$.util.stream.T3(this, spliterator);
    }

    @Override // j$.util.stream.AbstractC6737c
    protected final void h() {
        this.f48423i = true;
        if (this.f48363l && this.f48366o) {
            f(j$.util.stream.AbstractC6845y0.L(this.f48361j.E()));
        }
    }

    @Override // j$.util.stream.AbstractC6737c
    protected final java.lang.Object j() {
        return j$.util.stream.AbstractC6845y0.L(this.f48361j.E());
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0041  */
    /* JADX WARN: Code duplicated, block: B:17:0x0056  */
    /* JADX WARN: Code duplicated, block: B:19:0x005d  */
    /* JADX WARN: Code duplicated, block: B:21:0x0063  */
    /* JADX WARN: Code duplicated, block: B:22:0x0068  */
    @Override // j$.util.stream.AbstractC6747e, java.util.concurrent.CountedCompleter
    public final void onCompletion(java.util.concurrent.CountedCompleter countedCompleter) {
        j$.util.stream.T3 t6;
        j$.util.stream.T3 t10;
        java.lang.Object objI;
        java.lang.Object objC;
        j$.util.stream.AbstractC6747e abstractC6747e = this.f48439d;
        if (abstractC6747e != null) {
            this.f48365n = ((j$.util.stream.T3) abstractC6747e).f48365n | ((j$.util.stream.T3) this.f48440e).f48365n;
            if (this.f48363l && this.f48423i) {
                this.f48364m = 0L;
                objI = j$.util.stream.AbstractC6845y0.L(this.f48361j.E());
            } else if (this.f48363l) {
                j$.util.stream.T3 t11 = (j$.util.stream.T3) this.f48439d;
                if (t11.f48365n) {
                    this.f48364m = t11.f48364m;
                    objI = (j$.util.stream.K0) t11.c();
                } else {
                    t6 = (j$.util.stream.T3) this.f48439d;
                    long j6 = t6.f48364m;
                    t10 = (j$.util.stream.T3) this.f48440e;
                    this.f48364m = j6 + t10.f48364m;
                    if (t6.f48364m == 0) {
                        objC = t10.c();
                    } else if (t10.f48364m == 0) {
                        objC = t6.c();
                    } else {
                        objI = j$.util.stream.AbstractC6845y0.I(this.f48361j.E(), (j$.util.stream.K0) ((j$.util.stream.T3) this.f48439d).c(), (j$.util.stream.K0) ((j$.util.stream.T3) this.f48440e).c());
                    }
                    objI = (j$.util.stream.K0) objC;
                }
            } else {
                t6 = (j$.util.stream.T3) this.f48439d;
                long j10 = t6.f48364m;
                t10 = (j$.util.stream.T3) this.f48440e;
                this.f48364m = j10 + t10.f48364m;
                if (t6.f48364m == 0) {
                    objC = t10.c();
                } else if (t10.f48364m == 0) {
                    objC = t6.c();
                } else {
                    objI = j$.util.stream.AbstractC6845y0.I(this.f48361j.E(), (j$.util.stream.K0) ((j$.util.stream.T3) this.f48439d).c(), (j$.util.stream.K0) ((j$.util.stream.T3) this.f48440e).c());
                }
                objI = (j$.util.stream.K0) objC;
            }
            f(objI);
        }
        this.f48366o = true;
        super.onCompletion(countedCompleter);
    }
}
