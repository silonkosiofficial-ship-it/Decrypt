package p073h2;

/* JADX INFO: renamed from: h2.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6631h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Z8.y f46146a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Z8.InterfaceC1869f f46147b;

    /* JADX INFO: renamed from: h2.h$a */
    public static final class a implements Z8.InterfaceC1869f {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        final /* synthetic */ Z8.InterfaceC1869f f46148C;

        /* JADX INFO: renamed from: h2.h$a$a, reason: collision with other inner class name */
        public static final class C0546a implements Z8.InterfaceC1870g {

            /* JADX INFO: renamed from: C, reason: collision with root package name */
            final /* synthetic */ Z8.InterfaceC1870g f46149C;

            /* JADX INFO: renamed from: h2.h$a$a$a, reason: collision with other inner class name */
            public static final class C0547a extends p147o7.d {

                /* JADX INFO: renamed from: F, reason: collision with root package name */
                /* synthetic */ java.lang.Object f46150F;

                /* JADX INFO: renamed from: G, reason: collision with root package name */
                int f46151G;

                public C0547a(p127m7.e eVar) {
                    super(eVar);
                }

                @Override // p147o7.a
                public final java.lang.Object B(java.lang.Object obj) {
                    this.f46150F = obj;
                    this.f46151G |= Integer.MIN_VALUE;
                    return p073h2.C6631h.a.C0546a.this.a(null, this);
                }
            }

            public C0546a(Z8.InterfaceC1870g interfaceC1870g) {
                this.f46149C = interfaceC1870g;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // Z8.InterfaceC1870g
            public final java.lang.Object a(java.lang.Object obj, p127m7.e eVar) {
                p073h2.C6631h.a.C0546a.C0547a c0547a;
                if (eVar instanceof p073h2.C6631h.a.C0546a.C0547a) {
                    c0547a = (p073h2.C6631h.a.C0546a.C0547a) eVar;
                    int i6 = c0547a.f46151G;
                    if ((i6 & Integer.MIN_VALUE) != 0) {
                        c0547a.f46151G = i6 - Integer.MIN_VALUE;
                    } else {
                        c0547a = new p073h2.C6631h.a.C0546a.C0547a(eVar);
                    }
                } else {
                    c0547a = new p073h2.C6631h.a.C0546a.C0547a(eVar);
                }
                java.lang.Object obj2 = c0547a.f46150F;
                java.lang.Object objG = p137n7.b.g();
                int i10 = c0547a.f46151G;
                if (i10 == 0) {
                    p087i7.x.b(obj2);
                    Z8.InterfaceC1870g interfaceC1870g = this.f46149C;
                    java.lang.Object objD = ((p087i7.u) obj).d();
                    if (objD != null) {
                        c0547a.f46151G = 1;
                        if (interfaceC1870g.a(objD, c0547a) == objG) {
                            return objG;
                        }
                    }
                } else {
                    if (i10 != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p087i7.x.b(obj2);
                }
                return p087i7.M.f46721a;
            }
        }

        public a(Z8.InterfaceC1869f interfaceC1869f) {
            this.f46148C = interfaceC1869f;
        }

        @Override // Z8.InterfaceC1869f
        public java.lang.Object b(Z8.InterfaceC1870g interfaceC1870g, p127m7.e eVar) {
            java.lang.Object objB = this.f46148C.b(new p073h2.C6631h.a.C0546a(interfaceC1870g), eVar);
            return objB == p137n7.b.g() ? objB : p087i7.M.f46721a;
        }
    }

    public C6631h(java.lang.Object obj) {
        Z8.y yVarA = Z8.P.a(new p087i7.u(Integer.MIN_VALUE, obj));
        this.f46146a = yVarA;
        this.f46147b = new p073h2.C6631h.a(yVarA);
    }

    public /* synthetic */ C6631h(java.lang.Object obj, int i6, p247y7.AbstractC7342k abstractC7342k) {
        this((i6 & 1) != 0 ? null : obj);
    }

    public final Z8.InterfaceC1869f a() {
        return this.f46147b;
    }

    public final void b(java.lang.Object obj) {
        p247y7.AbstractC7350t.f(obj, "data");
        Z8.y yVar = this.f46146a;
        yVar.setValue(new p087i7.u(java.lang.Integer.valueOf(((java.lang.Number) ((p087i7.u) yVar.getValue()).c()).intValue() + 1), obj));
    }
}
