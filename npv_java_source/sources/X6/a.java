package X6;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater f15890a = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(X6.a.class, java.lang.Object.class, "current");
    private volatile /* synthetic */ java.lang.Object current = p097j7.S.h();

    public final java.lang.Object a(java.lang.Object obj) {
        p247y7.AbstractC7350t.f(obj, "key");
        return ((java.util.Map) this.current).get(obj);
    }
}
