package j$.util.stream;

/* JADX INFO: renamed from: j$.util.stream.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
abstract class AbstractC6732b implements j$.util.stream.InterfaceC6762h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final j$.util.stream.AbstractC6732b f48408a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final j$.util.stream.AbstractC6732b f48409b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final int f48410c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private j$.util.stream.AbstractC6732b f48411d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f48412e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f48413f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private j$.util.Spliterator f48414g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f48415h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f48416i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private java.lang.Runnable f48417j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f48418k;

    AbstractC6732b(j$.util.Spliterator spliterator, int i6, boolean z6) {
        this.f48409b = null;
        this.f48414g = spliterator;
        this.f48408a = this;
        int i10 = j$.util.stream.EnumC6756f3.f48449g & i6;
        this.f48410c = i10;
        this.f48413f = (~(i10 << 1)) & j$.util.stream.EnumC6756f3.f48454l;
        this.f48412e = 0;
        this.f48418k = z6;
    }

    AbstractC6732b(j$.util.stream.AbstractC6732b abstractC6732b, int i6) {
        if (abstractC6732b.f48415h) {
            throw new java.lang.IllegalStateException("stream has already been operated upon or closed");
        }
        abstractC6732b.f48415h = true;
        abstractC6732b.f48411d = this;
        this.f48409b = abstractC6732b;
        this.f48410c = j$.util.stream.EnumC6756f3.f48450h & i6;
        this.f48413f = j$.util.stream.EnumC6756f3.n(i6, abstractC6732b.f48413f);
        j$.util.stream.AbstractC6732b abstractC6732b2 = abstractC6732b.f48408a;
        this.f48408a = abstractC6732b2;
        if (M()) {
            abstractC6732b2.f48416i = true;
        }
        this.f48412e = abstractC6732b.f48412e + 1;
    }

    private j$.util.Spliterator O(int i6) {
        int i10;
        int i11;
        j$.util.stream.AbstractC6732b abstractC6732b = this.f48408a;
        j$.util.Spliterator spliteratorL = abstractC6732b.f48414g;
        if (spliteratorL == null) {
            throw new java.lang.IllegalStateException("source already consumed or closed");
        }
        abstractC6732b.f48414g = null;
        if (abstractC6732b.f48418k && abstractC6732b.f48416i) {
            j$.util.stream.AbstractC6732b abstractC6732b2 = abstractC6732b.f48411d;
            int i12 = 1;
            while (abstractC6732b != this) {
                int i13 = abstractC6732b2.f48410c;
                if (abstractC6732b2.M()) {
                    if (j$.util.stream.EnumC6756f3.SHORT_CIRCUIT.u(i13)) {
                        i13 &= ~j$.util.stream.EnumC6756f3.f48463u;
                    }
                    spliteratorL = abstractC6732b2.L(abstractC6732b, spliteratorL);
                    if (spliteratorL.hasCharacteristics(64)) {
                        i10 = (~j$.util.stream.EnumC6756f3.f48462t) & i13;
                        i11 = j$.util.stream.EnumC6756f3.f48461s;
                    } else {
                        i10 = (~j$.util.stream.EnumC6756f3.f48461s) & i13;
                        i11 = j$.util.stream.EnumC6756f3.f48462t;
                    }
                    i13 = i10 | i11;
                    i12 = 0;
                }
                abstractC6732b2.f48412e = i12;
                abstractC6732b2.f48413f = j$.util.stream.EnumC6756f3.n(i13, abstractC6732b.f48413f);
                i12++;
                j$.util.stream.AbstractC6732b abstractC6732b3 = abstractC6732b2;
                abstractC6732b2 = abstractC6732b2.f48411d;
                abstractC6732b = abstractC6732b3;
            }
        }
        if (i6 != 0) {
            this.f48413f = j$.util.stream.EnumC6756f3.n(i6, this.f48413f);
        }
        return spliteratorL;
    }

    final j$.util.stream.K0 A(java.util.function.IntFunction intFunction) {
        j$.util.stream.AbstractC6732b abstractC6732b;
        if (this.f48415h) {
            throw new java.lang.IllegalStateException("stream has already been operated upon or closed");
        }
        this.f48415h = true;
        if (!this.f48408a.f48418k || (abstractC6732b = this.f48409b) == null || !M()) {
            return y(O(0), true, intFunction);
        }
        this.f48412e = 0;
        return K(abstractC6732b, abstractC6732b.O(0), intFunction);
    }

    abstract j$.util.stream.K0 B(j$.util.stream.AbstractC6732b abstractC6732b, j$.util.Spliterator spliterator, boolean z6, java.util.function.IntFunction intFunction);

    final long C(j$.util.Spliterator spliterator) {
        if (j$.util.stream.EnumC6756f3.SIZED.u(this.f48413f)) {
            return spliterator.getExactSizeIfKnown();
        }
        return -1L;
    }

    abstract boolean D(j$.util.Spliterator spliterator, j$.util.stream.InterfaceC6810q2 interfaceC6810q2);

    abstract j$.util.stream.EnumC6761g3 E();

    final j$.util.stream.EnumC6761g3 F() {
        j$.util.stream.AbstractC6732b abstractC6732b = this;
        while (abstractC6732b.f48412e > 0) {
            abstractC6732b = abstractC6732b.f48409b;
        }
        return abstractC6732b.E();
    }

    final int G() {
        return this.f48413f;
    }

    final boolean H() {
        return j$.util.stream.EnumC6756f3.ORDERED.u(this.f48413f);
    }

    final /* synthetic */ j$.util.Spliterator I() {
        return O(0);
    }

    abstract j$.util.stream.C0 J(long j6, java.util.function.IntFunction intFunction);

    j$.util.stream.K0 K(j$.util.stream.AbstractC6732b abstractC6732b, j$.util.Spliterator spliterator, java.util.function.IntFunction intFunction) {
        throw new java.lang.UnsupportedOperationException("Parallel evaluation is not supported");
    }

    j$.util.Spliterator L(j$.util.stream.AbstractC6732b abstractC6732b, j$.util.Spliterator spliterator) {
        return K(abstractC6732b, spliterator, new j$.util.stream.C6807q(15)).spliterator();
    }

    abstract boolean M();

    abstract j$.util.stream.InterfaceC6810q2 N(int i6, j$.util.stream.InterfaceC6810q2 interfaceC6810q2);

    final j$.util.Spliterator P() {
        j$.util.stream.AbstractC6732b abstractC6732b = this.f48408a;
        if (this != abstractC6732b) {
            throw new java.lang.IllegalStateException();
        }
        if (this.f48415h) {
            throw new java.lang.IllegalStateException("stream has already been operated upon or closed");
        }
        this.f48415h = true;
        j$.util.Spliterator spliterator = abstractC6732b.f48414g;
        if (spliterator == null) {
            throw new java.lang.IllegalStateException("source already consumed or closed");
        }
        abstractC6732b.f48414g = null;
        return spliterator;
    }

    abstract j$.util.Spliterator Q(j$.util.stream.AbstractC6732b abstractC6732b, java.util.function.Supplier supplier, boolean z6);

    final j$.util.stream.InterfaceC6810q2 R(j$.util.Spliterator spliterator, j$.util.stream.InterfaceC6810q2 interfaceC6810q2) {
        w(spliterator, S((j$.util.stream.InterfaceC6810q2) j$.util.Objects.requireNonNull(interfaceC6810q2)));
        return interfaceC6810q2;
    }

    final j$.util.stream.InterfaceC6810q2 S(j$.util.stream.InterfaceC6810q2 interfaceC6810q2) {
        j$.util.Objects.requireNonNull(interfaceC6810q2);
        j$.util.stream.AbstractC6732b abstractC6732b = this;
        while (abstractC6732b.f48412e > 0) {
            j$.util.stream.AbstractC6732b abstractC6732b2 = abstractC6732b.f48409b;
            interfaceC6810q2 = abstractC6732b.N(abstractC6732b2.f48413f, interfaceC6810q2);
            abstractC6732b = abstractC6732b2;
        }
        return interfaceC6810q2;
    }

    final j$.util.Spliterator T(j$.util.Spliterator spliterator) {
        return this.f48412e == 0 ? spliterator : Q(this, new j$.util.stream.C6727a(6, spliterator), this.f48408a.f48418k);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.f48415h = true;
        this.f48414g = null;
        j$.util.stream.AbstractC6732b abstractC6732b = this.f48408a;
        java.lang.Runnable runnable = abstractC6732b.f48417j;
        if (runnable != null) {
            abstractC6732b.f48417j = null;
            runnable.run();
        }
    }

    @Override // j$.util.stream.InterfaceC6762h
    public final boolean isParallel() {
        return this.f48408a.f48418k;
    }

    @Override // j$.util.stream.InterfaceC6762h
    public final j$.util.stream.InterfaceC6762h onClose(java.lang.Runnable runnable) {
        if (this.f48415h) {
            throw new java.lang.IllegalStateException("stream has already been operated upon or closed");
        }
        j$.util.Objects.requireNonNull(runnable);
        j$.util.stream.AbstractC6732b abstractC6732b = this.f48408a;
        java.lang.Runnable runnable2 = abstractC6732b.f48417j;
        if (runnable2 != null) {
            runnable = new j$.util.stream.K3(runnable2, runnable);
        }
        abstractC6732b.f48417j = runnable;
        return this;
    }

    @Override // j$.util.stream.InterfaceC6762h, j$.util.stream.F
    public final j$.util.stream.InterfaceC6762h parallel() {
        this.f48408a.f48418k = true;
        return this;
    }

    @Override // j$.util.stream.InterfaceC6762h, j$.util.stream.F
    public final j$.util.stream.InterfaceC6762h sequential() {
        this.f48408a.f48418k = false;
        return this;
    }

    @Override // j$.util.stream.InterfaceC6762h
    public j$.util.Spliterator spliterator() {
        if (this.f48415h) {
            throw new java.lang.IllegalStateException("stream has already been operated upon or closed");
        }
        this.f48415h = true;
        j$.util.stream.AbstractC6732b abstractC6732b = this.f48408a;
        if (this != abstractC6732b) {
            return Q(this, new j$.util.stream.C6727a(0, this), abstractC6732b.f48418k);
        }
        j$.util.Spliterator spliterator = abstractC6732b.f48414g;
        if (spliterator == null) {
            throw new java.lang.IllegalStateException("source already consumed or closed");
        }
        abstractC6732b.f48414g = null;
        return spliterator;
    }

    final void w(j$.util.Spliterator spliterator, j$.util.stream.InterfaceC6810q2 interfaceC6810q2) {
        j$.util.Objects.requireNonNull(interfaceC6810q2);
        if (j$.util.stream.EnumC6756f3.SHORT_CIRCUIT.u(this.f48413f)) {
            x(spliterator, interfaceC6810q2);
            return;
        }
        interfaceC6810q2.k(spliterator.getExactSizeIfKnown());
        spliterator.forEachRemaining(interfaceC6810q2);
        interfaceC6810q2.j();
    }

    final boolean x(j$.util.Spliterator spliterator, j$.util.stream.InterfaceC6810q2 interfaceC6810q2) {
        j$.util.stream.AbstractC6732b abstractC6732b = this;
        while (abstractC6732b.f48412e > 0) {
            abstractC6732b = abstractC6732b.f48409b;
        }
        interfaceC6810q2.k(spliterator.getExactSizeIfKnown());
        boolean zD = abstractC6732b.D(spliterator, interfaceC6810q2);
        interfaceC6810q2.j();
        return zD;
    }

    final j$.util.stream.K0 y(j$.util.Spliterator spliterator, boolean z6, java.util.function.IntFunction intFunction) {
        if (this.f48408a.f48418k) {
            return B(this, spliterator, z6, intFunction);
        }
        j$.util.stream.C0 c0J = J(C(spliterator), intFunction);
        R(spliterator, c0J);
        return c0J.a();
    }

    final java.lang.Object z(j$.util.stream.L3 l6) {
        if (this.f48415h) {
            throw new java.lang.IllegalStateException("stream has already been operated upon or closed");
        }
        this.f48415h = true;
        return this.f48408a.f48418k ? l6.c(this, O(l6.d())) : l6.b(this, O(l6.d()));
    }
}
