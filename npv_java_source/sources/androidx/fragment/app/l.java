package androidx.fragment.app;

/* JADX INFO: loaded from: classes.dex */
class l implements android.view.LayoutInflater.Factory2 {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    final androidx.fragment.app.n f22570C;

    class a implements android.view.View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        final /* synthetic */ androidx.fragment.app.s f22571C;

        a(androidx.fragment.app.s sVar) {
            this.f22571C = sVar;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(android.view.View view) {
            androidx.fragment.app.f fVarK = this.f22571C.k();
            this.f22571C.m();
            androidx.fragment.app.A.n((android.view.ViewGroup) fVarK.f22507k0.getParent(), androidx.fragment.app.l.this.f22570C).j();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(android.view.View view) {
        }
    }

    l(androidx.fragment.app.n nVar) {
        this.f22570C = nVar;
    }

    @Override // android.view.LayoutInflater.Factory2
    public android.view.View onCreateView(android.view.View view, java.lang.String str, android.content.Context context, android.util.AttributeSet attributeSet) {
        androidx.fragment.app.s sVarT;
        java.lang.StringBuilder sb;
        java.lang.String str2;
        if (androidx.fragment.app.FragmentContainerView.class.getName().equals(str)) {
            return new androidx.fragment.app.FragmentContainerView(context, attributeSet, this.f22570C);
        }
        if (!"fragment".equals(str)) {
            return null;
        }
        java.lang.String attributeValue = attributeSet.getAttributeValue(null, "class");
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, U1.c.f14460a);
        if (attributeValue == null) {
            attributeValue = typedArrayObtainStyledAttributes.getString(U1.c.f14461b);
        }
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(U1.c.f14462c, -1);
        java.lang.String string = typedArrayObtainStyledAttributes.getString(U1.c.f14463d);
        typedArrayObtainStyledAttributes.recycle();
        if (attributeValue == null || !androidx.fragment.app.j.b(context.getClassLoader(), attributeValue)) {
            return null;
        }
        int id = view != null ? view.getId() : 0;
        if (id == -1 && resourceId == -1 && string == null) {
            throw new java.lang.IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
        }
        androidx.fragment.app.f fVarE0 = resourceId != -1 ? this.f22570C.e0(resourceId) : null;
        if (fVarE0 == null && string != null) {
            fVarE0 = this.f22570C.f0(string);
        }
        if (fVarE0 == null && id != -1) {
            fVarE0 = this.f22570C.e0(id);
        }
        if (fVarE0 == null) {
            fVarE0 = this.f22570C.p0().a(context.getClassLoader(), attributeValue);
            fVarE0.f22487Q = true;
            fVarE0.f22496Z = resourceId != 0 ? resourceId : id;
            fVarE0.f22497a0 = id;
            fVarE0.f22498b0 = string;
            fVarE0.f22488R = true;
            androidx.fragment.app.n nVar = this.f22570C;
            fVarE0.f22492V = nVar;
            fVarE0.f22493W = nVar.r0();
            fVarE0.A0(this.f22570C.r0().o(), attributeSet, fVarE0.f22473D);
            sVarT = this.f22570C.h(fVarE0);
            if (androidx.fragment.app.n.E0(2)) {
                sb = new java.lang.StringBuilder();
                sb.append("Fragment ");
                sb.append(fVarE0);
                str2 = " has been inflated via the <fragment> tag: id=0x";
                sb.append(str2);
                sb.append(java.lang.Integer.toHexString(resourceId));
                sb.toString();
            }
        } else {
            if (fVarE0.f22488R) {
                throw new java.lang.IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + java.lang.Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + java.lang.Integer.toHexString(id) + " with another fragment for " + attributeValue);
            }
            fVarE0.f22488R = true;
            androidx.fragment.app.n nVar2 = this.f22570C;
            fVarE0.f22492V = nVar2;
            fVarE0.f22493W = nVar2.r0();
            fVarE0.A0(this.f22570C.r0().o(), attributeSet, fVarE0.f22473D);
            sVarT = this.f22570C.t(fVarE0);
            if (androidx.fragment.app.n.E0(2)) {
                sb = new java.lang.StringBuilder();
                sb.append("Retained Fragment ");
                sb.append(fVarE0);
                str2 = " has been re-attached via the <fragment> tag: id=0x";
                sb.append(str2);
                sb.append(java.lang.Integer.toHexString(resourceId));
                sb.toString();
            }
        }
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
        W1.c.g(fVarE0, viewGroup);
        fVarE0.f22506j0 = viewGroup;
        sVarT.m();
        sVarT.j();
        android.view.View view2 = fVarE0.f22507k0;
        if (view2 == null) {
            throw new java.lang.IllegalStateException("Fragment " + attributeValue + " did not create a view.");
        }
        if (resourceId != 0) {
            view2.setId(resourceId);
        }
        if (fVarE0.f22507k0.getTag() == null) {
            fVarE0.f22507k0.setTag(string);
        }
        fVarE0.f22507k0.addOnAttachStateChangeListener(new androidx.fragment.app.l.a(sVarT));
        return fVarE0.f22507k0;
    }

    @Override // android.view.LayoutInflater.Factory
    public android.view.View onCreateView(java.lang.String str, android.content.Context context, android.util.AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
