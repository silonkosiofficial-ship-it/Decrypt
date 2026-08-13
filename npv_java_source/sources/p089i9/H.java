package p089i9;

/* JADX INFO: loaded from: classes2.dex */
final class H extends p109k9.r {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final p089i9.I f47349d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H(p089i9.I i6) {
        super(p089i9.C6678i.f47516a.c(), i6.b(), "monthName");
        p247y7.AbstractC7350t.f(i6, "names");
        this.f47349d = i6;
    }

    public boolean equals(java.lang.Object obj) {
        return (obj instanceof p089i9.H) && p247y7.AbstractC7350t.b(this.f47349d.b(), ((p089i9.H) obj).f47349d.b());
    }

    public int hashCode() {
        return this.f47349d.b().hashCode();
    }
}
