package T6;

/* JADX INFO: renamed from: T6.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1665m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.String f13182a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.lang.String f13183b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f13184c;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1665m(java.lang.String str, java.lang.String str2) {
        this(str, str2, false);
        p247y7.AbstractC7350t.f(str, "name");
        p247y7.AbstractC7350t.f(str2, "value");
    }

    public C1665m(java.lang.String str, java.lang.String str2, boolean z6) {
        p247y7.AbstractC7350t.f(str, "name");
        p247y7.AbstractC7350t.f(str2, "value");
        this.f13182a = str;
        this.f13183b = str2;
        this.f13184c = z6;
    }

    public final java.lang.String a() {
        return this.f13182a;
    }

    public final java.lang.String b() {
        return this.f13183b;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj instanceof T6.C1665m) {
            T6.C1665m c1665m = (T6.C1665m) obj;
            if (S8.r.K(c1665m.f13182a, this.f13182a, true) && S8.r.K(c1665m.f13183b, this.f13183b, true)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        java.lang.String str = this.f13182a;
        java.util.Locale locale = java.util.Locale.ROOT;
        java.lang.String lowerCase = str.toLowerCase(locale);
        p247y7.AbstractC7350t.e(lowerCase, "toLowerCase(...)");
        int iHashCode = lowerCase.hashCode();
        java.lang.String lowerCase2 = this.f13183b.toLowerCase(locale);
        p247y7.AbstractC7350t.e(lowerCase2, "toLowerCase(...)");
        return iHashCode + (iHashCode * 31) + lowerCase2.hashCode();
    }

    public java.lang.String toString() {
        return "HeaderValueParam(name=" + this.f13182a + ", value=" + this.f13183b + ", escapeValue=" + this.f13184c + ')';
    }
}
