package p089i9;

/* JADX INFO: loaded from: classes2.dex */
final class G extends p109k9.E {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final p089i9.K f47348e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G(p089i9.K k6) {
        super(p089i9.C6678i.f47516a.c(), k6 == p089i9.K.ZERO ? 2 : 1, k6 == p089i9.K.SPACE ? 2 : null);
        p247y7.AbstractC7350t.f(k6, "padding");
        this.f47348e = k6;
    }

    public boolean equals(java.lang.Object obj) {
        return (obj instanceof p089i9.G) && this.f47348e == ((p089i9.G) obj).f47348e;
    }

    public int hashCode() {
        return this.f47348e.hashCode();
    }
}
