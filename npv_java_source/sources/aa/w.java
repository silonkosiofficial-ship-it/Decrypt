package aa;

/* JADX INFO: loaded from: classes2.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.Map f17339a;

    public w(java.util.Map map) {
        p247y7.AbstractC7350t.f(map, "items");
        this.f17339a = map;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof aa.w) && p247y7.AbstractC7350t.b(this.f17339a, ((aa.w) obj).f17339a);
    }

    public int hashCode() {
        return this.f17339a.hashCode();
    }

    public java.lang.String toString() {
        return "Plurals(items=" + this.f17339a + ")";
    }
}
