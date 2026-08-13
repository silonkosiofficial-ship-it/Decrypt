package j$.util.stream;

/* JADX INFO: loaded from: classes4.dex */
final class S3 extends j$.util.stream.AbstractC6747e {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final j$.util.stream.AbstractC6732b f48345h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final java.util.function.IntFunction f48346i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final boolean f48347j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f48348k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f48349l;

    S3(j$.util.stream.S3 s6, j$.util.Spliterator spliterator) {
        super(s6, spliterator);
        this.f48345h = s6.f48345h;
        this.f48346i = s6.f48346i;
        this.f48347j = s6.f48347j;
    }

    S3(j$.util.stream.AbstractC6732b abstractC6732b, j$.util.stream.AbstractC6732b abstractC6732b2, j$.util.Spliterator spliterator, java.util.function.IntFunction intFunction) {
        super(abstractC6732b2, spliterator);
        this.f48345h = abstractC6732b;
        this.f48346i = intFunction;
        this.f48347j = j$.util.stream.EnumC6756f3.ORDERED.u(abstractC6732b2.G());
    }

    @Override // j$.util.stream.AbstractC6747e
    protected final java.lang.Object a() {
        boolean z6 = !d();
        j$.util.stream.C0 c0J = this.f48436a.J((z6 && this.f48347j && j$.util.stream.EnumC6756f3.SIZED.x(this.f48345h.f48410c)) ? this.f48345h.C(this.f48437b) : -1L, this.f48346i);
        j$.util.stream.R3 r6 = (j$.util.stream.R3) this.f48345h;
        boolean z10 = this.f48347j && z6;
        r6.getClass();
        j$.util.stream.Q3 q6 = new j$.util.stream.Q3(r6, c0J, z10);
        this.f48436a.R(this.f48437b, q6);
        j$.util.stream.K0 k0A = c0J.a();
        this.f48348k = k0A.count();
        this.f48349l = q6.f48323b;
        return k0A;
    }

    @Override // j$.util.stream.AbstractC6747e
    protected final j$.util.stream.AbstractC6747e e(j$.util.Spliterator spliterator) {
        return new j$.util.stream.S3(this, spliterator);
    }

    @Override // j$.util.stream.AbstractC6747e, java.util.concurrent.CountedCompleter
    public final void onCompletion(java.util.concurrent.CountedCompleter countedCompleter) {
        j$.util.stream.K0 k0I;
        java.lang.Object objC;
        j$.util.stream.K0 k0G;
        j$.util.stream.AbstractC6747e abstractC6747e = this.f48439d;
        if (abstractC6747e != null) {
            if (this.f48347j) {
                j$.util.stream.S3 s6 = (j$.util.stream.S3) abstractC6747e;
                long j6 = s6.f48349l;
                this.f48349l = j6;
                if (j6 == s6.f48348k) {
                    this.f48349l = j6 + ((j$.util.stream.S3) this.f48440e).f48349l;
                }
            }
            j$.util.stream.S3 s10 = (j$.util.stream.S3) abstractC6747e;
            long j10 = s10.f48348k;
            j$.util.stream.S3 s11 = (j$.util.stream.S3) this.f48440e;
            this.f48348k = j10 + s11.f48348k;
            if (s10.f48348k == 0) {
                objC = s11.c();
            } else {
                if (s11.f48348k == 0) {
                    objC = s10.c();
                } else {
                    k0I = j$.util.stream.AbstractC6845y0.I(this.f48345h.E(), (j$.util.stream.K0) ((j$.util.stream.S3) this.f48439d).c(), (j$.util.stream.K0) ((j$.util.stream.S3) this.f48440e).c());
                }
                k0G = k0I;
                if (d() && this.f48347j) {
                    k0G = k0G.g(this.f48349l, k0G.count(), this.f48346i);
                }
                f(k0G);
            }
            k0I = (j$.util.stream.K0) objC;
            k0G = k0I;
            if (d()) {
                k0G = k0G.g(this.f48349l, k0G.count(), this.f48346i);
            }
            f(k0G);
        }
        super.onCompletion(countedCompleter);
    }
}
