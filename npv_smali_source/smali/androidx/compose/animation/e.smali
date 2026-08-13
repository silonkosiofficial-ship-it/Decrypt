.class public final Landroidx/compose/animation/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/compose/animation/d;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/compose/animation/e$a;,
        Landroidx/compose/animation/e$b;
    }
.end annotation


# instance fields
.field private final a:Lu/s0;

.field private b:Lh0/c;

.field private c:LY0/v;

.field private final d:LV/w0;

.field private final e:Lr/K;

.field private f:LV/G1;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lu/s0;Lh0/c;LY0/v;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/compose/animation/e;->a:Lu/s0;

    iput-object p2, p0, Landroidx/compose/animation/e;->b:Lh0/c;

    iput-object p3, p0, Landroidx/compose/animation/e;->c:LY0/v;

    sget-object p1, LY0/t;->b:LY0/t$a;

    invoke-virtual {p1}, LY0/t$a;->a()J

    move-result-wide p1

    invoke-static {p1, p2}, LY0/t;->b(J)LY0/t;

    move-result-object p1

    const/4 p2, 0x0

    const/4 p3, 0x2

    invoke-static {p1, p2, p3, p2}, LV/v1;->i(Ljava/lang/Object;LV/u1;ILjava/lang/Object;)LV/w0;

    move-result-object p1

    iput-object p1, p0, Landroidx/compose/animation/e;->d:LV/w0;

    invoke-static {}, Lr/V;->d()Lr/K;

    move-result-object p1

    iput-object p1, p0, Landroidx/compose/animation/e;->e:Lr/K;

    return-void
.end method

.method private static final f(LV/w0;)Z
    .locals 0

    invoke-interface {p0}, LV/G1;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    return p0
.end method

