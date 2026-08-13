package p102k1;

/* JADX INFO: loaded from: classes.dex */
public final class c extends p092j1.e {

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    private j1.g.d f49362s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    private int f49363t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    private p122m1.a f49364u0;

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f49365a;

        static {
            int[] iArr = new int[j1.g.d.values().length];
            try {
                iArr[j1.g.d.LEFT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[j1.g.d.START.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[j1.g.d.RIGHT.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[j1.g.d.END.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[j1.g.d.TOP.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr[j1.g.d.BOTTOM.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            f49365a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(p092j1.g gVar) {
        super(gVar, j1.g.e.BARRIER);
        p247y7.AbstractC7350t.f(gVar, "state");
    }

    @Override // p092j1.e
    public p122m1.j V0() {
        if (this.f49364u0 == null) {
            this.f49364u0 = new p122m1.a();
        }
        p122m1.a aVar = this.f49364u0;
        p247y7.AbstractC7350t.c(aVar);
        return aVar;
    }

    public final void Z0(j1.g.d dVar) {
        p247y7.AbstractC7350t.f(dVar, "barrierDirection");
        this.f49362s0 = dVar;
    }

    @Override // p092j1.e, p092j1.a, p092j1.f
    public void apply() {
        V0();
        j1.g.d dVar = this.f49362s0;
        int i6 = dVar == null ? -1 : k1.c.a.f49365a[dVar.ordinal()];
        int i10 = 3;
        if (i6 == 3 || i6 == 4) {
            i10 = 1;
        } else if (i6 == 5) {
            i10 = 2;
        } else if (i6 != 6) {
            i10 = 0;
        }
        p122m1.a aVar = this.f49364u0;
        p247y7.AbstractC7350t.c(aVar);
        aVar.l2(i10);
        p122m1.a aVar2 = this.f49364u0;
        p247y7.AbstractC7350t.c(aVar2);
        aVar2.m2(this.f49363t0);
    }

    @Override // p092j1.a
    public p092j1.a i0(int i6) {
        this.f49363t0 = i6;
        return this;
    }

    @Override // p092j1.a
    public p092j1.a j0(java.lang.Object obj) {
        p247y7.AbstractC7350t.f(obj, "marginValue");
        i0(W0().e(obj));
        return this;
    }
}
