package androidx.appcompat.view;

/* JADX INFO: loaded from: classes.dex */
public class g extends android.view.MenuInflater {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final java.lang.Class[] f17673e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final java.lang.Class[] f17674f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final java.lang.Object[] f17675a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final java.lang.Object[] f17676b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    android.content.Context f17677c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private java.lang.Object f17678d;

    private static class a implements android.view.MenuItem.OnMenuItemClickListener {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final java.lang.Class[] f17679c = {android.view.MenuItem.class};

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private java.lang.Object f17680a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private java.lang.reflect.Method f17681b;

        public a(java.lang.Object obj, java.lang.String str) {
            this.f17680a = obj;
            java.lang.Class<?> cls = obj.getClass();
            try {
                this.f17681b = cls.getMethod(str, f17679c);
            } catch (java.lang.Exception e6) {
                android.view.InflateException inflateException = new android.view.InflateException("Couldn't resolve menu item onClick handler " + str + " in class " + cls.getName());
                inflateException.initCause(e6);
                throw inflateException;
            }
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(android.view.MenuItem menuItem) {
            try {
                if (this.f17681b.getReturnType() == java.lang.Boolean.TYPE) {
                    return ((java.lang.Boolean) this.f17681b.invoke(this.f17680a, menuItem)).booleanValue();
                }
                this.f17681b.invoke(this.f17680a, menuItem);
                return true;
            } catch (java.lang.Exception e6) {
                throw new java.lang.RuntimeException(e6);
            }
        }
    }

    private class b {

        /* JADX INFO: renamed from: A, reason: collision with root package name */
        androidx.core.view.AbstractC1992b f17682A;

        /* JADX INFO: renamed from: B, reason: collision with root package name */
        private java.lang.CharSequence f17683B;

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        private java.lang.CharSequence f17684C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        private android.content.res.ColorStateList f17685D = null;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        private android.graphics.PorterDuff.Mode f17686E = null;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private android.view.Menu f17688a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f17689b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f17690c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f17691d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f17692e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f17693f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f17694g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f17695h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f17696i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private int f17697j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private java.lang.CharSequence f17698k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private java.lang.CharSequence f17699l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private int f17700m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private char f17701n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private int f17702o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private char f17703p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private int f17704q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private int f17705r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private boolean f17706s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private boolean f17707t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private boolean f17708u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private int f17709v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        private int f17710w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        private java.lang.String f17711x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        private java.lang.String f17712y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        private java.lang.String f17713z;

        public b(android.view.Menu menu) {
            this.f17688a = menu;
            h();
        }

        private char c(java.lang.String str) {
            if (str == null) {
                return (char) 0;
            }
            return str.charAt(0);
        }

        private java.lang.Object e(java.lang.String str, java.lang.Class[] clsArr, java.lang.Object[] objArr) {
            try {
                java.lang.reflect.Constructor<?> constructor = java.lang.Class.forName(str, false, androidx.appcompat.view.g.this.f17677c.getClassLoader()).getConstructor(clsArr);
                constructor.setAccessible(true);
                return constructor.newInstance(objArr);
            } catch (java.lang.Exception e6) {
                java.lang.String str2 = "Cannot instantiate class: " + str;
                return null;
            }
        }

