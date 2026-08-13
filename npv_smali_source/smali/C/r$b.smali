.class final LC/r$b;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LC/r;->b(Lx7/a;LC/K;LC/H;LA/B;ZZLA/b$e;LA/b$m;LW8/N;Lo0/C1;LV/n;I)Lx7/p;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LC/K;

.field final synthetic E:Z

.field final synthetic F:LA/B;

.field final synthetic G:Z

.field final synthetic H:Lx7/a;

.field final synthetic I:LC/H;

.field final synthetic J:LA/b$m;

.field final synthetic K:LA/b$e;

.field final synthetic L:LW8/N;

.field final synthetic M:Lo0/C1;


# direct methods
.method constructor <init>(LC/K;ZLA/B;ZLx7/a;LC/H;LA/b$m;LA/b$e;LW8/N;Lo0/C1;)V
    .locals 0

    iput-object p1, p0, LC/r$b;->D:LC/K;

    iput-boolean p2, p0, LC/r$b;->E:Z

    iput-object p3, p0, LC/r$b;->F:LA/B;

    iput-boolean p4, p0, LC/r$b;->G:Z

    iput-object p5, p0, LC/r$b;->H:Lx7/a;

    iput-object p6, p0, LC/r$b;->I:LC/H;

    iput-object p7, p0, LC/r$b;->J:LA/b$m;

    iput-object p8, p0, LC/r$b;->K:LA/b$e;

    iput-object p9, p0, LC/r$b;->L:LW8/N;

    iput-object p10, p0, LC/r$b;->M:Lo0/C1;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LD/w;J)LC/u;
    .locals 39

    .prologue
    move-object/from16 v1, p0

    move-object/from16 v0, p1

    move-wide/from16 v13, p2

    iget-object v2, v1, LC/r$b;->D:LC/K;

    invoke-virtual {v2}, LC/K;->s()LV/w0;

    move-result-object v2

    invoke-static {v2}, LD/L;->a(LV/w0;)V

    iget-boolean v2, v1, LC/r$b;->E:Z

    if-eqz v2, :cond_0

    sget-object v2, Lx/s;->C:Lx/s;

    goto :goto_0

    :cond_0
    sget-object v2, Lx/s;->D:Lx/s;

    :goto_0
    invoke-static {v13, v14, v2}, Lv/j;->a(JLx/s;)V

    iget-boolean v2, v1, LC/r$b;->E:Z

    if-eqz v2, :cond_1

    iget-object v2, v1, LC/r$b;->F:LA/B;

    invoke-interface/range {p1 .. p1}, LD0/o;->getLayoutDirection()LY0/v;

    move-result-object v3

    invoke-interface {v2, v3}, LA/B;->a(LY0/v;)F

    move-result v2

    :goto_1
    invoke-interface {v0, v2}, LY0/e;->S0(F)I

    move-result v2

    goto :goto_2

    :cond_1
    iget-object v2, v1, LC/r$b;->F:LA/B;

    invoke-interface/range {p1 .. p1}, LD0/o;->getLayoutDirection()LY0/v;

    move-result-object v3

    invoke-static {v2, v3}, Landroidx/compose/foundation/layout/m;->g(LA/B;LY0/v;)F

    move-result v2

    goto :goto_1

    :goto_2
    iget-boolean v3, v1, LC/r$b;->E:Z

    if-eqz v3, :cond_2

    iget-object v3, v1, LC/r$b;->F:LA/B;

    invoke-interface/range {p1 .. p1}, LD0/o;->getLayoutDirection()LY0/v;

    move-result-object v4

    invoke-interface {v3, v4}, LA/B;->b(LY0/v;)F

    move-result v3

    :goto_3
    invoke-interface {v0, v3}, LY0/e;->S0(F)I

    move-result v3

    goto :goto_4

    :cond_2
    iget-object v3, v1, LC/r$b;->F:LA/B;

    invoke-interface/range {p1 .. p1}, LD0/o;->getLayoutDirection()LY0/v;

    move-result-object v4

    invoke-static {v3, v4}, Landroidx/compose/foundation/layout/m;->f(LA/B;LY0/v;)F

    move-result v3

    goto :goto_3

    :goto_4
    iget-object v4, v1, LC/r$b;->F:LA/B;

    invoke-interface {v4}, LA/B;->d()F

    move-result v4

    invoke-interface {v0, v4}, LY0/e;->S0(F)I

    move-result v4

    iget-object v5, v1, LC/r$b;->F:LA/B;

    invoke-interface {v5}, LA/B;->c()F

    move-result v5

    invoke-interface {v0, v5}, LY0/e;->S0(F)I

    move-result v5

    add-int v15, v4, v5

    add-int v11, v2, v3

    iget-boolean v6, v1, LC/r$b;->E:Z

    if-eqz v6, :cond_3

    move v7, v15

    goto :goto_5

    :cond_3
    move v7, v11

    :goto_5
    if-eqz v6, :cond_4

    iget-boolean v8, v1, LC/r$b;->G:Z

    if-nez v8, :cond_4

    move/from16 v16, v4

    goto :goto_6

    :cond_4
    if-eqz v6, :cond_5

    iget-boolean v8, v1, LC/r$b;->G:Z

    if-eqz v8, :cond_5

    move/from16 v16, v5

    goto :goto_6

    :cond_5
    if-nez v6, :cond_6

    iget-boolean v5, v1, LC/r$b;->G:Z

    if-nez v5, :cond_6

    move/from16 v16, v2

    goto :goto_6

    :cond_6
    move/from16 v16, v3

    :goto_6
    sub-int v18, v7, v16

    neg-int v3, v11

    neg-int v5, v15

    invoke-static {v13, v14, v3, v5}, LY0/c;->n(JII)J

    move-result-wide v33

    iget-object v3, v1, LC/r$b;->H:Lx7/a;

    invoke-interface {v3}, Lx7/a;->b()Ljava/lang/Object;

    move-result-object v3

    move-object v12, v3

    check-cast v12, LC/l;

    invoke-interface {v12}, LC/l;->i()LC/J;

    move-result-object v10

    iget-object v3, v1, LC/r$b;->I:LC/H;

    invoke-interface {v3, v0, v13, v14}, LC/H;->a(LY0/e;J)LC/G;

    move-result-object v21

    invoke-virtual/range {v21 .. v21}, LC/G;->b()[I

    move-result-object v3

    array-length v9, v3

    invoke-virtual {v10, v9}, LC/J;->h(I)V

    iget-boolean v3, v1, LC/r$b;->E:Z

    if-eqz v3, :cond_8

    iget-object v3, v1, LC/r$b;->J:LA/b$m;

    if-eqz v3, :cond_7

    invoke-interface {v3}, LA/b$m;->a()F

    move-result v3

    goto :goto_7

    :cond_7
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v2, "null verticalArrangement when isVertical == true"

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_8
    iget-object v3, v1, LC/r$b;->K:LA/b$e;

    if-eqz v3, :cond_10

    invoke-interface {v3}, LA/b$e;->a()F

    move-result v3

    :goto_7
    invoke-interface {v0, v3}, LY0/e;->S0(F)I

    move-result v26

    invoke-interface {v12}, LD/s;->a()I

    move-result v8

    iget-boolean v3, v1, LC/r$b;->E:Z

    if-eqz v3, :cond_9

    invoke-static/range {p2 .. p3}, LY0/b;->k(J)I

    move-result v3

    sub-int/2addr v3, v15

    :goto_8
    move/from16 v31, v3

    goto :goto_9

    :cond_9
    invoke-static/range {p2 .. p3}, LY0/b;->l(J)I

    move-result v3

    sub-int/2addr v3, v11

    goto :goto_8

    :goto_9
    iget-boolean v3, v1, LC/r$b;->G:Z

    if-eqz v3, :cond_c

    if-lez v31, :cond_a

    goto :goto_b

    :cond_a
    iget-boolean v3, v1, LC/r$b;->E:Z

    if-eqz v3, :cond_b

    goto :goto_a

    :cond_b
    add-int v2, v2, v31

    :goto_a
    if-eqz v3, :cond_c

    add-int v4, v4, v31

    :cond_c
    :goto_b
    invoke-static {v2, v4}, LY0/q;->a(II)J

    move-result-wide v2

    move-wide/from16 v19, v2

    new-instance v35, LC/r$b$b;

    iget-object v6, v1, LC/r$b;->D:LC/K;

    iget-boolean v7, v1, LC/r$b;->E:Z

    iget-boolean v5, v1, LC/r$b;->G:Z

    move-object/from16 v2, v35

    move-object v3, v12

    move-object/from16 v4, p1

    move/from16 v17, v5

    move/from16 v5, v26

    move/from16 v36, v8

    move/from16 v8, v17

    move/from16 v37, v9

    move/from16 v9, v16

    move-object/from16 v17, v10

    move/from16 v10, v18

    move/from16 v38, v11

    move-object v0, v12

    move-wide/from16 v11, v19

    invoke-direct/range {v2 .. v12}, LC/r$b$b;-><init>(LC/l;LD/w;ILC/K;ZZIIJ)V

    new-instance v9, LC/r$b$c;

    iget-boolean v2, v1, LC/r$b;->E:Z

    move-object/from16 v19, v9

    move/from16 v20, v2

    move/from16 v22, v36

    move/from16 v23, v26

    move-object/from16 v24, v35

    move-object/from16 v25, v17

    invoke-direct/range {v19 .. v25}, LC/r$b$c;-><init>(ZLC/G;IILC/r$b$b;LC/J;)V

    new-instance v12, LC/r$b$d;

    move-object/from16 v2, v17

    invoke-direct {v12, v2, v9}, LC/r$b$d;-><init>(LC/J;LC/r$b$c;)V

    sget-object v3, Lf0/k;->e:Lf0/k$a;

    iget-object v4, v1, LC/r$b;->D:LC/K;

    invoke-virtual {v3}, Lf0/k$a;->d()Lf0/k;

    move-result-object v5

    const/4 v11, 0x0

    if-eqz v5, :cond_d

    invoke-virtual {v5}, Lf0/k;->h()Lx7/l;

    move-result-object v6

    goto :goto_c

    :cond_d
    move-object v6, v11

    :goto_c
    invoke-virtual {v3, v5}, Lf0/k$a;->f(Lf0/k;)Lf0/k;

    move-result-object v7

    :try_start_0
    invoke-virtual {v4}, LC/K;->n()I

    move-result v8

    invoke-virtual {v4, v0, v8}, LC/K;->I(LC/l;I)I

    move-result v8

    move/from16 v10, v36

    if-lt v8, v10, :cond_f

    if-gtz v10, :cond_e

    goto :goto_d

    :cond_e
    add-int/lit8 v8, v10, -0x1

    invoke-virtual {v2, v8}, LC/J;->d(I)I

    move-result v2

    move/from16 v24, v2

    const/16 v36, 0x0

    goto :goto_e

    :catchall_0
    move-exception v0

    goto/16 :goto_f

    :cond_f
    :goto_d
    invoke-virtual {v2, v8}, LC/J;->d(I)I

    move-result v2

    invoke-virtual {v4}, LC/K;->o()I

    move-result v4

    move/from16 v24, v2

    move/from16 v36, v4

    :goto_e
    sget-object v2, Li7/M;->a:Li7/M;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v3, v5, v7, v6}, Lf0/k$a;->m(Lf0/k;Lf0/k;Lx7/l;)V

    iget-object v2, v1, LC/r$b;->D:LC/K;

    invoke-virtual {v2}, LC/K;->u()LD/D;

    move-result-object v2

    iget-object v3, v1, LC/r$b;->D:LC/K;

    invoke-virtual {v3}, LC/K;->m()LD/j;

    move-result-object v3

    invoke-static {v0, v2, v3}, LD/n;->a(LD/s;LD/D;LD/j;)Ljava/util/List;

    move-result-object v27

    iget-object v0, v1, LC/r$b;->D:LC/K;

    invoke-virtual {v0}, LC/K;->z()F

    move-result v17

    iget-object v0, v1, LC/r$b;->D:LC/K;

    invoke-virtual {v0}, LC/K;->q()Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;

    move-result-object v25

    iget-object v0, v1, LC/r$b;->D:LC/K;

    invoke-virtual {v0}, LC/K;->v()LV/w0;

    move-result-object v29

    iget-boolean v0, v1, LC/r$b;->E:Z

    move/from16 v20, v0

    iget-object v0, v1, LC/r$b;->J:LA/b$m;

    move-object/from16 v21, v0

    iget-object v0, v1, LC/r$b;->K:LA/b$e;

    move-object/from16 v22, v0

    iget-boolean v0, v1, LC/r$b;->G:Z

    move/from16 v23, v0

    iget-object v0, v1, LC/r$b;->L:LW8/N;

    move-object/from16 v28, v0

    iget-object v0, v1, LC/r$b;->M:Lo0/C1;

    move-object/from16 v30, v0

    new-instance v2, LC/r$b$a;

    move-object/from16 v32, v2

    move-object/from16 v3, p1

    move-wide/from16 v4, p2

    move/from16 v6, v38

    move v7, v15

    invoke-direct/range {v2 .. v7}, LC/r$b$a;-><init>(LD/w;JII)V

    move v8, v10

    const/4 v0, 0x0

    move-object/from16 v10, v35

    move-object v2, v11

    move/from16 v11, v31

    move-object v3, v12

    move/from16 v12, v16

    move/from16 v13, v18

    move/from16 v14, v26

    move/from16 v15, v24

    move/from16 v16, v36

    move-wide/from16 v18, v33

    move-object/from16 v24, p1

    move/from16 v26, v37

    move-object/from16 v31, v3

    invoke-static/range {v8 .. v32}, LC/t;->d(ILC/y;LC/w;IIIIIIFJZLA/b$m;LA/b$e;ZLY0/e;Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;ILjava/util/List;LW8/N;LV/w0;Lo0/C1;Lx7/l;Lx7/q;)LC/u;

    move-result-object v3

    iget-object v4, v1, LC/r$b;->D:LC/K;

    const/4 v5, 0x2

    invoke-static {v4, v3, v0, v5, v2}, LC/K;->k(LC/K;LC/u;ZILjava/lang/Object;)V

    return-object v3

    :goto_f
    invoke-virtual {v3, v5, v7, v6}, Lf0/k$a;->m(Lf0/k;Lf0/k;Lx7/l;)V

    throw v0

    :cond_10
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v2, "null horizontalArrangement when isVertical == false"

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

    invoke-virtual {p0, p1, v0, v1}, LC/r$b;->a(LD/w;J)LC/u;

    move-result-object p1

    return-object p1
.end method
