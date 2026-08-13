package p129m9;

/* JADX INFO: loaded from: classes2.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.List f51262a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.util.List f51263b;

    public q(java.util.List list, java.util.List list2) {
        p247y7.AbstractC7350t.f(list, "operations");
        p247y7.AbstractC7350t.f(list2, "followedBy");
        this.f51262a = list;
        this.f51263b = list2;
    }

    public final java.util.List a() {
        return this.f51263b;
    }

    public final java.util.List b() {
        return this.f51262a;
    }

    public java.lang.String toString() {
        return p097j7.AbstractC6879v.r0(this.f51262a, ", ", null, null, 0, null, null, 62, null) + '(' + p097j7.AbstractC6879v.r0(this.f51263b, ";", null, null, 0, null, null, 62, null) + ')';
    }
}
