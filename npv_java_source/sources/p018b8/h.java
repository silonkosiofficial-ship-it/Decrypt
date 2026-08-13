package p018b8;

/* JADX INFO: loaded from: classes2.dex */
public final class h extends R7.z {

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    static final /* synthetic */ F7.k[] f24254Q = {p247y7.P.j(new p247y7.G(p247y7.P.b(p018b8.h.class), "binaryClasses", "getBinaryClasses$descriptors_jvm()Ljava/util/Map;")), p247y7.P.j(new p247y7.G(p247y7.P.b(p018b8.h.class), "partToFacade", "getPartToFacade()Ljava/util/HashMap;"))};

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private final p048e8.u f24255I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private final p008a8.g f24256J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private final p128m8.e f24257K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private final E8.i f24258L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private final p018b8.d f24259M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private final E8.i f24260N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final P7.g f24261O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private final E8.i f24262P;

    static final class a extends p247y7.AbstractC7352v implements p237x7.a {
        a() {
            super(0);
        }

        @Override // p237x7.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.util.Map b() {
            p068g8.z zVarO = p018b8.h.this.f24256J.a().o();
            java.lang.String strB = p018b8.h.this.e().b();
            p247y7.AbstractC7350t.e(strB, "asString(...)");
            java.util.List<java.lang.String> listA = zVarO.a(strB);
            p018b8.h hVar = p018b8.h.this;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.String str : listA) {
                p138n8.b bVarM = p138n8.b.m(p228w8.d.d(str).e());
                p247y7.AbstractC7350t.e(bVarM, "topLevel(...)");
                p068g8.t tVarB = p068g8.s.b(hVar.f24256J.a().j(), bVarM, hVar.f24257K);
                p087i7.u uVarA = tVarB != null ? p087i7.B.a(str, tVarB) : null;
                if (uVarA != null) {
                    arrayList.add(uVarA);
                }
            }
            return p097j7.S.q(arrayList);
        }
    }

    static final class b extends p247y7.AbstractC7352v implements p237x7.a {

        public /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f24265a;

            static {
                int[] iArr = new int[p078h8.a.EnumC0561a.values().length];
                try {
                    iArr[p078h8.a.EnumC0561a.MULTIFILE_CLASS_PART.ordinal()] = 1;
                } catch (java.lang.NoSuchFieldError unused) {
                }
                try {
                    iArr[p078h8.a.EnumC0561a.FILE_FACADE.ordinal()] = 2;
                } catch (java.lang.NoSuchFieldError unused2) {
                }
                f24265a = iArr;
            }
        }

        b() {
            super(0);
        }

        @Override // p237x7.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.util.HashMap b() {
            java.util.HashMap map = new java.util.HashMap();
            for (java.util.Map.Entry entry : p018b8.h.this.W0().entrySet()) {
                java.lang.String str = (java.lang.String) entry.getKey();
                p068g8.t tVar = (p068g8.t) entry.getValue();
                p228w8.d dVarD = p228w8.d.d(str);
                p247y7.AbstractC7350t.e(dVarD, "byInternalName(...)");
                p078h8.a aVarB = tVar.b();
                int i6 = b8.h.b.a.f24265a[aVarB.c().ordinal()];
                if (i6 == 1) {
                    java.lang.String strE = aVarB.e();
                    if (strE != null) {
                        p228w8.d dVarD2 = p228w8.d.d(strE);
                        p247y7.AbstractC7350t.e(dVarD2, "byInternalName(...)");
                        map.put(dVarD, dVarD2);
                    }
                } else if (i6 == 2) {
                    map.put(dVarD, dVarD);
                }
            }
            return map;
        }
    }

    static final class c extends p247y7.AbstractC7352v implements p237x7.a {
        c() {
            super(0);
        }

        @Override // p237x7.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.util.List b() {
            java.util.Collection collectionE = p018b8.h.this.f24255I.E();
            java.util.ArrayList arrayList = new java.util.ArrayList(p097j7.AbstractC6879v.x(collectionE, 10));
            java.util.Iterator it = collectionE.iterator();
            while (it.hasNext()) {
                arrayList.add(((p048e8.u) it.next()).e());
            }
            return arrayList;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(p008a8.g gVar, p048e8.u uVar) {
        super(gVar.d(), uVar.e());
        p247y7.AbstractC7350t.f(gVar, "outerContext");
        p247y7.AbstractC7350t.f(uVar, "jPackage");
        this.f24255I = uVar;
        p008a8.g gVarD = p008a8.a.d(gVar, this, null, 0, 6, null);
        this.f24256J = gVarD;
        this.f24257K = P8.c.a(gVar.a().b().d().g());
        this.f24258L = gVarD.e().d(new b8.h.a());
        this.f24259M = new p018b8.d(gVarD, uVar, this);
        this.f24260N = gVarD.e().e(new b8.h.c(), p097j7.AbstractC6879v.m());
        this.f24261O = gVarD.a().i().b() ? P7.g.f8385d.b() : p008a8.e.a(gVarD, uVar);
        this.f24262P = gVarD.e().d(new b8.h.b());
    }

    public final O7.InterfaceC1424e V0(p048e8.g gVar) {
        p247y7.AbstractC7350t.f(gVar, "jClass");
        return this.f24259M.j().P(gVar);
    }

    public final java.util.Map W0() {
        return (java.util.Map) E8.m.a(this.f24258L, this, f24254Q[0]);
    }

    @Override // O7.K
    /* JADX INFO: renamed from: X0, reason: merged with bridge method [inline-methods] */
    public p018b8.d u() {
        return this.f24259M;
    }

    public final java.util.List Y0() {
        return (java.util.List) this.f24260N.b();
    }

    @Override // P7.b, P7.a
    public P7.g k() {
        return this.f24261O;
    }

    @Override // R7.z, R7.AbstractC1505k, O7.InterfaceC1435p
    public O7.a0 o() {
        return new p068g8.u(this);
    }

    @Override // R7.z, R7.AbstractC1504j
    public java.lang.String toString() {
        return "Lazy Java package fragment: " + e() + " of module " + this.f24256J.a().m();
    }
}
