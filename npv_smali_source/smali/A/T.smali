.class public final LA/T;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LA/T$a;
    }
.end annotation


# static fields
.field private static A:Z

.field public static final x:LA/T$a;

.field public static final y:I

.field private static final z:Ljava/util/WeakHashMap;


# instance fields
.field private final a:LA/a;

.field private final b:LA/a;

.field private final c:LA/a;

.field private final d:LA/a;

.field private final e:LA/a;

.field private final f:LA/a;

.field private final g:LA/a;

.field private final h:LA/a;

.field private final i:LA/a;

.field private final j:LA/Q;

.field private final k:LA/S;

.field private final l:LA/S;

.field private final m:LA/S;

.field private final n:LA/Q;

.field private final o:LA/Q;

.field private final p:LA/Q;

.field private final q:LA/Q;

.field private final r:LA/Q;

.field private final s:LA/Q;

.field private final t:LA/Q;

.field private final u:Z

.field private v:I

.field private final w:LA/t;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LA/T$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LA/T$a;-><init>(Ly7/k;)V

    sput-object v0, LA/T;->x:LA/T$a;

    const/16 v0, 0x8

    sput v0, LA/T;->y:I

    new-instance v0, Ljava/util/WeakHashMap;

    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    sput-object v0, LA/T;->z:Ljava/util/WeakHashMap;

    return-void
.end method

