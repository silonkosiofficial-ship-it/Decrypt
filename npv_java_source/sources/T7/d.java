package T7;

/* JADX INFO: loaded from: classes2.dex */
public final class d implements X7.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.ClassLoader f13298a;

    public d(java.lang.ClassLoader classLoader) {
        p247y7.AbstractC7350t.f(classLoader, "classLoader");
        this.f13298a = classLoader;
    }

    @Override // X7.p
    public p048e8.u a(p138n8.c cVar, boolean z6) {
        p247y7.AbstractC7350t.f(cVar, "fqName");
        return new U7.w(cVar);
    }

    @Override // X7.p
    public p048e8.g b(X7.p.a aVar) {
        p247y7.AbstractC7350t.f(aVar, "request");
        p138n8.b bVarA = aVar.a();
        p138n8.c cVarH = bVarA.h();
        p247y7.AbstractC7350t.e(cVarH, "getPackageFqName(...)");
        java.lang.String strB = bVarA.i().b();
        p247y7.AbstractC7350t.e(strB, "asString(...)");
        java.lang.String strQ = S8.r.Q(strB, '.', '$', false, 4, null);
        if (!cVarH.d()) {
            strQ = cVarH.b() + '.' + strQ;
        }
        java.lang.Class clsA = T7.e.a(this.f13298a, strQ);
        if (clsA != null) {
            return new U7.l(clsA);
        }
        return null;
    }

    @Override // X7.p
    public java.util.Set c(p138n8.c cVar) {
        p247y7.AbstractC7350t.f(cVar, "packageFqName");
        return null;
    }
}
