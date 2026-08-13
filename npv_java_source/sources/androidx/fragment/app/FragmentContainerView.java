package androidx.fragment.app;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:68)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:31)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
    Caused by: java.lang.NullPointerException: parseDelimitedFrom(...) must not be null
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readNameResolver(JvmProtoBufUtil.kt:57)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readClassDataFrom(JvmProtoBufUtil.kt:37)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readClassDataFrom(JvmProtoBufUtil.kt:32)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmClass$kotlin_metadata_jvm(JvmReadUtils.kt:27)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Class.<init>(KotlinClassMetadata.kt:95)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:50)
    	... 4 more
    */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0003"}, d2 = {"\u0004", "\u0005", "\u0006", "\u0007", "\b", "\t", "", "\n", "\u000b", "\f", "\r", "\u000e", "\u000f", "\u0010", "\u0011", "\u0012", "\u0013", "\u0014", "\u0015", "\u0016", "\u0017", "\u0018", "\u0019", "\u001a", "\u001b", "\u001c", "\u001d", "\u001e", "\u001f", " ", "!", "\"", "#", "$", "%", "&", "", "'", "", "(", ")", "*", "+", ",", "-", ".", "/", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", ":", ";", "<", "=", ">", "?", "@", "A", "B", "C", "", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M"}, k = 1, mv = {1, 6, 0})
public final class FragmentContainerView extends android.widget.FrameLayout {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final java.util.List f22375C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final java.util.List f22376D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private android.view.View.OnApplyWindowInsetsListener f22377E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private boolean f22378F;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final androidx.fragment.app.FragmentContainerView.a f22379a = new androidx.fragment.app.FragmentContainerView.a();

        private a() {
        }

