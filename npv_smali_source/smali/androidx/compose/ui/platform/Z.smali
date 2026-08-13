.class public final Landroidx/compose/ui/platform/Z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LV/j0;


# instance fields
.field private final C:Landroid/view/Choreographer;

.field private final D:Landroidx/compose/ui/platform/X;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroid/view/Choreographer;Landroidx/compose/ui/platform/X;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/compose/ui/platform/Z;->C:Landroid/view/Choreographer;

    iput-object p2, p0, Landroidx/compose/ui/platform/Z;->D:Landroidx/compose/ui/platform/X;

    return-void
.end method


# virtual methods
.method public D(Ljava/lang/Object;Lx7/p;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1, p2}, LV/j0$a;->a(LV/j0;Ljava/lang/Object;Lx7/p;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public R(Lx7/l;Lm7/e;)Ljava/lang/Object;
    .locals 4

    .prologue
    iget-object v0, p0, Landroidx/compose/ui/platform/Z;->D:Landroidx/compose/ui/platform/X;

    if-nez v0, :cond_1

    invoke-interface {p2}, Lm7/e;->getContext()Lm7/i;

    move-result-object v0

    sget-object v1, Lm7/f;->A:Lm7/f$b;

    invoke-interface {v0, v1}, Lm7/i;->i(Lm7/i$c;)Lm7/i$b;

    move-result-object v0

    instance-of v1, v0, Landroidx/compose/ui/platform/X;

    if-eqz v1, :cond_0

    check-cast v0, Landroidx/compose/ui/platform/X;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :cond_1
    :goto_0
    new-instance v1, LW8/n;

    invoke-static {p2}, Ln7/b;->d(Lm7/e;)Lm7/e;

    move-result-object v2

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, LW8/n;-><init>(Lm7/e;I)V

    invoke-virtual {v1}, LW8/n;->E()V

    new-instance v2, Landroidx/compose/ui/platform/Z$c;

    invoke-direct {v2, v1, p0, p1}, Landroidx/compose/ui/platform/Z$c;-><init>(LW8/l;Landroidx/compose/ui/platform/Z;Lx7/l;)V

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Landroidx/compose/ui/platform/X;->H1()Landroid/view/Choreographer;

    move-result-object p1

    invoke-virtual {p0}, Landroidx/compose/ui/platform/Z;->a()Landroid/view/Choreographer;

    move-result-object v3

    invoke-static {p1, v3}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    invoke-virtual {v0, v2}, Landroidx/compose/ui/platform/X;->M1(Landroid/view/Choreographer$FrameCallback;)V

    new-instance p1, Landroidx/compose/ui/platform/Z$a;

    invoke-direct {p1, v0, v2}, Landroidx/compose/ui/platform/Z$a;-><init>(Landroidx/compose/ui/platform/X;Landroid/view/Choreographer$FrameCallback;)V

    :goto_1
    invoke-interface {v1, p1}, LW8/l;->G(Lx7/l;)V

    goto :goto_2

    :cond_2
    invoke-virtual {p0}, Landroidx/compose/ui/platform/Z;->a()Landroid/view/Choreographer;

    move-result-object p1

    invoke-virtual {p1, v2}, Landroid/view/Choreographer;->postFrameCallback(Landroid/view/Choreographer$FrameCallback;)V

    new-instance p1, Landroidx/compose/ui/platform/Z$b;

    invoke-direct {p1, p0, v2}, Landroidx/compose/ui/platform/Z$b;-><init>(Landroidx/compose/ui/platform/Z;Landroid/view/Choreographer$FrameCallback;)V

    goto :goto_1

    :goto_2
    invoke-virtual {v1}, LW8/n;->x()Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v0

    if-ne p1, v0, :cond_3

    invoke-static {p2}, Lo7/h;->c(Lm7/e;)V

    :cond_3
    return-object p1
.end method

.method public final a()Landroid/view/Choreographer;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/Z;->C:Landroid/view/Choreographer;

    return-object v0
.end method

.method public synthetic getKey()Lm7/i$c;
    .locals 1

    invoke-static {p0}, LV/i0;->a(LV/j0;)Lm7/i$c;

    move-result-object v0

    return-object v0
.end method

.method public i(Lm7/i$c;)Lm7/i$b;
    .locals 0

    invoke-static {p0, p1}, LV/j0$a;->b(LV/j0;Lm7/i$c;)Lm7/i$b;

    move-result-object p1

    return-object p1
.end method

.method public o0(Lm7/i;)Lm7/i;
    .locals 0

    invoke-static {p0, p1}, LV/j0$a;->d(LV/j0;Lm7/i;)Lm7/i;

    move-result-object p1

    return-object p1
.end method

.method public y0(Lm7/i$c;)Lm7/i;
    .locals 0

    invoke-static {p0, p1}, LV/j0$a;->c(LV/j0;Lm7/i$c;)Lm7/i;

    move-result-object p1

    return-object p1
.end method
