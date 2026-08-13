package p089i9;

/* JADX INFO: renamed from: i9.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6685p {
    public static final void a(p089i9.InterfaceC6684o interfaceC6684o, p237x7.l[] lVarArr, p237x7.l lVar) {
        p247y7.AbstractC7350t.f(interfaceC6684o, "<this>");
        p247y7.AbstractC7350t.f(lVarArr, "alternativeFormats");
        p247y7.AbstractC7350t.f(lVar, "primaryFormat");
        if (!(interfaceC6684o instanceof p089i9.InterfaceC6671b)) {
            throw new java.lang.IllegalStateException("impossible");
        }
        ((p089i9.InterfaceC6671b) interfaceC6684o).p((p237x7.l[]) java.util.Arrays.copyOf(lVarArr, lVarArr.length), (p237x7.l) p247y7.W.f(lVar, 1));
    }

    public static final void b(p089i9.InterfaceC6684o interfaceC6684o, char c6) {
        p247y7.AbstractC7350t.f(interfaceC6684o, "<this>");
        interfaceC6684o.c(java.lang.String.valueOf(c6));
    }

    public static final void c(p089i9.InterfaceC6684o interfaceC6684o, java.lang.String str, p237x7.l lVar) {
        p247y7.AbstractC7350t.f(interfaceC6684o, "<this>");
        p247y7.AbstractC7350t.f(str, "ifZero");
        p247y7.AbstractC7350t.f(lVar, "format");
        if (!(interfaceC6684o instanceof p089i9.InterfaceC6671b)) {
            throw new java.lang.IllegalStateException("impossible");
        }
        ((p089i9.InterfaceC6671b) interfaceC6684o).i(str, (p237x7.l) p247y7.W.f(lVar, 1));
    }

    public static /* synthetic */ void d(p089i9.InterfaceC6684o interfaceC6684o, java.lang.String str, p237x7.l lVar, int i6, java.lang.Object obj) {
        if ((i6 & 1) != 0) {
            str = "";
        }
        c(interfaceC6684o, str, lVar);
    }
}
