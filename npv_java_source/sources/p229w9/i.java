package p229w9;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class i {
    public static p229w9.f a(p229w9.j jVar, p219v9.f fVar, int i6) {
        p247y7.AbstractC7350t.f(fVar, "descriptor");
        return jVar.a(fVar);
    }

    public static void b(p229w9.j jVar) {
    }

    public static void c(p229w9.j jVar, p199t9.e eVar, java.lang.Object obj) {
        p247y7.AbstractC7350t.f(eVar, "serializer");
        if (eVar.a().c()) {
            jVar.t(eVar, obj);
        } else if (obj == null) {
            jVar.d();
        } else {
            jVar.q();
            jVar.t(eVar, obj);
        }
    }

    public static void d(p229w9.j jVar, p199t9.e eVar, java.lang.Object obj) {
        p247y7.AbstractC7350t.f(eVar, "serializer");
        eVar.e(jVar, obj);
    }
}
