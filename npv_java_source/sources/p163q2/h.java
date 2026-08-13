package p163q2;

/* JADX INFO: loaded from: classes.dex */
final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f53075a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p237x7.a f53076b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final V8.c f53077c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final p163q2.f[] f53078d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Y8.j f53079e;

    static final class a extends p247y7.AbstractC7352v implements p237x7.l {
        a() {
            super(1);
        }

        public final void a(p163q2.f fVar) {
            p247y7.AbstractC7350t.f(fVar, "it");
            p163q2.h.this.d(fVar);
        }

        @Override // p237x7.l
        public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
            a((p163q2.f) obj);
            return p087i7.M.f46721a;
        }
    }

    public h(int i6, p237x7.a aVar) {
        p247y7.AbstractC7350t.f(aVar, "connectionFactory");
        this.f53075a = i6;
        this.f53076b = aVar;
        this.f53077c = V8.b.c(0);
        this.f53078d = new p163q2.f[i6];
        this.f53079e = Y8.m.b(i6, null, new q2.h.a(), 2, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void e() {
        int iC = this.f53077c.c();
        if (iC >= this.f53075a) {
            return;
        }
        if (!this.f53077c.a(iC, iC + 1)) {
            e();
            return;
        }
        p163q2.f fVar = new p163q2.f((p243y2.b) this.f53076b.b(), null, 2, 0 == true ? 1 : 0);
        java.lang.Object objJ = this.f53079e.j(fVar);
        if (Y8.n.j(objJ)) {
            this.f53078d[iC] = fVar;
            return;
        }
        fVar.close();
        if (!Y8.n.i(objJ)) {
            throw new java.lang.IllegalStateException("Couldn't send a new connection for acquisition".toString());
        }
    }

    public final java.lang.Object a(p127m7.e eVar) {
        java.lang.Object objA = this.f53079e.a();
        if (Y8.n.j(objA)) {
            return (p163q2.f) Y8.n.g(objA);
        }
        e();
        return this.f53079e.b(eVar);
    }

    public final void b() {
        Y8.C.a.a(this.f53079e, null, 1, null);
        for (p163q2.f fVar : this.f53078d) {
            if (fVar != null) {
                fVar.close();
            }
        }
    }

    public final void c(java.lang.StringBuilder sb) {
        p247y7.AbstractC7350t.f(sb, "builder");
        sb.append('\t' + super.toString() + " (capacity=" + this.f53075a + ')');
        p247y7.AbstractC7350t.e(sb, "append(value)");
        sb.append('\n');
        p247y7.AbstractC7350t.e(sb, "append('\\n')");
        p163q2.f[] fVarArr = this.f53078d;
        int length = fVarArr.length;
        int i6 = 0;
        for (int i10 = 0; i10 < length; i10++) {
            p163q2.f fVar = fVarArr[i10];
            i6++;
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            sb2.append("\t\t[");
            sb2.append(i6);
            sb2.append("] - ");
            sb2.append(fVar != null ? fVar.toString() : null);
            sb.append(sb2.toString());
            p247y7.AbstractC7350t.e(sb, "append(value)");
            sb.append('\n');
            p247y7.AbstractC7350t.e(sb, "append('\\n')");
            if (fVar != null) {
                fVar.f(sb);
            }
        }
    }

    public final void d(p163q2.f fVar) {
        p247y7.AbstractC7350t.f(fVar, "connection");
        java.lang.Object objJ = this.f53079e.j(fVar);
        if (Y8.n.j(objJ)) {
            return;
        }
        fVar.close();
        if (!Y8.n.i(objJ)) {
            throw new java.lang.IllegalStateException("Couldn't recycle connection".toString());
        }
    }
}
