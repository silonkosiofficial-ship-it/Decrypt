package N4;

/* JADX INFO: renamed from: N4.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1417q extends N4.AbstractC1405e implements java.io.Serializable {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    final transient N4.AbstractC1416p f7777C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    final transient int f7778D;

    /* JADX INFO: renamed from: N4.q$a */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final java.util.Map f7779a = N4.H.c();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        java.util.Comparator f7780b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        java.util.Comparator f7781c;
    }

    AbstractC1417q(N4.AbstractC1416p abstractC1416p, int i6) {
        this.f7777C = abstractC1416p;
        this.f7778D = i6;
    }

    @Override // N4.AbstractC1404d
    public boolean b(java.lang.Object obj) {
        return obj != null && super.b(obj);
    }

    @Override // N4.AbstractC1404d, N4.A
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public N4.AbstractC1416p a() {
        return this.f7777C;
    }

    @Override // N4.AbstractC1404d
    public /* bridge */ /* synthetic */ boolean equals(java.lang.Object obj) {
        return super.equals(obj);
    }

    @Override // N4.AbstractC1404d
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // N4.AbstractC1404d
    public /* bridge */ /* synthetic */ java.lang.String toString() {
        return super.toString();
    }
}
