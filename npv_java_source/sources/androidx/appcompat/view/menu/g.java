package androidx.appcompat.view.menu;

/* JADX INFO: loaded from: classes.dex */
public class g implements p212v1.a {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private static final int[] f17843A = {1, 4, 5, 3, 2, 0};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.content.Context f17844a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final android.content.res.Resources f17845b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f17846c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f17847d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private androidx.appcompat.view.menu.g.a f17848e;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private android.view.ContextMenu.ContextMenuInfo f17856m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    java.lang.CharSequence f17857n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    android.graphics.drawable.Drawable f17858o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    android.view.View f17859p;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private androidx.appcompat.view.menu.i f17867x;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f17869z;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f17855l = 0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f17860q = false;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f17861r = false;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f17862s = false;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f17863t = false;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f17864u = false;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private java.util.ArrayList f17865v = new java.util.ArrayList();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private java.util.concurrent.CopyOnWriteArrayList f17866w = new java.util.concurrent.CopyOnWriteArrayList();

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f17868y = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private java.util.ArrayList f17849f = new java.util.ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private java.util.ArrayList f17850g = new java.util.ArrayList();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f17851h = true;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private java.util.ArrayList f17852i = new java.util.ArrayList();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private java.util.ArrayList f17853j = new java.util.ArrayList();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f17854k = true;

    public interface a {
        boolean a(androidx.appcompat.view.menu.g gVar, android.view.MenuItem menuItem);

        void b(androidx.appcompat.view.menu.g gVar);
    }

    public interface b {
        boolean a(androidx.appcompat.view.menu.i iVar);
    }

    public g(android.content.Context context) {
        this.f17844a = context;
        this.f17845b = context.getResources();
        b0(true);
    }

    private static int B(int i6) {
        int i10 = ((-65536) & i6) >> 16;
        if (i10 >= 0) {
            int[] iArr = f17843A;
            if (i10 < iArr.length) {
                return (i6 & 65535) | (iArr[i10] << 16);
            }
        }
        throw new java.lang.IllegalArgumentException("order does not contain a valid category.");
    }

    private void N(int i6, boolean z6) {
        if (i6 < 0 || i6 >= this.f17849f.size()) {
            return;
        }
        this.f17849f.remove(i6);
        if (z6) {
            K(true);
        }
    }

