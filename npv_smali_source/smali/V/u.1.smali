.class public final LV/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LV/G;
.implements LV/b1;
.implements LV/T0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LV/u$a;
    }
.end annotation


# instance fields
.field private final C:LV/s;

.field private final D:LV/g;

.field private final E:Ljava/util/concurrent/atomic/AtomicReference;

.field private final F:Ljava/lang/Object;

.field private final G:Ljava/util/Set;

.field private final H:LV/h1;

.field private final I:LX/f;

.field private final J:Lr/L;

.field private final K:Lr/L;

.field private final L:LX/f;

.field private final M:LW/a;

.field private final N:LW/a;

.field private final O:LX/f;

.field private P:LX/f;

.field private Q:Z

.field private R:LV/u;

.field private S:I

.field private final T:LV/B;

.field private final U:LV/o;

.field private final V:Lm7/i;

.field private final W:Z

.field private X:Z

.field private Y:Lx7/p;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(LV/s;LV/g;Lm7/i;)V
    .locals 12

    .prologue
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LV/u;->C:LV/s;

    iput-object p2, p0, LV/u;->D:LV/g;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, LV/u;->E:Ljava/util/concurrent/atomic/AtomicReference;

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, LV/u;->F:Ljava/lang/Object;

    new-instance v0, Lr/L;

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-direct {v0, v2, v3, v1}, Lr/L;-><init>(IILy7/k;)V

    invoke-virtual {v0}, Lr/L;->l()Ljava/util/Set;

    move-result-object v8

    iput-object v8, p0, LV/u;->G:Ljava/util/Set;

    new-instance v7, LV/h1;

    invoke-direct {v7}, LV/h1;-><init>()V

    invoke-virtual {p1}, LV/s;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {v7}, LV/h1;->o()V

    :cond_0
    invoke-virtual {p1}, LV/s;->e()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {v7}, LV/h1;->s()V

    :cond_1
    iput-object v7, p0, LV/u;->H:LV/h1;

    new-instance v0, LX/f;

    invoke-direct {v0}, LX/f;-><init>()V

    iput-object v0, p0, LV/u;->I:LX/f;

    new-instance v0, Lr/L;

    invoke-direct {v0, v2, v3, v1}, Lr/L;-><init>(IILy7/k;)V

    iput-object v0, p0, LV/u;->J:Lr/L;

    new-instance v0, Lr/L;

    invoke-direct {v0, v2, v3, v1}, Lr/L;-><init>(IILy7/k;)V

    iput-object v0, p0, LV/u;->K:Lr/L;

    new-instance v0, LX/f;

    invoke-direct {v0}, LX/f;-><init>()V

    iput-object v0, p0, LV/u;->L:LX/f;

    new-instance v9, LW/a;

    invoke-direct {v9}, LW/a;-><init>()V

    iput-object v9, p0, LV/u;->M:LW/a;

    new-instance v10, LW/a;

    invoke-direct {v10}, LW/a;-><init>()V

    iput-object v10, p0, LV/u;->N:LW/a;

    new-instance v0, LX/f;

    invoke-direct {v0}, LX/f;-><init>()V

    iput-object v0, p0, LV/u;->O:LX/f;

    new-instance v0, LX/f;

    invoke-direct {v0}, LX/f;-><init>()V

    iput-object v0, p0, LV/u;->P:LX/f;

    new-instance v0, LV/B;

    const/4 v3, 0x3

    invoke-direct {v0, v1, v2, v3, v1}, LV/B;-><init>(Lg0/c;ZILy7/k;)V

    iput-object v0, p0, LV/u;->T:LV/B;

    new-instance v0, LV/o;

    move-object v4, v0

    move-object v5, p2

    move-object v6, p1

    move-object v11, p0

    invoke-direct/range {v4 .. v11}, LV/o;-><init>(LV/g;LV/s;LV/h1;Ljava/util/Set;LW/a;LW/a;LV/G;)V

    invoke-virtual {p1, v0}, LV/s;->n(LV/n;)V

    iput-object v0, p0, LV/u;->U:LV/o;

    iput-object p3, p0, LV/u;->V:Lm7/i;

    instance-of p1, p1, LV/U0;

    iput-boolean p1, p0, LV/u;->W:Z

    sget-object p1, LV/j;->a:LV/j;

    invoke-virtual {p1}, LV/j;->a()Lx7/p;

    move-result-object p1

    iput-object p1, p0, LV/u;->Y:Lx7/p;

    return-void
.end method

.method public synthetic constructor <init>(LV/s;LV/g;Lm7/i;ILy7/k;)V
    .locals 0

    .prologue
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    const/4 p3, 0x0

    :cond_0
    invoke-direct {p0, p1, p2, p3}, LV/u;-><init>(LV/s;LV/g;Lm7/i;)V

    return-void
.end method

