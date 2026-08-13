package androidx.compose.foundation;

/* JADX INFO: loaded from: classes.dex */
public abstract class FocusableKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final androidx.compose.ui.platform.D0 f18837a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final androidx.compose.foundation.FocusableKt$FocusableInNonTouchModeElement$1 f18838b;

    public static final class a extends p247y7.AbstractC7352v implements p237x7.l {
        public a() {
            super(1);
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

    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.foundation.FocusableKt$FocusableInNonTouchModeElement$1] */
    static {
        f18837a = new androidx.compose.ui.platform.D0(androidx.compose.ui.platform.E0.b() ? new androidx.compose.foundation.FocusableKt.a() : androidx.compose.ui.platform.E0.a());
        f18838b = new F0.W() { // from class: androidx.compose.foundation.FocusableKt$FocusableInNonTouchModeElement$1
            public boolean equals(java.lang.Object obj) {
                return this == obj;
            }

            public int hashCode() {
                return p210v.B.a(this);
            }

            @Override // F0.W
            /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
            public p210v.C7229x g() {
                return new p210v.C7229x();
            }

            @Override // F0.W
            /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
            public void j(p210v.C7229x c7229x) {
            }
        };
    }

    public static final androidx.compose.ui.d a(androidx.compose.ui.d dVar, boolean z6, p250z.l lVar) {
        return dVar.b(z6 ? new androidx.compose.foundation.FocusableElement(lVar) : androidx.compose.ui.d.f19586a);
    }

    public static /* synthetic */ androidx.compose.ui.d b(androidx.compose.ui.d dVar, boolean z6, p250z.l lVar, int i6, java.lang.Object obj) {
        if ((i6 & 1) != 0) {
            z6 = true;
        }
        if ((i6 & 2) != 0) {
            lVar = null;
        }
        return a(dVar, z6, lVar);
    }
}
