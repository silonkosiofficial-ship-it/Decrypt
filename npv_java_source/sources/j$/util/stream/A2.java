package j$.util.stream;

/* JADX INFO: loaded from: classes4.dex */
final class A2 extends j$.util.stream.AbstractC6737c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final j$.util.stream.AbstractC6732b f48194j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final java.util.function.IntFunction f48195k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final long f48196l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final long f48197m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f48198n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private volatile boolean f48199o;

    A2(j$.util.stream.A2 a6, j$.util.Spliterator spliterator) {
        super(a6, spliterator);
        this.f48194j = a6.f48194j;
        this.f48195k = a6.f48195k;
        this.f48196l = a6.f48196l;
        this.f48197m = a6.f48197m;
    }

    A2(j$.util.stream.AbstractC6732b abstractC6732b, j$.util.stream.AbstractC6732b abstractC6732b2, j$.util.Spliterator spliterator, java.util.function.IntFunction intFunction, long j6, long j10) {
        super(abstractC6732b2, spliterator);
        this.f48194j = abstractC6732b;
        this.f48195k = intFunction;
        this.f48196l = j6;
        this.f48197m = j10;
    }

    private long k(long j6) {
        if (this.f48199o) {
            return this.f48198n;
        }
        j$.util.stream.A2 a6 = (j$.util.stream.A2) this.f48439d;
        j$.util.stream.A2 a10 = (j$.util.stream.A2) this.f48440e;
        if (a6 == null || a10 == null) {
            return this.f48198n;
        }
        long jK = a6.k(j6);
        return jK >= j6 ? jK : jK + a10.k(j6);
    }

    @Override // j$.util.stream.AbstractC6747e
    protected final java.lang.Object a() {
        if (d()) {
            j$.util.stream.C0 c0J = this.f48194j.J(j$.util.stream.EnumC6756f3.SIZED.x(this.f48194j.f48410c) ? this.f48194j.C(this.f48437b) : -1L, this.f48195k);
            j$.util.stream.InterfaceC6810q2 interfaceC6810q2N = this.f48194j.N(this.f48436a.G(), c0J);
            j$.util.stream.AbstractC6732b abstractC6732b = this.f48436a;
            abstractC6732b.x(this.f48437b, abstractC6732b.S(interfaceC6810q2N));
            return c0J.a();
        }
        j$.util.stream.C0 c0J2 = this.f48194j.J(-1L, this.f48195k);
        if (this.f48196l == 0) {
            j$.util.stream.InterfaceC6810q2 interfaceC6810q2N2 = this.f48194j.N(this.f48436a.G(), c0J2);
            j$.util.stream.AbstractC6732b abstractC6732b2 = this.f48436a;
            abstractC6732b2.x(this.f48437b, abstractC6732b2.S(interfaceC6810q2N2));
        } else {
            this.f48436a.R(this.f48437b, c0J2);
        }
        j$.util.stream.K0 k0A = c0J2.a();
        this.f48198n = k0A.count();
        this.f48199o = true;
        this.f48437b = null;
        return k0A;
    }

    @Override // j$.util.stream.AbstractC6747e
    protected final j$.util.stream.AbstractC6747e e(j$.util.Spliterator spliterator) {
        return new j$.util.stream.A2(this, spliterator);
    }

    @Override // j$.util.stream.AbstractC6737c
    protected final void h() {
        this.f48423i = true;
        if (this.f48199o) {
            f(j$.util.stream.AbstractC6845y0.L(this.f48194j.E()));
        }
    }

    @Override // j$.util.stream.AbstractC6737c
    protected final java.lang.Object j() {
        return j$.util.stream.AbstractC6845y0.L(this.f48194j.E());
    }

    /* JADX WARN: Code duplicated, block: B:22:0x006c  */
    /* JADX WARN: Code duplicated, block: B:24:0x0072  */
    /* JADX WARN: Code duplicated, block: B:26:0x0081  */
    @Override // j$.util.stream.AbstractC6747e, java.util.concurrent.CountedCompleter
    public final void onCompletion(java.util.concurrent.CountedCompleter countedCompleter) {
        j$.util.stream.A2 a6;
        j$.util.stream.K0 k0I;
        j$.util.stream.K0 k0G;
        long jMin;
        j$.util.stream.AbstractC6747e abstractC6747e = this.f48439d;
        if (!(abstractC6747e == null)) {
            this.f48198n = ((j$.util.stream.A2) abstractC6747e).f48198n + ((j$.util.stream.A2) this.f48440e).f48198n;
            if (this.f48423i) {
                this.f48198n = 0L;
            } else {
                if (this.f48198n != 0) {
                    k0I = ((j$.util.stream.A2) this.f48439d).f48198n == 0 ? (j$.util.stream.K0) ((j$.util.stream.A2) this.f48440e).c() : j$.util.stream.AbstractC6845y0.I(this.f48194j.E(), (j$.util.stream.K0) ((j$.util.stream.A2) this.f48439d).c(), (j$.util.stream.K0) ((j$.util.stream.A2) this.f48440e).c());
                }
                k0G = k0I;
                if (d()) {
                    if (this.f48197m >= 0) {
                        jMin = java.lang.Math.min(k0G.count(), this.f48196l + this.f48197m);
                    } else {
                        jMin = this.f48198n;
                    }
                    k0G = k0G.g(this.f48196l, jMin, this.f48195k);
                }
                f(k0G);
                this.f48199o = true;
            }
            k0I = j$.util.stream.AbstractC6845y0.L(this.f48194j.E());
            k0G = k0I;
            if (d()) {
                if (this.f48197m >= 0) {
                    jMin = java.lang.Math.min(k0G.count(), this.f48196l + this.f48197m);
                } else {
                    jMin = this.f48198n;
                }
                k0G = k0G.g(this.f48196l, jMin, this.f48195k);
            }
            f(k0G);
            this.f48199o = true;
        }
        if (this.f48197m >= 0 && !d()) {
            long j6 = this.f48196l + this.f48197m;
            long jK = this.f48199o ? this.f48198n : k(j6);
            if (jK >= j6) {
                i();
            } else {
                j$.util.stream.A2 a10 = (j$.util.stream.A2) ((j$.util.stream.AbstractC6747e) getCompleter());
                java.lang.Object obj = this;
                while (true) {
                    if (a10 == null) {
                        if (jK >= j6) {
                            break;
                        }
                    } else {
                        if (obj == a10.f48440e && (a6 = (j$.util.stream.A2) a10.f48439d) != null) {
                            jK += a6.k(j6);
                            if (jK >= j6) {
                                break;
                            }
                        }
                        obj = a10;
                        a10 = (j$.util.stream.A2) ((j$.util.stream.AbstractC6747e) a10.getCompleter());
                    }
                }
                i();
            }
        }
        super.onCompletion(countedCompleter);
    }
}
