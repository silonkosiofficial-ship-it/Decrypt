package androidx.compose.ui.platform;

/* JADX INFO: loaded from: classes.dex */
public interface M1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final androidx.compose.ui.platform.M1.a f19884a = androidx.compose.ui.platform.M1.a.f19885a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ androidx.compose.ui.platform.M1.a f19885a = new androidx.compose.ui.platform.M1.a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final androidx.compose.ui.platform.M1 f19886b = new androidx.compose.ui.platform.M1() { // from class: androidx.compose.ui.platform.L1
            @Override // androidx.compose.ui.platform.M1
            public final V.U0 a(android.view.View view) {
                return androidx.compose.ui.platform.M1.a.b(view);
            }
        };

        private a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final V.U0 b(android.view.View view) {
            return androidx.compose.ui.platform.O1.c(view, null, null, 3, null);
        }

        public final androidx.compose.ui.platform.M1 c() {
            return f19886b;
        }
    }

    V.U0 a(android.view.View view);
}
