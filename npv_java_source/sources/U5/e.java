package U5;

/* JADX INFO: loaded from: classes3.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.Boolean f14510a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.lang.Double f14511b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.lang.Integer f14512c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final java.lang.Integer f14513d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final java.lang.Long f14514e;

    public e(java.lang.Boolean bool, java.lang.Double d6, java.lang.Integer num, java.lang.Integer num2, java.lang.Long l6) {
        this.f14510a = bool;
        this.f14511b = d6;
        this.f14512c = num;
        this.f14513d = num2;
        this.f14514e = l6;
    }

    public final java.lang.Integer a() {
        return this.f14513d;
    }

    public final java.lang.Long b() {
        return this.f14514e;
    }

    public final java.lang.Boolean c() {
        return this.f14510a;
    }

    public final java.lang.Integer d() {
        return this.f14512c;
    }

    public final java.lang.Double e() {
        return this.f14511b;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof U5.e)) {
            return false;
        }
        U5.e eVar = (U5.e) obj;
        return p247y7.AbstractC7350t.b(this.f14510a, eVar.f14510a) && p247y7.AbstractC7350t.b(this.f14511b, eVar.f14511b) && p247y7.AbstractC7350t.b(this.f14512c, eVar.f14512c) && p247y7.AbstractC7350t.b(this.f14513d, eVar.f14513d) && p247y7.AbstractC7350t.b(this.f14514e, eVar.f14514e);
    }

    public int hashCode() {
        java.lang.Boolean bool = this.f14510a;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        java.lang.Double d6 = this.f14511b;
        int iHashCode2 = (iHashCode + (d6 == null ? 0 : d6.hashCode())) * 31;
        java.lang.Integer num = this.f14512c;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        java.lang.Integer num2 = this.f14513d;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        java.lang.Long l6 = this.f14514e;
        return iHashCode4 + (l6 != null ? l6.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "SessionConfigs(sessionEnabled=" + this.f14510a + ", sessionSamplingRate=" + this.f14511b + ", sessionRestartTimeout=" + this.f14512c + ", cacheDuration=" + this.f14513d + ", cacheUpdatedTime=" + this.f14514e + ')';
    }
}
