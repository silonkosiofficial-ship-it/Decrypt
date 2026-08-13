package p068g8;

/* JADX INFO: renamed from: g8.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6620b implements B8.InterfaceC0825f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p068g8.AbstractC6620b.C0518b f45628b = new p068g8.AbstractC6620b.C0518b(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p068g8.r f45629a;

    /* JADX INFO: renamed from: g8.b$a */
    public static abstract class a {
        public abstract java.util.Map a();
    }

    /* JADX INFO: renamed from: g8.b$b, reason: collision with other inner class name */
    public static final class C0518b {
        private C0518b() {
        }

        public /* synthetic */ C0518b(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        public final p068g8.t a(B8.A a6, boolean z6, boolean z10, java.lang.Boolean bool, boolean z11, p068g8.r rVar, p128m8.e eVar) {
            B8.A.a aVarH;
            p138n8.b bVarM;
            java.lang.String str;
            p247y7.AbstractC7350t.f(a6, "container");
            p247y7.AbstractC7350t.f(rVar, "kotlinClassFinder");
            p247y7.AbstractC7350t.f(eVar, "jvmMetadataVersion");
            if (z6) {
                if (bool == null) {
                    throw new java.lang.IllegalStateException(("isConst should not be null for property (container=" + a6 + ')').toString());
                }
                if (a6 instanceof B8.A.a) {
                    B8.A.a aVar = (B8.A.a) a6;
                    if (aVar.g() == p088i8.c.EnumC0572c.INTERFACE) {
                        bVarM = aVar.e().d(p138n8.f.o("DefaultImpls"));
                        str = "createNestedClassId(...)";
                    }
                    p247y7.AbstractC7350t.e(bVarM, str);
                    return p068g8.s.b(rVar, bVarM, eVar);
                }
                if (bool.booleanValue() && (a6 instanceof B8.A.b)) {
                    O7.a0 a0VarC = a6.c();
                    p068g8.n nVar = a0VarC instanceof p068g8.n ? (p068g8.n) a0VarC : null;
                    p228w8.d dVarF = nVar != null ? nVar.f() : null;
                    if (dVarF != null) {
                        java.lang.String strF = dVarF.f();
                        p247y7.AbstractC7350t.e(strF, "getInternalName(...)");
                        bVarM = p138n8.b.m(new p138n8.c(S8.r.Q(strF, '/', '.', false, 4, null)));
                        str = "topLevel(...)";
                        p247y7.AbstractC7350t.e(bVarM, str);
                        return p068g8.s.b(rVar, bVarM, eVar);
                    }
                }
            }
            if (z10 && (a6 instanceof B8.A.a)) {
                B8.A.a aVar2 = (B8.A.a) a6;
                if (aVar2.g() == p088i8.c.EnumC0572c.COMPANION_OBJECT && (aVarH = aVar2.h()) != null && (aVarH.g() == p088i8.c.EnumC0572c.CLASS || aVarH.g() == p088i8.c.EnumC0572c.ENUM_CLASS || (z11 && (aVarH.g() == p088i8.c.EnumC0572c.INTERFACE || aVarH.g() == p088i8.c.EnumC0572c.ANNOTATION_CLASS)))) {
                    O7.a0 a0VarC2 = aVarH.c();
                    p068g8.v vVar = a0VarC2 instanceof p068g8.v ? (p068g8.v) a0VarC2 : null;
                    if (vVar != null) {
                        return vVar.d();
                    }
                    return null;
                }
            }
            if (!(a6 instanceof B8.A.b) || !(a6.c() instanceof p068g8.n)) {
                return null;
            }
            O7.a0 a0VarC3 = a6.c();
            p247y7.AbstractC7350t.d(a0VarC3, "null cannot be cast to non-null type org.jetbrains.kotlin.load.kotlin.JvmPackagePartSource");
            p068g8.n nVar2 = (p068g8.n) a0VarC3;
            p068g8.t tVarG = nVar2.g();
            return tVarG == null ? p068g8.s.b(rVar, nVar2.d(), eVar) : tVarG;
        }
    }

    /* JADX INFO: renamed from: g8.b$c */
    private enum c {
        PROPERTY,
        BACKING_FIELD,
        DELEGATE_FIELD;


        /* JADX INFO: renamed from: G, reason: collision with root package name */
        private static final /* synthetic */ p157p7.a f45634G = p157p7.b.a(e());
    }

    /* JADX INFO: renamed from: g8.b$d */
    public /* synthetic */ class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f45635a;

        static {
            int[] iArr = new int[B8.EnumC0821b.values().length];
            try {
                iArr[B8.EnumC0821b.PROPERTY_GETTER.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[B8.EnumC0821b.PROPERTY_SETTER.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[B8.EnumC0821b.PROPERTY.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            f45635a = iArr;
        }
    }

    /* JADX INFO: renamed from: g8.b$e */
    public static final class e implements g8.t.c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ java.util.ArrayList f45637b;

        e(java.util.ArrayList arrayList) {
            this.f45637b = arrayList;
        }

        @Override // g8.t.c
        public void a() {
        }

        @Override // g8.t.c
        public g8.t.a c(p138n8.b bVar, O7.a0 a0Var) {
            p247y7.AbstractC7350t.f(bVar, "classId");
            p247y7.AbstractC7350t.f(a0Var, "source");
            return p068g8.AbstractC6620b.this.y(bVar, a0Var, this.f45637b);
        }
    }

    public AbstractC6620b(p068g8.r rVar) {
        p247y7.AbstractC7350t.f(rVar, "kotlinClassFinder");
        this.f45629a = rVar;
    }

    private final p068g8.t A(B8.A.a aVar) {
        O7.a0 a0VarC = aVar.c();
        p068g8.v vVar = a0VarC instanceof p068g8.v ? (p068g8.v) a0VarC : null;
        if (vVar != null) {
            return vVar.d();
        }
        return null;
    }

    private final int l(B8.A a6, p158p8.p pVar) {
        if (pVar instanceof p088i8.i) {
            if (!p108k8.f.g((p088i8.i) pVar)) {
                return 0;
            }
        } else if (pVar instanceof p088i8.n) {
            if (!p108k8.f.h((p088i8.n) pVar)) {
                return 0;
            }
        } else {
            if (!(pVar instanceof p088i8.d)) {
                throw new java.lang.UnsupportedOperationException("Unsupported message: " + pVar.getClass());
            }
            p247y7.AbstractC7350t.d(a6, "null cannot be cast to non-null type org.jetbrains.kotlin.serialization.deserialization.ProtoContainer.Class");
            B8.A.a aVar = (B8.A.a) a6;
            if (aVar.g() == p088i8.c.EnumC0572c.ENUM_CLASS) {
                return 2;
            }
            if (!aVar.i()) {
                return 0;
            }
        }
        return 1;
    }

    private final java.util.List m(B8.A a6, p068g8.w wVar, boolean z6, boolean z10, java.lang.Boolean bool, boolean z11) {
        java.util.List list;
        p068g8.t tVarO = o(a6, f45628b.a(a6, z6, z10, bool, z11, this.f45629a, t()));
        return (tVarO == null || (list = (java.util.List) p(tVarO).a().get(wVar)) == null) ? p097j7.AbstractC6879v.m() : list;
    }

    static /* synthetic */ java.util.List n(p068g8.AbstractC6620b abstractC6620b, B8.A a6, p068g8.w wVar, boolean z6, boolean z10, java.lang.Boolean bool, boolean z11, int i6, java.lang.Object obj) {
        if (obj == null) {
            return abstractC6620b.m(a6, wVar, (i6 & 4) != 0 ? false : z6, (i6 & 8) != 0 ? false : z10, (i6 & 16) != 0 ? null : bool, (i6 & 32) != 0 ? false : z11);
        }
        throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: findClassAndLoadMemberAnnotations");
    }

    public static /* synthetic */ p068g8.w s(p068g8.AbstractC6620b abstractC6620b, p158p8.p pVar, p108k8.c cVar, p108k8.g gVar, B8.EnumC0821b enumC0821b, boolean z6, int i6, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getCallableSignature");
        }
        if ((i6 & 16) != 0) {
            z6 = false;
        }
        return abstractC6620b.r(pVar, cVar, gVar, enumC0821b, z6);
    }

    private final java.util.List z(B8.A a6, p088i8.n nVar, p068g8.AbstractC6620b.c cVar) {
        java.lang.Boolean boolD = p108k8.b.f49769B.d(nVar.a0());
        p247y7.AbstractC7350t.e(boolD, "get(...)");
        boolD.booleanValue();
        boolean zF = p128m8.i.f(nVar);
        p068g8.AbstractC6620b.c cVar2 = p068g8.AbstractC6620b.c.PROPERTY;
        p108k8.c cVarB = a6.b();
        p108k8.g gVarD = a6.d();
        if (cVar == cVar2) {
            p068g8.w wVarB = p068g8.AbstractC6621c.b(nVar, cVarB, gVarD, false, true, false, 40, null);
            return wVarB == null ? p097j7.AbstractC6879v.m() : n(this, a6, wVarB, true, false, boolD, zF, 8, null);
        }
        p068g8.w wVarB2 = p068g8.AbstractC6621c.b(nVar, cVarB, gVarD, true, false, false, 48, null);
        if (wVarB2 == null) {
            return p097j7.AbstractC6879v.m();
        }
        return S8.r.c0(wVarB2.a(), "$delegate", false, 2, null) != (cVar == p068g8.AbstractC6620b.c.DELEGATE_FIELD) ? p097j7.AbstractC6879v.m() : m(a6, wVarB2, true, true, boolD, zF);
    }

    @Override // B8.InterfaceC0825f
    public java.util.List a(p088i8.s sVar, p108k8.c cVar) {
        p247y7.AbstractC7350t.f(sVar, "proto");
        p247y7.AbstractC7350t.f(cVar, "nameResolver");
        java.lang.Object objU = sVar.u(p118l8.a.f50079h);
        p247y7.AbstractC7350t.e(objU, "getExtension(...)");
        java.lang.Iterable<p088i8.b> iterable = (java.lang.Iterable) objU;
        java.util.ArrayList arrayList = new java.util.ArrayList(p097j7.AbstractC6879v.x(iterable, 10));
        for (p088i8.b bVar : iterable) {
            p247y7.AbstractC7350t.c(bVar);
            arrayList.add(x(bVar, cVar));
        }
        return arrayList;
    }

    @Override // B8.InterfaceC0825f
    public java.util.List b(B8.A a6, p158p8.p pVar, B8.EnumC0821b enumC0821b, int i6, p088i8.u uVar) {
        p247y7.AbstractC7350t.f(a6, "container");
        p247y7.AbstractC7350t.f(pVar, "callableProto");
        p247y7.AbstractC7350t.f(enumC0821b, "kind");
        p247y7.AbstractC7350t.f(uVar, "proto");
        p068g8.w wVarS = s(this, pVar, a6.b(), a6.d(), enumC0821b, false, 16, null);
        if (wVarS == null) {
            return p097j7.AbstractC6879v.m();
        }
        return n(this, a6, p068g8.w.f45708b.e(wVarS, i6 + l(a6, pVar)), false, false, null, false, 60, null);
    }

    @Override // B8.InterfaceC0825f
    public java.util.List c(B8.A a6, p088i8.g gVar) {
        p247y7.AbstractC7350t.f(a6, "container");
        p247y7.AbstractC7350t.f(gVar, "proto");
        g8.w.a aVar = p068g8.w.f45708b;
        java.lang.String string = a6.b().getString(gVar.F());
        java.lang.String strC = ((B8.A.a) a6).e().c();
        p247y7.AbstractC7350t.e(strC, "asString(...)");
        return n(this, a6, aVar.a(string, p128m8.b.b(strC)), false, false, null, false, 60, null);
    }

    @Override // B8.InterfaceC0825f
    public java.util.List d(B8.A a6, p088i8.n nVar) {
        p247y7.AbstractC7350t.f(a6, "container");
        p247y7.AbstractC7350t.f(nVar, "proto");
        return z(a6, nVar, p068g8.AbstractC6620b.c.BACKING_FIELD);
    }

    @Override // B8.InterfaceC0825f
    public java.util.List f(B8.A a6, p088i8.n nVar) {
        p247y7.AbstractC7350t.f(a6, "container");
        p247y7.AbstractC7350t.f(nVar, "proto");
        return z(a6, nVar, p068g8.AbstractC6620b.c.DELEGATE_FIELD);
    }

    @Override // B8.InterfaceC0825f
    public java.util.List g(p088i8.q qVar, p108k8.c cVar) {
        p247y7.AbstractC7350t.f(qVar, "proto");
        p247y7.AbstractC7350t.f(cVar, "nameResolver");
        java.lang.Object objU = qVar.u(p118l8.a.f50077f);
        p247y7.AbstractC7350t.e(objU, "getExtension(...)");
        java.lang.Iterable<p088i8.b> iterable = (java.lang.Iterable) objU;
        java.util.ArrayList arrayList = new java.util.ArrayList(p097j7.AbstractC6879v.x(iterable, 10));
        for (p088i8.b bVar : iterable) {
            p247y7.AbstractC7350t.c(bVar);
            arrayList.add(x(bVar, cVar));
        }
        return arrayList;
    }

    @Override // B8.InterfaceC0825f
    public java.util.List h(B8.A.a aVar) {
        p247y7.AbstractC7350t.f(aVar, "container");
        p068g8.t tVarA = A(aVar);
        if (tVarA != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList(1);
            tVarA.d(new p068g8.AbstractC6620b.e(arrayList), q(tVarA));
            return arrayList;
        }
        throw new java.lang.IllegalStateException(("Class for loading annotations is not found: " + aVar.a()).toString());
    }

    @Override // B8.InterfaceC0825f
    public java.util.List i(B8.A a6, p158p8.p pVar, B8.EnumC0821b enumC0821b) {
        p247y7.AbstractC7350t.f(a6, "container");
        p247y7.AbstractC7350t.f(pVar, "proto");
        p247y7.AbstractC7350t.f(enumC0821b, "kind");
        if (enumC0821b == B8.EnumC0821b.PROPERTY) {
            return z(a6, (p088i8.n) pVar, p068g8.AbstractC6620b.c.PROPERTY);
        }
        p068g8.w wVarS = s(this, pVar, a6.b(), a6.d(), enumC0821b, false, 16, null);
        return wVarS == null ? p097j7.AbstractC6879v.m() : n(this, a6, wVarS, false, false, null, false, 60, null);
    }

    @Override // B8.InterfaceC0825f
    public java.util.List j(B8.A a6, p158p8.p pVar, B8.EnumC0821b enumC0821b) {
        p247y7.AbstractC7350t.f(a6, "container");
        p247y7.AbstractC7350t.f(pVar, "proto");
        p247y7.AbstractC7350t.f(enumC0821b, "kind");
        p068g8.w wVarS = s(this, pVar, a6.b(), a6.d(), enumC0821b, false, 16, null);
        return wVarS != null ? n(this, a6, p068g8.w.f45708b.e(wVarS, 0), false, false, null, false, 60, null) : p097j7.AbstractC6879v.m();
    }

    protected final p068g8.t o(B8.A a6, p068g8.t tVar) {
        p247y7.AbstractC7350t.f(a6, "container");
        if (tVar != null) {
            return tVar;
        }
        if (a6 instanceof B8.A.a) {
            return A((B8.A.a) a6);
        }
        return null;
    }

    protected abstract p068g8.AbstractC6620b.a p(p068g8.t tVar);

    protected byte[] q(p068g8.t tVar) {
        p247y7.AbstractC7350t.f(tVar, "kotlinClass");
        return null;
    }

    protected final p068g8.w r(p158p8.p pVar, p108k8.c cVar, p108k8.g gVar, B8.EnumC0821b enumC0821b, boolean z6) {
        g8.w.a aVar;
        l8.a.c cVarB;
        java.lang.String str;
        g8.w.a aVar2;
        m8.d.b bVarE;
        p247y7.AbstractC7350t.f(pVar, "proto");
        p247y7.AbstractC7350t.f(cVar, "nameResolver");
        p247y7.AbstractC7350t.f(gVar, "typeTable");
        p247y7.AbstractC7350t.f(enumC0821b, "kind");
        if (pVar instanceof p088i8.d) {
            aVar2 = p068g8.w.f45708b;
            bVarE = p128m8.i.f51228a.b((p088i8.d) pVar, cVar, gVar);
            if (bVarE == null) {
                return null;
            }
        } else {
            if (!(pVar instanceof p088i8.i)) {
                if (!(pVar instanceof p088i8.n)) {
                    return null;
                }
                p8.i.f fVar = p118l8.a.f50075d;
                p247y7.AbstractC7350t.e(fVar, "propertySignature");
                l8.a.d dVar = (l8.a.d) p108k8.e.a((p8.i.d) pVar, fVar);
                if (dVar == null) {
                    return null;
                }
                int i6 = p068g8.AbstractC6620b.d.f45635a[enumC0821b.ordinal()];
                if (i6 != 1) {
                    if (i6 != 2) {
                        if (i6 != 3) {
                            return null;
                        }
                        return p068g8.AbstractC6621c.a((p088i8.n) pVar, cVar, gVar, true, true, z6);
                    }
                    if (!dVar.H()) {
                        return null;
                    }
                    aVar = p068g8.w.f45708b;
                    cVarB = dVar.C();
                    str = "getSetter(...)";
                } else {
                    if (!dVar.G()) {
                        return null;
                    }
                    aVar = p068g8.w.f45708b;
                    cVarB = dVar.B();
                    str = "getGetter(...)";
                }
                p247y7.AbstractC7350t.e(cVarB, str);
                return aVar.c(cVar, cVarB);
            }
            aVar2 = p068g8.w.f45708b;
            bVarE = p128m8.i.f51228a.e((p088i8.i) pVar, cVar, gVar);
            if (bVarE == null) {
                return null;
            }
        }
        return aVar2.b(bVarE);
    }

    public abstract p128m8.e t();

    protected final p068g8.r u() {
        return this.f45629a;
    }

    protected final boolean v(p138n8.b bVar) {
        p068g8.t tVarB;
        p247y7.AbstractC7350t.f(bVar, "classId");
        return bVar.g() != null && p247y7.AbstractC7350t.b(bVar.j().g(), "Container") && (tVarB = p068g8.s.b(this.f45629a, bVar, t())) != null && K7.a.f6152a.c(tVarB);
    }

    protected abstract g8.t.a w(p138n8.b bVar, O7.a0 a0Var, java.util.List list);

    public abstract java.lang.Object x(p088i8.b bVar, p108k8.c cVar);

    protected final g8.t.a y(p138n8.b bVar, O7.a0 a0Var, java.util.List list) {
        p247y7.AbstractC7350t.f(bVar, "annotationClassId");
        p247y7.AbstractC7350t.f(a0Var, "source");
        p247y7.AbstractC7350t.f(list, "result");
        if (K7.a.f6152a.b().contains(bVar)) {
            return null;
        }
        return w(bVar, a0Var, list);
    }
}
