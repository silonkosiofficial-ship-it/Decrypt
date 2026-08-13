package androidx.privacysandbox.ads.adservices.topics;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.List f22891a;

    public b(java.util.List list) {
        p247y7.AbstractC7350t.f(list, "topics");
        this.f22891a = list;
    }

    public final java.util.List a() {
        return this.f22891a;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof androidx.privacysandbox.ads.adservices.topics.b)) {
            return false;
        }
        androidx.privacysandbox.ads.adservices.topics.b bVar = (androidx.privacysandbox.ads.adservices.topics.b) obj;
        if (this.f22891a.size() != bVar.f22891a.size()) {
            return false;
        }
        return p247y7.AbstractC7350t.b(new java.util.HashSet(this.f22891a), new java.util.HashSet(bVar.f22891a));
    }

    public int hashCode() {
        return j$.util.Objects.hash(this.f22891a);
    }

    public java.lang.String toString() {
        return "Topics=" + this.f22891a;
    }
}
