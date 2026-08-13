package androidx.compose.ui.platform;

/* JADX INFO: loaded from: classes.dex */
public interface x1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final androidx.compose.ui.platform.x1.a f20417a = androidx.compose.ui.platform.x1.a.f20418a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ androidx.compose.ui.platform.x1.a f20418a = new androidx.compose.ui.platform.x1.a();

        private a() {
        }

        public final androidx.compose.ui.platform.x1 a() {
            return androidx.compose.ui.platform.x1.b.f20419b;
        }
    }

    public static final class b implements androidx.compose.ui.platform.x1 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final androidx.compose.ui.platform.x1.b f20419b = new androidx.compose.ui.platform.x1.b();

        static final class a extends p247y7.AbstractC7352v implements p237x7.a {

            /* JADX INFO: renamed from: D, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.platform.AbstractC1920a f20420D;

            /* JADX INFO: renamed from: E, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.platform.x1.b.ViewOnAttachStateChangeListenerC0385b f20421E;

            /* JADX INFO: renamed from: F, reason: collision with root package name */
            final /* synthetic */ H1.b f20422F;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(androidx.compose.ui.platform.AbstractC1920a abstractC1920a, androidx.compose.ui.platform.x1.b.ViewOnAttachStateChangeListenerC0385b viewOnAttachStateChangeListenerC0385b, H1.b bVar) {
                super(0);
                this.f20420D = abstractC1920a;
                this.f20421E = viewOnAttachStateChangeListenerC0385b;
                this.f20422F = bVar;
            }

            public final void a() {
                this.f20420D.removeOnAttachStateChangeListener(this.f20421E);
                H1.a.e(this.f20420D, this.f20422F);
            }

            @Override // p237x7.a
            public /* bridge */ /* synthetic */ java.lang.Object b() {
                a();
                return p087i7.M.f46721a;
            }
        }

        /* JADX INFO: renamed from: androidx.compose.ui.platform.x1$b$b, reason: collision with other inner class name */
        public static final class ViewOnAttachStateChangeListenerC0385b implements android.view.View.OnAttachStateChangeListener {

            /* JADX INFO: renamed from: C, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.platform.AbstractC1920a f20423C;

            ViewOnAttachStateChangeListenerC0385b(androidx.compose.ui.platform.AbstractC1920a abstractC1920a) {
                this.f20423C = abstractC1920a;
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(android.view.View view) {
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(android.view.View view) {
                if (H1.a.d(this.f20423C)) {
                    return;
                }
                this.f20423C.f();
            }
        }

        private b() {
        }

        @Override // androidx.compose.ui.platform.x1
        public p237x7.a a(final androidx.compose.ui.platform.AbstractC1920a abstractC1920a) {
            androidx.compose.ui.platform.x1.b.ViewOnAttachStateChangeListenerC0385b viewOnAttachStateChangeListenerC0385b = new androidx.compose.ui.platform.x1.b.ViewOnAttachStateChangeListenerC0385b(abstractC1920a);
            abstractC1920a.addOnAttachStateChangeListener(viewOnAttachStateChangeListenerC0385b);
            H1.b bVar = new H1.b() { // from class: androidx.compose.ui.platform.y1
            };
            H1.a.a(abstractC1920a, bVar);
            return new androidx.compose.ui.platform.x1.b.a(abstractC1920a, viewOnAttachStateChangeListenerC0385b, bVar);
        }
    }

    p237x7.a a(androidx.compose.ui.platform.AbstractC1920a abstractC1920a);
}
