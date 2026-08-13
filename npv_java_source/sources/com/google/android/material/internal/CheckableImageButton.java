package com.google.android.material.internal;

/* JADX INFO: loaded from: classes3.dex */
public class CheckableImageButton extends androidx.appcompat.widget.C1910p implements android.widget.Checkable {

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private static final int[] f43334I = {android.R.attr.state_checked};

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private boolean f43335F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private boolean f43336G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private boolean f43337H;

    class a extends androidx.core.view.C1990a {
        a() {
        }

        @Override // androidx.core.view.C1990a
        public void f(android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
            super.f(view, accessibilityEvent);
            accessibilityEvent.setChecked(com.google.android.material.internal.CheckableImageButton.this.isChecked());
        }

        @Override // androidx.core.view.C1990a
        public void g(android.view.View view, C1.B b6) {
            super.g(view, b6);
            b6.k0(com.google.android.material.internal.CheckableImageButton.this.a());
            b6.l0(com.google.android.material.internal.CheckableImageButton.this.isChecked());
        }
    }

    static class b extends I1.a {
        public static final android.os.Parcelable.Creator<com.google.android.material.internal.CheckableImageButton.b> CREATOR = new com.google.android.material.internal.CheckableImageButton.b.a();

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        boolean f43339E;

        class a implements android.os.Parcelable.ClassLoaderCreator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public com.google.android.material.internal.CheckableImageButton.b createFromParcel(android.os.Parcel parcel) {
                return new com.google.android.material.internal.CheckableImageButton.b(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public com.google.android.material.internal.CheckableImageButton.b createFromParcel(android.os.Parcel parcel, java.lang.ClassLoader classLoader) {
                return new com.google.android.material.internal.CheckableImageButton.b(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public com.google.android.material.internal.CheckableImageButton.b[] newArray(int i6) {
                return new com.google.android.material.internal.CheckableImageButton.b[i6];
            }
        }

        public b(android.os.Parcel parcel, java.lang.ClassLoader classLoader) {
            super(parcel, classLoader);
            b(parcel);
        }

        public b(android.os.Parcelable parcelable) {
            super(parcelable);
        }

        private void b(android.os.Parcel parcel) {
            this.f43339E = parcel.readInt() == 1;
        }

        @Override // I1.a, android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i6) {
            super.writeToParcel(parcel, i6);
            parcel.writeInt(this.f43339E ? 1 : 0);
        }
    }

    public CheckableImageButton(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, p090j.a.f48649z);
    }

    public CheckableImageButton(android.content.Context context, android.util.AttributeSet attributeSet, int i6) {
        super(context, attributeSet, i6);
        this.f43336G = true;
        this.f43337H = true;
        androidx.core.view.X.n0(this, new com.google.android.material.internal.CheckableImageButton.a());
    }

    public boolean a() {
        return this.f43336G;
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f43335F;
    }

    @Override // android.widget.ImageView, android.view.View
    public int[] onCreateDrawableState(int i6) {
        if (!this.f43335F) {
            return super.onCreateDrawableState(i6);
        }
        int[] iArr = f43334I;
        return android.view.View.mergeDrawableStates(super.onCreateDrawableState(i6 + iArr.length), iArr);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(android.os.Parcelable parcelable) {
        if (!(parcelable instanceof com.google.android.material.internal.CheckableImageButton.b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        com.google.android.material.internal.CheckableImageButton.b bVar = (com.google.android.material.internal.CheckableImageButton.b) parcelable;
        super.onRestoreInstanceState(bVar.a());
        setChecked(bVar.f43339E);
    }

    @Override // android.view.View
    protected android.os.Parcelable onSaveInstanceState() {
        com.google.android.material.internal.CheckableImageButton.b bVar = new com.google.android.material.internal.CheckableImageButton.b(super.onSaveInstanceState());
        bVar.f43339E = this.f43335F;
        return bVar;
    }

    public void setCheckable(boolean z6) {
        if (this.f43336G != z6) {
            this.f43336G = z6;
            sendAccessibilityEvent(0);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z6) {
        if (!this.f43336G || this.f43335F == z6) {
            return;
        }
        this.f43335F = z6;
        refreshDrawableState();
        sendAccessibilityEvent(2048);
    }

    public void setPressable(boolean z6) {
        this.f43337H = z6;
    }

    @Override // android.view.View
    public void setPressed(boolean z6) {
        if (this.f43337H) {
            super.setPressed(z6);
        }
    }

    @Override // android.widget.Checkable
    public void toggle() {
        setChecked(!this.f43335F);
    }
}
