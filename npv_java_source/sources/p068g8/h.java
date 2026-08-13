package p068g8;

/* JADX INFO: loaded from: classes2.dex */
public final class h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final g8.h.a f45665b = new g8.h.a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final B8.k f45666a;

    public static final class a {

        /* JADX INFO: renamed from: g8.h$a$a, reason: collision with other inner class name */
        public static final class C0521a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final p068g8.h f45667a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final p068g8.j f45668b;

            public C0521a(p068g8.h hVar, p068g8.j jVar) {
                p247y7.AbstractC7350t.f(hVar, "deserializationComponentsForJava");
                p247y7.AbstractC7350t.f(jVar, "deserializedDescriptorResolver");
                this.f45667a = hVar;
                this.f45668b = jVar;
            }

            public final p068g8.h a() {
                return this.f45667a;
            }

            public final p068g8.j b() {
                return this.f45668b;
            }
        }

        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        public final g8.h.a.C0521a a(p068g8.r rVar, p068g8.r rVar2, X7.p pVar, java.lang.String str, B8.r rVar3, p038d8.b bVar) {
            p247y7.AbstractC7350t.f(rVar, "kotlinClassFinder");
            p247y7.AbstractC7350t.f(rVar2, "jvmBuiltInsKotlinClassFinder");
            p247y7.AbstractC7350t.f(pVar, "javaClassFinder");
            p247y7.AbstractC7350t.f(str, "moduleName");
            p247y7.AbstractC7350t.f(rVar3, "errorReporter");
            p247y7.AbstractC7350t.f(bVar, "javaSourceElementFactory");
            E8.f fVar = new E8.f("DeserializationComponentsForJava.ModuleData");
            N7.f fVar2 = new N7.f(fVar, N7.f.a.FROM_DEPENDENCIES);
            p138n8.f fVarS = p138n8.f.s('<' + str + '>');
            p247y7.AbstractC7350t.e(fVarS, "special(...)");
            R7.x xVar = new R7.x(fVarS, fVar, fVar2, null, null, null, 56, null);
            fVar2.E0(xVar);
            fVar2.J0(xVar, true);
            p068g8.j jVar = new p068g8.j();
            p008a8.j jVar2 = new p008a8.j();
            O7.J j6 = new O7.J(fVar, xVar);
            p008a8.f fVarB = p068g8.i.b(pVar, xVar, fVar, j6, rVar, jVar, rVar3, bVar, jVar2, (512 & 512) != 0 ? g8.z.a.f45710a : null);
            p068g8.h hVarA = p068g8.i.a(xVar, fVar, j6, fVarB, rVar, jVar, rVar3, p128m8.e.f51215i);
            jVar.n(hVarA);
            Y7.g gVar = Y7.g.f16481a;
            p247y7.AbstractC7350t.e(gVar, "EMPTY");
            p228w8.c cVar = new p228w8.c(fVarB, gVar);
            jVar2.c(cVar);
            N7.k kVar = new N7.k(fVar, rVar2, xVar, j6, fVar2.I0(), fVar2.I0(), B8.l.a.f901a, G8.l.f3154b.a(), new p238x8.b(fVar, p097j7.AbstractC6879v.m()));
            xVar.h1(xVar);
            xVar.b1(new R7.C1503i(p097j7.AbstractC6879v.p(cVar.a(), kVar), "CompositeProvider@RuntimeModuleData for " + xVar));
            return new g8.h.a.C0521a(hVarA, jVar);
        }
    }

    public h(E8.n nVar, O7.G g6, B8.l lVar, p068g8.k kVar, p068g8.C6623e c6623e, p008a8.f fVar, O7.J j6, B8.r rVar, W7.c cVar, B8.j jVar, G8.l lVar2, I8.a aVar) {
        Q7.c cVarI0;
        Q7.a aVarI0;
        p247y7.AbstractC7350t.f(nVar, "storageManager");
        p247y7.AbstractC7350t.f(g6, "moduleDescriptor");
        p247y7.AbstractC7350t.f(lVar, "configuration");
        p247y7.AbstractC7350t.f(kVar, "classDataFinder");
        p247y7.AbstractC7350t.f(c6623e, "annotationAndConstantLoader");
        p247y7.AbstractC7350t.f(fVar, "packageFragmentProvider");
        p247y7.AbstractC7350t.f(j6, "notFoundClasses");
        p247y7.AbstractC7350t.f(rVar, "errorReporter");
        p247y7.AbstractC7350t.f(cVar, "lookupTracker");
        p247y7.AbstractC7350t.f(jVar, "contractDeserializer");
        p247y7.AbstractC7350t.f(lVar2, "kotlinTypeChecker");
        p247y7.AbstractC7350t.f(aVar, "typeAttributeTranslators");
        L7.g gVarT = g6.t();
        N7.f fVar2 = gVarT instanceof N7.f ? (N7.f) gVarT : null;
        this.f45666a = new B8.k(nVar, g6, lVar, kVar, c6623e, fVar, B8.w.a.f931a, rVar, cVar, p068g8.l.f45679a, p097j7.AbstractC6879v.m(), j6, jVar, (fVar2 == null || (aVarI0 = fVar2.I0()) == null) ? Q7.a.C0209a.f9114a : aVarI0, (fVar2 == null || (cVarI0 = fVar2.I0()) == null) ? Q7.c.b.f9116a : cVarI0, p128m8.i.f51228a.a(), lVar2, new p238x8.b(nVar, p097j7.AbstractC6879v.m()), aVar.a(), B8.u.f930a);
    }

    public final B8.k a() {
        return this.f45666a;
    }
}
