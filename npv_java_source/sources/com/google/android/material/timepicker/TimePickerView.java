package com.google.android.material.timepicker;

/* JADX INFO: loaded from: classes3.dex */
class TimePickerView extends androidx.constraintlayout.widget.ConstraintLayout {

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private final com.google.android.material.chip.Chip f43887c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private final com.google.android.material.chip.Chip f43888d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private final com.google.android.material.timepicker.ClockHandView f43889e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private final com.google.android.material.timepicker.ClockFaceView f43890f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private final com.google.android.material.button.MaterialButtonToggleGroup f43891g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private final android.view.View.OnClickListener f43892h0;

    class a implements android.view.View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View view) {
            com.google.android.material.timepicker.TimePickerView.u(com.google.android.material.timepicker.TimePickerView.this);
        }
    }

    class b extends android.view.GestureDetector.SimpleOnGestureListener {
        b() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTap(android.view.MotionEvent motionEvent) {
            com.google.android.material.timepicker.TimePickerView.v(com.google.android.material.timepicker.TimePickerView.this);
            return false;
        }
    }

    class c implements android.view.View.OnTouchListener {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        final /* synthetic */ android.view.GestureDetector f43895C;

        c(android.view.GestureDetector gestureDetector) {
            this.f43895C = gestureDetector;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.View.OnTouchListener
        public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
            if (((android.widget.Checkable) view).isChecked()) {
                return this.f43895C.onTouchEvent(motionEvent);
            }
            return false;
        }
    }

    interface d {
    }

    interface e {
    }

    public TimePickerView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TimePickerView(android.content.Context context, android.util.AttributeSet attributeSet, int i6) {
        super(context, attributeSet, i6);
        this.f43892h0 = new com.google.android.material.timepicker.TimePickerView.a();
        android.view.LayoutInflater.from(context).inflate(p125m4.g.f50661i, this);
        this.f43890f0 = (com.google.android.material.timepicker.ClockFaceView) findViewById(p125m4.e.f50633i);
        com.google.android.material.button.MaterialButtonToggleGroup materialButtonToggleGroup = (com.google.android.material.button.MaterialButtonToggleGroup) findViewById(p125m4.e.f50636l);
        this.f43891g0 = materialButtonToggleGroup;
        materialButtonToggleGroup.b(new com.google.android.material.button.MaterialButtonToggleGroup.d() { // from class: com.google.android.material.timepicker.g
            @Override // com.google.android.material.button.MaterialButtonToggleGroup.d
            public final void a(com.google.android.material.button.MaterialButtonToggleGroup materialButtonToggleGroup2, int i10, boolean z6) {
                this.f43910a.w(materialButtonToggleGroup2, i10, z6);
            }
        });
        this.f43887c0 = (com.google.android.material.chip.Chip) findViewById(p125m4.e.f50639o);
        this.f43888d0 = (com.google.android.material.chip.Chip) findViewById(p125m4.e.f50637m);
        this.f43889e0 = (com.google.android.material.timepicker.ClockHandView) findViewById(p125m4.e.f50634j);
        y();
        x();
    }

    static /* synthetic */ com.google.android.material.timepicker.TimePickerView.e u(com.google.android.material.timepicker.TimePickerView timePickerView) {
        timePickerView.getClass();
        return null;
    }

    static /* synthetic */ com.google.android.material.timepicker.TimePickerView.d v(com.google.android.material.timepicker.TimePickerView timePickerView) {
        timePickerView.getClass();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void w(com.google.android.material.button.MaterialButtonToggleGroup materialButtonToggleGroup, int i6, boolean z6) {
    }

    private void x() {
        this.f43887c0.setTag(p125m4.e.f50613E, 12);
        this.f43888d0.setTag(p125m4.e.f50613E, 10);
        this.f43887c0.setOnClickListener(this.f43892h0);
        this.f43888d0.setOnClickListener(this.f43892h0);
        this.f43887c0.setAccessibilityClassName("android.view.View");
        this.f43888d0.setAccessibilityClassName("android.view.View");
    }

    private void y() {
        com.google.android.material.timepicker.TimePickerView.c cVar = new com.google.android.material.timepicker.TimePickerView.c(new android.view.GestureDetector(getContext(), new com.google.android.material.timepicker.TimePickerView.b()));
        this.f43887c0.setOnTouchListener(cVar);
        this.f43888d0.setOnTouchListener(cVar);
    }

    @Override // android.view.View
    protected void onVisibilityChanged(android.view.View view, int i6) {
        super.onVisibilityChanged(view, i6);
        if (view == this && i6 == 0) {
            this.f43888d0.sendAccessibilityEvent(8);
        }
    }
}
