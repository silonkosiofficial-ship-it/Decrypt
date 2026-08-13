package T;

/* JADX INFO: loaded from: classes.dex */
final class s implements android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener, V.G1 {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final V.InterfaceC1753w0 f12859C = V.A1.d(java.lang.Boolean.FALSE, null, 2, null);

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final T.s.c f12860D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final T.s.b f12861E;

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final T.s.a f12862a = new T.s.a();

        private a() {
        }

        public static final void a(android.view.accessibility.AccessibilityManager accessibilityManager, android.view.accessibility.AccessibilityManager$AccessibilityServicesStateChangeListener accessibilityManager$AccessibilityServicesStateChangeListener) {
            accessibilityManager.addAccessibilityServicesStateChangeListener(accessibilityManager$AccessibilityServicesStateChangeListener);
        }

        public static final void b(android.view.accessibility.AccessibilityManager accessibilityManager, android.view.accessibility.AccessibilityManager$AccessibilityServicesStateChangeListener accessibilityManager$AccessibilityServicesStateChangeListener) {
            accessibilityManager.removeAccessibilityServicesStateChangeListener(accessibilityManager$AccessibilityServicesStateChangeListener);
        }
    }

    public static final class b implements android.view.accessibility.AccessibilityManager$AccessibilityServicesStateChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final V.InterfaceC1753w0 f12863a = V.A1.d(java.lang.Boolean.FALSE, null, 2, null);

        b() {
        }

        public final boolean a() {
            return ((java.lang.Boolean) this.f12863a.getValue()).booleanValue();
        }

        public final void b(boolean z6) {
            this.f12863a.setValue(java.lang.Boolean.valueOf(z6));
        }

        public void onAccessibilityServicesStateChanged(android.view.accessibility.AccessibilityManager accessibilityManager) {
            b(T.s.this.n(accessibilityManager));
        }
    }

    public static final class c implements android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final V.InterfaceC1753w0 f12865a = V.A1.d(java.lang.Boolean.FALSE, null, 2, null);

        c() {
        }

        public final boolean a() {
            return ((java.lang.Boolean) this.f12865a.getValue()).booleanValue();
        }

        public final void b(boolean z6) {
            this.f12865a.setValue(java.lang.Boolean.valueOf(z6));
        }

        @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
        public void onTouchExplorationStateChanged(boolean z6) {
            b(z6);
        }
    }

    public s(boolean z6, boolean z10) {
        T.s.b bVar = null;
        this.f12860D = z6 ? new T.s.c() : null;
        if (z10 && android.os.Build.VERSION.SDK_INT >= 33) {
            bVar = new T.s.b();
        }
        this.f12861E = bVar;
    }

    private final boolean g() {
        return ((java.lang.Boolean) this.f12859C.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean n(android.view.accessibility.AccessibilityManager accessibilityManager) {
        java.util.List<android.accessibilityservice.AccessibilityServiceInfo> enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(16);
        int size = enabledAccessibilityServiceList.size();
        for (int i6 = 0; i6 < size; i6++) {
            java.lang.String settingsActivityName = enabledAccessibilityServiceList.get(i6).getSettingsActivityName();
            if (settingsActivityName != null && S8.r.c0(settingsActivityName, "SwitchAccess", false, 2, null)) {
                return true;
            }
        }
        return false;
    }

    private final void r(boolean z6) {
        this.f12859C.setValue(java.lang.Boolean.valueOf(z6));
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001f  */
    @Override // V.G1
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public java.lang.Boolean getValue() {
        boolean z6 = false;
        if (g()) {
            T.s.c cVar = this.f12860D;
            if (cVar != null ? cVar.a() : false) {
                z6 = true;
            } else {
                T.s.b bVar = this.f12861E;
                if (bVar != null ? bVar.a() : false) {
                    z6 = true;
                }
            }
        }
        return java.lang.Boolean.valueOf(z6);
    }

    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
    public void onAccessibilityStateChanged(boolean z6) {
        r(z6);
    }

    public final void q(android.view.accessibility.AccessibilityManager accessibilityManager) {
        T.s.b bVar;
        r(accessibilityManager.isEnabled());
        accessibilityManager.addAccessibilityStateChangeListener(this);
        T.s.c cVar = this.f12860D;
        if (cVar != null) {
            cVar.b(accessibilityManager.isTouchExplorationEnabled());
            accessibilityManager.addTouchExplorationStateChangeListener(cVar);
        }
        if (android.os.Build.VERSION.SDK_INT < 33 || (bVar = this.f12861E) == null) {
            return;
        }
        bVar.b(n(accessibilityManager));
        T.s.a.a(accessibilityManager, T.r.a(bVar));
    }

    public final void s(android.view.accessibility.AccessibilityManager accessibilityManager) {
        T.s.b bVar;
        accessibilityManager.removeAccessibilityStateChangeListener(this);
        T.s.c cVar = this.f12860D;
        if (cVar != null) {
            accessibilityManager.removeTouchExplorationStateChangeListener(cVar);
        }
        if (android.os.Build.VERSION.SDK_INT < 33 || (bVar = this.f12861E) == null) {
            return;
        }
        T.s.a.b(accessibilityManager, T.r.a(bVar));
    }
}