.method private final A(LW/a;)V
    .locals 30

    .prologue
    move-object/from16 v1, p0

    const/4 v0, 0x1

    new-instance v2, LV/u$a;

    iget-object v3, v1, LV/u;->G:Ljava/util/Set;

    invoke-direct {v2, v3}, LV/u$a;-><init>(Ljava/util/Set;)V

    :try_start_0
    invoke-virtual/range {p1 .. p1}, LW/a;->c()Z

    move-result v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_4

    if-eqz v3, :cond_1

    iget-object v0, v1, LV/u;->N:LW/a;

    invoke-virtual {v0}, LW/a;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {v2}, LV/u$a;->f()V

    :cond_0
    return-void

    :cond_1
    :try_start_1
    const-string v3, "Compose:applyChanges"

    sget-object v4, LV/K1;->a:LV/K1;

    invoke-virtual {v4, v3}, LV/K1;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_4

    :try_start_2
    iget-object v5, v1, LV/u;->D:LV/g;

    invoke-interface {v5}, LV/g;->e()V

    iget-object v5, v1, LV/u;->H:LV/h1;

    invoke-virtual {v5}, LV/h1;->V()LV/k1;

    move-result-object v5
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_5

    const/4 v6, 0x0

    :try_start_3
    iget-object v7, v1, LV/u;->D:LV/g;

    move-object/from16 v8, p1

    invoke-virtual {v8, v7, v5, v2}, LW/a;->b(LV/g;LV/k1;LV/Y0;)V

    sget-object v7, Li7/M;->a:Li7/M;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_6

    :try_start_4
    invoke-virtual {v5, v0}, LV/k1;->L(Z)V

    iget-object v5, v1, LV/u;->D:LV/g;

    invoke-interface {v5}, LV/g;->i()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_5

    :try_start_5
    invoke-virtual {v4, v3}, LV/K1;->b(Ljava/lang/Object;)V

    invoke-virtual {v2}, LV/u$a;->g()V

    invoke-virtual {v2}, LV/u$a;->h()V

    iget-boolean v3, v1, LV/u;->Q:Z
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    if-eqz v3, :cond_10

    :try_start_6
    const-string v3, "Compose:unobserve"

    invoke-virtual {v4, v3}, LV/K1;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    :try_start_7
    iput-boolean v6, v1, LV/u;->Q:Z

    iget-object v4, v1, LV/u;->I:LX/f;

    invoke-virtual {v4}, LX/f;->d()Lr/K;

    move-result-object v4

    iget-object v5, v4, Lr/U;->a:[J

    array-length v7, v5

    add-int/lit8 v7, v7, -0x2

    if-ltz v7, :cond_e

    move v8, v6

    :goto_0
    aget-wide v9, v5, v8

    not-long v11, v9

    const/4 v13, 0x7

    shl-long/2addr v11, v13

    and-long/2addr v11, v9

    const-wide v14, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    and-long/2addr v11, v14

    cmp-long v11, v11, v14

    if-eqz v11, :cond_d

    sub-int v11, v8, v7

    not-int v11, v11

    ushr-int/lit8 v11, v11, 0x1f

    const/16 v12, 0x8

    rsub-int/lit8 v11, v11, 0x8

    :goto_1
    if-ge v6, v11, :cond_c

    const-wide/16 v16, 0xff

    and-long v18, v9, v16

    const-wide/16 v20, 0x80

    cmp-long v18, v18, v20

    if-gez v18, :cond_b

    shl-int/lit8 v18, v8, 0x3

    add-int v0, v18, v6

    iget-object v12, v4, Lr/U;->b:[Ljava/lang/Object;

    aget-object v12, v12, v0

    iget-object v12, v4, Lr/U;->c:[Ljava/lang/Object;

    aget-object v12, v12, v0

    instance-of v14, v12, Lr/L;

    if-eqz v14, :cond_8

    const-string v14, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$2>"

    invoke-static {v12, v14}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v12, Lr/L;

    iget-object v14, v12, Lr/W;->b:[Ljava/lang/Object;

    iget-object v15, v12, Lr/W;->a:[J

    array-length v13, v15
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    add-int/lit8 v13, v13, -0x2

    move-object/from16 v25, v2

    move-object/from16 v24, v5

    if-ltz v13, :cond_6

    const/4 v5, 0x0

    :goto_2
    :try_start_8
    aget-wide v1, v15, v5

    move/from16 v26, v7

    move/from16 v27, v8

    not-long v7, v1

    const/16 v18, 0x7

    shl-long v7, v7, v18

    and-long/2addr v7, v1

    const-wide v22, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    and-long v7, v7, v22

    cmp-long v7, v7, v22

    if-eqz v7, :cond_5

    sub-int v7, v5, v13

    not-int v7, v7

    ushr-int/lit8 v7, v7, 0x1f

    const/16 v8, 0x8

    rsub-int/lit8 v7, v7, 0x8

    const/4 v8, 0x0

    :goto_3
    if-ge v8, v7, :cond_4

    and-long v28, v1, v16

    cmp-long v28, v28, v20

    if-gez v28, :cond_3

    shl-int/lit8 v28, v5, 0x3

    move-object/from16 v29, v15

    add-int v15, v28, v8

    aget-object v28, v14, v15

    check-cast v28, LV/R0;

    invoke-virtual/range {v28 .. v28}, LV/R0;->r()Z

    move-result v28

    const/16 v19, 0x1

    xor-int/lit8 v28, v28, 0x1

    if-eqz v28, :cond_2

    invoke-virtual {v12, v15}, Lr/L;->y(I)V

    goto :goto_4

    :catchall_0
    move-exception v0

    goto/16 :goto_c

    :cond_2
    :goto_4
    const/16 v15, 0x8

    goto :goto_5

    :cond_3
    move-object/from16 v29, v15

    goto :goto_4

    :goto_5
    shr-long/2addr v1, v15

    const/16 v19, 0x1

    add-int/lit8 v8, v8, 0x1

    move-object/from16 v15, v29

    goto :goto_3

    :cond_4
    move-object/from16 v29, v15

    const/16 v15, 0x8

    const/16 v19, 0x1

    if-ne v7, v15, :cond_7

    goto :goto_6

    :cond_5
    move-object/from16 v29, v15

    const/16 v19, 0x1

    :goto_6
    if-eq v5, v13, :cond_7

    add-int/lit8 v5, v5, 0x1

    move/from16 v7, v26

    move/from16 v8, v27

    move-object/from16 v15, v29

    goto :goto_2

    :cond_6
    move/from16 v26, v7

    move/from16 v27, v8

    const/16 v18, 0x7

    const-wide v22, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    :cond_7
    invoke-virtual {v12}, Lr/W;->d()Z

    move-result v1

    goto :goto_7

    :catchall_1
    move-exception v0

    move-object/from16 v25, v2

    goto/16 :goto_c

    :cond_8
    move-object/from16 v25, v2

    move-object/from16 v24, v5

    move/from16 v26, v7

    move/from16 v27, v8

    move/from16 v18, v13

    const-wide v22, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    const-string v1, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$2"

    invoke-static {v12, v1}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v12, LV/R0;

    invoke-virtual {v12}, LV/R0;->r()Z

    move-result v1

    if-nez v1, :cond_9

    const/4 v1, 0x1

    goto :goto_7

    :cond_9
    const/4 v1, 0x0

    :goto_7
    if-eqz v1, :cond_a

    invoke-virtual {v4, v0}, Lr/K;->q(I)Ljava/lang/Object;

    :cond_a
    const/16 v0, 0x8

    goto :goto_8

    :cond_b
    move-object/from16 v25, v2

    move-object/from16 v24, v5

    move/from16 v26, v7

    move/from16 v27, v8

    move/from16 v18, v13

    move-wide/from16 v22, v14

    move v0, v12

    :goto_8
    shr-long/2addr v9, v0

    const/4 v1, 0x1

    add-int/2addr v6, v1

    move v12, v0

    move v0, v1

    move/from16 v13, v18

    move-wide/from16 v14, v22

    move-object/from16 v5, v24

    move-object/from16 v2, v25

    move/from16 v7, v26

    move/from16 v8, v27

    move-object/from16 v1, p0

    goto/16 :goto_1

    :cond_c
    move v1, v0

    move-object/from16 v25, v2

    move-object/from16 v24, v5

    move/from16 v26, v7

    move/from16 v27, v8

    move v0, v12

    if-ne v11, v0, :cond_f

    move/from16 v7, v26

    move/from16 v6, v27

    goto :goto_9

    :cond_d
    move v1, v0

    move-object/from16 v25, v2

    move-object/from16 v24, v5

    move v6, v8

    :goto_9
    if-eq v6, v7, :cond_f

    add-int/lit8 v8, v6, 0x1

    move v0, v1

    move-object/from16 v5, v24

    move-object/from16 v2, v25

    const/4 v6, 0x0

    move-object/from16 v1, p0

    goto/16 :goto_0

    :cond_e
    move-object/from16 v25, v2

    :cond_f
    invoke-direct/range {p0 .. p0}, LV/u;->B()V

    sget-object v0, Li7/M;->a:Li7/M;
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    :try_start_9
    sget-object v0, LV/K1;->a:LV/K1;

    invoke-virtual {v0, v3}, LV/K1;->b(Ljava/lang/Object;)V

    :goto_a
    move-object/from16 v1, p0

    goto :goto_d

    :catchall_2
    move-exception v0

    :goto_b
    move-object/from16 v1, p0

    goto :goto_f

    :goto_c
    sget-object v1, LV/K1;->a:LV/K1;

    invoke-virtual {v1, v3}, LV/K1;->b(Ljava/lang/Object;)V

    throw v0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_2

    :catchall_3
    move-exception v0

    move-object/from16 v25, v2

    goto :goto_b

    :cond_10
    move-object/from16 v25, v2

    goto :goto_a

    :goto_d
    iget-object v0, v1, LV/u;->N:LW/a;

    invoke-virtual {v0}, LW/a;->c()Z

    move-result v0

    if-eqz v0, :cond_11

    invoke-virtual/range {v25 .. v25}, LV/u$a;->f()V

    :cond_11
    return-void

    :catchall_4
    move-exception v0

    move-object/from16 v25, v2

    goto :goto_f

    :catchall_5
    move-exception v0

    move-object/from16 v25, v2

    goto :goto_e

    :catchall_6
    move-exception v0

    move-object/from16 v25, v2

    const/4 v2, 0x0

    :try_start_a
    invoke-virtual {v5, v2}, LV/k1;->L(Z)V

    throw v0
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_7

    :catchall_7
    move-exception v0

    :goto_e
    :try_start_b
    sget-object v2, LV/K1;->a:LV/K1;

    invoke-virtual {v2, v3}, LV/K1;->b(Ljava/lang/Object;)V

    throw v0
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_8

    :catchall_8
    move-exception v0

    :goto_f
    iget-object v2, v1, LV/u;->N:LW/a;

    invoke-virtual {v2}, LW/a;->c()Z

    move-result v2

    if-eqz v2, :cond_12

    invoke-virtual/range {v25 .. v25}, LV/u$a;->f()V

    :cond_12
    throw v0
.end method

.method private final B()V
    .locals 31

    .prologue
    move-object/from16 v0, p0

    iget-object v1, v0, LV/u;->L:LX/f;

    invoke-virtual {v1}, LX/f;->d()Lr/K;

    move-result-object v1

    iget-object v2, v1, Lr/U;->a:[J

    array-length v3, v2

    add-int/lit8 v3, v3, -0x2

    const-wide/16 v6, 0xff

    const/4 v8, 0x7

    const-wide v9, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    const/16 v11, 0x8

    if-ltz v3, :cond_c

    const/4 v14, 0x0

    :goto_0
    aget-wide v12, v2, v14

    not-long v4, v12

    shl-long/2addr v4, v8

    and-long/2addr v4, v12

    and-long/2addr v4, v9

    cmp-long v4, v4, v9

    if-eqz v4, :cond_b

    sub-int v4, v14, v3

    not-int v4, v4

    ushr-int/lit8 v4, v4, 0x1f

    rsub-int/lit8 v4, v4, 0x8

    const/4 v5, 0x0

    :goto_1
    if-ge v5, v4, :cond_a

    and-long v18, v12, v6

    const-wide/16 v16, 0x80

    cmp-long v18, v18, v16

    if-gez v18, :cond_9

    shl-int/lit8 v18, v14, 0x3

    add-int v15, v18, v5

    iget-object v6, v1, Lr/U;->b:[Ljava/lang/Object;

    aget-object v6, v6, v15

    iget-object v6, v1, Lr/U;->c:[Ljava/lang/Object;

    aget-object v6, v6, v15

    instance-of v7, v6, Lr/L;

    if-eqz v7, :cond_6

    const-string v7, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$2>"

    invoke-static {v6, v7}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v6, Lr/L;

    iget-object v7, v6, Lr/W;->b:[Ljava/lang/Object;

    iget-object v11, v6, Lr/W;->a:[J

    array-length v9, v11

    add-int/lit8 v9, v9, -0x2

    move-object/from16 v24, v2

    move/from16 v25, v3

    if-ltz v9, :cond_4

    const/4 v10, 0x0

    :goto_2
    aget-wide v2, v11, v10

    move/from16 v26, v4

    move/from16 v27, v5

    not-long v4, v2

    shl-long/2addr v4, v8

    and-long/2addr v4, v2

    const-wide v22, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    and-long v4, v4, v22

    cmp-long v4, v4, v22

    if-eqz v4, :cond_3

    sub-int v4, v10, v9

    not-int v4, v4

    ushr-int/lit8 v4, v4, 0x1f

    const/16 v5, 0x8

    rsub-int/lit8 v4, v4, 0x8

    const/4 v5, 0x0

    :goto_3
    if-ge v5, v4, :cond_2

    const-wide/16 v20, 0xff

    and-long v28, v2, v20

    const-wide/16 v16, 0x80

    cmp-long v28, v28, v16

    if-gez v28, :cond_1

    shl-int/lit8 v28, v10, 0x3

    add-int v8, v28, v5

    aget-object v28, v7, v8

    move-object/from16 v30, v7

    move-object/from16 v7, v28

    check-cast v7, LV/J;

    move-object/from16 v28, v11

    invoke-static/range {p0 .. p0}, LV/u;->i(LV/u;)LX/f;

    move-result-object v11

    invoke-virtual {v11, v7}, LX/f;->c(Ljava/lang/Object;)Z

    move-result v7

    const/4 v11, 0x1

    xor-int/2addr v7, v11

    if-eqz v7, :cond_0

    invoke-virtual {v6, v8}, Lr/L;->y(I)V

    :cond_0
    :goto_4
    const/16 v7, 0x8

    goto :goto_5

    :cond_1
    move-object/from16 v30, v7

    move-object/from16 v28, v11

    goto :goto_4

    :goto_5
    shr-long/2addr v2, v7

    add-int/lit8 v5, v5, 0x1

    move-object/from16 v11, v28

    move-object/from16 v7, v30

    const/4 v8, 0x7

    goto :goto_3

    :cond_2
    move-object/from16 v30, v7

    move-object/from16 v28, v11

    const/16 v7, 0x8

    if-ne v4, v7, :cond_5

    goto :goto_6

    :cond_3
    move-object/from16 v30, v7

    move-object/from16 v28, v11

    :goto_6
    if-eq v10, v9, :cond_5

    add-int/lit8 v10, v10, 0x1

    move/from16 v4, v26

    move/from16 v5, v27

    move-object/from16 v11, v28

    move-object/from16 v7, v30

    const/4 v8, 0x7

    goto :goto_2

    :cond_4
    move/from16 v26, v4

    move/from16 v27, v5

    :cond_5
    invoke-virtual {v6}, Lr/W;->d()Z

    move-result v19

    goto :goto_7

    :cond_6
    move-object/from16 v24, v2

    move/from16 v25, v3

    move/from16 v26, v4

    move/from16 v27, v5

    const-string v2, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$2"

    invoke-static {v6, v2}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v6, LV/J;

    invoke-static/range {p0 .. p0}, LV/u;->i(LV/u;)LX/f;

    move-result-object v2

    invoke-virtual {v2, v6}, LX/f;->c(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_7

    const/16 v19, 0x1

    goto :goto_7

    :cond_7
    const/16 v19, 0x0

    :goto_7
    if-eqz v19, :cond_8

    invoke-virtual {v1, v15}, Lr/K;->q(I)Ljava/lang/Object;

    :cond_8
    :goto_8
    const/16 v2, 0x8

    goto :goto_9

    :cond_9
    move-object/from16 v24, v2

    move/from16 v25, v3

    move/from16 v26, v4

    move/from16 v27, v5

    goto :goto_8

    :goto_9
    shr-long/2addr v12, v2

    add-int/lit8 v5, v27, 0x1

    move v11, v2

    move-object/from16 v2, v24

    move/from16 v3, v25

    move/from16 v4, v26

    const-wide/16 v6, 0xff

    const/4 v8, 0x7

    const-wide v9, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    goto/16 :goto_1

    :cond_a
    move-object/from16 v24, v2

    move/from16 v25, v3

    move v3, v4

    move v2, v11

    if-ne v3, v2, :cond_c

    move/from16 v3, v25

    goto :goto_a

    :cond_b
    move-object/from16 v24, v2

    :goto_a
    if-eq v14, v3, :cond_c

    add-int/lit8 v14, v14, 0x1

    move-object/from16 v2, v24

    const-wide/16 v6, 0xff

    const/4 v8, 0x7

    const-wide v9, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    const/16 v11, 0x8

    goto/16 :goto_0

    :cond_c
    iget-object v1, v0, LV/u;->K:Lr/L;

    invoke-virtual {v1}, Lr/W;->e()Z

    move-result v1

    if-eqz v1, :cond_12

    iget-object v1, v0, LV/u;->K:Lr/L;

    iget-object v2, v1, Lr/W;->b:[Ljava/lang/Object;

    iget-object v3, v1, Lr/W;->a:[J

    array-length v4, v3

    add-int/lit8 v4, v4, -0x2

    if-ltz v4, :cond_12

    const/4 v5, 0x0

    :goto_b
    aget-wide v6, v3, v5

    not-long v8, v6

    const/4 v10, 0x7

    shl-long/2addr v8, v10

    and-long/2addr v8, v6

    const-wide v12, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    and-long/2addr v8, v12

    cmp-long v8, v8, v12

    if-eqz v8, :cond_11

    sub-int v8, v5, v4

    not-int v8, v8

    ushr-int/lit8 v8, v8, 0x1f

    const/16 v9, 0x8

    rsub-int/lit8 v8, v8, 0x8

    const/4 v9, 0x0

    :goto_c
    if-ge v9, v8, :cond_10

    const-wide/16 v14, 0xff

    and-long v19, v6, v14

    const-wide/16 v16, 0x80

    cmp-long v19, v19, v16

    if-gez v19, :cond_d

    const/16 v19, 0x1

    goto :goto_d

    :cond_d
    const/16 v19, 0x0

    :goto_d
    if-eqz v19, :cond_f

    shl-int/lit8 v19, v5, 0x3

    add-int v10, v19, v9

    aget-object v19, v2, v10

    check-cast v19, LV/R0;

    invoke-virtual/range {v19 .. v19}, LV/R0;->t()Z

    move-result v19

    const/4 v11, 0x1

    xor-int/lit8 v19, v19, 0x1

    if-eqz v19, :cond_e

    invoke-virtual {v1, v10}, Lr/L;->y(I)V

    :cond_e
    :goto_e
    const/16 v10, 0x8

    goto :goto_f

    :cond_f
    const/4 v11, 0x1

    goto :goto_e

    :goto_f
    shr-long/2addr v6, v10

    add-int/lit8 v9, v9, 0x1

    const/4 v10, 0x7

    goto :goto_c

    :cond_10
    const/16 v10, 0x8

    const/4 v11, 0x1

    const-wide/16 v14, 0xff

    const-wide/16 v16, 0x80

    if-ne v8, v10, :cond_12

    goto :goto_10

    :cond_11
    const/16 v10, 0x8

    const/4 v11, 0x1

    const-wide/16 v14, 0xff

    const-wide/16 v16, 0x80

    :goto_10
    if-eq v5, v4, :cond_12

    add-int/lit8 v5, v5, 0x1

    goto :goto_b

    :cond_12
    return-void
.end method

.method private final C(Lx7/p;)V
    .locals 1

    .prologue
    iget-boolean v0, p0, LV/u;->X:Z

    xor-int/lit8 v0, v0, 0x1

    if-nez v0, :cond_0

    const-string v0, "The composition is disposed"

    invoke-static {v0}, LV/I0;->b(Ljava/lang/String;)V

    :cond_0
    iput-object p1, p0, LV/u;->Y:Lx7/p;

    iget-object v0, p0, LV/u;->C:LV/s;

    invoke-virtual {v0, p0, p1}, LV/s;->a(LV/G;Lx7/p;)V

    return-void
.end method

.method private final D()V
    .locals 5

    .prologue
    iget-object v0, p0, LV/u;->E:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-static {}, LV/v;->c()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-static {}, LV/v;->c()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v0, v1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    instance-of v1, v0, Ljava/util/Set;

    const/4 v2, 0x1

    if-eqz v1, :cond_0

    check-cast v0, Ljava/util/Set;

    invoke-direct {p0, v0, v2}, LV/u;->y(Ljava/util/Set;Z)V

    goto :goto_1

    :cond_0
    instance-of v1, v0, [Ljava/lang/Object;

    if-eqz v1, :cond_1

    check-cast v0, [Ljava/util/Set;

    array-length v1, v0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_3

    aget-object v4, v0, v3

    invoke-direct {p0, v4, v2}, LV/u;->y(Ljava/util/Set;Z)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "corrupt pendingModifications drain: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LV/u;->E:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, LV/q;->s(Ljava/lang/String;)Ljava/lang/Void;

    new-instance v0, Li7/k;

    invoke-direct {v0}, Li7/k;-><init>()V

    throw v0

    :cond_2
    const-string v0, "pending composition has not been applied"

    invoke-static {v0}, LV/q;->s(Ljava/lang/String;)Ljava/lang/Void;

    new-instance v0, Li7/k;

    invoke-direct {v0}, Li7/k;-><init>()V

    throw v0

    :cond_3
    :goto_1
    return-void
.end method

.method private final E()V
    .locals 5

    .prologue
    iget-object v0, p0, LV/u;->E:Ljava/util/concurrent/atomic/AtomicReference;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {}, LV/v;->c()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v0, v1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    instance-of v1, v0, Ljava/util/Set;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    check-cast v0, Ljava/util/Set;

    invoke-direct {p0, v0, v2}, LV/u;->y(Ljava/util/Set;Z)V

    goto :goto_1

    :cond_0
    instance-of v1, v0, [Ljava/lang/Object;

    if-eqz v1, :cond_1

    check-cast v0, [Ljava/util/Set;

    array-length v1, v0

    move v3, v2

    :goto_0
    if-ge v3, v1, :cond_3

    aget-object v4, v0, v3

    invoke-direct {p0, v4, v2}, LV/u;->y(Ljava/util/Set;Z)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    if-nez v0, :cond_2

    const-string v0, "calling recordModificationsOf and applyChanges concurrently is not supported"

    invoke-static {v0}, LV/q;->s(Ljava/lang/String;)Ljava/lang/Void;

    new-instance v0, Li7/k;

    invoke-direct {v0}, Li7/k;-><init>()V

    throw v0

    :cond_2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "corrupt pendingModifications drain: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LV/u;->E:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, LV/q;->s(Ljava/lang/String;)Ljava/lang/Void;

    new-instance v0, Li7/k;

    invoke-direct {v0}, Li7/k;-><init>()V

    throw v0

    :cond_3
    :goto_1
    return-void
.end method

.method private final F()Z
    .locals 1

    iget-object v0, p0, LV/u;->U:LV/o;

    invoke-virtual {v0}, LV/o;->B0()Z

    move-result v0

    return v0
.end method

.method private final H(LV/R0;LV/d;Ljava/lang/Object;)LV/a0;
    .locals 20

    .prologue
    move-object/from16 v1, p0

    move-object/from16 v0, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    iget-object v4, v1, LV/u;->F:Ljava/lang/Object;

    monitor-enter v4

    :try_start_0
    iget-object v5, v1, LV/u;->R:LV/u;

    const/4 v6, 0x0

    if-eqz v5, :cond_1

    iget-object v7, v1, LV/u;->H:LV/h1;

    iget v8, v1, LV/u;->S:I

    invoke-virtual {v7, v8, v2}, LV/h1;->T(ILV/d;)Z

    move-result v7

    if-eqz v7, :cond_0

    goto :goto_0

    :cond_0
    move-object v5, v6

    :goto_0
    move-object v6, v5

    goto :goto_1

    :catchall_0
    move-exception v0

    goto/16 :goto_8

    :cond_1
    :goto_1
    if-nez v6, :cond_b

    invoke-direct {v1, v0, v3}, LV/u;->N(LV/R0;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    sget-object v0, LV/a0;->F:LV/a0;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v4

    return-object v0

    :cond_2
    :try_start_1
    invoke-direct/range {p0 .. p0}, LV/u;->J()Lg0/c;

    if-nez v3, :cond_3

    iget-object v5, v1, LV/u;->P:LX/f;

    sget-object v7, LV/d1;->a:LV/d1;

    :goto_2
    invoke-virtual {v5, v0, v7}, LX/f;->h(Ljava/lang/Object;Ljava/lang/Object;)V

    goto/16 :goto_6

    :cond_3
    instance-of v5, v3, LV/J;

    if-nez v5, :cond_4

    iget-object v5, v1, LV/u;->P:LX/f;

    sget-object v7, LV/d1;->a:LV/d1;

    goto :goto_2

    :cond_4
    iget-object v5, v1, LV/u;->P:LX/f;

    invoke-virtual {v5}, LX/f;->d()Lr/K;

    move-result-object v5

    invoke-virtual {v5, v0}, Lr/U;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    if-eqz v5, :cond_a

    instance-of v7, v5, Lr/L;

    if-eqz v7, :cond_9

    check-cast v5, Lr/L;

    iget-object v7, v5, Lr/W;->b:[Ljava/lang/Object;

    iget-object v5, v5, Lr/W;->a:[J

    array-length v8, v5

    add-int/lit8 v8, v8, -0x2

    if-ltz v8, :cond_a

    const/4 v10, 0x0

    :goto_3
    aget-wide v11, v5, v10

    not-long v13, v11

    const/4 v15, 0x7

    shl-long/2addr v13, v15

    and-long/2addr v13, v11

    const-wide v15, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    and-long/2addr v13, v15

    cmp-long v13, v13, v15

    if-eqz v13, :cond_8

    sub-int v13, v10, v8

    not-int v13, v13

    ushr-int/lit8 v13, v13, 0x1f

    const/16 v14, 0x8

    rsub-int/lit8 v13, v13, 0x8

    const/4 v15, 0x0

    :goto_4
    if-ge v15, v13, :cond_7

    const-wide/16 v16, 0xff

    and-long v16, v11, v16

    const-wide/16 v18, 0x80

    cmp-long v16, v16, v18

    if-gez v16, :cond_6

    shl-int/lit8 v16, v10, 0x3

    add-int v16, v16, v15

    aget-object v9, v7, v16

    sget-object v14, LV/d1;->a:LV/d1;

    if-ne v9, v14, :cond_5

    goto :goto_6

    :cond_5
    const/16 v9, 0x8

    goto :goto_5

    :cond_6
    move v9, v14

    :goto_5
    shr-long/2addr v11, v9

    add-int/lit8 v15, v15, 0x1

    move v14, v9

    goto :goto_4

    :cond_7
    move v9, v14

    if-ne v13, v9, :cond_a

    :cond_8
    if-eq v10, v8, :cond_a

    add-int/lit8 v10, v10, 0x1

    goto :goto_3

    :cond_9
    sget-object v7, LV/d1;->a:LV/d1;

    if-ne v5, v7, :cond_a

    goto :goto_6

    :cond_a
    iget-object v5, v1, LV/u;->P:LX/f;

    invoke-virtual {v5, v0, v3}, LX/f;->a(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :cond_b
    :goto_6
    monitor-exit v4

    if-eqz v6, :cond_c

    invoke-direct {v6, v0, v2, v3}, LV/u;->H(LV/R0;LV/d;Ljava/lang/Object;)LV/a0;

    move-result-object v0

    return-object v0

    :cond_c
    iget-object v0, v1, LV/u;->C:LV/s;

    invoke-virtual {v0, v1}, LV/s;->k(LV/G;)V

    invoke-virtual/range {p0 .. p0}, LV/u;->p()Z

    move-result v0

    if-eqz v0, :cond_d

    sget-object v0, LV/a0;->E:LV/a0;

    goto :goto_7

    :cond_d
    sget-object v0, LV/a0;->D:LV/a0;

    :goto_7
    return-object v0

    :goto_8
    monitor-exit v4

    throw v0
.end method

.method private final I(Ljava/lang/Object;)V
    .locals 14

    .prologue
    iget-object v0, p0, LV/u;->I:LX/f;

    invoke-virtual {v0}, LX/f;->d()Lr/K;

    move-result-object v0

    invoke-virtual {v0, p1}, Lr/U;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_4

    instance-of v1, v0, Lr/L;

    if-eqz v1, :cond_3

    check-cast v0, Lr/L;

    iget-object v1, v0, Lr/W;->b:[Ljava/lang/Object;

    iget-object v0, v0, Lr/W;->a:[J

    array-length v2, v0

    add-int/lit8 v2, v2, -0x2

    if-ltz v2, :cond_4

    const/4 v3, 0x0

    move v4, v3

    :goto_0
    aget-wide v5, v0, v4

    not-long v7, v5

    const/4 v9, 0x7

    shl-long/2addr v7, v9

    and-long/2addr v7, v5

    const-wide v9, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    and-long/2addr v7, v9

    cmp-long v7, v7, v9

    if-eqz v7, :cond_2

    sub-int v7, v4, v2

    not-int v7, v7

    ushr-int/lit8 v7, v7, 0x1f

    const/16 v8, 0x8

    rsub-int/lit8 v7, v7, 0x8

    move v9, v3

    :goto_1
    if-ge v9, v7, :cond_1

    const-wide/16 v10, 0xff

    and-long/2addr v10, v5

    const-wide/16 v12, 0x80

    cmp-long v10, v10, v12

    if-gez v10, :cond_0

    shl-int/lit8 v10, v4, 0x3

    add-int/2addr v10, v9

    aget-object v10, v1, v10

    check-cast v10, LV/R0;

    invoke-virtual {v10, p1}, LV/R0;->s(Ljava/lang/Object;)LV/a0;

    move-result-object v11

    sget-object v12, LV/a0;->F:LV/a0;

    if-ne v11, v12, :cond_0

    iget-object v11, p0, LV/u;->O:LX/f;

    invoke-virtual {v11, p1, v10}, LX/f;->a(Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_0
    shr-long/2addr v5, v8

    add-int/lit8 v9, v9, 0x1

    goto :goto_1

    :cond_1
    if-ne v7, v8, :cond_4

    :cond_2
    if-eq v4, v2, :cond_4

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_3
    check-cast v0, LV/R0;

    invoke-virtual {v0, p1}, LV/R0;->s(Ljava/lang/Object;)LV/a0;

    move-result-object v1

    sget-object v2, LV/a0;->F:LV/a0;

    if-ne v1, v2, :cond_4

    iget-object v1, p0, LV/u;->O:LX/f;

    invoke-virtual {v1, p1, v0}, LX/f;->a(Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_4
    return-void
.end method

.method private final J()Lg0/c;
    .locals 3

    .prologue
    iget-object v0, p0, LV/u;->T:LV/B;

    invoke-virtual {v0}, LV/B;->b()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    invoke-virtual {v0}, LV/B;->a()Lg0/c;

    goto :goto_0

    :cond_0
    iget-object v1, p0, LV/u;->C:LV/s;

    invoke-virtual {v1}, LV/s;->i()LV/B;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {v1}, LV/B;->a()Lg0/c;

    :cond_1
    invoke-virtual {v0}, LV/B;->a()Lg0/c;

    invoke-static {v2, v2}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    invoke-virtual {v0, v2}, LV/B;->c(Lg0/c;)V

    :cond_2
    :goto_0
    return-object v2
.end method

.method private final M()LX/f;
    .locals 2

    iget-object v0, p0, LV/u;->P:LX/f;

    new-instance v1, LX/f;

    invoke-direct {v1}, LX/f;-><init>()V

    iput-object v1, p0, LV/u;->P:LX/f;

    return-object v0
.end method

.method private final N(LV/R0;Ljava/lang/Object;)Z
    .locals 1

    .prologue
    invoke-virtual {p0}, LV/u;->p()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LV/u;->U:LV/o;

    invoke-virtual {v0, p1, p2}, LV/o;->p1(LV/R0;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public static final synthetic i(LV/u;)LX/f;
    .locals 0

    iget-object p0, p0, LV/u;->I:LX/f;

    return-object p0
.end method

.method private final o(Ljava/lang/Object;Z)V
    .locals 16

    .prologue
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    iget-object v2, v0, LV/u;->I:LX/f;

    invoke-virtual {v2}, LX/f;->d()Lr/K;

    move-result-object v2

    invoke-virtual {v2, v1}, Lr/U;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_6

    instance-of v3, v2, Lr/L;

    if-eqz v3, :cond_4

    check-cast v2, Lr/L;

    iget-object v3, v2, Lr/W;->b:[Ljava/lang/Object;

    iget-object v2, v2, Lr/W;->a:[J

    array-length v4, v2

    add-int/lit8 v4, v4, -0x2

    if-ltz v4, :cond_6

    const/4 v5, 0x0

    move v6, v5

    :goto_0
    aget-wide v7, v2, v6

    not-long v9, v7

    const/4 v11, 0x7

    shl-long/2addr v9, v11

    and-long/2addr v9, v7

    const-wide v11, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    and-long/2addr v9, v11

    cmp-long v9, v9, v11

    if-eqz v9, :cond_3

    sub-int v9, v6, v4

    not-int v9, v9

    ushr-int/lit8 v9, v9, 0x1f

    const/16 v10, 0x8

    rsub-int/lit8 v9, v9, 0x8

    move v11, v5

    :goto_1
    if-ge v11, v9, :cond_2

    const-wide/16 v12, 0xff

    and-long/2addr v12, v7

    const-wide/16 v14, 0x80

    cmp-long v12, v12, v14

    if-gez v12, :cond_1

    shl-int/lit8 v12, v6, 0x3

    add-int/2addr v12, v11

    aget-object v12, v3, v12

    check-cast v12, LV/R0;

    iget-object v13, v0, LV/u;->O:LX/f;

    invoke-virtual {v13, v1, v12}, LX/f;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_1

    invoke-virtual {v12, v1}, LV/R0;->s(Ljava/lang/Object;)LV/a0;

    move-result-object v13

    sget-object v14, LV/a0;->C:LV/a0;

    if-eq v13, v14, :cond_1

    invoke-virtual {v12}, LV/R0;->t()Z

    move-result v13

    if-eqz v13, :cond_0

    if-nez p2, :cond_0

    iget-object v13, v0, LV/u;->K:Lr/L;

    :goto_2
    invoke-virtual {v13, v12}, Lr/L;->h(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_0
    iget-object v13, v0, LV/u;->J:Lr/L;

    goto :goto_2

    :cond_1
    :goto_3
    shr-long/2addr v7, v10

    add-int/lit8 v11, v11, 0x1

    goto :goto_1

    :cond_2
    if-ne v9, v10, :cond_6

    :cond_3
    if-eq v6, v4, :cond_6

    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    :cond_4
    check-cast v2, LV/R0;

    iget-object v3, v0, LV/u;->O:LX/f;

    invoke-virtual {v3, v1, v2}, LX/f;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_6

    invoke-virtual {v2, v1}, LV/R0;->s(Ljava/lang/Object;)LV/a0;

    move-result-object v1

    sget-object v3, LV/a0;->C:LV/a0;

    if-eq v1, v3, :cond_6

    invoke-virtual {v2}, LV/R0;->t()Z

    move-result v1

    if-eqz v1, :cond_5

    if-nez p2, :cond_5

    iget-object v1, v0, LV/u;->K:Lr/L;

    :goto_4
    invoke-virtual {v1, v2}, Lr/L;->h(Ljava/lang/Object;)Z

    goto :goto_5

    :cond_5
    iget-object v1, v0, LV/u;->J:Lr/L;

    goto :goto_4

    :cond_6
    :goto_5
    return-void
.end method

.method private final y(Ljava/util/Set;Z)V
    .locals 34

    .prologue
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p2

    instance-of v3, v1, LX/d;

    const/4 v9, 0x7

    const-wide v10, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    const/16 v13, 0x8

    if-eqz v3, :cond_a

    check-cast v1, LX/d;

    invoke-virtual {v1}, LX/d;->d()Lr/W;

    move-result-object v1

    iget-object v3, v1, Lr/W;->b:[Ljava/lang/Object;

    iget-object v1, v1, Lr/W;->a:[J

    array-length v14, v1

    add-int/lit8 v14, v14, -0x2

    if-ltz v14, :cond_11

    const/4 v15, 0x0

    :goto_0
    aget-wide v4, v1, v15

    not-long v7, v4

    shl-long v6, v7, v9

    and-long/2addr v6, v4

    and-long/2addr v6, v10

    cmp-long v6, v6, v10

    if-eqz v6, :cond_9

    sub-int v6, v15, v14

    not-int v6, v6

    ushr-int/lit8 v6, v6, 0x1f

    rsub-int/lit8 v6, v6, 0x8

    const/4 v7, 0x0

    :goto_1
    if-ge v7, v6, :cond_8

    const-wide/16 v19, 0xff

    and-long v21, v4, v19

    const-wide/16 v17, 0x80

    cmp-long v8, v21, v17

    if-gez v8, :cond_7

    shl-int/lit8 v8, v15, 0x3

    add-int/2addr v8, v7

    aget-object v8, v3, v8

    instance-of v12, v8, LV/R0;

    if-eqz v12, :cond_1

    check-cast v8, LV/R0;

    const/4 v12, 0x0

    invoke-virtual {v8, v12}, LV/R0;->s(Ljava/lang/Object;)LV/a0;

    :cond_0
    move/from16 v25, v6

    move/from16 v26, v7

    move/from16 p1, v14

    move v11, v15

    goto/16 :goto_4

    :cond_1
    invoke-direct {v0, v8, v2}, LV/u;->o(Ljava/lang/Object;Z)V

    iget-object v12, v0, LV/u;->L:LX/f;

    invoke-virtual {v12}, LX/f;->d()Lr/K;

    move-result-object v12

    invoke-virtual {v12, v8}, Lr/U;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    if-eqz v8, :cond_0

    instance-of v12, v8, Lr/L;

    if-eqz v12, :cond_5

    check-cast v8, Lr/L;

    iget-object v12, v8, Lr/W;->b:[Ljava/lang/Object;

    iget-object v8, v8, Lr/W;->a:[J

    array-length v13, v8

    add-int/lit8 v13, v13, -0x2

    if-ltz v13, :cond_0

    move/from16 p1, v14

    move v11, v15

    const/4 v10, 0x0

    :goto_2
    aget-wide v14, v8, v10

    move/from16 v25, v6

    move/from16 v26, v7

    not-long v6, v14

    shl-long/2addr v6, v9

    and-long/2addr v6, v14

    const-wide v23, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    and-long v6, v6, v23

    cmp-long v6, v6, v23

    if-eqz v6, :cond_4

    sub-int v6, v10, v13

    not-int v6, v6

    ushr-int/lit8 v6, v6, 0x1f

    const/16 v7, 0x8

    rsub-int/lit8 v6, v6, 0x8

    const/4 v7, 0x0

    :goto_3
    if-ge v7, v6, :cond_3

    const-wide/16 v19, 0xff

    and-long v27, v14, v19

    const-wide/16 v17, 0x80

    cmp-long v27, v27, v17

    if-gez v27, :cond_2

    shl-int/lit8 v27, v10, 0x3

    add-int v27, v27, v7

    aget-object v27, v12, v27

    move-object/from16 v9, v27

    check-cast v9, LV/J;

    invoke-direct {v0, v9, v2}, LV/u;->o(Ljava/lang/Object;Z)V

    :cond_2
    const/16 v9, 0x8

    shr-long/2addr v14, v9

    add-int/lit8 v7, v7, 0x1

    const/4 v9, 0x7

    goto :goto_3

    :cond_3
    const/16 v9, 0x8

    if-ne v6, v9, :cond_6

    :cond_4
    if-eq v10, v13, :cond_6

    add-int/lit8 v10, v10, 0x1

    move/from16 v6, v25

    move/from16 v7, v26

    const/4 v9, 0x7

    goto :goto_2

    :cond_5
    move/from16 v25, v6

    move/from16 v26, v7

    move/from16 p1, v14

    move v11, v15

    check-cast v8, LV/J;

    invoke-direct {v0, v8, v2}, LV/u;->o(Ljava/lang/Object;Z)V

    :cond_6
    :goto_4
    const/16 v6, 0x8

    goto :goto_5

    :cond_7
    move/from16 v25, v6

    move/from16 v26, v7

    move/from16 p1, v14

    move v11, v15

    move v6, v13

    :goto_5
    shr-long/2addr v4, v6

    add-int/lit8 v7, v26, 0x1

    move/from16 v14, p1

    move v13, v6

    move v15, v11

    move/from16 v6, v25

    const/4 v9, 0x7

    const-wide v10, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    goto/16 :goto_1

    :cond_8
    move/from16 p1, v14

    move v11, v15

    move/from16 v33, v13

    move v13, v6

    move/from16 v6, v33

    if-ne v13, v6, :cond_11

    move/from16 v14, p1

    goto :goto_6

    :cond_9
    move v11, v15

    :goto_6
    if-eq v11, v14, :cond_11

    add-int/lit8 v15, v11, 0x1

    const/4 v9, 0x7

    const-wide v10, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    const/16 v13, 0x8

    goto/16 :goto_0

    :cond_a
    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_b
    :goto_7
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_11

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    instance-of v4, v3, LV/R0;

    if-eqz v4, :cond_c

    check-cast v3, LV/R0;

    const/4 v4, 0x0

    invoke-virtual {v3, v4}, LV/R0;->s(Ljava/lang/Object;)LV/a0;

    goto :goto_7

    :cond_c
    const/4 v4, 0x0

    invoke-direct {v0, v3, v2}, LV/u;->o(Ljava/lang/Object;Z)V

    iget-object v5, v0, LV/u;->L:LX/f;

    invoke-virtual {v5}, LX/f;->d()Lr/K;

    move-result-object v5

    invoke-virtual {v5, v3}, Lr/U;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    if-eqz v3, :cond_b

    instance-of v5, v3, Lr/L;

    if-eqz v5, :cond_10

    check-cast v3, Lr/L;

    iget-object v5, v3, Lr/W;->b:[Ljava/lang/Object;

    iget-object v3, v3, Lr/W;->a:[J

    array-length v6, v3

    add-int/lit8 v6, v6, -0x2

    if-ltz v6, :cond_b

    const/4 v7, 0x0

    :goto_8
    aget-wide v8, v3, v7

    not-long v10, v8

    const/4 v12, 0x7

    shl-long/2addr v10, v12

    and-long/2addr v10, v8

    const-wide v12, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    and-long/2addr v10, v12

    cmp-long v10, v10, v12

    if-eqz v10, :cond_f

    sub-int v10, v7, v6

    not-int v10, v10

    ushr-int/lit8 v10, v10, 0x1f

    const/16 v11, 0x8

    rsub-int/lit8 v13, v10, 0x8

    const/4 v10, 0x0

    :goto_9
    if-ge v10, v13, :cond_e

    const-wide/16 v11, 0xff

    and-long v14, v8, v11

    const-wide/16 v11, 0x80

    cmp-long v14, v14, v11

    if-gez v14, :cond_d

    shl-int/lit8 v11, v7, 0x3

    add-int/2addr v11, v10

    aget-object v11, v5, v11

    check-cast v11, LV/J;

    invoke-direct {v0, v11, v2}, LV/u;->o(Ljava/lang/Object;Z)V

    :cond_d
    const/16 v11, 0x8

    shr-long/2addr v8, v11

    add-int/lit8 v10, v10, 0x1

    goto :goto_9

    :cond_e
    const/16 v11, 0x8

    if-ne v13, v11, :cond_b

    :cond_f
    if-eq v7, v6, :cond_b

    add-int/lit8 v7, v7, 0x1

    goto :goto_8

    :cond_10
    check-cast v3, LV/J;

    invoke-direct {v0, v3, v2}, LV/u;->o(Ljava/lang/Object;Z)V

    goto :goto_7

    :cond_11
    iget-object v1, v0, LV/u;->K:Lr/L;

    iget-object v3, v0, LV/u;->J:Lr/L;

    const-string v4, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$2"

    const-string v5, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$2>"

    if-eqz v2, :cond_21

    invoke-virtual {v1}, Lr/W;->e()Z

    move-result v2

    if-eqz v2, :cond_21

    iget-object v2, v0, LV/u;->I:LX/f;

    invoke-virtual {v2}, LX/f;->d()Lr/K;

    move-result-object v2

    iget-object v7, v2, Lr/U;->a:[J

    array-length v8, v7

    add-int/lit8 v8, v8, -0x2

    if-ltz v8, :cond_20

    const/4 v9, 0x0

    :goto_a
    aget-wide v10, v7, v9

    not-long v12, v10

    const/4 v14, 0x7

    shl-long/2addr v12, v14

    and-long/2addr v12, v10

    const-wide v14, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    and-long/2addr v12, v14

    cmp-long v12, v12, v14

    if-eqz v12, :cond_1f

    sub-int v12, v9, v8

    not-int v12, v12

    ushr-int/lit8 v12, v12, 0x1f

    const/16 v13, 0x8

    rsub-int/lit8 v12, v12, 0x8

    const/4 v13, 0x0

    :goto_b
    if-ge v13, v12, :cond_1e

    const-wide/16 v14, 0xff

    and-long v25, v10, v14

    const-wide/16 v14, 0x80

    cmp-long v16, v25, v14

    if-gez v16, :cond_1d

    shl-int/lit8 v14, v9, 0x3

    add-int/2addr v14, v13

    iget-object v15, v2, Lr/U;->b:[Ljava/lang/Object;

    aget-object v15, v15, v14

    iget-object v15, v2, Lr/U;->c:[Ljava/lang/Object;

    aget-object v15, v15, v14

    instance-of v6, v15, Lr/L;

    if-eqz v6, :cond_19

    invoke-static {v15, v5}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v15, Lr/L;

    iget-object v6, v15, Lr/W;->b:[Ljava/lang/Object;

    move-object/from16 v16, v7

    iget-object v7, v15, Lr/W;->a:[J

    move-object/from16 v25, v5

    array-length v5, v7

    add-int/lit8 v5, v5, -0x2

    move/from16 p2, v8

    move/from16 v26, v9

    if-ltz v5, :cond_17

    const/4 v0, 0x0

    :goto_c
    aget-wide v8, v7, v0

    move/from16 v27, v12

    move/from16 v29, v13

    not-long v12, v8

    const/16 v28, 0x7

    shl-long v12, v12, v28

    and-long/2addr v12, v8

    const-wide v23, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    and-long v12, v12, v23

    cmp-long v12, v12, v23

    if-eqz v12, :cond_16

    sub-int v12, v0, v5

    not-int v12, v12

    ushr-int/lit8 v12, v12, 0x1f

    const/16 v13, 0x8

    rsub-int/lit8 v12, v12, 0x8

    const/4 v13, 0x0

    :goto_d
    if-ge v13, v12, :cond_15

    const-wide/16 v19, 0xff

    and-long v30, v8, v19

    const-wide/16 v17, 0x80

    cmp-long v30, v30, v17

    if-gez v30, :cond_14

    shl-int/lit8 v30, v0, 0x3

    move-object/from16 v31, v7

    add-int v7, v30, v13

    aget-object v30, v6, v7

    move-object/from16 v32, v6

    move-object/from16 v6, v30

    check-cast v6, LV/R0;

    invoke-virtual {v1, v6}, Lr/W;->a(Ljava/lang/Object;)Z

    move-result v30

    if-nez v30, :cond_12

    invoke-virtual {v3, v6}, Lr/W;->a(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_13

    :cond_12
    invoke-virtual {v15, v7}, Lr/L;->y(I)V

    :cond_13
    :goto_e
    const/16 v6, 0x8

    goto :goto_f

    :cond_14
    move-object/from16 v32, v6

    move-object/from16 v31, v7

    goto :goto_e

    :goto_f
    shr-long/2addr v8, v6

    add-int/lit8 v13, v13, 0x1

    move-object/from16 v7, v31

    move-object/from16 v6, v32

    goto :goto_d

    :cond_15
    move-object/from16 v32, v6

    move-object/from16 v31, v7

    const/16 v6, 0x8

    if-ne v12, v6, :cond_18

    goto :goto_10

    :cond_16
    move-object/from16 v32, v6

    move-object/from16 v31, v7

    :goto_10
    if-eq v0, v5, :cond_18

    add-int/lit8 v0, v0, 0x1

    move/from16 v12, v27

    move/from16 v13, v29

    move-object/from16 v7, v31

    move-object/from16 v6, v32

    goto :goto_c

    :cond_17
    move/from16 v27, v12

    move/from16 v29, v13

    :cond_18
    invoke-virtual {v15}, Lr/W;->d()Z

    move-result v0

    goto :goto_12

    :cond_19
    move-object/from16 v25, v5

    move-object/from16 v16, v7

    move/from16 p2, v8

    move/from16 v26, v9

    move/from16 v27, v12

    move/from16 v29, v13

    invoke-static {v15, v4}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v15, LV/R0;

    invoke-virtual {v1, v15}, Lr/W;->a(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1b

    invoke-virtual {v3, v15}, Lr/W;->a(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1a

    goto :goto_11

    :cond_1a
    const/4 v0, 0x0

    goto :goto_12

    :cond_1b
    :goto_11
    const/4 v0, 0x1

    :goto_12
    if-eqz v0, :cond_1c

    invoke-virtual {v2, v14}, Lr/K;->q(I)Ljava/lang/Object;

    :cond_1c
    :goto_13
    const/16 v0, 0x8

    goto :goto_14

    :cond_1d
    move-object/from16 v25, v5

    move-object/from16 v16, v7

    move/from16 p2, v8

    move/from16 v26, v9

    move/from16 v27, v12

    move/from16 v29, v13

    goto :goto_13

    :goto_14
    shr-long/2addr v10, v0

    add-int/lit8 v13, v29, 0x1

    move-object/from16 v0, p0

    move/from16 v8, p2

    move-object/from16 v7, v16

    move-object/from16 v5, v25

    move/from16 v9, v26

    move/from16 v12, v27

    goto/16 :goto_b

    :cond_1e
    move-object/from16 v25, v5

    move-object/from16 v16, v7

    move/from16 p2, v8

    move/from16 v26, v9

    move v13, v12

    const/16 v0, 0x8

    if-ne v13, v0, :cond_20

    move/from16 v8, p2

    move/from16 v0, v26

    goto :goto_15

    :cond_1f
    move-object/from16 v25, v5

    move-object/from16 v16, v7

    move v0, v9

    :goto_15
    if-eq v0, v8, :cond_20

    add-int/lit8 v9, v0, 0x1

    move-object/from16 v0, p0

    move-object/from16 v7, v16

    move-object/from16 v5, v25

    goto/16 :goto_a

    :cond_20
    invoke-virtual {v1}, Lr/L;->m()V

    invoke-direct/range {p0 .. p0}, LV/u;->B()V

    goto/16 :goto_23

    :cond_21
    move-object/from16 v25, v5

    invoke-virtual {v3}, Lr/W;->e()Z

    move-result v0

    if-eqz v0, :cond_30

    move-object/from16 v0, p0

    iget-object v1, v0, LV/u;->I:LX/f;

    invoke-virtual {v1}, LX/f;->d()Lr/K;

    move-result-object v1

    iget-object v2, v1, Lr/U;->a:[J

    array-length v5, v2

    add-int/lit8 v5, v5, -0x2

    if-ltz v5, :cond_2f

    const/4 v6, 0x0

    :goto_16
    aget-wide v7, v2, v6

    not-long v9, v7

    const/4 v11, 0x7

    shl-long/2addr v9, v11

    and-long/2addr v9, v7

    const-wide v11, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    and-long/2addr v9, v11

    cmp-long v9, v9, v11

    if-eqz v9, :cond_2e

    sub-int v9, v6, v5

    not-int v9, v9

    ushr-int/lit8 v9, v9, 0x1f

    const/16 v10, 0x8

    rsub-int/lit8 v13, v9, 0x8

    const/4 v9, 0x0

    :goto_17
    if-ge v9, v13, :cond_2d

    const-wide/16 v10, 0xff

    and-long v14, v7, v10

    const-wide/16 v10, 0x80

    cmp-long v12, v14, v10

    if-gez v12, :cond_22

    const/4 v10, 0x1

    goto :goto_18

    :cond_22
    const/4 v10, 0x0

    :goto_18
    if-eqz v10, :cond_2c

    shl-int/lit8 v10, v6, 0x3

    add-int/2addr v10, v9

    iget-object v11, v1, Lr/U;->b:[Ljava/lang/Object;

    aget-object v11, v11, v10

    iget-object v11, v1, Lr/U;->c:[Ljava/lang/Object;

    aget-object v11, v11, v10

    instance-of v12, v11, Lr/L;

    if-eqz v12, :cond_2a

    move-object/from16 v12, v25

    invoke-static {v11, v12}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v11, Lr/L;

    iget-object v14, v11, Lr/W;->b:[Ljava/lang/Object;

    iget-object v15, v11, Lr/W;->a:[J

    array-length v0, v15

    add-int/lit8 v0, v0, -0x2

    move-object/from16 v16, v2

    move/from16 p2, v5

    move/from16 v25, v6

    if-ltz v0, :cond_28

    const/4 v2, 0x0

    :goto_19
    aget-wide v5, v15, v2

    move-object/from16 v27, v12

    move/from16 v26, v13

    not-long v12, v5

    const/16 v28, 0x7

    shl-long v12, v12, v28

    and-long/2addr v12, v5

    const-wide v23, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    and-long v12, v12, v23

    cmp-long v12, v12, v23

    if-eqz v12, :cond_27

    sub-int v12, v2, v0

    not-int v12, v12

    ushr-int/lit8 v12, v12, 0x1f

    const/16 v13, 0x8

    rsub-int/lit8 v12, v12, 0x8

    const/4 v13, 0x0

    :goto_1a
    if-ge v13, v12, :cond_26

    const-wide/16 v19, 0xff

    and-long v29, v5, v19

    const-wide/16 v17, 0x80

    cmp-long v29, v29, v17

    if-gez v29, :cond_23

    const/16 v29, 0x1

    goto :goto_1b

    :cond_23
    const/16 v29, 0x0

    :goto_1b
    if-eqz v29, :cond_25

    shl-int/lit8 v29, v2, 0x3

    move-object/from16 v30, v15

    add-int v15, v29, v13

    aget-object v29, v14, v15

    move-object/from16 v31, v14

    move-object/from16 v14, v29

    check-cast v14, LV/R0;

    invoke-virtual {v3, v14}, Lr/W;->a(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_24

    invoke-virtual {v11, v15}, Lr/L;->y(I)V

    :cond_24
    :goto_1c
    const/16 v14, 0x8

    goto :goto_1d

    :cond_25
    move-object/from16 v31, v14

    move-object/from16 v30, v15

    goto :goto_1c

    :goto_1d
    shr-long/2addr v5, v14

    add-int/lit8 v13, v13, 0x1

    move-object/from16 v15, v30

    move-object/from16 v14, v31

    goto :goto_1a

    :cond_26
    move-object/from16 v31, v14

    move-object/from16 v30, v15

    const/16 v14, 0x8

    const-wide/16 v17, 0x80

    const-wide/16 v19, 0xff

    if-ne v12, v14, :cond_29

    goto :goto_1e

    :cond_27
    move-object/from16 v31, v14

    move-object/from16 v30, v15

    const-wide/16 v17, 0x80

    const-wide/16 v19, 0xff

    :goto_1e
    if-eq v2, v0, :cond_29

    add-int/lit8 v2, v2, 0x1

    move/from16 v13, v26

    move-object/from16 v12, v27

    move-object/from16 v15, v30

    move-object/from16 v14, v31

    goto :goto_19

    :cond_28
    move-object/from16 v27, v12

    move/from16 v26, v13

    const-wide/16 v17, 0x80

    const-wide/16 v19, 0xff

    const-wide v23, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    const/16 v28, 0x7

    :cond_29
    invoke-virtual {v11}, Lr/W;->d()Z

    move-result v0

    goto :goto_1f

    :cond_2a
    move-object/from16 v16, v2

    move/from16 p2, v5

    move/from16 v26, v13

    move-object/from16 v27, v25

    const-wide/16 v17, 0x80

    const-wide/16 v19, 0xff

    const-wide v23, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    const/16 v28, 0x7

    move/from16 v25, v6

    invoke-static {v11, v4}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v11, LV/R0;

    invoke-virtual {v3, v11}, Lr/W;->a(Ljava/lang/Object;)Z

    move-result v0

    :goto_1f
    if-eqz v0, :cond_2b

    invoke-virtual {v1, v10}, Lr/K;->q(I)Ljava/lang/Object;

    :cond_2b
    :goto_20
    const/16 v0, 0x8

    goto :goto_21

    :cond_2c
    move-object/from16 v16, v2

    move/from16 p2, v5

    move/from16 v26, v13

    move-object/from16 v27, v25

    const-wide/16 v17, 0x80

    const-wide/16 v19, 0xff

    const-wide v23, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    const/16 v28, 0x7

    move/from16 v25, v6

    goto :goto_20

    :goto_21
    shr-long/2addr v7, v0

    add-int/lit8 v9, v9, 0x1

    move-object/from16 v0, p0

    move/from16 v5, p2

    move-object/from16 v2, v16

    move/from16 v6, v25

    move/from16 v13, v26

    move-object/from16 v25, v27

    goto/16 :goto_17

    :cond_2d
    move-object/from16 v16, v2

    move/from16 p2, v5

    move-object/from16 v27, v25

    const/16 v0, 0x8

    const-wide/16 v17, 0x80

    const-wide/16 v19, 0xff

    const-wide v23, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    const/16 v28, 0x7

    move/from16 v25, v6

    if-ne v13, v0, :cond_2f

    move/from16 v5, p2

    move/from16 v2, v25

    goto :goto_22

    :cond_2e
    move-object/from16 v16, v2

    move-object/from16 v27, v25

    const/16 v0, 0x8

    const-wide/16 v17, 0x80

    const-wide/16 v19, 0xff

    const-wide v23, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    const/16 v28, 0x7

    move v2, v6

    :goto_22
    if-eq v2, v5, :cond_2f

    add-int/lit8 v6, v2, 0x1

    move-object/from16 v0, p0

    move-object/from16 v2, v16

    move-object/from16 v25, v27

    goto/16 :goto_16

    :cond_2f
    invoke-direct/range {p0 .. p0}, LV/u;->B()V

    invoke-virtual {v3}, Lr/L;->m()V

    :cond_30
    :goto_23
    return-void
.end method


# virtual methods
.method public final G()LV/B;
    .locals 1

    iget-object v0, p0, LV/u;->T:LV/B;

    return-object v0
.end method

.method public final K(LV/J;)V
    .locals 1

    .prologue
    iget-object v0, p0, LV/u;->I:LX/f;

    invoke-virtual {v0, p1}, LX/f;->c(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, LV/u;->L:LX/f;

    invoke-virtual {v0, p1}, LX/f;->g(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public final L(Ljava/lang/Object;LV/R0;)V
    .locals 1

    iget-object v0, p0, LV/u;->I:LX/f;

    invoke-virtual {v0, p1, p2}, LX/f;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    return-void
.end method

.method public a(Ljava/lang/Object;)V
    .locals 20

    .prologue
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-direct/range {p0 .. p0}, LV/u;->F()Z

    move-result v2

    if-nez v2, :cond_6

    iget-object v2, v0, LV/u;->U:LV/o;

    invoke-virtual {v2}, LV/o;->D0()LV/R0;

    move-result-object v2

    if-eqz v2, :cond_6

    const/4 v3, 0x1

    invoke-virtual {v2, v3}, LV/R0;->H(Z)V

    invoke-virtual {v2, v1}, LV/R0;->w(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_6

    instance-of v4, v1, Lf0/z;

    if-eqz v4, :cond_0

    move-object v4, v1

    check-cast v4, Lf0/z;

    invoke-static {v3}, Lf0/g;->a(I)I

    move-result v5

    invoke-virtual {v4, v5}, Lf0/z;->r(I)V

    :cond_0
    iget-object v4, v0, LV/u;->I:LX/f;

    invoke-virtual {v4, v1, v2}, LX/f;->a(Ljava/lang/Object;Ljava/lang/Object;)V

    instance-of v4, v1, LV/J;

    if-eqz v4, :cond_6

    move-object v4, v1

    check-cast v4, LV/J;

    invoke-interface {v4}, LV/J;->p()LV/J$a;

    move-result-object v5

    iget-object v6, v0, LV/u;->L:LX/f;

    invoke-virtual {v6, v1}, LX/f;->g(Ljava/lang/Object;)V

    invoke-interface {v5}, LV/J$a;->b()Lr/N;

    move-result-object v6

    iget-object v7, v6, Lr/N;->b:[Ljava/lang/Object;

    iget-object v6, v6, Lr/N;->a:[J

    array-length v8, v6

    add-int/lit8 v8, v8, -0x2

    if-ltz v8, :cond_5

    const/4 v10, 0x0

    :goto_0
    aget-wide v11, v6, v10

    not-long v13, v11

    const/4 v15, 0x7

    shl-long/2addr v13, v15

    and-long/2addr v13, v11

    const-wide v15, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    and-long/2addr v13, v15

    cmp-long v13, v13, v15

    if-eqz v13, :cond_4

    sub-int v13, v10, v8

    not-int v13, v13

    ushr-int/lit8 v13, v13, 0x1f

    const/16 v14, 0x8

    rsub-int/lit8 v13, v13, 0x8

    const/4 v15, 0x0

    :goto_1
    if-ge v15, v13, :cond_3

    const-wide/16 v16, 0xff

    and-long v16, v11, v16

    const-wide/16 v18, 0x80

    cmp-long v16, v16, v18

    if-gez v16, :cond_2

    shl-int/lit8 v16, v10, 0x3

    add-int v16, v16, v15

    aget-object v16, v7, v16

    move-object/from16 v9, v16

    check-cast v9, Lf0/y;

    instance-of v14, v9, Lf0/z;

    if-eqz v14, :cond_1

    move-object v14, v9

    check-cast v14, Lf0/z;

    move-object/from16 v18, v6

    invoke-static {v3}, Lf0/g;->a(I)I

    move-result v6

    invoke-virtual {v14, v6}, Lf0/z;->r(I)V

    goto :goto_2

    :cond_1
    move-object/from16 v18, v6

    :goto_2
    iget-object v6, v0, LV/u;->L:LX/f;

    invoke-virtual {v6, v9, v1}, LX/f;->a(Ljava/lang/Object;Ljava/lang/Object;)V

    const/16 v6, 0x8

    goto :goto_3

    :cond_2
    move-object/from16 v18, v6

    move v6, v14

    :goto_3
    shr-long/2addr v11, v6

    add-int/lit8 v15, v15, 0x1

    move v14, v6

    move-object/from16 v6, v18

    goto :goto_1

    :cond_3
    move-object/from16 v18, v6

    move v6, v14

    if-ne v13, v6, :cond_5

    goto :goto_4

    :cond_4
    move-object/from16 v18, v6

    :goto_4
    if-eq v10, v8, :cond_5

    add-int/lit8 v10, v10, 0x1

    move-object/from16 v6, v18

    goto :goto_0

    :cond_5
    invoke-interface {v5}, LV/J$a;->a()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v2, v4, v1}, LV/R0;->v(LV/J;Ljava/lang/Object;)V

    :cond_6
    return-void
.end method

.method public b(Lx7/a;)V
    .locals 1

    iget-object v0, p0, LV/u;->U:LV/o;

    invoke-virtual {v0, p1}, LV/o;->R0(Lx7/a;)V

    return-void
.end method

.method public c(Ljava/util/Set;)Z
    .locals 14

    .prologue
    instance-of v0, p1, LX/d;

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_4

    check-cast p1, LX/d;

    invoke-virtual {p1}, LX/d;->d()Lr/W;

    move-result-object p1

    iget-object v0, p1, Lr/W;->b:[Ljava/lang/Object;

    iget-object p1, p1, Lr/W;->a:[J

    array-length v3, p1

    add-int/lit8 v3, v3, -0x2

    if-ltz v3, :cond_7

    move v4, v1

    :goto_0
    aget-wide v5, p1, v4

    not-long v7, v5

    const/4 v9, 0x7

    shl-long/2addr v7, v9

    and-long/2addr v7, v5

    const-wide v9, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    and-long/2addr v7, v9

    cmp-long v7, v7, v9

    if-eqz v7, :cond_3

    sub-int v7, v4, v3

    not-int v7, v7

    ushr-int/lit8 v7, v7, 0x1f

    const/16 v8, 0x8

    rsub-int/lit8 v7, v7, 0x8

    move v9, v1

    :goto_1
    if-ge v9, v7, :cond_2

    const-wide/16 v10, 0xff

    and-long/2addr v10, v5

    const-wide/16 v12, 0x80

    cmp-long v10, v10, v12

    if-gez v10, :cond_1

    shl-int/lit8 v10, v4, 0x3

    add-int/2addr v10, v9

    aget-object v10, v0, v10

    iget-object v11, p0, LV/u;->I:LX/f;

    invoke-virtual {v11, v10}, LX/f;->c(Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_0

    iget-object v11, p0, LV/u;->L:LX/f;

    invoke-virtual {v11, v10}, LX/f;->c(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_1

    :cond_0
    return v2

    :cond_1
    shr-long/2addr v5, v8

    add-int/lit8 v9, v9, 0x1

    goto :goto_1

    :cond_2
    if-ne v7, v8, :cond_7

    :cond_3
    if-eq v4, v3, :cond_7

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_4
    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_5
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    iget-object v3, p0, LV/u;->I:LX/f;

    invoke-virtual {v3, v0}, LX/f;->c(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_6

    iget-object v3, p0, LV/u;->L:LX/f;

    invoke-virtual {v3, v0}, LX/f;->c(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    :cond_6
    return v2

    :cond_7
    return v1
.end method

.method public d(LV/n0;)V
    .locals 2

    .prologue
    new-instance v0, LV/u$a;

    iget-object v1, p0, LV/u;->G:Ljava/util/Set;

    invoke-direct {v0, v1}, LV/u$a;-><init>(Ljava/util/Set;)V

    invoke-virtual {p1}, LV/n0;->a()LV/h1;

    move-result-object p1

    invoke-virtual {p1}, LV/h1;->V()LV/k1;

    move-result-object p1

    :try_start_0
    invoke-static {p1, v0}, LV/q;->K(LV/k1;LV/Y0;)V

    sget-object v1, Li7/M;->a:Li7/M;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v1, 0x1

    invoke-virtual {p1, v1}, LV/k1;->L(Z)V

    invoke-virtual {v0}, LV/u$a;->g()V

    return-void

    :catchall_0
    move-exception v0

    const/4 v1, 0x0

    invoke-virtual {p1, v1}, LV/k1;->L(Z)V

    throw v0
.end method

.method public deactivate()V
    .locals 8

    .prologue
    iget-object v0, p0, LV/u;->F:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, LV/u;->H:LV/h1;

    invoke-virtual {v1}, LV/h1;->N()I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-lez v1, :cond_0

    move v1, v3

    goto :goto_0

    :cond_0
    move v1, v2

    :goto_0
    if-nez v1, :cond_1

    iget-object v4, p0, LV/u;->G:Ljava/util/Set;

    check-cast v4, Ljava/util/Collection;

    invoke-interface {v4}, Ljava/util/Collection;->isEmpty()Z

    move-result v4

    xor-int/2addr v4, v3

    if-eqz v4, :cond_3

    goto :goto_1

    :catchall_0
    move-exception v1

    goto :goto_4

    :cond_1
    :goto_1
    const-string v4, "Compose:deactivate"

    sget-object v5, LV/K1;->a:LV/K1;

    invoke-virtual {v5, v4}, LV/K1;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    new-instance v6, LV/u$a;

    iget-object v7, p0, LV/u;->G:Ljava/util/Set;

    invoke-direct {v6, v7}, LV/u$a;-><init>(Ljava/util/Set;)V

    if-eqz v1, :cond_2

    iget-object v1, p0, LV/u;->D:LV/g;

    invoke-interface {v1}, LV/g;->e()V

    iget-object v1, p0, LV/u;->H:LV/h1;

    invoke-virtual {v1}, LV/h1;->V()LV/k1;

    move-result-object v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    invoke-static {v1, v6}, LV/q;->t(LV/k1;LV/Y0;)V

    sget-object v2, Li7/M;->a:Li7/M;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    :try_start_3
    invoke-virtual {v1, v3}, LV/k1;->L(Z)V

    iget-object v1, p0, LV/u;->D:LV/g;

    invoke-interface {v1}, LV/g;->i()V

    invoke-virtual {v6}, LV/u$a;->g()V

    goto :goto_2

    :catchall_1
    move-exception v1

    goto :goto_3

    :catchall_2
    move-exception v3

    invoke-virtual {v1, v2}, LV/k1;->L(Z)V

    throw v3

    :cond_2
    :goto_2
    invoke-virtual {v6}, LV/u$a;->f()V

    sget-object v1, Li7/M;->a:Li7/M;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :try_start_4
    invoke-virtual {v5, v4}, LV/K1;->b(Ljava/lang/Object;)V

    :cond_3
    iget-object v1, p0, LV/u;->I:LX/f;

    invoke-virtual {v1}, LX/f;->b()V

    iget-object v1, p0, LV/u;->L:LX/f;

    invoke-virtual {v1}, LX/f;->b()V

    iget-object v1, p0, LV/u;->P:LX/f;

    invoke-virtual {v1}, LX/f;->b()V

    iget-object v1, p0, LV/u;->M:LW/a;

    invoke-virtual {v1}, LW/a;->a()V

    iget-object v1, p0, LV/u;->N:LW/a;

    invoke-virtual {v1}, LW/a;->a()V

    iget-object v1, p0, LV/u;->U:LV/o;

    invoke-virtual {v1}, LV/o;->o0()V

    sget-object v1, Li7/M;->a:Li7/M;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    monitor-exit v0

    return-void

    :goto_3
    :try_start_5
    sget-object v2, LV/K1;->a:LV/K1;

    invoke-virtual {v2, v4}, LV/K1;->b(Ljava/lang/Object;)V

    throw v1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    :goto_4
    monitor-exit v0

    throw v1
.end method

.method public e()V
    .locals 6

    .prologue
    iget-object v0, p0, LV/u;->F:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, LV/u;->U:LV/o;

    invoke-virtual {v1}, LV/o;->M0()Z

    move-result v1

    const/4 v2, 0x1

    xor-int/2addr v1, v2

    if-nez v1, :cond_0

    const-string v1, "Composition is disposed while composing. If dispose is triggered by a call in @Composable function, consider wrapping it with SideEffect block."

    invoke-static {v1}, LV/I0;->b(Ljava/lang/String;)V

    goto :goto_0

    :catchall_0
    move-exception v1

    goto/16 :goto_3

    :cond_0
    :goto_0
    iget-boolean v1, p0, LV/u;->X:Z

    if-nez v1, :cond_6

    iput-boolean v2, p0, LV/u;->X:Z

    sget-object v1, LV/j;->a:LV/j;

    invoke-virtual {v1}, LV/j;->b()Lx7/p;

    move-result-object v1

    iput-object v1, p0, LV/u;->Y:Lx7/p;

    iget-object v1, p0, LV/u;->U:LV/o;

    invoke-virtual {v1}, LV/o;->E0()LW/a;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-direct {p0, v1}, LV/u;->A(LW/a;)V

    :cond_1
    iget-object v1, p0, LV/u;->H:LV/h1;

    invoke-virtual {v1}, LV/h1;->N()I

    move-result v1

    const/4 v3, 0x0

    if-lez v1, :cond_2

    move v1, v2

    goto :goto_1

    :cond_2
    move v1, v3

    :goto_1
    if-nez v1, :cond_3

    iget-object v4, p0, LV/u;->G:Ljava/util/Set;

    check-cast v4, Ljava/util/Collection;

    invoke-interface {v4}, Ljava/util/Collection;->isEmpty()Z

    move-result v4

    xor-int/2addr v4, v2

    if-eqz v4, :cond_5

    :cond_3
    new-instance v4, LV/u$a;

    iget-object v5, p0, LV/u;->G:Ljava/util/Set;

    invoke-direct {v4, v5}, LV/u$a;-><init>(Ljava/util/Set;)V

    if-eqz v1, :cond_4

    iget-object v1, p0, LV/u;->D:LV/g;

    invoke-interface {v1}, LV/g;->e()V

    iget-object v1, p0, LV/u;->H:LV/h1;

    invoke-virtual {v1}, LV/h1;->V()LV/k1;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    invoke-static {v1, v4}, LV/q;->K(LV/k1;LV/Y0;)V

    sget-object v3, Li7/M;->a:Li7/M;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    invoke-virtual {v1, v2}, LV/k1;->L(Z)V

    iget-object v1, p0, LV/u;->D:LV/g;

    invoke-interface {v1}, LV/g;->clear()V

    iget-object v1, p0, LV/u;->D:LV/g;

    invoke-interface {v1}, LV/g;->i()V

    invoke-virtual {v4}, LV/u$a;->g()V

    goto :goto_2

    :catchall_1
    move-exception v2

    invoke-virtual {v1, v3}, LV/k1;->L(Z)V

    throw v2

    :cond_4
    :goto_2
    invoke-virtual {v4}, LV/u$a;->f()V

    :cond_5
    iget-object v1, p0, LV/u;->U:LV/o;

    invoke-virtual {v1}, LV/o;->p0()V

    :cond_6
    sget-object v1, Li7/M;->a:Li7/M;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    monitor-exit v0

    iget-object v0, p0, LV/u;->C:LV/s;

    invoke-virtual {v0, p0}, LV/s;->r(LV/G;)V

    return-void

    :goto_3
    monitor-exit v0

    throw v1
.end method

.method public f(LV/R0;)V
    .locals 0

    const/4 p1, 0x1

    iput-boolean p1, p0, LV/u;->Q:Z

    return-void
.end method

.method public g(LV/R0;Ljava/lang/Object;)LV/a0;
    .locals 3

    .prologue
    invoke-virtual {p1}, LV/R0;->k()Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    invoke-virtual {p1, v1}, LV/R0;->C(Z)V

    :cond_0
    invoke-virtual {p1}, LV/R0;->i()LV/d;

    move-result-object v0

    if-eqz v0, :cond_5

    invoke-virtual {v0}, LV/d;->b()Z

    move-result v2

    if-nez v2, :cond_1

    goto :goto_0

    :cond_1
    iget-object v2, p0, LV/u;->H:LV/h1;

    invoke-virtual {v2, v0}, LV/h1;->W(LV/d;)Z

    move-result v2

    if-nez v2, :cond_3

    iget-object v0, p0, LV/u;->F:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v2, p0, LV/u;->R:LV/u;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    if-eqz v2, :cond_2

    invoke-direct {v2, p1, p2}, LV/u;->N(LV/R0;Ljava/lang/Object;)Z

    move-result p1

    if-ne p1, v1, :cond_2

    sget-object p1, LV/a0;->F:LV/a0;

    return-object p1

    :cond_2
    sget-object p1, LV/a0;->C:LV/a0;

    return-object p1

    :catchall_0
    move-exception p1

    monitor-exit v0

    throw p1

    :cond_3
    invoke-virtual {p1}, LV/R0;->j()Z

    move-result v1

    if-nez v1, :cond_4

    sget-object p1, LV/a0;->C:LV/a0;

    return-object p1

    :cond_4
    invoke-direct {p0, p1, v0, p2}, LV/u;->H(LV/R0;LV/d;Ljava/lang/Object;)LV/a0;

    move-result-object p1

    return-object p1

    :cond_5
    :goto_0
    sget-object p1, LV/a0;->C:LV/a0;

    return-object p1
.end method

.method public h(Lx7/p;)V
    .locals 0

    invoke-direct {p0, p1}, LV/u;->C(Lx7/p;)V

    return-void
.end method

.method public j(Lx7/p;)V
    .locals 3

    .prologue
    :try_start_0
    iget-object v0, p0, LV/u;->F:Ljava/lang/Object;

    monitor-enter v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    invoke-direct {p0}, LV/u;->D()V

    invoke-direct {p0}, LV/u;->M()LX/f;

    move-result-object v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    invoke-direct {p0}, LV/u;->J()Lg0/c;

    iget-object v2, p0, LV/u;->U:LV/o;

    invoke-virtual {v2, v1, p1}, LV/o;->j0(LX/f;Lx7/p;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    return-void

    :catchall_0
    move-exception p1

    goto :goto_1

    :catchall_1
    move-exception p1

    goto :goto_0

    :catch_0
    move-exception p1

    :try_start_4
    iput-object v1, p0, LV/u;->P:LX/f;

    throw p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :goto_0
    :try_start_5
    monitor-exit v0

    throw p1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    :goto_1
    :try_start_6
    iget-object v0, p0, LV/u;->G:Ljava/util/Set;

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    if-eqz v0, :cond_0

    new-instance v0, LV/u$a;

    iget-object v1, p0, LV/u;->G:Ljava/util/Set;

    invoke-direct {v0, v1}, LV/u$a;-><init>(Ljava/util/Set;)V

    invoke-virtual {v0}, LV/u$a;->f()V

    goto :goto_2

    :catch_1
    move-exception p1

    goto :goto_3

    :cond_0
    :goto_2
    throw p1
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_1

    :goto_3
    invoke-virtual {p0}, LV/u;->u()V

    throw p1
.end method

.method public k()V
    .locals 4

    .prologue
    iget-object v0, p0, LV/u;->F:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, LV/u;->N:LW/a;

    invoke-virtual {v1}, LW/a;->d()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, LV/u;->N:LW/a;

    invoke-direct {p0, v1}, LV/u;->A(LW/a;)V

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_0
    :goto_0
    sget-object v1, Li7/M;->a:Li7/M;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-void

    :goto_1
    :try_start_1
    iget-object v2, p0, LV/u;->G:Ljava/util/Set;

    check-cast v2, Ljava/util/Collection;

    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    xor-int/lit8 v2, v2, 0x1

    if-eqz v2, :cond_1

    new-instance v2, LV/u$a;

    iget-object v3, p0, LV/u;->G:Ljava/util/Set;

    invoke-direct {v2, v3}, LV/u$a;-><init>(Ljava/util/Set;)V

    invoke-virtual {v2}, LV/u$a;->f()V

    goto :goto_2

    :catchall_1
    move-exception v1

    goto :goto_4

    :catch_0
    move-exception v1

    goto :goto_3

    :cond_1
    :goto_2
    throw v1
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :goto_3
    :try_start_2
    invoke-virtual {p0}, LV/u;->u()V

    throw v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :goto_4
    monitor-exit v0

    throw v1
.end method

.method public l()Z
    .locals 1

    iget-boolean v0, p0, LV/u;->X:Z

    return v0
.end method

.method public m(Ljava/util/Set;)V
    .locals 4

    .prologue
    :cond_0
    iget-object v0, p0, LV/u;->E:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x1

    if-nez v0, :cond_1

    move v2, v1

    goto :goto_0

    :cond_1
    invoke-static {}, LV/v;->c()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v0, v2}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    :goto_0
    if-eqz v2, :cond_2

    move-object v2, p1

    goto :goto_1

    :cond_2
    instance-of v2, v0, Ljava/util/Set;

    if-eqz v2, :cond_3

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/util/Set;

    const/4 v3, 0x0

    aput-object v0, v2, v3

    aput-object p1, v2, v1

    goto :goto_1

    :cond_3
    instance-of v1, v0, [Ljava/lang/Object;

    if-eqz v1, :cond_5

    const-string v1, "null cannot be cast to non-null type kotlin.Array<kotlin.collections.Set<kotlin.Any>>"

    invoke-static {v0, v1}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v1, v0

    check-cast v1, [Ljava/util/Set;

    invoke-static {v1, p1}, Lj7/n;->G([Ljava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v2

    :goto_1
    iget-object v1, p0, LV/u;->E:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-static {v1, v0, v2}, Lu/c0;->a(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    if-nez v0, :cond_4

    iget-object p1, p0, LV/u;->F:Ljava/lang/Object;

    monitor-enter p1

    :try_start_0
    invoke-direct {p0}, LV/u;->E()V

    sget-object v0, Li7/M;->a:Li7/M;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p1

    goto :goto_2

    :catchall_0
    move-exception v0

    monitor-exit p1

    throw v0

    :cond_4
    :goto_2
    return-void

    :cond_5
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "corrupt pendingModifications: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LV/u;->E:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public n()V
    .locals 4

    .prologue
    iget-object v0, p0, LV/u;->F:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, LV/u;->M:LW/a;

    invoke-direct {p0, v1}, LV/u;->A(LW/a;)V

    invoke-direct {p0}, LV/u;->E()V

    sget-object v1, Li7/M;->a:Li7/M;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    :try_start_1
    iget-object v2, p0, LV/u;->G:Ljava/util/Set;

    check-cast v2, Ljava/util/Collection;

    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    xor-int/lit8 v2, v2, 0x1

    if-eqz v2, :cond_0

    new-instance v2, LV/u$a;

    iget-object v3, p0, LV/u;->G:Ljava/util/Set;

    invoke-direct {v2, v3}, LV/u$a;-><init>(Ljava/util/Set;)V

    invoke-virtual {v2}, LV/u$a;->f()V

    goto :goto_0

    :catchall_1
    move-exception v1

    goto :goto_2

    :catch_0
    move-exception v1

    goto :goto_1

    :cond_0
    :goto_0
    throw v1
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :goto_1
    :try_start_2
    invoke-virtual {p0}, LV/u;->u()V

    throw v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :goto_2
    monitor-exit v0

    throw v1
.end method

.method public p()Z
    .locals 1

    iget-object v0, p0, LV/u;->U:LV/o;

    invoke-virtual {v0}, LV/o;->M0()Z

    move-result v0

    return v0
.end method

.method public q(Ljava/util/List;)V
    .locals 5

    .prologue
    const/4 v0, 0x1

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v1, :cond_1

    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Li7/u;

    invoke-virtual {v4}, Li7/u;->c()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LV/o0;

    invoke-virtual {v4}, LV/o0;->b()LV/G;

    move-result-object v4

    invoke-static {v4, p0}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_0

    goto :goto_1

    :cond_0
    add-int/2addr v3, v0

    goto :goto_0

    :cond_1
    move v2, v0

    :goto_1
    invoke-static {v2}, LV/q;->O(Z)V

    :try_start_0
    iget-object v1, p0, LV/u;->U:LV/o;

    invoke-virtual {v1, p1}, LV/o;->J0(Ljava/util/List;)V

    sget-object p1, Li7/M;->a:Li7/M;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    iget-object v1, p0, LV/u;->G:Ljava/util/Set;

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    xor-int/2addr v0, v1

    if-eqz v0, :cond_2

    new-instance v0, LV/u$a;

    iget-object v1, p0, LV/u;->G:Ljava/util/Set;

    invoke-direct {v0, v1}, LV/u$a;-><init>(Ljava/util/Set;)V

    invoke-virtual {v0}, LV/u$a;->f()V

    goto :goto_2

    :catch_0
    move-exception p1

    goto :goto_3

    :cond_2
    :goto_2
    throw p1
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    :goto_3
    invoke-virtual {p0}, LV/u;->u()V

    throw p1
.end method

.method public r(Ljava/lang/Object;)V
    .locals 14

    .prologue
    iget-object v0, p0, LV/u;->F:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    invoke-direct {p0, p1}, LV/u;->I(Ljava/lang/Object;)V

    iget-object v1, p0, LV/u;->L:LX/f;

    invoke-virtual {v1}, LX/f;->d()Lr/K;

    move-result-object v1

    invoke-virtual {v1, p1}, Lr/U;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_4

    instance-of v1, p1, Lr/L;

    if-eqz v1, :cond_3

    check-cast p1, Lr/L;

    iget-object v1, p1, Lr/W;->b:[Ljava/lang/Object;

    iget-object p1, p1, Lr/W;->a:[J

    array-length v2, p1

    add-int/lit8 v2, v2, -0x2

    if-ltz v2, :cond_4

    const/4 v3, 0x0

    move v4, v3

    :goto_0
    aget-wide v5, p1, v4

    not-long v7, v5

    const/4 v9, 0x7

    shl-long/2addr v7, v9

    and-long/2addr v7, v5

    const-wide v9, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    and-long/2addr v7, v9

    cmp-long v7, v7, v9

    if-eqz v7, :cond_2

    sub-int v7, v4, v2

    not-int v7, v7

    ushr-int/lit8 v7, v7, 0x1f

    const/16 v8, 0x8

    rsub-int/lit8 v7, v7, 0x8

    move v9, v3

    :goto_1
    if-ge v9, v7, :cond_1

    const-wide/16 v10, 0xff

    and-long/2addr v10, v5

    const-wide/16 v12, 0x80

    cmp-long v10, v10, v12

    if-gez v10, :cond_0

    shl-int/lit8 v10, v4, 0x3

    add-int/2addr v10, v9

    aget-object v10, v1, v10

    check-cast v10, LV/J;

    invoke-direct {p0, v10}, LV/u;->I(Ljava/lang/Object;)V

    goto :goto_2

    :catchall_0
    move-exception p1

    goto :goto_3

    :cond_0
    :goto_2
    shr-long/2addr v5, v8

    add-int/lit8 v9, v9, 0x1

    goto :goto_1

    :cond_1
    if-ne v7, v8, :cond_4

    :cond_2
    if-eq v4, v2, :cond_4

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_3
    check-cast p1, LV/J;

    invoke-direct {p0, p1}, LV/u;->I(Ljava/lang/Object;)V

    :cond_4
    sget-object p1, Li7/M;->a:Li7/M;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-void

    :goto_3
    monitor-exit v0

    throw p1
.end method

.method public s()Z
    .locals 2

    .prologue
    iget-object v0, p0, LV/u;->F:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, LV/u;->P:LX/f;

    invoke-virtual {v1}, LX/f;->e()I

    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-lez v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
.end method

.method public t(Lx7/p;)V
    .locals 1

    iget-object v0, p0, LV/u;->U:LV/o;

    invoke-virtual {v0}, LV/o;->n1()V

    invoke-direct {p0, p1}, LV/u;->C(Lx7/p;)V

    iget-object p1, p0, LV/u;->U:LV/o;

    invoke-virtual {p1}, LV/o;->u0()V

    return-void
.end method

.method public u()V
    .locals 2

    .prologue
    iget-object v0, p0, LV/u;->E:Ljava/util/concurrent/atomic/AtomicReference;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    iget-object v0, p0, LV/u;->M:LW/a;

    invoke-virtual {v0}, LW/a;->a()V

    iget-object v0, p0, LV/u;->N:LW/a;

    invoke-virtual {v0}, LW/a;->a()V

    iget-object v0, p0, LV/u;->G:Ljava/util/Set;

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    if-eqz v0, :cond_0

    new-instance v0, LV/u$a;

    iget-object v1, p0, LV/u;->G:Ljava/util/Set;

    invoke-direct {v0, v1}, LV/u$a;-><init>(Ljava/util/Set;)V

    invoke-virtual {v0}, LV/u$a;->f()V

    :cond_0
    return-void
.end method

.method public v()V
    .locals 4

    .prologue
    iget-object v0, p0, LV/u;->F:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, LV/u;->U:LV/o;

    invoke-virtual {v1}, LV/o;->g0()V

    iget-object v1, p0, LV/u;->G:Ljava/util/Set;

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    xor-int/lit8 v1, v1, 0x1

    if-eqz v1, :cond_0

    new-instance v1, LV/u$a;

    iget-object v2, p0, LV/u;->G:Ljava/util/Set;

    invoke-direct {v1, v2}, LV/u$a;-><init>(Ljava/util/Set;)V

    invoke-virtual {v1}, LV/u$a;->f()V

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_0
    :goto_0
    sget-object v1, Li7/M;->a:Li7/M;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-void

    :goto_1
    :try_start_1
    iget-object v2, p0, LV/u;->G:Ljava/util/Set;

    check-cast v2, Ljava/util/Collection;

    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    xor-int/lit8 v2, v2, 0x1

    if-eqz v2, :cond_1

    new-instance v2, LV/u$a;

    iget-object v3, p0, LV/u;->G:Ljava/util/Set;

    invoke-direct {v2, v3}, LV/u$a;-><init>(Ljava/util/Set;)V

    invoke-virtual {v2}, LV/u$a;->f()V

    goto :goto_2

    :catchall_1
    move-exception v1

    goto :goto_4

    :catch_0
    move-exception v1

    goto :goto_3

    :cond_1
    :goto_2
    throw v1
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :goto_3
    :try_start_2
    invoke-virtual {p0}, LV/u;->u()V

    throw v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :goto_4
    monitor-exit v0

    throw v1
.end method

.method public w()Z
    .locals 4

    .prologue
    iget-object v0, p0, LV/u;->F:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    invoke-direct {p0}, LV/u;->D()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    invoke-direct {p0}, LV/u;->M()LX/f;

    move-result-object v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    invoke-direct {p0}, LV/u;->J()Lg0/c;

    iget-object v2, p0, LV/u;->U:LV/o;

    invoke-virtual {v2, v1}, LV/o;->T0(LX/f;)Z

    move-result v2

    if-nez v2, :cond_0

    invoke-direct {p0}, LV/u;->E()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_2

    :catch_0
    move-exception v2

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit v0

    return v2

    :goto_1
    :try_start_3
    iput-object v1, p0, LV/u;->P:LX/f;

    throw v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :goto_2
    :try_start_4
    iget-object v2, p0, LV/u;->G:Ljava/util/Set;

    check-cast v2, Ljava/util/Collection;

    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    xor-int/lit8 v2, v2, 0x1

    if-eqz v2, :cond_1

    new-instance v2, LV/u$a;

    iget-object v3, p0, LV/u;->G:Ljava/util/Set;

    invoke-direct {v2, v3}, LV/u$a;-><init>(Ljava/util/Set;)V

    invoke-virtual {v2}, LV/u$a;->f()V

    goto :goto_3

    :catchall_1
    move-exception v1

    goto :goto_5

    :catch_1
    move-exception v1

    goto :goto_4

    :cond_1
    :goto_3
    throw v1
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_1
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :goto_4
    :try_start_5
    invoke-virtual {p0}, LV/u;->u()V

    throw v1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    :goto_5
    monitor-exit v0

    throw v1
.end method

.method public x()V
    .locals 6

    .prologue
    iget-object v0, p0, LV/u;->F:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, LV/u;->H:LV/h1;

    invoke-virtual {v1}, LV/h1;->O()[Ljava/lang/Object;

    move-result-object v1

    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_2

    aget-object v4, v1, v3

    instance-of v5, v4, LV/R0;

    if-eqz v5, :cond_0

    check-cast v4, LV/R0;

    goto :goto_1

    :catchall_0
    move-exception v1

    goto :goto_2

    :cond_0
    const/4 v4, 0x0

    :goto_1
    if-eqz v4, :cond_1

    invoke-virtual {v4}, LV/R0;->invalidate()V

    :cond_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_2
    sget-object v1, Li7/M;->a:Li7/M;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-void

    :goto_2
    monitor-exit v0

    throw v1
.end method

.method public z(LV/G;ILx7/a;)Ljava/lang/Object;
    .locals 1

    .prologue
    if-eqz p1, :cond_0

    invoke-static {p1, p0}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    if-ltz p2, :cond_0

    check-cast p1, LV/u;

    iput-object p1, p0, LV/u;->R:LV/u;

    iput p2, p0, LV/u;->S:I

    const/4 p1, 0x0

    const/4 p2, 0x0

    :try_start_0
    invoke-interface {p3}, Lx7/a;->b()Ljava/lang/Object;

    move-result-object p3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iput-object p2, p0, LV/u;->R:LV/u;

    iput p1, p0, LV/u;->S:I

    goto :goto_0

    :catchall_0
    move-exception p3

    iput-object p2, p0, LV/u;->R:LV/u;

    iput p1, p0, LV/u;->S:I

    throw p3

    :cond_0
    invoke-interface {p3}, Lx7/a;->b()Ljava/lang/Object;

    move-result-object p3

    :goto_0
    return-object p3
.end method
