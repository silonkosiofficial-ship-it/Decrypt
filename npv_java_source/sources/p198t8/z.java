package p198t8;

/* JADX INFO: loaded from: classes2.dex */
public final class z extends p198t8.A {
    public z(short s6) {
        super(java.lang.Short.valueOf(s6));
    }

    @Override // p198t8.g
    public F8.E a(O7.G g6) {
        p247y7.AbstractC7350t.f(g6, "module");
        O7.InterfaceC1424e interfaceC1424eA = O7.AbstractC1442x.a(g6, L7.j.a.f6330B0);
        F8.M mW = interfaceC1424eA != null ? interfaceC1424eA.w() : null;
        return mW == null ? H8.k.d(H8.j.f4487Z0, "UShort") : mW;
    }

    @Override // p198t8.g
    public java.lang.String toString() {
        return ((java.lang.Number) b()).intValue() + ".toUShort()";
    }
}
