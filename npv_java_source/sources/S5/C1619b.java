package S5;

/* JADX INFO: renamed from: S5.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1619b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.String f12487a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.lang.String f12488b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.lang.String f12489c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final java.lang.String f12490d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final S5.t f12491e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final S5.C1618a f12492f;

    public C1619b(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, S5.t tVar, S5.C1618a c1618a) {
        p247y7.AbstractC7350t.f(str, "appId");
        p247y7.AbstractC7350t.f(str2, "deviceModel");
        p247y7.AbstractC7350t.f(str3, "sessionSdkVersion");
        p247y7.AbstractC7350t.f(str4, "osVersion");
        p247y7.AbstractC7350t.f(tVar, "logEnvironment");
        p247y7.AbstractC7350t.f(c1618a, "androidAppInfo");
        this.f12487a = str;
        this.f12488b = str2;
        this.f12489c = str3;
        this.f12490d = str4;
        this.f12491e = tVar;
        this.f12492f = c1618a;
    }

    public final S5.C1618a a() {
        return this.f12492f;
    }

    public final java.lang.String b() {
        return this.f12487a;
    }

    public final java.lang.String c() {
        return this.f12488b;
    }

    public final S5.t d() {
        return this.f12491e;
    }

    public final java.lang.String e() {
        return this.f12490d;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof S5.C1619b)) {
            return false;
        }
        S5.C1619b c1619b = (S5.C1619b) obj;
        return p247y7.AbstractC7350t.b(this.f12487a, c1619b.f12487a) && p247y7.AbstractC7350t.b(this.f12488b, c1619b.f12488b) && p247y7.AbstractC7350t.b(this.f12489c, c1619b.f12489c) && p247y7.AbstractC7350t.b(this.f12490d, c1619b.f12490d) && this.f12491e == c1619b.f12491e && p247y7.AbstractC7350t.b(this.f12492f, c1619b.f12492f);
    }

    public final java.lang.String f() {
        return this.f12489c;
    }

    public int hashCode() {
        return (((((((((this.f12487a.hashCode() * 31) + this.f12488b.hashCode()) * 31) + this.f12489c.hashCode()) * 31) + this.f12490d.hashCode()) * 31) + this.f12491e.hashCode()) * 31) + this.f12492f.hashCode();
    }

    public java.lang.String toString() {
        return "ApplicationInfo(appId=" + this.f12487a + ", deviceModel=" + this.f12488b + ", sessionSdkVersion=" + this.f12489c + ", osVersion=" + this.f12490d + ", logEnvironment=" + this.f12491e + ", androidAppInfo=" + this.f12492f + ')';
    }
}
