package p089i9;

/* JADX INFO: renamed from: i9.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC6671b extends p089i9.InterfaceC6684o {

    /* JADX INFO: renamed from: i9.b$a */
    public static final class a {
        public static void a(p089i9.InterfaceC6671b interfaceC6671b, p237x7.l[] lVarArr, p237x7.l lVar) {
            p247y7.AbstractC7350t.f(lVarArr, "otherFormats");
            p247y7.AbstractC7350t.f(lVar, "mainFormat");
            java.util.ArrayList arrayList = new java.util.ArrayList(lVarArr.length);
            for (p237x7.l lVar2 : lVarArr) {
                p089i9.InterfaceC6671b interfaceC6671bW = interfaceC6671b.w();
                lVar2.l(interfaceC6671bW);
                arrayList.add(interfaceC6671bW.a().b());
            }
            p089i9.InterfaceC6671b interfaceC6671bW2 = interfaceC6671b.w();
            lVar.l(interfaceC6671bW2);
            interfaceC6671b.a().a(new p109k9.C6917c(interfaceC6671bW2.a().b(), arrayList));
        }

        public static void b(p089i9.InterfaceC6671b interfaceC6671b, java.lang.String str, p237x7.l lVar) {
            p247y7.AbstractC7350t.f(str, "onZero");
            p247y7.AbstractC7350t.f(lVar, "format");
            p109k9.C6918d c6918dA = interfaceC6671b.a();
            p089i9.InterfaceC6671b interfaceC6671bW = interfaceC6671b.w();
            lVar.l(interfaceC6671bW);
            p087i7.M m6 = p087i7.M.f46721a;
            c6918dA.a(new p109k9.t(str, interfaceC6671bW.a().b()));
        }

        public static p109k9.f c(p089i9.InterfaceC6671b interfaceC6671b) {
            return new p109k9.f(interfaceC6671b.a().b().c());
        }

        public static void d(p089i9.InterfaceC6671b interfaceC6671b, java.lang.String str) {
            p247y7.AbstractC7350t.f(str, "value");
            interfaceC6671b.a().a(new p109k9.j(str));
        }
    }

    p109k9.C6918d a();

    void i(java.lang.String str, p237x7.l lVar);

    void p(p237x7.l[] lVarArr, p237x7.l lVar);

    p089i9.InterfaceC6671b w();
}
