package p109k9;

/* JADX INFO: loaded from: classes2.dex */
public final class x implements p109k9.InterfaceC6916b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final F7.i f49869a;

    public x(F7.i iVar) {
        p247y7.AbstractC7350t.f(iVar, "property");
        this.f49869a = iVar;
    }

    @Override // p109k9.InterfaceC6916b
    public java.lang.Object a(java.lang.Object obj) {
        return this.f49869a.get(obj);
    }

    @Override // p109k9.InterfaceC6916b
    public java.lang.Object b(java.lang.Object obj) {
        return p109k9.InterfaceC6916b.a.a(this, obj);
    }

    @Override // p129m9.a
    public java.lang.Object c(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.Object obj3 = this.f49869a.get(obj);
        if (obj3 == null) {
            this.f49869a.r(obj, obj2);
        } else if (!p247y7.AbstractC7350t.b(obj3, obj2)) {
            return obj3;
        }
        return null;
    }

    @Override // p129m9.a
    public java.lang.String getName() {
        return this.f49869a.getName();
    }
}
