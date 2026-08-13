.class public abstract LF8/s;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method private static synthetic a(I)V
    .locals 7

    .prologue
    const/4 v0, 0x4

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

    const-string v4, "kotlin/reflect/jvm/internal/impl/types/DescriptorSubstitutor"

    const/4 v5, 0x0

    packed-switch p0, :pswitch_data_0

    :pswitch_0
    const-string v6, "typeParameters"

    aput-object v6, v3, v5

    goto :goto_2

    :pswitch_1
    aput-object v4, v3, v5

    goto :goto_2

    :pswitch_2
    const-string v6, "result"

    aput-object v6, v3, v5

    goto :goto_2

    :pswitch_3
    const-string v6, "newContainingDeclaration"

    aput-object v6, v3, v5

    goto :goto_2

    :pswitch_4
    const-string v6, "originalSubstitution"

    aput-object v6, v3, v5

    :goto_2
    const-string v5, "substituteTypeParameters"

    const/4 v6, 0x1

    if-eq p0, v0, :cond_2

    aput-object v4, v3, v6

    goto :goto_3

    :cond_2
    aput-object v5, v3, v6

    :goto_3
    if-eq p0, v0, :cond_3

    aput-object v5, v3, v2

    :cond_3
    invoke-static {v1, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    if-eq p0, v0, :cond_4

    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-direct {p0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    goto :goto_4

    :cond_4
    new-instance p0, Ljava/lang/IllegalStateException;

    invoke-direct {p0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    :goto_4
    throw p0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_4
        :pswitch_3
        :pswitch_2
    .end packed-switch
.end method

.method public static b(Ljava/util/List;LF8/l0;LO7/m;Ljava/util/List;)LF8/n0;
    .locals 1

    .prologue
    if-nez p0, :cond_0

    const/4 v0, 0x0

    invoke-static {v0}, LF8/s;->a(I)V

    :cond_0
    if-nez p1, :cond_1

    const/4 v0, 0x1

    invoke-static {v0}, LF8/s;->a(I)V

    :cond_1
    if-nez p2, :cond_2

    const/4 v0, 0x2

    invoke-static {v0}, LF8/s;->a(I)V

    :cond_2
    if-nez p3, :cond_3

    const/4 v0, 0x3

    invoke-static {v0}, LF8/s;->a(I)V

    :cond_3
    const/4 v0, 0x0

    invoke-static {p0, p1, p2, p3, v0}, LF8/s;->c(Ljava/util/List;LF8/l0;LO7/m;Ljava/util/List;[Z)LF8/n0;

    move-result-object p0

    if-eqz p0, :cond_4

    return-object p0

    :cond_4
    new-instance p0, Ljava/lang/AssertionError;

    const-string p1, "Substitution failed"

    invoke-direct {p0, p1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p0
.end method

.method public static c(Ljava/util/List;LF8/l0;LO7/m;Ljava/util/List;[Z)LF8/n0;
    .locals 16

    .prologue
    move-object/from16 v0, p1

    move-object/from16 v1, p3

    if-nez p0, :cond_0

    const/4 v2, 0x5

    invoke-static {v2}, LF8/s;->a(I)V

    :cond_0
    if-nez v0, :cond_1

    const/4 v2, 0x6

    invoke-static {v2}, LF8/s;->a(I)V

    :cond_1
    if-nez p2, :cond_2

    const/4 v2, 0x7

    invoke-static {v2}, LF8/s;->a(I)V

    :cond_2
    if-nez v1, :cond_3

    const/16 v2, 0x8

    invoke-static {v2}, LF8/s;->a(I)V

    :cond_3
    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    new-instance v11, Ljava/util/HashMap;

    invoke-direct {v11}, Ljava/util/HashMap;-><init>()V

    invoke-interface/range {p0 .. p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v12

    const/4 v13, 0x0

    move v8, v13

    :goto_0
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v14, v3

    check-cast v14, LO7/f0;

    invoke-interface {v14}, LP7/a;->k()LP7/g;

    move-result-object v4

    invoke-interface {v14}, LO7/f0;->K()Z

    move-result v5

    invoke-interface {v14}, LO7/f0;->s()LF8/u0;

    move-result-object v6

    invoke-interface {v14}, LO7/I;->getName()Ln8/f;

    move-result-object v7

    add-int/lit8 v15, v8, 0x1

    sget-object v9, LO7/a0;->a:LO7/a0;

    invoke-interface {v14}, LO7/f0;->p0()LE8/n;

    move-result-object v10

    move-object/from16 v3, p2

    invoke-static/range {v3 .. v10}, LR7/K;->Y0(LO7/m;LP7/g;ZLF8/u0;Ln8/f;ILO7/a0;LE8/n;)LR7/K;

    move-result-object v3

    invoke-interface {v14}, LO7/f0;->p()LF8/e0;

    move-result-object v4

    new-instance v5, LF8/k0;

    invoke-virtual {v3}, LR7/e;->w()LF8/M;

    move-result-object v6

    invoke-direct {v5, v6}, LF8/k0;-><init>(LF8/E;)V

    invoke-interface {v2, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v11, v14, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    move v8, v15

    goto :goto_0

    :cond_4
    invoke-static {v2}, LF8/f0;->j(Ljava/util/Map;)LF8/f0;

    move-result-object v1

    invoke-static {v0, v1}, LF8/n0;->h(LF8/l0;LF8/l0;)LF8/n0;

    move-result-object v2

    invoke-virtual/range {p1 .. p1}, LF8/l0;->h()LF8/l0;

    move-result-object v0

    invoke-static {v0, v1}, LF8/n0;->h(LF8/l0;LF8/l0;)LF8/n0;

    move-result-object v0

    invoke-interface/range {p0 .. p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_9

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LO7/f0;

    invoke-interface {v11, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LR7/K;

    invoke-interface {v3}, LO7/f0;->getUpperBounds()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_8

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, LF8/E;

    invoke-virtual {v5}, LF8/E;->W0()LF8/e0;

    move-result-object v6

    invoke-interface {v6}, LF8/e0;->w()LO7/h;

    move-result-object v6

    instance-of v7, v6, LO7/f0;

    if-eqz v7, :cond_5

    check-cast v6, LO7/f0;

    invoke-static {v6}, LK8/a;->k(LO7/f0;)Z

    move-result v6

    if-eqz v6, :cond_5

    move-object v6, v2

    goto :goto_3

    :cond_5
    move-object v6, v0

    :goto_3
    sget-object v7, LF8/u0;->I:LF8/u0;

    invoke-virtual {v6, v5, v7}, LF8/n0;->p(LF8/E;LF8/u0;)LF8/E;

    move-result-object v6

    if-nez v6, :cond_6

    const/4 v0, 0x0

    return-object v0

    :cond_6
    if-eq v6, v5, :cond_7

    if-eqz p4, :cond_7

    const/4 v5, 0x1

    aput-boolean v5, p4, v13

    :cond_7
    invoke-virtual {v4, v6}, LR7/K;->V0(LF8/E;)V

    goto :goto_2

    :cond_8
    invoke-virtual {v4}, LR7/K;->e1()V

    goto :goto_1

    :cond_9
    return-object v2
.end method
