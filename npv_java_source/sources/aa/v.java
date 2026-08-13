package aa;

/* JADX INFO: loaded from: classes2.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.List f17338a;

    public v(java.util.List list) {
        p247y7.AbstractC7350t.f(list, "items");
        this.f17338a = list;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof aa.v) && p247y7.AbstractC7350t.b(this.f17338a, ((aa.v) obj).f17338a);
    }

    public int hashCode() {
        return this.f17338a.hashCode();
    }

    public java.lang.String toString() {
        return "Array(items=" + this.f17338a + ")";
    }
}
