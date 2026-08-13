package p089i9;

/* JADX INFO: loaded from: classes2.dex */
final class Z extends p109k9.E {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final p089i9.K f47503e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Z(p089i9.K k6) {
        super(p089i9.J.f47355a.b(), k6 == p089i9.K.ZERO ? 2 : 1, k6 == p089i9.K.SPACE ? 2 : null);
        p247y7.AbstractC7350t.f(k6, "padding");
        this.f47503e = k6;
    }

    public boolean equals(java.lang.Object obj) {
        return (obj instanceof p089i9.Z) && this.f47503e == ((p089i9.Z) obj).f47503e;
    }

    public int hashCode() {
        return this.f47503e.hashCode();
    }
}
