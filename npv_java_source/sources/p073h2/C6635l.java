package p073h2;

/* JADX INFO: renamed from: h2.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6635l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f46209a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p073h2.Z f46210b;

    public C6635l(int i6, p073h2.Z z6) {
        p247y7.AbstractC7350t.f(z6, "hint");
        this.f46209a = i6;
        this.f46210b = z6;
    }

    public final int a() {
        return this.f46209a;
    }

    public final p073h2.Z b() {
        return this.f46210b;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p073h2.C6635l)) {
            return false;
        }
        p073h2.C6635l c6635l = (p073h2.C6635l) obj;
        return this.f46209a == c6635l.f46209a && p247y7.AbstractC7350t.b(this.f46210b, c6635l.f46210b);
    }

    public int hashCode() {
        return (this.f46209a * 31) + this.f46210b.hashCode();
    }

    public java.lang.String toString() {
        return "GenerationalViewportHint(generationId=" + this.f46209a + ", hint=" + this.f46210b + ')';
    }
}
