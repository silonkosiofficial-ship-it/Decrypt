.class public final Landroidx/compose/ui/window/l;
.super Landroidx/compose/ui/platform/a;
.source "SourceFile"

# interfaces
.implements Landroidx/compose/ui/platform/G1;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/compose/ui/window/l$c;,
        Landroidx/compose/ui/window/l$e;
    }
.end annotation


# static fields
.field private static final h0:Landroidx/compose/ui/window/l$c;

.field public static final i0:I

.field private static final j0:Lx7/l;


# instance fields
.field private K:Lx7/a;

.field private L:Landroidx/compose/ui/window/s;

.field private M:Ljava/lang/String;

.field private final N:Landroid/view/View;

.field private final O:Landroidx/compose/ui/window/n;

.field private final P:Landroid/view/WindowManager;

.field private final Q:Landroid/view/WindowManager$LayoutParams;

.field private R:Landroidx/compose/ui/window/r;

.field private S:LY0/v;

.field private final T:LV/w0;

.field private final U:LV/w0;

.field private V:LY0/r;

.field private final W:LV/G1;

.field private final a0:F

.field private final b0:Landroid/graphics/Rect;

.field private final c0:Lf0/u;

.field private d0:Ljava/lang/Object;

.field private final e0:LV/w0;

.field private f0:Z

