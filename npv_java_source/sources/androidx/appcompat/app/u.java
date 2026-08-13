package androidx.appcompat.app;

/* JADX INFO: loaded from: classes.dex */
public class u {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final java.lang.Class[] f17632b = {android.content.Context.class, android.util.AttributeSet.class};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int[] f17633c = {android.R.attr.onClick};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int[] f17634d = {android.R.attr.accessibilityHeading};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int[] f17635e = {android.R.attr.accessibilityPaneTitle};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int[] f17636f = {android.R.attr.screenReaderFocusable};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final java.lang.String[] f17637g = {"android.widget.", "android.view.", "android.webkit."};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final p170r.Y f17638h = new p170r.Y();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.Object[] f17639a = new java.lang.Object[2];

    private static class a implements android.view.View.OnClickListener {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        private final android.view.View f17640C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        private final java.lang.String f17641D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        private java.lang.reflect.Method f17642E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        private android.content.Context f17643F;

        public a(android.view.View view, java.lang.String str) {
            this.f17640C = view;
            this.f17641D = str;
        }

        private void a(android.content.Context context) {
            java.lang.String str;
            java.lang.reflect.Method method;
            while (context != null) {
                try {
                    if (!context.isRestricted() && (method = context.getClass().getMethod(this.f17641D, android.view.View.class)) != null) {
                        this.f17642E = method;
                        this.f17643F = context;
                        return;
                    }
                } catch (java.lang.NoSuchMethodException unused) {
                }
                context = context instanceof android.content.ContextWrapper ? ((android.content.ContextWrapper) context).getBaseContext() : null;
            }
            int id = this.f17640C.getId();
            if (id == -1) {
                str = "";
            } else {
                str = " with id '" + this.f17640C.getContext().getResources().getResourceEntryName(id) + "'";
            }
            throw new java.lang.IllegalStateException("Could not find method " + this.f17641D + "(View) in a parent or ancestor Context for android:onClick attribute defined on view " + this.f17640C.getClass() + str);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View view) {
            if (this.f17642E == null) {
                a(this.f17640C.getContext());
            }
            try {
                this.f17642E.invoke(this.f17643F, view);
            } catch (java.lang.IllegalAccessException e6) {
                throw new java.lang.IllegalStateException("Could not execute non-public method for android:onClick", e6);
            } catch (java.lang.reflect.InvocationTargetException e10) {
                throw new java.lang.IllegalStateException("Could not execute method for android:onClick", e10);
            }
        }
    }

