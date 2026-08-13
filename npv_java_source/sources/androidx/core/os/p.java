package androidx.core.os;

/* JADX INFO: loaded from: classes.dex */
final class p implements androidx.core.os.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.os.LocaleList f21601a;

    p(java.lang.Object obj) {
        this.f21601a = androidx.core.os.o.a(obj);
    }

    @Override // androidx.core.os.k
    public java.lang.String a() {
        return this.f21601a.toLanguageTags();
    }

    @Override // androidx.core.os.k
    public java.lang.Object b() {
        return this.f21601a;
    }

    public boolean equals(java.lang.Object obj) {
        return this.f21601a.equals(((androidx.core.os.k) obj).b());
    }

    @Override // androidx.core.os.k
    public java.util.Locale get(int i6) {
        return this.f21601a.get(i6);
    }

    public int hashCode() {
        return this.f21601a.hashCode();
    }

    @Override // androidx.core.os.k
    public boolean isEmpty() {
        return this.f21601a.isEmpty();
    }

    @Override // androidx.core.os.k
    public int size() {
        return this.f21601a.size();
    }

    public java.lang.String toString() {
        return this.f21601a.toString();
    }
}
