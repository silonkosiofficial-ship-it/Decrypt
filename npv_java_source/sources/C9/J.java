package C9;

/* JADX INFO: loaded from: classes2.dex */
public final class J {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private java.util.ArrayList f1396a = new java.util.ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private java.util.ArrayList f1397b = new java.util.ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private java.util.LinkedHashMap f1398c = new java.util.LinkedHashMap();

    public final java.util.ArrayList a() {
        return this.f1397b;
    }

    public final java.util.LinkedHashMap b() {
        return this.f1398c;
    }

    public final java.util.ArrayList c() {
        return this.f1396a;
    }

    public final void d() {
        int iMin = java.lang.Math.min(this.f1397b.size(), this.f1396a.size());
        for (int i6 = 0; i6 < iMin; i6++) {
            this.f1398c.put(this.f1397b.get(i6), this.f1396a.get(i6));
        }
        for (int i10 = 0; i10 < iMin; i10++) {
            p097j7.AbstractC6879v.J(this.f1396a);
        }
    }

    public final void e() {
        if (!this.f1396a.isEmpty()) {
            p097j7.AbstractC6879v.L(this.f1396a);
        }
    }

    public final void f(int i6) {
        while (i6 < this.f1396a.size()) {
            this.f1396a.remove(i6);
            i6++;
        }
    }

    public final void g(java.lang.String str) {
        p247y7.AbstractC7350t.f(str, "value");
        this.f1396a.add(str);
    }
}
