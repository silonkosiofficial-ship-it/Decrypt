package androidx.appcompat.view.menu;

/* JADX INFO: loaded from: classes.dex */
public class a implements p212v1.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f17756a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f17757b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f17758c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private java.lang.CharSequence f17759d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private java.lang.CharSequence f17760e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private android.content.Intent f17761f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private char f17762g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private char f17764i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private android.graphics.drawable.Drawable f17766k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private android.content.Context f17767l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private android.view.MenuItem.OnMenuItemClickListener f17768m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private java.lang.CharSequence f17769n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private java.lang.CharSequence f17770o;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f17763h = 4096;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f17765j = 4096;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private android.content.res.ColorStateList f17771p = null;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private android.graphics.PorterDuff.Mode f17772q = null;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f17773r = false;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f17774s = false;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f17775t = 16;

    public a(android.content.Context context, int i6, int i10, int i11, int i12, java.lang.CharSequence charSequence) {
        this.f17767l = context;
        this.f17756a = i10;
        this.f17757b = i6;
        this.f17758c = i12;
        this.f17759d = charSequence;
    }

    private void c() {
        android.graphics.drawable.Drawable drawable = this.f17766k;
        if (drawable != null) {
            if (this.f17773r || this.f17774s) {
                android.graphics.drawable.Drawable drawableR = androidx.core.graphics.drawable.a.r(drawable);
                this.f17766k = drawableR;
                android.graphics.drawable.Drawable drawableMutate = drawableR.mutate();
                this.f17766k = drawableMutate;
                if (this.f17773r) {
                    androidx.core.graphics.drawable.a.o(drawableMutate, this.f17771p);
                }
                if (this.f17774s) {
                    androidx.core.graphics.drawable.a.p(this.f17766k, this.f17772q);
                }
            }
        }
    }

    @Override // p212v1.b
    public p212v1.b a(androidx.core.view.AbstractC1992b abstractC1992b) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // p212v1.b
    public androidx.core.view.AbstractC1992b b() {
        return null;
    }

    @Override // p212v1.b, android.view.MenuItem
    public boolean collapseActionView() {
        return false;
    }

    @Override // p212v1.b, android.view.MenuItem
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public p212v1.b setActionView(int i6) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // p212v1.b, android.view.MenuItem
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public p212v1.b setActionView(android.view.View view) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // p212v1.b, android.view.MenuItem
    public boolean expandActionView() {
        return false;
    }

    @Override // p212v1.b, android.view.MenuItem
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public p212v1.b setShowAsActionFlags(int i6) {
        setShowAsAction(i6);
        return this;
    }

    @Override // android.view.MenuItem
    public android.view.ActionProvider getActionProvider() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // p212v1.b, android.view.MenuItem
    public android.view.View getActionView() {
        return null;
    }

    @Override // p212v1.b, android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f17765j;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f17764i;
    }

    @Override // p212v1.b, android.view.MenuItem
    public java.lang.CharSequence getContentDescription() {
        return this.f17769n;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f17757b;
    }

    @Override // android.view.MenuItem
    public android.graphics.drawable.Drawable getIcon() {
        return this.f17766k;
    }

    @Override // p212v1.b, android.view.MenuItem
    public android.content.res.ColorStateList getIconTintList() {
        return this.f17771p;
    }

    @Override // p212v1.b, android.view.MenuItem
    public android.graphics.PorterDuff.Mode getIconTintMode() {
        return this.f17772q;
    }

    @Override // android.view.MenuItem
    public android.content.Intent getIntent() {
        return this.f17761f;
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return this.f17756a;
    }

    @Override // android.view.MenuItem
    public android.view.ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // p212v1.b, android.view.MenuItem
    public int getNumericModifiers() {
        return this.f17763h;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f17762g;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f17758c;
    }

    @Override // android.view.MenuItem
    public android.view.SubMenu getSubMenu() {
        return null;
    }

    @Override // android.view.MenuItem
    public java.lang.CharSequence getTitle() {
        return this.f17759d;
    }

    @Override // android.view.MenuItem
    public java.lang.CharSequence getTitleCondensed() {
        java.lang.CharSequence charSequence = this.f17760e;
        return charSequence != null ? charSequence : this.f17759d;
    }

    @Override // p212v1.b, android.view.MenuItem
    public java.lang.CharSequence getTooltipText() {
        return this.f17770o;
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return false;
    }

    @Override // p212v1.b, android.view.MenuItem
    public boolean isActionViewExpanded() {
        return false;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return (this.f17775t & 1) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return (this.f17775t & 2) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return (this.f17775t & 16) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        return (this.f17775t & 8) == 0;
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setActionProvider(android.view.ActionProvider actionProvider) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setAlphabeticShortcut(char c6) {
        this.f17764i = java.lang.Character.toLowerCase(c6);
        return this;
    }

    @Override // p212v1.b, android.view.MenuItem
    public android.view.MenuItem setAlphabeticShortcut(char c6, int i6) {
        this.f17764i = java.lang.Character.toLowerCase(c6);
        this.f17765j = android.view.KeyEvent.normalizeMetaState(i6);
        return this;
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setCheckable(boolean z6) {
        this.f17775t = (z6 ? 1 : 0) | (this.f17775t & (-2));
        return this;
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setChecked(boolean z6) {
        this.f17775t = (z6 ? 2 : 0) | (this.f17775t & (-3));
        return this;
    }

    @Override // android.view.MenuItem
    public p212v1.b setContentDescription(java.lang.CharSequence charSequence) {
        this.f17769n = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setEnabled(boolean z6) {
        this.f17775t = (z6 ? 16 : 0) | (this.f17775t & (-17));
        return this;
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setIcon(int i6) {
        this.f17766k = androidx.core.content.a.e(this.f17767l, i6);
        c();
        return this;
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setIcon(android.graphics.drawable.Drawable drawable) {
        this.f17766k = drawable;
        c();
        return this;
    }

    @Override // p212v1.b, android.view.MenuItem
    public android.view.MenuItem setIconTintList(android.content.res.ColorStateList colorStateList) {
        this.f17771p = colorStateList;
        this.f17773r = true;
        c();
        return this;
    }

    @Override // p212v1.b, android.view.MenuItem
    public android.view.MenuItem setIconTintMode(android.graphics.PorterDuff.Mode mode) {
        this.f17772q = mode;
        this.f17774s = true;
        c();
        return this;
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setIntent(android.content.Intent intent) {
        this.f17761f = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setNumericShortcut(char c6) {
        this.f17762g = c6;
        return this;
    }

    @Override // p212v1.b, android.view.MenuItem
    public android.view.MenuItem setNumericShortcut(char c6, int i6) {
        this.f17762g = c6;
        this.f17763h = android.view.KeyEvent.normalizeMetaState(i6);
        return this;
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setOnActionExpandListener(android.view.MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setOnMenuItemClickListener(android.view.MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f17768m = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setShortcut(char c6, char c10) {
        this.f17762g = c6;
        this.f17764i = java.lang.Character.toLowerCase(c10);
        return this;
    }

    @Override // p212v1.b, android.view.MenuItem
    public android.view.MenuItem setShortcut(char c6, char c10, int i6, int i10) {
        this.f17762g = c6;
        this.f17763h = android.view.KeyEvent.normalizeMetaState(i6);
        this.f17764i = java.lang.Character.toLowerCase(c10);
        this.f17765j = android.view.KeyEvent.normalizeMetaState(i10);
        return this;
    }

    @Override // p212v1.b, android.view.MenuItem
    public void setShowAsAction(int i6) {
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setTitle(int i6) {
        this.f17759d = this.f17767l.getResources().getString(i6);
        return this;
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setTitle(java.lang.CharSequence charSequence) {
        this.f17759d = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setTitleCondensed(java.lang.CharSequence charSequence) {
        this.f17760e = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public p212v1.b setTooltipText(java.lang.CharSequence charSequence) {
        this.f17770o = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setVisible(boolean z6) {
        this.f17775t = (this.f17775t & 8) | (z6 ? 0 : 8);
        return this;
    }
}
