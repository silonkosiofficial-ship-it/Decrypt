package p089i9;

/* JADX INFO: loaded from: classes2.dex */
final class r extends p109k9.r {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final p089i9.C6687s f47564d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(p089i9.C6687s c6687s) {
        super(p089i9.C6678i.f47516a.b(), c6687s.b(), "dayOfWeekName");
        p247y7.AbstractC7350t.f(c6687s, "names");
        this.f47564d = c6687s;
    }

    public boolean equals(java.lang.Object obj) {
        return (obj instanceof p089i9.r) && p247y7.AbstractC7350t.b(this.f47564d.b(), ((p089i9.r) obj).f47564d.b());
    }

    public int hashCode() {
        return this.f47564d.b().hashCode();
    }
}
