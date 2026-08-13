package p239x9;

/* JADX INFO: renamed from: x9.p0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC7321p0 extends p239x9.AbstractC7318o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p219v9.f f57028b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC7321p0(p199t9.b bVar) {
        super(bVar, null);
        p247y7.AbstractC7350t.f(bVar, "primitiveSerializer");
        this.f57028b = new p239x9.C7319o0(bVar.a());
    }

    @Override // p239x9.AbstractC7318o, p199t9.b, p199t9.e, p199t9.a
    public final p219v9.f a() {
        return this.f57028b;
    }

    @Override // p239x9.AbstractC7290a, p199t9.a
    public final java.lang.Object b(p229w9.h hVar) {
        p247y7.AbstractC7350t.f(hVar, "decoder");
        return k(hVar, null);
    }

    @Override // p239x9.AbstractC7318o, p199t9.e
    public final void e(p229w9.j jVar, java.lang.Object obj) {
        p247y7.AbstractC7350t.f(jVar, "encoder");
        int iJ = j(obj);
        p219v9.f fVar = this.f57028b;
        p229w9.f fVarK = jVar.k(fVar, iJ);
        z(fVarK, obj, iJ);
        fVarK.b(fVar);
    }

    @Override // p239x9.AbstractC7290a
    protected final java.util.Iterator i(java.lang.Object obj) {
        throw new java.lang.IllegalStateException("This method lead to boxing and must not be used, use writeContents instead".toString());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p239x9.AbstractC7290a
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public final p239x9.AbstractC7317n0 f() {
        return (p239x9.AbstractC7317n0) p(w());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p239x9.AbstractC7290a
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public final int g(p239x9.AbstractC7317n0 abstractC7317n0) {
        p247y7.AbstractC7350t.f(abstractC7317n0, "<this>");
        return abstractC7317n0.d();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p239x9.AbstractC7290a
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public final void h(p239x9.AbstractC7317n0 abstractC7317n0, int i6) {
        p247y7.AbstractC7350t.f(abstractC7317n0, "<this>");
        abstractC7317n0.b(i6);
    }

    protected abstract java.lang.Object w();

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p239x9.AbstractC7318o
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public final void s(p239x9.AbstractC7317n0 abstractC7317n0, int i6, java.lang.Object obj) {
        p247y7.AbstractC7350t.f(abstractC7317n0, "<this>");
        throw new java.lang.IllegalStateException("This method lead to boxing and must not be used, use Builder.append instead".toString());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p239x9.AbstractC7290a
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public final java.lang.Object q(p239x9.AbstractC7317n0 abstractC7317n0) {
        p247y7.AbstractC7350t.f(abstractC7317n0, "<this>");
        return abstractC7317n0.a();
    }

    protected abstract void z(p229w9.f fVar, java.lang.Object obj, int i6);
}
