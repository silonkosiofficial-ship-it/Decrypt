package p109k9;

/* JADX INFO: loaded from: classes2.dex */
final class i implements p109k9.v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.List f49848a;

    public i(java.util.List list) {
        p247y7.AbstractC7350t.f(list, "predicates");
        this.f49848a = list;
    }

    @Override // p109k9.v
    public boolean test(java.lang.Object obj) {
        java.util.List list = this.f49848a;
        if ((list instanceof java.util.Collection) && list.isEmpty()) {
            return true;
        }
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!((p109k9.v) it.next()).test(obj)) {
                return false;
            }
        }
        return true;
    }
}
