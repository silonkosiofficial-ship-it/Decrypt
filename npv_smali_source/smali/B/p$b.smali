.class final LB/p$b;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LB/p;->b(Lx7/a;LB/D;LA/B;ZZILh0/c$b;Lh0/c$c;LA/b$e;LA/b$m;LW8/N;Lo0/C1;ZLV/n;II)Lx7/p;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LB/D;

.field final synthetic E:Z

.field final synthetic F:LA/B;

.field final synthetic G:Z

.field final synthetic H:Lx7/a;

.field final synthetic I:LA/b$m;

.field final synthetic J:LA/b$e;

.field final synthetic K:Z

.field final synthetic L:I

.field final synthetic M:LW8/N;

.field final synthetic N:Lo0/C1;

.field final synthetic O:Lh0/c$b;

.field final synthetic P:Lh0/c$c;


# direct methods
.method constructor <init>(LB/D;ZLA/B;ZLx7/a;LA/b$m;LA/b$e;ZILW8/N;Lo0/C1;Lh0/c$b;Lh0/c$c;)V
    .locals 0

    iput-object p1, p0, LB/p$b;->D:LB/D;

    iput-boolean p2, p0, LB/p$b;->E:Z

    iput-object p3, p0, LB/p$b;->F:LA/B;

    iput-boolean p4, p0, LB/p$b;->G:Z

    iput-object p5, p0, LB/p$b;->H:Lx7/a;

    iput-object p6, p0, LB/p$b;->I:LA/b$m;

    iput-object p7, p0, LB/p$b;->J:LA/b$e;

    iput-boolean p8, p0, LB/p$b;->K:Z

    iput p9, p0, LB/p$b;->L:I

    iput-object p10, p0, LB/p$b;->M:LW8/N;

    iput-object p11, p0, LB/p$b;->N:Lo0/C1;

    iput-object p12, p0, LB/p$b;->O:Lh0/c$b;

    iput-object p13, p0, LB/p$b;->P:Lh0/c$c;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LD/w;J)LB/s;
    .locals 42

    .prologue
    move-object/from16 v1, p0

    move-object/from16 v0, p1

    move-wide/from16 v14, p2

    iget-object v2, v1, LB/p$b;->D:LB/D;

    invoke-virtual {v2}, LB/D;->x()LV/w0;

    move-result-object v2

    invoke-static {v2}, LD/L;->a(LV/w0;)V

    iget-object v2, v1, LB/p$b;->D:LB/D;

    invoke-virtual {v2}, LB/D;->t()Z

    move-result v2

    if-nez v2, :cond_1

    invoke-interface/range {p1 .. p1}, LD0/o;->A0()Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_1

    :cond_0
    const/4 v2, 0x0

    :goto_0
    move/from16 v28, v2

    goto :goto_2

    :cond_1
    :goto_1
    const/4 v2, 0x1

    goto :goto_0

    :goto_2
    iget-boolean v2, v1, LB/p$b;->E:Z

    if-eqz v2, :cond_2

    sget-object v2, Lx/s;->C:Lx/s;

    goto :goto_3

    :cond_2
    sget-object v2, Lx/s;->D:Lx/s;

    :goto_3
    invoke-static {v14, v15, v2}, Lv/j;->a(JLx/s;)V

    iget-boolean v2, v1, LB/p$b;->E:Z

    if-eqz v2, :cond_3

    iget-object v2, v1, LB/p$b;->F:LA/B;

    invoke-interface/range {p1 .. p1}, LD0/o;->getLayoutDirection()LY0/v;

    move-result-object v3

    invoke-interface {v2, v3}, LA/B;->a(LY0/v;)F

    move-result v2

    :goto_4
    invoke-interface {v0, v2}, LY0/e;->S0(F)I

    move-result v2

    goto :goto_5

    :cond_3
    iget-object v2, v1, LB/p$b;->F:LA/B;

    invoke-interface/range {p1 .. p1}, LD0/o;->getLayoutDirection()LY0/v;

    move-result-object v3

    invoke-static {v2, v3}, Landroidx/compose/foundation/layout/m;->g(LA/B;LY0/v;)F

    move-result v2

    goto :goto_4

    :goto_5
    iget-boolean v3, v1, LB/p$b;->E:Z

    if-eqz v3, :cond_4

    iget-object v3, v1, LB/p$b;->F:LA/B;

    invoke-interface/range {p1 .. p1}, LD0/o;->getLayoutDirection()LY0/v;

    move-result-object v4

    invoke-interface {v3, v4}, LA/B;->b(LY0/v;)F

    move-result v3

    :goto_6
    invoke-interface {v0, v3}, LY0/e;->S0(F)I

    move-result v3

    goto :goto_7

    :cond_4
    iget-object v3, v1, LB/p$b;->F:LA/B;

    invoke-interface/range {p1 .. p1}, LD0/o;->getLayoutDirection()LY0/v;

    move-result-object v4

    invoke-static {v3, v4}, Landroidx/compose/foundation/layout/m;->f(LA/B;LY0/v;)F

    move-result v3

    goto :goto_6

    :goto_7
    iget-object v4, v1, LB/p$b;->F:LA/B;

    invoke-interface {v4}, LA/B;->d()F

    move-result v4

    invoke-interface {v0, v4}, LY0/e;->S0(F)I

    move-result v4

    iget-object v5, v1, LB/p$b;->F:LA/B;

    invoke-interface {v5}, LA/B;->c()F

    move-result v5

    invoke-interface {v0, v5}, LY0/e;->S0(F)I

    move-result v5

    add-int v13, v4, v5

    add-int v12, v2, v3

    iget-boolean v6, v1, LB/p$b;->E:Z

    if-eqz v6, :cond_5

    move v7, v13

    goto :goto_8

    :cond_5
    move v7, v12

    :goto_8
    if-eqz v6, :cond_6

    iget-boolean v8, v1, LB/p$b;->G:Z

    if-nez v8, :cond_6

    move/from16 v18, v4

    goto :goto_9

    :cond_6
    if-eqz v6, :cond_7

    iget-boolean v8, v1, LB/p$b;->G:Z

    if-eqz v8, :cond_7

    move/from16 v18, v5

    goto :goto_9

    :cond_7
    if-nez v6, :cond_8

    iget-boolean v5, v1, LB/p$b;->G:Z

    if-nez v5, :cond_8

    move/from16 v18, v2

    goto :goto_9

    :cond_8
    move/from16 v18, v3

    :goto_9
    sub-int v20, v7, v18

    neg-int v3, v12

    neg-int v5, v13

    invoke-static {v14, v15, v3, v5}, LY0/c;->n(JII)J

    move-result-wide v35

    iget-object v3, v1, LB/p$b;->H:Lx7/a;

    invoke-interface {v3}, Lx7/a;->b()Ljava/lang/Object;

    move-result-object v3

    move-object v11, v3

    check-cast v11, LB/m;

    invoke-interface {v11}, LB/m;->f()Landroidx/compose/foundation/lazy/a;

    move-result-object v3

    invoke-static/range {v35 .. v36}, LY0/b;->l(J)I

    move-result v5

    invoke-static/range {v35 .. v36}, LY0/b;->k(J)I

    move-result v6

    invoke-virtual {v3, v5, v6}, Landroidx/compose/foundation/lazy/a;->b(II)V

    iget-boolean v3, v1, LB/p$b;->E:Z

    if-eqz v3, :cond_a

    iget-object v3, v1, LB/p$b;->I:LA/b$m;

    if-eqz v3, :cond_9

    invoke-interface {v3}, LA/b$m;->a()F

    move-result v3

    goto :goto_a

    :cond_9
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v2, "null verticalArrangement when isVertical == true"

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_a
    iget-object v3, v1, LB/p$b;->J:LA/b$e;

    if-eqz v3, :cond_13

    invoke-interface {v3}, LA/b$e;->a()F

    move-result v3

    :goto_a
    invoke-interface {v0, v3}, LY0/e;->S0(F)I

    move-result v24

    invoke-interface {v11}, LD/s;->a()I

    move-result v27

    iget-boolean v3, v1, LB/p$b;->E:Z

    if-eqz v3, :cond_b

    invoke-static/range {p2 .. p3}, LY0/b;->k(J)I

    move-result v3

    sub-int/2addr v3, v13

    :goto_b
    move/from16 v37, v3

    goto :goto_c

    :cond_b
    invoke-static/range {p2 .. p3}, LY0/b;->l(J)I

    move-result v3

    sub-int/2addr v3, v12

    goto :goto_b

    :goto_c
    iget-boolean v3, v1, LB/p$b;->G:Z

    if-eqz v3, :cond_e

    if-lez v37, :cond_c

    goto :goto_e

    :cond_c
    iget-boolean v3, v1, LB/p$b;->E:Z

    if-eqz v3, :cond_d

    goto :goto_d

    :cond_d
    add-int v2, v2, v37

    :goto_d
    if-eqz v3, :cond_e

    add-int v4, v4, v37

    :cond_e
    :goto_e
    invoke-static {v2, v4}, LY0/q;->a(II)J

    move-result-wide v2

    move-wide/from16 v16, v2

    new-instance v38, LB/p$b$b;

    iget-boolean v5, v1, LB/p$b;->E:Z

    iget-object v10, v1, LB/p$b;->O:Lh0/c$b;

    iget-object v9, v1, LB/p$b;->P:Lh0/c$c;

    iget-boolean v8, v1, LB/p$b;->G:Z

    iget-object v7, v1, LB/p$b;->D:LB/D;

    move-object/from16 v2, v38

    move-wide/from16 v3, v35

    move-object v6, v11

    move-object/from16 v19, v7

    move-object/from16 v7, p1

    move/from16 v21, v8

    move/from16 v8, v27

    move-object/from16 v22, v9

    move/from16 v9, v24

    move-object v0, v11

    move-object/from16 v11, v22

    move/from16 v39, v12

    move/from16 v12, v21

    move/from16 v40, v13

    move/from16 v13, v18

    move/from16 v14, v20

    move-wide/from16 v15, v16

    move-object/from16 v17, v19

    invoke-direct/range {v2 .. v17}, LB/p$b$b;-><init>(JZLB/m;LD/w;IILh0/c$b;Lh0/c$c;ZIIJLB/D;)V

    sget-object v2, Lf0/k;->e:Lf0/k$a;

    iget-object v3, v1, LB/p$b;->D:LB/D;

    invoke-virtual {v2}, Lf0/k$a;->d()Lf0/k;

    move-result-object v4

    if-eqz v4, :cond_f

    invoke-virtual {v4}, Lf0/k;->h()Lx7/l;

    move-result-object v5

    goto :goto_f

    :cond_f
    const/4 v5, 0x0

    :goto_f
    invoke-virtual {v2, v4}, Lf0/k$a;->f(Lf0/k;)Lf0/k;

    move-result-object v6

    :try_start_0
    invoke-virtual {v3}, LB/D;->r()I

    move-result v7

    invoke-virtual {v3, v0, v7}, LB/D;->P(LB/m;I)I

    move-result v14

    invoke-virtual {v3}, LB/D;->s()I

    move-result v15

    sget-object v3, Li7/M;->a:Li7/M;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v2, v4, v6, v5}, Lf0/k$a;->m(Lf0/k;Lf0/k;Lx7/l;)V

    iget-object v2, v1, LB/p$b;->D:LB/D;

    invoke-virtual {v2}, LB/D;->z()LD/D;

    move-result-object v2

    iget-object v3, v1, LB/p$b;->D:LB/D;

    invoke-virtual {v3}, LB/D;->p()LD/j;

    move-result-object v3

    invoke-static {v0, v2, v3}, LD/n;->a(LD/s;LD/D;LD/j;)Ljava/util/List;

    move-result-object v41

    invoke-interface/range {p1 .. p1}, LD0/o;->A0()Z

    move-result v2

    if-nez v2, :cond_11

    if-nez v28, :cond_10

    goto :goto_11

    :cond_10
    iget-object v2, v1, LB/p$b;->D:LB/D;

    invoke-virtual {v2}, LB/D;->F()F

    move-result v2

    :goto_10
    move/from16 v16, v2

    goto :goto_12

    :cond_11
    :goto_11
    iget-object v2, v1, LB/p$b;->D:LB/D;

    invoke-virtual {v2}, LB/D;->G()F

    move-result v2

    goto :goto_10

    :goto_12
    iget-boolean v2, v1, LB/p$b;->K:Z

    if-eqz v2, :cond_12

    invoke-interface {v0}, LB/m;->h()Ljava/util/List;

    move-result-object v0

    goto :goto_13

    :cond_12
    invoke-static {}, Lj7/v;->m()Ljava/util/List;

    move-result-object v0

    :goto_13
    iget-boolean v2, v1, LB/p$b;->E:Z

    move/from16 v19, v2

    iget-object v2, v1, LB/p$b;->I:LA/b$m;

    move-object/from16 v21, v2

    iget-object v2, v1, LB/p$b;->J:LA/b$e;

    move-object/from16 v22, v2

    iget-boolean v2, v1, LB/p$b;->G:Z

    move/from16 v23, v2

    iget-object v2, v1, LB/p$b;->D:LB/D;

    invoke-virtual {v2}, LB/D;->v()Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;

    move-result-object v25

    iget v2, v1, LB/p$b;->L:I

    move/from16 v26, v2

    invoke-interface/range {p1 .. p1}, LD0/o;->A0()Z

    move-result v29

    iget-object v2, v1, LB/p$b;->D:LB/D;

    invoke-virtual {v2}, LB/D;->B()LB/s;

    move-result-object v30

    iget-object v2, v1, LB/p$b;->M:LW8/N;

    move-object/from16 v31, v2

    iget-object v2, v1, LB/p$b;->D:LB/D;

    invoke-virtual {v2}, LB/D;->A()LV/w0;

    move-result-object v32

    iget-object v2, v1, LB/p$b;->N:Lo0/C1;

    move-object/from16 v33, v2

    new-instance v2, LB/p$b$a;

    move-object/from16 v34, v2

    move-object/from16 v3, p1

    move-wide/from16 v4, p2

    move/from16 v6, v39

    move/from16 v7, v40

    invoke-direct/range {v2 .. v7}, LB/p$b$a;-><init>(LD/w;JII)V

    move/from16 v8, v27

    move-object/from16 v9, v38

    move/from16 v10, v37

    move/from16 v11, v18

    move/from16 v12, v20

    move/from16 v13, v24

    move-wide/from16 v17, v35

    move-object/from16 v20, v0

    move-object/from16 v24, p1

    move-object/from16 v27, v41

    invoke-static/range {v8 .. v34}, LB/r;->e(ILB/u;IIIIIIFJZLjava/util/List;LA/b$m;LA/b$e;ZLY0/e;Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;ILjava/util/List;ZZLB/q;LW8/N;LV/w0;Lo0/C1;Lx7/q;)LB/s;

    move-result-object v0

    iget-object v3, v1, LB/p$b;->D:LB/D;

    invoke-interface/range {p1 .. p1}, LD0/o;->A0()Z

    move-result v5

    const/4 v7, 0x4

    const/4 v8, 0x0

    const/4 v6, 0x0

    move-object v4, v0

    invoke-static/range {v3 .. v8}, LB/D;->n(LB/D;LB/s;ZZILjava/lang/Object;)V

    return-object v0

    :catchall_0
    move-exception v0

    invoke-virtual {v2, v4, v6, v5}, Lf0/k$a;->m(Lf0/k;Lf0/k;Lx7/l;)V

    throw v0

    :cond_13
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v2, "null horizontalAlignment when isVertical == false"

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, LD/w;

    check-cast p2, LY0/b;

    invoke-virtual {p2}, LY0/b;->r()J

    move-result-wide v0

    invoke-virtual {p0, p1, v0, v1}, LB/p$b;->a(LD/w;J)LB/s;

    move-result-object p1

    return-object p1
.end method
