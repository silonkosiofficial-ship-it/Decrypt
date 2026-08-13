package com.google.android.material.datepicker;

/* JADX INFO: loaded from: classes3.dex */
class i extends android.widget.BaseAdapter {

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private static final int f43216F;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final java.util.Calendar f43217C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final int f43218D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final int f43219E;

    static {
        f43216F = android.os.Build.VERSION.SDK_INT >= 26 ? 4 : 1;
    }

    public i() {
        java.util.Calendar calendarK = com.google.android.material.datepicker.z.k();
        this.f43217C = calendarK;
        this.f43218D = calendarK.getMaximum(7);
        this.f43219E = calendarK.getFirstDayOfWeek();
    }

    public i(int i6) {
        java.util.Calendar calendarK = com.google.android.material.datepicker.z.k();
        this.f43217C = calendarK;
        this.f43218D = calendarK.getMaximum(7);
        this.f43219E = i6;
    }

    private int b(int i6) {
        int i10 = i6 + this.f43219E;
        int i11 = this.f43218D;
        return i10 > i11 ? i10 - i11 : i10;
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public java.lang.Integer getItem(int i6) {
        if (i6 >= this.f43218D) {
            return null;
        }
        return java.lang.Integer.valueOf(b(i6));
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f43218D;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i6) {
        return 0L;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i6, android.view.View view, android.view.ViewGroup viewGroup) {
        android.widget.TextView textView = (android.widget.TextView) view;
        if (view == null) {
            textView = (android.widget.TextView) android.view.LayoutInflater.from(viewGroup.getContext()).inflate(p125m4.g.f50664l, viewGroup, false);
        }
        this.f43217C.set(7, b(i6));
        textView.setText(this.f43217C.getDisplayName(7, f43216F, textView.getResources().getConfiguration().locale));
        textView.setContentDescription(java.lang.String.format(viewGroup.getContext().getString(p125m4.h.f50682l), this.f43217C.getDisplayName(7, 2, java.util.Locale.getDefault())));
        return textView;
    }
}
