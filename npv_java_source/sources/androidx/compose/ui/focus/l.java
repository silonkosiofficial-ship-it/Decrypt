package androidx.compose.ui.focus;

/* JADX INFO: loaded from: classes.dex */
public abstract class l {

    static final class a implements p121m0.l, p247y7.InterfaceC7345n {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        private final /* synthetic */ p237x7.l f19696C;

        a(p237x7.l lVar) {
            this.f19696C = lVar;
        }

        @Override // p121m0.l
        public final /* synthetic */ void a(androidx.compose.ui.focus.j jVar) {
            this.f19696C.l(jVar);
        }

        @Override // p247y7.InterfaceC7345n
        public final p087i7.InterfaceC6663i b() {
            return this.f19696C;
        }

        public final boolean equals(java.lang.Object obj) {
            if ((obj instanceof p121m0.l) && (obj instanceof p247y7.InterfaceC7345n)) {
                return p247y7.AbstractC7350t.b(b(), ((p247y7.InterfaceC7345n) obj).b());
            }
            return false;
        }

        public final int hashCode() {
            return b().hashCode();
        }
    }

    public static final androidx.compose.ui.d a(androidx.compose.ui.d dVar, p237x7.l lVar) {
        return dVar.b(new androidx.compose.ui.focus.FocusPropertiesElement(new androidx.compose.ui.focus.l.a(lVar)));
    }
}
