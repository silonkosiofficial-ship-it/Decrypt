package V7;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a {
    public static final void a(W7.c cVar, W7.b bVar, O7.InterfaceC1424e interfaceC1424e, p138n8.f fVar) {
        p247y7.AbstractC7350t.f(cVar, "<this>");
        p247y7.AbstractC7350t.f(bVar, "from");
        p247y7.AbstractC7350t.f(interfaceC1424e, "scopeOwner");
        p247y7.AbstractC7350t.f(fVar, "name");
        if (cVar == W7.c.a.f15396a) {
            return;
        }
        bVar.e();
    }

    public static final void b(W7.c cVar, W7.b bVar, O7.K k6, p138n8.f fVar) {
        p247y7.AbstractC7350t.f(cVar, "<this>");
        p247y7.AbstractC7350t.f(bVar, "from");
        p247y7.AbstractC7350t.f(k6, "scopeOwner");
        p247y7.AbstractC7350t.f(fVar, "name");
        java.lang.String strB = k6.e().b();
        p247y7.AbstractC7350t.e(strB, "asString(...)");
        java.lang.String strG = fVar.g();
        p247y7.AbstractC7350t.e(strG, "asString(...)");
        c(cVar, bVar, strB, strG);
    }

    public static final void c(W7.c cVar, W7.b bVar, java.lang.String str, java.lang.String str2) {
        p247y7.AbstractC7350t.f(cVar, "<this>");
        p247y7.AbstractC7350t.f(bVar, "from");
        p247y7.AbstractC7350t.f(str, "packageFqName");
        p247y7.AbstractC7350t.f(str2, "name");
        if (cVar == W7.c.a.f15396a) {
            return;
        }
        bVar.e();
    }
}
