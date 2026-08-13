package S5;

/* JADX INFO: renamed from: S5.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1618a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.String f12481a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.lang.String f12482b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.lang.String f12483c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final java.lang.String f12484d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final S5.u f12485e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final java.util.List f12486f;

    public C1618a(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, S5.u uVar, java.util.List list) {
        p247y7.AbstractC7350t.f(str, "packageName");
        p247y7.AbstractC7350t.f(str2, "versionName");
        p247y7.AbstractC7350t.f(str3, "appBuildVersion");
        p247y7.AbstractC7350t.f(str4, "deviceManufacturer");
        p247y7.AbstractC7350t.f(uVar, "currentProcessDetails");
        p247y7.AbstractC7350t.f(list, "appProcessDetails");
        this.f12481a = str;
        this.f12482b = str2;
        this.f12483c = str3;
        this.f12484d = str4;
        this.f12485e = uVar;
        this.f12486f = list;
    }

    public final java.lang.String a() {
        return this.f12483c;
    }

    public final java.util.List b() {
        return this.f12486f;
    }

    public final S5.u c() {
        return this.f12485e;
    }

    public final java.lang.String d() {
        return this.f12484d;
    }

    public final java.lang.String e() {
        return this.f12481a;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof S5.C1618a)) {
            return false;
        }
        S5.C1618a c1618a = (S5.C1618a) obj;
        return p247y7.AbstractC7350t.b(this.f12481a, c1618a.f12481a) && p247y7.AbstractC7350t.b(this.f12482b, c1618a.f12482b) && p247y7.AbstractC7350t.b(this.f12483c, c1618a.f12483c) && p247y7.AbstractC7350t.b(this.f12484d, c1618a.f12484d) && p247y7.AbstractC7350t.b(this.f12485e, c1618a.f12485e) && p247y7.AbstractC7350t.b(this.f12486f, c1618a.f12486f);
    }

    public final java.lang.String f() {
        return this.f12482b;
    }

    public int hashCode() {
        return (((((((((this.f12481a.hashCode() * 31) + this.f12482b.hashCode()) * 31) + this.f12483c.hashCode()) * 31) + this.f12484d.hashCode()) * 31) + this.f12485e.hashCode()) * 31) + this.f12486f.hashCode();
    }

    public java.lang.String toString() {
        return "AndroidApplicationInfo(packageName=" + this.f12481a + ", versionName=" + this.f12482b + ", appBuildVersion=" + this.f12483c + ", deviceManufacturer=" + this.f12484d + ", currentProcessDetails=" + this.f12485e + ", appProcessDetails=" + this.f12486f + ')';
    }
}
