package androidx.compose.ui.platform;

/* JADX INFO: loaded from: classes.dex */
final class DragAndDropModifierOnDragListener implements android.view.View.OnDragListener, p101k0.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p237x7.q f19850a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p101k0.e f19851b = new p101k0.e(androidx.compose.ui.platform.DragAndDropModifierOnDragListener.a.f19854D);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p170r.C7027b f19852c = new p170r.C7027b(0, 1, null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final androidx.compose.ui.d f19853d = new F0.W() { // from class: androidx.compose.ui.platform.DragAndDropModifierOnDragListener$modifier$1
        public boolean equals(java.lang.Object obj) {
            return obj == this;
        }

        public int hashCode() {
            return this.f19855b.f19851b.hashCode();
        }

        @Override // F0.W
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public p101k0.e g() {
            return this.f19855b.f19851b;
        }

        @Override // F0.W
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public void j(p101k0.e eVar) {
        }
    };

    static final class a extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final androidx.compose.ui.platform.DragAndDropModifierOnDragListener.a f19854D = new androidx.compose.ui.platform.DragAndDropModifierOnDragListener.a();

        a() {
            super(1);
        }

        @Override // p237x7.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final p101k0.g l(p101k0.b bVar) {
            return null;
        }
    }

    public DragAndDropModifierOnDragListener(p237x7.q qVar) {
        this.f19850a = qVar;
    }

    @Override // p101k0.c
    public void a(p101k0.d dVar) {
        this.f19852c.add(dVar);
    }

    @Override // p101k0.c
    public boolean b(p101k0.d dVar) {
        return this.f19852c.contains(dVar);
    }

    public androidx.compose.ui.d d() {
        return this.f19853d;
    }

    @Override // android.view.View.OnDragListener
    public boolean onDrag(android.view.View view, android.view.DragEvent dragEvent) {
        p101k0.b bVar = new p101k0.b(dragEvent);
        switch (dragEvent.getAction()) {
            case 1:
                boolean zT1 = this.f19851b.T1(bVar);
                java.util.Iterator<E> it = this.f19852c.iterator();
                while (it.hasNext()) {
                    ((p101k0.d) it.next()).S(bVar);
                }
                return zT1;
            case 2:
                this.f19851b.U(bVar);
                return false;
            case 3:
                return this.f19851b.n1(bVar);
            case 4:
                this.f19851b.c0(bVar);
                return false;
            case 5:
                this.f19851b.x0(bVar);
                return false;
            case 6:
                this.f19851b.a1(bVar);
                return false;
            default:
                return false;
        }
    }
}
