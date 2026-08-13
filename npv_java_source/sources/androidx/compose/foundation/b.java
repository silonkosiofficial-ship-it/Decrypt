package androidx.compose.foundation;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    public static final class a extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ long f18911D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ p141o0.e2 f18912E;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(long j6, p141o0.e2 e2Var) {
            super(1);
            this.f18911D = j6;
            this.f18912E = e2Var;
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

    public static final androidx.compose.ui.d a(androidx.compose.ui.d dVar, long j6, p141o0.e2 e2Var) {
        return dVar.b(new androidx.compose.foundation.BackgroundElement(j6, null, 1.0f, e2Var, androidx.compose.ui.platform.E0.b() ? new androidx.compose.foundation.b.a(j6, e2Var) : androidx.compose.ui.platform.E0.a(), 2, null));
    }

    public static /* synthetic */ androidx.compose.ui.d b(androidx.compose.ui.d dVar, long j6, p141o0.e2 e2Var, int i6, java.lang.Object obj) {
        if ((i6 & 2) != 0) {
            e2Var = p141o0.Y1.a();
        }
        return a(dVar, j6, e2Var);
    }
}
