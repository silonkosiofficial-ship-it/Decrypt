package p121m0;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class h {

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final class a extends p247y7.AbstractC7352v implements p237x7.a {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final m0.h.a f50215D = new m0.h.a();

        a() {
            super(0);
        }

        @Override // p237x7.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Boolean b() {
            return java.lang.Boolean.FALSE;
        }
    }

    public static /* synthetic */ boolean a(p121m0.i iVar, android.view.KeyEvent keyEvent, p237x7.a aVar, int i6, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: dispatchKeyEvent-YhN2O0w");
        }
        if ((i6 & 2) != 0) {
            aVar = m0.h.a.f50215D;
        }
        return iVar.j(keyEvent, aVar);
    }
}
