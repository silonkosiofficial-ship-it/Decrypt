package S5;

/* JADX INFO: loaded from: classes3.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.String f12606a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.lang.String f12607b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f12608c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f12609d;

    public y(java.lang.String str, java.lang.String str2, int i6, long j6) {
        p247y7.AbstractC7350t.f(str, "sessionId");
        p247y7.AbstractC7350t.f(str2, "firstSessionId");
        this.f12606a = str;
        this.f12607b = str2;
        this.f12608c = i6;
        this.f12609d = j6;
    }

    public final java.lang.String a() {
        return this.f12607b;
    }

    public final java.lang.String b() {
        return this.f12606a;
    }

    public final int c() {
        return this.f12608c;
    }

    public final long d() {
        return this.f12609d;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof S5.y)) {
            return false;
        }
        S5.y yVar = (S5.y) obj;
        return p247y7.AbstractC7350t.b(this.f12606a, yVar.f12606a) && p247y7.AbstractC7350t.b(this.f12607b, yVar.f12607b) && this.f12608c == yVar.f12608c && this.f12609d == yVar.f12609d;
    }

    public int hashCode() {
        return (((((this.f12606a.hashCode() * 31) + this.f12607b.hashCode()) * 31) + this.f12608c) * 31) + p170r.r.a(this.f12609d);
    }

    public java.lang.String toString() {
        return "SessionDetails(sessionId=" + this.f12606a + ", firstSessionId=" + this.f12607b + ", sessionIndex=" + this.f12608c + ", sessionStartTimestampUs=" + this.f12609d + ')';
    }
}
