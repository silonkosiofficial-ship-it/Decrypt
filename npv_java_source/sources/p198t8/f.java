package p198t8;

/* JADX INFO: loaded from: classes2.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p138n8.b f54630a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f54631b;

    public f(p138n8.b bVar, int i6) {
        p247y7.AbstractC7350t.f(bVar, "classId");
        this.f54630a = bVar;
        this.f54631b = i6;
    }

    public final p138n8.b a() {
        return this.f54630a;
    }

    public final int b() {
        return this.f54631b;
    }

    public final int c() {
        return this.f54631b;
    }

    public final p138n8.b d() {
        return this.f54630a;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p198t8.f)) {
            return false;
        }
        p198t8.f fVar = (p198t8.f) obj;
        return p247y7.AbstractC7350t.b(this.f54630a, fVar.f54630a) && this.f54631b == fVar.f54631b;
    }

    public int hashCode() {
        return (this.f54630a.hashCode() * 31) + this.f54631b;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int i6 = this.f54631b;
        for (int i10 = 0; i10 < i6; i10++) {
            sb.append("kotlin/Array<");
        }
        sb.append(this.f54630a);
        int i11 = this.f54631b;
        for (int i12 = 0; i12 < i11; i12++) {
            sb.append(">");
        }
        java.lang.String string = sb.toString();
        p247y7.AbstractC7350t.e(string, "toString(...)");
        return string;
    }
}
