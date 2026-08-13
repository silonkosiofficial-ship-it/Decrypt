package N7;

/* JADX INFO: loaded from: classes2.dex */
public final class f extends L7.g {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    static final /* synthetic */ F7.k[] f7852k = {p247y7.P.j(new p247y7.G(p247y7.P.b(N7.f.class), "customizer", "getCustomizer()Lorg/jetbrains/kotlin/builtins/jvm/JvmBuiltInsCustomizer;"))};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final N7.f.a f7853h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private p237x7.a f7854i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final E8.i f7855j;

    public enum a {
        FROM_DEPENDENCIES,
        FROM_CLASS_LOADER,
        FALLBACK;


        /* JADX INFO: renamed from: G, reason: collision with root package name */
        private static final /* synthetic */ p157p7.a f7860G = p157p7.b.a(e());
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final O7.G f7861a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f7862b;

        public b(O7.G g6, boolean z6) {
            p247y7.AbstractC7350t.f(g6, "ownerModuleDescriptor");
            this.f7861a = g6;
            this.f7862b = z6;
        }

        public final O7.G a() {
            return this.f7861a;
        }

        public final boolean b() {
            return this.f7862b;
        }
    }

    public /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f7863a;

        static {
            int[] iArr = new int[N7.f.a.values().length];
            try {
                iArr[N7.f.a.FROM_DEPENDENCIES.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[N7.f.a.FROM_CLASS_LOADER.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[N7.f.a.FALLBACK.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            f7863a = iArr;
        }
    }

    static final class d extends p247y7.AbstractC7352v implements p237x7.a {

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ E8.n f7865E;

        static final class a extends p247y7.AbstractC7352v implements p237x7.a {

            /* JADX INFO: renamed from: D, reason: collision with root package name */
            final /* synthetic */ N7.f f7866D;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(N7.f fVar) {
                super(0);
                this.f7866D = fVar;
            }

            @Override // p237x7.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final N7.f.b b() {
                p237x7.a aVar = this.f7866D.f7854i;
                if (aVar == null) {
                    throw new java.lang.AssertionError("JvmBuiltins instance has not been initialized properly");
                }
                N7.f.b bVar = (N7.f.b) aVar.b();
                this.f7866D.f7854i = null;
                return bVar;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(E8.n nVar) {
            super(0);
            this.f7865E = nVar;
        }

        @Override // p237x7.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final N7.i b() {
            R7.x xVarR = N7.f.this.r();
            p247y7.AbstractC7350t.e(xVarR, "getBuiltInsModule(...)");
            return new N7.i(xVarR, this.f7865E, new N7.f.d.a(N7.f.this));
        }
    }

    static final class e extends p247y7.AbstractC7352v implements p237x7.a {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ O7.G f7867D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ boolean f7868E;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(O7.G g6, boolean z6) {
            super(0);
            this.f7867D = g6;
            this.f7868E = z6;
        }

        @Override // p237x7.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final N7.f.b b() {
            return new N7.f.b(this.f7867D, this.f7868E);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(E8.n nVar, N7.f.a aVar) {
        boolean z6;
        super(nVar);
        p247y7.AbstractC7350t.f(nVar, "storageManager");
        p247y7.AbstractC7350t.f(aVar, "kind");
        this.f7853h = aVar;
        this.f7855j = nVar.d(new N7.f.d(nVar));
        int i6 = N7.f.c.f7863a[aVar.ordinal()];
        if (i6 == 2) {
            z6 = false;
        } else if (i6 != 3) {
            return;
        } else {
            z6 = true;
        }
        f(z6);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // L7.g
    /* JADX INFO: renamed from: H0, reason: merged with bridge method [inline-methods] */
    public java.util.List v() {
        java.lang.Iterable iterableV = super.v();
        p247y7.AbstractC7350t.e(iterableV, "getClassDescriptorFactories(...)");
        E8.n nVarU = U();
        p247y7.AbstractC7350t.e(nVarU, "getStorageManager(...)");
        R7.x xVarR = r();
        p247y7.AbstractC7350t.e(xVarR, "getBuiltInsModule(...)");
        return p097j7.AbstractC6879v.B0(iterableV, new N7.e(nVarU, xVarR, null, 4, null));
    }

    public final N7.i I0() {
        return (N7.i) E8.m.a(this.f7855j, this, f7852k[0]);
    }

    public final void J0(O7.G g6, boolean z6) {
        p247y7.AbstractC7350t.f(g6, "moduleDescriptor");
        K0(new N7.f.e(g6, z6));
    }

    public final void K0(p237x7.a aVar) {
        p247y7.AbstractC7350t.f(aVar, "computation");
        this.f7854i = aVar;
    }

    @Override // L7.g
    protected Q7.c M() {
        return I0();
    }

    @Override // L7.g
    protected Q7.a g() {
        return I0();
    }
}
