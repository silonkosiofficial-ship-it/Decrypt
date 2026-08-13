package p068g8;

/* JADX INFO: loaded from: classes2.dex */
public final class C implements p068g8.B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p068g8.C f45593a = new p068g8.C();

    private C() {
    }

    @Override // p068g8.B
    public java.lang.String a(O7.InterfaceC1424e interfaceC1424e) {
        p247y7.AbstractC7350t.f(interfaceC1424e, "classDescriptor");
        return null;
    }

    @Override // p068g8.B
    public void b(F8.E e6, O7.InterfaceC1424e interfaceC1424e) {
        p247y7.AbstractC7350t.f(e6, "kotlinType");
        p247y7.AbstractC7350t.f(interfaceC1424e, "descriptor");
    }

    @Override // p068g8.B
    public F8.E d(java.util.Collection collection) {
        p247y7.AbstractC7350t.f(collection, "types");
        throw new java.lang.AssertionError("There should be no intersection type in existing descriptors, but found: " + p097j7.AbstractC6879v.r0(collection, null, null, null, 0, null, null, 63, null));
    }

    @Override // p068g8.B
    public F8.E e(F8.E e6) {
        p247y7.AbstractC7350t.f(e6, "kotlinType");
        return null;
    }

    @Override // p068g8.B
    public java.lang.String f(O7.InterfaceC1424e interfaceC1424e) {
        p247y7.AbstractC7350t.f(interfaceC1424e, "classDescriptor");
        return null;
    }

    @Override // p068g8.B
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public p068g8.o c(O7.InterfaceC1424e interfaceC1424e) {
        p247y7.AbstractC7350t.f(interfaceC1424e, "classDescriptor");
        return null;
    }
}
