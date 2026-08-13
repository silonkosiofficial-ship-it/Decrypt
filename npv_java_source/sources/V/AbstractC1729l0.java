package V;

/* JADX INFO: renamed from: V.l0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1729l0 {
    public static final V.InterfaceC1723j0 a(p127m7.i iVar) {
        V.InterfaceC1723j0 interfaceC1723j0 = (V.InterfaceC1723j0) iVar.i(V.InterfaceC1723j0.f14901f);
        if (interfaceC1723j0 != null) {
            return interfaceC1723j0;
        }
        throw new java.lang.IllegalStateException("A MonotonicFrameClock is not available in this CoroutineContext. Callers should supply an appropriate MonotonicFrameClock using withContext.".toString());
    }

    public static final java.lang.Object b(p237x7.l lVar, p127m7.e eVar) {
        return a(eVar.getContext()).R(new V.C1726k0(lVar), eVar);
    }

    public static final java.lang.Object c(p237x7.l lVar, p127m7.e eVar) {
        return a(eVar.getContext()).R(lVar, eVar);
    }
}
