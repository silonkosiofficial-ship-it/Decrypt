package p210v;

/* JADX INFO: renamed from: v.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C7210d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private p141o0.E1 f55680a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private p141o0.InterfaceC6993q0 f55681b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private p161q0.a f55682c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private p141o0.Q1 f55683d;

    public C7210d(p141o0.E1 e6, p141o0.InterfaceC6993q0 interfaceC6993q0, p161q0.a aVar, p141o0.Q1 q6) {
        this.f55680a = e6;
        this.f55681b = interfaceC6993q0;
        this.f55682c = aVar;
        this.f55683d = q6;
    }

    public /* synthetic */ C7210d(p141o0.E1 e6, p141o0.InterfaceC6993q0 interfaceC6993q0, p161q0.a aVar, p141o0.Q1 q6, int i6, p247y7.AbstractC7342k abstractC7342k) {
        this((i6 & 1) != 0 ? null : e6, (i6 & 2) != 0 ? null : interfaceC6993q0, (i6 & 4) != 0 ? null : aVar, (i6 & 8) != 0 ? null : q6);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p210v.C7210d)) {
            return false;
        }
        p210v.C7210d c7210d = (p210v.C7210d) obj;
        return p247y7.AbstractC7350t.b(this.f55680a, c7210d.f55680a) && p247y7.AbstractC7350t.b(this.f55681b, c7210d.f55681b) && p247y7.AbstractC7350t.b(this.f55682c, c7210d.f55682c) && p247y7.AbstractC7350t.b(this.f55683d, c7210d.f55683d);
    }

    public final p141o0.Q1 g() {
        p141o0.Q1 q6 = this.f55683d;
        if (q6 != null) {
            return q6;
        }
        p141o0.Q1 q1A = p141o0.Y.a();
        this.f55683d = q1A;
        return q1A;
    }

    public int hashCode() {
        p141o0.E1 e6 = this.f55680a;
        int iHashCode = (e6 == null ? 0 : e6.hashCode()) * 31;
        p141o0.InterfaceC6993q0 interfaceC6993q0 = this.f55681b;
        int iHashCode2 = (iHashCode + (interfaceC6993q0 == null ? 0 : interfaceC6993q0.hashCode())) * 31;
        p161q0.a aVar = this.f55682c;
        int iHashCode3 = (iHashCode2 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        p141o0.Q1 q6 = this.f55683d;
        return iHashCode3 + (q6 != null ? q6.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "BorderCache(imageBitmap=" + this.f55680a + ", canvas=" + this.f55681b + ", canvasDrawScope=" + this.f55682c + ", borderPath=" + this.f55683d + ')';
    }
}
