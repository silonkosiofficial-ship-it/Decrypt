package p018b8;

/* JADX INFO: loaded from: classes2.dex */
public final class n extends R7.AbstractC1496b {

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private final p008a8.g f24326M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private final p048e8.y f24327N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(p008a8.g gVar, p048e8.y yVar, int i6, O7.InterfaceC1432m interfaceC1432m) {
        super(gVar.e(), interfaceC1432m, new p008a8.d(gVar, yVar, false, 4, null), yVar.getName(), F8.u0.INVARIANT, false, i6, O7.a0.f8143a, gVar.a().v());
        p247y7.AbstractC7350t.f(gVar, "c");
        p247y7.AbstractC7350t.f(yVar, "javaTypeParameter");
        p247y7.AbstractC7350t.f(interfaceC1432m, "containingDeclaration");
        this.f24326M = gVar;
        this.f24327N = yVar;
    }

    private final java.util.List V0() {
        java.util.Collection upperBounds = this.f24327N.getUpperBounds();
        if (upperBounds.isEmpty()) {
            F8.M mI = this.f24326M.d().t().i();
            p247y7.AbstractC7350t.e(mI, "getAnyType(...)");
            F8.M mI2 = this.f24326M.d().t().I();
            p247y7.AbstractC7350t.e(mI2, "getNullableAnyType(...)");
            return p097j7.AbstractC6879v.e(F8.F.d(mI, mI2));
        }
        java.util.Collection collection = upperBounds;
        java.util.ArrayList arrayList = new java.util.ArrayList(p097j7.AbstractC6879v.x(collection, 10));
        java.util.Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f24326M.g().o((p048e8.j) it.next(), p028c8.b.b(F8.p0.COMMON, false, false, this, 3, null)));
        }
        return arrayList;
    }

    @Override // R7.AbstractC1499e
    protected java.util.List O0(java.util.List list) {
        p247y7.AbstractC7350t.f(list, "bounds");
        return this.f24326M.a().r().i(this, list, this.f24326M);
    }

    @Override // R7.AbstractC1499e
    protected void T0(F8.E e6) {
        p247y7.AbstractC7350t.f(e6, "type");
    }

    @Override // R7.AbstractC1499e
    protected java.util.List U0() {
        return V0();
    }
}
