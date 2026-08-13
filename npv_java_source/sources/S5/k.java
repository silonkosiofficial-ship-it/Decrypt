package S5;

/* JADX INFO: loaded from: classes3.dex */
public final class k {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final S5.k.b f12547c = new S5.k.b(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Q4.f f12548a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final U5.f f12549b;

    static final class a extends p147o7.l implements p237x7.p {

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        int f12550G;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        final /* synthetic */ p127m7.i f12552I;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        final /* synthetic */ S5.F f12553J;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(p127m7.i iVar, S5.F f6, p127m7.e eVar) {
            super(2, eVar);
            this.f12552I = iVar;
            this.f12553J = f6;
        }

        /* JADX WARN: Code duplicated, block: B:28:0x0075  */
        /* JADX WARN: Code duplicated, block: B:30:0x0079  */
        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            java.lang.Object objG = p137n7.b.g();
            int i6 = this.f12550G;
            if (i6 != 0) {
                if (i6 == 1) {
                    p087i7.x.b(obj);
                } else {
                    if (i6 != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p087i7.x.b(obj);
                }
                if (!S5.k.this.f12549b.d()) {
                    S5.D d6 = new S5.D(this.f12552I);
                    d6.i(this.f12553J);
                    S5.H.f12477C.a(d6);
                    S5.k.this.f12548a.h(new Q4.g() { // from class: S5.j
                    });
                }
                return p087i7.M.f46721a;
            }
            p087i7.x.b(obj);
            T5.a aVar = T5.a.f12957a;
            this.f12550G = 1;
            obj = aVar.c(this);
            if (obj == objG) {
                return objG;
            }
            java.util.Collection collectionValues = ((java.util.Map) obj).values();
            if (!(collectionValues instanceof java.util.Collection) || !collectionValues.isEmpty()) {
                java.util.Iterator it = collectionValues.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (((T5.b) it.next()).a()) {
                            U5.f fVar = S5.k.this.f12549b;
                            this.f12550G = 2;
                            if (fVar.g(this) == objG) {
                                return objG;
                            }
                            if (!S5.k.this.f12549b.d()) {
                                S5.D d10 = new S5.D(this.f12552I);
                                d10.i(this.f12553J);
                                S5.H.f12477C.a(d10);
                                S5.k.this.f12548a.h(new Q4.g() { // from class: S5.j
                                });
                            }
                            return p087i7.M.f46721a;
                        }
                    }
                }
            }
            return p087i7.M.f46721a;
        }

        @Override // p237x7.p
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object u(W8.N n6, p127m7.e eVar) {
            return ((S5.k.a) x(n6, eVar)).B(p087i7.M.f46721a);
        }

        @Override // p147o7.a
        public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
            return S5.k.this.new a(this.f12552I, this.f12553J, eVar);
        }
    }

    public static final class b {
        private b() {
        }

        public /* synthetic */ b(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }
    }

    public k(Q4.f fVar, U5.f fVar2, p127m7.i iVar, S5.F f6) {
        p247y7.AbstractC7350t.f(fVar, "firebaseApp");
        p247y7.AbstractC7350t.f(fVar2, "settings");
        p247y7.AbstractC7350t.f(iVar, "backgroundDispatcher");
        p247y7.AbstractC7350t.f(f6, "lifecycleServiceBinder");
        this.f12548a = fVar;
        this.f12549b = fVar2;
        android.content.Context applicationContext = fVar.k().getApplicationContext();
        if (applicationContext instanceof android.app.Application) {
            ((android.app.Application) applicationContext).registerActivityLifecycleCallbacks(S5.H.f12477C);
            W8.AbstractC1788i.d(W8.O.a(iVar), null, null, new S5.k.a(iVar, f6, null), 3, null);
            return;
        }
        java.lang.String str = "Failed to register lifecycle callbacks, unexpected context " + applicationContext.getClass() + '.';
    }
}
