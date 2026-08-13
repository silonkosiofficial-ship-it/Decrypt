.class final LS/X0$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LS/X0;->a(LS/U0;Landroidx/compose/ui/d;Lx7/q;LV/n;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LS/U0;

.field final synthetic E:LS/U0;

.field final synthetic F:Ljava/util/List;

.field final synthetic G:LS/e0;


# direct methods
.method constructor <init>(LS/U0;LS/U0;Ljava/util/List;LS/e0;)V
    .locals 0

    iput-object p1, p0, LS/X0$a;->D:LS/U0;

    iput-object p2, p0, LS/X0$a;->E:LS/U0;

    iput-object p3, p0, LS/X0$a;->F:Ljava/util/List;

    iput-object p4, p0, LS/X0$a;->G:LS/e0;

    const/4 p1, 0x3

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lx7/p;LV/n;I)V
    .locals 37

    .prologue
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v8, p2

    and-int/lit8 v2, p3, 0x6

    if-nez v2, :cond_1

    invoke-interface {v8, v1}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x4

    goto :goto_0

    :cond_0
    const/4 v2, 0x2

    :goto_0
    or-int v2, p3, v2

    move v9, v2

    goto :goto_1

    :cond_1
    move/from16 v9, p3

    :goto_1
    and-int/lit8 v2, v9, 0x13

    const/16 v3, 0x12

    if-ne v2, v3, :cond_3

    invoke-interface/range {p2 .. p2}, LV/n;->u()Z

    move-result v2

    if-nez v2, :cond_2

    goto :goto_2

    :cond_2
    invoke-interface/range {p2 .. p2}, LV/n;->A()V

    goto/16 :goto_6

    :cond_3
    :goto_2
    invoke-static {}, LV/q;->H()Z

    move-result v2

    if-eqz v2, :cond_4

    const/4 v2, -0x1

    const-string v3, "androidx.compose.material3.FadeInFadeOutWithScale.<anonymous>.<anonymous> (SnackbarHost.kt:338)"

    const v4, -0x62a075c5

    invoke-static {v4, v9, v2, v3}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_4
    iget-object v2, v0, LS/X0$a;->D:LS/U0;

    iget-object v3, v0, LS/X0$a;->E:LS/U0;

    invoke-static {v2, v3}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    const/16 v2, 0x4b

    if-eqz v10, :cond_5

    const/16 v3, 0x96

    move v11, v3

    goto :goto_3

    :cond_5
    move v11, v2

    :goto_3
    const/4 v12, 0x1

    const/4 v13, 0x0

    if-eqz v10, :cond_6

    iget-object v3, v0, LS/X0$a;->F:Ljava/util/List;

    invoke-static {v3}, La1/a;->b(Ljava/util/List;)Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    if-eq v3, v12, :cond_6

    move v14, v2

    goto :goto_4

    :cond_6
    move v14, v13

    :goto_4
    invoke-static {}, Lu/H;->e()Lu/F;

    move-result-object v2

    invoke-static {v11, v14, v2}, Lu/k;->k(IILu/F;)Lu/w0;

    move-result-object v2

    iget-object v3, v0, LS/X0$a;->D:LS/U0;

    invoke-interface {v8, v3}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v3

    iget-object v4, v0, LS/X0$a;->G:LS/e0;

    invoke-interface {v8, v4}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v4

    or-int/2addr v3, v4

    iget-object v4, v0, LS/X0$a;->D:LS/U0;

    iget-object v5, v0, LS/X0$a;->G:LS/e0;

    invoke-interface/range {p2 .. p2}, LV/n;->g()Ljava/lang/Object;

    move-result-object v6

    if-nez v3, :cond_7

    sget-object v3, LV/n;->a:LV/n$a;

    invoke-virtual {v3}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object v3

    if-ne v6, v3, :cond_8

    :cond_7
    new-instance v6, LS/X0$a$b;

    invoke-direct {v6, v4, v5}, LS/X0$a$b;-><init>(LS/U0;LS/e0;)V

    invoke-interface {v8, v6}, LV/n;->K(Ljava/lang/Object;)V

    :cond_8
    move-object v4, v6

    check-cast v4, Lx7/a;

    const/4 v6, 0x0

    const/4 v7, 0x0

    move v3, v10

    move-object/from16 v5, p2

    invoke-static/range {v2 .. v7}, LS/X0;->d(Lu/j;ZLx7/a;LV/n;II)LV/G1;

    move-result-object v2

    invoke-static {}, Lu/H;->d()Lu/F;

    move-result-object v3

    invoke-static {v11, v14, v3}, Lu/k;->k(IILu/F;)Lu/w0;

    move-result-object v3

    invoke-static {v3, v10, v8, v13}, LS/X0;->e(Lu/j;ZLV/n;I)LV/G1;

    move-result-object v3

    sget-object v14, Landroidx/compose/ui/d;->a:Landroidx/compose/ui/d$a;

    invoke-interface {v3}, LV/G1;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->floatValue()F

    move-result v15

    invoke-interface {v3}, LV/G1;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->floatValue()F

    move-result v16

    invoke-interface {v2}, LV/G1;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    move-result v17

    const v35, 0x1fff8

    const/16 v36, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const-wide/16 v25, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const-wide/16 v30, 0x0

    const-wide/16 v32, 0x0

    const/16 v34, 0x0

    invoke-static/range {v14 .. v36}, Landroidx/compose/ui/graphics/b;->c(Landroidx/compose/ui/d;FFFFFFFFFFJLo0/e2;ZLo0/Z1;JJIILjava/lang/Object;)Landroidx/compose/ui/d;

    move-result-object v2

    iget-object v3, v0, LS/X0$a;->D:LS/U0;

    invoke-interface {v8, v3}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v3

    iget-object v4, v0, LS/X0$a;->D:LS/U0;

    invoke-interface/range {p2 .. p2}, LV/n;->g()Ljava/lang/Object;

    move-result-object v5

    if-nez v3, :cond_9

    sget-object v3, LV/n;->a:LV/n$a;

    invoke-virtual {v3}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object v3

    if-ne v5, v3, :cond_a

    :cond_9
    new-instance v5, LS/X0$a$a;

    invoke-direct {v5, v4}, LS/X0$a$a;-><init>(LS/U0;)V

    invoke-interface {v8, v5}, LV/n;->K(Ljava/lang/Object;)V

    :cond_a
    check-cast v5, Lx7/l;

    const/4 v3, 0x0

    invoke-static {v2, v13, v5, v12, v3}, LK0/n;->d(Landroidx/compose/ui/d;ZLx7/l;ILjava/lang/Object;)Landroidx/compose/ui/d;

    move-result-object v2

    sget-object v3, Lh0/c;->a:Lh0/c$a;

    invoke-virtual {v3}, Lh0/c$a;->o()Lh0/c;

    move-result-object v3

    invoke-static {v3, v13}, Landroidx/compose/foundation/layout/d;->h(Lh0/c;Z)LD0/I;

    move-result-object v3

    invoke-static {v8, v13}, LV/k;->a(LV/n;I)I

    move-result v4

    invoke-interface/range {p2 .. p2}, LV/n;->F()LV/z;

    move-result-object v5

    invoke-static {v8, v2}, Landroidx/compose/ui/c;->e(LV/n;Landroidx/compose/ui/d;)Landroidx/compose/ui/d;

    move-result-object v2

    sget-object v6, LF0/g;->a:LF0/g$a;

    invoke-virtual {v6}, LF0/g$a;->a()Lx7/a;

    move-result-object v7

    invoke-interface/range {p2 .. p2}, LV/n;->v()LV/g;

    move-result-object v10

    instance-of v10, v10, LV/g;

    if-nez v10, :cond_b

    invoke-static {}, LV/k;->c()V

    :cond_b
    invoke-interface/range {p2 .. p2}, LV/n;->t()V

    invoke-interface/range {p2 .. p2}, LV/n;->o()Z

    move-result v10

    if-eqz v10, :cond_c

    invoke-interface {v8, v7}, LV/n;->B(Lx7/a;)V

    goto :goto_5

    :cond_c
    invoke-interface/range {p2 .. p2}, LV/n;->H()V

    :goto_5
    invoke-static/range {p2 .. p2}, LV/L1;->a(LV/n;)LV/n;

    move-result-object v7

    invoke-virtual {v6}, LF0/g$a;->c()Lx7/p;

    move-result-object v10

    invoke-static {v7, v3, v10}, LV/L1;->c(LV/n;Ljava/lang/Object;Lx7/p;)V

    invoke-virtual {v6}, LF0/g$a;->e()Lx7/p;

    move-result-object v3

    invoke-static {v7, v5, v3}, LV/L1;->c(LV/n;Ljava/lang/Object;Lx7/p;)V

    invoke-virtual {v6}, LF0/g$a;->b()Lx7/p;

    move-result-object v3

    invoke-interface {v7}, LV/n;->o()Z

    move-result v5

    if-nez v5, :cond_d

    invoke-interface {v7}, LV/n;->g()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v5, v10}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_e

    :cond_d
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v7, v5}, LV/n;->K(Ljava/lang/Object;)V

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v7, v4, v3}, LV/n;->D(Ljava/lang/Object;Lx7/p;)V

    :cond_e
    invoke-virtual {v6}, LF0/g$a;->d()Lx7/p;

    move-result-object v3

    invoke-static {v7, v2, v3}, LV/L1;->c(LV/n;Ljava/lang/Object;Lx7/p;)V

    sget-object v2, Landroidx/compose/foundation/layout/f;->a:Landroidx/compose/foundation/layout/f;

    and-int/lit8 v2, v9, 0xe

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v1, v8, v2}, Lx7/p;->u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface/range {p2 .. p2}, LV/n;->Q()V

    invoke-static {}, LV/q;->H()Z

    move-result v1

    if-eqz v1, :cond_f

    invoke-static {}, LV/q;->P()V

    :cond_f
    :goto_6
    return-void
.end method

.method public bridge synthetic j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lx7/p;

    check-cast p2, LV/n;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, LS/X0$a;->a(Lx7/p;LV/n;I)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
