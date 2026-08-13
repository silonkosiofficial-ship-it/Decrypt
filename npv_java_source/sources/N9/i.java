package N9;

/* JADX INFO: loaded from: classes2.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final N9.i f7930a = new N9.i();

    private i() {
    }

    private final boolean b(H9.z zVar, java.net.Proxy.Type type) {
        return !zVar.f() && type == java.net.Proxy.Type.HTTP;
    }

    public final java.lang.String a(H9.z zVar, java.net.Proxy.Type type) {
        p247y7.AbstractC7350t.f(zVar, "request");
        p247y7.AbstractC7350t.f(type, "proxyType");
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(zVar.g());
        sb.append(' ');
        N9.i iVar = f7930a;
        boolean zB = iVar.b(zVar, type);
        H9.u uVarI = zVar.i();
        if (zB) {
            sb.append(uVarI);
        } else {
            sb.append(iVar.c(uVarI));
        }
        sb.append(" HTTP/1.1");
        java.lang.String string = sb.toString();
        p247y7.AbstractC7350t.e(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public final java.lang.String c(H9.u uVar) {
        p247y7.AbstractC7350t.f(uVar, "url");
        java.lang.String strD = uVar.d();
        java.lang.String strF = uVar.f();
        if (strF == null) {
            return strD;
        }
        return strD + '?' + strF;
    }
}
