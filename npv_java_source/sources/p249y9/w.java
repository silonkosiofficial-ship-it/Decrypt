package p249y9;

/* JADX INFO: loaded from: classes2.dex */
public final class w extends p249y9.F {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final boolean f57440C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final p219v9.f f57441D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final java.lang.String f57442E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(java.lang.Object obj, boolean z6, p219v9.f fVar) {
        super(null);
        p247y7.AbstractC7350t.f(obj, "body");
        this.f57440C = z6;
        this.f57441D = fVar;
        this.f57442E = obj.toString();
        if (fVar != null && !fVar.m()) {
            throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
        }
    }

    public /* synthetic */ w(java.lang.Object obj, boolean z6, p219v9.f fVar, int i6, p247y7.AbstractC7342k abstractC7342k) {
        this(obj, z6, (i6 & 4) != 0 ? null : fVar);
    }

    @Override // p249y9.F
    public java.lang.String d() {
        return this.f57442E;
    }

    public final p219v9.f e() {
        return this.f57441D;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || p249y9.w.class != obj.getClass()) {
            return false;
        }
        p249y9.w wVar = (p249y9.w) obj;
        return f() == wVar.f() && p247y7.AbstractC7350t.b(d(), wVar.d());
    }

    public boolean f() {
        return this.f57440C;
    }

    public int hashCode() {
        return (p190t.h.a(f()) * 31) + d().hashCode();
    }

    @Override // p249y9.F
    public java.lang.String toString() {
        if (!f()) {
            return d();
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        p258z9.e0.c(sb, d());
        return sb.toString();
    }
}
