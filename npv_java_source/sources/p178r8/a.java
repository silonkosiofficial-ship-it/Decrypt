package p178r8;

/* JADX INFO: loaded from: classes2.dex */
public final class a extends p178r8.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p178r8.a f53983a = new p178r8.a();

    /* JADX INFO: renamed from: r8.a$a, reason: collision with other inner class name */
    public static final class C0703a implements java.util.Comparator {
        @Override // java.util.Comparator
        public final int compare(java.lang.Object obj, java.lang.Object obj2) {
            return p117l7.a.d(p218v8.c.l((O7.InterfaceC1424e) obj).b(), p218v8.c.l((O7.InterfaceC1424e) obj2).b());
        }
    }

    private a() {
    }

    private static final void b(O7.InterfaceC1424e interfaceC1424e, java.util.LinkedHashSet linkedHashSet, p248y8.h hVar, boolean z6) {
        for (O7.InterfaceC1432m interfaceC1432m : y8.k.a.a(hVar, p248y8.d.f57332t, null, 2, null)) {
            if (interfaceC1432m instanceof O7.InterfaceC1424e) {
                O7.InterfaceC1424e interfaceC1424eV = (O7.InterfaceC1424e) interfaceC1432m;
                if (interfaceC1424eV.R()) {
                    p138n8.f name = interfaceC1424eV.getName();
                    p247y7.AbstractC7350t.e(name, "getName(...)");
                    O7.InterfaceC1427h interfaceC1427hG = hVar.g(name, W7.d.WHEN_GET_ALL_DESCRIPTORS);
                    interfaceC1424eV = interfaceC1427hG instanceof O7.InterfaceC1424e ? (O7.InterfaceC1424e) interfaceC1427hG : interfaceC1427hG instanceof O7.e0 ? ((O7.e0) interfaceC1427hG).v() : null;
                }
                if (interfaceC1424eV != null) {
                    if (p178r8.f.z(interfaceC1424eV, interfaceC1424e)) {
                        linkedHashSet.add(interfaceC1424eV);
                    }
                    if (z6) {
                        p248y8.h hVarH0 = interfaceC1424eV.H0();
                        p247y7.AbstractC7350t.e(hVarH0, "getUnsubstitutedInnerClassesScope(...)");
                        b(interfaceC1424e, linkedHashSet, hVarH0, z6);
                    }
                }
            }
        }
    }

    public java.util.Collection a(O7.InterfaceC1424e interfaceC1424e, boolean z6) {
        java.lang.Object next;
        O7.InterfaceC1432m interfaceC1432mB;
        java.util.List listL0;
        p247y7.AbstractC7350t.f(interfaceC1424e, "sealedClass");
        if (interfaceC1424e.q() != O7.D.SEALED) {
            listL0 = p097j7.AbstractC6879v.m();
        } else {
            java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
            if (z6) {
                java.util.Iterator it = p218v8.c.r(interfaceC1424e).iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!(((O7.InterfaceC1432m) next) instanceof O7.K));
                interfaceC1432mB = (O7.InterfaceC1432m) next;
            } else {
                interfaceC1432mB = interfaceC1424e.b();
            }
            if (interfaceC1432mB instanceof O7.K) {
                b(interfaceC1424e, linkedHashSet, ((O7.K) interfaceC1432mB).u(), z6);
            }
            p248y8.h hVarH0 = interfaceC1424e.H0();
            p247y7.AbstractC7350t.e(hVarH0, "getUnsubstitutedInnerClassesScope(...)");
            b(interfaceC1424e, linkedHashSet, hVarH0, true);
            listL0 = p097j7.AbstractC6879v.L0(linkedHashSet, new p178r8.a.C0703a());
        }
        return listL0;
    }
}
