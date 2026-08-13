package androidx.appcompat.view.menu;

/* JADX INFO: loaded from: classes.dex */
public final class i implements p212v1.b {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private android.view.View f17874A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private androidx.core.view.AbstractC1992b f17875B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private android.view.MenuItem.OnActionExpandListener f17876C;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private android.view.ContextMenu.ContextMenuInfo f17878E;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f17879a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f17880b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f17881c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f17882d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private java.lang.CharSequence f17883e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private java.lang.CharSequence f17884f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private android.content.Intent f17885g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private char f17886h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private char f17888j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private android.graphics.drawable.Drawable f17890l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    androidx.appcompat.view.menu.g f17892n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private androidx.appcompat.view.menu.r f17893o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private java.lang.Runnable f17894p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private android.view.MenuItem.OnMenuItemClickListener f17895q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private java.lang.CharSequence f17896r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private java.lang.CharSequence f17897s;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private int f17904z;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f17887i = 4096;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f17889k = 4096;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f17891m = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private android.content.res.ColorStateList f17898t = null;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private android.graphics.PorterDuff.Mode f17899u = null;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f17900v = false;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f17901w = false;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f17902x = false;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f17903y = 16;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private boolean f17877D = false;

    class a implements androidx.core.view.AbstractC1992b.InterfaceC0412b {
        a() {
        }

        @Override // androidx.core.view.AbstractC1992b.InterfaceC0412b
        public void onActionProviderVisibilityChanged(boolean z6) {
            androidx.appcompat.view.menu.i iVar = androidx.appcompat.view.menu.i.this;
            iVar.f17892n.J(iVar);
        }
    }

    i(androidx.appcompat.view.menu.g gVar, int i6, int i10, int i11, int i12, java.lang.CharSequence charSequence, int i13) {
        this.f17892n = gVar;
        this.f17879a = i10;
        this.f17880b = i6;
        this.f17881c = i11;
        this.f17882d = i12;
        this.f17883e = charSequence;
        this.f17904z = i13;
    }

    private static void d(java.lang.StringBuilder sb, int i6, int i10, java.lang.String str) {
        if ((i6 & i10) == i10) {
            sb.append(str);
        }
    }

    private android.graphics.drawable.Drawable e(android.graphics.drawable.Drawable drawable) {
        if (drawable != null && this.f17902x && (this.f17900v || this.f17901w)) {
            drawable = androidx.core.graphics.drawable.a.r(drawable).mutate();
            if (this.f17900v) {
                androidx.core.graphics.drawable.a.o(drawable, this.f17898t);
            }
            if (this.f17901w) {
                androidx.core.graphics.drawable.a.p(drawable, this.f17899u);
            }
            this.f17902x = false;
        }
        return drawable;
    }

    boolean A() {
        return this.f17892n.H() && g() != 0;
    }

    public boolean B() {
        return (this.f17904z & 4) == 4;
    }

    @Override // p212v1.b
    public p212v1.b a(androidx.core.view.AbstractC1992b abstractC1992b) {
        androidx.core.view.AbstractC1992b abstractC1992b2 = this.f17875B;
        if (abstractC1992b2 != null) {
            abstractC1992b2.g();
        }
        this.f17874A = null;
        this.f17875B = abstractC1992b;
        this.f17892n.K(true);
        androidx.core.view.AbstractC1992b abstractC1992b3 = this.f17875B;
        if (abstractC1992b3 != null) {
            abstractC1992b3.i(new androidx.appcompat.view.menu.i.a());
        }
        return this;
    }

    @Override // p212v1.b
    public androidx.core.view.AbstractC1992b b() {
        return this.f17875B;
    }

    public void c() {
        this.f17892n.I(this);
    }