    private void W(int i6, java.lang.CharSequence charSequence, int i10, android.graphics.drawable.Drawable drawable, android.view.View view) {
        android.content.res.Resources resourcesC = C();
        if (view != null) {
            this.f17859p = view;
            this.f17857n = null;
            this.f17858o = null;
        } else {
            if (i6 > 0) {
                this.f17857n = resourcesC.getText(i6);
            } else if (charSequence != null) {
                this.f17857n = charSequence;
            }
            if (i10 > 0) {
                this.f17858o = androidx.core.content.a.e(u(), i10);
            } else if (drawable != null) {
                this.f17858o = drawable;
            }
            this.f17859p = null;
        }
        K(false);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    private void b0(boolean z6) {
        boolean z10;
        if (z6) {
            z10 = this.f17845b.getConfiguration().keyboard != 1 && androidx.core.view.AbstractC1993b0.l(android.view.ViewConfiguration.get(this.f17844a), this.f17844a);
        }
        this.f17847d = z10;
    }

    private androidx.appcompat.view.menu.i g(int i6, int i10, int i11, int i12, java.lang.CharSequence charSequence, int i13) {
        return new androidx.appcompat.view.menu.i(this, i6, i10, i11, i12, charSequence, i13);
    }

    private void i(boolean z6) {
        if (this.f17866w.isEmpty()) {
            return;
        }
        d0();
        for (java.lang.ref.WeakReference weakReference : this.f17866w) {
            androidx.appcompat.view.menu.m mVar = (androidx.appcompat.view.menu.m) weakReference.get();
            if (mVar == null) {
                this.f17866w.remove(weakReference);
            } else {
                mVar.d(z6);
            }
        }
        c0();
    }

    private boolean j(androidx.appcompat.view.menu.r rVar, androidx.appcompat.view.menu.m mVar) {
        if (this.f17866w.isEmpty()) {
            return false;
        }
        boolean zK = mVar != null ? mVar.k(rVar) : false;
        for (java.lang.ref.WeakReference weakReference : this.f17866w) {
            androidx.appcompat.view.menu.m mVar2 = (androidx.appcompat.view.menu.m) weakReference.get();
            if (mVar2 == null) {
                this.f17866w.remove(weakReference);
            } else if (!zK) {
                zK = mVar2.k(rVar);
            }
        }
        return zK;
    }

    private static int n(java.util.ArrayList arrayList, int i6) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (((androidx.appcompat.view.menu.i) arrayList.get(size)).f() <= i6) {
                return size + 1;
            }
        }
        return 0;
    }

    boolean A() {
        return this.f17863t;
    }

    android.content.res.Resources C() {
        return this.f17845b;
    }

    public androidx.appcompat.view.menu.g D() {
        return this;
    }

    public java.util.ArrayList E() {
        if (!this.f17851h) {
            return this.f17850g;
        }
        this.f17850g.clear();
        int size = this.f17849f.size();
        for (int i6 = 0; i6 < size; i6++) {
            androidx.appcompat.view.menu.i iVar = (androidx.appcompat.view.menu.i) this.f17849f.get(i6);
            if (iVar.isVisible()) {
                this.f17850g.add(iVar);
            }
        }
        this.f17851h = false;
        this.f17854k = true;
        return this.f17850g;
    }

    public boolean F() {
        return this.f17868y;
    }

    boolean G() {
        return this.f17846c;
    }

    public boolean H() {
        return this.f17847d;
    }

    void I(androidx.appcompat.view.menu.i iVar) {
        this.f17854k = true;
        K(true);
    }

    void J(androidx.appcompat.view.menu.i iVar) {
        this.f17851h = true;
        K(true);
    }

    public void K(boolean z6) {
        if (this.f17860q) {
            this.f17861r = true;
            if (z6) {
                this.f17862s = true;
                return;
            }
            return;
        }
        if (z6) {
            this.f17851h = true;
            this.f17854k = true;
        }
        i(z6);
    }

    public boolean L(android.view.MenuItem menuItem, int i6) {
        return M(menuItem, null, i6);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x002d A[PHI: r1
  0x002d: PHI (r1v4 boolean) = (r1v2 boolean), (r1v1 boolean), (r1v5 boolean) binds: [B:35:0x0068, B:23:0x003c, B:16:0x002b] A[DONT_GENERATE, DONT_INLINE]] */
    public boolean M(android.view.MenuItem menuItem, androidx.appcompat.view.menu.m mVar, int i6) {
        androidx.appcompat.view.menu.i iVar = (androidx.appcompat.view.menu.i) menuItem;
        if (iVar == null || !iVar.isEnabled()) {
            return false;
        }
        boolean zK = iVar.k();
        androidx.core.view.AbstractC1992b abstractC1992bB = iVar.b();
        boolean z6 = abstractC1992bB != null && abstractC1992bB.a();
        if (iVar.j()) {
            zK |= iVar.expandActionView();
            if (zK) {
                e(true);
            }
        } else if (iVar.hasSubMenu() || z6) {
            if ((i6 & 4) == 0) {
                e(false);
            }
            if (!iVar.hasSubMenu()) {
                iVar.x(new androidx.appcompat.view.menu.r(u(), this, iVar));
            }
            androidx.appcompat.view.menu.r rVar = (androidx.appcompat.view.menu.r) iVar.getSubMenu();
            if (z6) {
                abstractC1992bB.e(rVar);
            }
            zK |= j(rVar, mVar);
            if (!zK) {
                e(true);
            }
        } else if ((i6 & 1) == 0) {
            e(true);
        }
        return zK;
    }

    public void O(androidx.appcompat.view.menu.m mVar) {
        for (java.lang.ref.WeakReference weakReference : this.f17866w) {
            androidx.appcompat.view.menu.m mVar2 = (androidx.appcompat.view.menu.m) weakReference.get();
            if (mVar2 == null || mVar2 == mVar) {
                this.f17866w.remove(weakReference);
            }
        }
    }

    public void P(android.os.Bundle bundle) {
        android.view.MenuItem menuItemFindItem;
        if (bundle == null) {
            return;
        }
        android.util.SparseArray<android.os.Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(t());
        int size = size();
        for (int i6 = 0; i6 < size; i6++) {
            android.view.MenuItem item = getItem(i6);
            android.view.View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((androidx.appcompat.view.menu.r) item.getSubMenu()).P(bundle);
            }
        }
        int i10 = bundle.getInt("android:menu:expandedactionview");
        if (i10 <= 0 || (menuItemFindItem = findItem(i10)) == null) {
            return;
        }
        menuItemFindItem.expandActionView();
    }

    public void Q(android.os.Bundle bundle) {
        int size = size();
        android.util.SparseArray<? extends android.os.Parcelable> sparseArray = null;
        for (int i6 = 0; i6 < size; i6++) {
            android.view.MenuItem item = getItem(i6);
            android.view.View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                if (sparseArray == null) {
                    sparseArray = new android.util.SparseArray<>();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((androidx.appcompat.view.menu.r) item.getSubMenu()).Q(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(t(), sparseArray);
        }
    }

    public void R(androidx.appcompat.view.menu.g.a aVar) {
        this.f17848e = aVar;
    }

    public androidx.appcompat.view.menu.g S(int i6) {
        this.f17855l = i6;
        return this;
    }

    void T(android.view.MenuItem menuItem) {
        int groupId = menuItem.getGroupId();
        int size = this.f17849f.size();
        d0();
        for (int i6 = 0; i6 < size; i6++) {
            androidx.appcompat.view.menu.i iVar = (androidx.appcompat.view.menu.i) this.f17849f.get(i6);
            if (iVar.getGroupId() == groupId && iVar.m() && iVar.isCheckable()) {
                iVar.s(iVar == menuItem);
            }
        }
        c0();
    }

    protected androidx.appcompat.view.menu.g U(int i6) {
        W(0, null, i6, null, null);
        return this;
    }

    protected androidx.appcompat.view.menu.g V(android.graphics.drawable.Drawable drawable) {
        W(0, null, 0, drawable, null);
        return this;
    }

    protected androidx.appcompat.view.menu.g X(int i6) {
        W(i6, null, 0, null, null);
        return this;
    }

    protected androidx.appcompat.view.menu.g Y(java.lang.CharSequence charSequence) {
        W(0, charSequence, 0, null, null);
        return this;
    }

    protected androidx.appcompat.view.menu.g Z(android.view.View view) {
        W(0, null, 0, null, view);
        return this;
    }

    protected android.view.MenuItem a(int i6, int i10, int i11, java.lang.CharSequence charSequence) {
        int iB = B(i11);
        androidx.appcompat.view.menu.i iVarG = g(i6, i10, i11, iB, charSequence, this.f17855l);
        android.view.ContextMenu.ContextMenuInfo contextMenuInfo = this.f17856m;
        if (contextMenuInfo != null) {
            iVarG.v(contextMenuInfo);
        }
        java.util.ArrayList arrayList = this.f17849f;
        arrayList.add(n(arrayList, iB), iVarG);
        K(true);
        return iVarG;
    }

    public void a0(boolean z6) {
        this.f17869z = z6;
    }

    @Override // android.view.Menu
    public android.view.MenuItem add(int i6) {
        return a(0, 0, 0, this.f17845b.getString(i6));
    }

    @Override // android.view.Menu
    public android.view.MenuItem add(int i6, int i10, int i11, int i12) {
        return a(i6, i10, i11, this.f17845b.getString(i12));
    }

    @Override // android.view.Menu
    public android.view.MenuItem add(int i6, int i10, int i11, java.lang.CharSequence charSequence) {
        return a(i6, i10, i11, charSequence);
    }

    @Override // android.view.Menu
    public android.view.MenuItem add(java.lang.CharSequence charSequence) {
        return a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public int addIntentOptions(int i6, int i10, int i11, android.content.ComponentName componentName, android.content.Intent[] intentArr, android.content.Intent intent, int i12, android.view.MenuItem[] menuItemArr) {
        int i13;
        android.content.pm.PackageManager packageManager = this.f17844a.getPackageManager();
        java.util.List<android.content.pm.ResolveInfo> listQueryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = listQueryIntentActivityOptions != null ? listQueryIntentActivityOptions.size() : 0;
        if ((i12 & 1) == 0) {
            removeGroup(i6);
        }
        for (int i14 = 0; i14 < size; i14++) {
            android.content.pm.ResolveInfo resolveInfo = listQueryIntentActivityOptions.get(i14);
            int i15 = resolveInfo.specificIndex;
            android.content.Intent intent2 = new android.content.Intent(i15 < 0 ? intent : intentArr[i15]);
            android.content.pm.ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new android.content.ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            android.view.MenuItem intent3 = add(i6, i10, i11, resolveInfo.loadLabel(packageManager)).setIcon(resolveInfo.loadIcon(packageManager)).setIntent(intent2);
            if (menuItemArr != null && (i13 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i13] = intent3;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public android.view.SubMenu addSubMenu(int i6) {
        return addSubMenu(0, 0, 0, this.f17845b.getString(i6));
    }

    @Override // android.view.Menu
    public android.view.SubMenu addSubMenu(int i6, int i10, int i11, int i12) {
        return addSubMenu(i6, i10, i11, this.f17845b.getString(i12));
    }

    @Override // android.view.Menu
    public android.view.SubMenu addSubMenu(int i6, int i10, int i11, java.lang.CharSequence charSequence) {
        androidx.appcompat.view.menu.i iVar = (androidx.appcompat.view.menu.i) a(i6, i10, i11, charSequence);
        androidx.appcompat.view.menu.r rVar = new androidx.appcompat.view.menu.r(this.f17844a, this, iVar);
        iVar.x(rVar);
        return rVar;
    }

    @Override // android.view.Menu
    public android.view.SubMenu addSubMenu(java.lang.CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public void b(androidx.appcompat.view.menu.m mVar) {
        c(mVar, this.f17844a);
    }

    public void c(androidx.appcompat.view.menu.m mVar, android.content.Context context) {
        this.f17866w.add(new java.lang.ref.WeakReference(mVar));
        mVar.i(context, this);
        this.f17854k = true;
    }

    public void c0() {
        this.f17860q = false;
        if (this.f17861r) {
            this.f17861r = false;
            K(this.f17862s);
        }
    }

    @Override // android.view.Menu
    public void clear() {
        androidx.appcompat.view.menu.i iVar = this.f17867x;
        if (iVar != null) {
            f(iVar);
        }
        this.f17849f.clear();
        K(true);
    }

    public void clearHeader() {
        this.f17858o = null;
        this.f17857n = null;
        this.f17859p = null;
        K(false);
    }

    @Override // android.view.Menu
    public void close() {
        e(true);
    }

    public void d() {
        androidx.appcompat.view.menu.g.a aVar = this.f17848e;
        if (aVar != null) {
            aVar.b(this);
        }
    }

    public void d0() {
        if (this.f17860q) {
            return;
        }
        this.f17860q = true;
        this.f17861r = false;
        this.f17862s = false;
    }

    public final void e(boolean z6) {
        if (this.f17864u) {
            return;
        }
        this.f17864u = true;
        for (java.lang.ref.WeakReference weakReference : this.f17866w) {
            androidx.appcompat.view.menu.m mVar = (androidx.appcompat.view.menu.m) weakReference.get();
            if (mVar == null) {
                this.f17866w.remove(weakReference);
            } else {
                mVar.c(this, z6);
            }
        }
        this.f17864u = false;
    }

    public boolean f(androidx.appcompat.view.menu.i iVar) {
        boolean zF = false;
        if (!this.f17866w.isEmpty() && this.f17867x == iVar) {
            d0();
            for (java.lang.ref.WeakReference weakReference : this.f17866w) {
                androidx.appcompat.view.menu.m mVar = (androidx.appcompat.view.menu.m) weakReference.get();
                if (mVar != null) {
                    zF = mVar.f(this, iVar);
                    if (zF) {
                        break;
                    }
                } else {
                    this.f17866w.remove(weakReference);
                }
            }
            c0();
            if (zF) {
                this.f17867x = null;
            }
        }
        return zF;
    }

    @Override // android.view.Menu
    public android.view.MenuItem findItem(int i6) {
        android.view.MenuItem menuItemFindItem;
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            androidx.appcompat.view.menu.i iVar = (androidx.appcompat.view.menu.i) this.f17849f.get(i10);
            if (iVar.getItemId() == i6) {
                return iVar;
            }
            if (iVar.hasSubMenu() && (menuItemFindItem = iVar.getSubMenu().findItem(i6)) != null) {
                return menuItemFindItem;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public android.view.MenuItem getItem(int i6) {
        return (android.view.MenuItem) this.f17849f.get(i6);
    }

    boolean h(androidx.appcompat.view.menu.g gVar, android.view.MenuItem menuItem) {
        androidx.appcompat.view.menu.g.a aVar = this.f17848e;
        return aVar != null && aVar.a(gVar, menuItem);
    }

    @Override // android.view.Menu
    public boolean hasVisibleItems() {
        if (this.f17869z) {
            return true;
        }
        int size = size();
        for (int i6 = 0; i6 < size; i6++) {
            if (((androidx.appcompat.view.menu.i) this.f17849f.get(i6)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.Menu
    public boolean isShortcutKey(int i6, android.view.KeyEvent keyEvent) {
        return p(i6, keyEvent) != null;
    }

    public boolean k(androidx.appcompat.view.menu.i iVar) {
        boolean zG = false;
        if (this.f17866w.isEmpty()) {
            return false;
        }
        d0();
        for (java.lang.ref.WeakReference weakReference : this.f17866w) {
            androidx.appcompat.view.menu.m mVar = (androidx.appcompat.view.menu.m) weakReference.get();
            if (mVar != null) {
                zG = mVar.g(this, iVar);
                if (zG) {
                    break;
                }
            } else {
                this.f17866w.remove(weakReference);
            }
        }
        c0();
        if (zG) {
            this.f17867x = iVar;
        }
        return zG;
    }

    public int l(int i6) {
        return m(i6, 0);
    }

    public int m(int i6, int i10) {
        int size = size();
        if (i10 < 0) {
            i10 = 0;
        }
        while (i10 < size) {
            if (((androidx.appcompat.view.menu.i) this.f17849f.get(i10)).getGroupId() == i6) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public int o(int i6) {
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (((androidx.appcompat.view.menu.i) this.f17849f.get(i10)).getItemId() == i6) {
                return i10;
            }
        }
        return -1;
    }

    androidx.appcompat.view.menu.i p(int i6, android.view.KeyEvent keyEvent) {
        java.util.ArrayList arrayList = this.f17865v;
        arrayList.clear();
        q(arrayList, i6, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        android.view.KeyCharacterMap.KeyData keyData = new android.view.KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return (androidx.appcompat.view.menu.i) arrayList.get(0);
        }
        boolean zG = G();
        for (int i10 = 0; i10 < size; i10++) {
            androidx.appcompat.view.menu.i iVar = (androidx.appcompat.view.menu.i) arrayList.get(i10);
            char alphabeticShortcut = zG ? iVar.getAlphabeticShortcut() : iVar.getNumericShortcut();
            char[] cArr = keyData.meta;
            if ((alphabeticShortcut == cArr[0] && (metaState & 2) == 0) || ((alphabeticShortcut == cArr[2] && (metaState & 2) != 0) || (zG && alphabeticShortcut == '\b' && i6 == 67))) {
                return iVar;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public boolean performIdentifierAction(int i6, int i10) {
        return L(findItem(i6), i10);
    }

    @Override // android.view.Menu
    public boolean performShortcut(int i6, android.view.KeyEvent keyEvent, int i10) {
        androidx.appcompat.view.menu.i iVarP = p(i6, keyEvent);
        boolean zL = iVarP != null ? L(iVarP, i10) : false;
        if ((i10 & 2) != 0) {
            e(true);
        }
        return zL;
    }

    void q(java.util.List list, int i6, android.view.KeyEvent keyEvent) {
        boolean zG = G();
        int modifiers = keyEvent.getModifiers();
        android.view.KeyCharacterMap.KeyData keyData = new android.view.KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i6 == 67) {
            int size = this.f17849f.size();
            for (int i10 = 0; i10 < size; i10++) {
                androidx.appcompat.view.menu.i iVar = (androidx.appcompat.view.menu.i) this.f17849f.get(i10);
                if (iVar.hasSubMenu()) {
                    ((androidx.appcompat.view.menu.g) iVar.getSubMenu()).q(list, i6, keyEvent);
                }
                char alphabeticShortcut = zG ? iVar.getAlphabeticShortcut() : iVar.getNumericShortcut();
                if ((modifiers & 69647) == ((zG ? iVar.getAlphabeticModifiers() : iVar.getNumericModifiers()) & 69647) && alphabeticShortcut != 0) {
                    char[] cArr = keyData.meta;
                    if ((alphabeticShortcut == cArr[0] || alphabeticShortcut == cArr[2] || (zG && alphabeticShortcut == '\b' && i6 == 67)) && iVar.isEnabled()) {
                        list.add(iVar);
                    }
                }
            }
        }
    }

    public void r() {
        java.util.ArrayList arrayListE = E();
        if (this.f17854k) {
            boolean zE = false;
            for (java.lang.ref.WeakReference weakReference : this.f17866w) {
                androidx.appcompat.view.menu.m mVar = (androidx.appcompat.view.menu.m) weakReference.get();
                if (mVar == null) {
                    this.f17866w.remove(weakReference);
                } else {
                    zE |= mVar.e();
                }
            }
            if (zE) {
                this.f17852i.clear();
                this.f17853j.clear();
                int size = arrayListE.size();
                for (int i6 = 0; i6 < size; i6++) {
                    androidx.appcompat.view.menu.i iVar = (androidx.appcompat.view.menu.i) arrayListE.get(i6);
                    (iVar.l() ? this.f17852i : this.f17853j).add(iVar);
                }
            } else {
                this.f17852i.clear();
                this.f17853j.clear();
                this.f17853j.addAll(E());
            }
            this.f17854k = false;
        }
    }

    @Override // android.view.Menu
    public void removeGroup(int i6) {
        int iL = l(i6);
        if (iL >= 0) {
            int size = this.f17849f.size() - iL;
            int i10 = 0;
            while (true) {
                int i11 = i10 + 1;
                if (i10 >= size || ((androidx.appcompat.view.menu.i) this.f17849f.get(iL)).getGroupId() != i6) {
                    break;
                }
                N(iL, false);
                i10 = i11;
            }
            K(true);
        }
    }

    @Override // android.view.Menu
    public void removeItem(int i6) {
        N(o(i6), true);
    }

    public java.util.ArrayList s() {
        r();
        return this.f17852i;
    }

    @Override // android.view.Menu
    public void setGroupCheckable(int i6, boolean z6, boolean z10) {
        int size = this.f17849f.size();
        for (int i10 = 0; i10 < size; i10++) {
            androidx.appcompat.view.menu.i iVar = (androidx.appcompat.view.menu.i) this.f17849f.get(i10);
            if (iVar.getGroupId() == i6) {
                iVar.t(z10);
                iVar.setCheckable(z6);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z6) {
        this.f17868y = z6;
    }

    @Override // android.view.Menu
    public void setGroupEnabled(int i6, boolean z6) {
        int size = this.f17849f.size();
        for (int i10 = 0; i10 < size; i10++) {
            androidx.appcompat.view.menu.i iVar = (androidx.appcompat.view.menu.i) this.f17849f.get(i10);
            if (iVar.getGroupId() == i6) {
                iVar.setEnabled(z6);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupVisible(int i6, boolean z6) {
        int size = this.f17849f.size();
        boolean z10 = false;
        for (int i10 = 0; i10 < size; i10++) {
            androidx.appcompat.view.menu.i iVar = (androidx.appcompat.view.menu.i) this.f17849f.get(i10);
            if (iVar.getGroupId() == i6 && iVar.y(z6)) {
                z10 = true;
            }
        }
        if (z10) {
            K(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z6) {
        this.f17846c = z6;
        K(false);
    }

    @Override // android.view.Menu
    public int size() {
        return this.f17849f.size();
    }

    protected java.lang.String t() {
        return "android:menu:actionviewstates";
    }

    public android.content.Context u() {
        return this.f17844a;
    }

    public androidx.appcompat.view.menu.i v() {
        return this.f17867x;
    }

    public android.graphics.drawable.Drawable w() {
        return this.f17858o;
    }

    public java.lang.CharSequence x() {
        return this.f17857n;
    }

    public android.view.View y() {
        return this.f17859p;
    }

    public java.util.ArrayList z() {
        r();
        return this.f17853j;
    }
}
