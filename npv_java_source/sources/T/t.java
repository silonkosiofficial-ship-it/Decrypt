package T;

/* JADX INFO: loaded from: classes.dex */
public final class t implements p250z.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f12866a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.util.Map f12867b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Z8.InterfaceC1869f f12868c;

    public static final class a implements Z8.InterfaceC1869f {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        final /* synthetic */ Z8.InterfaceC1869f f12869C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ T.t f12870D;

        /* JADX INFO: renamed from: T.t$a$a, reason: collision with other inner class name */
        public static final class C0272a implements Z8.InterfaceC1870g {

            /* JADX INFO: renamed from: C, reason: collision with root package name */
            final /* synthetic */ Z8.InterfaceC1870g f12871C;

            /* JADX INFO: renamed from: D, reason: collision with root package name */
            final /* synthetic */ T.t f12872D;

            /* JADX INFO: renamed from: T.t$a$a$a, reason: collision with other inner class name */
            public static final class C0273a extends p147o7.d {

                /* JADX INFO: renamed from: F, reason: collision with root package name */
                /* synthetic */ java.lang.Object f12873F;

                /* JADX INFO: renamed from: G, reason: collision with root package name */
                int f12874G;

                public C0273a(p127m7.e eVar) {
                    super(eVar);
                }

                @Override // p147o7.a
                public final java.lang.Object B(java.lang.Object obj) {
                    this.f12873F = obj;
                    this.f12874G |= Integer.MIN_VALUE;
                    return T.t.a.C0272a.this.a(null, this);
                }
            }

            public C0272a(Z8.InterfaceC1870g interfaceC1870g, T.t tVar) {
                this.f12871C = interfaceC1870g;
                this.f12872D = tVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // Z8.InterfaceC1870g
            public final java.lang.Object a(java.lang.Object obj, p127m7.e eVar) {
                T.t.a.C0272a.C0273a c0273a;
                z.n.c cVar;
                z.n.a aVar;
                java.lang.Object cVar2;
                if (eVar instanceof T.t.a.C0272a.C0273a) {
                    c0273a = (T.t.a.C0272a.C0273a) eVar;
                    int i6 = c0273a.f12874G;
                    if ((i6 & Integer.MIN_VALUE) != 0) {
                        c0273a.f12874G = i6 - Integer.MIN_VALUE;
                    } else {
                        c0273a = new T.t.a.C0272a.C0273a(eVar);
                    }
                } else {
                    c0273a = new T.t.a.C0272a.C0273a(eVar);
                }
                java.lang.Object obj2 = c0273a.f12873F;
                java.lang.Object objG = p137n7.b.g();
                int i10 = c0273a.f12874G;
                if (i10 == 0) {
                    p087i7.x.b(obj2);
                    Z8.InterfaceC1870g interfaceC1870g = this.f12871C;
                    p250z.i iVar = (p250z.i) obj;
                    if (iVar instanceof z.n.b) {
                        z.n.b bVarF = this.f12872D.f((z.n.b) iVar);
                        this.f12872D.f12867b.put(iVar, bVarF);
                        cVar2 = bVarF;
                    } else if (iVar instanceof z.n.a) {
                        aVar = (z.n.a) iVar;
                        z.n.b bVar = (z.n.b) this.f12872D.f12867b.remove(aVar.a());
                        if (bVar != null) {
                            cVar2 = aVar;
                            cVar2 = new z.n.a(bVar);
                        }
                    } else if (iVar instanceof z.n.c) {
                        cVar = (z.n.c) iVar;
                        z.n.b bVar2 = (z.n.b) this.f12872D.f12867b.remove(cVar.a());
                        if (bVar2 != null) {
                            cVar2 = iVar;
                            cVar2 = cVar;
                            cVar2 = new z.n.c(bVar2);
                        }
                    }
                    cVar2 = iVar;
                    cVar2 = cVar;
                    cVar2 = iVar;
                    cVar2 = aVar;
                    c0273a.f12874G = 1;
                    if (interfaceC1870g.a(cVar2, c0273a) == objG) {
                        return objG;
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

        public a(Z8.InterfaceC1869f interfaceC1869f, T.t tVar) {
            this.f12869C = interfaceC1869f;
            this.f12870D = tVar;
        }

        @Override // Z8.InterfaceC1869f
        public java.lang.Object b(Z8.InterfaceC1870g interfaceC1870g, p127m7.e eVar) {
            java.lang.Object objB = this.f12869C.b(new T.t.a.C0272a(interfaceC1870g, this.f12870D), eVar);
            return objB == p137n7.b.g() ? objB : p087i7.M.f46721a;
        }
    }

    private t(p250z.j jVar, long j6) {
        this.f12866a = j6;
        this.f12867b = new java.util.LinkedHashMap();
        this.f12868c = new T.t.a(jVar.b(), this);
    }

    public /* synthetic */ t(p250z.j jVar, long j6, p247y7.AbstractC7342k abstractC7342k) {
        this(jVar, j6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final z.n.b f(z.n.b bVar) {
        return new z.n.b(p131n0.g.q(bVar.a(), this.f12866a), null);
    }

    @Override // p250z.j
    public Z8.InterfaceC1869f b() {
        return this.f12868c;
    }
}
