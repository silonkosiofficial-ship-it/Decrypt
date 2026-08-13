package p223w2;

/* JADX INFO: loaded from: classes.dex */
final class f implements java.lang.Comparable {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final int f56188C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final int f56189D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final java.lang.String f56190E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final java.lang.String f56191F;

    public f(int i6, int i10, java.lang.String str, java.lang.String str2) {
        p247y7.AbstractC7350t.f(str, "from");
        p247y7.AbstractC7350t.f(str2, "to");
        this.f56188C = i6;
        this.f56189D = i10;
        this.f56190E = str;
        this.f56191F = str2;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public int compareTo(p223w2.f fVar) {
        p247y7.AbstractC7350t.f(fVar, "other");
        int i6 = this.f56188C - fVar.f56188C;
        return i6 == 0 ? this.f56189D - fVar.f56189D : i6;
    }

    public final java.lang.String g() {
        return this.f56190E;
    }

    public final int i() {
        return this.f56188C;
    }

    public final java.lang.String m() {
        return this.f56191F;
    }
}
