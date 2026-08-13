package androidx.appcompat.view.menu;

/* JADX INFO: loaded from: classes.dex */
public class j extends androidx.appcompat.view.menu.c implements android.view.MenuItem {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final p212v1.b f17906d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private java.lang.reflect.Method f17907e;

    private class a extends androidx.core.view.AbstractC1992b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final android.view.ActionProvider f17908d;

        a(android.content.Context context, android.view.ActionProvider actionProvider) {
            super(context);
            this.f17908d = actionProvider;
        }

        @Override // androidx.core.view.AbstractC1992b
        public boolean a() {
            return this.f17908d.hasSubMenu();
        }

        @Override // androidx.core.view.AbstractC1992b
        public boolean d() {
            return this.f17908d.onPerformDefaultAction();
        }

        @Override // androidx.core.view.AbstractC1992b
        public void e(android.view.SubMenu subMenu) {
            this.f17908d.onPrepareSubMenu(androidx.appcompat.view.menu.j.this.d(subMenu));
        }
    }

    private class b extends androidx.appcompat.view.menu.j.a implements android.view.ActionProvider.VisibilityListener {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private androidx.core.view.AbstractC1992b.InterfaceC0412b f17910f;

        b(android.content.Context context, android.view.ActionProvider actionProvider) {
            super(context, actionProvider);
        }

        @Override // androidx.core.view.AbstractC1992b
        public boolean b() {
            return this.f17908d.isVisible();
        }

        @Override // androidx.core.view.AbstractC1992b
        public android.view.View c(android.view.MenuItem menuItem) {
            return this.f17908d.onCreateActionView(menuItem);
        }

        @Override // androidx.core.view.AbstractC1992b
        public boolean f() {
            return this.f17908d.overridesItemVisibility();
        }

        @Override // androidx.core.view.AbstractC1992b
        public void i(androidx.core.view.AbstractC1992b.InterfaceC0412b interfaceC0412b) {
            this.f17910f = interfaceC0412b;
            this.f17908d.setVisibilityListener(interfaceC0412b != null ? this : null);
        }

        @Override // android.view.ActionProvider.VisibilityListener
        public void onActionProviderVisibilityChanged(boolean z6) {
            androidx.core.view.AbstractC1992b.InterfaceC0412b interfaceC0412b = this.f17910f;
            if (interfaceC0412b != null) {
                interfaceC0412b.onActionProviderVisibilityChanged(z6);
            }
        }
    }

    static class c extends android.widget.FrameLayout implements androidx.appcompat.view.c {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        final android.view.CollapsibleActionView f17912C;

        /* JADX WARN: Multi-variable type inference failed */
        c(android.view.View view) {
            super(view.getContext());
            this.f17912C = (android.view.CollapsibleActionView) view;
            addView(view);
        }

        android.view.View a() {
            return (android.view.View) this.f17912C;
        }

        @Override // androidx.appcompat.view.c
        public void c() {
            this.f17912C.onActionViewExpanded();
        }

        @Override // androidx.appcompat.view.c
        public void e() {
            this.f17912C.onActionViewCollapsed();
        }
    }

    private class d implements android.view.MenuItem.OnActionExpandListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final android.view.MenuItem.OnActionExpandListener f17913a;

        d(android.view.MenuItem.OnActionExpandListener onActionExpandListener) {
            this.f17913a = onActionExpandListener;
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionCollapse(android.view.MenuItem menuItem) {
            return this.f17913a.onMenuItemActionCollapse(androidx.appcompat.view.menu.j.this.c(menuItem));
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionExpand(android.view.MenuItem menuItem) {
            return this.f17913a.onMenuItemActionExpand(androidx.appcompat.view.menu.j.this.c(menuItem));
        }
    }

    private class e implements android.view.MenuItem.OnMenuItemClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final android.view.MenuItem.OnMenuItemClickListener f17915a;

        e(android.view.MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
            this.f17915a = onMenuItemClickListener;
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(android.view.MenuItem menuItem) {
            return this.f17915a.onMenuItemClick(androidx.appcompat.view.menu.j.this.c(menuItem));
        }
    }

    public j(android.content.Context context, p212v1.b bVar) {
        super(context);
        if (bVar == null) {
            throw new java.lang.IllegalArgumentException("Wrapped Object can not be null.");
        }
        this.f17906d = bVar;
    }

    @Override // android.view.MenuItem
    public boolean collapseActionView() {
        return this.f17906d.collapseActionView();
    }

    @Override // android.view.MenuItem
    public boolean expandActionView() {
        return this.f17906d.expandActionView();
    }

    @Override // android.view.MenuItem
    public android.view.ActionProvider getActionProvider() {
        androidx.core.view.AbstractC1992b abstractC1992bB = this.f17906d.b();
        if (abstractC1992bB instanceof androidx.appcompat.view.menu.j.a) {
            return ((androidx.appcompat.view.menu.j.a) abstractC1992bB).f17908d;
        }
        return null;
    }

    @Override // android.view.MenuItem
    public android.view.View getActionView() {
        android.view.View actionView = this.f17906d.getActionView();
        return actionView instanceof androidx.appcompat.view.menu.j.c ? ((androidx.appcompat.view.menu.j.c) actionView).a() : actionView;
    }

    @Override // android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f17906d.getAlphabeticModifiers();
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f17906d.getAlphabeticShortcut();
    }

    @Override // android.view.MenuItem
    public java.lang.CharSequence getContentDescription() {
        return this.f17906d.getContentDescription();
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f17906d.getGroupId();
    }

    @Override // android.view.MenuItem
    public android.graphics.drawable.Drawable getIcon() {
        return this.f17906d.getIcon();
    }

    @Override // android.view.MenuItem
    public android.content.res.ColorStateList getIconTintList() {
        return this.f17906d.getIconTintList();
    }

    @Override // android.view.MenuItem
    public android.graphics.PorterDuff.Mode getIconTintMode() {
        return this.f17906d.getIconTintMode();
    }

    @Override // android.view.MenuItem
    public android.content.Intent getIntent() {
        return this.f17906d.getIntent();
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return this.f17906d.getItemId();
    }

    @Override // android.view.MenuItem
    public android.view.ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f17906d.getMenuInfo();
    }

    @Override // android.view.MenuItem
    public int getNumericModifiers() {
        return this.f17906d.getNumericModifiers();
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f17906d.getNumericShortcut();
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f17906d.getOrder();
    }

    @Override // android.view.MenuItem
    public android.view.SubMenu getSubMenu() {
        return d(this.f17906d.getSubMenu());
    }

    @Override // android.view.MenuItem
    public java.lang.CharSequence getTitle() {
        return this.f17906d.getTitle();
    }

    @Override // android.view.MenuItem
    public java.lang.CharSequence getTitleCondensed() {
        return this.f17906d.getTitleCondensed();
    }

    @Override // android.view.MenuItem
    public java.lang.CharSequence getTooltipText() {
        return this.f17906d.getTooltipText();
    }

    public void h(boolean z6) {
        try {
            if (this.f17907e == null) {
                this.f17907e = this.f17906d.getClass().getDeclaredMethod("setExclusiveCheckable", java.lang.Boolean.TYPE);
            }
            this.f17907e.invoke(this.f17906d, java.lang.Boolean.valueOf(z6));
        } catch (java.lang.Exception e6) {
        }
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return this.f17906d.hasSubMenu();
    }

    @Override // android.view.MenuItem
    public boolean isActionViewExpanded() {
        return this.f17906d.isActionViewExpanded();
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return this.f17906d.isCheckable();
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return this.f17906d.isChecked();
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return this.f17906d.isEnabled();
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        return this.f17906d.isVisible();
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setActionProvider(android.view.ActionProvider actionProvider) {
        androidx.appcompat.view.menu.j.b bVar = new androidx.appcompat.view.menu.j.b(this.f17786a, actionProvider);
        p212v1.b bVar2 = this.f17906d;
        if (actionProvider == null) {
            bVar = null;
        }
        bVar2.a(bVar);
        return this;
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setActionView(int i6) {
        this.f17906d.setActionView(i6);
        android.view.View actionView = this.f17906d.getActionView();
        if (actionView instanceof android.view.CollapsibleActionView) {
            this.f17906d.setActionView(new androidx.appcompat.view.menu.j.c(actionView));
        }
        return this;
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setActionView(android.view.View view) {
        if (view instanceof android.view.CollapsibleActionView) {
            view = new androidx.appcompat.view.menu.j.c(view);
        }
        this.f17906d.setActionView(view);
        return this;
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setAlphabeticShortcut(char c6) {
        this.f17906d.setAlphabeticShortcut(c6);
        return this;
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setAlphabeticShortcut(char c6, int i6) {
        this.f17906d.setAlphabeticShortcut(c6, i6);
        return this;
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setCheckable(boolean z6) {
        this.f17906d.setCheckable(z6);
        return this;
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setChecked(boolean z6) {
        this.f17906d.setChecked(z6);
        return this;
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setContentDescription(java.lang.CharSequence charSequence) {
        this.f17906d.setContentDescription(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setEnabled(boolean z6) {
        this.f17906d.setEnabled(z6);
        return this;
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setIcon(int i6) {
        this.f17906d.setIcon(i6);
        return this;
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setIcon(android.graphics.drawable.Drawable drawable) {
        this.f17906d.setIcon(drawable);
        return this;
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setIconTintList(android.content.res.ColorStateList colorStateList) {
        this.f17906d.setIconTintList(colorStateList);
        return this;
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setIconTintMode(android.graphics.PorterDuff.Mode mode) {
        this.f17906d.setIconTintMode(mode);
        return this;
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setIntent(android.content.Intent intent) {
        this.f17906d.setIntent(intent);
        return this;
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setNumericShortcut(char c6) {
        this.f17906d.setNumericShortcut(c6);
        return this;
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setNumericShortcut(char c6, int i6) {
        this.f17906d.setNumericShortcut(c6, i6);
        return this;
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setOnActionExpandListener(android.view.MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f17906d.setOnActionExpandListener(onActionExpandListener != null ? new androidx.appcompat.view.menu.j.d(onActionExpandListener) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setOnMenuItemClickListener(android.view.MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f17906d.setOnMenuItemClickListener(onMenuItemClickListener != null ? new androidx.appcompat.view.menu.j.e(onMenuItemClickListener) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setShortcut(char c6, char c10) {
        this.f17906d.setShortcut(c6, c10);
        return this;
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setShortcut(char c6, char c10, int i6, int i10) {
        this.f17906d.setShortcut(c6, c10, i6, i10);
        return this;
    }

    @Override // android.view.MenuItem
    public void setShowAsAction(int i6) {
        this.f17906d.setShowAsAction(i6);
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setShowAsActionFlags(int i6) {
        this.f17906d.setShowAsActionFlags(i6);
        return this;
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setTitle(int i6) {
        this.f17906d.setTitle(i6);
        return this;
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setTitle(java.lang.CharSequence charSequence) {
        this.f17906d.setTitle(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setTitleCondensed(java.lang.CharSequence charSequence) {
        this.f17906d.setTitleCondensed(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setTooltipText(java.lang.CharSequence charSequence) {
        this.f17906d.setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setVisible(boolean z6) {
        return this.f17906d.setVisible(z6);
    }
}
