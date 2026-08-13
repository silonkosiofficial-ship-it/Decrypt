package p109k9;

/* JADX INFO: loaded from: classes2.dex */
public final class g implements p109k9.v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.Object f49845a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p237x7.l f49846b;

    public g(java.lang.Object obj, p237x7.l lVar) {
        p247y7.AbstractC7350t.f(lVar, "getter");
        this.f49845a = obj;
        this.f49846b = lVar;
    }

    @Override // p109k9.v
    public boolean test(java.lang.Object obj) {
        return p247y7.AbstractC7350t.b(this.f49846b.l(obj), this.f49845a);
    }
}
