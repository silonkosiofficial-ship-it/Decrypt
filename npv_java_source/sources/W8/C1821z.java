package W8;

/* JADX INFO: renamed from: W8.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C1821z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.Object f15539a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final W8.InterfaceC1792k f15540b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p237x7.q f15541c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.lang.Object f15542d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final java.lang.Throwable f15543e;

    public C1821z(java.lang.Object obj, W8.InterfaceC1792k interfaceC1792k, p237x7.q qVar, java.lang.Object obj2, java.lang.Throwable th) {
        this.f15539a = obj;
        this.f15540b = interfaceC1792k;
        this.f15541c = qVar;
        this.f15542d = obj2;
        this.f15543e = th;
    }

    public /* synthetic */ C1821z(java.lang.Object obj, W8.InterfaceC1792k interfaceC1792k, p237x7.q qVar, java.lang.Object obj2, java.lang.Throwable th, int i6, p247y7.AbstractC7342k abstractC7342k) {
        this(obj, (i6 & 2) != 0 ? null : interfaceC1792k, (i6 & 4) != 0 ? null : qVar, (i6 & 8) != 0 ? null : obj2, (i6 & 16) != 0 ? null : th);
    }

    public static /* synthetic */ W8.C1821z b(W8.C1821z c1821z, java.lang.Object obj, W8.InterfaceC1792k interfaceC1792k, p237x7.q qVar, java.lang.Object obj2, java.lang.Throwable th, int i6, java.lang.Object obj3) {
        if ((i6 & 1) != 0) {
            obj = c1821z.f15539a;
        }
        if ((i6 & 2) != 0) {
            interfaceC1792k = c1821z.f15540b;
        }
        W8.InterfaceC1792k interfaceC1792k2 = interfaceC1792k;
        if ((i6 & 4) != 0) {
            qVar = c1821z.f15541c;
        }
        p237x7.q qVar2 = qVar;
        if ((i6 & 8) != 0) {
            obj2 = c1821z.f15542d;
        }
        java.lang.Object obj4 = obj2;
        if ((i6 & 16) != 0) {
            th = c1821z.f15543e;
        }
        return c1821z.a(obj, interfaceC1792k2, qVar2, obj4, th);
    }

    public final W8.C1821z a(java.lang.Object obj, W8.InterfaceC1792k interfaceC1792k, p237x7.q qVar, java.lang.Object obj2, java.lang.Throwable th) {
        return new W8.C1821z(obj, interfaceC1792k, qVar, obj2, th);
    }

    public final boolean c() {
        return this.f15543e != null;
    }

    public final void d(W8.C1798n c1798n, java.lang.Throwable th) {
        W8.InterfaceC1792k interfaceC1792k = this.f15540b;
        if (interfaceC1792k != null) {
            c1798n.m(interfaceC1792k, th);
        }
        p237x7.q qVar = this.f15541c;
        if (qVar != null) {
            c1798n.n(qVar, th, this.f15539a);
        }
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof W8.C1821z)) {
            return false;
        }
        W8.C1821z c1821z = (W8.C1821z) obj;
        return p247y7.AbstractC7350t.b(this.f15539a, c1821z.f15539a) && p247y7.AbstractC7350t.b(this.f15540b, c1821z.f15540b) && p247y7.AbstractC7350t.b(this.f15541c, c1821z.f15541c) && p247y7.AbstractC7350t.b(this.f15542d, c1821z.f15542d) && p247y7.AbstractC7350t.b(this.f15543e, c1821z.f15543e);
    }

    public int hashCode() {
        java.lang.Object obj = this.f15539a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        W8.InterfaceC1792k interfaceC1792k = this.f15540b;
        int iHashCode2 = (iHashCode + (interfaceC1792k == null ? 0 : interfaceC1792k.hashCode())) * 31;
        p237x7.q qVar = this.f15541c;
        int iHashCode3 = (iHashCode2 + (qVar == null ? 0 : qVar.hashCode())) * 31;
        java.lang.Object obj2 = this.f15542d;
        int iHashCode4 = (iHashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        java.lang.Throwable th = this.f15543e;
        return iHashCode4 + (th != null ? th.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "CompletedContinuation(result=" + this.f15539a + ", cancelHandler=" + this.f15540b + ", onCancellation=" + this.f15541c + ", idempotentResume=" + this.f15542d + ", cancelCause=" + this.f15543e + ')';
    }
}
