package G8;

/* JADX INFO: loaded from: classes2.dex */
public abstract class g extends F8.AbstractC0947h {

    public static final class a extends G8.g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final G8.g.a f3136a = new G8.g.a();

        private a() {
        }

        @Override // G8.g
        public O7.InterfaceC1424e b(p138n8.b bVar) {
            p247y7.AbstractC7350t.f(bVar, "classId");
            return null;
        }

        @Override // G8.g
        public p248y8.h c(O7.InterfaceC1424e interfaceC1424e, p237x7.a aVar) {
            p247y7.AbstractC7350t.f(interfaceC1424e, "classDescriptor");
            p247y7.AbstractC7350t.f(aVar, "compute");
            return (p248y8.h) aVar.b();
        }

        @Override // G8.g
        public boolean d(O7.G g6) {
            p247y7.AbstractC7350t.f(g6, "moduleDescriptor");
            return false;
        }

        @Override // G8.g
        public boolean e(F8.e0 e0Var) {
            p247y7.AbstractC7350t.f(e0Var, "typeConstructor");
            return false;
        }

        @Override // G8.g
        public java.util.Collection g(O7.InterfaceC1424e interfaceC1424e) {
            p247y7.AbstractC7350t.f(interfaceC1424e, "classDescriptor");
            java.util.Collection collectionU = interfaceC1424e.p().u();
            p247y7.AbstractC7350t.e(collectionU, "getSupertypes(...)");
            return collectionU;
        }

        @Override // F8.AbstractC0947h
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public F8.E a(J8.i iVar) {
            p247y7.AbstractC7350t.f(iVar, "type");
            return (F8.E) iVar;
        }

        @Override // G8.g
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public O7.InterfaceC1424e f(O7.InterfaceC1432m interfaceC1432m) {
            p247y7.AbstractC7350t.f(interfaceC1432m, "descriptor");
            return null;
        }
    }

    public abstract O7.InterfaceC1424e b(p138n8.b bVar);

    public abstract p248y8.h c(O7.InterfaceC1424e interfaceC1424e, p237x7.a aVar);

    public abstract boolean d(O7.G g6);

    public abstract boolean e(F8.e0 e0Var);

    public abstract O7.InterfaceC1427h f(O7.InterfaceC1432m interfaceC1432m);

    public abstract java.util.Collection g(O7.InterfaceC1424e interfaceC1424e);

    /* JADX INFO: renamed from: h */
    public abstract F8.E a(J8.i iVar);
}