.method private constructor <init>(Landroidx/core/view/y0;Landroid/view/View;)V
    .locals 9

    .prologue
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, LA/T;->x:LA/T$a;

    invoke-static {}, Landroidx/core/view/y0$m;->a()I

    move-result v1

    const-string v2, "captionBar"

    invoke-static {v0, p1, v1, v2}, LA/T$a;->a(LA/T$a;Landroidx/core/view/y0;ILjava/lang/String;)LA/a;

    move-result-object v1

    iput-object v1, p0, LA/T;->a:LA/a;

    invoke-static {}, Landroidx/core/view/y0$m;->b()I

    move-result v1

    const-string v2, "displayCutout"

    invoke-static {v0, p1, v1, v2}, LA/T$a;->a(LA/T$a;Landroidx/core/view/y0;ILjava/lang/String;)LA/a;

    move-result-object v1

    iput-object v1, p0, LA/T;->b:LA/a;

    invoke-static {}, Landroidx/core/view/y0$m;->c()I

    move-result v2

    const-string v3, "ime"

    invoke-static {v0, p1, v2, v3}, LA/T$a;->a(LA/T$a;Landroidx/core/view/y0;ILjava/lang/String;)LA/a;

    move-result-object v2

    iput-object v2, p0, LA/T;->c:LA/a;

    invoke-static {}, Landroidx/core/view/y0$m;->e()I

    move-result v3

    const-string v4, "mandatorySystemGestures"

    invoke-static {v0, p1, v3, v4}, LA/T$a;->a(LA/T$a;Landroidx/core/view/y0;ILjava/lang/String;)LA/a;

    move-result-object v3

    iput-object v3, p0, LA/T;->d:LA/a;

    invoke-static {}, Landroidx/core/view/y0$m;->f()I

    move-result v4

    const-string v5, "navigationBars"

    invoke-static {v0, p1, v4, v5}, LA/T$a;->a(LA/T$a;Landroidx/core/view/y0;ILjava/lang/String;)LA/a;

    move-result-object v4

    iput-object v4, p0, LA/T;->e:LA/a;

    invoke-static {}, Landroidx/core/view/y0$m;->g()I

    move-result v4

    const-string v5, "statusBars"

    invoke-static {v0, p1, v4, v5}, LA/T$a;->a(LA/T$a;Landroidx/core/view/y0;ILjava/lang/String;)LA/a;

    move-result-object v4

    iput-object v4, p0, LA/T;->f:LA/a;

    invoke-static {}, Landroidx/core/view/y0$m;->h()I

    move-result v4

    const-string v5, "systemBars"

    invoke-static {v0, p1, v4, v5}, LA/T$a;->a(LA/T$a;Landroidx/core/view/y0;ILjava/lang/String;)LA/a;

    move-result-object v4

    iput-object v4, p0, LA/T;->g:LA/a;

    invoke-static {}, Landroidx/core/view/y0$m;->i()I

    move-result v5

    const-string v6, "systemGestures"

    invoke-static {v0, p1, v5, v6}, LA/T$a;->a(LA/T$a;Landroidx/core/view/y0;ILjava/lang/String;)LA/a;

    move-result-object v5

    iput-object v5, p0, LA/T;->h:LA/a;

    invoke-static {}, Landroidx/core/view/y0$m;->j()I

    move-result v6

    const-string v7, "tappableElement"

    invoke-static {v0, p1, v6, v7}, LA/T$a;->a(LA/T$a;Landroidx/core/view/y0;ILjava/lang/String;)LA/a;

    move-result-object v6

    iput-object v6, p0, LA/T;->i:LA/a;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Landroidx/core/view/y0;->e()Landroidx/core/view/r;

    move-result-object v7

    if-eqz v7, :cond_0

    invoke-virtual {v7}, Landroidx/core/view/r;->e()Landroidx/core/graphics/f;

    move-result-object v7

    if-nez v7, :cond_1

    :cond_0
    sget-object v7, Landroidx/core/graphics/f;->e:Landroidx/core/graphics/f;

    :cond_1
    const-string v8, "waterfall"

    invoke-static {v7, v8}, LA/X;->a(Landroidx/core/graphics/f;Ljava/lang/String;)LA/Q;

    move-result-object v7

    iput-object v7, p0, LA/T;->j:LA/Q;

    invoke-static {v4, v2}, LA/U;->e(LA/S;LA/S;)LA/S;

    move-result-object v2

    invoke-static {v2, v1}, LA/U;->e(LA/S;LA/S;)LA/S;

    move-result-object v1

    iput-object v1, p0, LA/T;->k:LA/S;

    invoke-static {v6, v3}, LA/U;->e(LA/S;LA/S;)LA/S;

    move-result-object v2

    invoke-static {v2, v5}, LA/U;->e(LA/S;LA/S;)LA/S;

    move-result-object v2

    invoke-static {v2, v7}, LA/U;->e(LA/S;LA/S;)LA/S;

    move-result-object v2

    iput-object v2, p0, LA/T;->l:LA/S;

    invoke-static {v1, v2}, LA/U;->e(LA/S;LA/S;)LA/S;

    move-result-object v1

    iput-object v1, p0, LA/T;->m:LA/S;

    invoke-static {}, Landroidx/core/view/y0$m;->a()I

    move-result v1

    const-string v2, "captionBarIgnoringVisibility"

    invoke-static {v0, p1, v1, v2}, LA/T$a;->b(LA/T$a;Landroidx/core/view/y0;ILjava/lang/String;)LA/Q;

    move-result-object v1

    iput-object v1, p0, LA/T;->n:LA/Q;

    invoke-static {}, Landroidx/core/view/y0$m;->f()I

    move-result v1

    const-string v2, "navigationBarsIgnoringVisibility"

    invoke-static {v0, p1, v1, v2}, LA/T$a;->b(LA/T$a;Landroidx/core/view/y0;ILjava/lang/String;)LA/Q;

    move-result-object v1

    iput-object v1, p0, LA/T;->o:LA/Q;

    invoke-static {}, Landroidx/core/view/y0$m;->g()I

    move-result v1

    const-string v2, "statusBarsIgnoringVisibility"

    invoke-static {v0, p1, v1, v2}, LA/T$a;->b(LA/T$a;Landroidx/core/view/y0;ILjava/lang/String;)LA/Q;

    move-result-object v1

    iput-object v1, p0, LA/T;->p:LA/Q;

    invoke-static {}, Landroidx/core/view/y0$m;->h()I

    move-result v1

    const-string v2, "systemBarsIgnoringVisibility"

    invoke-static {v0, p1, v1, v2}, LA/T$a;->b(LA/T$a;Landroidx/core/view/y0;ILjava/lang/String;)LA/Q;

    move-result-object v1

    iput-object v1, p0, LA/T;->q:LA/Q;

    invoke-static {}, Landroidx/core/view/y0$m;->j()I

    move-result v1

    const-string v2, "tappableElementIgnoringVisibility"

    invoke-static {v0, p1, v1, v2}, LA/T$a;->b(LA/T$a;Landroidx/core/view/y0;ILjava/lang/String;)LA/Q;

    move-result-object v1

    iput-object v1, p0, LA/T;->r:LA/Q;

    invoke-static {}, Landroidx/core/view/y0$m;->c()I

    move-result v1

    const-string v2, "imeAnimationTarget"

    invoke-static {v0, p1, v1, v2}, LA/T$a;->b(LA/T$a;Landroidx/core/view/y0;ILjava/lang/String;)LA/Q;

    move-result-object v1

    iput-object v1, p0, LA/T;->s:LA/Q;

    invoke-static {}, Landroidx/core/view/y0$m;->c()I

    move-result v1

    const-string v2, "imeAnimationSource"

    invoke-static {v0, p1, v1, v2}, LA/T$a;->b(LA/T$a;Landroidx/core/view/y0;ILjava/lang/String;)LA/Q;

    move-result-object p1

    iput-object p1, p0, LA/T;->t:LA/Q;

    invoke-virtual {p2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p1

    instance-of p2, p1, Landroid/view/View;

    const/4 v0, 0x0

    if-eqz p2, :cond_2

    check-cast p1, Landroid/view/View;

    goto :goto_0

    :cond_2
    move-object p1, v0

    :goto_0
    if-eqz p1, :cond_3

    sget p2, Lh0/l;->I:I

    invoke-virtual {p1, p2}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object p1

    goto :goto_1

    :cond_3
    move-object p1, v0

    :goto_1
    instance-of p2, p1, Ljava/lang/Boolean;

    if-eqz p2, :cond_4

    move-object v0, p1

    check-cast v0, Ljava/lang/Boolean;

    :cond_4
    if-eqz v0, :cond_5

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    goto :goto_2

    :cond_5
    const/4 p1, 0x1

    :goto_2
    iput-boolean p1, p0, LA/T;->u:Z

    new-instance p1, LA/t;

    invoke-direct {p1, p0}, LA/t;-><init>(LA/T;)V

    iput-object p1, p0, LA/T;->w:LA/t;

    return-void
.end method

.method public synthetic constructor <init>(Landroidx/core/view/y0;Landroid/view/View;Ly7/k;)V
    .locals 0

    invoke-direct {p0, p1, p2}, LA/T;-><init>(Landroidx/core/view/y0;Landroid/view/View;)V

    return-void
.end method

.method public static final synthetic a()Ljava/util/WeakHashMap;
    .locals 1

    sget-object v0, LA/T;->z:Ljava/util/WeakHashMap;

    return-object v0
.end method

.method public static synthetic g(LA/T;Landroidx/core/view/y0;IILjava/lang/Object;)V
    .locals 0

    .prologue
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2}, LA/T;->f(Landroidx/core/view/y0;I)V

    return-void
