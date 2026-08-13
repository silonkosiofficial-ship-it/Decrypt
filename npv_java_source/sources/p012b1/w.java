package p012b1;

/* JADX INFO: loaded from: classes.dex */
public abstract class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.Object f24115a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.util.Map f24116b;

    public w(java.lang.Object obj) {
        p247y7.AbstractC7350t.f(obj, "id");
        this.f24115a = obj;
        this.f24116b = new java.util.LinkedHashMap();
    }

    public abstract java.lang.Object a();

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!p247y7.AbstractC7350t.b(p022c1.a.a(this), obj != null ? p022c1.a.a(obj) : null)) {
            return false;
        }
        p247y7.AbstractC7350t.d(obj, "null cannot be cast to non-null type androidx.constraintlayout.compose.LayoutReference");
        return p247y7.AbstractC7350t.b(a(), ((p012b1.w) obj).a());
    }

    public int hashCode() {
        return a().hashCode();
    }
}
