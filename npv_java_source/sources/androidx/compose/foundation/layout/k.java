package androidx.compose.foundation.layout;

/* JADX INFO: loaded from: classes.dex */
public abstract class k {

    static final class a extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ p237x7.l f19268D;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(p237x7.l lVar) {
            super(1);
            this.f19268D = lVar;
        }

        public final void a(androidx.compose.ui.platform.G0 g6) {
            throw null;
        }

        @Override // p237x7.l
        public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
            androidx.appcompat.app.D.a(obj);
            a(null);
            return p087i7.M.f46721a;
        }
    }

    public static final androidx.compose.ui.d a(androidx.compose.ui.d dVar, p237x7.l lVar) {
        return dVar.b(new androidx.compose.foundation.layout.OffsetPxElement(lVar, true, new androidx.compose.foundation.layout.k.a(lVar)));
    }
}