.method private static final g(LV/w0;Z)V
    .locals 0

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {p0, p1}, LV/w0;->setValue(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public a(Lt/k;Lt/x;)Lt/k;
    .locals 0

    invoke-virtual {p1, p2}, Lt/k;->e(Lt/x;)V

    return-object p1
.end method

.method public b()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Landroidx/compose/animation/e;->a:Lu/s0;

    invoke-virtual {v0}, Lu/s0;->n()Lu/s0$b;

    move-result-object v0

    invoke-interface {v0}, Lu/s0$b;->b()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public synthetic c(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 0

    invoke-static {p0, p1, p2}, Lu/t0;->a(Lu/s0$b;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public d()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Landroidx/compose/animation/e;->a:Lu/s0;

    invoke-virtual {v0}, Lu/s0;->n()Lu/s0$b;

    move-result-object v0

    invoke-interface {v0}, Lu/s0$b;->d()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final e(Lt/k;LV/n;I)Landroidx/compose/ui/d;
    .locals 6

    .prologue
    invoke-static {}, LV/q;->H()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    const-string v1, "androidx.compose.animation.AnimatedContentTransitionScopeImpl.createSizeAnimationModifier (AnimatedContent.kt:573)"

    const v2, 0x59699de

    invoke-static {v2, p3, v0, v1}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_0
    invoke-interface {p2, p0}, LV/n;->S(Ljava/lang/Object;)Z

    move-result p3

    invoke-interface {p2}, LV/n;->g()Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x0

    if-nez p3, :cond_1

    sget-object p3, LV/n;->a:LV/n$a;

    invoke-virtual {p3}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object p3

    if-ne v0, p3, :cond_2

    :cond_1
    sget-object p3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    const/4 v0, 0x2

    invoke-static {p3, v1, v0, v1}, LV/v1;->i(Ljava/lang/Object;LV/u1;ILjava/lang/Object;)LV/w0;

    move-result-object v0

    invoke-interface {p2, v0}, LV/n;->K(Ljava/lang/Object;)V

    :cond_2
    check-cast v0, LV/w0;

    invoke-virtual {p1}, Lt/k;->b()Lt/x;

    move-result-object p1

    const/4 p3, 0x0

    invoke-static {p1, p2, p3}, LV/v1;->n(Ljava/lang/Object;LV/n;I)LV/G1;

    move-result-object p1

    iget-object v2, p0, Landroidx/compose/animation/e;->a:Lu/s0;

    invoke-virtual {v2}, Lu/s0;->i()Ljava/lang/Object;

    move-result-object v2

    iget-object v3, p0, Landroidx/compose/animation/e;->a:Lu/s0;

    invoke-virtual {v3}, Lu/s0;->p()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v2, v3}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    :goto_0
    invoke-static {v0, p3}, Landroidx/compose/animation/e;->g(LV/w0;Z)V

    goto :goto_1

    :cond_3
    invoke-interface {p1}, LV/G1;->getValue()Ljava/lang/Object;

    move-result-object p3

    if-eqz p3, :cond_4

    const/4 p3, 0x1

    goto :goto_0

    :cond_4
    :goto_1
    invoke-static {v0}, Landroidx/compose/animation/e;->f(LV/w0;)Z

    move-result p3

    if-eqz p3, :cond_8

    const p3, 0xed801fd

    invoke-interface {p2, p3}, LV/n;->T(I)V

    iget-object v0, p0, Landroidx/compose/animation/e;->a:Lu/s0;

    sget-object p3, LY0/t;->b:LY0/t$a;

    invoke-static {p3}, Lu/z0;->e(LY0/t$a;)Lu/x0;

    move-result-object v1

    const/4 v4, 0x0

    const/4 v5, 0x2

    const/4 v2, 0x0

    move-object v3, p2

    invoke-static/range {v0 .. v5}, Lu/u0;->c(Lu/s0;Lu/x0;Ljava/lang/String;LV/n;II)Lu/s0$a;

    move-result-object p3

    invoke-interface {p2, p3}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v0

    invoke-interface {p2}, LV/n;->g()Ljava/lang/Object;

    move-result-object v1

    if-nez v0, :cond_5

    sget-object v0, LV/n;->a:LV/n$a;

    invoke-virtual {v0}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object v0

    if-ne v1, v0, :cond_7

    :cond_5
    invoke-interface {p1}, LV/G1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lt/x;

    if-eqz v0, :cond_6

    invoke-interface {v0}, Lt/x;->a()Z

    move-result v0

    if-nez v0, :cond_6

    sget-object v0, Landroidx/compose/ui/d;->a:Landroidx/compose/ui/d$a;

    goto :goto_2

    :cond_6
    sget-object v0, Landroidx/compose/ui/d;->a:Landroidx/compose/ui/d$a;

    invoke-static {v0}, Ll0/e;->b(Landroidx/compose/ui/d;)Landroidx/compose/ui/d;

    move-result-object v0

    :goto_2
    new-instance v1, Landroidx/compose/animation/e$b;

    invoke-direct {v1, p0, p3, p1}, Landroidx/compose/animation/e$b;-><init>(Landroidx/compose/animation/e;Lu/s0$a;LV/G1;)V

    invoke-interface {v0, v1}, Landroidx/compose/ui/d;->b(Landroidx/compose/ui/d;)Landroidx/compose/ui/d;

    move-result-object v1

    invoke-interface {p2, v1}, LV/n;->K(Ljava/lang/Object;)V

    :cond_7
    check-cast v1, Landroidx/compose/ui/d;

    invoke-interface {p2}, LV/n;->J()V

    goto :goto_3

    :cond_8
    const p1, 0xedcd5fe

    invoke-interface {p2, p1}, LV/n;->T(I)V

    invoke-interface {p2}, LV/n;->J()V

    iput-object v1, p0, Landroidx/compose/animation/e;->f:LV/G1;

    sget-object v1, Landroidx/compose/ui/d;->a:Landroidx/compose/ui/d$a;

    :goto_3
    invoke-static {}, LV/q;->H()Z

    move-result p1

    if-eqz p1, :cond_9

    invoke-static {}, LV/q;->P()V

    :cond_9
    return-object v1
.end method

.method public h()Lh0/c;
    .locals 1

    iget-object v0, p0, Landroidx/compose/animation/e;->b:Lh0/c;

    return-object v0
.end method

.method public final i()Lr/K;
    .locals 1

    iget-object v0, p0, Landroidx/compose/animation/e;->e:Lr/K;

    return-object v0
.end method

.method public final j(LV/G1;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/animation/e;->f:LV/G1;

    return-void
.end method

.method public k(Lh0/c;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/animation/e;->b:Lh0/c;

    return-void
.end method

.method public final l(LY0/v;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/animation/e;->c:LY0/v;

    return-void
.end method

.method public final m(J)V
    .locals 1

    iget-object v0, p0, Landroidx/compose/animation/e;->d:LV/w0;

    invoke-static {p1, p2}, LY0/t;->b(J)LY0/t;

    move-result-object p1

    invoke-interface {v0, p1}, LV/w0;->setValue(Ljava/lang/Object;)V

    return-void
.end method