.end method


# virtual methods
.method public final b(Landroid/view/View;)V
    .locals 1

    .prologue
    iget v0, p0, LA/T;->v:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, LA/T;->v:I

    if-nez v0, :cond_0

    const/4 v0, 0x0

    invoke-static {p1, v0}, Landroidx/core/view/X;->A0(Landroid/view/View;Landroidx/core/view/G;)V

    invoke-static {p1, v0}, Landroidx/core/view/X;->G0(Landroid/view/View;Landroidx/core/view/l0$b;)V

    iget-object v0, p0, LA/T;->w:LA/t;

    invoke-virtual {p1, v0}, Landroid/view/View;->removeOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    :cond_0
    return-void
.end method

.method public final c()Z
    .locals 1

    iget-boolean v0, p0, LA/T;->u:Z

    return v0
.end method

.method public final d()LA/a;
    .locals 1

    iget-object v0, p0, LA/T;->g:LA/a;

    return-object v0
.end method

.method public final e(Landroid/view/View;)V
    .locals 1

    .prologue
    iget v0, p0, LA/T;->v:I

    if-nez v0, :cond_1

    iget-object v0, p0, LA/T;->w:LA/t;

    invoke-static {p1, v0}, Landroidx/core/view/X;->A0(Landroid/view/View;Landroidx/core/view/G;)V

    invoke-virtual {p1}, Landroid/view/View;->isAttachedToWindow()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Landroid/view/View;->requestApplyInsets()V

    :cond_0
    iget-object v0, p0, LA/T;->w:LA/t;

    invoke-virtual {p1, v0}, Landroid/view/View;->addOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    iget-object v0, p0, LA/T;->w:LA/t;

    invoke-static {p1, v0}, Landroidx/core/view/X;->G0(Landroid/view/View;Landroidx/core/view/l0$b;)V

    :cond_1
    iget p1, p0, LA/T;->v:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, LA/T;->v:I

    return-void
