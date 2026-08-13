package W6;

/* JADX INFO: loaded from: classes3.dex */
public abstract class f {
    public static final java.util.Map a(p237x7.l lVar, p237x7.l lVar2, int i6) {
        p247y7.AbstractC7350t.f(lVar, "supplier");
        p247y7.AbstractC7350t.f(lVar2, "close");
        java.util.Map mapSynchronizedMap = j$.util.DesugarCollections.synchronizedMap(new W6.u(lVar, lVar2, i6));
        p247y7.AbstractC7350t.e(mapSynchronizedMap, "synchronizedMap(...)");
        return mapSynchronizedMap;
    }
}
