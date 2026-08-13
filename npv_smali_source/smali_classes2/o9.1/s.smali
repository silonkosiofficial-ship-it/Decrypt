.class public abstract Lo9/s;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method private static final a(Lo9/a;J)Ljava/lang/String;
    .locals 4

    .prologue
    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-nez v0, :cond_0

    const-string p0, ""

    return-object p0

    :cond_0
    sget-object v0, Ls9/d;->a:Ls9/d;

    invoke-virtual {p0}, Lo9/a;->o()Lo9/k;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-static {}, Ls9/e;->a()Ls9/b;

    invoke-virtual {v0}, Lo9/k;->j()I

    move-result v1

    int-to-long v1, v1

    cmp-long v1, v1, p1

    if-ltz v1, :cond_1

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo9/k;->b(Z)[B

    move-result-object v1

    invoke-virtual {v0}, Lo9/k;->f()I

    move-result v2

    invoke-virtual {v0}, Lo9/k;->d()I

    move-result v0

    long-to-int v3, p1

    add-int/2addr v3, v2

    invoke-static {v0, v3}, Ljava/lang/Math;->min(II)I

    move-result v0

    invoke-static {v1, v2, v0}, Lr9/a;->a([BII)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, p1, p2}, Lo9/a;->skip(J)V

    return-object v0

    :cond_1
    long-to-int p1, p1

    invoke-static {p0, p1}, Lo9/r;->b(Lo9/q;I)[B

    move-result-object p0

    const/4 p1, 0x3

    const/4 p2, 0x0

    const/4 v0, 0x0

    invoke-static {p0, v0, v0, p1, p2}, Lr9/a;->b([BIIILjava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_2
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "Unreacheable"

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final b(Lo9/q;)Ljava/lang/String;
    .locals 3

    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-wide v0, 0x7fffffffffffffffL

    invoke-interface {p0, v0, v1}, Lo9/q;->G0(J)Z

    invoke-interface {p0}, Lo9/q;->d()Lo9/a;

    move-result-object v0

    invoke-interface {p0}, Lo9/q;->d()Lo9/a;

    move-result-object p0

    invoke-virtual {p0}, Lo9/a;->r()J

    move-result-wide v1

    invoke-static {v0, v1, v2}, Lo9/s;->a(Lo9/a;J)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Lo9/q;J)Ljava/lang/String;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1, p2}, Lo9/q;->q(J)V

    invoke-interface {p0}, Lo9/q;->d()Lo9/a;

    move-result-object p0

    invoke-static {p0, p1, p2}, Lo9/s;->a(Lo9/a;J)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Lo9/p;Ljava/lang/String;II)V
    .locals 20

    .prologue
    move-object/from16 v0, p1

    move/from16 v1, p3

    const/4 v2, 0x2

    const/4 v3, 0x1

    const-string v4, "<this>"

    move-object/from16 v5, p0

    invoke-static {v5, v4}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "string"

    invoke-static {v0, v4}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual/range {p1 .. p1}, Ljava/lang/String;->length()I

    move-result v4

    int-to-long v6, v4

    move/from16 v4, p2

    int-to-long v8, v4

    int-to-long v10, v1

    invoke-static/range {v6 .. v11}, Lo9/t;->a(JJJ)V

    invoke-interface/range {p0 .. p0}, Lo9/p;->d()Lo9/a;

    move-result-object v6

    :cond_0
    :goto_0
    if-ge v4, v1, :cond_b

    new-instance v7, Ly7/M;

    invoke-direct {v7}, Ly7/M;-><init>()V

    invoke-virtual {v0, v4}, Ljava/lang/String;->charAt(I)C

    move-result v8

    iput v8, v7, Ly7/M;->C:I

    const/16 v9, 0x80

    if-ge v8, v9, :cond_5

    sget-object v8, Ls9/d;->a:Ls9/d;

    invoke-virtual {v6, v3}, Lo9/a;->n0(I)Lo9/k;

    move-result-object v8

    invoke-static {}, Ls9/e;->b()Ls9/c;

    move-result-object v10

    neg-int v11, v4

    invoke-virtual {v8}, Lo9/k;->h()I

    move-result v12

    add-int/2addr v12, v4

    invoke-static {v1, v12}, Ljava/lang/Math;->min(II)I

    move-result v12

    add-int/lit8 v13, v4, 0x1

    add-int/2addr v4, v11

    iget v14, v7, Ly7/M;->C:I

    int-to-byte v14, v14

    invoke-interface {v10, v8, v4, v14}, Ls9/c;->c(Lo9/k;IB)V

    move v4, v13

    :goto_1
    if-ge v4, v12, :cond_1

    invoke-virtual {v0, v4}, Ljava/lang/String;->charAt(I)C

    move-result v13

    iput v13, v7, Ly7/M;->C:I

    if-ge v13, v9, :cond_1

    add-int/lit8 v14, v4, 0x1

    add-int/2addr v4, v11

    int-to-byte v13, v13

    invoke-interface {v10, v8, v4, v13}, Ls9/c;->c(Lo9/k;IB)V

    move v4, v14

    goto :goto_1

    :cond_1
    add-int/2addr v11, v4

    if-ne v11, v3, :cond_2

    :goto_2
    invoke-virtual {v8}, Lo9/k;->d()I

    move-result v7

    add-int/2addr v7, v11

    invoke-virtual {v8, v7}, Lo9/k;->q(I)V

    invoke-virtual {v6}, Lo9/a;->s()J

    move-result-wide v7

    int-to-long v9, v11

    add-long/2addr v7, v9

    invoke-virtual {v6, v7, v8}, Lo9/a;->R(J)V

    goto :goto_0

    :cond_2
    if-ltz v11, :cond_4

    invoke-virtual {v8}, Lo9/k;->h()I

    move-result v7

    if-gt v11, v7, :cond_4

    if-eqz v11, :cond_3

    goto :goto_2

    :cond_3
    invoke-static {v8}, Lo9/m;->a(Lo9/k;)Z

    move-result v7

    if-eqz v7, :cond_0

    invoke-virtual {v6}, Lo9/a;->H()V

    goto :goto_0

    :cond_4
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Invalid number of bytes written: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ". Should be in 0.."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Lo9/k;->h()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_5
    const/16 v10, 0x800

    const/4 v11, 0x0

    const/16 v12, 0x3f

    if-ge v8, v10, :cond_6

    sget-object v8, Ls9/d;->a:Ls9/d;

    invoke-virtual {v6, v2}, Lo9/a;->n0(I)Lo9/k;

    move-result-object v8

    invoke-static {}, Ls9/e;->b()Ls9/c;

    move-result-object v10

    iget v7, v7, Ly7/M;->C:I

    shr-int/lit8 v13, v7, 0x6

    or-int/lit16 v13, v13, 0xc0

    int-to-byte v13, v13

    and-int/2addr v7, v12

    or-int/2addr v7, v9

    int-to-byte v7, v7

    invoke-interface {v10, v8, v11, v13, v7}, Ls9/c;->a(Lo9/k;IBB)V

    invoke-virtual {v8}, Lo9/k;->d()I

    move-result v7

    add-int/2addr v7, v2

    invoke-virtual {v8, v7}, Lo9/k;->q(I)V

    invoke-virtual {v6}, Lo9/a;->s()J

    move-result-wide v7

    int-to-long v9, v2

    add-long/2addr v7, v9

    invoke-virtual {v6, v7, v8}, Lo9/a;->R(J)V

    :goto_3
    add-int/2addr v4, v3

    goto/16 :goto_0

    :cond_6
    const v10, 0xd800

    if-lt v8, v10, :cond_a

    const v10, 0xdfff

    if-le v8, v10, :cond_7

    goto :goto_4

    :cond_7
    add-int/lit8 v8, v4, 0x1

    if-ge v8, v1, :cond_8

    invoke-virtual {v0, v8}, Ljava/lang/String;->charAt(I)C

    move-result v11

    :cond_8
    iget v7, v7, Ly7/M;->C:I

    const v10, 0xdbff

    if-gt v7, v10, :cond_9

    const v10, 0xdc00

    if-gt v10, v11, :cond_9

    const v10, 0xe000

    if-ge v11, v10, :cond_9

    and-int/lit16 v7, v7, 0x3ff

    shl-int/lit8 v7, v7, 0xa

    and-int/lit16 v8, v11, 0x3ff

    or-int/2addr v7, v8

    const/high16 v8, 0x10000

    add-int/2addr v7, v8

    sget-object v8, Ls9/d;->a:Ls9/d;

    const/4 v8, 0x4

    invoke-virtual {v6, v8}, Lo9/a;->n0(I)Lo9/k;

    move-result-object v10

    invoke-static {}, Ls9/e;->b()Ls9/c;

    move-result-object v13

    shr-int/lit8 v11, v7, 0x12

    or-int/lit16 v11, v11, 0xf0

    int-to-byte v11, v11

    shr-int/lit8 v14, v7, 0xc

    and-int/2addr v14, v12

    or-int/2addr v14, v9

    int-to-byte v15, v14

    shr-int/lit8 v14, v7, 0x6

    and-int/2addr v14, v12

    or-int/2addr v14, v9

    int-to-byte v14, v14

    and-int/2addr v7, v12

    or-int/2addr v7, v9

    int-to-byte v7, v7

    const/4 v9, 0x0

    move v12, v14

    move-object v14, v10

    move/from16 v17, v15

    move v15, v9

    move/from16 v16, v11

    move/from16 v18, v12

    move/from16 v19, v7

    invoke-interface/range {v13 .. v19}, Ls9/c;->b(Lo9/k;IBBBB)V

    invoke-virtual {v10}, Lo9/k;->d()I

    move-result v7

    add-int/2addr v7, v8

    invoke-virtual {v10, v7}, Lo9/k;->q(I)V

    invoke-virtual {v6}, Lo9/a;->s()J

    move-result-wide v9

    int-to-long v7, v8

    add-long/2addr v9, v7

    invoke-virtual {v6, v9, v10}, Lo9/a;->R(J)V

    add-int/2addr v4, v2

    goto/16 :goto_0

    :cond_9
    invoke-virtual {v6, v12}, Lo9/a;->o0(B)V

    move v4, v8

    goto/16 :goto_0

    :cond_a
    :goto_4
    sget-object v8, Ls9/d;->a:Ls9/d;

    const/4 v8, 0x3

    invoke-virtual {v6, v8}, Lo9/a;->n0(I)Lo9/k;

    move-result-object v10

    invoke-static {}, Ls9/e;->b()Ls9/c;

    move-result-object v13

    iget v7, v7, Ly7/M;->C:I

    shr-int/lit8 v11, v7, 0xc

    or-int/lit16 v11, v11, 0xe0

    int-to-byte v11, v11

    shr-int/lit8 v14, v7, 0x6

    and-int/2addr v14, v12

    or-int/2addr v14, v9

    int-to-byte v15, v14

    and-int/2addr v7, v12

    or-int/2addr v7, v9

    int-to-byte v7, v7

    const/4 v9, 0x0

    move-object v14, v10

    move v12, v15

    move v15, v9

    move/from16 v16, v11

    move/from16 v17, v12

    move/from16 v18, v7

    invoke-interface/range {v13 .. v18}, Ls9/c;->d(Lo9/k;IBBB)V

    invoke-virtual {v10}, Lo9/k;->d()I

    move-result v7

    add-int/2addr v7, v8

    invoke-virtual {v10, v7}, Lo9/k;->q(I)V

    invoke-virtual {v6}, Lo9/a;->s()J

    move-result-wide v9

    int-to-long v7, v8

    add-long/2addr v9, v7

    invoke-virtual {v6, v9, v10}, Lo9/a;->R(J)V

    goto/16 :goto_3

    :cond_b
    invoke-interface/range {p0 .. p0}, Lo9/p;->J0()V

    return-void
.end method
