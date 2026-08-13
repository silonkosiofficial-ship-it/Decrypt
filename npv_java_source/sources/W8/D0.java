package W8;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class D0 {

    /* synthetic */ class a extends p247y7.C7348q implements p237x7.l {
        a(java.lang.Object obj) {
            super(1, obj, W8.E0.class, "invoke", "invoke(Ljava/lang/Throwable;)V", 0);
        }

        @Override // p237x7.l
        public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
            s((java.lang.Throwable) obj);
            return p087i7.M.f46721a;
        }

        public final void s(java.lang.Throwable th) {
            ((W8.E0) this.f57287D).x(th);
        }
    }

    public static final W8.InterfaceC1819y a(W8.InterfaceC1822z0 interfaceC1822z0) {
        return new W8.B0(interfaceC1822z0);
    }

    public static /* synthetic */ W8.InterfaceC1819y b(W8.InterfaceC1822z0 interfaceC1822z0, int i6, java.lang.Object obj) {
        if ((i6 & 1) != 0) {
            interfaceC1822z0 = null;
        }
        return W8.C0.a(interfaceC1822z0);
    }

    public static final void c(W8.InterfaceC1822z0 interfaceC1822z0, java.lang.String str, java.lang.Throwable th) {
        interfaceC1822z0.o(W8.AbstractC1801o0.a(str, th));
    }

    public static final void d(p127m7.i iVar, java.util.concurrent.CancellationException cancellationException) {
        W8.InterfaceC1822z0 interfaceC1822z0 = (W8.InterfaceC1822z0) iVar.i(W8.InterfaceC1822z0.f15544h);
        if (interfaceC1822z0 != null) {
            interfaceC1822z0.o(cancellationException);
        }
    }

    public static /* synthetic */ void e(W8.InterfaceC1822z0 interfaceC1822z0, java.lang.String str, java.lang.Throwable th, int i6, java.lang.Object obj) {
        if ((i6 & 2) != 0) {
            th = null;
        }
        W8.C0.c(interfaceC1822z0, str, th);
    }

    public static /* synthetic */ void f(p127m7.i iVar, java.util.concurrent.CancellationException cancellationException, int i6, java.lang.Object obj) {
        if ((i6 & 1) != 0) {
            cancellationException = null;
        }
        W8.C0.d(iVar, cancellationException);
    }

    public static final java.lang.Object g(W8.InterfaceC1822z0 interfaceC1822z0, p127m7.e eVar) {
        W8.InterfaceC1822z0.a.a(interfaceC1822z0, null, 1, null);
        java.lang.Object objG0 = interfaceC1822z0.g0(eVar);
        return objG0 == p137n7.b.g() ? objG0 : p087i7.M.f46721a;
    }

    public static final void h(W8.InterfaceC1822z0 interfaceC1822z0, java.util.concurrent.CancellationException cancellationException) {
        java.util.Iterator it = interfaceC1822z0.N().iterator();
        while (it.hasNext()) {
            ((W8.InterfaceC1822z0) it.next()).o(cancellationException);
        }
    }

    public static /* synthetic */ void i(W8.InterfaceC1822z0 interfaceC1822z0, java.util.concurrent.CancellationException cancellationException, int i6, java.lang.Object obj) {
        if ((i6 & 1) != 0) {
            cancellationException = null;
        }
        W8.C0.h(interfaceC1822z0, cancellationException);
    }

    public static final W8.InterfaceC1783f0 j(W8.InterfaceC1822z0 interfaceC1822z0, W8.InterfaceC1783f0 interfaceC1783f0) {
        return o(interfaceC1822z0, false, new W8.C1787h0(interfaceC1783f0), 1, null);
    }

    public static final void k(W8.InterfaceC1822z0 interfaceC1822z0) {
        if (!interfaceC1822z0.f()) {
            throw interfaceC1822z0.e0();
        }
    }

    public static final void l(p127m7.i iVar) {
        W8.InterfaceC1822z0 interfaceC1822z0 = (W8.InterfaceC1822z0) iVar.i(W8.InterfaceC1822z0.f15544h);
        if (interfaceC1822z0 != null) {
            W8.C0.k(interfaceC1822z0);
        }
    }

    public static final W8.InterfaceC1822z0 m(p127m7.i iVar) {
        W8.InterfaceC1822z0 interfaceC1822z0 = (W8.InterfaceC1822z0) iVar.i(W8.InterfaceC1822z0.f15544h);
        if (interfaceC1822z0 != null) {
            return interfaceC1822z0;
        }
        throw new java.lang.IllegalStateException(("Current context doesn't contain Job in it: " + iVar).toString());
    }

    public static final W8.InterfaceC1783f0 n(W8.InterfaceC1822z0 interfaceC1822z0, boolean z6, W8.E0 e6) {
        return interfaceC1822z0 instanceof W8.F0 ? ((W8.F0) interfaceC1822z0).j0(z6, e6) : interfaceC1822z0.E0(e6.w(), z6, new W8.D0.a(e6));
    }

    public static /* synthetic */ W8.InterfaceC1783f0 o(W8.InterfaceC1822z0 interfaceC1822z0, boolean z6, W8.E0 e6, int i6, java.lang.Object obj) {
        if ((i6 & 1) != 0) {
            z6 = true;
        }
        return W8.C0.n(interfaceC1822z0, z6, e6);
    }

    public static final boolean p(p127m7.i iVar) {
        W8.InterfaceC1822z0 interfaceC1822z0 = (W8.InterfaceC1822z0) iVar.i(W8.InterfaceC1822z0.f15544h);
        if (interfaceC1822z0 != null) {
            return interfaceC1822z0.f();
        }
        return true;
    }
}
