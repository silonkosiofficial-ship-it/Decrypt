package androidx.privacysandbox.ads.adservices.topics;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.String f22887a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f22888b;

    /* JADX INFO: renamed from: androidx.privacysandbox.ads.adservices.topics.a$a, reason: collision with other inner class name */
    public static final class C0433a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private java.lang.String f22889a = "";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f22890b = true;

        public final androidx.privacysandbox.ads.adservices.topics.a a() {
            if (this.f22889a.length() > 0) {
                return new androidx.privacysandbox.ads.adservices.topics.a(this.f22889a, this.f22890b);
            }
            throw new java.lang.IllegalStateException("adsSdkName must be set".toString());
        }

        public final androidx.privacysandbox.ads.adservices.topics.a.C0433a b(java.lang.String str) {
            p247y7.AbstractC7350t.f(str, "adsSdkName");
            this.f22889a = str;
            return this;
        }

        public final androidx.privacysandbox.ads.adservices.topics.a.C0433a c(boolean z6) {
            this.f22890b = z6;
            return this;
        }
    }

    public a(java.lang.String str, boolean z6) {
        p247y7.AbstractC7350t.f(str, "adsSdkName");
        this.f22887a = str;
        this.f22888b = z6;
    }

    public final java.lang.String a() {
        return this.f22887a;
    }

    public final boolean b() {
        return this.f22888b;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof androidx.privacysandbox.ads.adservices.topics.a)) {
            return false;
        }
        androidx.privacysandbox.ads.adservices.topics.a aVar = (androidx.privacysandbox.ads.adservices.topics.a) obj;
        return p247y7.AbstractC7350t.b(this.f22887a, aVar.f22887a) && this.f22888b == aVar.f22888b;
    }

    public int hashCode() {
        return (this.f22887a.hashCode() * 31) + p190t.h.a(this.f22888b);
    }

    public java.lang.String toString() {
        return "GetTopicsRequest: adsSdkName=" + this.f22887a + ", shouldRecordObservation=" + this.f22888b;
    }
}
