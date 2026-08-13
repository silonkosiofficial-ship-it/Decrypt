package M8;

/* JADX INFO: loaded from: classes2.dex */
public abstract class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final j$.util.concurrent.ConcurrentHashMap f7173a = new j$.util.concurrent.ConcurrentHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.util.concurrent.atomic.AtomicInteger f7174b = new java.util.concurrent.atomic.AtomicInteger(0);

    static final class a extends p247y7.AbstractC7352v implements p237x7.l {
        a() {
            super(1);
        }

        @Override // p237x7.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Integer l(java.lang.String str) {
            p247y7.AbstractC7350t.f(str, "it");
            return java.lang.Integer.valueOf(M8.s.this.f7174b.getAndIncrement());
        }
    }

    public abstract int b(j$.util.concurrent.ConcurrentHashMap concurrentHashMap, java.lang.String str, p237x7.l lVar);

    public final M8.n c(F7.c cVar) {
        p247y7.AbstractC7350t.f(cVar, "kClass");
        return new M8.n(d(cVar));
    }

    public final int d(F7.c cVar) {
        p247y7.AbstractC7350t.f(cVar, "kClass");
        java.lang.String strB = cVar.b();
        p247y7.AbstractC7350t.c(strB);
        return e(strB);
    }

    public final int e(java.lang.String str) {
        p247y7.AbstractC7350t.f(str, "keyQualifiedName");
        return b(this.f7173a, str, new M8.s.a());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final java.util.Collection f() {
        java.util.Collection collectionValues = this.f7173a.values();
        p247y7.AbstractC7350t.e(collectionValues, "<get-values>(...)");
        return collectionValues;
    }
}
