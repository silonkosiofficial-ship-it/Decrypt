package p228w8;

/* JADX INFO: loaded from: classes2.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p008a8.f f56267a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Y7.g f56268b;

    public c(p008a8.f fVar, Y7.g gVar) {
        p247y7.AbstractC7350t.f(fVar, "packageFragmentProvider");
        p247y7.AbstractC7350t.f(gVar, "javaResolverCache");
        this.f56267a = fVar;
        this.f56268b = gVar;
    }

    public final p008a8.f a() {
        return this.f56267a;
    }

    public final O7.InterfaceC1424e b(p048e8.g gVar) {
        p247y7.AbstractC7350t.f(gVar, "javaClass");
        p138n8.c cVarE = gVar.e();
        if (cVarE != null && gVar.O() == p048e8.D.SOURCE) {
            return this.f56268b.c(cVarE);
        }
        p048e8.g gVarF = gVar.f();
        if (gVarF != null) {
            O7.InterfaceC1424e interfaceC1424eB = b(gVarF);
            p248y8.h hVarH0 = interfaceC1424eB != null ? interfaceC1424eB.H0() : null;
            O7.InterfaceC1427h interfaceC1427hG = hVarH0 != null ? hVarH0.g(gVar.getName(), W7.d.FROM_JAVA_LOADER) : null;
            if (interfaceC1427hG instanceof O7.InterfaceC1424e) {
                return (O7.InterfaceC1424e) interfaceC1427hG;
            }
            return null;
        }
        if (cVarE == null) {
            return null;
        }
        p008a8.f fVar = this.f56267a;
        p138n8.c cVarE2 = cVarE.e();
        p247y7.AbstractC7350t.e(cVarE2, "parent(...)");
        p018b8.h hVar = (p018b8.h) p097j7.AbstractC6879v.k0(fVar.b(cVarE2));
        if (hVar != null) {
            return hVar.V0(gVar);
        }
        return null;
    }
}
