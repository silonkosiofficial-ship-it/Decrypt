package p018b8;

/* JADX INFO: loaded from: classes2.dex */
public abstract class m extends p018b8.j {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public m(p008a8.g gVar) {
        super(gVar, null, 2, 0 == true ? 1 : 0);
        p247y7.AbstractC7350t.f(gVar, "c");
    }

    @Override // p018b8.j
    protected b8.j.a H(p048e8.r rVar, java.util.List list, F8.E e6, java.util.List list2) {
        p247y7.AbstractC7350t.f(rVar, "method");
        p247y7.AbstractC7350t.f(list, "methodTypeParameters");
        p247y7.AbstractC7350t.f(e6, "returnType");
        p247y7.AbstractC7350t.f(list2, "valueParameters");
        return new b8.j.a(e6, null, list2, list, false, p097j7.AbstractC6879v.m());
    }

    @Override // p018b8.j
    protected void s(p138n8.f fVar, java.util.Collection collection) {
        p247y7.AbstractC7350t.f(fVar, "name");
        p247y7.AbstractC7350t.f(collection, "result");
    }

    @Override // p018b8.j
    protected O7.X z() {
        return null;
    }
}
