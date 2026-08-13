package C9;

/* JADX INFO: loaded from: classes2.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f1549a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f1550b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C9.B f1551c;

    public u(boolean z6, boolean z10, C9.B b6) {
        p247y7.AbstractC7350t.f(b6, "popUpTo");
        this.f1549a = z6;
        this.f1550b = z10;
        this.f1551c = b6;
    }

    public /* synthetic */ u(boolean z6, boolean z10, C9.B b6, int i6, p247y7.AbstractC7342k abstractC7342k) {
        this((i6 & 1) != 0 ? false : z6, (i6 & 2) != 0 ? false : z10, (i6 & 4) != 0 ? C9.B.b.f1385a : b6);
    }

    public final boolean a() {
        return this.f1550b;
    }

    public final boolean b() {
        return this.f1549a;
    }

    public final C9.B c() {
        return this.f1551c;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9.u)) {
            return false;
        }
        C9.u uVar = (C9.u) obj;
        return this.f1549a == uVar.f1549a && this.f1550b == uVar.f1550b && p247y7.AbstractC7350t.b(this.f1551c, uVar.f1551c);
    }

    public int hashCode() {
        return (((p190t.h.a(this.f1549a) * 31) + p190t.h.a(this.f1550b)) * 31) + this.f1551c.hashCode();
    }

    public java.lang.String toString() {
        return "NavOptions(launchSingleTop=" + this.f1549a + ", includePath=" + this.f1550b + ", popUpTo=" + this.f1551c + ")";
    }
}
