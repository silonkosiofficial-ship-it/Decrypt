package p089i9;

/* JADX INFO: renamed from: i9.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C6686q extends p109k9.E {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final p089i9.K f47563e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6686q(p089i9.K k6) {
        super(p089i9.C6678i.f47516a.a(), k6 == p089i9.K.ZERO ? 2 : 1, k6 == p089i9.K.SPACE ? 2 : null);
        p247y7.AbstractC7350t.f(k6, "padding");
        this.f47563e = k6;
    }

    public boolean equals(java.lang.Object obj) {
        return (obj instanceof p089i9.C6686q) && this.f47563e == ((p089i9.C6686q) obj).f47563e;
    }

    public int hashCode() {
        return this.f47563e.hashCode();
    }
}
