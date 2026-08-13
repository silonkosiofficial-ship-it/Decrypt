.class public LZ7/f;
.super LR7/C;
.source "SourceFile"

# interfaces
.implements LZ7/a;


# instance fields
.field private final e0:Z

.field private final f0:Li7/u;

.field private g0:LF8/E;


# direct methods
.method protected constructor <init>(LO7/m;LP7/g;LO7/D;LO7/u;ZLn8/f;LO7/a0;LO7/U;LO7/b$a;ZLi7/u;)V
    .locals 17

    .prologue
    move-object/from16 v15, p0

    if-nez p1, :cond_0

    const/4 v0, 0x0

    invoke-static {v0}, LZ7/f;->M(I)V

    :cond_0
    if-nez p2, :cond_1

    const/4 v0, 0x1

    invoke-static {v0}, LZ7/f;->M(I)V

    :cond_1
    if-nez p3, :cond_2

    const/4 v0, 0x2

    invoke-static {v0}, LZ7/f;->M(I)V

    :cond_2
    if-nez p4, :cond_3

    const/4 v0, 0x3

    invoke-static {v0}, LZ7/f;->M(I)V

    :cond_3
    if-nez p6, :cond_4

    const/4 v0, 0x4

    invoke-static {v0}, LZ7/f;->M(I)V

    :cond_4
    if-nez p7, :cond_5

    const/4 v0, 0x5

    invoke-static {v0}, LZ7/f;->M(I)V

    :cond_5
    if-nez p9, :cond_6

    const/4 v0, 0x6

    invoke-static {v0}, LZ7/f;->M(I)V

    :cond_6
    const/4 v14, 0x0

    const/16 v16, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p8

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p9

    move-object/from16 v9, p7

    move/from16 v15, v16

    invoke-direct/range {v0 .. v15}, LR7/C;-><init>(LO7/m;LO7/U;LP7/g;LO7/D;LO7/u;ZLn8/f;LO7/b$a;LO7/a0;ZZZZZZ)V

    const/4 v0, 0x0

    move-object/from16 v1, p0

    iput-object v0, v1, LZ7/f;->g0:LF8/E;

    move/from16 v0, p10

    iput-boolean v0, v1, LZ7/f;->e0:Z

    move-object/from16 v0, p11

    iput-object v0, v1, LZ7/f;->f0:Li7/u;

    return-void
.end method

