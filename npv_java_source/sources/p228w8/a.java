package p228w8;

/* JADX INFO: loaded from: classes2.dex */
public final class a implements p228w8.f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.util.List f56266b;

    public a(java.util.List list) {
        p247y7.AbstractC7350t.f(list, "inner");
        this.f56266b = list;
    }

    @Override // p228w8.f
    public void a(p008a8.g gVar, O7.InterfaceC1424e interfaceC1424e, p138n8.f fVar, java.util.Collection collection) {
        p247y7.AbstractC7350t.f(gVar, "$context_receiver_0");
        p247y7.AbstractC7350t.f(interfaceC1424e, "thisDescriptor");
        p247y7.AbstractC7350t.f(fVar, "name");
        p247y7.AbstractC7350t.f(collection, "result");
        java.util.Iterator it = this.f56266b.iterator();
        while (it.hasNext()) {
            ((p228w8.f) it.next()).a(gVar, interfaceC1424e, fVar, collection);
        }
    }

    @Override // p228w8.f
    public void b(p008a8.g gVar, O7.InterfaceC1424e interfaceC1424e, p138n8.f fVar, java.util.Collection collection) {
        p247y7.AbstractC7350t.f(gVar, "$context_receiver_0");
        p247y7.AbstractC7350t.f(interfaceC1424e, "thisDescriptor");
        p247y7.AbstractC7350t.f(fVar, "name");
        p247y7.AbstractC7350t.f(collection, "result");
        java.util.Iterator it = this.f56266b.iterator();
        while (it.hasNext()) {
            ((p228w8.f) it.next()).b(gVar, interfaceC1424e, fVar, collection);
        }
    }

    @Override // p228w8.f
    public java.util.List c(p008a8.g gVar, O7.InterfaceC1424e interfaceC1424e) {
        p247y7.AbstractC7350t.f(gVar, "$context_receiver_0");
        p247y7.AbstractC7350t.f(interfaceC1424e, "thisDescriptor");
        java.util.List list = this.f56266b;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            p097j7.AbstractC6879v.C(arrayList, ((p228w8.f) it.next()).c(gVar, interfaceC1424e));
        }
        return arrayList;
    }

    @Override // p228w8.f
    public java.util.List d(p008a8.g gVar, O7.InterfaceC1424e interfaceC1424e) {
        p247y7.AbstractC7350t.f(gVar, "$context_receiver_0");
        p247y7.AbstractC7350t.f(interfaceC1424e, "thisDescriptor");
        java.util.List list = this.f56266b;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            p097j7.AbstractC6879v.C(arrayList, ((p228w8.f) it.next()).d(gVar, interfaceC1424e));
        }
        return arrayList;
    }

    @Override // p228w8.f
    public void e(p008a8.g gVar, O7.InterfaceC1424e interfaceC1424e, p138n8.f fVar, java.util.List list) {
        p247y7.AbstractC7350t.f(gVar, "$context_receiver_0");
        p247y7.AbstractC7350t.f(interfaceC1424e, "thisDescriptor");
        p247y7.AbstractC7350t.f(fVar, "name");
        p247y7.AbstractC7350t.f(list, "result");
        java.util.Iterator it = this.f56266b.iterator();
        while (it.hasNext()) {
            ((p228w8.f) it.next()).e(gVar, interfaceC1424e, fVar, list);
        }
    }

    @Override // p228w8.f
    public java.util.List f(p008a8.g gVar, O7.InterfaceC1424e interfaceC1424e) {
        p247y7.AbstractC7350t.f(gVar, "$context_receiver_0");
        p247y7.AbstractC7350t.f(interfaceC1424e, "thisDescriptor");
        java.util.List list = this.f56266b;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            p097j7.AbstractC6879v.C(arrayList, ((p228w8.f) it.next()).f(gVar, interfaceC1424e));
        }
        return arrayList;
    }

    @Override // p228w8.f
    public R7.C g(p008a8.g gVar, O7.InterfaceC1424e interfaceC1424e, R7.C c6) {
        p247y7.AbstractC7350t.f(gVar, "$context_receiver_0");
        p247y7.AbstractC7350t.f(interfaceC1424e, "thisDescriptor");
        p247y7.AbstractC7350t.f(c6, "propertyDescriptor");
        java.util.Iterator it = this.f56266b.iterator();
        while (it.hasNext()) {
            c6 = ((p228w8.f) it.next()).g(gVar, interfaceC1424e, c6);
        }
        return c6;
    }

    @Override // p228w8.f
    public void h(p008a8.g gVar, O7.InterfaceC1424e interfaceC1424e, java.util.List list) {
        p247y7.AbstractC7350t.f(gVar, "$context_receiver_0");
        p247y7.AbstractC7350t.f(interfaceC1424e, "thisDescriptor");
        p247y7.AbstractC7350t.f(list, "result");
        java.util.Iterator it = this.f56266b.iterator();
        while (it.hasNext()) {
            ((p228w8.f) it.next()).h(gVar, interfaceC1424e, list);
        }
    }
}