        private void i(android.view.MenuItem menuItem) {
            boolean z6 = false;
            menuItem.setChecked(this.f17706s).setVisible(this.f17707t).setEnabled(this.f17708u).setCheckable(this.f17705r >= 1).setTitleCondensed(this.f17699l).setIcon(this.f17700m);
            int i6 = this.f17709v;
            if (i6 >= 0) {
                menuItem.setShowAsAction(i6);
            }
            if (this.f17713z != null) {
                if (androidx.appcompat.view.g.this.f17677c.isRestricted()) {
                    throw new java.lang.IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
                menuItem.setOnMenuItemClickListener(new androidx.appcompat.view.g.a(androidx.appcompat.view.g.this.b(), this.f17713z));
            }
            if (this.f17705r >= 2) {
                if (menuItem instanceof androidx.appcompat.view.menu.i) {
                    ((androidx.appcompat.view.menu.i) menuItem).t(true);
                } else if (menuItem instanceof androidx.appcompat.view.menu.j) {
                    ((androidx.appcompat.view.menu.j) menuItem).h(true);
                }
            }
            java.lang.String str = this.f17711x;
            if (str != null) {
                menuItem.setActionView((android.view.View) e(str, androidx.appcompat.view.g.f17673e, androidx.appcompat.view.g.this.f17675a));
                z6 = true;
            }
            int i10 = this.f17710w;
            if (i10 > 0 && !z6) {
                menuItem.setActionView(i10);
            }
            androidx.core.view.AbstractC1992b abstractC1992b = this.f17682A;
            if (abstractC1992b != null) {
                androidx.core.view.AbstractC2037y.a(menuItem, abstractC1992b);
            }
            androidx.core.view.AbstractC2037y.c(menuItem, this.f17683B);
            androidx.core.view.AbstractC2037y.g(menuItem, this.f17684C);
            androidx.core.view.AbstractC2037y.b(menuItem, this.f17701n, this.f17702o);
            androidx.core.view.AbstractC2037y.f(menuItem, this.f17703p, this.f17704q);
            android.graphics.PorterDuff.Mode mode = this.f17686E;
            if (mode != null) {
                androidx.core.view.AbstractC2037y.e(menuItem, mode);
            }
            android.content.res.ColorStateList colorStateList = this.f17685D;
            if (colorStateList != null) {
                androidx.core.view.AbstractC2037y.d(menuItem, colorStateList);
            }
        }

        public void a() {
            this.f17695h = true;
            i(this.f17688a.add(this.f17689b, this.f17696i, this.f17697j, this.f17698k));
        }

        public android.view.SubMenu b() {
            this.f17695h = true;
            android.view.SubMenu subMenuAddSubMenu = this.f17688a.addSubMenu(this.f17689b, this.f17696i, this.f17697j, this.f17698k);
            i(subMenuAddSubMenu.getItem());
            return subMenuAddSubMenu;
        }

        public boolean d() {
            return this.f17695h;
        }

        public void f(android.util.AttributeSet attributeSet) {
            android.content.res.TypedArray typedArrayObtainStyledAttributes = androidx.appcompat.view.g.this.f17677c.obtainStyledAttributes(attributeSet, p090j.j.f48973o1);
            this.f17689b = typedArrayObtainStyledAttributes.getResourceId(p090j.j.f48983q1, 0);
            this.f17690c = typedArrayObtainStyledAttributes.getInt(p090j.j.f48993s1, 0);
            this.f17691d = typedArrayObtainStyledAttributes.getInt(p090j.j.f48998t1, 0);
            this.f17692e = typedArrayObtainStyledAttributes.getInt(p090j.j.f49003u1, 0);
            this.f17693f = typedArrayObtainStyledAttributes.getBoolean(p090j.j.f48988r1, true);
            this.f17694g = typedArrayObtainStyledAttributes.getBoolean(p090j.j.f48978p1, true);
            typedArrayObtainStyledAttributes.recycle();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public void g(android.util.AttributeSet attributeSet) {
            androidx.appcompat.widget.c0 c0VarU = androidx.appcompat.widget.c0.u(androidx.appcompat.view.g.this.f17677c, attributeSet, p090j.j.f49008v1);
            this.f17696i = c0VarU.n(p090j.j.f49023y1, 0);
            this.f17697j = (c0VarU.k(p090j.j.f48801B1, this.f17690c) & (-65536)) | (c0VarU.k(p090j.j.f48806C1, this.f17691d) & 65535);
            this.f17698k = c0VarU.p(p090j.j.f48811D1);
            this.f17699l = c0VarU.p(p090j.j.f48815E1);
            this.f17700m = c0VarU.n(p090j.j.f49013w1, 0);
            this.f17701n = c(c0VarU.o(p090j.j.f48819F1));
            this.f17702o = c0VarU.k(p090j.j.f48847M1, 4096);
            this.f17703p = c(c0VarU.o(p090j.j.f48823G1));
            this.f17704q = c0VarU.k(p090j.j.f48863Q1, 4096);
            this.f17705r = c0VarU.s(p090j.j.f48827H1) ? c0VarU.a(p090j.j.f48827H1, false) : this.f17692e;
            this.f17706s = c0VarU.a(p090j.j.f49028z1, false);
            this.f17707t = c0VarU.a(p090j.j.f48796A1, this.f17693f);
            this.f17708u = c0VarU.a(p090j.j.f49018x1, this.f17694g);
            this.f17709v = c0VarU.k(p090j.j.f48867R1, -1);
            this.f17713z = c0VarU.o(p090j.j.f48831I1);
            this.f17710w = c0VarU.n(p090j.j.f48835J1, 0);
            this.f17711x = c0VarU.o(p090j.j.f48843L1);
            java.lang.String strO = c0VarU.o(p090j.j.f48839K1);
            this.f17712y = strO;
            boolean z6 = strO != null;
            if (z6 && this.f17710w == 0 && this.f17711x == null) {
                this.f17682A = (androidx.core.view.AbstractC1992b) e(strO, androidx.appcompat.view.g.f17674f, androidx.appcompat.view.g.this.f17676b);
            } else {
                if (z6) {
                }
                this.f17682A = null;
            }
            this.f17683B = c0VarU.p(p090j.j.f48851N1);
            this.f17684C = c0VarU.p(p090j.j.f48871S1);
            if (c0VarU.s(p090j.j.f48859P1)) {
                this.f17686E = androidx.appcompat.widget.K.d(c0VarU.k(p090j.j.f48859P1, -1), this.f17686E);
            } else {
                this.f17686E = null;
            }
            if (c0VarU.s(p090j.j.f48855O1)) {
                this.f17685D = c0VarU.c(p090j.j.f48855O1);
            } else {
                this.f17685D = null;
            }
            c0VarU.w();
            this.f17695h = false;
        }

        public void h() {
            this.f17689b = 0;
            this.f17690c = 0;
            this.f17691d = 0;
            this.f17692e = 0;
            this.f17693f = true;
            this.f17694g = true;
        }
    }

    static {
        java.lang.Class[] clsArr = {android.content.Context.class};
        f17673e = clsArr;
        f17674f = clsArr;
    }

    public g(android.content.Context context) {
        super(context);
        this.f17677c = context;
        java.lang.Object[] objArr = {context};
        this.f17675a = objArr;
        this.f17676b = objArr;
    }

    private java.lang.Object a(java.lang.Object obj) {
        return (!(obj instanceof android.app.Activity) && (obj instanceof android.content.ContextWrapper)) ? a(((android.content.ContextWrapper) obj).getBaseContext()) : obj;
    }

    private void c(org.xmlpull.v1.XmlPullParser xmlPullParser, android.util.AttributeSet attributeSet, android.view.Menu menu) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        androidx.appcompat.view.g.b bVar = new androidx.appcompat.view.g.b(menu);
        int eventType = xmlPullParser.getEventType();
        do {
            if (eventType == 2) {
                java.lang.String name = xmlPullParser.getName();
                if (name.equals("menu")) {
                    eventType = xmlPullParser.next();
                    break;
                }
                throw new java.lang.RuntimeException("Expecting menu, got " + name);
            }
            eventType = xmlPullParser.next();
        } while (eventType != 1);
        boolean z6 = false;
        boolean z10 = false;
        java.lang.String str = null;
        while (!z6) {
            if (eventType == 1) {
                throw new java.lang.RuntimeException("Unexpected end of document");
            }
            if (eventType != 2) {
                if (eventType == 3) {
                    java.lang.String name2 = xmlPullParser.getName();
                    if (z10 && name2.equals(str)) {
                        z10 = false;
                        str = null;
                    } else if (name2.equals("group")) {
                        bVar.h();
                    } else if (name2.equals("item")) {
                        if (!bVar.d()) {
                            androidx.core.view.AbstractC1992b abstractC1992b = bVar.f17682A;
                            if (abstractC1992b == null || !abstractC1992b.a()) {
                                bVar.a();
                            } else {
                                bVar.b();
                            }
                        }
                    } else if (name2.equals("menu")) {
                        z6 = true;
                    }
                }
            } else if (!z10) {
                java.lang.String name3 = xmlPullParser.getName();
                if (name3.equals("group")) {
                    bVar.f(attributeSet);
                } else if (name3.equals("item")) {
                    bVar.g(attributeSet);
                } else if (name3.equals("menu")) {
                    c(xmlPullParser, attributeSet, bVar.b());
                } else {
                    str = name3;
                    z10 = true;
                }
            }
            eventType = xmlPullParser.next();
        }
    }

    java.lang.Object b() {
        if (this.f17678d == null) {
            this.f17678d = a(this.f17677c);
        }
        return this.f17678d;
    }

    @Override // android.view.MenuInflater
    public void inflate(int i6, android.view.Menu menu) {
        if (!(menu instanceof p212v1.a)) {
            super.inflate(i6, menu);
            return;
        }
        android.content.res.XmlResourceParser layout = null;
        try {
            try {
                try {
                    layout = this.f17677c.getResources().getLayout(i6);
                    c(layout, android.util.Xml.asAttributeSet(layout), menu);
                    if (layout != null) {
                        layout.close();
                    }
                } catch (java.io.IOException e6) {
                    throw new android.view.InflateException("Error inflating menu XML", e6);
                }
            } catch (org.xmlpull.v1.XmlPullParserException e10) {
                throw new android.view.InflateException("Error inflating menu XML", e10);
            }
        } catch (java.lang.Throwable th) {
            if (layout != null) {
                layout.close();
            }
            throw th;
        }
    }
}