.end method

.method public final f(Landroidx/core/view/y0;I)V
    .locals 1

    .prologue
    sget-boolean v0, LA/T;->A:Z

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Landroidx/core/view/y0;->v()Landroid/view/WindowInsets;

    move-result-object p1

    invoke-static {p1}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-static {p1}, Landroidx/core/view/y0;->w(Landroid/view/WindowInsets;)Landroidx/core/view/y0;

    move-result-object p1

    :cond_0
    iget-object v0, p0, LA/T;->a:LA/a;

    invoke-virtual {v0, p1, p2}, LA/a;->h(Landroidx/core/view/y0;I)V

    iget-object v0, p0, LA/T;->c:LA/a;

    invoke-virtual {v0, p1, p2}, LA/a;->h(Landroidx/core/view/y0;I)V

    iget-object v0, p0, LA/T;->b:LA/a;

    invoke-virtual {v0, p1, p2}, LA/a;->h(Landroidx/core/view/y0;I)V

    iget-object v0, p0, LA/T;->e:LA/a;

    invoke-virtual {v0, p1, p2}, LA/a;->h(Landroidx/core/view/y0;I)V

    iget-object v0, p0, LA/T;->f:LA/a;

    invoke-virtual {v0, p1, p2}, LA/a;->h(Landroidx/core/view/y0;I)V

    iget-object v0, p0, LA/T;->g:LA/a;

    invoke-virtual {v0, p1, p2}, LA/a;->h(Landroidx/core/view/y0;I)V

    iget-object v0, p0, LA/T;->h:LA/a;

    invoke-virtual {v0, p1, p2}, LA/a;->h(Landroidx/core/view/y0;I)V

    iget-object v0, p0, LA/T;->i:LA/a;

    invoke-virtual {v0, p1, p2}, LA/a;->h(Landroidx/core/view/y0;I)V

    iget-object v0, p0, LA/T;->d:LA/a;

    invoke-virtual {v0, p1, p2}, LA/a;->h(Landroidx/core/view/y0;I)V

    if-nez p2, :cond_1

    iget-object p2, p0, LA/T;->n:LA/Q;

    invoke-static {}, Landroidx/core/view/y0$m;->a()I

    move-result v0

    invoke-virtual {p1, v0}, Landroidx/core/view/y0;->g(I)Landroidx/core/graphics/f;

    move-result-object v0

    invoke-static {v0}, LA/X;->c(Landroidx/core/graphics/f;)LA/w;

    move-result-object v0

    invoke-virtual {p2, v0}, LA/Q;->f(LA/w;)V

    iget-object p2, p0, LA/T;->o:LA/Q;

    invoke-static {}, Landroidx/core/view/y0$m;->f()I

    move-result v0

    invoke-virtual {p1, v0}, Landroidx/core/view/y0;->g(I)Landroidx/core/graphics/f;

    move-result-object v0

    invoke-static {v0}, LA/X;->c(Landroidx/core/graphics/f;)LA/w;

    move-result-object v0

    invoke-virtual {p2, v0}, LA/Q;->f(LA/w;)V

    iget-object p2, p0, LA/T;->p:LA/Q;

    invoke-static {}, Landroidx/core/view/y0$m;->g()I

    move-result v0

    invoke-virtual {p1, v0}, Landroidx/core/view/y0;->g(I)Landroidx/core/graphics/f;

    move-result-object v0

    invoke-static {v0}, LA/X;->c(Landroidx/core/graphics/f;)LA/w;

    move-result-object v0

    invoke-virtual {p2, v0}, LA/Q;->f(LA/w;)V

    iget-object p2, p0, LA/T;->q:LA/Q;

    invoke-static {}, Landroidx/core/view/y0$m;->h()I

    move-result v0

    invoke-virtual {p1, v0}, Landroidx/core/view/y0;->g(I)Landroidx/core/graphics/f;

    move-result-object v0

    invoke-static {v0}, LA/X;->c(Landroidx/core/graphics/f;)LA/w;

    move-result-object v0

    invoke-virtual {p2, v0}, LA/Q;->f(LA/w;)V

    iget-object p2, p0, LA/T;->r:LA/Q;

    invoke-static {}, Landroidx/core/view/y0$m;->j()I

    move-result v0

    invoke-virtual {p1, v0}, Landroidx/core/view/y0;->g(I)Landroidx/core/graphics/f;

    move-result-object v0

    invoke-static {v0}, LA/X;->c(Landroidx/core/graphics/f;)LA/w;

    move-result-object v0

    invoke-virtual {p2, v0}, LA/Q;->f(LA/w;)V

    invoke-virtual {p1}, Landroidx/core/view/y0;->e()Landroidx/core/view/r;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Landroidx/core/view/r;->e()Landroidx/core/graphics/f;

    move-result-object p1

    iget-object p2, p0, LA/T;->j:LA/Q;

    invoke-static {p1}, LA/X;->c(Landroidx/core/graphics/f;)LA/w;

    move-result-object p1

    invoke-virtual {p2, p1}, LA/Q;->f(LA/w;)V

    :cond_1
    sget-object p1, Lf0/k;->e:Lf0/k$a;

    invoke-virtual {p1}, Lf0/k$a;->n()V

    return-void
.end method

.method public final h(Landroidx/core/view/y0;)V
    .locals 2

    iget-object v0, p0, LA/T;->t:LA/Q;

    invoke-static {}, Landroidx/core/view/y0$m;->c()I

    move-result v1

    invoke-virtual {p1, v1}, Landroidx/core/view/y0;->f(I)Landroidx/core/graphics/f;

    move-result-object p1

    invoke-static {p1}, LA/X;->c(Landroidx/core/graphics/f;)LA/w;

    move-result-object p1

    invoke-virtual {v0, p1}, LA/Q;->f(LA/w;)V

    return-void
.end method

.method public final i(Landroidx/core/view/y0;)V
    .locals 2

    iget-object v0, p0, LA/T;->s:LA/Q;

    invoke-static {}, Landroidx/core/view/y0$m;->c()I

    move-result v1

    invoke-virtual {p1, v1}, Landroidx/core/view/y0;->f(I)Landroidx/core/graphics/f;

    move-result-object p1

    invoke-static {p1}, LA/X;->c(Landroidx/core/graphics/f;)LA/w;

    move-result-object p1

    invoke-virtual {v0, p1}, LA/Q;->f(LA/w;)V

    return-void
.end method