    @Override // p212v1.b, android.view.MenuItem
    public boolean collapseActionView() {
        if ((this.f17904z & 8) == 0) {
            return false;
        }
        if (this.f17874A == null) {
            return true;
        }
        android.view.MenuItem.OnActionExpandListener onActionExpandListener = this.f17876C;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f17892n.f(this);
        }
        return false;
    }

    @Override // p212v1.b, android.view.MenuItem
    public boolean expandActionView() {
        if (!j()) {
            return false;
        }
        android.view.MenuItem.OnActionExpandListener onActionExpandListener = this.f17876C;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f17892n.k(this);
        }
        return false;
    }

    public int f() {
        return this.f17882d;
    }

    char g() {
        return this.f17892n.G() ? this.f17888j : this.f17886h;
    }

    @Override // android.view.MenuItem
    public android.view.ActionProvider getActionProvider() {
        throw new java.lang.UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // p212v1.b, android.view.MenuItem
    public android.view.View getActionView() {
        android.view.View view = this.f17874A;
        if (view != null) {
            return view;
        }
        androidx.core.view.AbstractC1992b abstractC1992b = this.f17875B;
        if (abstractC1992b == null) {
            return null;
        }
        android.view.View viewC = abstractC1992b.c(this);
        this.f17874A = viewC;
        return viewC;
    }

    @Override // p212v1.b, android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f17889k;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f17888j;
    }

    @Override // p212v1.b, android.view.MenuItem
    public java.lang.CharSequence getContentDescription() {
        return this.f17896r;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f17880b;
    }

    @Override // android.view.MenuItem
    public android.graphics.drawable.Drawable getIcon() {
        android.graphics.drawable.Drawable drawable = this.f17890l;
        if (drawable != null) {
            return e(drawable);
        }
        if (this.f17891m == 0) {
            return null;
        }
        android.graphics.drawable.Drawable drawableB = p100k.a.b(this.f17892n.u(), this.f17891m);
        this.f17891m = 0;
        this.f17890l = drawableB;
        return e(drawableB);
    }

    @Override // p212v1.b, android.view.MenuItem
    public android.content.res.ColorStateList getIconTintList() {
        return this.f17898t;
    }

    @Override // p212v1.b, android.view.MenuItem
    public android.graphics.PorterDuff.Mode getIconTintMode() {
        return this.f17899u;
    }

    @Override // android.view.MenuItem
    public android.content.Intent getIntent() {
        return this.f17885g;
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return this.f17879a;
    }

    @Override // android.view.MenuItem
    public android.view.ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f17878E;
    }

    @Override // p212v1.b, android.view.MenuItem
    public int getNumericModifiers() {
        return this.f17887i;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f17886h;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f17881c;
    }

    @Override // android.view.MenuItem
    public android.view.SubMenu getSubMenu() {
        return this.f17893o;
    }

    @Override // android.view.MenuItem
    public java.lang.CharSequence getTitle() {
        return this.f17883e;
    }

    @Override // android.view.MenuItem
    public java.lang.CharSequence getTitleCondensed() {
        java.lang.CharSequence charSequence = this.f17884f;
        return charSequence != null ? charSequence : this.f17883e;
    }

    @Override // p212v1.b, android.view.MenuItem
    public java.lang.CharSequence getTooltipText() {
        return this.f17897s;
    }

    java.lang.String h() {
        int i6;
        char cG = g();
        if (cG == 0) {
            return "";
        }
        android.content.res.Resources resources = this.f17892n.u().getResources();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (android.view.ViewConfiguration.get(this.f17892n.u()).hasPermanentMenuKey()) {
            sb.append(resources.getString(p090j.h.f48789k));
        }
        int i10 = this.f17892n.G() ? this.f17889k : this.f17887i;
        d(sb, i10, 65536, resources.getString(p090j.h.f48785g));
        d(sb, i10, 4096, resources.getString(p090j.h.f48781c));
        d(sb, i10, 2, resources.getString(p090j.h.f48780b));
        d(sb, i10, 1, resources.getString(p090j.h.f48786h));
        d(sb, i10, 4, resources.getString(p090j.h.f48788j));
        d(sb, i10, 8, resources.getString(p090j.h.f48784f));
        if (cG == '\b') {
            i6 = p090j.h.f48782d;
        } else {
            if (cG != '\n') {
                if (cG != ' ') {
                    sb.append(cG);
                } else {
                    i6 = p090j.h.f48787i;
                }
                return sb.toString();
            }
            i6 = p090j.h.f48783e;
        }
        sb.append(resources.getString(i6));
        return sb.toString();
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return this.f17893o != null;
    }

    java.lang.CharSequence i(androidx.appcompat.view.menu.n.a aVar) {
        return (aVar == null || !aVar.d()) ? getTitle() : getTitleCondensed();
    }

    @Override // p212v1.b, android.view.MenuItem
    public boolean isActionViewExpanded() {
        return this.f17877D;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return (this.f17903y & 1) == 1;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return (this.f17903y & 2) == 2;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return (this.f17903y & 16) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        androidx.core.view.AbstractC1992b abstractC1992b = this.f17875B;
        if (abstractC1992b == null || !abstractC1992b.f()) {
            return (this.f17903y & 8) == 0;
        }
        return (this.f17903y & 8) == 0 && this.f17875B.b();
    }

    public boolean j() {
        androidx.core.view.AbstractC1992b abstractC1992b;
        if ((this.f17904z & 8) == 0) {
            return false;
        }
        if (this.f17874A == null && (abstractC1992b = this.f17875B) != null) {
            this.f17874A = abstractC1992b.c(this);
        }
        return this.f17874A != null;
    }

    public boolean k() {
        android.view.MenuItem.OnMenuItemClickListener onMenuItemClickListener = this.f17895q;
        if (onMenuItemClickListener != null && onMenuItemClickListener.onMenuItemClick(this)) {
            return true;
        }
        androidx.appcompat.view.menu.g gVar = this.f17892n;
        if (gVar.h(gVar, this)) {
            return true;
        }
        java.lang.Runnable runnable = this.f17894p;
        if (runnable != null) {
            runnable.run();
            return true;
        }
        if (this.f17885g != null) {
            try {
                this.f17892n.u().startActivity(this.f17885g);
                return true;
            } catch (android.content.ActivityNotFoundException e6) {
            }
        }
        androidx.core.view.AbstractC1992b abstractC1992b = this.f17875B;
        return abstractC1992b != null && abstractC1992b.d();
    }

    public boolean l() {
        return (this.f17903y & 32) == 32;
    }

    public boolean m() {
        return (this.f17903y & 4) != 0;
    }

    public boolean n() {
        return (this.f17904z & 1) == 1;
    }

    public boolean o() {
        return (this.f17904z & 2) == 2;
    }

    @Override // p212v1.b, android.view.MenuItem
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public p212v1.b setActionView(int i6) {
        android.content.Context contextU = this.f17892n.u();
        setActionView(android.view.LayoutInflater.from(contextU).inflate(i6, (android.view.ViewGroup) new android.widget.LinearLayout(contextU), false));
        return this;
    }

    @Override // p212v1.b, android.view.MenuItem
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public p212v1.b setActionView(android.view.View view) {
        int i6;
        this.f17874A = view;
        this.f17875B = null;
        if (view != null && view.getId() == -1 && (i6 = this.f17879a) > 0) {
            view.setId(i6);
        }
        this.f17892n.I(this);
        return this;
    }

    public void r(boolean z6) {
        this.f17877D = z6;
        this.f17892n.K(false);
    }

    void s(boolean z6) {
        int i6 = this.f17903y;
        int i10 = (z6 ? 2 : 0) | (i6 & (-3));
        this.f17903y = i10;
        if (i6 != i10) {
            this.f17892n.K(false);
        }
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setActionProvider(android.view.ActionProvider actionProvider) {
        throw new java.lang.UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setAlphabeticShortcut(char c6) {
        if (this.f17888j == c6) {
            return this;
        }
        this.f17888j = java.lang.Character.toLowerCase(c6);
        this.f17892n.K(false);
        return this;
    }

    @Override // p212v1.b, android.view.MenuItem
    public android.view.MenuItem setAlphabeticShortcut(char c6, int i6) {
        if (this.f17888j == c6 && this.f17889k == i6) {
            return this;
        }
        this.f17888j = java.lang.Character.toLowerCase(c6);
        this.f17889k = android.view.KeyEvent.normalizeMetaState(i6);
        this.f17892n.K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setCheckable(boolean z6) {
        int i6 = this.f17903y;
        int i10 = (z6 ? 1 : 0) | (i6 & (-2));
        this.f17903y = i10;
        if (i6 != i10) {
            this.f17892n.K(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setChecked(boolean z6) {
        if ((this.f17903y & 4) != 0) {
            this.f17892n.T(this);
        } else {
            s(z6);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public p212v1.b setContentDescription(java.lang.CharSequence charSequence) {
        this.f17896r = charSequence;
        this.f17892n.K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setEnabled(boolean z6) {
        this.f17903y = z6 ? this.f17903y | 16 : this.f17903y & (-17);
        this.f17892n.K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setIcon(int i6) {
        this.f17890l = null;
        this.f17891m = i6;
        this.f17902x = true;
        this.f17892n.K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setIcon(android.graphics.drawable.Drawable drawable) {
        this.f17891m = 0;
        this.f17890l = drawable;
        this.f17902x = true;
        this.f17892n.K(false);
        return this;
    }

    @Override // p212v1.b, android.view.MenuItem
    public android.view.MenuItem setIconTintList(android.content.res.ColorStateList colorStateList) {
        this.f17898t = colorStateList;
        this.f17900v = true;
        this.f17902x = true;
        this.f17892n.K(false);
        return this;
    }

    @Override // p212v1.b, android.view.MenuItem
    public android.view.MenuItem setIconTintMode(android.graphics.PorterDuff.Mode mode) {
        this.f17899u = mode;
        this.f17901w = true;
        this.f17902x = true;
        this.f17892n.K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setIntent(android.content.Intent intent) {
        this.f17885g = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setNumericShortcut(char c6) {
        if (this.f17886h == c6) {
            return this;
        }
        this.f17886h = c6;
        this.f17892n.K(false);
        return this;
    }

    @Override // p212v1.b, android.view.MenuItem
    public android.view.MenuItem setNumericShortcut(char c6, int i6) {
        if (this.f17886h == c6 && this.f17887i == i6) {
            return this;
        }
        this.f17886h = c6;
        this.f17887i = android.view.KeyEvent.normalizeMetaState(i6);
        this.f17892n.K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setOnActionExpandListener(android.view.MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f17876C = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setOnMenuItemClickListener(android.view.MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f17895q = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setShortcut(char c6, char c10) {
        this.f17886h = c6;
        this.f17888j = java.lang.Character.toLowerCase(c10);
        this.f17892n.K(false);
        return this;
    }

    @Override // p212v1.b, android.view.MenuItem
    public android.view.MenuItem setShortcut(char c6, char c10, int i6, int i10) {
        this.f17886h = c6;
        this.f17887i = android.view.KeyEvent.normalizeMetaState(i6);
        this.f17888j = java.lang.Character.toLowerCase(c10);
        this.f17889k = android.view.KeyEvent.normalizeMetaState(i10);
        this.f17892n.K(false);
        return this;
    }

    @Override // p212v1.b, android.view.MenuItem
    public void setShowAsAction(int i6) {
        int i10 = i6 & 3;
        if (i10 != 0 && i10 != 1 && i10 != 2) {
            throw new java.lang.IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f17904z = i6;
        this.f17892n.I(this);
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setTitle(int i6) {
        return setTitle(this.f17892n.u().getString(i6));
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setTitle(java.lang.CharSequence charSequence) {
        this.f17883e = charSequence;
        this.f17892n.K(false);
        androidx.appcompat.view.menu.r rVar = this.f17893o;
        if (rVar != null) {
            rVar.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setTitleCondensed(java.lang.CharSequence charSequence) {
        this.f17884f = charSequence;
        this.f17892n.K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public p212v1.b setTooltipText(java.lang.CharSequence charSequence) {
        this.f17897s = charSequence;
        this.f17892n.K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setVisible(boolean z6) {
        if (y(z6)) {
            this.f17892n.J(this);
        }
        return this;
    }

    public void t(boolean z6) {
        this.f17903y = (z6 ? 4 : 0) | (this.f17903y & (-5));
    }

    public java.lang.String toString() {
        java.lang.CharSequence charSequence = this.f17883e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    public void u(boolean z6) {
        this.f17903y = z6 ? this.f17903y | 32 : this.f17903y & (-33);
    }

    void v(android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        this.f17878E = contextMenuInfo;
    }

    @Override // p212v1.b, android.view.MenuItem
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public p212v1.b setShowAsActionFlags(int i6) {
        setShowAsAction(i6);
        return this;
    }

    public void x(androidx.appcompat.view.menu.r rVar) {
        this.f17893o = rVar;
        rVar.setHeaderTitle(getTitle());
    }

    boolean y(boolean z6) {
        int i6 = this.f17903y;
        int i10 = (z6 ? 0 : 8) | (i6 & (-9));
        this.f17903y = i10;
        return i6 != i10;
    }

    public boolean z() {
        return this.f17892n.A();
    }
}
