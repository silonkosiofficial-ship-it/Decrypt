.class final Lt/l$d;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lt/l;->b(Lu/s0;Landroidx/compose/ui/d;Lu/I;Lx7/l;Lx7/q;LV/n;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Lu/s0;

.field final synthetic E:Lu/I;

.field final synthetic F:Ljava/lang/Object;

.field final synthetic G:Lx7/q;


# direct methods
.method constructor <init>(Lu/s0;Lu/I;Ljava/lang/Object;Lx7/q;)V
    .locals 0

    iput-object p1, p0, Lt/l$d;->D:Lu/s0;

    iput-object p2, p0, Lt/l$d;->E:Lu/I;

    iput-object p3, p0, Lt/l$d;->F:Ljava/lang/Object;

    iput-object p4, p0, Lt/l$d;->G:Lx7/q;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method

.method public static final synthetic a(LV/G1;)F
    .locals 0

    invoke-static {p0}, Lt/l$d;->f(LV/G1;)F

    move-result p0

    return p0
.end method

.method private static final f(LV/G1;)F
    .locals 0

    invoke-interface {p0}, LV/G1;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Number;

    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    move-result p0

    return p0
.end method


# virtual methods
.method public final e(LV/n;I)V
    .locals 12

    .prologue
    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    invoke-interface {p1}, LV/n;->u()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p1}, LV/n;->A()V

    goto/16 :goto_3

    :cond_1
    :goto_0
    invoke-static {}, LV/q;->H()Z

    move-result v0

    const/4 v1, -0x1

    if-eqz v0, :cond_2

    const v0, -0x55057628

    const-string v2, "androidx.compose.animation.Crossfade.<anonymous>.<anonymous> (Crossfade.kt:127)"

    invoke-static {v0, p2, v1, v2}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_2
    iget-object v3, p0, Lt/l$d;->D:Lu/s0;

    new-instance p2, Lt/l$d$b;

    iget-object v0, p0, Lt/l$d;->E:Lu/I;

    invoke-direct {p2, v0}, Lt/l$d$b;-><init>(Lu/I;)V

    iget-object v0, p0, Lt/l$d;->F:Ljava/lang/Object;

    sget-object v2, Ly7/m;->a:Ly7/m;

    invoke-static {v2}, Lu/z0;->i(Ly7/m;)Lu/x0;

    move-result-object v7

    invoke-virtual {v3}, Lu/s0;->i()Ljava/lang/Object;

    move-result-object v2

    const v4, -0x1a25b2ec

    invoke-interface {p1, v4}, LV/n;->T(I)V

    invoke-static {}, LV/q;->H()Z

    move-result v5

    const-string v6, "androidx.compose.animation.Crossfade.<anonymous>.<anonymous>.<anonymous> (Crossfade.kt:129)"

    const/4 v11, 0x0

    if-eqz v5, :cond_3

    invoke-static {v4, v11, v1, v6}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_3
    invoke-static {v2, v0}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    const/4 v5, 0x0

    const/high16 v8, 0x3f800000    # 1.0f

    if-eqz v2, :cond_4

    move v2, v8

    goto :goto_1

    :cond_4
    move v2, v5

    :goto_1
    invoke-static {}, LV/q;->H()Z

    move-result v9

    if-eqz v9, :cond_5

    invoke-static {}, LV/q;->P()V

    :cond_5
    invoke-interface {p1}, LV/n;->J()V

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    invoke-virtual {v3}, Lu/s0;->p()Ljava/lang/Object;

    move-result-object v9

    invoke-interface {p1, v4}, LV/n;->T(I)V

    invoke-static {}, LV/q;->H()Z

    move-result v10

    if-eqz v10, :cond_6

    invoke-static {v4, v11, v1, v6}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_6
    invoke-static {v9, v0}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    move v5, v8

    :cond_7
    invoke-static {}, LV/q;->H()Z

    move-result v0

    if-eqz v0, :cond_8

    invoke-static {}, LV/q;->P()V

    :cond_8
    invoke-interface {p1}, LV/n;->J()V

    invoke-static {v5}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v5

    invoke-virtual {v3}, Lu/s0;->n()Lu/s0$b;

    move-result-object v0

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p2, v0, p1, v1}, Lx7/q;->j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    move-object v6, p2

    check-cast v6, Lu/I;

    const/4 v10, 0x0

    const-string v8, "FloatAnimation"

    move-object v4, v2

    move-object v9, p1

    invoke-static/range {v3 .. v10}, Lu/u0;->d(Lu/s0;Ljava/lang/Object;Ljava/lang/Object;Lu/I;Lu/x0;Ljava/lang/String;LV/n;I)LV/G1;

    move-result-object p2

    sget-object v0, Landroidx/compose/ui/d;->a:Landroidx/compose/ui/d$a;

    invoke-interface {p1, p2}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v1

    invoke-interface {p1}, LV/n;->g()Ljava/lang/Object;

    move-result-object v2

    if-nez v1, :cond_9

    sget-object v1, LV/n;->a:LV/n$a;

    invoke-virtual {v1}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object v1

    if-ne v2, v1, :cond_a

    :cond_9
    new-instance v2, Lt/l$d$a;

    invoke-direct {v2, p2}, Lt/l$d$a;-><init>(LV/G1;)V

    invoke-interface {p1, v2}, LV/n;->K(Ljava/lang/Object;)V

    :cond_a
    check-cast v2, Lx7/l;

    invoke-static {v0, v2}, Landroidx/compose/ui/graphics/b;->a(Landroidx/compose/ui/d;Lx7/l;)Landroidx/compose/ui/d;

    move-result-object p2

    iget-object v0, p0, Lt/l$d;->G:Lx7/q;

    iget-object v1, p0, Lt/l$d;->F:Ljava/lang/Object;

    sget-object v2, Lh0/c;->a:Lh0/c$a;

    invoke-virtual {v2}, Lh0/c$a;->o()Lh0/c;

    move-result-object v2

    invoke-static {v2, v11}, Landroidx/compose/foundation/layout/d;->h(Lh0/c;Z)LD0/I;

    move-result-object v2

    invoke-static {p1, v11}, LV/k;->a(LV/n;I)I

    move-result v3

    invoke-interface {p1}, LV/n;->F()LV/z;

    move-result-object v4

    invoke-static {p1, p2}, Landroidx/compose/ui/c;->e(LV/n;Landroidx/compose/ui/d;)Landroidx/compose/ui/d;

    move-result-object p2

    sget-object v5, LF0/g;->a:LF0/g$a;

    invoke-virtual {v5}, LF0/g$a;->a()Lx7/a;

    move-result-object v6

    invoke-interface {p1}, LV/n;->v()LV/g;

    move-result-object v7

    instance-of v7, v7, LV/g;

    if-nez v7, :cond_b

    invoke-static {}, LV/k;->c()V

    :cond_b
    invoke-interface {p1}, LV/n;->t()V

    invoke-interface {p1}, LV/n;->o()Z

    move-result v7

    if-eqz v7, :cond_c

    invoke-interface {p1, v6}, LV/n;->B(Lx7/a;)V

    goto :goto_2

    :cond_c
    invoke-interface {p1}, LV/n;->H()V

    :goto_2
    invoke-static {p1}, LV/L1;->a(LV/n;)LV/n;

    move-result-object v6

    invoke-virtual {v5}, LF0/g$a;->c()Lx7/p;

    move-result-object v7

    invoke-static {v6, v2, v7}, LV/L1;->c(LV/n;Ljava/lang/Object;Lx7/p;)V

    invoke-virtual {v5}, LF0/g$a;->e()Lx7/p;

    move-result-object v2

    invoke-static {v6, v4, v2}, LV/L1;->c(LV/n;Ljava/lang/Object;Lx7/p;)V

    invoke-virtual {v5}, LF0/g$a;->b()Lx7/p;

    move-result-object v2

    invoke-interface {v6}, LV/n;->o()Z

    move-result v4

    if-nez v4, :cond_d

    invoke-interface {v6}, LV/n;->g()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v4, v7}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_e

    :cond_d
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v6, v4}, LV/n;->K(Ljava/lang/Object;)V

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v6, v3, v2}, LV/n;->D(Ljava/lang/Object;Lx7/p;)V

    :cond_e
    invoke-virtual {v5}, LF0/g$a;->d()Lx7/p;

    move-result-object v2

    invoke-static {v6, p2, v2}, LV/L1;->c(LV/n;Ljava/lang/Object;Lx7/p;)V

    sget-object p2, Landroidx/compose/foundation/layout/f;->a:Landroidx/compose/foundation/layout/f;

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-interface {v0, v1, p1, p2}, Lx7/q;->j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {p1}, LV/n;->Q()V

    invoke-static {}, LV/q;->H()Z

    move-result p1

    if-eqz p1, :cond_f

    invoke-static {}, LV/q;->P()V

    :cond_f
    :goto_3
    return-void
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LV/n;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lt/l$d;->e(LV/n;I)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