.method private static synthetic M(I)V
    .locals 7

    .prologue
    const/16 v0, 0x15

    if-eq p0, v0, :cond_0

    const-string v1, "Argument for @NotNull parameter \'%s\' of %s.%s must not be null"

    goto :goto_0

    :cond_0
    const-string v1, "@NotNull method %s.%s must not return null"

    :goto_0
    const/4 v2, 0x2

    if-eq p0, v0, :cond_1

    const/4 v3, 0x3

    goto :goto_1

    :cond_1
    move v3, v2

    :goto_1
    new-array v3, v3, [Ljava/lang/Object;

    const-string v4, "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaPropertyDescriptor"

    const/4 v5, 0x0

    packed-switch p0, :pswitch_data_0

    :pswitch_0
    const-string v6, "containingDeclaration"

    aput-object v6, v3, v5

    goto :goto_2

    :pswitch_1
    const-string v6, "inType"

    aput-object v6, v3, v5

    goto :goto_2

    :pswitch_2
    aput-object v4, v3, v5

    goto :goto_2

    :pswitch_3
    const-string v6, "enhancedReturnType"

    aput-object v6, v3, v5

    goto :goto_2

    :pswitch_4
    const-string v6, "enhancedValueParameterTypes"

    aput-object v6, v3, v5

    goto :goto_2

    :pswitch_5
    const-string v6, "newName"

    aput-object v6, v3, v5

    goto :goto_2

    :pswitch_6
    const-string v6, "newVisibility"

    aput-object v6, v3, v5

    goto :goto_2

    :pswitch_7
    const-string v6, "newModality"

    aput-object v6, v3, v5

    goto :goto_2

    :pswitch_8
    const-string v6, "newOwner"

    aput-object v6, v3, v5

    goto :goto_2

    :pswitch_9
    const-string v6, "kind"

    aput-object v6, v3, v5

    goto :goto_2

    :pswitch_a
    const-string v6, "source"

    aput-object v6, v3, v5

    goto :goto_2

    :pswitch_b
    const-string v6, "name"

    aput-object v6, v3, v5

    goto :goto_2

    :pswitch_c
    const-string v6, "visibility"

    aput-object v6, v3, v5

    goto :goto_2

    :pswitch_d
    const-string v6, "modality"

    aput-object v6, v3, v5

    goto :goto_2

    :pswitch_e
    const-string v6, "annotations"

    aput-object v6, v3, v5

    :goto_2
    const-string v5, "enhance"

    const/4 v6, 0x1

    if-eq p0, v0, :cond_2

    aput-object v4, v3, v6

    goto :goto_3

    :cond_2
    aput-object v5, v3, v6

    :goto_3
    packed-switch p0, :pswitch_data_1

    const-string v4, "<init>"

    aput-object v4, v3, v2

    goto :goto_4

    :pswitch_f
    const-string v4, "setInType"

    aput-object v4, v3, v2

    goto :goto_4

    :pswitch_10
    aput-object v5, v3, v2

    goto :goto_4

    :pswitch_11
    const-string v4, "createSubstitutedCopy"

    aput-object v4, v3, v2

    goto :goto_4

    :pswitch_12
    const-string v4, "create"

    aput-object v4, v3, v2

    :goto_4
    :pswitch_13
    invoke-static {v1, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    if-eq p0, v0, :cond_3

    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-direct {p0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    goto :goto_5

    :cond_3
    new-instance p0, Ljava/lang/IllegalStateException;

    invoke-direct {p0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    :goto_5
    throw p0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_0
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_9
        :pswitch_5
        :pswitch_a
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x7
        :pswitch_12
        :pswitch_12
        :pswitch_12
        :pswitch_12
        :pswitch_12
        :pswitch_12
        :pswitch_11
        :pswitch_11
        :pswitch_11
        :pswitch_11
        :pswitch_11
        :pswitch_11
        :pswitch_10
        :pswitch_10
        :pswitch_13
        :pswitch_f
    .end packed-switch
.end method

.method public static o1(LO7/m;LP7/g;LO7/D;LO7/u;ZLn8/f;LO7/a0;Z)LZ7/f;
    .locals 13

    .prologue
    if-nez p0, :cond_0

    const/4 v0, 0x7

    invoke-static {v0}, LZ7/f;->M(I)V

    :cond_0
    if-nez p1, :cond_1

    const/16 v0, 0x8

    invoke-static {v0}, LZ7/f;->M(I)V

    :cond_1
    if-nez p2, :cond_2

    const/16 v0, 0x9

    invoke-static {v0}, LZ7/f;->M(I)V

    :cond_2
    if-nez p3, :cond_3

    const/16 v0, 0xa

    invoke-static {v0}, LZ7/f;->M(I)V

    :cond_3
    if-nez p5, :cond_4

    const/16 v0, 0xb

    invoke-static {v0}, LZ7/f;->M(I)V

    :cond_4
    if-nez p6, :cond_5

    const/16 v0, 0xc

    invoke-static {v0}, LZ7/f;->M(I)V

    :cond_5
    new-instance v12, LZ7/f;

    sget-object v9, LO7/b$a;->C:LO7/b$a;

    const/4 v11, 0x0

    const/4 v8, 0x0

    move-object v0, v12

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object/from16 v4, p3

    move/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move/from16 v10, p7

    invoke-direct/range {v0 .. v11}, LZ7/f;-><init>(LO7/m;LP7/g;LO7/D;LO7/u;ZLn8/f;LO7/a0;LO7/U;LO7/b$a;ZLi7/u;)V

    return-object v12
.end method


# virtual methods
.method public D(LO7/a$a;)Ljava/lang/Object;
    .locals 1

    .prologue
    iget-object v0, p0, LZ7/f;->f0:Li7/u;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Li7/u;->c()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LO7/a$a;

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, LZ7/f;->f0:Li7/u;

    invoke-virtual {p1}, Li7/u;->d()Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public F()Z
    .locals 2

    .prologue
    invoke-virtual {p0}, LR7/M;->getType()LF8/E;

    move-result-object v0

    iget-boolean v1, p0, LZ7/f;->e0:Z

    if-eqz v1, :cond_1

    invoke-static {v0}, LO7/j;->a(LF8/E;)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-static {v0}, Lf8/r;->i(LF8/E;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {v0}, LL7/g;->v0(LF8/E;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public L()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method protected Y0(LO7/m;LO7/D;LO7/u;LO7/U;LO7/b$a;Ln8/f;LO7/a0;)LR7/C;
    .locals 14

    .prologue
    move-object v0, p0

    if-nez p1, :cond_0

    const/16 v1, 0xd

    invoke-static {v1}, LZ7/f;->M(I)V

    :cond_0
    if-nez p2, :cond_1

    const/16 v1, 0xe

    invoke-static {v1}, LZ7/f;->M(I)V

    :cond_1
    if-nez p3, :cond_2

    const/16 v1, 0xf

    invoke-static {v1}, LZ7/f;->M(I)V

    :cond_2
    if-nez p5, :cond_3

    const/16 v1, 0x10

    invoke-static {v1}, LZ7/f;->M(I)V

    :cond_3
    if-nez p6, :cond_4

    const/16 v1, 0x11

    invoke-static {v1}, LZ7/f;->M(I)V

    :cond_4
    if-nez p7, :cond_5

    const/16 v1, 0x12

    invoke-static {v1}, LZ7/f;->M(I)V

    :cond_5
    new-instance v13, LZ7/f;

    invoke-virtual {p0}, LP7/b;->k()LP7/g;

    move-result-object v3

    invoke-virtual {p0}, LR7/N;->t0()Z

    move-result v6

    iget-boolean v11, v0, LZ7/f;->e0:Z

    iget-object v12, v0, LZ7/f;->f0:Li7/u;

    move-object v1, v13

    move-object v2, p1

    move-object/from16 v4, p2

    move-object/from16 v5, p3

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p4

    move-object/from16 v10, p5

    invoke-direct/range {v1 .. v12}, LZ7/f;-><init>(LO7/m;LP7/g;LO7/D;LO7/u;ZLn8/f;LO7/a0;LO7/U;LO7/b$a;ZLi7/u;)V

    return-object v13
.end method

.method public i1(LF8/E;)V
    .locals 1

    .prologue
    if-nez p1, :cond_0

    const/16 v0, 0x16

    invoke-static {v0}, LZ7/f;->M(I)V

    :cond_0
    iput-object p1, p0, LZ7/f;->g0:LF8/E;

    return-void
.end method

.method public n0(LF8/E;Ljava/util/List;LF8/E;Li7/u;)LZ7/a;
    .locals 18

    .prologue
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p3

    if-nez p2, :cond_0

    const/16 v3, 0x13

    invoke-static {v3}, LZ7/f;->M(I)V

    :cond_0
    if-nez v2, :cond_1

    const/16 v3, 0x14

    invoke-static {v3}, LZ7/f;->M(I)V

    :cond_1
    invoke-virtual/range {p0 .. p0}, LR7/C;->a()LO7/U;

    move-result-object v3

    if-ne v3, v0, :cond_2

    const/4 v3, 0x0

    goto :goto_0

    :cond_2
    invoke-virtual/range {p0 .. p0}, LR7/C;->a()LO7/U;

    move-result-object v3

    :goto_0
    new-instance v15, LZ7/f;

    invoke-virtual/range {p0 .. p0}, LR7/k;->b()LO7/m;

    move-result-object v6

    invoke-virtual/range {p0 .. p0}, LP7/b;->k()LP7/g;

    move-result-object v7

    invoke-virtual/range {p0 .. p0}, LR7/C;->q()LO7/D;

    move-result-object v8

    invoke-virtual/range {p0 .. p0}, LR7/C;->h()LO7/u;

    move-result-object v9

    invoke-virtual/range {p0 .. p0}, LR7/N;->t0()Z

    move-result v10

    invoke-virtual/range {p0 .. p0}, LR7/j;->getName()Ln8/f;

    move-result-object v11

    invoke-virtual/range {p0 .. p0}, LR7/k;->o()LO7/a0;

    move-result-object v12

    invoke-virtual/range {p0 .. p0}, LR7/C;->j()LO7/b$a;

    move-result-object v14

    iget-boolean v13, v0, LZ7/f;->e0:Z

    move-object v5, v15

    move/from16 v16, v13

    move-object v13, v3

    move-object/from16 p2, v15

    move/from16 v15, v16

    move-object/from16 v16, p4

    invoke-direct/range {v5 .. v16}, LZ7/f;-><init>(LO7/m;LP7/g;LO7/D;LO7/u;ZLn8/f;LO7/a0;LO7/U;LO7/b$a;ZLi7/u;)V

    invoke-virtual/range {p0 .. p0}, LR7/C;->a1()LR7/D;

    move-result-object v16

    if-eqz v16, :cond_4

    new-instance v15, LR7/D;

    invoke-virtual/range {v16 .. v16}, LP7/b;->k()LP7/g;

    move-result-object v7

    invoke-virtual/range {v16 .. v16}, LR7/B;->q()LO7/D;

    move-result-object v8

    invoke-virtual/range {v16 .. v16}, LR7/B;->h()LO7/u;

    move-result-object v9

    invoke-virtual/range {v16 .. v16}, LR7/B;->b0()Z

    move-result v10

    invoke-virtual/range {v16 .. v16}, LR7/B;->C()Z

    move-result v11

    invoke-virtual/range {v16 .. v16}, LR7/B;->m()Z

    move-result v12

    invoke-virtual/range {p0 .. p0}, LR7/C;->j()LO7/b$a;

    move-result-object v13

    if-nez v3, :cond_3

    const/4 v14, 0x0

    goto :goto_1

    :cond_3
    invoke-interface {v3}, LO7/U;->d()LO7/V;

    move-result-object v5

    move-object v14, v5

    :goto_1
    invoke-virtual/range {v16 .. v16}, LR7/k;->o()LO7/a0;

    move-result-object v17

    move-object v5, v15

    move-object/from16 v6, p2

    move-object v4, v15

    move-object/from16 v15, v17

    invoke-direct/range {v5 .. v15}, LR7/D;-><init>(LO7/U;LP7/g;LO7/D;LO7/u;ZZZLO7/b$a;LO7/V;LO7/a0;)V

    invoke-virtual/range {v16 .. v16}, LR7/B;->l0()LO7/y;

    move-result-object v5

    invoke-virtual {v4, v5}, LR7/B;->V0(LO7/y;)V

    invoke-virtual {v4, v2}, LR7/D;->Y0(LF8/E;)V

    goto :goto_2

    :cond_4
    const/4 v4, 0x0

    :goto_2
    invoke-virtual/range {p0 .. p0}, LR7/C;->i()LO7/W;

    move-result-object v16

    if-eqz v16, :cond_6

    new-instance v15, LR7/E;

    invoke-interface/range {v16 .. v16}, LP7/a;->k()LP7/g;

    move-result-object v7

    invoke-interface/range {v16 .. v16}, LO7/C;->q()LO7/D;

    move-result-object v8

    invoke-interface/range {v16 .. v16}, LO7/C;->h()LO7/u;

    move-result-object v9

    invoke-interface/range {v16 .. v16}, LO7/T;->b0()Z

    move-result v10

    invoke-interface/range {v16 .. v16}, LO7/C;->C()Z

    move-result v11

    invoke-interface/range {v16 .. v16}, LO7/y;->m()Z

    move-result v12

    invoke-virtual/range {p0 .. p0}, LR7/C;->j()LO7/b$a;

    move-result-object v13

    if-nez v3, :cond_5

    const/4 v14, 0x0

    goto :goto_3

    :cond_5
    invoke-interface {v3}, LO7/U;->i()LO7/W;

    move-result-object v3

    move-object v14, v3

    :goto_3
    invoke-interface/range {v16 .. v16}, LO7/p;->o()LO7/a0;

    move-result-object v3

    move-object v5, v15

    move-object/from16 v6, p2

    move-object/from16 p4, v15

    move-object v15, v3

    invoke-direct/range {v5 .. v15}, LR7/E;-><init>(LO7/U;LP7/g;LO7/D;LO7/u;ZZZLO7/b$a;LO7/W;LO7/a0;)V

    invoke-virtual/range {p4 .. p4}, LR7/B;->l0()LO7/y;

    move-result-object v3

    move-object/from16 v5, p4

    invoke-virtual {v5, v3}, LR7/B;->V0(LO7/y;)V

    invoke-interface/range {v16 .. v16}, LO7/a;->n()Ljava/util/List;

    move-result-object v3

    const/4 v6, 0x0

    invoke-interface {v3, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LO7/j0;

    invoke-virtual {v5, v3}, LR7/E;->Z0(LO7/j0;)V

    move-object v15, v5

    goto :goto_4

    :cond_6
    const/4 v15, 0x0

    :goto_4
    invoke-virtual/range {p0 .. p0}, LR7/C;->z0()LO7/w;

    move-result-object v3

    invoke-virtual/range {p0 .. p0}, LR7/C;->w0()LO7/w;

    move-result-object v5

    move-object/from16 v7, p2

    invoke-virtual {v7, v4, v15, v3, v5}, LR7/C;->e1(LR7/D;LO7/W;LO7/w;LO7/w;)V

    invoke-virtual/range {p0 .. p0}, LR7/C;->f1()Z

    move-result v3

    invoke-virtual {v7, v3}, LR7/C;->j1(Z)V

    iget-object v3, v0, LR7/N;->J:Lx7/a;

    if-eqz v3, :cond_7

    iget-object v4, v0, LR7/N;->I:LE8/j;

    invoke-virtual {v7, v4, v3}, LR7/N;->T0(LE8/j;Lx7/a;)V

    :cond_7
    invoke-virtual/range {p0 .. p0}, LR7/C;->f()Ljava/util/Collection;

    move-result-object v3

    invoke-virtual {v7, v3}, LR7/C;->G0(Ljava/util/Collection;)V

    if-nez v1, :cond_8

    const/4 v5, 0x0

    goto :goto_5

    :cond_8
    sget-object v3, LP7/g;->d:LP7/g$a;

    invoke-virtual {v3}, LP7/g$a;->b()LP7/g;

    move-result-object v3

    invoke-static {v0, v1, v3}, Lr8/e;->i(LO7/a;LF8/E;LP7/g;)LO7/X;

    move-result-object v1

    move-object v5, v1

    :goto_5
    invoke-virtual/range {p0 .. p0}, LR7/C;->g()Ljava/util/List;

    move-result-object v3

    invoke-virtual/range {p0 .. p0}, LR7/C;->m0()LO7/X;

    move-result-object v4

    invoke-static {}, Lj7/v;->m()Ljava/util/List;

    move-result-object v6

    move-object v1, v7

    move-object/from16 v2, p3

    invoke-virtual/range {v1 .. v6}, LR7/C;->k1(LF8/E;Ljava/util/List;LO7/X;LO7/X;Ljava/util/List;)V

    return-object v7
.end method
