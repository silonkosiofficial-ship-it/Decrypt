package androidx.privacysandbox.ads.adservices.topics;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f22892a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f22893b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f22894c;

    public c(long j6, long j10, int i6) {
        this.f22892a = j6;
        this.f22893b = j10;
        this.f22894c = i6;
    }

    public final long a() {
        return this.f22893b;
    }

    public final long b() {
        return this.f22892a;
    }

    public final int c() {
        return this.f22894c;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof androidx.privacysandbox.ads.adservices.topics.c)) {
            return false;
        }
        androidx.privacysandbox.ads.adservices.topics.c cVar = (androidx.privacysandbox.ads.adservices.topics.c) obj;
        return this.f22892a == cVar.f22892a && this.f22893b == cVar.f22893b && this.f22894c == cVar.f22894c;
    }

    public int hashCode() {
        return (((p170r.r.a(this.f22892a) * 31) + p170r.r.a(this.f22893b)) * 31) + this.f22894c;
    }

    public java.lang.String toString() {
        return "Topic { " + ("TaxonomyVersion=" + this.f22892a + ", ModelVersion=" + this.f22893b + ", TopicCode=" + this.f22894c + " }");
    }
}
