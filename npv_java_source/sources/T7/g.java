package T7;

/* JADX INFO: loaded from: classes2.dex */
public final class g implements p068g8.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.ClassLoader f13302a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C8.d f13303b;

    public g(java.lang.ClassLoader classLoader) {
        p247y7.AbstractC7350t.f(classLoader, "classLoader");
        this.f13302a = classLoader;
        this.f13303b = new C8.d();
    }

    private final g8.r.a d(java.lang.String str) {
        T7.f fVarA;
        java.lang.Class clsA = T7.e.a(this.f13302a, str);
        if (clsA == null || (fVarA = T7.f.f13299c.a(clsA)) == null) {
            return null;
        }
        return new g8.r.a.C0522a(fVarA, null, 2, null);
    }

    @Override // p068g8.r
    public g8.r.a a(p138n8.b bVar, p128m8.e eVar) {
        p247y7.AbstractC7350t.f(bVar, "classId");
        p247y7.AbstractC7350t.f(eVar, "jvmMetadataVersion");
        return d(T7.h.b(bVar));
    }

    @Override // p068g8.r
    public g8.r.a b(p048e8.g gVar, p128m8.e eVar) {
        java.lang.String strB;
        p247y7.AbstractC7350t.f(gVar, "javaClass");
        p247y7.AbstractC7350t.f(eVar, "jvmMetadataVersion");
        p138n8.c cVarE = gVar.e();
        if (cVarE == null || (strB = cVarE.b()) == null) {
            return null;
        }
        return d(strB);
    }

    @Override // B8.v
    public java.io.InputStream c(p138n8.c cVar) {
        p247y7.AbstractC7350t.f(cVar, "packageFqName");
        if (cVar.i(L7.j.f6324x)) {
            return this.f13303b.a(C8.a.f1375r.r(cVar));
        }
        return null;
    }
}
