package p119l9;

/* JADX INFO: loaded from: classes2.dex */
public final class a implements p119l9.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.List f50163a;

    public a(java.util.List list) {
        p247y7.AbstractC7350t.f(list, "formatters");
        this.f50163a = list;
    }

    @Override // p119l9.e
    public void a(java.lang.Object obj, java.lang.Appendable appendable, boolean z6) {
        p247y7.AbstractC7350t.f(appendable, "builder");
        java.util.Iterator it = this.f50163a.iterator();
        while (it.hasNext()) {
            ((p119l9.e) it.next()).a(obj, appendable, z6);
        }
    }
}
