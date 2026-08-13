package X7;

/* JADX INFO: loaded from: classes2.dex */
public final class n implements p178r8.g {
    @Override // p178r8.g
    public r8.g.a a() {
        return r8.g.a.BOTH;
    }

    @Override // p178r8.g
    public r8.g.b b(O7.InterfaceC1420a interfaceC1420a, O7.InterfaceC1420a interfaceC1420a2, O7.InterfaceC1424e interfaceC1424e) {
        p247y7.AbstractC7350t.f(interfaceC1420a, "superDescriptor");
        p247y7.AbstractC7350t.f(interfaceC1420a2, "subDescriptor");
        if (!(interfaceC1420a2 instanceof O7.U) || !(interfaceC1420a instanceof O7.U)) {
            return r8.g.b.UNKNOWN;
        }
        O7.U u6 = (O7.U) interfaceC1420a2;
        O7.U u10 = (O7.U) interfaceC1420a;
        if (!p247y7.AbstractC7350t.b(u6.getName(), u10.getName())) {
            return r8.g.b.UNKNOWN;
        }
        if (p018b8.c.a(u6) && p018b8.c.a(u10)) {
            return r8.g.b.OVERRIDABLE;
        }
        return (p018b8.c.a(u6) || p018b8.c.a(u10)) ? r8.g.b.INCOMPATIBLE : r8.g.b.UNKNOWN;
    }
}
