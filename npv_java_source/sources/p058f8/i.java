package p058f8;

/* JADX INFO: loaded from: classes2.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p058f8.h f45326a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f45327b;

    public i(p058f8.h hVar, boolean z6) {
        p247y7.AbstractC7350t.f(hVar, "qualifier");
        this.f45326a = hVar;
        this.f45327b = z6;
    }

    public /* synthetic */ i(p058f8.h hVar, boolean z6, int i6, p247y7.AbstractC7342k abstractC7342k) {
        this(hVar, (i6 & 2) != 0 ? false : z6);
    }

    public static /* synthetic */ p058f8.i b(p058f8.i iVar, p058f8.h hVar, boolean z6, int i6, java.lang.Object obj) {
        if ((i6 & 1) != 0) {
            hVar = iVar.f45326a;
        }
        if ((i6 & 2) != 0) {
            z6 = iVar.f45327b;
        }
        return iVar.a(hVar, z6);
    }

    public final p058f8.i a(p058f8.h hVar, boolean z6) {
        p247y7.AbstractC7350t.f(hVar, "qualifier");
        return new p058f8.i(hVar, z6);
    }

    public final p058f8.h c() {
        return this.f45326a;
    }

    public final boolean d() {
        return this.f45327b;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p058f8.i)) {
            return false;
        }
        p058f8.i iVar = (p058f8.i) obj;
        return this.f45326a == iVar.f45326a && this.f45327b == iVar.f45327b;
    }

    public int hashCode() {
        return (this.f45326a.hashCode() * 31) + p190t.h.a(this.f45327b);
    }

    public java.lang.String toString() {
        return "NullabilityQualifierWithMigrationStatus(qualifier=" + this.f45326a + ", isForWarningOnly=" + this.f45327b + ')';
    }
}
