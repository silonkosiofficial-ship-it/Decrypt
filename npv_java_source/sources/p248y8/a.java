package p248y8;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a implements p248y8.h {
    @Override // p248y8.h
    public java.util.Set a() {
        return i().a();
    }

    @Override // p248y8.h
    public java.util.Collection b(p138n8.f fVar, W7.b bVar) {
        p247y7.AbstractC7350t.f(fVar, "name");
        p247y7.AbstractC7350t.f(bVar, "location");
        return i().b(fVar, bVar);
    }

    @Override // p248y8.h
    public java.util.Collection c(p138n8.f fVar, W7.b bVar) {
        p247y7.AbstractC7350t.f(fVar, "name");
        p247y7.AbstractC7350t.f(bVar, "location");
        return i().c(fVar, bVar);
    }

    @Override // p248y8.h
    public java.util.Set d() {
        return i().d();
    }

    @Override // p248y8.k
    public java.util.Collection e(p248y8.d dVar, p237x7.l lVar) {
        p247y7.AbstractC7350t.f(dVar, "kindFilter");
        p247y7.AbstractC7350t.f(lVar, "nameFilter");
        return i().e(dVar, lVar);
    }

    @Override // p248y8.h
    public java.util.Set f() {
        return i().f();
    }

    @Override // p248y8.k
    public O7.InterfaceC1427h g(p138n8.f fVar, W7.b bVar) {
        p247y7.AbstractC7350t.f(fVar, "name");
        p247y7.AbstractC7350t.f(bVar, "location");
        return i().g(fVar, bVar);
    }

    public final p248y8.h h() {
        if (!(i() instanceof p248y8.a)) {
            return i();
        }
        p248y8.h hVarI = i();
        p247y7.AbstractC7350t.d(hVarI, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.scopes.AbstractScopeAdapter");
        return ((p248y8.a) hVarI).h();
    }

    protected abstract p248y8.h i();
}
