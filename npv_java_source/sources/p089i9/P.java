package p089i9;

/* JADX INFO: loaded from: classes2.dex */
public final class P extends p109k9.B {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.util.Set f47386c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P(java.util.Set set) {
        super(p089i9.AbstractC6682m.b(), set);
        p247y7.AbstractC7350t.f(set, "knownZones");
        this.f47386c = set;
    }

    public boolean equals(java.lang.Object obj) {
        return (obj instanceof p089i9.P) && p247y7.AbstractC7350t.b(((p089i9.P) obj).f47386c, this.f47386c);
    }

    public int hashCode() {
        return this.f47386c.hashCode();
    }
}
