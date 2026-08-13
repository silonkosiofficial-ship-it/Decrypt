package W8;

/* JADX INFO: loaded from: classes2.dex */
public abstract class O {
    public static final W8.N a(p127m7.i iVar) {
        if (iVar.i(W8.InterfaceC1822z0.f15544h) == null) {
            iVar = iVar.o0(W8.D0.b(null, 1, null));
        }
        return new p019b9.C2117d(iVar);
    }

    public static final W8.N b() {
        return new p019b9.C2117d(W8.U0.b(null, 1, null).o0(W8.C1779d0.c()));
    }

    public static final void c(W8.N n6, java.lang.String str, java.lang.Throwable th) {
        d(n6, W8.AbstractC1801o0.a(str, th));
    }

    public static final void d(W8.N n6, java.util.concurrent.CancellationException cancellationException) {
        W8.InterfaceC1822z0 interfaceC1822z0 = (W8.InterfaceC1822z0) n6.getCoroutineContext().i(W8.InterfaceC1822z0.f15544h);
        if (interfaceC1822z0 != null) {
            interfaceC1822z0.o(cancellationException);
            return;
        }
        throw new java.lang.IllegalStateException(("Scope cannot be cancelled because it does not have a job: " + n6).toString());
    }

    public static /* synthetic */ void e(W8.N n6, java.util.concurrent.CancellationException cancellationException, int i6, java.lang.Object obj) {
        if ((i6 & 1) != 0) {
            cancellationException = null;
        }
        d(n6, cancellationException);
    }

    public static final java.lang.Object f(p237x7.p pVar, p127m7.e eVar) {
        p019b9.z zVar = new p019b9.z(eVar.getContext(), eVar);
        java.lang.Object objB = p029c9.b.b(zVar, zVar, pVar);
        if (objB == p137n7.b.g()) {
            p147o7.h.c(eVar);
        }
        return objB;
    }

    public static final void g(W8.N n6) {
        W8.C0.l(n6.getCoroutineContext());
    }

    public static final boolean h(W8.N n6) {
        W8.InterfaceC1822z0 interfaceC1822z0 = (W8.InterfaceC1822z0) n6.getCoroutineContext().i(W8.InterfaceC1822z0.f15544h);
        if (interfaceC1822z0 != null) {
            return interfaceC1822z0.f();
        }
        return true;
    }

    public static final W8.N i(W8.N n6, p127m7.i iVar) {
        return new p019b9.C2117d(n6.getCoroutineContext().o0(iVar));
    }
}