        public final android.view.WindowInsets a(android.view.View.OnApplyWindowInsetsListener onApplyWindowInsetsListener, android.view.View view, android.view.WindowInsets windowInsets) {
            p247y7.AbstractC7350t.f(onApplyWindowInsetsListener, "onApplyWindowInsetsListener");
            p247y7.AbstractC7350t.f(view, "v");
            p247y7.AbstractC7350t.f(windowInsets, "insets");
            android.view.WindowInsets windowInsetsOnApplyWindowInsets = onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
            p247y7.AbstractC7350t.e(windowInsetsOnApplyWindowInsets, "onApplyWindowInsetsListe…lyWindowInsets(v, insets)");
            return windowInsetsOnApplyWindowInsets;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        p247y7.AbstractC7350t.f(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(android.content.Context context, android.util.AttributeSet attributeSet, int i6) {
        java.lang.String str;
        super(context, attributeSet, i6);
        p247y7.AbstractC7350t.f(context, "context");
        this.f22375C = new java.util.ArrayList();
        this.f22376D = new java.util.ArrayList();
        this.f22378F = true;
        if (attributeSet != null) {
            java.lang.String classAttribute = attributeSet.getClassAttribute();
            int[] iArr = U1.c.f14464e;
            p247y7.AbstractC7350t.e(iArr, "FragmentContainerView");
            android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
            if (classAttribute == null) {
                classAttribute = typedArrayObtainStyledAttributes.getString(U1.c.f14465f);
                str = "android:name";
            } else {
                str = "class";
            }
            typedArrayObtainStyledAttributes.recycle();
            if (classAttribute == null || isInEditMode()) {
                return;
            }
            throw new java.lang.UnsupportedOperationException("FragmentContainerView must be within a FragmentActivity to use " + str + "=\"" + classAttribute + '\"');
        }
    }

    public /* synthetic */ FragmentContainerView(android.content.Context context, android.util.AttributeSet attributeSet, int i6, int i10, p247y7.AbstractC7342k abstractC7342k) {
        this(context, attributeSet, (i10 & 4) != 0 ? 0 : i6);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(android.content.Context context, android.util.AttributeSet attributeSet, androidx.fragment.app.n nVar) {
        java.lang.String str;
        super(context, attributeSet);
        p247y7.AbstractC7350t.f(context, "context");
        p247y7.AbstractC7350t.f(attributeSet, "attrs");
        p247y7.AbstractC7350t.f(nVar, "fm");
        this.f22375C = new java.util.ArrayList();
        this.f22376D = new java.util.ArrayList();
        this.f22378F = true;
        java.lang.String classAttribute = attributeSet.getClassAttribute();
        int[] iArr = U1.c.f14464e;
        p247y7.AbstractC7350t.e(iArr, "FragmentContainerView");
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        classAttribute = classAttribute == null ? typedArrayObtainStyledAttributes.getString(U1.c.f14465f) : classAttribute;
        java.lang.String string = typedArrayObtainStyledAttributes.getString(U1.c.f14466g);
        typedArrayObtainStyledAttributes.recycle();
        int id = getId();
        androidx.fragment.app.f fVarE0 = nVar.e0(id);
        if (classAttribute != null && fVarE0 == null) {
            if (id == -1) {
                if (string != null) {
                    str = " with tag " + string;
                } else {
                    str = "";
                }
                throw new java.lang.IllegalStateException("FragmentContainerView must have an android:id to add Fragment " + classAttribute + str);
            }
            androidx.fragment.app.f fVarA = nVar.p0().a(context.getClassLoader(), classAttribute);
            p247y7.AbstractC7350t.e(fVarA, "fm.fragmentFactory.insta…ontext.classLoader, name)");
            fVarA.A0(context, attributeSet, null);
            nVar.m().o(true).c(this, fVarA, string).i();
        }
        nVar.U0(this);
    }

    private final void a(android.view.View view) {
        if (this.f22376D.contains(view)) {
            this.f22375C.add(view);
        }
    }

    @Override // android.view.ViewGroup
    public void addView(android.view.View view, int i6, android.view.ViewGroup.LayoutParams layoutParams) {
        p247y7.AbstractC7350t.f(view, "child");
        if (androidx.fragment.app.n.y0(view) != null) {
            super.addView(view, i6, layoutParams);
            return;
        }
        throw new java.lang.IllegalStateException(("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.").toString());
    }

    @Override // android.view.ViewGroup, android.view.View
    public android.view.WindowInsets dispatchApplyWindowInsets(android.view.WindowInsets windowInsets) {
        androidx.core.view.C2038y0 c2038y0Z;
        p247y7.AbstractC7350t.f(windowInsets, "insets");
        androidx.core.view.C2038y0 c2038y0W = androidx.core.view.C2038y0.w(windowInsets);
        p247y7.AbstractC7350t.e(c2038y0W, "toWindowInsetsCompat(insets)");
        android.view.View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.f22377E;
        if (onApplyWindowInsetsListener != null) {
            androidx.fragment.app.FragmentContainerView.a aVar = androidx.fragment.app.FragmentContainerView.a.f22379a;
            p247y7.AbstractC7350t.c(onApplyWindowInsetsListener);
            c2038y0Z = androidx.core.view.C2038y0.w(aVar.a(onApplyWindowInsetsListener, this, windowInsets));
        } else {
            c2038y0Z = androidx.core.view.X.Z(this, c2038y0W);
        }
        p247y7.AbstractC7350t.e(c2038y0Z, "if (applyWindowInsetsLis…, insetsCompat)\n        }");
        if (!c2038y0Z.o()) {
            int childCount = getChildCount();
            for (int i6 = 0; i6 < childCount; i6++) {
                androidx.core.view.X.g(getChildAt(i6), c2038y0Z);
            }
        }
        return windowInsets;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(android.graphics.Canvas canvas) {
        p247y7.AbstractC7350t.f(canvas, "canvas");
        if (this.f22378F) {
            java.util.Iterator it = this.f22375C.iterator();
            while (it.hasNext()) {
                super.drawChild(canvas, (android.view.View) it.next(), getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    protected boolean drawChild(android.graphics.Canvas canvas, android.view.View view, long j6) {
        p247y7.AbstractC7350t.f(canvas, "canvas");
        p247y7.AbstractC7350t.f(view, "child");
        if (this.f22378F && (!this.f22375C.isEmpty()) && this.f22375C.contains(view)) {
            return false;
        }
        return super.drawChild(canvas, view, j6);
    }

    @Override // android.view.ViewGroup
    public void endViewTransition(android.view.View view) {
        p247y7.AbstractC7350t.f(view, "view");
        this.f22376D.remove(view);
        if (this.f22375C.remove(view)) {
            this.f22378F = true;
        }
        super.endViewTransition(view);
    }

    public final <F extends androidx.fragment.app.f> F getFragment() {
        return (F) androidx.fragment.app.n.h0(this).e0(getId());
    }

    @Override // android.view.View
    public android.view.WindowInsets onApplyWindowInsets(android.view.WindowInsets windowInsets) {
        p247y7.AbstractC7350t.f(windowInsets, "insets");
        return windowInsets;
    }

    @Override // android.view.ViewGroup
    public void removeAllViewsInLayout() {
        int childCount = getChildCount();
        while (true) {
            childCount--;
            if (-1 >= childCount) {
                super.removeAllViewsInLayout();
                return;
            } else {
                android.view.View childAt = getChildAt(childCount);
                p247y7.AbstractC7350t.e(childAt, "view");
                a(childAt);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(android.view.View view) {
        p247y7.AbstractC7350t.f(view, "view");
        a(view);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public void removeViewAt(int i6) {
        android.view.View childAt = getChildAt(i6);
        p247y7.AbstractC7350t.e(childAt, "view");
        a(childAt);
        super.removeViewAt(i6);
    }

    @Override // android.view.ViewGroup
    public void removeViewInLayout(android.view.View view) {
        p247y7.AbstractC7350t.f(view, "view");
        a(view);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public void removeViews(int i6, int i10) {
        int i11 = i6 + i10;
        for (int i12 = i6; i12 < i11; i12++) {
            android.view.View childAt = getChildAt(i12);
            p247y7.AbstractC7350t.e(childAt, "view");
            a(childAt);
        }
        super.removeViews(i6, i10);
    }

    @Override // android.view.ViewGroup
    public void removeViewsInLayout(int i6, int i10) {
        int i11 = i6 + i10;
        for (int i12 = i6; i12 < i11; i12++) {
            android.view.View childAt = getChildAt(i12);
            p247y7.AbstractC7350t.e(childAt, "view");
            a(childAt);
        }
        super.removeViewsInLayout(i6, i10);
    }

    public final void setDrawDisappearingViewsLast(boolean z6) {
        this.f22378F = z6;
    }

    @Override // android.view.ViewGroup
    public void setLayoutTransition(android.animation.LayoutTransition layoutTransition) {
        throw new java.lang.UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    @Override // android.view.View
    public void setOnApplyWindowInsetsListener(android.view.View.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        p247y7.AbstractC7350t.f(onApplyWindowInsetsListener, "listener");
        this.f22377E = onApplyWindowInsetsListener;
    }

    @Override // android.view.ViewGroup
    public void startViewTransition(android.view.View view) {
        p247y7.AbstractC7350t.f(view, "view");
        if (view.getParent() == this) {
            this.f22376D.add(view);
        }
        super.startViewTransition(view);
    }
}
