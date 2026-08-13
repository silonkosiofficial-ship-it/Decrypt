package B8;

/* JADX INFO: loaded from: classes2.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final B8.k f902a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p108k8.c f903b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final O7.InterfaceC1432m f904c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final p108k8.g f905d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final p108k8.h f906e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final p108k8.a f907f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final D8.f f908g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final B8.E f909h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final B8.x f910i;

    public m(B8.k kVar, p108k8.c cVar, O7.InterfaceC1432m interfaceC1432m, p108k8.g gVar, p108k8.h hVar, p108k8.a aVar, D8.f fVar, B8.E e6, java.util.List list) {
        java.lang.String strC;
        p247y7.AbstractC7350t.f(kVar, "components");
        p247y7.AbstractC7350t.f(cVar, "nameResolver");
        p247y7.AbstractC7350t.f(interfaceC1432m, "containingDeclaration");
        p247y7.AbstractC7350t.f(gVar, "typeTable");
        p247y7.AbstractC7350t.f(hVar, "versionRequirementTable");
        p247y7.AbstractC7350t.f(aVar, "metadataVersion");
        p247y7.AbstractC7350t.f(list, "typeParameters");
        this.f902a = kVar;
        this.f903b = cVar;
        this.f904c = interfaceC1432m;
        this.f905d = gVar;
        this.f906e = hVar;
        this.f907f = aVar;
        this.f908g = fVar;
        this.f909h = new B8.E(this, e6, list, "Deserializer for \"" + interfaceC1432m.getName() + '\"', (fVar == null || (strC = fVar.c()) == null) ? "[container not found]" : strC);
        this.f910i = new B8.x(this);
    }

    public static /* synthetic */ B8.m b(B8.m mVar, O7.InterfaceC1432m interfaceC1432m, java.util.List list, p108k8.c cVar, p108k8.g gVar, p108k8.h hVar, p108k8.a aVar, int i6, java.lang.Object obj) {
        if ((i6 & 4) != 0) {
            cVar = mVar.f903b;
        }
        p108k8.c cVar2 = cVar;
        if ((i6 & 8) != 0) {
            gVar = mVar.f905d;
        }
        p108k8.g gVar2 = gVar;
        if ((i6 & 16) != 0) {
            hVar = mVar.f906e;
        }
        p108k8.h hVar2 = hVar;
        if ((i6 & 32) != 0) {
            aVar = mVar.f907f;
        }
        return mVar.a(interfaceC1432m, list, cVar2, gVar2, hVar2, aVar);
    }

    public final B8.m a(O7.InterfaceC1432m interfaceC1432m, java.util.List list, p108k8.c cVar, p108k8.g gVar, p108k8.h hVar, p108k8.a aVar) {
        p247y7.AbstractC7350t.f(interfaceC1432m, "descriptor");
        p247y7.AbstractC7350t.f(list, "typeParameterProtos");
        p247y7.AbstractC7350t.f(cVar, "nameResolver");
        p247y7.AbstractC7350t.f(gVar, "typeTable");
        p108k8.h hVar2 = hVar;
        p247y7.AbstractC7350t.f(hVar2, "versionRequirementTable");
        p247y7.AbstractC7350t.f(aVar, "metadataVersion");
        B8.k kVar = this.f902a;
        if (!p108k8.i.b(aVar)) {
            hVar2 = this.f906e;
        }
        return new B8.m(kVar, cVar, interfaceC1432m, gVar, hVar2, aVar, this.f908g, this.f909h, list);
    }

    public final B8.k c() {
        return this.f902a;
    }

    public final D8.f d() {
        return this.f908g;
    }

    public final O7.InterfaceC1432m e() {
        return this.f904c;
    }

    public final B8.x f() {
        return this.f910i;
    }

    public final p108k8.c g() {
        return this.f903b;
    }

    public final E8.n h() {
        return this.f902a.u();
    }

    public final B8.E i() {
        return this.f909h;
    }

    public final p108k8.g j() {
        return this.f905d;
    }

    public final p108k8.h k() {
        return this.f906e;
    }
}
