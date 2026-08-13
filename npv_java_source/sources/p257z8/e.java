package p257z8;

/* JADX INFO: loaded from: classes2.dex */
public class e implements p257z8.g, p257z8.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final O7.InterfaceC1424e f57663a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p257z8.e f57664b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final O7.InterfaceC1424e f57665c;

    public e(O7.InterfaceC1424e interfaceC1424e, p257z8.e eVar) {
        p247y7.AbstractC7350t.f(interfaceC1424e, "classDescriptor");
        this.f57663a = interfaceC1424e;
        this.f57664b = eVar == null ? this : eVar;
        this.f57665c = interfaceC1424e;
    }

    @Override // p257z8.g
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public F8.M getType() {
        F8.M mW = this.f57663a.w();
        p247y7.AbstractC7350t.e(mW, "getDefaultType(...)");
        return mW;
    }

    public boolean equals(java.lang.Object obj) {
        O7.InterfaceC1424e interfaceC1424e = this.f57663a;
        p257z8.e eVar = obj instanceof p257z8.e ? (p257z8.e) obj : null;
        return p247y7.AbstractC7350t.b(interfaceC1424e, eVar != null ? eVar.f57663a : null);
    }

    public int hashCode() {
        return this.f57663a.hashCode();
    }

    public java.lang.String toString() {
        return "Class{" + getType() + '}';
    }

    @Override // p257z8.h
    public final O7.InterfaceC1424e v() {
        return this.f57663a;
    }
}
