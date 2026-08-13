package J6;

/* JADX INFO: loaded from: classes3.dex */
public abstract class i {
    public static final J6.b b(java.lang.String str, p237x7.a aVar, p237x7.l lVar) {
        p247y7.AbstractC7350t.f(str, "name");
        p247y7.AbstractC7350t.f(aVar, "createConfiguration");
        p247y7.AbstractC7350t.f(lVar, "body");
        return new J6.e(str, aVar, lVar);
    }

    public static final J6.b c(java.lang.String str, p237x7.l lVar) {
        p247y7.AbstractC7350t.f(str, "name");
        p247y7.AbstractC7350t.f(lVar, "body");
        return b(str, new p237x7.a() { // from class: J6.h
            @Override // p237x7.a
            public final java.lang.Object b() {
                return J6.i.d();
            }
        }, lVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p087i7.M d() {
        return p087i7.M.f46721a;
    }
}
