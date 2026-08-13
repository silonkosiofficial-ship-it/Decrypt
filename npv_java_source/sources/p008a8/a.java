package p008a8;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a {

    /* JADX INFO: renamed from: a8.a$a, reason: collision with other inner class name */
    static final class C0327a extends p247y7.AbstractC7352v implements p237x7.a {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ p008a8.g f17096D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ O7.InterfaceC1426g f17097E;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0327a(p008a8.g gVar, O7.InterfaceC1426g interfaceC1426g) {
            super(0);
            this.f17096D = gVar;
            this.f17097E = interfaceC1426g;
        }

        @Override // p237x7.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final X7.y b() {
            return p008a8.a.g(this.f17096D, this.f17097E.k());
        }
    }

    static final class b extends p247y7.AbstractC7352v implements p237x7.a {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ p008a8.g f17098D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ P7.g f17099E;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(p008a8.g gVar, P7.g gVar2) {
            super(0);
            this.f17098D = gVar;
            this.f17099E = gVar2;
        }

        @Override // p237x7.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final X7.y b() {
            return p008a8.a.g(this.f17098D, this.f17099E);
        }
    }

    private static final p008a8.g a(p008a8.g gVar, O7.InterfaceC1432m interfaceC1432m, p048e8.z zVar, int i6, p087i7.InterfaceC6668n interfaceC6668n) {
        return new p008a8.g(gVar.a(), zVar != null ? new p008a8.h(gVar, interfaceC1432m, zVar, i6) : gVar.f(), interfaceC6668n);
    }

    public static final p008a8.g b(p008a8.g gVar, p008a8.k kVar) {
        p247y7.AbstractC7350t.f(gVar, "<this>");
        p247y7.AbstractC7350t.f(kVar, "typeParameterResolver");
        return new p008a8.g(gVar.a(), kVar, gVar.c());
    }

    public static final p008a8.g c(p008a8.g gVar, O7.InterfaceC1426g interfaceC1426g, p048e8.z zVar, int i6) {
        p247y7.AbstractC7350t.f(gVar, "<this>");
        p247y7.AbstractC7350t.f(interfaceC1426g, "containingDeclaration");
        return a(gVar, interfaceC1426g, zVar, i6, p087i7.AbstractC6669o.a(p087i7.r.NONE, new p008a8.a.C0327a(gVar, interfaceC1426g)));
    }

    public static /* synthetic */ p008a8.g d(p008a8.g gVar, O7.InterfaceC1426g interfaceC1426g, p048e8.z zVar, int i6, int i10, java.lang.Object obj) {
        if ((i10 & 2) != 0) {
            zVar = null;
        }
        if ((i10 & 4) != 0) {
            i6 = 0;
        }
        return c(gVar, interfaceC1426g, zVar, i6);
    }

    public static final p008a8.g e(p008a8.g gVar, O7.InterfaceC1432m interfaceC1432m, p048e8.z zVar, int i6) {
        p247y7.AbstractC7350t.f(gVar, "<this>");
        p247y7.AbstractC7350t.f(interfaceC1432m, "containingDeclaration");
        p247y7.AbstractC7350t.f(zVar, "typeParameterOwner");
        return a(gVar, interfaceC1432m, zVar, i6, gVar.c());
    }

    public static /* synthetic */ p008a8.g f(p008a8.g gVar, O7.InterfaceC1432m interfaceC1432m, p048e8.z zVar, int i6, int i10, java.lang.Object obj) {
        if ((i10 & 4) != 0) {
            i6 = 0;
        }
        return e(gVar, interfaceC1432m, zVar, i6);
    }

    public static final X7.y g(p008a8.g gVar, P7.g gVar2) {
        p247y7.AbstractC7350t.f(gVar, "<this>");
        p247y7.AbstractC7350t.f(gVar2, "additionalAnnotations");
        return gVar.a().a().c(gVar.b(), gVar2);
    }

    public static final p008a8.g h(p008a8.g gVar, P7.g gVar2) {
        p247y7.AbstractC7350t.f(gVar, "<this>");
        p247y7.AbstractC7350t.f(gVar2, "additionalAnnotations");
        return gVar2.isEmpty() ? gVar : new p008a8.g(gVar.a(), gVar.f(), p087i7.AbstractC6669o.a(p087i7.r.NONE, new a8.a.b(gVar, gVar2)));
    }

    public static final p008a8.g i(p008a8.g gVar, p008a8.b bVar) {
        p247y7.AbstractC7350t.f(gVar, "<this>");
        p247y7.AbstractC7350t.f(bVar, "components");
        return new p008a8.g(bVar, gVar.f(), gVar.c());
    }
}
