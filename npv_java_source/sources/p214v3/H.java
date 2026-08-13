package p214v3;

/* JADX INFO: loaded from: classes.dex */
public final class H {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.List f55843a = new java.util.ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.util.List f55844b = new java.util.ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.util.List f55845c = new java.util.ArrayList();

    public final p214v3.H a(java.lang.String str, double d6, double d10) {
        int i6 = 0;
        while (i6 < this.f55843a.size()) {
            double dDoubleValue = ((java.lang.Double) this.f55845c.get(i6)).doubleValue();
            double dDoubleValue2 = ((java.lang.Double) this.f55844b.get(i6)).doubleValue();
            if (d6 < dDoubleValue || (dDoubleValue == d6 && d10 < dDoubleValue2)) {
                break;
            }
            i6++;
        }
        this.f55843a.add(i6, str);
        this.f55845c.add(i6, java.lang.Double.valueOf(d6));
        this.f55844b.add(i6, java.lang.Double.valueOf(d10));
        return this;
    }

    public final p214v3.J b() {
        return new p214v3.J(this, null);
    }
}
