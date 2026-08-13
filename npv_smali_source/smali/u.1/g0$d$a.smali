.class final Lu/g0$d$a;
.super Lo7/l;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lu/g0$d;->B(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field G:Ljava/lang/Object;

.field H:Ljava/lang/Object;

.field I:I

.field final synthetic J:Lu/g0;

.field final synthetic K:Ljava/lang/Object;

.field final synthetic L:Lu/s0;

.field final synthetic M:Lu/I;


# direct methods
.method constructor <init>(Lu/g0;Ljava/lang/Object;Lu/s0;Lu/I;Lm7/e;)V
    .locals 0

    iput-object p1, p0, Lu/g0$d$a;->J:Lu/g0;

    iput-object p2, p0, Lu/g0$d$a;->K:Ljava/lang/Object;

    iput-object p3, p0, Lu/g0$d$a;->L:Lu/s0;

    iput-object p4, p0, Lu/g0$d$a;->M:Lu/I;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Lo7/l;-><init>(ILm7/e;)V

    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 18

    .prologue
    move-object/from16 v1, p0

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v2, v1, Lu/g0$d$a;->I:I

    const/4 v3, 0x5

    const/4 v4, 0x4

    const/4 v5, 0x3

    const/4 v6, 0x2

    const/4 v7, 0x1

    const-wide/16 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    if-eqz v2, :cond_5

    if-eq v2, v7, :cond_4

    if-eq v2, v6, :cond_3

    if-eq v2, v5, :cond_2

    if-eq v2, v4, :cond_1

    if-ne v2, v3, :cond_0

    invoke-static/range {p1 .. p1}, Li7/x;->b(Ljava/lang/Object;)V

    goto/16 :goto_9

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    invoke-static/range {p1 .. p1}, Li7/x;->b(Ljava/lang/Object;)V

    goto/16 :goto_8

    :cond_2
    invoke-static/range {p1 .. p1}, Li7/x;->b(Ljava/lang/Object;)V

    goto/16 :goto_2

    :cond_3
    invoke-static/range {p1 .. p1}, Li7/x;->b(Ljava/lang/Object;)V

    goto/16 :goto_1

    :cond_4
    iget-object v2, v1, Lu/g0$d$a;->H:Ljava/lang/Object;

    check-cast v2, Lu/g0;

    iget-object v7, v1, Lu/g0$d$a;->G:Ljava/lang/Object;

    check-cast v7, Lf9/a;

    invoke-static/range {p1 .. p1}, Li7/x;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_5
    invoke-static/range {p1 .. p1}, Li7/x;->b(Ljava/lang/Object;)V

    iget-object v2, v1, Lu/g0$d$a;->J:Lu/g0;

    invoke-virtual {v2}, Lu/g0;->b()Ljava/lang/Object;

    move-result-object v2

    iget-object v12, v1, Lu/g0$d$a;->K:Ljava/lang/Object;

    invoke-static {v12, v2}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_6

    iget-object v12, v1, Lu/g0$d$a;->J:Lu/g0;

    invoke-static {v12}, Lu/g0;->q(Lu/g0;)V

    iget-object v12, v1, Lu/g0$d$a;->J:Lu/g0;

    invoke-static {v12, v10}, Lu/g0;->v(Lu/g0;F)V

    iget-object v12, v1, Lu/g0$d$a;->L:Lu/s0;

    iget-object v13, v1, Lu/g0$d$a;->K:Ljava/lang/Object;

    invoke-virtual {v12, v13}, Lu/s0;->R(Ljava/lang/Object;)V

    iget-object v12, v1, Lu/g0$d$a;->L:Lu/s0;

    invoke-virtual {v12, v8, v9}, Lu/s0;->J(J)V

    iget-object v12, v1, Lu/g0$d$a;->J:Lu/g0;

    invoke-virtual {v12, v2}, Lu/g0;->d(Ljava/lang/Object;)V

    iget-object v2, v1, Lu/g0$d$a;->J:Lu/g0;

    iget-object v12, v1, Lu/g0$d$a;->K:Ljava/lang/Object;

    invoke-virtual {v2, v12}, Lu/g0;->T(Ljava/lang/Object;)V

    :cond_6
    iget-object v2, v1, Lu/g0$d$a;->J:Lu/g0;

    invoke-virtual {v2}, Lu/g0;->G()Lf9/a;

    move-result-object v2

    iget-object v12, v1, Lu/g0$d$a;->J:Lu/g0;

    iput-object v2, v1, Lu/g0$d$a;->G:Ljava/lang/Object;

    iput-object v12, v1, Lu/g0$d$a;->H:Ljava/lang/Object;

    iput v7, v1, Lu/g0$d$a;->I:I

    invoke-interface {v2, v11, v1}, Lf9/a;->c(Ljava/lang/Object;Lm7/e;)Ljava/lang/Object;

    move-result-object v7

    if-ne v7, v0, :cond_7

    return-object v0

    :cond_7
    move-object v7, v2

    move-object v2, v12

    :goto_0
    :try_start_0
    invoke-virtual {v2}, Lu/g0;->E()Ljava/lang/Object;

    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {v7, v11}, Lf9/a;->d(Ljava/lang/Object;)V

    iget-object v7, v1, Lu/g0$d$a;->K:Ljava/lang/Object;

    invoke-static {v7, v2}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_9

    iget-object v2, v1, Lu/g0$d$a;->J:Lu/g0;

    iput-object v11, v1, Lu/g0$d$a;->G:Ljava/lang/Object;

    iput-object v11, v1, Lu/g0$d$a;->H:Ljava/lang/Object;

    iput v6, v1, Lu/g0$d$a;->I:I

    invoke-static {v2, v1}, Lu/g0;->h(Lu/g0;Lm7/e;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v0, :cond_8

    return-object v0

    :cond_8
    :goto_1
    iget-object v2, v1, Lu/g0$d$a;->J:Lu/g0;

    iput v5, v1, Lu/g0$d$a;->I:I

    invoke-static {v2, v1}, Lu/g0;->y(Lu/g0;Lm7/e;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v0, :cond_9

    return-object v0

    :cond_9
    :goto_2
    iget-object v2, v1, Lu/g0$d$a;->J:Lu/g0;

    invoke-virtual {v2}, Lu/g0;->a()Ljava/lang/Object;

    move-result-object v2

    iget-object v5, v1, Lu/g0$d$a;->K:Ljava/lang/Object;

    invoke-static {v2, v5}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_18

    iget-object v2, v1, Lu/g0$d$a;->J:Lu/g0;

    invoke-virtual {v2}, Lu/g0;->H()F

    move-result v2

    const/high16 v5, 0x3f800000    # 1.0f

    cmpg-float v2, v2, v5

    if-gez v2, :cond_15

    iget-object v2, v1, Lu/g0$d$a;->J:Lu/g0;

    invoke-static {v2}, Lu/g0;->j(Lu/g0;)Lu/g0$b;

    move-result-object v2

    iget-object v6, v1, Lu/g0$d$a;->M:Lu/I;

    if-eqz v6, :cond_a

    sget-object v7, Ly7/m;->a:Ly7/m;

    invoke-static {v7}, Lu/z0;->i(Ly7/m;)Lu/x0;

    move-result-object v7

    invoke-interface {v6, v7}, Lu/I;->a(Lu/x0;)Lu/H0;

    move-result-object v6

    goto :goto_3

    :cond_a
    move-object v6, v11

    :goto_3
    if-eqz v2, :cond_b

    invoke-virtual {v2}, Lu/g0$b;->a()Lu/B0;

    move-result-object v7

    invoke-static {v6, v7}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_15

    :cond_b
    if-eqz v2, :cond_c

    invoke-virtual {v2}, Lu/g0$b;->a()Lu/B0;

    move-result-object v7

    move-object v12, v7

    goto :goto_4

    :cond_c
    move-object v12, v11

    :goto_4
    if-eqz v12, :cond_e

    invoke-virtual {v2}, Lu/g0$b;->e()J

    move-result-wide v13

    invoke-virtual {v2}, Lu/g0$b;->f()Lu/n;

    move-result-object v15

    invoke-static {}, Lu/g0;->i()Lu/g0$a;

    move-result-object v5

    invoke-virtual {v5}, Lu/g0$a;->a()Lu/n;

    move-result-object v16

    invoke-virtual {v2}, Lu/g0$b;->d()Lu/n;

    move-result-object v5

    if-nez v5, :cond_d

    invoke-static {}, Lu/g0;->i()Lu/g0$a;

    move-result-object v5

    invoke-virtual {v5}, Lu/g0$a;->b()Lu/n;

    move-result-object v5

    :cond_d
    move-object/from16 v17, v5

    invoke-interface/range {v12 .. v17}, Lu/B0;->b(JLu/r;Lu/r;Lu/r;)Lu/r;

    move-result-object v5

    check-cast v5, Lu/n;

    goto :goto_6

    :cond_e
    if-eqz v2, :cond_11

    invoke-virtual {v2}, Lu/g0$b;->e()J

    move-result-wide v12

    cmp-long v7, v12, v8

    if-nez v7, :cond_f

    goto :goto_5

    :cond_f
    invoke-virtual {v2}, Lu/g0$b;->c()J

    move-result-wide v12

    const-wide/high16 v14, -0x8000000000000000L

    cmp-long v7, v12, v14

    if-nez v7, :cond_10

    iget-object v7, v1, Lu/g0$d$a;->J:Lu/g0;

    invoke-virtual {v7}, Lu/g0;->I()J

    move-result-wide v12

    :cond_10
    long-to-float v7, v12

    const v12, 0x4e6e6b28    # 1.0E9f

    div-float/2addr v7, v12

    cmpg-float v12, v7, v10

    if-gtz v12, :cond_12

    :cond_11
    :goto_5
    invoke-static {}, Lu/g0;->i()Lu/g0$a;

    move-result-object v5

    invoke-virtual {v5}, Lu/g0$a;->b()Lu/n;

    move-result-object v5

    goto :goto_6

    :cond_12
    new-instance v12, Lu/n;

    div-float/2addr v5, v7

    invoke-direct {v12, v5}, Lu/n;-><init>(F)V

    move-object v5, v12

    :goto_6
    if-nez v2, :cond_13

    new-instance v2, Lu/g0$b;

    invoke-direct {v2}, Lu/g0$b;-><init>()V

    :cond_13
    invoke-virtual {v2, v6}, Lu/g0$b;->i(Lu/B0;)V

    const/4 v7, 0x0

    invoke-virtual {v2, v7}, Lu/g0$b;->k(Z)V

    iget-object v12, v1, Lu/g0$d$a;->J:Lu/g0;

    invoke-virtual {v12}, Lu/g0;->H()F

    move-result v12

    invoke-virtual {v2, v12}, Lu/g0$b;->o(F)V

    invoke-virtual {v2}, Lu/g0$b;->f()Lu/n;

    move-result-object v12

    iget-object v13, v1, Lu/g0$d$a;->J:Lu/g0;

    invoke-virtual {v13}, Lu/g0;->H()F

    move-result v13

    invoke-virtual {v12, v7, v13}, Lu/n;->e(IF)V

    iget-object v7, v1, Lu/g0$d$a;->J:Lu/g0;

    invoke-virtual {v7}, Lu/g0;->I()J

    move-result-wide v12

    invoke-virtual {v2, v12, v13}, Lu/g0$b;->l(J)V

    invoke-virtual {v2, v8, v9}, Lu/g0$b;->n(J)V

    invoke-virtual {v2, v5}, Lu/g0$b;->m(Lu/n;)V

    if-eqz v6, :cond_14

    invoke-virtual {v2}, Lu/g0$b;->f()Lu/n;

    move-result-object v7

    invoke-static {}, Lu/g0;->i()Lu/g0$a;

    move-result-object v8

    invoke-virtual {v8}, Lu/g0$a;->a()Lu/n;

    move-result-object v8

    invoke-interface {v6, v7, v8, v5}, Lu/B0;->e(Lu/r;Lu/r;Lu/r;)J

    move-result-wide v5

    goto :goto_7

    :cond_14
    iget-object v5, v1, Lu/g0$d$a;->J:Lu/g0;

    invoke-virtual {v5}, Lu/g0;->I()J

    move-result-wide v5

    long-to-double v5, v5

    iget-object v7, v1, Lu/g0$d$a;->J:Lu/g0;

    invoke-virtual {v7}, Lu/g0;->H()F

    move-result v7

    float-to-double v7, v7

    const-wide/high16 v12, 0x3ff0000000000000L    # 1.0

    sub-double/2addr v12, v7

    mul-double/2addr v5, v12

    invoke-static {v5, v6}, LA7/a;->e(D)J

    move-result-wide v5

    :goto_7
    invoke-virtual {v2, v5, v6}, Lu/g0$b;->j(J)V

    iget-object v5, v1, Lu/g0$d$a;->J:Lu/g0;

    invoke-static {v5, v2}, Lu/g0;->u(Lu/g0;Lu/g0$b;)V

    :cond_15
    iget-object v2, v1, Lu/g0$d$a;->J:Lu/g0;

    iput-object v11, v1, Lu/g0$d$a;->G:Ljava/lang/Object;

    iput-object v11, v1, Lu/g0$d$a;->H:Ljava/lang/Object;

    iput v4, v1, Lu/g0$d$a;->I:I

    invoke-static {v2, v1}, Lu/g0;->s(Lu/g0;Lm7/e;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v0, :cond_16

    return-object v0

    :cond_16
    :goto_8
    iget-object v2, v1, Lu/g0$d$a;->J:Lu/g0;

    iget-object v4, v1, Lu/g0$d$a;->K:Ljava/lang/Object;

    invoke-virtual {v2, v4}, Lu/g0;->d(Ljava/lang/Object;)V

    iget-object v2, v1, Lu/g0$d$a;->J:Lu/g0;

    iput v3, v1, Lu/g0$d$a;->I:I

    invoke-static {v2, v1}, Lu/g0;->x(Lu/g0;Lm7/e;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v0, :cond_17

    return-object v0

    :cond_17
    :goto_9
    iget-object v0, v1, Lu/g0$d$a;->J:Lu/g0;

    invoke-static {v0, v10}, Lu/g0;->v(Lu/g0;F)V

    :cond_18
    sget-object v0, Li7/M;->a:Li7/M;

    return-object v0

    :catchall_0
    move-exception v0

    move-object v2, v0

    invoke-interface {v7, v11}, Lf9/a;->d(Ljava/lang/Object;)V

    throw v2
.end method

.method public final H(LW8/N;Lm7/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lu/g0$d$a;->x(Ljava/lang/Object;Lm7/e;)Lm7/e;

    move-result-object p1

    check-cast p1, Lu/g0$d$a;

    sget-object p2, Li7/M;->a:Li7/M;

    invoke-virtual {p1, p2}, Lu/g0$d$a;->B(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LW8/N;

    check-cast p2, Lm7/e;

    invoke-virtual {p0, p1, p2}, Lu/g0$d$a;->H(LW8/N;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final x(Ljava/lang/Object;Lm7/e;)Lm7/e;
    .locals 6

    new-instance p1, Lu/g0$d$a;

    iget-object v1, p0, Lu/g0$d$a;->J:Lu/g0;

    iget-object v2, p0, Lu/g0$d$a;->K:Ljava/lang/Object;

    iget-object v3, p0, Lu/g0$d$a;->L:Lu/s0;

    iget-object v4, p0, Lu/g0$d$a;->M:Lu/I;

    move-object v0, p1

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lu/g0$d$a;-><init>(Lu/g0;Ljava/lang/Object;Lu/s0;Lu/I;Lm7/e;)V

    return-object p1
.end method
