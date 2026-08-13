.class public abstract LY9/j;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final synthetic a(LX9/f;ILx7/p;)V
    .locals 0

    invoke-static {p0, p1, p2}, LY9/j;->i(LX9/f;ILx7/p;)V

    return-void
.end method

.method private static final b(Ljava/util/List;)Ljava/util/Map;
    .locals 28

    .prologue
    sget-object v0, LX9/Q;->D:LX9/Q$a;

    const/4 v1, 0x1

    const/4 v2, 0x0

    const-string v3, "/"

    const/4 v4, 0x0

    invoke-static {v0, v3, v4, v1, v2}, LX9/Q$a;->e(LX9/Q$a;Ljava/lang/String;ZILjava/lang/Object;)LX9/Q;

    move-result-object v0

    move-object v6, v0

    new-instance v2, LY9/i;

    move-object v5, v2

    const v26, 0xfffc

    const/16 v27, 0x0

    const/4 v7, 0x1

    const/4 v8, 0x0

    const-wide/16 v9, 0x0

    const-wide/16 v11, 0x0

    const-wide/16 v13, 0x0

    const/4 v15, 0x0

    const-wide/16 v16, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    invoke-direct/range {v5 .. v27}, LY9/i;-><init>(LX9/Q;ZLjava/lang/String;JJJIJIILjava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;ILy7/k;)V

    invoke-static {v0, v2}, Li7/B;->a(Ljava/lang/Object;Ljava/lang/Object;)Li7/u;

    move-result-object v0

    new-array v1, v1, [Li7/u;

    aput-object v0, v1, v4

    invoke-static {v1}, Lj7/S;->l([Li7/u;)Ljava/util/Map;

    move-result-object v0

    move-object/from16 v1, p0

    check-cast v1, Ljava/lang/Iterable;

    new-instance v2, LY9/j$a;

    invoke-direct {v2}, LY9/j$a;-><init>()V

    invoke-static {v1, v2}, Lj7/v;->L0(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LY9/i;

    invoke-virtual {v2}, LY9/i;->b()LX9/Q;

    move-result-object v3

    invoke-interface {v0, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LY9/i;

    if-nez v3, :cond_0

    :goto_1
    invoke-virtual {v2}, LY9/i;->b()LX9/Q;

    move-result-object v3

    invoke-virtual {v3}, LX9/Q;->s()LX9/Q;

    move-result-object v3

    if-nez v3, :cond_1

    goto :goto_0

    :cond_1
    invoke-interface {v0, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LY9/i;

    if-eqz v4, :cond_2

    invoke-virtual {v4}, LY9/i;->c()Ljava/util/List;

    move-result-object v3

    check-cast v3, Ljava/util/Collection;

    invoke-virtual {v2}, LY9/i;->b()LX9/Q;

    move-result-object v2

    invoke-interface {v3, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    new-instance v5, LY9/i;

    move-object v4, v5

    const v25, 0xfffc

    const/16 v26, 0x0

    const/4 v6, 0x1

    const/4 v7, 0x0

    const-wide/16 v8, 0x0

    const-wide/16 v10, 0x0

    const-wide/16 v12, 0x0

    const/4 v14, 0x0

    const-wide/16 v15, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    move-object/from16 p0, v1

    move-object v1, v5

    move-object v5, v3

    invoke-direct/range {v4 .. v26}, LY9/i;-><init>(LX9/Q;ZLjava/lang/String;JJJIJIILjava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;ILy7/k;)V

    invoke-interface {v0, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v1}, LY9/i;->c()Ljava/util/List;

    move-result-object v3

    check-cast v3, Ljava/util/Collection;

    invoke-virtual {v2}, LY9/i;->b()LX9/Q;

    move-result-object v2

    invoke-interface {v3, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move-object v2, v1

    move-object/from16 v1, p0

    goto :goto_1

    :cond_3
    return-object v0
.end method

.method public static final c(II)Ljava/lang/Long;
    .locals 7

    .prologue
    const/4 v0, -0x1

    if-ne p1, v0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    shr-int/lit8 v0, p0, 0x9

    and-int/lit8 v0, v0, 0x7f

    add-int/lit16 v1, v0, 0x7bc

    shr-int/lit8 v0, p0, 0x5

    and-int/lit8 v2, v0, 0xf

    and-int/lit8 v3, p0, 0x1f

    shr-int/lit8 p0, p1, 0xb

    and-int/lit8 v4, p0, 0x1f

    shr-int/lit8 p0, p1, 0x5

    and-int/lit8 v5, p0, 0x3f

    and-int/lit8 p0, p1, 0x1f

    shl-int/lit8 v6, p0, 0x1

    invoke-static/range {v1 .. v6}, LY9/k;->a(IIIIII)J

    move-result-wide p0

    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p0

    return-object p0
.end method

.method public static final d(J)J
    .locals 2

    const/16 v0, 0x2710

    int-to-long v0, v0

    div-long/2addr p0, v0

    const-wide v0, 0xa9730b66800L

    sub-long/2addr p0, v0

    return-wide p0
.end method

.method private static final e(I)Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "0x"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x10

    invoke-static {v1}, LS8/a;->a(I)I

    move-result v1

    invoke-static {p0, v1}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object p0

    const-string v1, "toString(...)"

    invoke-static {p0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final f(LX9/Q;LX9/k;Lx7/l;)LX9/c0;
    .locals 18

    .prologue
    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    const-string v0, "zipPath"

    invoke-static {v1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fileSystem"

    invoke-static {v2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "predicate"

    invoke-static {v3, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2, v1}, LX9/k;->i(LX9/Q;)LX9/i;

    move-result-object v4

    :try_start_0
    invoke-virtual {v4}, LX9/i;->n0()J

    move-result-wide v5

    const/16 v0, 0x16

    int-to-long v7, v0

    sub-long/2addr v5, v7

    const-wide/16 v7, 0x0

    cmp-long v0, v5, v7

    if-ltz v0, :cond_12

    const-wide/32 v9, 0x10000

    sub-long v9, v5, v9

    invoke-static {v9, v10, v7, v8}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v9

    :goto_0
    invoke-virtual {v4, v5, v6}, LX9/i;->o0(J)LX9/Z;

    move-result-object v0

    invoke-static {v0}, LX9/K;->b(LX9/Z;)LX9/f;

    move-result-object v11
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_7

    :try_start_1
    invoke-interface {v11}, LX9/f;->O0()I

    move-result v0

    const v12, 0x6054b50

    if-ne v0, v12, :cond_10

    invoke-static {v11}, LY9/j;->h(LX9/f;)LY9/f;

    move-result-object v9

    invoke-virtual {v9}, LY9/f;->b()I

    move-result v0

    int-to-long v12, v0

    invoke-interface {v11, v12, v13}, LX9/f;->w(J)Ljava/lang/String;

    move-result-object v10
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_c

    :try_start_2
    invoke-interface {v11}, LX9/Z;->close()V

    const/16 v0, 0x14

    int-to-long v11, v0

    sub-long/2addr v5, v11

    cmp-long v0, v5, v7

    const/4 v11, 0x0

    if-lez v0, :cond_9

    invoke-virtual {v4, v5, v6}, LX9/i;->o0(J)LX9/Z;

    move-result-object v0

    invoke-static {v0}, LX9/K;->b(LX9/Z;)LX9/f;

    move-result-object v5
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_7

    :try_start_3
    invoke-interface {v5}, LX9/f;->O0()I

    move-result v0

    const v6, 0x7064b50

    if-ne v0, v6, :cond_5

    invoke-interface {v5}, LX9/f;->O0()I

    move-result v0

    invoke-interface {v5}, LX9/f;->b1()J

    move-result-wide v12

    invoke-interface {v5}, LX9/f;->O0()I

    move-result v6

    const/4 v14, 0x1

    if-ne v6, v14, :cond_4

    if-nez v0, :cond_4

    invoke-virtual {v4, v12, v13}, LX9/i;->o0(J)LX9/Z;

    move-result-object v0

    invoke-static {v0}, LX9/K;->b(LX9/Z;)LX9/f;

    move-result-object v6
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_4

    :try_start_4
    invoke-interface {v6}, LX9/f;->O0()I

    move-result v0

    const v12, 0x6064b50

    if-ne v0, v12, :cond_1

    invoke-static {v6, v9}, LY9/j;->l(LX9/f;LY9/f;)LY9/f;

    move-result-object v9

    sget-object v0, Li7/M;->a:Li7/M;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    if-eqz v6, :cond_0

    :try_start_5
    invoke-interface {v6}, Ljava/io/Closeable;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v0

    goto :goto_4

    :cond_0
    :goto_1
    move-object v0, v11

    goto :goto_4

    :catchall_1
    move-exception v0

    move-object v12, v9

    move-object v9, v0

    goto :goto_2

    :cond_1
    :try_start_6
    new-instance v13, Ljava/io/IOException;

    new-instance v14, Ljava/lang/StringBuilder;

    invoke-direct {v14}, Ljava/lang/StringBuilder;-><init>()V

    const-string v15, "bad zip: expected "

    invoke-virtual {v14, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v12}, LY9/j;->e(I)Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v14, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v12, " but was "

    invoke-virtual {v14, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v0}, LY9/j;->e(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v14, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v13, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v13
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    :goto_2
    if-eqz v6, :cond_2

    :try_start_7
    invoke-interface {v6}, Ljava/io/Closeable;->close()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    goto :goto_3

    :catchall_2
    move-exception v0

    move-object v6, v0

    :try_start_8
    invoke-static {v9, v6}, Li7/g;->a(Ljava/lang/Throwable;Ljava/lang/Throwable;)V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    goto :goto_3

    :catchall_3
    move-exception v0

    move-object v6, v0

    move-object v9, v12

    goto :goto_7

    :cond_2
    :goto_3
    move-object v0, v9

    move-object v9, v12

    :goto_4
    if-nez v0, :cond_3

    goto :goto_5

    :cond_3
    :try_start_9
    throw v0

    :catchall_4
    move-exception v0

    move-object v6, v0

    goto :goto_7

    :cond_4
    new-instance v0, Ljava/io/IOException;

    const-string v6, "unsupported zip: spanned"

    invoke-direct {v0, v6}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_5
    :goto_5
    sget-object v0, Li7/M;->a:Li7/M;
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_4

    if-eqz v5, :cond_6

    :try_start_a
    invoke-interface {v5}, Ljava/io/Closeable;->close()V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_5

    goto :goto_6

    :catchall_5
    move-exception v0

    goto :goto_9

    :cond_6
    :goto_6
    move-object v0, v11

    goto :goto_9

    :goto_7
    if-eqz v5, :cond_7

    :try_start_b
    invoke-interface {v5}, Ljava/io/Closeable;->close()V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_6

    goto :goto_8

    :catchall_6
    move-exception v0

    move-object v5, v0

    :try_start_c
    invoke-static {v6, v5}, Li7/g;->a(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    goto :goto_8

    :catchall_7
    move-exception v0

    move-object v1, v0

    goto/16 :goto_10

    :cond_7
    :goto_8
    move-object v0, v6

    :goto_9
    if-nez v0, :cond_8

    goto :goto_a

    :cond_8
    throw v0

    :cond_9
    :goto_a
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v9}, LY9/f;->a()J

    move-result-wide v12

    invoke-virtual {v4, v12, v13}, LX9/i;->o0(J)LX9/Z;

    move-result-object v0

    invoke-static {v0}, LX9/K;->b(LX9/Z;)LX9/f;

    move-result-object v6
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_7

    :try_start_d
    invoke-virtual {v9}, LY9/f;->c()J

    move-result-wide v12

    :goto_b
    cmp-long v0, v7, v12

    if-gez v0, :cond_c

    invoke-static {v6}, LY9/j;->g(LX9/f;)LY9/i;

    move-result-object v0

    invoke-virtual {v0}, LY9/i;->i()J

    move-result-wide v14

    invoke-virtual {v9}, LY9/f;->a()J

    move-result-wide v16

    cmp-long v14, v14, v16

    if-gez v14, :cond_b

    invoke-interface {v3, v0}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ljava/lang/Boolean;

    invoke-virtual {v14}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v14

    if-eqz v14, :cond_a

    invoke-interface {v5, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_c

    :catchall_8
    move-exception v0

    move-object v11, v0

    goto :goto_d

    :cond_a
    :goto_c
    const-wide/16 v14, 0x1

    add-long/2addr v7, v14

    goto :goto_b

    :cond_b
    new-instance v0, Ljava/io/IOException;

    const-string v3, "bad zip: local file header offset >= central directory offset"

    invoke-direct {v0, v3}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_c
    sget-object v0, Li7/M;->a:Li7/M;
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_8

    if-eqz v6, :cond_d

    :try_start_e
    invoke-interface {v6}, Ljava/io/Closeable;->close()V
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_9

    goto :goto_e

    :catchall_9
    move-exception v0

    move-object v11, v0

    goto :goto_e

    :goto_d
    if-eqz v6, :cond_d

    :try_start_f
    invoke-interface {v6}, Ljava/io/Closeable;->close()V
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_a

    goto :goto_e

    :catchall_a
    move-exception v0

    move-object v3, v0

    :try_start_10
    invoke-static {v11, v3}, Li7/g;->a(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    :cond_d
    :goto_e
    if-nez v11, :cond_f

    invoke-static {v5}, LY9/j;->b(Ljava/util/List;)Ljava/util/Map;

    move-result-object v0

    new-instance v3, LX9/c0;

    invoke-direct {v3, v1, v2, v0, v10}, LX9/c0;-><init>(LX9/Q;LX9/k;Ljava/util/Map;Ljava/lang/String;)V
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_7

    if-eqz v4, :cond_e

    :try_start_11
    invoke-interface {v4}, Ljava/io/Closeable;->close()V
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_b

    :catchall_b
    :cond_e
    return-object v3

    :cond_f
    :try_start_12
    throw v11

    :catchall_c
    move-exception v0

    goto :goto_f

    :cond_10
    invoke-interface {v11}, LX9/Z;->close()V

    const-wide/16 v11, -0x1

    add-long/2addr v5, v11

    cmp-long v0, v5, v9

    if-ltz v0, :cond_11

    goto/16 :goto_0

    :cond_11
    new-instance v0, Ljava/io/IOException;

    const-string v1, "not a zip: end of central directory signature not found"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :goto_f
    invoke-interface {v11}, LX9/Z;->close()V

    throw v0

    :cond_12
    new-instance v0, Ljava/io/IOException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "not a zip: size="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, LX9/i;->n0()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_7

    :goto_10
    if-eqz v4, :cond_13

    :try_start_13
    invoke-interface {v4}, Ljava/io/Closeable;->close()V
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_d

    goto :goto_11

    :catchall_d
    move-exception v0

    move-object v2, v0

    invoke-static {v1, v2}, Li7/g;->a(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    :cond_13
    :goto_11
    throw v1
.end method

.method public static final g(LX9/f;)LY9/i;
    .locals 39

    .prologue
    move-object/from16 v11, p0

    const-string v0, "<this>"

    invoke-static {v11, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface/range {p0 .. p0}, LX9/f;->O0()I

    move-result v0

    const v1, 0x2014b50

    if-ne v0, v1, :cond_7

    const-wide/16 v0, 0x4

    invoke-interface {v11, v0, v1}, LX9/f;->skip(J)V

    invoke-interface/range {p0 .. p0}, LX9/f;->Z0()S

    move-result v0

    const v1, 0xffff

    and-int v2, v0, v1

    const/4 v12, 0x1

    and-int/2addr v0, v12

    if-nez v0, :cond_6

    invoke-interface/range {p0 .. p0}, LX9/f;->Z0()S

    move-result v0

    and-int v23, v0, v1

    invoke-interface/range {p0 .. p0}, LX9/f;->Z0()S

    move-result v0

    and-int v27, v0, v1

    invoke-interface/range {p0 .. p0}, LX9/f;->Z0()S

    move-result v0

    and-int v26, v0, v1

    invoke-interface/range {p0 .. p0}, LX9/f;->O0()I

    move-result v0

    int-to-long v2, v0

    const-wide v4, 0xffffffffL

    and-long v17, v2, v4

    new-instance v13, Ly7/N;

    invoke-direct {v13}, Ly7/N;-><init>()V

    invoke-interface/range {p0 .. p0}, LX9/f;->O0()I

    move-result v0

    int-to-long v2, v0

    and-long/2addr v2, v4

    iput-wide v2, v13, Ly7/N;->C:J

    new-instance v15, Ly7/N;

    invoke-direct {v15}, Ly7/N;-><init>()V

    invoke-interface/range {p0 .. p0}, LX9/f;->O0()I

    move-result v0

    int-to-long v2, v0

    and-long/2addr v2, v4

    iput-wide v2, v15, Ly7/N;->C:J

    invoke-interface/range {p0 .. p0}, LX9/f;->Z0()S

    move-result v0

    and-int/2addr v0, v1

    invoke-interface/range {p0 .. p0}, LX9/f;->Z0()S

    move-result v2

    and-int v14, v2, v1

    invoke-interface/range {p0 .. p0}, LX9/f;->Z0()S

    move-result v2

    and-int v10, v2, v1

    const-wide/16 v1, 0x8

    invoke-interface {v11, v1, v2}, LX9/f;->skip(J)V

    new-instance v9, Ly7/N;

    invoke-direct {v9}, Ly7/N;-><init>()V

    invoke-interface/range {p0 .. p0}, LX9/f;->O0()I

    move-result v1

    int-to-long v1, v1

    and-long/2addr v1, v4

    iput-wide v1, v9, Ly7/N;->C:J

    int-to-long v0, v0

    invoke-interface {v11, v0, v1}, LX9/f;->w(J)Ljava/lang/String;

    move-result-object v8

    const/4 v7, 0x0

    const/4 v6, 0x2

    const/4 v2, 0x0

    invoke-static {v8, v7, v7, v6, v2}, LS8/r;->b0(Ljava/lang/CharSequence;CZILjava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    iget-wide v0, v15, Ly7/N;->C:J

    cmp-long v0, v0, v4

    const-wide/16 v19, 0x0

    const/16 v1, 0x8

    if-nez v0, :cond_0

    int-to-long v2, v1

    goto :goto_0

    :cond_0
    move-wide/from16 v2, v19

    :goto_0
    iget-wide v6, v13, Ly7/N;->C:J

    cmp-long v0, v6, v4

    if-nez v0, :cond_1

    int-to-long v6, v1

    add-long/2addr v2, v6

    :cond_1
    iget-wide v6, v9, Ly7/N;->C:J

    cmp-long v0, v6, v4

    if-nez v0, :cond_2

    int-to-long v0, v1

    add-long/2addr v2, v0

    :cond_2
    move-wide/from16 v24, v2

    new-instance v7, Ly7/O;

    invoke-direct {v7}, Ly7/O;-><init>()V

    new-instance v6, Ly7/O;

    invoke-direct {v6}, Ly7/O;-><init>()V

    new-instance v5, Ly7/O;

    invoke-direct {v5}, Ly7/O;-><init>()V

    new-instance v4, Ly7/K;

    invoke-direct {v4}, Ly7/K;-><init>()V

    new-instance v2, LY9/j$b;

    move-object v0, v2

    move-object v1, v4

    move-object v12, v2

    move-wide/from16 v2, v24

    move-object/from16 v36, v4

    move-object v4, v15

    move-object/from16 v30, v5

    move-object/from16 v5, p0

    move-object/from16 v31, v6

    move-object/from16 v29, v15

    const/4 v15, 0x2

    move-object v6, v13

    move-object/from16 v32, v7

    const/4 v15, 0x0

    move-object v7, v9

    move-object/from16 v37, v8

    move-object/from16 v8, v32

    move-object/from16 v38, v9

    move-object/from16 v9, v31

    move v15, v10

    move-object/from16 v10, v30

    invoke-direct/range {v0 .. v10}, LY9/j$b;-><init>(Ly7/K;JLy7/N;LX9/f;Ly7/N;Ly7/N;Ly7/O;Ly7/O;Ly7/O;)V

    invoke-static {v11, v14, v12}, LY9/j;->i(LX9/f;ILx7/p;)V

    cmp-long v0, v24, v19

    if-lez v0, :cond_4

    move-object/from16 v0, v36

    iget-boolean v0, v0, Ly7/K;->C:Z

    if-eqz v0, :cond_3

    goto :goto_1

    :cond_3
    new-instance v0, Ljava/io/IOException;

    const-string v1, "bad zip: zip64 extra required but absent"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_4
    :goto_1
    int-to-long v0, v15

    invoke-interface {v11, v0, v1}, LX9/f;->w(J)Ljava/lang/String;

    move-result-object v16

    sget-object v0, LX9/Q;->D:LX9/Q$a;

    const-string v1, "/"

    const/4 v2, 0x1

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static {v0, v1, v3, v2, v4}, LX9/Q$a;->e(LX9/Q$a;Ljava/lang/String;ZILjava/lang/Object;)LX9/Q;

    move-result-object v0

    move-object/from16 v2, v37

    invoke-virtual {v0, v2}, LX9/Q;->v(Ljava/lang/String;)LX9/Q;

    move-result-object v14

    const/4 v0, 0x2

    invoke-static {v2, v1, v3, v0, v4}, LS8/r;->J(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v15

    move-object/from16 v0, v29

    new-instance v1, LY9/i;

    move-object v2, v13

    move-object v13, v1

    iget-wide v2, v2, Ly7/N;->C:J

    move-wide/from16 v19, v2

    iget-wide v2, v0, Ly7/N;->C:J

    move-wide/from16 v21, v2

    move-object/from16 v0, v38

    iget-wide v2, v0, Ly7/N;->C:J

    move-wide/from16 v24, v2

    move-object/from16 v0, v32

    iget-object v0, v0, Ly7/O;->C:Ljava/lang/Object;

    move-object/from16 v28, v0

    check-cast v28, Ljava/lang/Long;

    move-object/from16 v0, v31

    iget-object v0, v0, Ly7/O;->C:Ljava/lang/Object;

    move-object/from16 v29, v0

    check-cast v29, Ljava/lang/Long;

    move-object/from16 v0, v30

    iget-object v0, v0, Ly7/O;->C:Ljava/lang/Object;

    move-object/from16 v30, v0

    check-cast v30, Ljava/lang/Long;

    const v34, 0xe000

    const/16 v35, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    invoke-direct/range {v13 .. v35}, LY9/i;-><init>(LX9/Q;ZLjava/lang/String;JJJIJIILjava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;ILy7/k;)V

    return-object v1

    :cond_5
    new-instance v0, Ljava/io/IOException;

    const-string v1, "bad zip: filename contains 0x00"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_6
    new-instance v0, Ljava/io/IOException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "unsupported zip: general purpose bit flag="

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v2}, LY9/j;->e(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_7
    new-instance v2, Ljava/io/IOException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "bad zip: expected "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v1}, LY9/j;->e(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " but was "

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v0}, LY9/j;->e(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v2
.end method

.method private static final h(LX9/f;)LY9/f;
    .locals 10

    .prologue
    invoke-interface {p0}, LX9/f;->Z0()S

    move-result v0

    const v1, 0xffff

    and-int/2addr v0, v1

    invoke-interface {p0}, LX9/f;->Z0()S

    move-result v2

    and-int/2addr v2, v1

    invoke-interface {p0}, LX9/f;->Z0()S

    move-result v3

    and-int/2addr v3, v1

    int-to-long v5, v3

    invoke-interface {p0}, LX9/f;->Z0()S

    move-result v3

    and-int/2addr v3, v1

    int-to-long v3, v3

    cmp-long v3, v5, v3

    if-nez v3, :cond_0

    if-nez v0, :cond_0

    if-nez v2, :cond_0

    const-wide/16 v2, 0x4

    invoke-interface {p0, v2, v3}, LX9/f;->skip(J)V

    invoke-interface {p0}, LX9/f;->O0()I

    move-result v0

    int-to-long v2, v0

    const-wide v7, 0xffffffffL

    and-long/2addr v7, v2

    invoke-interface {p0}, LX9/f;->Z0()S

    move-result p0

    and-int v9, p0, v1

    new-instance p0, LY9/f;

    move-object v4, p0

    invoke-direct/range {v4 .. v9}, LY9/f;-><init>(JJI)V

    return-object p0

    :cond_0
    new-instance p0, Ljava/io/IOException;

    const-string v0, "unsupported zip: spanned"

    invoke-direct {p0, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private static final i(LX9/f;ILx7/p;)V
    .locals 10

    .prologue
    int-to-long v0, p1

    :goto_0
    const-wide/16 v2, 0x0

    cmp-long p1, v0, v2

    if-eqz p1, :cond_4

    const-wide/16 v4, 0x4

    cmp-long p1, v0, v4

    if-ltz p1, :cond_3

    invoke-interface {p0}, LX9/f;->Z0()S

    move-result p1

    const v4, 0xffff

    and-int/2addr p1, v4

    invoke-interface {p0}, LX9/f;->Z0()S

    move-result v4

    int-to-long v4, v4

    const-wide/32 v6, 0xffff

    and-long/2addr v4, v6

    const/4 v6, 0x4

    int-to-long v6, v6

    sub-long/2addr v0, v6

    cmp-long v6, v0, v4

    if-ltz v6, :cond_2

    invoke-interface {p0, v4, v5}, LX9/f;->q(J)V

    invoke-interface {p0}, LX9/f;->d()LX9/d;

    move-result-object v6

    invoke-virtual {v6}, LX9/d;->d1()J

    move-result-wide v6

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v9

    invoke-interface {p2, v8, v9}, Lx7/p;->u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {p0}, LX9/f;->d()LX9/d;

    move-result-object v8

    invoke-virtual {v8}, LX9/d;->d1()J

    move-result-wide v8

    add-long/2addr v8, v4

    sub-long/2addr v8, v6

    cmp-long v2, v8, v2

    if-ltz v2, :cond_1

    if-lez v2, :cond_0

    invoke-interface {p0}, LX9/f;->d()LX9/d;

    move-result-object p1

    invoke-virtual {p1, v8, v9}, LX9/d;->skip(J)V

    :cond_0
    sub-long/2addr v0, v4

    goto :goto_0

    :cond_1
    new-instance p0, Ljava/io/IOException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "unsupported zip: too many bytes processed for "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    new-instance p0, Ljava/io/IOException;

    const-string p1, "bad zip: truncated value in extra field"

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_3
    new-instance p0, Ljava/io/IOException;

    const-string p1, "bad zip: truncated header in extra field"

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_4
    return-void
.end method

.method public static final j(LX9/f;LY9/i;)LY9/i;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "centralDirectoryZipEntry"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, LY9/j;->k(LX9/f;LY9/i;)LY9/i;

    move-result-object p0

    invoke-static {p0}, Ly7/t;->c(Ljava/lang/Object;)V

    return-object p0
.end method

.method private static final k(LX9/f;LY9/i;)LY9/i;
    .locals 6

    .prologue
    invoke-interface {p0}, LX9/f;->O0()I

    move-result v0

    const v1, 0x4034b50

    if-ne v0, v1, :cond_2

    const-wide/16 v0, 0x2

    invoke-interface {p0, v0, v1}, LX9/f;->skip(J)V

    invoke-interface {p0}, LX9/f;->Z0()S

    move-result v0

    const v1, 0xffff

    and-int v2, v0, v1

    and-int/lit8 v0, v0, 0x1

    if-nez v0, :cond_1

    const-wide/16 v2, 0x12

    invoke-interface {p0, v2, v3}, LX9/f;->skip(J)V

    invoke-interface {p0}, LX9/f;->Z0()S

    move-result v0

    int-to-long v2, v0

    const-wide/32 v4, 0xffff

    and-long/2addr v2, v4

    invoke-interface {p0}, LX9/f;->Z0()S

    move-result v0

    and-int/2addr v0, v1

    invoke-interface {p0, v2, v3}, LX9/f;->skip(J)V

    if-nez p1, :cond_0

    int-to-long v0, v0

    invoke-interface {p0, v0, v1}, LX9/f;->skip(J)V

    const/4 p0, 0x0

    return-object p0

    :cond_0
    new-instance v1, Ly7/O;

    invoke-direct {v1}, Ly7/O;-><init>()V

    new-instance v2, Ly7/O;

    invoke-direct {v2}, Ly7/O;-><init>()V

    new-instance v3, Ly7/O;

    invoke-direct {v3}, Ly7/O;-><init>()V

    new-instance v4, LY9/j$c;

    invoke-direct {v4, p0, v1, v2, v3}, LY9/j$c;-><init>(LX9/f;Ly7/O;Ly7/O;Ly7/O;)V

    invoke-static {p0, v0, v4}, LY9/j;->i(LX9/f;ILx7/p;)V

    iget-object p0, v1, Ly7/O;->C:Ljava/lang/Object;

    check-cast p0, Ljava/lang/Integer;

    iget-object v0, v2, Ly7/O;->C:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Integer;

    iget-object v1, v3, Ly7/O;->C:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {p1, p0, v0, v1}, LY9/i;->a(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)LY9/i;

    move-result-object p0

    return-object p0

    :cond_1
    new-instance p0, Ljava/io/IOException;

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "unsupported zip: general purpose bit flag="

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v2}, LY9/j;->e(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    new-instance p0, Ljava/io/IOException;

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "bad zip: expected "

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v1}, LY9/j;->e(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " but was "

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v0}, LY9/j;->e(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private static final l(LX9/f;LY9/f;)LY9/f;
    .locals 8

    .prologue
    const-wide/16 v0, 0xc

    invoke-interface {p0, v0, v1}, LX9/f;->skip(J)V

    invoke-interface {p0}, LX9/f;->O0()I

    move-result v0

    invoke-interface {p0}, LX9/f;->O0()I

    move-result v1

    invoke-interface {p0}, LX9/f;->b1()J

    move-result-wide v3

    invoke-interface {p0}, LX9/f;->b1()J

    move-result-wide v5

    cmp-long v2, v3, v5

    if-nez v2, :cond_0

    if-nez v0, :cond_0

    if-nez v1, :cond_0

    const-wide/16 v0, 0x8

    invoke-interface {p0, v0, v1}, LX9/f;->skip(J)V

    invoke-interface {p0}, LX9/f;->b1()J

    move-result-wide v5

    new-instance p0, LY9/f;

    invoke-virtual {p1}, LY9/f;->b()I

    move-result v7

    move-object v2, p0

    invoke-direct/range {v2 .. v7}, LY9/f;-><init>(JJI)V

    return-object p0

    :cond_0
    new-instance p0, Ljava/io/IOException;

    const-string p1, "unsupported zip: spanned"

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final m(LX9/f;)V
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-static {p0, v0}, LY9/j;->k(LX9/f;LY9/i;)LY9/i;

    return-void
.end method