.field private final g0:[I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Landroidx/compose/ui/window/l$c;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Landroidx/compose/ui/window/l$c;-><init>(Ly7/k;)V

    sput-object v0, Landroidx/compose/ui/window/l;->h0:Landroidx/compose/ui/window/l$c;

    const/16 v0, 0x8

    sput v0, Landroidx/compose/ui/window/l;->i0:I

    sget-object v0, Landroidx/compose/ui/window/l$b;->D:Landroidx/compose/ui/window/l$b;

    sput-object v0, Landroidx/compose/ui/window/l;->j0:Lx7/l;

    return-void
.end method

.method public constructor <init>(Lx7/a;Landroidx/compose/ui/window/s;Ljava/lang/String;Landroid/view/View;LY0/e;Landroidx/compose/ui/window/r;Ljava/util/UUID;Landroidx/compose/ui/window/n;)V
    .locals 6

    invoke-virtual {p4}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    const/4 v4, 0x6

    const/4 v5, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Landroidx/compose/ui/platform/a;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILy7/k;)V

    iput-object p1, p0, Landroidx/compose/ui/window/l;->K:Lx7/a;

    iput-object p2, p0, Landroidx/compose/ui/window/l;->L:Landroidx/compose/ui/window/s;

    iput-object p3, p0, Landroidx/compose/ui/window/l;->M:Ljava/lang/String;

    iput-object p4, p0, Landroidx/compose/ui/window/l;->N:Landroid/view/View;

    iput-object p8, p0, Landroidx/compose/ui/window/l;->O:Landroidx/compose/ui/window/n;

    invoke-virtual {p4}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    const-string p2, "window"

    invoke-virtual {p1, p2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    const-string p2, "null cannot be cast to non-null type android.view.WindowManager"

    invoke-static {p1, p2}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Landroid/view/WindowManager;

    iput-object p1, p0, Landroidx/compose/ui/window/l;->P:Landroid/view/WindowManager;

    invoke-direct {p0}, Landroidx/compose/ui/window/l;->m()Landroid/view/WindowManager$LayoutParams;

    move-result-object p1

    iput-object p1, p0, Landroidx/compose/ui/window/l;->Q:Landroid/view/WindowManager$LayoutParams;

    iput-object p6, p0, Landroidx/compose/ui/window/l;->R:Landroidx/compose/ui/window/r;

    sget-object p1, LY0/v;->C:LY0/v;

    iput-object p1, p0, Landroidx/compose/ui/window/l;->S:LY0/v;

    const/4 p1, 0x0

    const/4 p2, 0x2

    invoke-static {p1, p1, p2, p1}, LV/v1;->i(Ljava/lang/Object;LV/u1;ILjava/lang/Object;)LV/w0;

    move-result-object p3

    iput-object p3, p0, Landroidx/compose/ui/window/l;->T:LV/w0;

    invoke-static {p1, p1, p2, p1}, LV/v1;->i(Ljava/lang/Object;LV/u1;ILjava/lang/Object;)LV/w0;

    move-result-object p3

    iput-object p3, p0, Landroidx/compose/ui/window/l;->U:LV/w0;

    new-instance p3, Landroidx/compose/ui/window/l$f;

    invoke-direct {p3, p0}, Landroidx/compose/ui/window/l$f;-><init>(Landroidx/compose/ui/window/l;)V

    invoke-static {p3}, LV/v1;->e(Lx7/a;)LV/G1;

    move-result-object p3

    iput-object p3, p0, Landroidx/compose/ui/window/l;->W:LV/G1;

    const/16 p3, 0x8

    int-to-float p3, p3

    invoke-static {p3}, LY0/i;->q(F)F

    move-result p3

    iput p3, p0, Landroidx/compose/ui/window/l;->a0:F

    new-instance p6, Landroid/graphics/Rect;

    invoke-direct {p6}, Landroid/graphics/Rect;-><init>()V

    iput-object p6, p0, Landroidx/compose/ui/window/l;->b0:Landroid/graphics/Rect;

    new-instance p6, Lf0/u;

    new-instance p8, Landroidx/compose/ui/window/l$g;

    invoke-direct {p8, p0}, Landroidx/compose/ui/window/l$g;-><init>(Landroidx/compose/ui/window/l;)V

    invoke-direct {p6, p8}, Lf0/u;-><init>(Lx7/l;)V

    iput-object p6, p0, Landroidx/compose/ui/window/l;->c0:Lf0/u;

    const p6, 0x1020002

    invoke-virtual {p0, p6}, Landroid/view/View;->setId(I)V

    invoke-static {p4}, Landroidx/lifecycle/Z;->a(Landroid/view/View;)Landroidx/lifecycle/r;

    move-result-object p6

    invoke-static {p0, p6}, Landroidx/lifecycle/Z;->b(Landroid/view/View;Landroidx/lifecycle/r;)V

    invoke-static {p4}, Landroidx/lifecycle/a0;->a(Landroid/view/View;)Landroidx/lifecycle/Y;

    move-result-object p6

    invoke-static {p0, p6}, Landroidx/lifecycle/a0;->b(Landroid/view/View;Landroidx/lifecycle/Y;)V

    invoke-static {p4}, Lx2/g;->a(Landroid/view/View;)Lx2/f;

    move-result-object p4

    invoke-static {p0, p4}, Lx2/g;->b(Landroid/view/View;Lx2/f;)V

    sget p4, Lh0/l;->H:I

    new-instance p6, Ljava/lang/StringBuilder;

    invoke-direct {p6}, Ljava/lang/StringBuilder;-><init>()V

    const-string p8, "Popup:"

    invoke-virtual {p6, p8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p6, p7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p6

    invoke-virtual {p0, p4, p6}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    const/4 p4, 0x0

    invoke-virtual {p0, p4}, Landroid/view/ViewGroup;->setClipChildren(Z)V

    invoke-interface {p5, p3}, LY0/e;->B0(F)F

    move-result p3

    invoke-virtual {p0, p3}, Landroid/view/View;->setElevation(F)V

    new-instance p3, Landroidx/compose/ui/window/l$a;

    invoke-direct {p3}, Landroidx/compose/ui/window/l$a;-><init>()V

    invoke-virtual {p0, p3}, Landroid/view/View;->setOutlineProvider(Landroid/view/ViewOutlineProvider;)V

    sget-object p3, Landroidx/compose/ui/window/g;->a:Landroidx/compose/ui/window/g;

    invoke-virtual {p3}, Landroidx/compose/ui/window/g;->a()Lx7/p;

    move-result-object p3

    invoke-static {p3, p1, p2, p1}, LV/v1;->i(Ljava/lang/Object;LV/u1;ILjava/lang/Object;)LV/w0;

    move-result-object p1

    iput-object p1, p0, Landroidx/compose/ui/window/l;->e0:LV/w0;

    new-array p1, p2, [I

    iput-object p1, p0, Landroidx/compose/ui/window/l;->g0:[I

    return-void
.end method

.method public synthetic constructor <init>(Lx7/a;Landroidx/compose/ui/window/s;Ljava/lang/String;Landroid/view/View;LY0/e;Landroidx/compose/ui/window/r;Ljava/util/UUID;Landroidx/compose/ui/window/n;ILy7/k;)V
    .locals 10

    .prologue
    move/from16 v0, p9

    and-int/lit16 v0, v0, 0x80

    if-eqz v0, :cond_1

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1d

    if-lt v0, v1, :cond_0

    new-instance v0, Landroidx/compose/ui/window/p;

    invoke-direct {v0}, Landroidx/compose/ui/window/p;-><init>()V

    goto :goto_0

    :cond_0
    new-instance v0, Landroidx/compose/ui/window/q;

    invoke-direct {v0}, Landroidx/compose/ui/window/q;-><init>()V

    :goto_0
    move-object v9, v0

    goto :goto_1

    :cond_1
    move-object/from16 v9, p8

    :goto_1
    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    invoke-direct/range {v1 .. v9}, Landroidx/compose/ui/window/l;-><init>(Lx7/a;Landroidx/compose/ui/window/s;Ljava/lang/String;Landroid/view/View;LY0/e;Landroidx/compose/ui/window/r;Ljava/util/UUID;Landroidx/compose/ui/window/n;)V

    return-void
.end method

.method private final getContent()Lx7/p;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lx7/p;"
        }
    .end annotation

    iget-object v0, p0, Landroidx/compose/ui/window/l;->e0:LV/w0;

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

.method public static synthetic getParams$ui_release$annotations()V
    .locals 0

    return-void
.end method

.method private final getParentLayoutCoordinates()LD0/t;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/window/l;->U:LV/w0;

    invoke-interface {v0}, LV/G1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LD0/t;

    return-object v0
.end method

.method public static final synthetic l(Landroidx/compose/ui/window/l;)LD0/t;
    .locals 0

    invoke-direct {p0}, Landroidx/compose/ui/window/l;->getParentLayoutCoordinates()LD0/t;

    move-result-object p0

    return-object p0
.end method

.method private final m()Landroid/view/WindowManager$LayoutParams;
    .locals 3

    new-instance v0, Landroid/view/WindowManager$LayoutParams;

    invoke-direct {v0}, Landroid/view/WindowManager$LayoutParams;-><init>()V

    const v1, 0x800033

    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->gravity:I

    iget-object v1, p0, Landroidx/compose/ui/window/l;->L:Landroidx/compose/ui/window/s;

    iget-object v2, p0, Landroidx/compose/ui/window/l;->N:Landroid/view/View;

    invoke-static {v2}, Landroidx/compose/ui/window/b;->i(Landroid/view/View;)Z

    move-result v2

    invoke-static {v1, v2}, Landroidx/compose/ui/window/b;->e(Landroidx/compose/ui/window/s;Z)I

    move-result v1

    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->flags:I

    const/16 v1, 0x3ea

    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->type:I

    iget-object v1, p0, Landroidx/compose/ui/window/l;->N:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getApplicationWindowToken()Landroid/os/IBinder;

    move-result-object v1

    iput-object v1, v0, Landroid/view/WindowManager$LayoutParams;->token:Landroid/os/IBinder;

    const/4 v1, -0x2

    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->width:I

    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->height:I

    const/4 v1, -0x3

    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->format:I

    iget-object v1, p0, Landroidx/compose/ui/window/l;->N:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lh0/m;->b:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/view/WindowManager$LayoutParams;->setTitle(Ljava/lang/CharSequence;)V

    return-object v0
.end method

.method private final o()V
    .locals 2

    .prologue
    iget-object v0, p0, Landroidx/compose/ui/window/l;->L:Landroidx/compose/ui/window/s;

    invoke-virtual {v0}, Landroidx/compose/ui/window/s;->a()Z

    move-result v0

    if-eqz v0, :cond_2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x21

    if-ge v0, v1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Landroidx/compose/ui/window/l;->d0:Ljava/lang/Object;

    if-nez v0, :cond_1

    iget-object v0, p0, Landroidx/compose/ui/window/l;->K:Lx7/a;

    invoke-static {v0}, Landroidx/compose/ui/window/e;->b(Lx7/a;)Landroid/window/OnBackInvokedCallback;

    move-result-object v0

    iput-object v0, p0, Landroidx/compose/ui/window/l;->d0:Ljava/lang/Object;

    :cond_1
    iget-object v0, p0, Landroidx/compose/ui/window/l;->d0:Ljava/lang/Object;

    invoke-static {p0, v0}, Landroidx/compose/ui/window/e;->d(Landroid/view/View;Ljava/lang/Object;)V

    :cond_2
    :goto_0
    return-void
.end method

.method private final p()V
    .locals 2

    .prologue
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x21

    if-lt v0, v1, :cond_0

    iget-object v0, p0, Landroidx/compose/ui/window/l;->d0:Ljava/lang/Object;

    invoke-static {p0, v0}, Landroidx/compose/ui/window/e;->e(Landroid/view/View;Ljava/lang/Object;)V

    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Landroidx/compose/ui/window/l;->d0:Ljava/lang/Object;

    return-void
.end method

.method private final setContent(Lx7/p;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lx7/p;",
            ")V"
        }
    .end annotation

    iget-object v0, p0, Landroidx/compose/ui/window/l;->e0:LV/w0;

    invoke-interface {v0, p1}, LV/w0;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private final setParentLayoutCoordinates(LD0/t;)V
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/window/l;->U:LV/w0;

    invoke-interface {v0, p1}, LV/w0;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private final t(LY0/v;)V
    .locals 2

    .prologue
    sget-object v0, Landroidx/compose/ui/window/l$e;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_1

    const/4 v1, 0x2

    if-ne p1, v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Li7/s;

    invoke-direct {p1}, Li7/s;-><init>()V

    throw p1

    :cond_1
    const/4 v0, 0x0

    :goto_0
    invoke-super {p0, v0}, Landroid/view/ViewGroup;->setLayoutDirection(I)V

    return-void
.end method

.method private final x(Landroidx/compose/ui/window/s;)V
    .locals 2

    .prologue
    iget-object v0, p0, Landroidx/compose/ui/window/l;->L:Landroidx/compose/ui/window/s;

    invoke-static {v0, p1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p1}, Landroidx/compose/ui/window/s;->f()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Landroidx/compose/ui/window/l;->L:Landroidx/compose/ui/window/s;

    invoke-virtual {v0}, Landroidx/compose/ui/window/s;->f()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Landroidx/compose/ui/window/l;->Q:Landroid/view/WindowManager$LayoutParams;

    const/4 v1, -0x2

    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->width:I

    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->height:I

    :cond_1
    iput-object p1, p0, Landroidx/compose/ui/window/l;->L:Landroidx/compose/ui/window/s;

    iget-object v0, p0, Landroidx/compose/ui/window/l;->Q:Landroid/view/WindowManager$LayoutParams;

    iget-object v1, p0, Landroidx/compose/ui/window/l;->N:Landroid/view/View;

    invoke-static {v1}, Landroidx/compose/ui/window/b;->i(Landroid/view/View;)Z

    move-result v1

    invoke-static {p1, v1}, Landroidx/compose/ui/window/b;->e(Landroidx/compose/ui/window/s;Z)I

    move-result p1

    iput p1, v0, Landroid/view/WindowManager$LayoutParams;->flags:I

    iget-object p1, p0, Landroidx/compose/ui/window/l;->O:Landroidx/compose/ui/window/n;

    iget-object v0, p0, Landroidx/compose/ui/window/l;->P:Landroid/view/WindowManager;

    iget-object v1, p0, Landroidx/compose/ui/window/l;->Q:Landroid/view/WindowManager$LayoutParams;

    invoke-interface {p1, v0, p0, v1}, Landroidx/compose/ui/window/n;->a(Landroid/view/WindowManager;Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method


# virtual methods
.method public b(LV/n;I)V
    .locals 4

    .prologue
    const v0, -0x331e2520

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

    const-string v3, "androidx.compose.ui.window.PopupLayout.Content (AndroidPopup.android.kt:572)"

    invoke-static {v0, v1, v2, v3}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_4
    invoke-direct {p0}, Landroidx/compose/ui/window/l;->getContent()Lx7/p;

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

    new-instance v0, Landroidx/compose/ui/window/l$d;

    invoke-direct {v0, p0, p2}, Landroidx/compose/ui/window/l$d;-><init>(Landroidx/compose/ui/window/l;I)V

    invoke-interface {p1, v0}, LV/e1;->a(Lx7/p;)V

    :cond_6
    return-void
.end method

.method public dispatchKeyEvent(Landroid/view/KeyEvent;)Z
    .locals 2

    .prologue
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result v0

    const/4 v1, 0x4

    if-ne v0, v1, :cond_4

    iget-object v0, p0, Landroidx/compose/ui/window/l;->L:Landroidx/compose/ui/window/s;

    invoke-virtual {v0}, Landroidx/compose/ui/window/s;->a()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-virtual {p0}, Landroid/view/View;->getKeyDispatcherState()Landroid/view/KeyEvent$DispatcherState;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-super {p0, p1}, Landroid/view/ViewGroup;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    move-result p1

    return p1

    :cond_0
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getAction()I

    move-result v0

    const/4 v1, 0x1

    if-nez v0, :cond_2

    invoke-virtual {p1}, Landroid/view/KeyEvent;->getRepeatCount()I

    move-result v0

    if-nez v0, :cond_2

    invoke-virtual {p0}, Landroid/view/View;->getKeyDispatcherState()Landroid/view/KeyEvent$DispatcherState;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0, p1, p0}, Landroid/view/KeyEvent$DispatcherState;->startTracking(Landroid/view/KeyEvent;Ljava/lang/Object;)V

    :cond_1
    return v1

    :cond_2
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getAction()I

    move-result v0

    if-ne v0, v1, :cond_4

    invoke-virtual {p0}, Landroid/view/View;->getKeyDispatcherState()Landroid/view/KeyEvent$DispatcherState;

    move-result-object v0

    if-eqz v0, :cond_4

    invoke-virtual {v0, p1}, Landroid/view/KeyEvent$DispatcherState;->isTracking(Landroid/view/KeyEvent;)Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-virtual {p1}, Landroid/view/KeyEvent;->isCanceled()Z

    move-result v0

    if-nez v0, :cond_4

    iget-object p1, p0, Landroidx/compose/ui/window/l;->K:Lx7/a;

    if-eqz p1, :cond_3

    invoke-interface {p1}, Lx7/a;->b()Ljava/lang/Object;

    :cond_3
    return v1

    :cond_4
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    move-result p1

    return p1
.end method

.method public final getCanCalculatePosition()Z
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/window/l;->W:LV/G1;

    invoke-interface {v0}, LV/G1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public final getParams$ui_release()Landroid/view/WindowManager$LayoutParams;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/window/l;->Q:Landroid/view/WindowManager$LayoutParams;

    return-object v0
.end method

.method public final getParentLayoutDirection()LY0/v;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/window/l;->S:LY0/v;

    return-object v0
.end method

.method public final getPopupContentSize-bOM6tXw()LY0/t;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/window/l;->T:LV/w0;

    invoke-interface {v0}, LV/G1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LY0/t;

    return-object v0
.end method

.method public final getPositionProvider()Landroidx/compose/ui/window/r;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/window/l;->R:Landroidx/compose/ui/window/r;

    return-object v0
.end method

.method protected getShouldCreateCompositionOnAttachedToWindow()Z
    .locals 1

    iget-boolean v0, p0, Landroidx/compose/ui/window/l;->f0:Z

    return v0
.end method

.method public getSubCompositionView()Landroidx/compose/ui/platform/a;
    .locals 0

    return-object p0
.end method

.method public final getTestTag()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/window/l;->M:Ljava/lang/String;

    return-object v0
.end method

.method public bridge synthetic getViewRoot()Landroid/view/View;
    .locals 1

    invoke-static {p0}, Landroidx/compose/ui/platform/F1;->b(Landroidx/compose/ui/platform/G1;)Landroid/view/View;

    move-result-object v0

    return-object v0
.end method

.method public h(ZIIII)V
    .locals 0

    .prologue
    invoke-super/range {p0 .. p5}, Landroidx/compose/ui/platform/a;->h(ZIIII)V

    iget-object p1, p0, Landroidx/compose/ui/window/l;->L:Landroidx/compose/ui/window/s;

    invoke-virtual {p1}, Landroidx/compose/ui/window/s;->f()Z

    move-result p1

    if-nez p1, :cond_1

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object p1

    if-nez p1, :cond_0

    return-void

    :cond_0
    iget-object p2, p0, Landroidx/compose/ui/window/l;->Q:Landroid/view/WindowManager$LayoutParams;

    invoke-virtual {p1}, Landroid/view/View;->getMeasuredWidth()I

    move-result p3

    iput p3, p2, Landroid/view/WindowManager$LayoutParams;->width:I

    iget-object p2, p0, Landroidx/compose/ui/window/l;->Q:Landroid/view/WindowManager$LayoutParams;

    invoke-virtual {p1}, Landroid/view/View;->getMeasuredHeight()I

    move-result p1

    iput p1, p2, Landroid/view/WindowManager$LayoutParams;->height:I

    iget-object p1, p0, Landroidx/compose/ui/window/l;->O:Landroidx/compose/ui/window/n;

    iget-object p2, p0, Landroidx/compose/ui/window/l;->P:Landroid/view/WindowManager;

    iget-object p3, p0, Landroidx/compose/ui/window/l;->Q:Landroid/view/WindowManager$LayoutParams;

    invoke-interface {p1, p2, p0, p3}, Landroidx/compose/ui/window/n;->a(Landroid/view/WindowManager;Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    :cond_1
    return-void
.end method

.method public i(II)V
    .locals 1

    .prologue
    iget-object v0, p0, Landroidx/compose/ui/window/l;->L:Landroidx/compose/ui/window/s;

    invoke-virtual {v0}, Landroidx/compose/ui/window/s;->f()Z

    move-result v0

    if-eqz v0, :cond_0

    :goto_0
    invoke-super {p0, p1, p2}, Landroidx/compose/ui/platform/a;->i(II)V

    goto :goto_1

    :cond_0
    invoke-direct {p0}, Landroidx/compose/ui/window/l;->getDisplayWidth()I

    move-result p1

    const/high16 p2, -0x80000000

    invoke-static {p1, p2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p1

    invoke-direct {p0}, Landroidx/compose/ui/window/l;->getDisplayHeight()I

    move-result v0

    invoke-static {v0, p2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p2

    goto :goto_0

    :goto_1
    return-void
.end method

.method public final n()V
    .locals 1

    const/4 v0, 0x0

    invoke-static {p0, v0}, Landroidx/lifecycle/Z;->b(Landroid/view/View;Landroidx/lifecycle/r;)V

    iget-object v0, p0, Landroidx/compose/ui/window/l;->P:Landroid/view/WindowManager;

    invoke-interface {v0, p0}, Landroid/view/WindowManager;->removeViewImmediate(Landroid/view/View;)V

    return-void
.end method

.method protected onAttachedToWindow()V
    .locals 1

    invoke-super {p0}, Landroidx/compose/ui/platform/a;->onAttachedToWindow()V

    iget-object v0, p0, Landroidx/compose/ui/window/l;->c0:Lf0/u;

    invoke-virtual {v0}, Lf0/u;->s()V

    invoke-direct {p0}, Landroidx/compose/ui/window/l;->o()V

    return-void
.end method

.method protected onDetachedFromWindow()V
    .locals 1

    invoke-super {p0}, Landroid/view/ViewGroup;->onDetachedFromWindow()V

    iget-object v0, p0, Landroidx/compose/ui/window/l;->c0:Lf0/u;

    invoke-virtual {v0}, Lf0/u;->t()V

    iget-object v0, p0, Landroidx/compose/ui/window/l;->c0:Lf0/u;

    invoke-virtual {v0}, Lf0/u;->j()V

    invoke-direct {p0}, Landroidx/compose/ui/window/l;->p()V

    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 4

    .prologue
    iget-object v0, p0, Landroidx/compose/ui/window/l;->L:Landroidx/compose/ui/window/s;

    invoke-virtual {v0}, Landroidx/compose/ui/window/s;->b()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-super {p0, p1}, Landroid/view/ViewGroup;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1

    :cond_0
    const/4 v0, 0x1

    if-eqz p1, :cond_3

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v1

    if-nez v1, :cond_3

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v1

    const/4 v2, 0x0

    cmpg-float v1, v1, v2

    if-ltz v1, :cond_1

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v1

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v3

    int-to-float v3, v3

    cmpl-float v1, v1, v3

    if-gez v1, :cond_1

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v1

    cmpg-float v1, v1, v2

    if-ltz v1, :cond_1

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v1

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v2

    int-to-float v2, v2

    cmpl-float v1, v1, v2

    if-ltz v1, :cond_3

    :cond_1
    iget-object p1, p0, Landroidx/compose/ui/window/l;->K:Lx7/a;

    if-eqz p1, :cond_2

    invoke-interface {p1}, Lx7/a;->b()Ljava/lang/Object;

    :cond_2
    return v0

    :cond_3
    if-eqz p1, :cond_5

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v1

    const/4 v2, 0x4

    if-ne v1, v2, :cond_5

    iget-object p1, p0, Landroidx/compose/ui/window/l;->K:Lx7/a;

    if-eqz p1, :cond_4

    invoke-interface {p1}, Lx7/a;->b()Ljava/lang/Object;

    :cond_4
    return v0

    :cond_5
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1
.end method

.method public final q()V
    .locals 6

    .prologue
    iget-object v0, p0, Landroidx/compose/ui/window/l;->g0:[I

    const/4 v1, 0x0

    aget v2, v0, v1

    const/4 v3, 0x1

    aget v4, v0, v3

    iget-object v5, p0, Landroidx/compose/ui/window/l;->N:Landroid/view/View;

    invoke-virtual {v5, v0}, Landroid/view/View;->getLocationOnScreen([I)V

    iget-object v0, p0, Landroidx/compose/ui/window/l;->g0:[I

    aget v1, v0, v1

    if-ne v2, v1, :cond_0

    aget v0, v0, v3

    if-eq v4, v0, :cond_1

    :cond_0
    invoke-virtual {p0}, Landroidx/compose/ui/window/l;->v()V

    :cond_1
    return-void
.end method

.method public final r(LV/s;Lx7/p;)V
    .locals 0

    invoke-virtual {p0, p1}, Landroidx/compose/ui/platform/a;->setParentCompositionContext(LV/s;)V

    invoke-direct {p0, p2}, Landroidx/compose/ui/window/l;->setContent(Lx7/p;)V

    const/4 p1, 0x1

    iput-boolean p1, p0, Landroidx/compose/ui/window/l;->f0:Z

    return-void
.end method

.method public final s()V
    .locals 2

    iget-object v0, p0, Landroidx/compose/ui/window/l;->P:Landroid/view/WindowManager;

    iget-object v1, p0, Landroidx/compose/ui/window/l;->Q:Landroid/view/WindowManager$LayoutParams;

    invoke-interface {v0, p0, v1}, Landroid/view/ViewManager;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method public setLayoutDirection(I)V
    .locals 0

    return-void
.end method

.method public final setParentLayoutDirection(LY0/v;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/ui/window/l;->S:LY0/v;

    return-void
.end method

.method public final setPopupContentSize-fhxjrPA(LY0/t;)V
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/window/l;->T:LV/w0;

    invoke-interface {v0, p1}, LV/w0;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public final setPositionProvider(Landroidx/compose/ui/window/r;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/ui/window/l;->R:Landroidx/compose/ui/window/r;

    return-void
.end method

.method public final setTestTag(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/ui/window/l;->M:Ljava/lang/String;

    return-void
.end method

.method public final u(Lx7/a;Landroidx/compose/ui/window/s;Ljava/lang/String;LY0/v;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/ui/window/l;->K:Lx7/a;

    iput-object p3, p0, Landroidx/compose/ui/window/l;->M:Ljava/lang/String;

    invoke-direct {p0, p2}, Landroidx/compose/ui/window/l;->x(Landroidx/compose/ui/window/s;)V

    invoke-direct {p0, p4}, Landroidx/compose/ui/window/l;->t(LY0/v;)V

    return-void
.end method

.method public final v()V
    .locals 5

    .prologue
    invoke-direct {p0}, Landroidx/compose/ui/window/l;->getParentLayoutCoordinates()LD0/t;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-interface {v0}, LD0/t;->K()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    invoke-interface {v0}, LD0/t;->a()J

    move-result-wide v1

    invoke-static {v0}, LD0/u;->f(LD0/t;)J

    move-result-wide v3

    invoke-static {v3, v4}, Ln0/g;->m(J)F

    move-result v0

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    invoke-static {v3, v4}, Ln0/g;->n(J)F

    move-result v3

    invoke-static {v3}, Ljava/lang/Math;->round(F)I

    move-result v3

    invoke-static {v0, v3}, LY0/q;->a(II)J

    move-result-wide v3

    invoke-static {v3, v4, v1, v2}, LY0/s;->a(JJ)LY0/r;

    move-result-object v0

    iget-object v1, p0, Landroidx/compose/ui/window/l;->V:LY0/r;

    invoke-static {v0, v1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    iput-object v0, p0, Landroidx/compose/ui/window/l;->V:LY0/r;

    invoke-virtual {p0}, Landroidx/compose/ui/window/l;->y()V

    :cond_2
    :goto_1
    return-void
.end method

.method public final w(LD0/t;)V
    .locals 0

    invoke-direct {p0, p1}, Landroidx/compose/ui/window/l;->setParentLayoutCoordinates(LD0/t;)V

    invoke-virtual {p0}, Landroidx/compose/ui/window/l;->v()V

    return-void
.end method

.method public final y()V
    .locals 14

    .prologue
    iget-object v3, p0, Landroidx/compose/ui/window/l;->V:LY0/r;

    if-nez v3, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0}, Landroidx/compose/ui/window/l;->getPopupContentSize-bOM6tXw()LY0/t;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, LY0/t;->j()J

    move-result-wide v6

    iget-object v0, p0, Landroidx/compose/ui/window/l;->b0:Landroid/graphics/Rect;

    iget-object v1, p0, Landroidx/compose/ui/window/l;->O:Landroidx/compose/ui/window/n;

    iget-object v2, p0, Landroidx/compose/ui/window/l;->N:Landroid/view/View;

    invoke-interface {v1, v2, v0}, Landroidx/compose/ui/window/n;->c(Landroid/view/View;Landroid/graphics/Rect;)V

    invoke-static {v0}, Landroidx/compose/ui/window/b;->f(Landroid/graphics/Rect;)LY0/r;

    move-result-object v0

    invoke-virtual {v0}, LY0/r;->k()I

    move-result v1

    invoke-virtual {v0}, LY0/r;->f()I

    move-result v0

    invoke-static {v1, v0}, LY0/u;->a(II)J

    move-result-wide v8

    new-instance v10, Ly7/N;

    invoke-direct {v10}, Ly7/N;-><init>()V

    sget-object v0, LY0/p;->b:LY0/p$a;

    invoke-virtual {v0}, LY0/p$a;->a()J

    move-result-wide v0

    iput-wide v0, v10, Ly7/N;->C:J

    iget-object v11, p0, Landroidx/compose/ui/window/l;->c0:Lf0/u;

    sget-object v12, Landroidx/compose/ui/window/l;->j0:Lx7/l;

    new-instance v13, Landroidx/compose/ui/window/l$h;

    move-object v0, v13

    move-object v1, v10

    move-object v2, p0

    move-wide v4, v8

    invoke-direct/range {v0 .. v7}, Landroidx/compose/ui/window/l$h;-><init>(Ly7/N;Landroidx/compose/ui/window/l;LY0/r;JJ)V

    invoke-virtual {v11, p0, v12, v13}, Lf0/u;->o(Ljava/lang/Object;Lx7/l;Lx7/a;)V

    iget-object v0, p0, Landroidx/compose/ui/window/l;->Q:Landroid/view/WindowManager$LayoutParams;

    iget-wide v1, v10, Ly7/N;->C:J

    invoke-static {v1, v2}, LY0/p;->h(J)I

    move-result v1

    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->x:I

    iget-object v0, p0, Landroidx/compose/ui/window/l;->Q:Landroid/view/WindowManager$LayoutParams;

    iget-wide v1, v10, Ly7/N;->C:J

    invoke-static {v1, v2}, LY0/p;->i(J)I

    move-result v1

    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->y:I

    iget-object v0, p0, Landroidx/compose/ui/window/l;->L:Landroidx/compose/ui/window/s;

    invoke-virtual {v0}, Landroidx/compose/ui/window/s;->c()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Landroidx/compose/ui/window/l;->O:Landroidx/compose/ui/window/n;

    invoke-static {v8, v9}, LY0/t;->g(J)I

    move-result v1

    invoke-static {v8, v9}, LY0/t;->f(J)I

    move-result v2

    invoke-interface {v0, p0, v1, v2}, Landroidx/compose/ui/window/n;->b(Landroid/view/View;II)V

    :cond_1
    iget-object v0, p0, Landroidx/compose/ui/window/l;->O:Landroidx/compose/ui/window/n;

    iget-object v1, p0, Landroidx/compose/ui/window/l;->P:Landroid/view/WindowManager;

    iget-object v2, p0, Landroidx/compose/ui/window/l;->Q:Landroid/view/WindowManager$LayoutParams;

    invoke-interface {v0, v1, p0, v2}, Landroidx/compose/ui/window/n;->a(Landroid/view/WindowManager;Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    :cond_2
    return-void
.end method
