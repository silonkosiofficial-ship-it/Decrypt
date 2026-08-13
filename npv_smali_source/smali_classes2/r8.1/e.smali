.class public abstract Lr8/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lr8/e$a;
    }
.end annotation


# direct methods
.method private static synthetic a(I)V
    .locals 11

    .prologue
    const/16 v0, 0x19

    const/16 v1, 0x17

    const/16 v2, 0xc

    if-eq p0, v2, :cond_0

    if-eq p0, v1, :cond_0

    if-eq p0, v0, :cond_0

    const-string v3, "Argument for @NotNull parameter \'%s\' of %s.%s must not be null"

    goto :goto_0

    :cond_0
    const-string v3, "@NotNull method %s.%s must not return null"

    :goto_0
    const/4 v4, 0x2

    if-eq p0, v2, :cond_1

    if-eq p0, v1, :cond_1

    if-eq p0, v0, :cond_1

    const/4 v5, 0x3

    goto :goto_1

    :cond_1
    move v5, v4

    :goto_1
    new-array v5, v5, [Ljava/lang/Object;

    const-string v6, "kotlin/reflect/jvm/internal/impl/resolve/DescriptorFactory"

    const/4 v7, 0x0

    packed-switch p0, :pswitch_data_0

    :pswitch_0
    const-string v8, "propertyDescriptor"

    aput-object v8, v5, v7

    goto :goto_2

    :pswitch_1
    const-string v8, "owner"

    aput-object v8, v5, v7

    goto :goto_2

    :pswitch_2
    const-string v8, "descriptor"

    aput-object v8, v5, v7

    goto :goto_2

    :pswitch_3
    const-string v8, "enumClass"

    aput-object v8, v5, v7

    goto :goto_2

    :pswitch_4
    const-string v8, "source"

    aput-object v8, v5, v7

    goto :goto_2

    :pswitch_5
    const-string v8, "containingClass"

    aput-object v8, v5, v7

    goto :goto_2

    :pswitch_6
    aput-object v6, v5, v7

    goto :goto_2

    :pswitch_7
    const-string v8, "visibility"

    aput-object v8, v5, v7

    goto :goto_2

    :pswitch_8
    const-string v8, "sourceElement"

    aput-object v8, v5, v7

    goto :goto_2

    :pswitch_9
    const-string v8, "parameterAnnotations"

    aput-object v8, v5, v7

    goto :goto_2

    :pswitch_a
    const-string v8, "annotations"

    aput-object v8, v5, v7

    :goto_2
    const-string v7, "createSetter"

    const-string v8, "createEnumValuesMethod"

    const-string v9, "createEnumValueOfMethod"

    const/4 v10, 0x1

    if-eq p0, v2, :cond_4

    if-eq p0, v1, :cond_3

    if-eq p0, v0, :cond_2

    aput-object v6, v5, v10

    goto :goto_3

    :cond_2
    aput-object v9, v5, v10

    goto :goto_3

    :cond_3
    aput-object v8, v5, v10

    goto :goto_3

    :cond_4
    aput-object v7, v5, v10

    :goto_3
    packed-switch p0, :pswitch_data_1

    const-string v6, "createDefaultSetter"

    aput-object v6, v5, v4

    goto :goto_4

    :pswitch_b
    const-string v6, "createContextReceiverParameterForClass"

    aput-object v6, v5, v4

    goto :goto_4

    :pswitch_c
    const-string v6, "createContextReceiverParameterForCallable"

    aput-object v6, v5, v4

    goto :goto_4

    :pswitch_d
    const-string v6, "createExtensionReceiverParameterForCallable"

    aput-object v6, v5, v4

    goto :goto_4

    :pswitch_e
    const-string v6, "isEnumSpecialMethod"

    aput-object v6, v5, v4

    goto :goto_4

    :pswitch_f
    const-string v6, "isEnumValueOfMethod"

    aput-object v6, v5, v4

    goto :goto_4

    :pswitch_10
    const-string v6, "isEnumValuesMethod"

    aput-object v6, v5, v4

    goto :goto_4

    :pswitch_11
    const-string v6, "createEnumEntriesProperty"

    aput-object v6, v5, v4

    goto :goto_4

    :pswitch_12
    aput-object v9, v5, v4

    goto :goto_4

    :pswitch_13
    aput-object v8, v5, v4

    goto :goto_4

    :pswitch_14
    const-string v6, "createPrimaryConstructorForObject"

    aput-object v6, v5, v4

    goto :goto_4

    :pswitch_15
    const-string v6, "createGetter"

    aput-object v6, v5, v4

    goto :goto_4

    :pswitch_16
    const-string v6, "createDefaultGetter"

    aput-object v6, v5, v4

    goto :goto_4

    :pswitch_17
    aput-object v7, v5, v4

    :goto_4
    :pswitch_18
    invoke-static {v3, v5}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    if-eq p0, v2, :cond_5

    if-eq p0, v1, :cond_5

    if-eq p0, v0, :cond_5

    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-direct {p0, v3}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    goto :goto_5

    :cond_5
    new-instance p0, Ljava/lang/IllegalStateException;

    invoke-direct {p0, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    :goto_5
    throw p0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_a
        :pswitch_9
        :pswitch_0
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_0
        :pswitch_a
        :pswitch_9
        :pswitch_7
        :pswitch_8
        :pswitch_6
        :pswitch_0
        :pswitch_a
        :pswitch_0
        :pswitch_a
        :pswitch_0
        :pswitch_a
        :pswitch_8
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_6
        :pswitch_3
        :pswitch_6
        :pswitch_3
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_a
        :pswitch_1
        :pswitch_a
        :pswitch_1
        :pswitch_a
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x3
        :pswitch_17
        :pswitch_17
        :pswitch_17
        :pswitch_17
        :pswitch_17
        :pswitch_17
        :pswitch_17
        :pswitch_17
        :pswitch_17
        :pswitch_18
        :pswitch_16
        :pswitch_16
        :pswitch_15
        :pswitch_15
        :pswitch_15
        :pswitch_15
        :pswitch_15
        :pswitch_14
        :pswitch_14
        :pswitch_13
        :pswitch_18
        :pswitch_12
        :pswitch_18
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_d
        :pswitch_c
        :pswitch_c
        :pswitch_b
        :pswitch_b
    .end packed-switch
.end method

.method public static b(LO7/a;LF8/E;Ln8/f;LP7/g;I)LO7/X;
    .locals 3

    .prologue
    if-nez p0, :cond_0

    const/16 v0, 0x20

    invoke-static {v0}, Lr8/e;->a(I)V

    :cond_0
    if-nez p3, :cond_1

    const/16 v0, 0x21

    invoke-static {v0}, Lr8/e;->a(I)V

    :cond_1
    const/4 v0, 0x0

    if-nez p1, :cond_2

    goto :goto_0

    :cond_2
    new-instance v1, LR7/F;

    new-instance v2, Lz8/c;

    invoke-direct {v2, p0, p1, p2, v0}, Lz8/c;-><init>(LO7/a;LF8/E;Ln8/f;Lz8/g;)V

    invoke-static {p4}, Ln8/g;->a(I)Ln8/f;

    move-result-object p1

    invoke-direct {v1, p0, v2, p3, p1}, LR7/F;-><init>(LO7/m;Lz8/g;LP7/g;Ln8/f;)V

    move-object v0, v1

    :goto_0
    return-object v0
.end method

.method public static c(LO7/e;LF8/E;Ln8/f;LP7/g;I)LO7/X;
    .locals 3

    .prologue
    if-nez p0, :cond_0

    const/16 v0, 0x22

    invoke-static {v0}, Lr8/e;->a(I)V

    :cond_0
    if-nez p3, :cond_1

    const/16 v0, 0x23

    invoke-static {v0}, Lr8/e;->a(I)V

    :cond_1
    const/4 v0, 0x0

    if-nez p1, :cond_2

    goto :goto_0

    :cond_2
    new-instance v1, LR7/F;

    new-instance v2, Lz8/b;

    invoke-direct {v2, p0, p1, p2, v0}, Lz8/b;-><init>(LO7/e;LF8/E;Ln8/f;Lz8/g;)V

    invoke-static {p4}, Ln8/g;->a(I)Ln8/f;

    move-result-object p1

    invoke-direct {v1, p0, v2, p3, p1}, LR7/F;-><init>(LO7/m;Lz8/g;LP7/g;Ln8/f;)V

    move-object v0, v1

    :goto_0
    return-object v0
.end method

.method public static d(LO7/U;LP7/g;)LR7/D;
    .locals 2

    .prologue
    if-nez p0, :cond_0

    const/16 v0, 0xd

    invoke-static {v0}, Lr8/e;->a(I)V

    :cond_0
    if-nez p1, :cond_1

    const/16 v0, 0xe

    invoke-static {v0}, Lr8/e;->a(I)V

    :cond_1
    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-static {p0, p1, v0, v1, v1}, Lr8/e;->j(LO7/U;LP7/g;ZZZ)LR7/D;

    move-result-object p0

    return-object p0
.end method

.method public static e(LO7/U;LP7/g;LP7/g;)LR7/E;
    .locals 8

    .prologue
    if-nez p0, :cond_0

    const/4 v0, 0x0

    invoke-static {v0}, Lr8/e;->a(I)V

    :cond_0
    if-nez p1, :cond_1

    const/4 v0, 0x1

    invoke-static {v0}, Lr8/e;->a(I)V

    :cond_1
    if-nez p2, :cond_2

    const/4 v0, 0x2

    invoke-static {v0}, Lr8/e;->a(I)V

    :cond_2
    invoke-interface {p0}, LO7/p;->o()LO7/a0;

    move-result-object v7

    const/4 v4, 0x1

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-static/range {v1 .. v7}, Lr8/e;->n(LO7/U;LP7/g;LP7/g;ZZZLO7/a0;)LR7/E;

    move-result-object p0

    return-object p0
.end method

.method public static f(LO7/e;)LO7/U;
    .locals 26

    .prologue
    if-nez p0, :cond_0

    const/16 v0, 0x1a

    invoke-static {v0}, Lr8/e;->a(I)V

    :cond_0
    invoke-static/range {p0 .. p0}, Lr8/f;->g(LO7/m;)LO7/G;

    move-result-object v0

    invoke-static {v0}, Lr8/r;->a(LO7/G;)Lr8/q;

    move-result-object v1

    invoke-interface {v1, v0}, Lr8/q;->a(LO7/G;)LO7/e;

    move-result-object v14

    const/4 v15, 0x0

    if-nez v14, :cond_1

    return-object v15

    :cond_1
    sget-object v16, LP7/g;->d:LP7/g$a;

    invoke-virtual/range {v16 .. v16}, LP7/g$a;->b()LP7/g;

    move-result-object v1

    sget-object v17, LO7/D;->D:LO7/D;

    sget-object v18, LO7/t;->e:LO7/u;

    sget-object v5, LL7/j;->e:Ln8/f;

    sget-object v19, LO7/b$a;->F:LO7/b$a;

    invoke-interface/range {p0 .. p0}, LO7/p;->o()LO7/a0;

    move-result-object v7

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v4, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    move-object/from16 v0, p0

    move-object/from16 v2, v17

    move-object/from16 v3, v18

    move-object/from16 v6, v19

    invoke-static/range {v0 .. v13}, LR7/C;->X0(LO7/m;LP7/g;LO7/D;LO7/u;ZLn8/f;LO7/b$a;LO7/a0;ZZZZZZ)LR7/C;

    move-result-object v0

    new-instance v1, LR7/D;

    invoke-virtual/range {v16 .. v16}, LP7/g$a;->b()LP7/g;

    move-result-object v4

    const/4 v11, 0x0

    invoke-interface/range {p0 .. p0}, LO7/p;->o()LO7/a0;

    move-result-object v12

    const/4 v7, 0x0

    move-object v2, v1

    move-object v3, v0

    move-object/from16 v5, v17

    move-object/from16 v6, v18

    move-object/from16 v10, v19

    invoke-direct/range {v2 .. v12}, LR7/D;-><init>(LO7/U;LP7/g;LO7/D;LO7/u;ZZZLO7/b$a;LO7/V;LO7/a0;)V

    invoke-virtual {v0, v1, v15}, LR7/C;->d1(LR7/D;LO7/W;)V

    sget-object v2, LF8/a0;->D:LF8/a0$a;

    invoke-virtual {v2}, LF8/a0$a;->i()LF8/a0;

    move-result-object v2

    invoke-interface {v14}, LO7/h;->p()LF8/e0;

    move-result-object v3

    new-instance v4, LF8/k0;

    invoke-interface/range {p0 .. p0}, LO7/e;->w()LF8/M;

    move-result-object v5

    invoke-direct {v4, v5}, LF8/k0;-><init>(LF8/E;)V

    invoke-static {v4}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v4

    const/4 v5, 0x0

    invoke-static {v2, v3, v4, v5}, LF8/F;->i(LF8/a0;LF8/e0;Ljava/util/List;Z)LF8/M;

    move-result-object v21

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v22

    const/16 v24, 0x0

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v25

    const/16 v23, 0x0

    move-object/from16 v20, v0

    invoke-virtual/range {v20 .. v25}, LR7/C;->k1(LF8/E;Ljava/util/List;LO7/X;LO7/X;Ljava/util/List;)V

    invoke-virtual {v0}, LR7/C;->l()LF8/E;

    move-result-object v2

    invoke-virtual {v1, v2}, LR7/D;->Y0(LF8/E;)V

    return-object v0
.end method

.method public static g(LO7/e;)LO7/Z;
    .locals 18

    .prologue
    move-object/from16 v0, p0

    if-nez v0, :cond_0

    const/16 v1, 0x18

    invoke-static {v1}, Lr8/e;->a(I)V

    :cond_0
    sget-object v1, LP7/g;->d:LP7/g$a;

    invoke-virtual {v1}, LP7/g$a;->b()LP7/g;

    move-result-object v2

    sget-object v3, LL7/j;->f:Ln8/f;

    sget-object v4, LO7/b$a;->F:LO7/b$a;

    invoke-interface/range {p0 .. p0}, LO7/p;->o()LO7/a0;

    move-result-object v5

    invoke-static {v0, v2, v3, v4, v5}, LR7/G;->u1(LO7/m;LP7/g;Ln8/f;LO7/b$a;LO7/a0;)LR7/G;

    move-result-object v2

    new-instance v3, LR7/L;

    invoke-virtual {v1}, LP7/g$a;->b()LP7/g;

    move-result-object v10

    const-string v1, "value"

    invoke-static {v1}, Ln8/f;->o(Ljava/lang/String;)Ln8/f;

    move-result-object v11

    invoke-static/range {p0 .. p0}, Lv8/c;->j(LO7/m;)LL7/g;

    move-result-object v1

    invoke-virtual {v1}, LL7/g;->W()LF8/M;

    move-result-object v12

    const/16 v16, 0x0

    invoke-interface/range {p0 .. p0}, LO7/p;->o()LO7/a0;

    move-result-object v17

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    move-object v6, v3

    move-object v7, v2

    invoke-direct/range {v6 .. v17}, LR7/L;-><init>(LO7/a;LO7/j0;ILP7/g;Ln8/f;LF8/E;ZZZLF8/E;LO7/a0;)V

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v9

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v10

    invoke-static {v3}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v11

    invoke-interface/range {p0 .. p0}, LO7/e;->w()LF8/M;

    move-result-object v12

    sget-object v13, LO7/D;->D:LO7/D;

    sget-object v14, LO7/t;->e:LO7/u;

    const/4 v7, 0x0

    move-object v6, v2

    invoke-virtual/range {v6 .. v14}, LR7/G;->w1(LO7/X;LO7/X;Ljava/util/List;Ljava/util/List;Ljava/util/List;LF8/E;LO7/D;LO7/u;)LR7/G;

    move-result-object v0

    if-nez v0, :cond_1

    const/16 v1, 0x19

    invoke-static {v1}, Lr8/e;->a(I)V

    :cond_1
    return-object v0
.end method

.method public static h(LO7/e;)LO7/Z;
    .locals 13

    .prologue
    if-nez p0, :cond_0

    const/16 v0, 0x16

    invoke-static {v0}, Lr8/e;->a(I)V

    :cond_0
    sget-object v0, LP7/g;->d:LP7/g$a;

    invoke-virtual {v0}, LP7/g$a;->b()LP7/g;

    move-result-object v0

    sget-object v1, LL7/j;->d:Ln8/f;

    sget-object v2, LO7/b$a;->F:LO7/b$a;

    invoke-interface {p0}, LO7/p;->o()LO7/a0;

    move-result-object v3

    invoke-static {p0, v0, v1, v2, v3}, LR7/G;->u1(LO7/m;LP7/g;Ln8/f;LO7/b$a;LO7/a0;)LR7/G;

    move-result-object v4

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v7

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v8

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v9

    invoke-static {p0}, Lv8/c;->j(LO7/m;)LL7/g;

    move-result-object v0

    sget-object v1, LF8/u0;->G:LF8/u0;

    invoke-interface {p0}, LO7/e;->w()LF8/M;

    move-result-object p0

    invoke-virtual {v0, v1, p0}, LL7/g;->l(LF8/u0;LF8/E;)LF8/M;

    move-result-object v10

    sget-object v11, LO7/D;->D:LO7/D;

    sget-object v12, LO7/t;->e:LO7/u;

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-virtual/range {v4 .. v12}, LR7/G;->w1(LO7/X;LO7/X;Ljava/util/List;Ljava/util/List;Ljava/util/List;LF8/E;LO7/D;LO7/u;)LR7/G;

    move-result-object p0

    if-nez p0, :cond_1

    const/16 v0, 0x17

    invoke-static {v0}, Lr8/e;->a(I)V

    :cond_1
    return-object p0
.end method

.method public static i(LO7/a;LF8/E;LP7/g;)LO7/X;
    .locals 3

    .prologue
    if-nez p0, :cond_0

    const/16 v0, 0x1e

    invoke-static {v0}, Lr8/e;->a(I)V

    :cond_0
    if-nez p2, :cond_1

    const/16 v0, 0x1f

    invoke-static {v0}, Lr8/e;->a(I)V

    :cond_1
    const/4 v0, 0x0

    if-nez p1, :cond_2

    goto :goto_0

    :cond_2
    new-instance v1, LR7/F;

    new-instance v2, Lz8/d;

    invoke-direct {v2, p0, p1, v0}, Lz8/d;-><init>(LO7/a;LF8/E;Lz8/g;)V

    invoke-direct {v1, p0, v2, p2}, LR7/F;-><init>(LO7/m;Lz8/g;LP7/g;)V

    move-object v0, v1

    :goto_0
    return-object v0
.end method

.method public static j(LO7/U;LP7/g;ZZZ)LR7/D;
    .locals 7

    .prologue
    if-nez p0, :cond_0

    const/16 v0, 0xf

    invoke-static {v0}, Lr8/e;->a(I)V

    :cond_0
    if-nez p1, :cond_1

    const/16 v0, 0x10

    invoke-static {v0}, Lr8/e;->a(I)V

    :cond_1
    invoke-interface {p0}, LO7/p;->o()LO7/a0;

    move-result-object v6

    move-object v1, p0

    move-object v2, p1

    move v3, p2

    move v4, p3

    move v5, p4

    invoke-static/range {v1 .. v6}, Lr8/e;->k(LO7/U;LP7/g;ZZZLO7/a0;)LR7/D;

    move-result-object p0

    return-object p0
.end method

.method public static k(LO7/U;LP7/g;ZZZLO7/a0;)LR7/D;
    .locals 12

    .prologue
    if-nez p0, :cond_0

    const/16 v0, 0x11

    invoke-static {v0}, Lr8/e;->a(I)V

    :cond_0
    if-nez p1, :cond_1

    const/16 v0, 0x12

    invoke-static {v0}, Lr8/e;->a(I)V

    :cond_1
    if-nez p5, :cond_2

    const/16 v0, 0x13

    invoke-static {v0}, Lr8/e;->a(I)V

    :cond_2
    new-instance v11, LR7/D;

    invoke-interface {p0}, LO7/C;->q()LO7/D;

    move-result-object v3

    invoke-interface {p0}, LO7/C;->h()LO7/u;

    move-result-object v4

    sget-object v8, LO7/b$a;->C:LO7/b$a;

    const/4 v9, 0x0

    move-object v0, v11

    move-object v1, p0

    move-object v2, p1

    move v5, p2

    move v6, p3

    move/from16 v7, p4

    move-object/from16 v10, p5

    invoke-direct/range {v0 .. v10}, LR7/D;-><init>(LO7/U;LP7/g;LO7/D;LO7/u;ZZZLO7/b$a;LO7/V;LO7/a0;)V

    return-object v11
.end method

.method public static l(LO7/e;LO7/a0;)LR7/f;
    .locals 2

    .prologue
    if-nez p0, :cond_0

    const/16 v0, 0x14

    invoke-static {v0}, Lr8/e;->a(I)V

    :cond_0
    if-nez p1, :cond_1

    const/16 v0, 0x15

    invoke-static {v0}, Lr8/e;->a(I)V

    :cond_1
    new-instance v0, Lr8/e$a;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1}, Lr8/e$a;-><init>(LO7/e;LO7/a0;Z)V

    return-object v0
.end method

.method public static m(LO7/U;LP7/g;LP7/g;ZZZLO7/u;LO7/a0;)LR7/E;
    .locals 13

    .prologue
    move-object v0, p2

    if-nez p0, :cond_0

    const/4 v1, 0x7

    invoke-static {v1}, Lr8/e;->a(I)V

    :cond_0
    if-nez p1, :cond_1

    const/16 v1, 0x8

    invoke-static {v1}, Lr8/e;->a(I)V

    :cond_1
    if-nez v0, :cond_2

    const/16 v1, 0x9

    invoke-static {v1}, Lr8/e;->a(I)V

    :cond_2
    if-nez p6, :cond_3

    const/16 v1, 0xa

    invoke-static {v1}, Lr8/e;->a(I)V

    :cond_3
    if-nez p7, :cond_4

    const/16 v1, 0xb

    invoke-static {v1}, Lr8/e;->a(I)V

    :cond_4
    new-instance v12, LR7/E;

    invoke-interface {p0}, LO7/C;->q()LO7/D;

    move-result-object v4

    sget-object v9, LO7/b$a;->C:LO7/b$a;

    const/4 v10, 0x0

    move-object v1, v12

    move-object v2, p0

    move-object v3, p1

    move-object/from16 v5, p6

    move/from16 v6, p3

    move/from16 v7, p4

    move/from16 v8, p5

    move-object/from16 v11, p7

    invoke-direct/range {v1 .. v11}, LR7/E;-><init>(LO7/U;LP7/g;LO7/D;LO7/u;ZZZLO7/b$a;LO7/W;LO7/a0;)V

    invoke-interface {p0}, LO7/i0;->getType()LF8/E;

    move-result-object v1

    invoke-static {v12, v1, p2}, LR7/E;->X0(LO7/W;LF8/E;LP7/g;)LR7/L;

    move-result-object v0

    invoke-virtual {v12, v0}, LR7/E;->Z0(LO7/j0;)V

    return-object v12
.end method

.method public static n(LO7/U;LP7/g;LP7/g;ZZZLO7/a0;)LR7/E;
    .locals 9

    .prologue
    if-nez p0, :cond_0

    const/4 v0, 0x3

    invoke-static {v0}, Lr8/e;->a(I)V

    :cond_0
    if-nez p1, :cond_1

    const/4 v0, 0x4

    invoke-static {v0}, Lr8/e;->a(I)V

    :cond_1
    if-nez p2, :cond_2

    const/4 v0, 0x5

    invoke-static {v0}, Lr8/e;->a(I)V

    :cond_2
    if-nez p6, :cond_3

    const/4 v0, 0x6

    invoke-static {v0}, Lr8/e;->a(I)V

    :cond_3
    invoke-interface {p0}, LO7/C;->h()LO7/u;

    move-result-object v7

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move v4, p3

    move v5, p4

    move v6, p5

    move-object v8, p6

    invoke-static/range {v1 .. v8}, Lr8/e;->m(LO7/U;LP7/g;LP7/g;ZZZLO7/u;LO7/a0;)LR7/E;

    move-result-object p0

    return-object p0
.end method

.method private static o(LO7/y;)Z
    .locals 2

    .prologue
    if-nez p0, :cond_0

    const/16 v0, 0x1d

    invoke-static {v0}, Lr8/e;->a(I)V

    :cond_0
    invoke-interface {p0}, LO7/b;->j()LO7/b$a;

    move-result-object v0

    sget-object v1, LO7/b$a;->F:LO7/b$a;

    if-ne v0, v1, :cond_1

    invoke-interface {p0}, LO7/y;->b()LO7/m;

    move-result-object p0

    invoke-static {p0}, Lr8/f;->A(LO7/m;)Z

    move-result p0

    if-eqz p0, :cond_1

    const/4 p0, 0x1

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static p(LO7/y;)Z
    .locals 2

    .prologue
    if-nez p0, :cond_0

    const/16 v0, 0x1c

    invoke-static {v0}, Lr8/e;->a(I)V

    :cond_0
    invoke-interface {p0}, LO7/I;->getName()Ln8/f;

    move-result-object v0

    sget-object v1, LL7/j;->f:Ln8/f;

    invoke-virtual {v0, v1}, Ln8/f;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {p0}, Lr8/e;->o(LO7/y;)Z

    move-result p0

    if-eqz p0, :cond_1

    const/4 p0, 0x1

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static q(LO7/y;)Z
    .locals 2

    .prologue
    if-nez p0, :cond_0

    const/16 v0, 0x1b

    invoke-static {v0}, Lr8/e;->a(I)V

    :cond_0
    invoke-interface {p0}, LO7/I;->getName()Ln8/f;

    move-result-object v0

    sget-object v1, LL7/j;->d:Ln8/f;

    invoke-virtual {v0, v1}, Ln8/f;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {p0}, Lr8/e;->o(LO7/y;)Z

    move-result p0

    if-eqz p0, :cond_1

    const/4 p0, 0x1

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    :goto_0
    return p0
.end method
