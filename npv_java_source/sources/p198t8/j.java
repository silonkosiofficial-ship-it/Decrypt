package p198t8;

/* JADX INFO: loaded from: classes2.dex */
public final class j extends p198t8.g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p138n8.b f54635b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p138n8.f f54636c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(p138n8.b bVar, p138n8.f fVar) {
        super(p087i7.B.a(bVar, fVar));
        p247y7.AbstractC7350t.f(bVar, "enumClassId");
        p247y7.AbstractC7350t.f(fVar, "enumEntryName");
        this.f54635b = bVar;
        this.f54636c = fVar;
    }

    @Override // p198t8.g
    public F8.E a(O7.G g6) {
        p247y7.AbstractC7350t.f(g6, "module");
        O7.InterfaceC1424e interfaceC1424eA = O7.AbstractC1442x.a(g6, this.f54635b);
        F8.M mW = null;
        if (interfaceC1424eA != null) {
            if (!p178r8.f.A(interfaceC1424eA)) {
                interfaceC1424eA = null;
            }
            if (interfaceC1424eA != null) {
                mW = interfaceC1424eA.w();
            }
        }
        if (mW != null) {
            return mW;
        }
        H8.j jVar = H8.j.f4489a1;
        java.lang.String string = this.f54635b.toString();
        p247y7.AbstractC7350t.e(string, "toString(...)");
        java.lang.String string2 = this.f54636c.toString();
        p247y7.AbstractC7350t.e(string2, "toString(...)");
        return H8.k.d(jVar, string, string2);
    }

    public final p138n8.f c() {
        return this.f54636c;
    }

    @Override // p198t8.g
    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(this.f54635b.j());
        sb.append('.');
        sb.append(this.f54636c);
        return sb.toString();
    }
}
