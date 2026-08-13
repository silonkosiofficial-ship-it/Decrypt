package V;

/* JADX INFO: loaded from: classes.dex */
public abstract class L1 {

    static final class a extends p247y7.AbstractC7352v implements p237x7.p {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ p237x7.l f14693D;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(p237x7.l lVar) {
            super(2);
            this.f14693D = lVar;
        }

        public final void a(java.lang.Object obj, p087i7.M m6) {
            this.f14693D.l(obj);
        }

        @Override // p237x7.p
        public /* bridge */ /* synthetic */ java.lang.Object u(java.lang.Object obj, java.lang.Object obj2) {
            a(obj, (p087i7.M) obj2);
            return p087i7.M.f46721a;
        }
    }

    public static V.InterfaceC1734n a(V.InterfaceC1734n interfaceC1734n) {
        return interfaceC1734n;
    }

    public static final void b(V.InterfaceC1734n interfaceC1734n, p237x7.l lVar) {
        if (interfaceC1734n.o()) {
            interfaceC1734n.D(p087i7.M.f46721a, new V.L1.a(lVar));
        }
    }

    public static final void c(V.InterfaceC1734n interfaceC1734n, java.lang.Object obj, p237x7.p pVar) {
        if (interfaceC1734n.o() || !p247y7.AbstractC7350t.b(interfaceC1734n.g(), obj)) {
            interfaceC1734n.K(obj);
            interfaceC1734n.D(obj, pVar);
        }
    }
}
