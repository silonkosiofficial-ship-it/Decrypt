package p163q2;

/* JADX INFO: loaded from: classes.dex */
final class f implements p243y2.b, p059f9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p243y2.b f53059a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p059f9.a f53060b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private p127m7.i f53061c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private java.lang.Throwable f53062d;

    public f(p243y2.b bVar, p059f9.a aVar) {
        p247y7.AbstractC7350t.f(bVar, "delegate");
        p247y7.AbstractC7350t.f(aVar, "lock");
        this.f53059a = bVar;
        this.f53060b = aVar;
    }

    public /* synthetic */ f(p243y2.b bVar, p059f9.a aVar, int i6, p247y7.AbstractC7342k abstractC7342k) {
        this(bVar, (i6 & 2) != 0 ? p059f9.g.b(false, 1, null) : aVar);
    }

    @Override // p059f9.a
    public boolean a(java.lang.Object obj) {
        return this.f53060b.a(obj);
    }

    @Override // p059f9.a
    public boolean b() {
        return this.f53060b.b();
    }

    @Override // p059f9.a
    public java.lang.Object c(java.lang.Object obj, p127m7.e eVar) {
        return this.f53060b.c(obj, eVar);
    }

    @Override // p243y2.b
    public void close() {
        this.f53059a.close();
    }

    @Override // p059f9.a
    public void d(java.lang.Object obj) {
        this.f53060b.d(obj);
    }

    @Override // p243y2.b
    public p243y2.e e(java.lang.String str) {
        p247y7.AbstractC7350t.f(str, "sql");
        return this.f53059a.e(str);
    }

    public final void f(java.lang.StringBuilder sb) {
        p247y7.AbstractC7350t.f(sb, "builder");
        if (this.f53061c == null && this.f53062d == null) {
            sb.append("\t\tStatus: Free connection");
            p247y7.AbstractC7350t.e(sb, "append(value)");
            sb.append('\n');
            p247y7.AbstractC7350t.e(sb, "append('\\n')");
            return;
        }
        sb.append("\t\tStatus: Acquired connection");
        p247y7.AbstractC7350t.e(sb, "append(value)");
        sb.append('\n');
        p247y7.AbstractC7350t.e(sb, "append('\\n')");
        p127m7.i iVar = this.f53061c;
        if (iVar != null) {
            sb.append("\t\tCoroutine: " + iVar);
            p247y7.AbstractC7350t.e(sb, "append(value)");
            sb.append('\n');
            p247y7.AbstractC7350t.e(sb, "append('\\n')");
        }
        java.lang.Throwable th = this.f53062d;
        if (th != null) {
            sb.append("\t\tAcquired:");
            p247y7.AbstractC7350t.e(sb, "append(value)");
            sb.append('\n');
            p247y7.AbstractC7350t.e(sb, "append('\\n')");
            java.util.Iterator it = p097j7.AbstractC6879v.c0(S8.r.z0(p087i7.AbstractC6661g.b(th)), 1).iterator();
            while (it.hasNext()) {
                sb.append("\t\t" + ((java.lang.String) it.next()));
                p247y7.AbstractC7350t.e(sb, "append(value)");
                sb.append('\n');
                p247y7.AbstractC7350t.e(sb, "append('\\n')");
            }
        }
    }

    public final p163q2.f g(p127m7.i iVar) {
        p247y7.AbstractC7350t.f(iVar, "context");
        this.f53061c = iVar;
        this.f53062d = new java.lang.Throwable();
        return this;
    }

    public final p163q2.f h() {
        this.f53061c = null;
        this.f53062d = null;
        return this;
    }

    public java.lang.String toString() {
        return this.f53059a.toString();
    }
}
