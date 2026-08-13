package D;

/* JADX INFO: loaded from: classes.dex */
public final class A implements V.G1 {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private static final D.A.a f1566G = new D.A.a(null);

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final int f1567C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final int f1568D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final V.InterfaceC1753w0 f1569E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private int f1570F;

    private static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final E7.i b(int i6, int i10, int i11) {
            int i12 = (i6 / i10) * i10;
            return E7.j.q(java.lang.Math.max(i12 - i11, 0), i12 + i10 + i11);
        }
    }

    public A(int i6, int i10, int i11) {
        this.f1567C = i10;
        this.f1568D = i11;
        this.f1569E = V.v1.h(f1566G.b(i6, i10, i11), V.v1.p());
        this.f1570F = i6;
    }

    private void g(E7.i iVar) {
        this.f1569E.setValue(iVar);
    }

    @Override // V.G1
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public E7.i getValue() {
        return (E7.i) this.f1569E.getValue();
    }

    public final void n(int i6) {
        if (i6 != this.f1570F) {
            this.f1570F = i6;
            g(f1566G.b(i6, this.f1567C, this.f1568D));
        }
    }
}
