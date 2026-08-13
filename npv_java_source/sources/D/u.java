package D;

/* JADX INFO: loaded from: classes.dex */
final class u implements D0.k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final D.C0880q f1713a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.util.Map f1714b = new java.util.LinkedHashMap();

    public u(D.C0880q c0880q) {
        this.f1713a = c0880q;
    }

    @Override // D0.k0
    public boolean a(java.lang.Object obj, java.lang.Object obj2) {
        return p247y7.AbstractC7350t.b(this.f1713a.c(obj), this.f1713a.c(obj2));
    }

    @Override // D0.k0
    public void b(D0.k0.a aVar) {
        this.f1714b.clear();
        java.util.Iterator it = aVar.iterator();
        while (it.hasNext()) {
            java.lang.Object objC = this.f1713a.c(it.next());
            java.lang.Integer num = (java.lang.Integer) this.f1714b.get(objC);
            int iIntValue = num != null ? num.intValue() : 0;
            if (iIntValue == 7) {
                it.remove();
            } else {
                this.f1714b.put(objC, java.lang.Integer.valueOf(iIntValue + 1));
            }
        }
    }
}
