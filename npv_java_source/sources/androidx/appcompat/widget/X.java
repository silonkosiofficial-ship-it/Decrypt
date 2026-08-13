package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes.dex */
class X extends G1.c implements android.view.View.OnClickListener {

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private final androidx.appcompat.widget.SearchView f18375N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final android.app.SearchableInfo f18376O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private final android.content.Context f18377P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private final java.util.WeakHashMap f18378Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private final int f18379R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private boolean f18380S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private int f18381T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private android.content.res.ColorStateList f18382U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    private int f18383V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    private int f18384W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    private int f18385X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    private int f18386Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private int f18387Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private int f18388a0;

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final android.widget.TextView f18389a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final android.widget.TextView f18390b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final android.widget.ImageView f18391c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final android.widget.ImageView f18392d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final android.widget.ImageView f18393e;

        public a(android.view.View view) {
            this.f18389a = (android.widget.TextView) view.findViewById(android.R.id.text1);
            this.f18390b = (android.widget.TextView) view.findViewById(android.R.id.text2);
            this.f18391c = (android.widget.ImageView) view.findViewById(android.R.id.icon1);
            this.f18392d = (android.widget.ImageView) view.findViewById(android.R.id.icon2);
            this.f18393e = (android.widget.ImageView) view.findViewById(p090j.f.f48749q);
        }
    }

    public X(android.content.Context context, androidx.appcompat.widget.SearchView searchView, android.app.SearchableInfo searchableInfo, java.util.WeakHashMap weakHashMap) {
        super(context, searchView.getSuggestionRowLayout(), null, true);
        this.f18380S = false;
        this.f18381T = 1;
        this.f18383V = -1;
        this.f18384W = -1;
        this.f18385X = -1;
        this.f18386Y = -1;
        this.f18387Z = -1;
        this.f18388a0 = -1;
        this.f18375N = searchView;
        this.f18376O = searchableInfo;
        this.f18379R = searchView.getSuggestionCommitIconResId();
        this.f18377P = context;
        this.f18378Q = weakHashMap;
    }

    private android.graphics.drawable.Drawable A(android.net.Uri uri) {
        try {
            if ("android.resource".equals(uri.getScheme())) {
                try {
                    return B(uri);
                } catch (android.content.res.Resources.NotFoundException unused) {
                    throw new java.io.FileNotFoundException("Resource does not exist: " + uri);
                }
            }
            java.io.InputStream inputStreamOpenInputStream = this.f18377P.getContentResolver().openInputStream(uri);
            if (inputStreamOpenInputStream == null) {
                throw new java.io.FileNotFoundException("Failed to open " + uri);
            }
            try {
                android.graphics.drawable.Drawable drawableCreateFromStream = android.graphics.drawable.Drawable.createFromStream(inputStreamOpenInputStream, null);
                try {
                    inputStreamOpenInputStream.close();
                } catch (java.io.IOException e6) {
                    java.lang.String str = "Error closing icon stream for " + uri;
                }
                return drawableCreateFromStream;
            } catch (java.lang.Throwable th) {
                try {
                    inputStreamOpenInputStream.close();
                } catch (java.io.IOException e10) {
                    java.lang.String str2 = "Error closing icon stream for " + uri;
                }
                throw th;
            }
        } catch (java.io.FileNotFoundException e11) {
            java.lang.String str3 = "Icon not found: " + uri + ", " + e11.getMessage();
            return null;
        }
        java.lang.String str4 = "Icon not found: " + uri + ", " + e11.getMessage();
        return null;
    }

    private android.graphics.drawable.Drawable C(java.lang.String str) {
        if (str == null || str.isEmpty() || "0".equals(str)) {
            return null;
        }
        try {
            int i6 = java.lang.Integer.parseInt(str);
            java.lang.String str2 = "android.resource://" + this.f18377P.getPackageName() + "/" + i6;
            android.graphics.drawable.Drawable drawableU = u(str2);
            if (drawableU != null) {
                return drawableU;
            }
            android.graphics.drawable.Drawable drawableE = androidx.core.content.a.e(this.f18377P, i6);
            K(str2, drawableE);
            return drawableE;
        } catch (android.content.res.Resources.NotFoundException unused) {
            java.lang.String str3 = "Icon resource not found: " + str;
            return null;
        } catch (java.lang.NumberFormatException unused2) {
            android.graphics.drawable.Drawable drawableU2 = u(str);
            if (drawableU2 != null) {
                return drawableU2;
            }
            android.graphics.drawable.Drawable drawableA = A(android.net.Uri.parse(str));
            K(str, drawableA);
            return drawableA;
        }
    }

    private android.graphics.drawable.Drawable D(android.database.Cursor cursor) {
        int i6 = this.f18386Y;
        if (i6 == -1) {
            return null;
        }
        android.graphics.drawable.Drawable drawableC = C(cursor.getString(i6));
        return drawableC != null ? drawableC : z();
    }

    private android.graphics.drawable.Drawable E(android.database.Cursor cursor) {
        int i6 = this.f18387Z;
        if (i6 == -1) {
            return null;
        }
        return C(cursor.getString(i6));
    }

    private static java.lang.String G(android.database.Cursor cursor, int i6) {
        if (i6 == -1) {
            return null;
        }
        try {
            return cursor.getString(i6);
        } catch (java.lang.Exception e6) {
            return null;
        }
    }

    private void I(android.widget.ImageView imageView, android.graphics.drawable.Drawable drawable, int i6) {
        imageView.setImageDrawable(drawable);
        if (drawable == null) {
            imageView.setVisibility(i6);
            return;
        }
        imageView.setVisibility(0);
        drawable.setVisible(false, false);
        drawable.setVisible(true, false);
    }

    private void J(android.widget.TextView textView, java.lang.CharSequence charSequence) {
        textView.setText(charSequence);
        textView.setVisibility(android.text.TextUtils.isEmpty(charSequence) ? 8 : 0);
    }

    private void K(java.lang.String str, android.graphics.drawable.Drawable drawable) {
        if (drawable != null) {
            this.f18378Q.put(str, drawable.getConstantState());
        }
    }

    private void L(android.database.Cursor cursor) {
        android.os.Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    private android.graphics.drawable.Drawable u(java.lang.String str) {
        android.graphics.drawable.Drawable.ConstantState constantState = (android.graphics.drawable.Drawable.ConstantState) this.f18378Q.get(str);
        if (constantState == null) {
            return null;
        }
        return constantState.newDrawable();
    }

    private java.lang.CharSequence v(java.lang.CharSequence charSequence) {
        if (this.f18382U == null) {
            android.util.TypedValue typedValue = new android.util.TypedValue();
            this.f18377P.getTheme().resolveAttribute(p090j.a.f48621I, typedValue, true);
            this.f18382U = this.f18377P.getResources().getColorStateList(typedValue.resourceId);
        }
        android.text.SpannableString spannableString = new android.text.SpannableString(charSequence);
        spannableString.setSpan(new android.text.style.TextAppearanceSpan(null, 0, 0, this.f18382U, null), 0, charSequence.length(), 33);
        return spannableString;
    }

    private android.graphics.drawable.Drawable w(android.content.ComponentName componentName) {
        android.content.pm.PackageManager packageManager = this.f18377P.getPackageManager();
        try {
            android.content.pm.ActivityInfo activityInfo = packageManager.getActivityInfo(componentName, 128);
            int iconResource = activityInfo.getIconResource();
            if (iconResource == 0) {
                return null;
            }
            android.graphics.drawable.Drawable drawable = packageManager.getDrawable(componentName.getPackageName(), iconResource, activityInfo.applicationInfo);
            if (drawable != null) {
                return drawable;
            }
            java.lang.String str = "Invalid icon resource " + iconResource + " for " + componentName.flattenToShortString();
            return null;
        } catch (android.content.pm.PackageManager.NameNotFoundException e6) {
            e6.toString();
        }
    }

    private android.graphics.drawable.Drawable x(android.content.ComponentName componentName) {
        java.lang.String strFlattenToShortString = componentName.flattenToShortString();
        if (!this.f18378Q.containsKey(strFlattenToShortString)) {
            android.graphics.drawable.Drawable drawableW = w(componentName);
            this.f18378Q.put(strFlattenToShortString, drawableW != null ? drawableW.getConstantState() : null);
            return drawableW;
        }
        android.graphics.drawable.Drawable.ConstantState constantState = (android.graphics.drawable.Drawable.ConstantState) this.f18378Q.get(strFlattenToShortString);
        if (constantState == null) {
            return null;
        }
        return constantState.newDrawable(this.f18377P.getResources());
    }

    public static java.lang.String y(android.database.Cursor cursor, java.lang.String str) {
        return G(cursor, cursor.getColumnIndex(str));
    }

    private android.graphics.drawable.Drawable z() {
        android.graphics.drawable.Drawable drawableX = x(this.f18376O.getSearchActivity());
        return drawableX != null ? drawableX : this.f18377P.getPackageManager().getDefaultActivityIcon();
    }

    android.graphics.drawable.Drawable B(android.net.Uri uri) throws java.io.FileNotFoundException {
        int identifier;
        java.lang.String authority = uri.getAuthority();
        if (android.text.TextUtils.isEmpty(authority)) {
            throw new java.io.FileNotFoundException("No authority: " + uri);
        }
        try {
            android.content.res.Resources resourcesForApplication = this.f18377P.getPackageManager().getResourcesForApplication(authority);
            java.util.List<java.lang.String> pathSegments = uri.getPathSegments();
            if (pathSegments == null) {
                throw new java.io.FileNotFoundException("No path: " + uri);
            }
            int size = pathSegments.size();
            if (size == 1) {
                try {
                    identifier = java.lang.Integer.parseInt(pathSegments.get(0));
                } catch (java.lang.NumberFormatException unused) {
                    throw new java.io.FileNotFoundException("Single path segment is not a resource ID: " + uri);
                }
            } else {
                if (size != 2) {
                    throw new java.io.FileNotFoundException("More than two path segments: " + uri);
                }
                identifier = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
            }
            if (identifier != 0) {
                return resourcesForApplication.getDrawable(identifier);
            }
            throw new java.io.FileNotFoundException("No resource found for: " + uri);
        } catch (android.content.pm.PackageManager.NameNotFoundException unused2) {
            throw new java.io.FileNotFoundException("No package found for authority: " + uri);
        }
    }

    android.database.Cursor F(android.app.SearchableInfo searchableInfo, java.lang.String str, int i6) {
        java.lang.String suggestAuthority;
        java.lang.String[] strArr = null;
        if (searchableInfo == null || (suggestAuthority = searchableInfo.getSuggestAuthority()) == null) {
            return null;
        }
        android.net.Uri.Builder builderFragment = new android.net.Uri.Builder().scheme("content").authority(suggestAuthority).query("").fragment("");
        java.lang.String suggestPath = searchableInfo.getSuggestPath();
        if (suggestPath != null) {
            builderFragment.appendEncodedPath(suggestPath);
        }
        builderFragment.appendPath("search_suggest_query");
        java.lang.String suggestSelection = searchableInfo.getSuggestSelection();
        if (suggestSelection != null) {
            strArr = new java.lang.String[]{str};
        } else {
            builderFragment.appendPath(str);
        }
        java.lang.String[] strArr2 = strArr;
        if (i6 > 0) {
            builderFragment.appendQueryParameter("limit", java.lang.String.valueOf(i6));
        }
        return this.f18377P.getContentResolver().query(builderFragment.build(), null, suggestSelection, strArr2, null);
    }

    public void H(int i6) {
        this.f18381T = i6;
    }

    @Override // G1.a, G1.b.a
    public void a(android.database.Cursor cursor) {
        if (this.f18380S) {
            if (cursor != null) {
                cursor.close();
                return;
            }
            return;
        }
        try {
            super.a(cursor);
            if (cursor != null) {
                this.f18383V = cursor.getColumnIndex("suggest_text_1");
                this.f18384W = cursor.getColumnIndex("suggest_text_2");
                this.f18385X = cursor.getColumnIndex("suggest_text_2_url");
                this.f18386Y = cursor.getColumnIndex("suggest_icon_1");
                this.f18387Z = cursor.getColumnIndex("suggest_icon_2");
                this.f18388a0 = cursor.getColumnIndex("suggest_flags");
            }
        } catch (java.lang.Exception e6) {
        }
    }

    @Override // G1.a, G1.b.a
    public java.lang.CharSequence c(android.database.Cursor cursor) {
        java.lang.String strY;
        java.lang.String strY2;
        if (cursor == null) {
            return null;
        }
        java.lang.String strY3 = y(cursor, "suggest_intent_query");
        if (strY3 != null) {
            return strY3;
        }
        if (this.f18376O.shouldRewriteQueryFromData() && (strY2 = y(cursor, "suggest_intent_data")) != null) {
            return strY2;
        }
        if (!this.f18376O.shouldRewriteQueryFromText() || (strY = y(cursor, "suggest_text_1")) == null) {
            return null;
        }
        return strY;
    }

    @Override // G1.b.a
    public android.database.Cursor d(java.lang.CharSequence charSequence) {
        java.lang.String string = charSequence == null ? "" : charSequence.toString();
        if (this.f18375N.getVisibility() == 0 && this.f18375N.getWindowVisibility() == 0) {
            try {
                android.database.Cursor cursorF = F(this.f18376O, string, 50);
                if (cursorF != null) {
                    cursorF.getCount();
                    return cursorF;
                }
            } catch (java.lang.RuntimeException e6) {
            }
        }
        return null;
    }

    @Override // G1.a
    public void f(android.view.View view, android.content.Context context, android.database.Cursor cursor) {
        androidx.appcompat.widget.X.a aVar = (androidx.appcompat.widget.X.a) view.getTag();
        int i6 = this.f18388a0;
        int i10 = i6 != -1 ? cursor.getInt(i6) : 0;
        if (aVar.f18389a != null) {
            J(aVar.f18389a, G(cursor, this.f18383V));
        }
        if (aVar.f18390b != null) {
            java.lang.String strG = G(cursor, this.f18385X);
            java.lang.CharSequence charSequenceV = strG != null ? v(strG) : G(cursor, this.f18384W);
            if (android.text.TextUtils.isEmpty(charSequenceV)) {
                android.widget.TextView textView = aVar.f18389a;
                if (textView != null) {
                    textView.setSingleLine(false);
                    aVar.f18389a.setMaxLines(2);
                }
            } else {
                android.widget.TextView textView2 = aVar.f18389a;
                if (textView2 != null) {
                    textView2.setSingleLine(true);
                    aVar.f18389a.setMaxLines(1);
                }
            }
            J(aVar.f18390b, charSequenceV);
        }
        android.widget.ImageView imageView = aVar.f18391c;
        if (imageView != null) {
            I(imageView, D(cursor), 4);
        }
        android.widget.ImageView imageView2 = aVar.f18392d;
        if (imageView2 != null) {
            I(imageView2, E(cursor), 8);
        }
        int i11 = this.f18381T;
        if (i11 != 2 && (i11 != 1 || (i10 & 1) == 0)) {
            aVar.f18393e.setVisibility(8);
            return;
        }
        aVar.f18393e.setVisibility(0);
        aVar.f18393e.setTag(aVar.f18389a.getText());
        aVar.f18393e.setOnClickListener(this);
    }

    @Override // G1.a, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public android.view.View getDropDownView(int i6, android.view.View view, android.view.ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i6, view, viewGroup);
        } catch (java.lang.RuntimeException e6) {
            android.view.View viewO = o(this.f18377P, b(), viewGroup);
            if (viewO != null) {
                ((androidx.appcompat.widget.X.a) viewO.getTag()).f18389a.setText(e6.toString());
            }
            return viewO;
        }
    }

    @Override // G1.a, android.widget.Adapter
    public android.view.View getView(int i6, android.view.View view, android.view.ViewGroup viewGroup) {
        try {
            return super.getView(i6, view, viewGroup);
        } catch (java.lang.RuntimeException e6) {
            android.view.View viewR = r(this.f18377P, b(), viewGroup);
            if (viewR != null) {
                ((androidx.appcompat.widget.X.a) viewR.getTag()).f18389a.setText(e6.toString());
            }
            return viewR;
        }
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return false;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        L(b());
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        L(b());
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.lang.Object tag = view.getTag();
        if (tag instanceof java.lang.CharSequence) {
            this.f18375N.U((java.lang.CharSequence) tag);
        }
    }

    @Override // G1.c, G1.a
    public android.view.View r(android.content.Context context, android.database.Cursor cursor, android.view.ViewGroup viewGroup) {
        android.view.View viewR = super.r(context, cursor, viewGroup);
        viewR.setTag(new androidx.appcompat.widget.X.a(viewR));
        ((android.widget.ImageView) viewR.findViewById(p090j.f.f48749q)).setImageResource(this.f18379R);
        return viewR;
    }
}
