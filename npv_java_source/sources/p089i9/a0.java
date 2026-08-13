package p089i9;

/* JADX INFO: loaded from: classes2.dex */
public final class a0 extends p109k9.E {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final p089i9.K f47504e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(p089i9.K k6) {
        super(p089i9.J.f47355a.c(), k6 == p089i9.K.ZERO ? 2 : 1, k6 == p089i9.K.SPACE ? 2 : null);
        p247y7.AbstractC7350t.f(k6, "padding");
        this.f47504e = k6;
    }

    public boolean equals(java.lang.Object obj) {
        return (obj instanceof p089i9.a0) && this.f47504e == ((p089i9.a0) obj).f47504e;
    }

    public int hashCode() {
        return this.f47504e.hashCode();
    }
}
