package W8;

/* JADX INFO: renamed from: W8.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1802p {
    public static final void a(W8.InterfaceC1794l interfaceC1794l, W8.InterfaceC1783f0 interfaceC1783f0) {
        c(interfaceC1794l, new W8.C1785g0(interfaceC1783f0));
    }

    public static final W8.C1798n b(p127m7.e eVar) {
        if (!(eVar instanceof p019b9.C2121h)) {
            return new W8.C1798n(eVar, 1);
        }
        W8.C1798n c1798nL = ((p019b9.C2121h) eVar).l();
        if (c1798nL != null) {
            if (!c1798nL.R()) {
                c1798nL = null;
            }
            if (c1798nL != null) {
                return c1798nL;
            }
        }
        return new W8.C1798n(eVar, 2);
    }

    public static final void c(W8.InterfaceC1794l interfaceC1794l, W8.InterfaceC1792k interfaceC1792k) {
        if (!(interfaceC1794l instanceof W8.C1798n)) {
            throw new java.lang.UnsupportedOperationException("third-party implementation of CancellableContinuation is not supported");
        }
        ((W8.C1798n) interfaceC1794l).K(interfaceC1792k);
    }
}
