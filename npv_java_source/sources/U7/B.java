package U7;

/* JADX INFO: loaded from: classes2.dex */
public final class B extends U7.p implements p048e8.B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final U7.z f14558a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.lang.annotation.Annotation[] f14559b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.lang.String f14560c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f14561d;

    public B(U7.z zVar, java.lang.annotation.Annotation[] annotationArr, java.lang.String str, boolean z6) {
        p247y7.AbstractC7350t.f(zVar, "type");
        p247y7.AbstractC7350t.f(annotationArr, "reflectAnnotations");
        this.f14558a = zVar;
        this.f14559b = annotationArr;
        this.f14560c = str;
        this.f14561d = z6;
    }

    @Override // p048e8.B
    /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
    public U7.z getType() {
        return this.f14558a;
    }

    @Override // p048e8.B
    public p138n8.f getName() {
        java.lang.String str = this.f14560c;
        if (str != null) {
            return p138n8.f.n(str);
        }
        return null;
    }

    @Override // p048e8.InterfaceC6538d
    public U7.e j(p138n8.c cVar) {
        p247y7.AbstractC7350t.f(cVar, "fqName");
        return U7.i.a(this.f14559b, cVar);
    }

    @Override // p048e8.InterfaceC6538d
    public java.util.List k() {
        return U7.i.b(this.f14559b);
    }

    @Override // p048e8.B
    public boolean m() {
        return this.f14561d;
    }

    @Override // p048e8.InterfaceC6538d
    public boolean o() {
        return false;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(U7.B.class.getName());
        sb.append(": ");
        sb.append(m() ? "vararg " : "");
        sb.append(getName());
        sb.append(": ");
        sb.append(getType());
        return sb.toString();
    }
}
