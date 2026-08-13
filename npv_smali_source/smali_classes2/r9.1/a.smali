.class public abstract Lr9/a;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a([BII)Ljava/lang/String;
    .locals 16

    .prologue
    move-object/from16 v0, p0

    move/from16 v1, p1

    move/from16 v2, p2

    const/4 v3, 0x4

    const/4 v4, 0x3

    const/4 v5, 0x2

    const/4 v6, 0x1

    const-string v7, "<this>"

    invoke-static {v0, v7}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    if-ltz v1, :cond_19

    array-length v7, v0

    if-gt v2, v7, :cond_19

    if-gt v1, v2, :cond_19

    sub-int v7, v2, v1

    new-array v7, v7, [C

    const/4 v9, 0x0

    :goto_0
    if-ge v1, v2, :cond_18

    aget-byte v10, v0, v1

    if-ltz v10, :cond_1

    int-to-char v10, v10

    add-int/lit8 v11, v9, 0x1

    aput-char v10, v7, v9

    add-int/2addr v1, v6

    :goto_1
    if-ge v1, v2, :cond_0

    aget-byte v9, v0, v1

    if-ltz v9, :cond_0

    add-int/2addr v1, v6

    int-to-char v9, v9

    add-int/lit8 v10, v11, 0x1

    aput-char v9, v7, v11

    move v11, v10

    goto :goto_1

    :cond_0
    sget-object v9, Li7/M;->a:Li7/M;

    :goto_2
    move v9, v11

    goto/16 :goto_13

    :cond_1
    shr-int/lit8 v11, v10, 0x5

    const/4 v12, -0x2

    const/16 v13, 0x80

    const v14, 0xfffd

    if-ne v11, v12, :cond_5

    add-int/lit8 v11, v1, 0x1

    if-gt v2, v11, :cond_2

    int-to-char v10, v14

    add-int/lit8 v11, v9, 0x1

    aput-char v10, v7, v9

    :goto_3
    sget-object v9, Li7/M;->a:Li7/M;

    move v9, v6

    goto :goto_6

    :cond_2
    aget-byte v11, v0, v11

    and-int/lit16 v12, v11, 0xc0

    if-ne v12, v13, :cond_4

    xor-int/lit16 v11, v11, 0xf80

    shl-int/lit8 v10, v10, 0x6

    xor-int/2addr v10, v11

    if-ge v10, v13, :cond_3

    int-to-char v10, v14

    add-int/lit8 v11, v9, 0x1

    aput-char v10, v7, v9

    :goto_4
    sget-object v9, Li7/M;->a:Li7/M;

    goto :goto_5

    :cond_3
    int-to-char v10, v10

    add-int/lit8 v11, v9, 0x1

    aput-char v10, v7, v9

    goto :goto_4

    :goto_5
    move v9, v5

    goto :goto_6

    :cond_4
    int-to-char v10, v14

    add-int/lit8 v11, v9, 0x1

    aput-char v10, v7, v9

    goto :goto_3

    :goto_6
    add-int/2addr v1, v9

    goto :goto_2

    :cond_5
    shr-int/lit8 v11, v10, 0x4

    const v15, 0xe000

    const v3, 0xd800

    if-ne v11, v12, :cond_c

    add-int/lit8 v11, v1, 0x2

    if-gt v2, v11, :cond_7

    int-to-char v3, v14

    add-int/lit8 v10, v9, 0x1

    aput-char v3, v7, v9

    sget-object v3, Li7/M;->a:Li7/M;

    add-int/lit8 v3, v1, 0x1

    if-le v2, v3, :cond_6

    aget-byte v3, v0, v3

    and-int/lit16 v3, v3, 0xc0

    if-ne v3, v13, :cond_6

    :goto_7
    move v3, v5

    goto :goto_b

    :cond_6
    :goto_8
    move v3, v6

    goto :goto_b

    :cond_7
    add-int/lit8 v12, v1, 0x1

    aget-byte v12, v0, v12

    and-int/lit16 v8, v12, 0xc0

    if-ne v8, v13, :cond_b

    aget-byte v8, v0, v11

    and-int/lit16 v11, v8, 0xc0

    if-ne v11, v13, :cond_a

    const v11, -0x1e080

    xor-int/2addr v8, v11

    shl-int/lit8 v11, v12, 0x6

    xor-int/2addr v8, v11

    shl-int/lit8 v10, v10, 0xc

    xor-int/2addr v8, v10

    const/16 v10, 0x800

    if-ge v8, v10, :cond_8

    int-to-char v3, v14

    add-int/lit8 v8, v9, 0x1

    aput-char v3, v7, v9

    :goto_9
    sget-object v3, Li7/M;->a:Li7/M;

    move v10, v8

    goto :goto_a

    :cond_8
    if-gt v3, v8, :cond_9

    if-ge v8, v15, :cond_9

    int-to-char v3, v14

    add-int/lit8 v8, v9, 0x1

    aput-char v3, v7, v9

    goto :goto_9

    :cond_9
    int-to-char v3, v8

    add-int/lit8 v8, v9, 0x1

    aput-char v3, v7, v9

    goto :goto_9

    :goto_a
    move v3, v4

    goto :goto_b

    :cond_a
    int-to-char v3, v14

    add-int/lit8 v10, v9, 0x1

    aput-char v3, v7, v9

    sget-object v3, Li7/M;->a:Li7/M;

    goto :goto_7

    :cond_b
    int-to-char v3, v14

    add-int/lit8 v10, v9, 0x1

    aput-char v3, v7, v9

    sget-object v3, Li7/M;->a:Li7/M;

    goto :goto_8

    :goto_b
    add-int/2addr v1, v3

    move v9, v10

    goto/16 :goto_13

    :cond_c
    shr-int/lit8 v8, v10, 0x3

    if-ne v8, v12, :cond_17

    add-int/lit8 v8, v1, 0x3

    if-gt v2, v8, :cond_f

    add-int/lit8 v3, v9, 0x1

    aput-char v14, v7, v9

    sget-object v8, Li7/M;->a:Li7/M;

    add-int/lit8 v8, v1, 0x1

    if-le v2, v8, :cond_e

    aget-byte v8, v0, v8

    and-int/lit16 v8, v8, 0xc0

    if-ne v8, v13, :cond_e

    add-int/lit8 v8, v1, 0x2

    if-le v2, v8, :cond_d

    aget-byte v8, v0, v8

    and-int/lit16 v8, v8, 0xc0

    if-ne v8, v13, :cond_d

    goto/16 :goto_11

    :cond_d
    :goto_c
    move v4, v5

    goto/16 :goto_11

    :cond_e
    :goto_d
    move v4, v6

    goto/16 :goto_11

    :cond_f
    add-int/lit8 v11, v1, 0x1

    aget-byte v11, v0, v11

    and-int/lit16 v12, v11, 0xc0

    if-ne v12, v13, :cond_16

    add-int/lit8 v12, v1, 0x2

    aget-byte v12, v0, v12

    and-int/lit16 v4, v12, 0xc0

    if-ne v4, v13, :cond_15

    aget-byte v4, v0, v8

    and-int/lit16 v8, v4, 0xc0

    if-ne v8, v13, :cond_14

    const v8, 0x381f80

    xor-int/2addr v4, v8

    shl-int/lit8 v8, v12, 0x6

    xor-int/2addr v4, v8

    shl-int/lit8 v8, v11, 0xc

    xor-int/2addr v4, v8

    shl-int/lit8 v8, v10, 0x12

    xor-int/2addr v4, v8

    const v8, 0x10ffff

    if-le v4, v8, :cond_10

    add-int/lit8 v3, v9, 0x1

    aput-char v14, v7, v9

    :goto_e
    sget-object v4, Li7/M;->a:Li7/M;

    goto :goto_10

    :cond_10
    if-gt v3, v4, :cond_11

    if-ge v4, v15, :cond_11

    add-int/lit8 v3, v9, 0x1

    aput-char v14, v7, v9

    goto :goto_e

    :cond_11
    const/high16 v3, 0x10000

    if-ge v4, v3, :cond_12

    add-int/lit8 v3, v9, 0x1

    aput-char v14, v7, v9

    goto :goto_e

    :cond_12
    if-eq v4, v14, :cond_13

    ushr-int/lit8 v3, v4, 0xa

    const v8, 0xd7c0

    add-int/2addr v3, v8

    int-to-char v3, v3

    add-int/lit8 v8, v9, 0x1

    aput-char v3, v7, v9

    and-int/lit16 v3, v4, 0x3ff

    const v4, 0xdc00

    add-int/2addr v3, v4

    int-to-char v3, v3

    add-int/2addr v9, v5

    aput-char v3, v7, v8

    goto :goto_f

    :cond_13
    add-int/lit8 v3, v9, 0x1

    aput-char v14, v7, v9

    move v9, v3

    :goto_f
    sget-object v3, Li7/M;->a:Li7/M;

    move v3, v9

    :goto_10
    const/4 v4, 0x4

    goto :goto_11

    :cond_14
    add-int/lit8 v3, v9, 0x1

    aput-char v14, v7, v9

    sget-object v4, Li7/M;->a:Li7/M;

    const/4 v4, 0x3

    goto :goto_11

    :cond_15
    add-int/lit8 v3, v9, 0x1

    aput-char v14, v7, v9

    sget-object v4, Li7/M;->a:Li7/M;

    goto :goto_c

    :cond_16
    add-int/lit8 v3, v9, 0x1

    aput-char v14, v7, v9

    sget-object v4, Li7/M;->a:Li7/M;

    goto :goto_d

    :goto_11
    add-int/2addr v1, v4

    :goto_12
    move v9, v3

    goto :goto_13

    :cond_17
    add-int/lit8 v3, v9, 0x1

    aput-char v14, v7, v9

    add-int/2addr v1, v6

    goto :goto_12

    :goto_13
    const/4 v3, 0x4

    const/4 v4, 0x3

    goto/16 :goto_0

    :cond_18
    const/4 v1, 0x0

    invoke-static {v7, v1, v9}, LS8/r;->A([CII)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_19
    new-instance v3, Ljava/lang/IndexOutOfBoundsException;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "size="

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    array-length v0, v0

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, " beginIndex="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, " endIndex="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v3, v0}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v3
.end method

.method public static synthetic b([BIIILjava/lang/Object;)Ljava/lang/String;
    .locals 0

    .prologue
    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    const/4 p1, 0x0

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    array-length p2, p0

    :cond_1
    invoke-static {p0, p1, p2}, Lr9/a;->a([BII)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
