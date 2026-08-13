package p121m0;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p237x7.l f50208a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p237x7.a f50209b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p170r.L f50210c = p170r.X.a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final p170r.L f50211d = p170r.X.a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final p170r.L f50212e = p170r.X.a();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final p170r.L f50213f = p170r.X.a();

    /* synthetic */ class a extends p247y7.C7348q implements p237x7.a {
        a(java.lang.Object obj) {
            super(0, obj, p121m0.d.class, "invalidateNodes", "invalidateNodes()V", 0);
        }

        @Override // p237x7.a
        public /* bridge */ /* synthetic */ java.lang.Object b() {
            s();
            return p087i7.M.f46721a;
        }

        public final void s() {
            ((p121m0.d) this.f57287D).c();
        }
    }

    public d(p237x7.l lVar, p237x7.a aVar) {
        this.f50208a = lVar;
        this.f50209b = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:270:0x00ea A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:52:0x00f7  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:53:0x0109 -> B:48:0x00ea). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final void c() {
        /*
            Method dump skipped, instruction units count: 1187
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p121m0.d.c():void");
    }

    private final void g(p170r.L l6, java.lang.Object obj) {
        if (l6.h(obj) && this.f50210c.c() + this.f50211d.c() + this.f50212e.c() == 1) {
            this.f50208a.l(new m0.d.a(this));
        }
    }

    public final boolean b() {
        return this.f50210c.e() || this.f50212e.e() || this.f50211d.e();
    }

    public final void d(androidx.compose.ui.focus.FocusTargetNode focusTargetNode) {
        g(this.f50210c, focusTargetNode);
    }

    public final void e(p121m0.b bVar) {
        g(this.f50211d, bVar);
    }

    public final void f(p121m0.j jVar) {
        g(this.f50212e, jVar);
    }
}
