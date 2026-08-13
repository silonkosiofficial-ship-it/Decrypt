package p223w2;

/* JADX INFO: loaded from: classes.dex */
public abstract class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final java.lang.String[] f56193a = new java.lang.String[0];

    public static final void a(java.lang.StringBuilder sb, int i6) {
        p247y7.AbstractC7350t.f(sb, "builder");
        for (int i10 = 0; i10 < i6; i10++) {
            sb.append("?");
            if (i10 < i6 - 1) {
                sb.append(",");
            }
        }
    }

    public static final java.lang.StringBuilder b() {
        return new java.lang.StringBuilder();
    }
}
