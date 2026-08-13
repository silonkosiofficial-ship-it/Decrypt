package p031d0;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f44278a;

    public d(int i6) {
        this.f44278a = i6;
    }

    public /* synthetic */ d(int i6, int i10, p247y7.AbstractC7342k abstractC7342k) {
        this((i10 & 1) != 0 ? 0 : i6);
    }

    public final int a() {
        return this.f44278a;
    }

    public final void b(int i6) {
        this.f44278a = i6;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("IntRef(element = ");
        sb.append(this.f44278a);
        sb.append(")@");
        java.lang.String string = java.lang.Integer.toString(hashCode(), S8.AbstractC1628a.a(16));
        p247y7.AbstractC7350t.e(string, "toString(this, checkRadix(radix))");
        sb.append(string);
        return sb.toString();
    }
}
