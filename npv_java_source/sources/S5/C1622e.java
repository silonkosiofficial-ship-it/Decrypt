package S5;

/* JADX INFO: renamed from: S5.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1622e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final S5.EnumC1621d f12537a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final S5.EnumC1621d f12538b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final double f12539c;

    public C1622e(S5.EnumC1621d enumC1621d, S5.EnumC1621d enumC1621d2, double d6) {
        p247y7.AbstractC7350t.f(enumC1621d, "performance");
        p247y7.AbstractC7350t.f(enumC1621d2, "crashlytics");
        this.f12537a = enumC1621d;
        this.f12538b = enumC1621d2;
        this.f12539c = d6;
    }

    public final S5.EnumC1621d a() {
        return this.f12538b;
    }

    public final S5.EnumC1621d b() {
        return this.f12537a;
    }

    public final double c() {
        return this.f12539c;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof S5.C1622e)) {
            return false;
        }
        S5.C1622e c1622e = (S5.C1622e) obj;
        return this.f12537a == c1622e.f12537a && this.f12538b == c1622e.f12538b && java.lang.Double.compare(this.f12539c, c1622e.f12539c) == 0;
    }

    public int hashCode() {
        return (((this.f12537a.hashCode() * 31) + this.f12538b.hashCode()) * 31) + p200u.AbstractC7195w.a(this.f12539c);
    }

    public java.lang.String toString() {
        return "DataCollectionStatus(performance=" + this.f12537a + ", crashlytics=" + this.f12538b + ", sessionSamplingRate=" + this.f12539c + ')';
    }
}
