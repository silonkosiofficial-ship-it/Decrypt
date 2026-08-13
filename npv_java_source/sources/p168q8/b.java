package p168q8;

/* JADX INFO: loaded from: classes2.dex */
public interface b {

    public static final class a implements p168q8.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final q8.b.a f53150a = new q8.b.a();

        private a() {
        }

        @Override // p168q8.b
        public java.lang.String a(O7.InterfaceC1427h interfaceC1427h, p168q8.c cVar) {
            p247y7.AbstractC7350t.f(interfaceC1427h, "classifier");
            p247y7.AbstractC7350t.f(cVar, "renderer");
            if (interfaceC1427h instanceof O7.f0) {
                p138n8.f name = ((O7.f0) interfaceC1427h).getName();
                p247y7.AbstractC7350t.e(name, "getName(...)");
                return cVar.v(name, false);
            }
            p138n8.d dVarM = p178r8.f.m(interfaceC1427h);
            p247y7.AbstractC7350t.e(dVarM, "getFqName(...)");
            return cVar.u(dVarM);
        }
    }

    /* JADX INFO: renamed from: q8.b$b, reason: collision with other inner class name */
    public static final class C0691b implements p168q8.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final p168q8.b.C0691b f53151a = new p168q8.b.C0691b();

        private C0691b() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v0, types: [O7.h, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r2v1, types: [O7.I, O7.m] */
        /* JADX WARN: Type inference failed for: r2v2, types: [O7.m] */
        @Override // p168q8.b
        public java.lang.String a(O7.InterfaceC1427h interfaceC1427h, p168q8.c cVar) {
            p247y7.AbstractC7350t.f(interfaceC1427h, "classifier");
            p247y7.AbstractC7350t.f(cVar, "renderer");
            if (interfaceC1427h instanceof O7.f0) {
                p138n8.f name = ((O7.f0) interfaceC1427h).getName();
                p247y7.AbstractC7350t.e(name, "getName(...)");
                return cVar.v(name, false);
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            do {
                arrayList.add(interfaceC1427h.getName());
                interfaceC1427h = interfaceC1427h.b();
            } while (interfaceC1427h instanceof O7.InterfaceC1424e);
            return p168q8.n.c(p097j7.AbstractC6879v.R(arrayList));
        }
    }

    public static final class c implements p168q8.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final q8.b.c f53152a = new q8.b.c();

        private c() {
        }

        private final java.lang.String b(O7.InterfaceC1427h interfaceC1427h) {
            p138n8.f name = interfaceC1427h.getName();
            p247y7.AbstractC7350t.e(name, "getName(...)");
            java.lang.String strB = p168q8.n.b(name);
            if (interfaceC1427h instanceof O7.f0) {
                return strB;
            }
            O7.InterfaceC1432m interfaceC1432mB = interfaceC1427h.b();
            p247y7.AbstractC7350t.e(interfaceC1432mB, "getContainingDeclaration(...)");
            java.lang.String strC = c(interfaceC1432mB);
            if (strC == null || p247y7.AbstractC7350t.b(strC, "")) {
                return strB;
            }
            return strC + '.' + strB;
        }

        private final java.lang.String c(O7.InterfaceC1432m interfaceC1432m) {
            if (interfaceC1432m instanceof O7.InterfaceC1424e) {
                return b((O7.InterfaceC1427h) interfaceC1432m);
            }
            if (!(interfaceC1432m instanceof O7.K)) {
                return null;
            }
            p138n8.d dVarJ = ((O7.K) interfaceC1432m).e().j();
            p247y7.AbstractC7350t.e(dVarJ, "toUnsafe(...)");
            return p168q8.n.a(dVarJ);
        }

        @Override // p168q8.b
        public java.lang.String a(O7.InterfaceC1427h interfaceC1427h, p168q8.c cVar) {
            p247y7.AbstractC7350t.f(interfaceC1427h, "classifier");
            p247y7.AbstractC7350t.f(cVar, "renderer");
            return b(interfaceC1427h);
        }
    }

    java.lang.String a(O7.InterfaceC1427h interfaceC1427h, p168q8.c cVar);
}
