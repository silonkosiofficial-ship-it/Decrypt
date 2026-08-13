package S;

/* JADX INFO: loaded from: classes.dex */
final class S implements S.Q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.String f10227a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.lang.String f10228b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.lang.String f10229c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final java.util.Map f10230d = new java.util.LinkedHashMap();

    public S(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.f10227a = str;
        this.f10228b = str2;
        this.f10229c = str3;
    }

    @Override // S.Q
    public java.lang.String a(java.lang.Long l6, java.util.Locale locale, boolean z6) {
        if (l6 == null) {
            return null;
        }
        return T.AbstractC1650i.b(l6.longValue(), z6 ? this.f10229c : this.f10228b, locale, this.f10230d);
    }

    @Override // S.Q
    public java.lang.String b(java.lang.Long l6, java.util.Locale locale) {
        if (l6 == null) {
            return null;
        }
        return T.AbstractC1650i.b(l6.longValue(), this.f10227a, locale, this.f10230d);
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof S.S)) {
            return false;
        }
        S.S s6 = (S.S) obj;
        return p247y7.AbstractC7350t.b(this.f10227a, s6.f10227a) && p247y7.AbstractC7350t.b(this.f10228b, s6.f10228b) && p247y7.AbstractC7350t.b(this.f10229c, s6.f10229c);
    }

    public int hashCode() {
        return (((this.f10227a.hashCode() * 31) + this.f10228b.hashCode()) * 31) + this.f10229c.hashCode();
    }
}
