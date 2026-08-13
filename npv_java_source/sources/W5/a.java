package W5;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends W5.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.List f15343a;

    public a() {
        this.f15343a = new java.util.ArrayList();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(W5.e... eVarArr) {
        this();
        p247y7.AbstractC7350t.f(eVarArr, "translators");
        p097j7.AbstractC6879v.D(this.f15343a, eVarArr);
    }

    @Override // W5.e
    public int a(java.lang.String str, int i6, java.lang.StringBuilder sb) {
        p247y7.AbstractC7350t.f(str, "input");
        p247y7.AbstractC7350t.f(sb, "stringBuilder");
        java.util.Iterator it = this.f15343a.iterator();
        while (it.hasNext()) {
            int iA = ((W5.e) it.next()).a(str, i6, sb);
            if (iA != 0) {
                return iA;
            }
        }
        return 0;
    }
}
