package S5;

/* JADX INFO: loaded from: classes3.dex */
public final class C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.String f12455a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.lang.String f12456b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f12457c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f12458d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final S5.C1622e f12459e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final java.lang.String f12460f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final java.lang.String f12461g;

    public C(java.lang.String str, java.lang.String str2, int i6, long j6, S5.C1622e c1622e, java.lang.String str3, java.lang.String str4) {
        p247y7.AbstractC7350t.f(str, "sessionId");
        p247y7.AbstractC7350t.f(str2, "firstSessionId");
        p247y7.AbstractC7350t.f(c1622e, "dataCollectionStatus");
        p247y7.AbstractC7350t.f(str3, "firebaseInstallationId");
        p247y7.AbstractC7350t.f(str4, "firebaseAuthenticationToken");
        this.f12455a = str;
        this.f12456b = str2;
        this.f12457c = i6;
        this.f12458d = j6;
        this.f12459e = c1622e;
        this.f12460f = str3;
        this.f12461g = str4;
    }

    public final S5.C1622e a() {
        return this.f12459e;
    }

    public final long b() {
        return this.f12458d;
    }

    public final java.lang.String c() {
        return this.f12461g;
    }

    public final java.lang.String d() {
        return this.f12460f;
    }

    public final java.lang.String e() {
        return this.f12456b;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof S5.C)) {
            return false;
        }
        S5.C c6 = (S5.C) obj;
        return p247y7.AbstractC7350t.b(this.f12455a, c6.f12455a) && p247y7.AbstractC7350t.b(this.f12456b, c6.f12456b) && this.f12457c == c6.f12457c && this.f12458d == c6.f12458d && p247y7.AbstractC7350t.b(this.f12459e, c6.f12459e) && p247y7.AbstractC7350t.b(this.f12460f, c6.f12460f) && p247y7.AbstractC7350t.b(this.f12461g, c6.f12461g);
    }

    public final java.lang.String f() {
        return this.f12455a;
    }

    public final int g() {
        return this.f12457c;
    }

    public int hashCode() {
        return (((((((((((this.f12455a.hashCode() * 31) + this.f12456b.hashCode()) * 31) + this.f12457c) * 31) + p170r.r.a(this.f12458d)) * 31) + this.f12459e.hashCode()) * 31) + this.f12460f.hashCode()) * 31) + this.f12461g.hashCode();
    }

    public java.lang.String toString() {
        return "SessionInfo(sessionId=" + this.f12455a + ", firstSessionId=" + this.f12456b + ", sessionIndex=" + this.f12457c + ", eventTimestampUs=" + this.f12458d + ", dataCollectionStatus=" + this.f12459e + ", firebaseInstallationId=" + this.f12460f + ", firebaseAuthenticationToken=" + this.f12461g + ')';
    }
}
