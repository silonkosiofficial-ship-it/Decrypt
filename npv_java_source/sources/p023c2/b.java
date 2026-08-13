package p023c2;

/* JADX INFO: loaded from: classes.dex */
public final class b implements androidx.lifecycle.V.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p023c2.f[] f24406a;

    public b(p023c2.f... fVarArr) {
        p247y7.AbstractC7350t.f(fVarArr, "initializers");
        this.f24406a = fVarArr;
    }

    @Override // androidx.lifecycle.V.c
    public /* synthetic */ androidx.lifecycle.T a(java.lang.Class cls) {
        return androidx.lifecycle.W.b(this, cls);
    }

    @Override // androidx.lifecycle.V.c
    public /* synthetic */ androidx.lifecycle.T b(F7.c cVar, p023c2.a aVar) {
        return androidx.lifecycle.W.a(this, cVar, aVar);
    }

    @Override // androidx.lifecycle.V.c
    public androidx.lifecycle.T c(java.lang.Class cls, p023c2.a aVar) {
        p247y7.AbstractC7350t.f(cls, "modelClass");
        p247y7.AbstractC7350t.f(aVar, "extras");
        p043e2.g gVar = p043e2.g.f44643a;
        F7.c cVarE = p227w7.a.e(cls);
        p023c2.f[] fVarArr = this.f24406a;
        return gVar.b(cVarE, aVar, (p023c2.f[]) java.util.Arrays.copyOf(fVarArr, fVarArr.length));
    }
}
