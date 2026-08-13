package p007a7;

/* JADX INFO: loaded from: classes3.dex */
public abstract class f {
    public static final p007a7.e a(java.lang.Object obj, java.util.List list, java.lang.Object obj2, p127m7.i iVar, boolean z6) {
        p247y7.AbstractC7350t.f(obj, "context");
        p247y7.AbstractC7350t.f(list, "interceptors");
        p247y7.AbstractC7350t.f(obj2, "subject");
        p247y7.AbstractC7350t.f(iVar, "coroutineContext");
        return (p007a7.g.a() || z6) ? new p007a7.a(obj, list, obj2, iVar) : new p007a7.o(obj2, obj, list);
    }
}
