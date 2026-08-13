package P3;

/* JADX INFO: renamed from: P3.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1446b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f8310a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final O3.a f8311b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final O3.a.d f8312c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final java.lang.String f8313d;

    private C1446b(O3.a aVar, O3.a.d dVar, java.lang.String str) {
        this.f8311b = aVar;
        this.f8312c = dVar;
        this.f8313d = str;
        this.f8310a = Q3.AbstractC1475n.b(aVar, dVar, str);
    }

    public static P3.C1446b a(O3.a aVar, O3.a.d dVar, java.lang.String str) {
        return new P3.C1446b(aVar, dVar, str);
    }

    public final java.lang.String b() {
        return this.f8311b.c();
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof P3.C1446b)) {
            return false;
        }
        P3.C1446b c1446b = (P3.C1446b) obj;
        return Q3.AbstractC1475n.a(this.f8311b, c1446b.f8311b) && Q3.AbstractC1475n.a(this.f8312c, c1446b.f8312c) && Q3.AbstractC1475n.a(this.f8313d, c1446b.f8313d);
    }

    public final int hashCode() {
        return this.f8310a;
    }
}
