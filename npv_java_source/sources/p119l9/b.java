package p119l9;

/* JADX INFO: loaded from: classes2.dex */
public final class b implements p119l9.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.List f50164a;

    public b(java.util.List list) {
        p247y7.AbstractC7350t.f(list, "formatters");
        this.f50164a = list;
    }

    @Override // p119l9.e
    public void a(java.lang.Object obj, java.lang.Appendable appendable, boolean z6) {
        p247y7.AbstractC7350t.f(appendable, "builder");
        for (p087i7.u uVar : this.f50164a) {
            p237x7.l lVar = (p237x7.l) uVar.a();
            p119l9.e eVar = (p119l9.e) uVar.b();
            if (((java.lang.Boolean) lVar.l(obj)).booleanValue()) {
                eVar.a(obj, appendable, z6);
                return;
            }
        }
    }
}
