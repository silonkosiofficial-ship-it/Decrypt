package H;

/* JADX INFO: loaded from: classes.dex */
public abstract class J {

    static final class a extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ p121m0.f f3684D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ H.C1230w f3685E;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(p121m0.f fVar, H.C1230w c1230w) {
            super(1);
            this.f3684D = fVar;
            this.f3685E = c1230w;
        }

        public final java.lang.Boolean a(android.view.KeyEvent keyEvent) {
            p121m0.f fVar;
            int iG;
            android.view.InputDevice device = keyEvent.getDevice();
            boolean zI = false;
            if (device != null && device.supportsSource(513) && !device.isVirtual() && p231x0.c.e(p231x0.d.b(keyEvent), p231x0.c.f56893a.a()) && keyEvent.getSource() != 257) {
                if (H.J.c(keyEvent, 19)) {
                    fVar = this.f3684D;
                    iG = androidx.compose.ui.focus.d.f19669b.h();
                } else if (H.J.c(keyEvent, 20)) {
                    fVar = this.f3684D;
                    iG = androidx.compose.ui.focus.d.f19669b.a();
                } else if (H.J.c(keyEvent, 21)) {
                    fVar = this.f3684D;
                    iG = androidx.compose.ui.focus.d.f19669b.d();
                } else if (H.J.c(keyEvent, 22)) {
                    fVar = this.f3684D;
                    iG = androidx.compose.ui.focus.d.f19669b.g();
                } else if (H.J.c(keyEvent, 23)) {
                    androidx.compose.ui.platform.InterfaceC1975s1 interfaceC1975s1H = this.f3685E.h();
                    if (interfaceC1975s1H != null) {
                        interfaceC1975s1H.b();
                    }
                    zI = true;
                }
                zI = fVar.i(iG);
            }
            return java.lang.Boolean.valueOf(zI);
        }

        @Override // p237x7.l
        public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
            return a(((p231x0.b) obj).f());
        }
    }

    public static final androidx.compose.ui.d b(androidx.compose.ui.d dVar, H.C1230w c1230w, p121m0.f fVar) {
        return androidx.compose.ui.input.key.a.b(dVar, new H.J.a(fVar, c1230w));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean c(android.view.KeyEvent keyEvent, int i6) {
        return p231x0.f.b(p231x0.d.a(keyEvent)) == i6;
    }
}
