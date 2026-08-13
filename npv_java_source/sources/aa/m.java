package aa;

/* JADX INFO: loaded from: classes2.dex */
public abstract class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.String f17308a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.util.Set f17309b;

    private m(java.lang.String str, java.util.Set set) {
        this.f17308a = str;
        this.f17309b = set;
    }

    public /* synthetic */ m(java.lang.String str, java.util.Set set, p247y7.AbstractC7342k abstractC7342k) {
        this(str, set);
    }

    public final java.lang.String a() {
        return this.f17308a;
    }

    public final java.util.Set b() {
        return this.f17309b;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return p247y7.AbstractC7350t.b(this.f17308a, ((aa.m) obj).f17308a);
    }

    public int hashCode() {
        return this.f17308a.hashCode();
    }
}
