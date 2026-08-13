.class final Landroidx/compose/ui/window/h;
.super Landroidx/compose/ui/platform/a;
.source "SourceFile"

# interfaces
.implements Landroidx/compose/ui/window/j;


# instance fields
.field private final K:Landroid/view/Window;

.field private final L:LV/w0;

.field private M:Z

.field private N:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/view/Window;)V
    .locals 6

    const/4 v4, 0x6

    const/4 v5, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, p0

    move-object v1, p1

    invoke-direct/range {v0 .. v5}, Landroidx/compose/ui/platform/a;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILy7/k;)V

    iput-object p2, p0, Landroidx/compose/ui/window/h;->K:Landroid/view/Window;

    sget-object p1, Landroidx/compose/ui/window/f;->a:Landroidx/compose/ui/window/f;

    invoke-virtual {p1}, Landroidx/compose/ui/window/f;->a()Lx7/p;

    move-result-object p1

    const/4 p2, 0x0

    const/4 v0, 0x2

    invoke-static {p1, p2, v0, p2}, LV/v1;->i(Ljava/lang/Object;LV/u1;ILjava/lang/Object;)LV/w0;

    move-result-object p1

    iput-object p1, p0, Landroidx/compose/ui/window/h;->L:LV/w0;

    return-void
.end method

.method private final getContent()Lx7/p;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/window/h;->L:LV/w0;

    invoke-interface {v0}, LV/G1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lx7/p;

    return-object v0
.end method

.method private final getDisplayHeight()I
    .locals 2

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->density:F

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v1

    iget v1, v1, Landroid/content/res/Configuration;->screenHeightDp:I

    int-to-float v1, v1

    mul-float/2addr v1, v0

    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    move-result v0

    return v0
.end method

.method private final getDisplayWidth()I
    .locals 2

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->density:F

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v1

    iget v1, v1, Landroid/content/res/Configuration;->screenWidthDp:I

    int-to-float v1, v1

    mul-float/2addr v1, v0

    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    move-result v0

    return v0
.end method

.method private final setContent(Lx7/p;)V
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/window/h;->L:LV/w0;

    invoke-interface {v0, p1}, LV/w0;->setValue(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public a()Landroid/view/Window;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/window/h;->K:Landroid/view/Window;

    return-object v0
.end method

.method public b(LV/n;I)V
    .locals 4

    .prologue
    const v0, 0x6770d814

    invoke-interface {p1, v0}, LV/n;->r(I)LV/n;

    move-result-object p1

    and-int/lit8 v1, p2, 0x6

    const/4 v2, 0x2

    if-nez v1, :cond_1

    invoke-interface {p1, p0}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x4

    goto :goto_0

    :cond_0
    move v1, v2

    :goto_0
    or-int/2addr v1, p2

    goto :goto_1

    :cond_1
    move v1, p2

    :goto_1
    and-int/lit8 v3, v1, 0x3

    if-ne v3, v2, :cond_3

    invoke-interface {p1}, LV/n;->u()Z

    move-result v2

    if-nez v2, :cond_2

    goto :goto_2

    :cond_2
    invoke-interface {p1}, LV/n;->A()V

    goto :goto_3

    :cond_3
    :goto_2
    invoke-static {}, LV/q;->H()Z

    move-result v2

    if-eqz v2, :cond_4

    const/4 v2, -0x1

    const-string v3, "androidx.compose.ui.window.DialogLayout.Content (AndroidDialog.android.kt:280)"

    invoke-static {v0, v1, v2, v3}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_4
    invoke-direct {p0}, Landroidx/compose/ui/window/h;->getContent()Lx7/p;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, p1, v1}, Lx7/p;->u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, LV/q;->H()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-static {}, LV/q;->P()V

    :cond_5
    :goto_3
    invoke-interface {p1}, LV/n;->x()LV/e1;

    move-result-object p1

    if-eqz p1, :cond_6

    new-instance v0, Landroidx/compose/ui/window/h$a;

    invoke-direct {v0, p0, p2}, Landroidx/compose/ui/window/h$a;-><init>(Landroidx/compose/ui/window/h;I)V

    invoke-interface {p1, v0}, LV/e1;->a(Lx7/p;)V

    :cond_6
    return-void
.end method

.method protected getShouldCreateCompositionOnAttachedToWindow()Z
    .locals 1

    iget-boolean v0, p0, Landroidx/compose/ui/window/h;->N:Z

    return v0
.end method

.method public h(ZIIII)V
    .locals 0

    .prologue
    invoke-super/range {p0 .. p5}, Landroidx/compose/ui/platform/a;->h(ZIIII)V

    iget-boolean p1, p0, Landroidx/compose/ui/window/h;->M:Z

    if-nez p1, :cond_1

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object p1

    if-nez p1, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0}, Landroidx/compose/ui/window/h;->a()Landroid/view/Window;

    move-result-object p2

    invoke-virtual {p1}, Landroid/view/View;->getMeasuredWidth()I

    move-result p3

    invoke-virtual {p1}, Landroid/view/View;->getMeasuredHeight()I

    move-result p1

    invoke-virtual {p2, p3, p1}, Landroid/view/Window;->setLayout(II)V

    :cond_1
    return-void
.end method

.method public i(II)V
    .locals 1

    .prologue
    iget-boolean v0, p0, Landroidx/compose/ui/window/h;->M:Z

    if-eqz v0, :cond_0

    :goto_0
    invoke-super {p0, p1, p2}, Landroidx/compose/ui/platform/a;->i(II)V

    goto :goto_1

    :cond_0
    invoke-direct {p0}, Landroidx/compose/ui/window/h;->getDisplayWidth()I

    move-result p1

    const/high16 p2, -0x80000000

    invoke-static {p1, p2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p1

    invoke-direct {p0}, Landroidx/compose/ui/window/h;->getDisplayHeight()I

    move-result v0

    invoke-static {v0, p2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p2

    goto :goto_0

    :goto_1
    return-void
.end method

.method public final l()Z
    .locals 1

    iget-boolean v0, p0, Landroidx/compose/ui/window/h;->M:Z

    return v0
.end method

.method public final m(LV/s;Lx7/p;)V
    .locals 0

    invoke-virtual {p0, p1}, Landroidx/compose/ui/platform/a;->setParentCompositionContext(LV/s;)V

    invoke-direct {p0, p2}, Landroidx/compose/ui/window/h;->setContent(Lx7/p;)V

    const/4 p1, 0x1

    iput-boolean p1, p0, Landroidx/compose/ui/window/h;->N:Z

    invoke-virtual {p0}, Landroidx/compose/ui/platform/a;->e()V

    return-void
.end method

.method public final n(Z)V
    .locals 0

    iput-boolean p1, p0, Landroidx/compose/ui/window/h;->M:Z

    return-void
.end method
