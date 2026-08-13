.class public abstract Lf/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Landroid/view/ViewGroup$LayoutParams;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Landroid/view/ViewGroup$LayoutParams;

    const/4 v1, -0x2

    invoke-direct {v0, v1, v1}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    sput-object v0, Lf/a;->a:Landroid/view/ViewGroup$LayoutParams;

    return-void
.end method

.method public static final a(Le/j;LV/s;Lx7/p;)V
    .locals 7

    .prologue
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    const v1, 0x1020002

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    instance-of v1, v0, Landroidx/compose/ui/platform/o0;

    if-eqz v1, :cond_0

    check-cast v0, Landroidx/compose/ui/platform/o0;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    invoke-virtual {v0, p1}, Landroidx/compose/ui/platform/a;->setParentCompositionContext(LV/s;)V

    invoke-virtual {v0, p2}, Landroidx/compose/ui/platform/o0;->setContent(Lx7/p;)V

    goto :goto_1

    :cond_1
    new-instance v0, Landroidx/compose/ui/platform/o0;

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, v0

    move-object v2, p0

    invoke-direct/range {v1 .. v6}, Landroidx/compose/ui/platform/o0;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILy7/k;)V

    invoke-virtual {v0, p1}, Landroidx/compose/ui/platform/a;->setParentCompositionContext(LV/s;)V

    invoke-virtual {v0, p2}, Landroidx/compose/ui/platform/o0;->setContent(Lx7/p;)V

    invoke-static {p0}, Lf/a;->c(Le/j;)V

    sget-object p1, Lf/a;->a:Landroid/view/ViewGroup$LayoutParams;

    invoke-virtual {p0, v0, p1}, Le/j;->setContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    :goto_1
    return-void
.end method

.method public static synthetic b(Le/j;LV/s;Lx7/p;ILjava/lang/Object;)V
    .locals 0

    .prologue
    and-int/lit8 p3, p3, 0x1

    if-eqz p3, :cond_0

    const/4 p1, 0x0

    :cond_0
    invoke-static {p0, p1, p2}, Lf/a;->a(Le/j;LV/s;Lx7/p;)V

    return-void
.end method

.method private static final c(Le/j;)V
    .locals 2

    .prologue
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    invoke-static {v0}, Landroidx/lifecycle/Z;->a(Landroid/view/View;)Landroidx/lifecycle/r;

    move-result-object v1

    if-nez v1, :cond_0

    invoke-static {v0, p0}, Landroidx/lifecycle/Z;->b(Landroid/view/View;Landroidx/lifecycle/r;)V

    :cond_0
    invoke-static {v0}, Landroidx/lifecycle/a0;->a(Landroid/view/View;)Landroidx/lifecycle/Y;

    move-result-object v1

    if-nez v1, :cond_1

    invoke-static {v0, p0}, Landroidx/lifecycle/a0;->b(Landroid/view/View;Landroidx/lifecycle/Y;)V

    :cond_1
    invoke-static {v0}, Lx2/g;->a(Landroid/view/View;)Lx2/f;

    move-result-object v1

    if-nez v1, :cond_2

    invoke-static {v0, p0}, Lx2/g;->b(Landroid/view/View;Lx2/f;)V

    :cond_2
    return-void
.end method
