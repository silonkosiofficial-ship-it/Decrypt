package B8;

/* JADX INFO: loaded from: classes2.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final E8.n f880a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final O7.G f881b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final B8.l f882c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final B8.h f883d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final B8.InterfaceC0822c f884e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final O7.L f885f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final B8.w f886g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final B8.r f887h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final W7.c f888i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final B8.s f889j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final java.lang.Iterable f890k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final O7.J f891l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final B8.j f892m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Q7.a f893n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Q7.c f894o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final p158p8.g f895p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final G8.l f896q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final p238x8.a f897r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final java.util.List f898s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final B8.q f899t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final B8.i f900u;

    public k(E8.n nVar, O7.G g6, B8.l lVar, B8.h hVar, B8.InterfaceC0822c interfaceC0822c, O7.L l6, B8.w wVar, B8.r rVar, W7.c cVar, B8.s sVar, java.lang.Iterable iterable, O7.J j6, B8.j jVar, Q7.a aVar, Q7.c cVar2, p158p8.g gVar, G8.l lVar2, p238x8.a aVar2, java.util.List list, B8.q qVar) {
        p247y7.AbstractC7350t.f(nVar, "storageManager");
        p247y7.AbstractC7350t.f(g6, "moduleDescriptor");
        p247y7.AbstractC7350t.f(lVar, "configuration");
        p247y7.AbstractC7350t.f(hVar, "classDataFinder");
        p247y7.AbstractC7350t.f(interfaceC0822c, "annotationAndConstantLoader");
        p247y7.AbstractC7350t.f(l6, "packageFragmentProvider");
        p247y7.AbstractC7350t.f(wVar, "localClassifierTypeSettings");
        p247y7.AbstractC7350t.f(rVar, "errorReporter");
        p247y7.AbstractC7350t.f(cVar, "lookupTracker");
        p247y7.AbstractC7350t.f(sVar, "flexibleTypeDeserializer");
        p247y7.AbstractC7350t.f(iterable, "fictitiousClassDescriptorFactories");
        p247y7.AbstractC7350t.f(j6, "notFoundClasses");
        p247y7.AbstractC7350t.f(jVar, "contractDeserializer");
        p247y7.AbstractC7350t.f(aVar, "additionalClassPartsProvider");
        p247y7.AbstractC7350t.f(cVar2, "platformDependentDeclarationFilter");
        p247y7.AbstractC7350t.f(gVar, "extensionRegistryLite");
        p247y7.AbstractC7350t.f(lVar2, "kotlinTypeChecker");
        p247y7.AbstractC7350t.f(aVar2, "samConversionResolver");
        p247y7.AbstractC7350t.f(list, "typeAttributeTranslators");
        p247y7.AbstractC7350t.f(qVar, "enumEntriesDeserializationSupport");
        this.f880a = nVar;
        this.f881b = g6;
        this.f882c = lVar;
        this.f883d = hVar;
        this.f884e = interfaceC0822c;
        this.f885f = l6;
        this.f886g = wVar;
        this.f887h = rVar;
        this.f888i = cVar;
        this.f889j = sVar;
        this.f890k = iterable;
        this.f891l = j6;
        this.f892m = jVar;
        this.f893n = aVar;
        this.f894o = cVar2;
        this.f895p = gVar;
        this.f896q = lVar2;
        this.f897r = aVar2;
        this.f898s = list;
        this.f899t = qVar;
        this.f900u = new B8.i(this);
    }

    public /* synthetic */ k(E8.n nVar, O7.G g6, B8.l lVar, B8.h hVar, B8.InterfaceC0822c interfaceC0822c, O7.L l6, B8.w wVar, B8.r rVar, W7.c cVar, B8.s sVar, java.lang.Iterable iterable, O7.J j6, B8.j jVar, Q7.a aVar, Q7.c cVar2, p158p8.g gVar, G8.l lVar2, p238x8.a aVar2, java.util.List list, B8.q qVar, int i6, p247y7.AbstractC7342k abstractC7342k) {
        this(nVar, g6, lVar, hVar, interfaceC0822c, l6, wVar, rVar, cVar, sVar, iterable, j6, jVar, (i6 & 8192) != 0 ? Q7.a.C0209a.f9114a : aVar, (i6 & 16384) != 0 ? Q7.c.a.f9115a : cVar2, gVar, (65536 & i6) != 0 ? G8.l.f3154b.a() : lVar2, aVar2, (262144 & i6) != 0 ? p097j7.AbstractC6879v.e(F8.C0953n.f2950a) : list, (i6 & 524288) != 0 ? B8.q.a.f921a : qVar);
    }

    public final B8.m a(O7.K k6, p108k8.c cVar, p108k8.g gVar, p108k8.h hVar, p108k8.a aVar, D8.f fVar) {
        p247y7.AbstractC7350t.f(k6, "descriptor");
        p247y7.AbstractC7350t.f(cVar, "nameResolver");
        p247y7.AbstractC7350t.f(gVar, "typeTable");
        p247y7.AbstractC7350t.f(hVar, "versionRequirementTable");
        p247y7.AbstractC7350t.f(aVar, "metadataVersion");
        return new B8.m(this, cVar, k6, gVar, hVar, aVar, fVar, null, p097j7.AbstractC6879v.m());
    }

    public final O7.InterfaceC1424e b(p138n8.b bVar) {
        p247y7.AbstractC7350t.f(bVar, "classId");
        return B8.i.e(this.f900u, bVar, null, 2, null);
    }

    public final Q7.a c() {
        return this.f893n;
    }

    public final B8.InterfaceC0822c d() {
        return this.f884e;
    }

    public final B8.h e() {
        return this.f883d;
    }

    public final B8.i f() {
        return this.f900u;
    }

    public final B8.l g() {
        return this.f882c;
    }

    public final B8.j h() {
        return this.f892m;
    }

    public final B8.q i() {
        return this.f899t;
    }

    public final B8.r j() {
        return this.f887h;
    }

    public final p158p8.g k() {
        return this.f895p;
    }

    public final java.lang.Iterable l() {
        return this.f890k;
    }

    public final B8.s m() {
        return this.f889j;
    }

    public final G8.l n() {
        return this.f896q;
    }

    public final B8.w o() {
        return this.f886g;
    }

    public final W7.c p() {
        return this.f888i;
    }

    public final O7.G q() {
        return this.f881b;
    }

    public final O7.J r() {
        return this.f891l;
    }

    public final O7.L s() {
        return this.f885f;
    }

    public final Q7.c t() {
        return this.f894o;
    }

    public final E8.n u() {
        return this.f880a;
    }

    public final java.util.List v() {
        return this.f898s;
    }
}