    private void a(android.content.Context context, android.view.View view, android.util.AttributeSet attributeSet) {
        if (android.os.Build.VERSION.SDK_INT > 28) {
            return;
        }
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f17634d);
        if (typedArrayObtainStyledAttributes.hasValue(0)) {
            androidx.core.view.X.o0(view, typedArrayObtainStyledAttributes.getBoolean(0, false));
        }
        typedArrayObtainStyledAttributes.recycle();
        android.content.res.TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, f17635e);
        if (typedArrayObtainStyledAttributes2.hasValue(0)) {
            androidx.core.view.X.q0(view, typedArrayObtainStyledAttributes2.getString(0));
        }
        typedArrayObtainStyledAttributes2.recycle();
        android.content.res.TypedArray typedArrayObtainStyledAttributes3 = context.obtainStyledAttributes(attributeSet, f17636f);
        if (typedArrayObtainStyledAttributes3.hasValue(0)) {
            androidx.core.view.X.C0(view, typedArrayObtainStyledAttributes3.getBoolean(0, false));
        }
        typedArrayObtainStyledAttributes3.recycle();
    }

    private void b(android.view.View view, android.util.AttributeSet attributeSet) {
        android.content.Context context = view.getContext();
        if ((context instanceof android.content.ContextWrapper) && androidx.core.view.X.N(view)) {
            android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f17633c);
            java.lang.String string = typedArrayObtainStyledAttributes.getString(0);
            if (string != null) {
                view.setOnClickListener(new androidx.appcompat.app.u.a(view, string));
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    private android.view.View s(android.content.Context context, java.lang.String str, java.lang.String str2) {
        java.lang.String str3;
        p170r.Y y6 = f17638h;
        java.lang.reflect.Constructor constructor = (java.lang.reflect.Constructor) y6.get(str);
        if (constructor == null) {
            if (str2 != null) {
                try {
                    str3 = str2 + str;
                } catch (java.lang.Exception unused) {
                    return null;
                }
            } else {
                str3 = str;
            }
            constructor = java.lang.Class.forName(str3, false, context.getClassLoader()).asSubclass(android.view.View.class).getConstructor(f17632b);
            y6.put(str, constructor);
        }
        constructor.setAccessible(true);
        return (android.view.View) constructor.newInstance(this.f17639a);
    }

    private android.view.View t(android.content.Context context, java.lang.String str, android.util.AttributeSet attributeSet) {
        if (str.equals("view")) {
            str = attributeSet.getAttributeValue(null, "class");
        }
        try {
            java.lang.Object[] objArr = this.f17639a;
            objArr[0] = context;
            objArr[1] = attributeSet;
            if (-1 != str.indexOf(46)) {
                return s(context, str, null);
            }
            int i6 = 0;
            while (true) {
                java.lang.String[] strArr = f17637g;
                if (i6 >= strArr.length) {
                    return null;
                }
                android.view.View viewS = s(context, str, strArr[i6]);
                if (viewS != null) {
                    return viewS;
                }
                i6++;
            }
        } catch (java.lang.Exception unused) {
            return null;
        } finally {
            java.lang.Object[] objArr2 = this.f17639a;
            objArr2[0] = null;
            objArr2[1] = null;
        }
    }

    private static android.content.Context u(android.content.Context context, android.util.AttributeSet attributeSet, boolean z6, boolean z10) {
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p090j.j.f48995s3, 0, 0);
        int resourceId = z6 ? typedArrayObtainStyledAttributes.getResourceId(p090j.j.f49000t3, 0) : 0;
        if (!z10 || resourceId != 0 || (resourceId = typedArrayObtainStyledAttributes.getResourceId(p090j.j.f49005u3, 0)) != 0) {
        }
        typedArrayObtainStyledAttributes.recycle();
        if (resourceId != 0) {
            return ((context instanceof androidx.appcompat.view.d) && ((androidx.appcompat.view.d) context).b() == resourceId) ? context : new androidx.appcompat.view.d(context, resourceId);
        }
        return context;
    }

    private void v(android.view.View view, java.lang.String str) {
        if (view != null) {
            return;
        }
        throw new java.lang.IllegalStateException(getClass().getName() + " asked to inflate view for <" + str + ">, but returned null");
    }

    protected androidx.appcompat.widget.C1898d c(android.content.Context context, android.util.AttributeSet attributeSet) {
        return new androidx.appcompat.widget.C1898d(context, attributeSet);
    }

    protected androidx.appcompat.widget.C1900f d(android.content.Context context, android.util.AttributeSet attributeSet) {
        return new androidx.appcompat.widget.C1900f(context, attributeSet);
    }

    protected androidx.appcompat.widget.C1901g e(android.content.Context context, android.util.AttributeSet attributeSet) {
        return new androidx.appcompat.widget.C1901g(context, attributeSet);
    }

    protected androidx.appcompat.widget.C1902h f(android.content.Context context, android.util.AttributeSet attributeSet) {
        return new androidx.appcompat.widget.C1902h(context, attributeSet);
    }

    protected androidx.appcompat.widget.C1906l g(android.content.Context context, android.util.AttributeSet attributeSet) {
        return new androidx.appcompat.widget.C1906l(context, attributeSet);
    }

    protected androidx.appcompat.widget.C1910p h(android.content.Context context, android.util.AttributeSet attributeSet) {
        return new androidx.appcompat.widget.C1910p(context, attributeSet);
    }

    protected androidx.appcompat.widget.r i(android.content.Context context, android.util.AttributeSet attributeSet) {
        return new androidx.appcompat.widget.r(context, attributeSet);
    }

    protected androidx.appcompat.widget.C1912s j(android.content.Context context, android.util.AttributeSet attributeSet) {
        return new androidx.appcompat.widget.C1912s(context, attributeSet);
    }

    protected androidx.appcompat.widget.C1915v k(android.content.Context context, android.util.AttributeSet attributeSet) {
        return new androidx.appcompat.widget.C1915v(context, attributeSet);
    }

    protected androidx.appcompat.widget.C1916w l(android.content.Context context, android.util.AttributeSet attributeSet) {
        return new androidx.appcompat.widget.C1916w(context, attributeSet);
    }

    protected androidx.appcompat.widget.C1918y m(android.content.Context context, android.util.AttributeSet attributeSet) {
        return new androidx.appcompat.widget.C1918y(context, attributeSet);
    }

    protected androidx.appcompat.widget.A n(android.content.Context context, android.util.AttributeSet attributeSet) {
        return new androidx.appcompat.widget.A(context, attributeSet);
    }

    protected androidx.appcompat.widget.D o(android.content.Context context, android.util.AttributeSet attributeSet) {
        return new androidx.appcompat.widget.D(context, attributeSet);
    }

    protected androidx.appcompat.widget.H p(android.content.Context context, android.util.AttributeSet attributeSet) {
        return new androidx.appcompat.widget.H(context, attributeSet);
    }

    protected android.view.View q(android.content.Context context, java.lang.String str, android.util.AttributeSet attributeSet) {
        return null;
    }

    public final android.view.View r(android.view.View view, java.lang.String str, android.content.Context context, android.util.AttributeSet attributeSet, boolean z6, boolean z10, boolean z11, boolean z12) {
        android.view.View viewL;
        android.content.Context context2 = (!z6 || view == null) ? context : view.getContext();
        if (z10 || z11) {
            context2 = u(context2, attributeSet, z10, z11);
        }
        if (z12) {
            context2 = androidx.appcompat.widget.Z.b(context2);
        }
        str.hashCode();
        switch (str) {
            case "RatingBar":
                viewL = l(context2, attributeSet);
                v(viewL, str);
                break;
            case "CheckedTextView":
                viewL = f(context2, attributeSet);
                v(viewL, str);
                break;
            case "MultiAutoCompleteTextView":
                viewL = j(context2, attributeSet);
                v(viewL, str);
                break;
            case "TextView":
                viewL = o(context2, attributeSet);
                v(viewL, str);
                break;
            case "ImageButton":
                viewL = h(context2, attributeSet);
                v(viewL, str);
                break;
            case "SeekBar":
                viewL = m(context2, attributeSet);
                v(viewL, str);
                break;
            case "Spinner":
                viewL = n(context2, attributeSet);
                v(viewL, str);
                break;
            case "RadioButton":
                viewL = k(context2, attributeSet);
                v(viewL, str);
                break;
            case "ToggleButton":
                viewL = p(context2, attributeSet);
                v(viewL, str);
                break;
            case "ImageView":
                viewL = i(context2, attributeSet);
                v(viewL, str);
                break;
            case "AutoCompleteTextView":
                viewL = c(context2, attributeSet);
                v(viewL, str);
                break;
            case "CheckBox":
                viewL = e(context2, attributeSet);
                v(viewL, str);
                break;
            case "EditText":
                viewL = g(context2, attributeSet);
                v(viewL, str);
                break;
            case "Button":
                viewL = d(context2, attributeSet);
                v(viewL, str);
                break;
            default:
                viewL = q(context2, str, attributeSet);
                break;
        }
        if (viewL == null && context != context2) {
            viewL = t(context2, str, attributeSet);
        }
        if (viewL != null) {
            b(viewL, attributeSet);
            a(context2, viewL, attributeSet);
        }
        return viewL;
    }
}
