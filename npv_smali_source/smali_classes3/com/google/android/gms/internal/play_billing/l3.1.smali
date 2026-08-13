.class final Lcom/google/android/gms/internal/play_billing/l3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/play_billing/t3;


# static fields
.field private static final l:[I

.field private static final m:Lsun/misc/Unsafe;


# instance fields
.field private final a:[I

.field private final b:[Ljava/lang/Object;

.field private final c:I

.field private final d:I

.field private final e:Lcom/google/android/gms/internal/play_billing/i3;

.field private final f:Z

.field private final g:[I

.field private final h:I

.field private final i:I

.field private final j:Lcom/google/android/gms/internal/play_billing/z3;

.field private final k:Lcom/google/android/gms/internal/play_billing/B2;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x0

    new-array v0, v0, [I

    sput-object v0, Lcom/google/android/gms/internal/play_billing/l3;->l:[I

    invoke-static {}, Lcom/google/android/gms/internal/play_billing/G3;->l()Lsun/misc/Unsafe;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/play_billing/l3;->m:Lsun/misc/Unsafe;

    return-void
.end method

.method private constructor <init>([I[Ljava/lang/Object;IILcom/google/android/gms/internal/play_billing/i3;Z[IIILcom/google/android/gms/internal/play_billing/n3;Lcom/google/android/gms/internal/play_billing/V2;Lcom/google/android/gms/internal/play_billing/z3;Lcom/google/android/gms/internal/play_billing/B2;Lcom/google/android/gms/internal/play_billing/d3;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/play_billing/l3;->a:[I

    iput-object p2, p0, Lcom/google/android/gms/internal/play_billing/l3;->b:[Ljava/lang/Object;

    iput p3, p0, Lcom/google/android/gms/internal/play_billing/l3;->c:I

    iput p4, p0, Lcom/google/android/gms/internal/play_billing/l3;->d:I

    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/google/android/gms/internal/play_billing/l3;->f:Z

    iput-object p7, p0, Lcom/google/android/gms/internal/play_billing/l3;->g:[I

    iput p8, p0, Lcom/google/android/gms/internal/play_billing/l3;->h:I

    iput p9, p0, Lcom/google/android/gms/internal/play_billing/l3;->i:I

    iput-object p12, p0, Lcom/google/android/gms/internal/play_billing/l3;->j:Lcom/google/android/gms/internal/play_billing/z3;

    iput-object p13, p0, Lcom/google/android/gms/internal/play_billing/l3;->k:Lcom/google/android/gms/internal/play_billing/B2;

    iput-object p5, p0, Lcom/google/android/gms/internal/play_billing/l3;->e:Lcom/google/android/gms/internal/play_billing/i3;

    return-void
.end method

.method static A(Ljava/lang/Class;Lcom/google/android/gms/internal/play_billing/f3;Lcom/google/android/gms/internal/play_billing/n3;Lcom/google/android/gms/internal/play_billing/V2;Lcom/google/android/gms/internal/play_billing/z3;Lcom/google/android/gms/internal/play_billing/B2;Lcom/google/android/gms/internal/play_billing/d3;)Lcom/google/android/gms/internal/play_billing/l3;
    .locals 34

    .prologue
    move-object/from16 v0, p1

    instance-of v1, v0, Lcom/google/android/gms/internal/play_billing/s3;

    if-eqz v1, :cond_37

    check-cast v0, Lcom/google/android/gms/internal/play_billing/s3;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/play_billing/s3;->d()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    const/4 v3, 0x0

    invoke-virtual {v1, v3}, Ljava/lang/String;->charAt(I)C

    move-result v4

    const v5, 0xd800

    if-lt v4, v5, :cond_0

    const/4 v4, 0x1

    :goto_0
    add-int/lit8 v7, v4, 0x1

    invoke-virtual {v1, v4}, Ljava/lang/String;->charAt(I)C

    move-result v4

    if-lt v4, v5, :cond_1

    move v4, v7

    goto :goto_0

    :cond_0
    const/4 v7, 0x1

    :cond_1
    add-int/lit8 v4, v7, 0x1

    invoke-virtual {v1, v7}, Ljava/lang/String;->charAt(I)C

    move-result v7

    if-lt v7, v5, :cond_3

    and-int/lit16 v7, v7, 0x1fff

    const/16 v9, 0xd

    :goto_1
    add-int/lit8 v10, v4, 0x1

    invoke-virtual {v1, v4}, Ljava/lang/String;->charAt(I)C

    move-result v4

    if-lt v4, v5, :cond_2

    and-int/lit16 v4, v4, 0x1fff

    shl-int/2addr v4, v9

    or-int/2addr v7, v4

    add-int/lit8 v9, v9, 0xd

    move v4, v10

    goto :goto_1

    :cond_2
    shl-int/2addr v4, v9

    or-int/2addr v7, v4

    move v4, v10

    :cond_3
    if-nez v7, :cond_4

    sget-object v7, Lcom/google/android/gms/internal/play_billing/l3;->l:[I

    move v9, v3

    move v11, v9

    move v12, v11

    move v13, v12

    move v14, v13

    move/from16 v17, v14

    move-object/from16 v16, v7

    move/from16 v7, v17

    goto/16 :goto_a

    :cond_4
    add-int/lit8 v7, v4, 0x1

    invoke-virtual {v1, v4}, Ljava/lang/String;->charAt(I)C

    move-result v4

    if-lt v4, v5, :cond_6

    and-int/lit16 v4, v4, 0x1fff

    const/16 v9, 0xd

    :goto_2
    add-int/lit8 v10, v7, 0x1

    invoke-virtual {v1, v7}, Ljava/lang/String;->charAt(I)C

    move-result v7

    if-lt v7, v5, :cond_5

    and-int/lit16 v7, v7, 0x1fff

    shl-int/2addr v7, v9

    or-int/2addr v4, v7

    add-int/lit8 v9, v9, 0xd

    move v7, v10

    goto :goto_2

    :cond_5
    shl-int/2addr v7, v9

    or-int/2addr v4, v7

    move v7, v10

    :cond_6
    add-int/lit8 v9, v7, 0x1

    invoke-virtual {v1, v7}, Ljava/lang/String;->charAt(I)C

    move-result v7

    if-lt v7, v5, :cond_8

    and-int/lit16 v7, v7, 0x1fff

    const/16 v10, 0xd

    :goto_3
    add-int/lit8 v11, v9, 0x1

    invoke-virtual {v1, v9}, Ljava/lang/String;->charAt(I)C

    move-result v9

    if-lt v9, v5, :cond_7

    and-int/lit16 v9, v9, 0x1fff

    shl-int/2addr v9, v10

    or-int/2addr v7, v9

    add-int/lit8 v10, v10, 0xd

    move v9, v11

    goto :goto_3

    :cond_7
    shl-int/2addr v9, v10

    or-int/2addr v7, v9

    move v9, v11

    :cond_8
    add-int/lit8 v10, v9, 0x1

    invoke-virtual {v1, v9}, Ljava/lang/String;->charAt(I)C

    move-result v9

    if-lt v9, v5, :cond_a

    and-int/lit16 v9, v9, 0x1fff

    const/16 v11, 0xd

    :goto_4
    add-int/lit8 v12, v10, 0x1

    invoke-virtual {v1, v10}, Ljava/lang/String;->charAt(I)C

    move-result v10

    if-lt v10, v5, :cond_9

    and-int/lit16 v10, v10, 0x1fff

    shl-int/2addr v10, v11

    or-int/2addr v9, v10

    add-int/lit8 v11, v11, 0xd

    move v10, v12

    goto :goto_4

    :cond_9
    shl-int/2addr v10, v11

    or-int/2addr v9, v10

    move v10, v12

    :cond_a
    add-int/lit8 v11, v10, 0x1

    invoke-virtual {v1, v10}, Ljava/lang/String;->charAt(I)C

    move-result v10

    if-lt v10, v5, :cond_c

    and-int/lit16 v10, v10, 0x1fff

    const/16 v12, 0xd

    :goto_5
    add-int/lit8 v13, v11, 0x1

    invoke-virtual {v1, v11}, Ljava/lang/String;->charAt(I)C

    move-result v11

    if-lt v11, v5, :cond_b

    and-int/lit16 v11, v11, 0x1fff

    shl-int/2addr v11, v12

    or-int/2addr v10, v11

    add-int/lit8 v12, v12, 0xd

    move v11, v13

    goto :goto_5

    :cond_b
    shl-int/2addr v11, v12

    or-int/2addr v10, v11

    move v11, v13

    :cond_c
    add-int/lit8 v12, v11, 0x1

    invoke-virtual {v1, v11}, Ljava/lang/String;->charAt(I)C

    move-result v11

    if-lt v11, v5, :cond_e

    and-int/lit16 v11, v11, 0x1fff

    const/16 v13, 0xd

    :goto_6
    add-int/lit8 v14, v12, 0x1

    invoke-virtual {v1, v12}, Ljava/lang/String;->charAt(I)C

    move-result v12

    if-lt v12, v5, :cond_d

    and-int/lit16 v12, v12, 0x1fff

    shl-int/2addr v12, v13

    or-int/2addr v11, v12

    add-int/lit8 v13, v13, 0xd

    move v12, v14

    goto :goto_6

    :cond_d
    shl-int/2addr v12, v13

    or-int/2addr v11, v12

    move v12, v14

    :cond_e
    add-int/lit8 v13, v12, 0x1

    invoke-virtual {v1, v12}, Ljava/lang/String;->charAt(I)C

    move-result v12

    if-lt v12, v5, :cond_10

    and-int/lit16 v12, v12, 0x1fff

    const/16 v14, 0xd

    :goto_7
    add-int/lit8 v15, v13, 0x1

    invoke-virtual {v1, v13}, Ljava/lang/String;->charAt(I)C

    move-result v13

    if-lt v13, v5, :cond_f

    and-int/lit16 v13, v13, 0x1fff

    shl-int/2addr v13, v14

    or-int/2addr v12, v13

    add-int/lit8 v14, v14, 0xd

    move v13, v15

    goto :goto_7

    :cond_f
    shl-int/2addr v13, v14

    or-int/2addr v12, v13

    move v13, v15

    :cond_10
    add-int/lit8 v14, v13, 0x1

    invoke-virtual {v1, v13}, Ljava/lang/String;->charAt(I)C

    move-result v13

    if-lt v13, v5, :cond_12

    and-int/lit16 v13, v13, 0x1fff

    const/16 v15, 0xd

    :goto_8
    add-int/lit8 v16, v14, 0x1

    invoke-virtual {v1, v14}, Ljava/lang/String;->charAt(I)C

    move-result v14

    if-lt v14, v5, :cond_11

    and-int/lit16 v14, v14, 0x1fff

    shl-int/2addr v14, v15

    or-int/2addr v13, v14

    add-int/lit8 v15, v15, 0xd

    move/from16 v14, v16

    goto :goto_8

    :cond_11
    shl-int/2addr v14, v15

    or-int/2addr v13, v14

    move/from16 v14, v16

    :cond_12
    add-int/lit8 v15, v14, 0x1

    invoke-virtual {v1, v14}, Ljava/lang/String;->charAt(I)C

    move-result v14

    if-lt v14, v5, :cond_14

    and-int/lit16 v14, v14, 0x1fff

    const/16 v16, 0xd

    :goto_9
    add-int/lit8 v17, v15, 0x1

    invoke-virtual {v1, v15}, Ljava/lang/String;->charAt(I)C

    move-result v15

    if-lt v15, v5, :cond_13

    and-int/lit16 v15, v15, 0x1fff

    shl-int v15, v15, v16

    or-int/2addr v14, v15

    add-int/lit8 v16, v16, 0xd

    move/from16 v15, v17

    goto :goto_9

    :cond_13
    shl-int v15, v15, v16

    or-int/2addr v14, v15

    move/from16 v15, v17

    :cond_14
    add-int v16, v14, v12

    add-int v13, v16, v13

    add-int v16, v4, v4

    add-int v16, v16, v7

    new-array v7, v13, [I

    move v13, v9

    move/from16 v17, v14

    move/from16 v9, v16

    move-object/from16 v16, v7

    move v14, v10

    move v7, v4

    move v4, v15

    :goto_a
    sget-object v10, Lcom/google/android/gms/internal/play_billing/l3;->m:Lsun/misc/Unsafe;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/play_billing/s3;->e()[Ljava/lang/Object;

    move-result-object v15

    invoke-virtual {v0}, Lcom/google/android/gms/internal/play_billing/s3;->a()Lcom/google/android/gms/internal/play_billing/i3;

    move-result-object v18

    invoke-virtual/range {v18 .. v18}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    add-int v18, v17, v12

    add-int v12, v11, v11

    mul-int/lit8 v11, v11, 0x3

    new-array v11, v11, [I

    new-array v12, v12, [Ljava/lang/Object;

    move/from16 v21, v17

    move/from16 v22, v18

    const/16 v19, 0x0

    const/16 v20, 0x0

    :goto_b
    if-ge v4, v2, :cond_36

    add-int/lit8 v23, v4, 0x1

    invoke-virtual {v1, v4}, Ljava/lang/String;->charAt(I)C

    move-result v4

    if-lt v4, v5, :cond_16

    and-int/lit16 v4, v4, 0x1fff

    move/from16 v8, v23

    const/16 v23, 0xd

    :goto_c
    add-int/lit8 v24, v8, 0x1

    invoke-virtual {v1, v8}, Ljava/lang/String;->charAt(I)C

    move-result v8

    if-lt v8, v5, :cond_15

    and-int/lit16 v8, v8, 0x1fff

    shl-int v8, v8, v23

    or-int/2addr v4, v8

    add-int/lit8 v23, v23, 0xd

    move/from16 v8, v24

    goto :goto_c

    :cond_15
    shl-int v8, v8, v23

    or-int/2addr v4, v8

    move/from16 v8, v24

    goto :goto_d

    :cond_16
    move/from16 v8, v23

    :goto_d
    add-int/lit8 v23, v8, 0x1

    invoke-virtual {v1, v8}, Ljava/lang/String;->charAt(I)C

    move-result v8

    if-lt v8, v5, :cond_18

    and-int/lit16 v8, v8, 0x1fff

    move/from16 v6, v23

    const/16 v23, 0xd

    :goto_e
    add-int/lit8 v25, v6, 0x1

    invoke-virtual {v1, v6}, Ljava/lang/String;->charAt(I)C

    move-result v6

    if-lt v6, v5, :cond_17

    and-int/lit16 v6, v6, 0x1fff

    shl-int v6, v6, v23

    or-int/2addr v8, v6

    add-int/lit8 v23, v23, 0xd

    move/from16 v6, v25

    goto :goto_e

    :cond_17
    shl-int v6, v6, v23

    or-int/2addr v8, v6

    move/from16 v6, v25

    goto :goto_f

    :cond_18
    move/from16 v6, v23

    :goto_f
    and-int/lit16 v5, v8, 0x400

    if-eqz v5, :cond_19

    add-int/lit8 v5, v19, 0x1

    aput v20, v16, v19

    move/from16 v19, v5

    :cond_19
    and-int/lit16 v5, v8, 0xff

    move/from16 v25, v2

    and-int/lit16 v2, v8, 0x800

    move/from16 v26, v14

    const/16 v14, 0x33

    if-lt v5, v14, :cond_23

    add-int/lit8 v14, v6, 0x1

    invoke-virtual {v1, v6}, Ljava/lang/String;->charAt(I)C

    move-result v6

    move/from16 v27, v14

    const v14, 0xd800

    if-lt v6, v14, :cond_1b

    and-int/lit16 v6, v6, 0x1fff

    move/from16 v14, v27

    const/16 v27, 0xd

    :goto_10
    add-int/lit8 v31, v14, 0x1

    invoke-virtual {v1, v14}, Ljava/lang/String;->charAt(I)C

    move-result v14

    move/from16 v32, v13

    const v13, 0xd800

    if-lt v14, v13, :cond_1a

    and-int/lit16 v13, v14, 0x1fff

    shl-int v13, v13, v27

    or-int/2addr v6, v13

    add-int/lit8 v27, v27, 0xd

    move/from16 v14, v31

    move/from16 v13, v32

    goto :goto_10

    :cond_1a
    shl-int v13, v14, v27

    or-int/2addr v6, v13

    move/from16 v14, v31

    goto :goto_11

    :cond_1b
    move/from16 v32, v13

    move/from16 v14, v27

    :goto_11
    add-int/lit8 v13, v5, -0x33

    move/from16 v27, v14

    const/16 v14, 0x9

    if-eq v13, v14, :cond_1c

    const/16 v14, 0x11

    if-ne v13, v14, :cond_1d

    :cond_1c
    const/4 v14, 0x1

    goto :goto_14

    :cond_1d
    const/16 v14, 0xc

    if-ne v13, v14, :cond_20

    invoke-virtual {v0}, Lcom/google/android/gms/internal/play_billing/s3;->c()I

    move-result v13

    const/4 v14, 0x1

    if-eq v13, v14, :cond_1f

    if-eqz v2, :cond_1e

    goto :goto_12

    :cond_1e
    const/4 v2, 0x0

    goto :goto_15

    :cond_1f
    :goto_12
    add-int/lit8 v13, v9, 0x1

    div-int/lit8 v24, v20, 0x3

    add-int v24, v24, v24

    add-int/lit8 v24, v24, 0x1

    aget-object v9, v15, v9

    aput-object v9, v12, v24

    :goto_13
    move v9, v13

    goto :goto_15

    :goto_14
    add-int/lit8 v13, v9, 0x1

    div-int/lit8 v24, v20, 0x3

    add-int v24, v24, v24

    add-int/lit8 v28, v24, 0x1

    aget-object v9, v15, v9

    aput-object v9, v12, v28

    goto :goto_13

    :cond_20
    :goto_15
    add-int/2addr v6, v6

    aget-object v13, v15, v6

    instance-of v14, v13, Ljava/lang/reflect/Field;

    if-eqz v14, :cond_21

    check-cast v13, Ljava/lang/reflect/Field;

    goto :goto_16

    :cond_21
    check-cast v13, Ljava/lang/String;

    invoke-static {v3, v13}, Lcom/google/android/gms/internal/play_billing/l3;->O(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v13

    aput-object v13, v15, v6

    :goto_16
    invoke-virtual {v10, v13}, Lsun/misc/Unsafe;->objectFieldOffset(Ljava/lang/reflect/Field;)J

    move-result-wide v13

    long-to-int v13, v13

    add-int/lit8 v6, v6, 0x1

    aget-object v14, v15, v6

    move/from16 v28, v2

    instance-of v2, v14, Ljava/lang/reflect/Field;

    if-eqz v2, :cond_22

    check-cast v14, Ljava/lang/reflect/Field;

    :goto_17
    move v2, v13

    goto :goto_18

    :cond_22
    check-cast v14, Ljava/lang/String;

    invoke-static {v3, v14}, Lcom/google/android/gms/internal/play_billing/l3;->O(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v14

    aput-object v14, v15, v6

    goto :goto_17

    :goto_18
    invoke-virtual {v10, v14}, Lsun/misc/Unsafe;->objectFieldOffset(Ljava/lang/reflect/Field;)J

    move-result-wide v13

    long-to-int v6, v13

    move v13, v9

    move/from16 v29, v27

    move/from16 v27, v4

    move v9, v6

    const/4 v6, 0x0

    move-object v4, v1

    move/from16 v33, v28

    move-object/from16 v28, v0

    move v0, v2

    move/from16 v2, v33

    goto/16 :goto_24

    :cond_23
    move/from16 v32, v13

    add-int/lit8 v13, v9, 0x1

    aget-object v14, v15, v9

    check-cast v14, Ljava/lang/String;

    invoke-static {v3, v14}, Lcom/google/android/gms/internal/play_billing/l3;->O(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v14

    move/from16 v27, v4

    const/16 v4, 0x9

    if-eq v5, v4, :cond_24

    const/16 v4, 0x11

    if-ne v5, v4, :cond_25

    :cond_24
    move-object/from16 v28, v0

    const/4 v0, 0x1

    goto/16 :goto_1e

    :cond_25
    const/16 v4, 0x1b

    if-eq v5, v4, :cond_2d

    const/16 v4, 0x31

    if-ne v5, v4, :cond_26

    add-int/lit8 v9, v9, 0x2

    move-object/from16 v28, v0

    const/4 v0, 0x1

    goto/16 :goto_1d

    :cond_26
    const/16 v4, 0xc

    if-eq v5, v4, :cond_2a

    const/16 v4, 0x1e

    if-eq v5, v4, :cond_2a

    const/16 v4, 0x2c

    if-ne v5, v4, :cond_27

    goto :goto_1a

    :cond_27
    const/16 v4, 0x32

    if-ne v5, v4, :cond_29

    add-int/lit8 v4, v9, 0x2

    add-int/lit8 v28, v21, 0x1

    aput v20, v16, v21

    div-int/lit8 v21, v20, 0x3

    aget-object v13, v15, v13

    add-int v21, v21, v21

    aput-object v13, v12, v21

    if-eqz v2, :cond_28

    add-int/lit8 v21, v21, 0x1

    add-int/lit8 v13, v9, 0x3

    aget-object v4, v15, v4

    aput-object v4, v12, v21

    move-object v4, v1

    move/from16 v21, v28

    move-object/from16 v28, v0

    goto :goto_1f

    :cond_28
    move v13, v4

    move/from16 v21, v28

    const/4 v2, 0x0

    move-object/from16 v28, v0

    :goto_19
    move-object v4, v1

    goto :goto_1f

    :cond_29
    move-object/from16 v28, v0

    const/4 v0, 0x1

    goto :goto_19

    :cond_2a
    :goto_1a
    invoke-virtual {v0}, Lcom/google/android/gms/internal/play_billing/s3;->c()I

    move-result v4

    move-object/from16 v28, v0

    const/4 v0, 0x1

    if-eq v4, v0, :cond_2c

    if-eqz v2, :cond_2b

    goto :goto_1b

    :cond_2b
    move-object v4, v1

    const/4 v2, 0x0

    goto :goto_1f

    :cond_2c
    :goto_1b
    add-int/lit8 v9, v9, 0x2

    div-int/lit8 v4, v20, 0x3

    add-int/2addr v4, v4

    add-int/2addr v4, v0

    aget-object v13, v15, v13

    aput-object v13, v12, v4

    :goto_1c
    move-object v4, v1

    move v13, v9

    goto :goto_1f

    :cond_2d
    move-object/from16 v28, v0

    const/4 v0, 0x1

    add-int/lit8 v9, v9, 0x2

    :goto_1d
    div-int/lit8 v4, v20, 0x3

    add-int/2addr v4, v4

    add-int/2addr v4, v0

    aget-object v13, v15, v13

    aput-object v13, v12, v4

    goto :goto_1c

    :goto_1e
    div-int/lit8 v4, v20, 0x3

    add-int/2addr v4, v4

    add-int/2addr v4, v0

    invoke-virtual {v14}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    move-result-object v9

    aput-object v9, v12, v4

    goto :goto_19

    :goto_1f
    invoke-virtual {v10, v14}, Lsun/misc/Unsafe;->objectFieldOffset(Ljava/lang/reflect/Field;)J

    move-result-wide v0

    long-to-int v0, v0

    and-int/lit16 v1, v8, 0x1000

    const v9, 0xfffff

    if-eqz v1, :cond_31

    const/16 v1, 0x11

    if-gt v5, v1, :cond_31

    add-int/lit8 v1, v6, 0x1

    invoke-virtual {v4, v6}, Ljava/lang/String;->charAt(I)C

    move-result v6

    const v14, 0xd800

    if-lt v6, v14, :cond_2f

    and-int/lit16 v6, v6, 0x1fff

    const/16 v9, 0xd

    :goto_20
    add-int/lit8 v23, v1, 0x1

    invoke-virtual {v4, v1}, Ljava/lang/String;->charAt(I)C

    move-result v1

    if-lt v1, v14, :cond_2e

    and-int/lit16 v1, v1, 0x1fff

    shl-int/2addr v1, v9

    or-int/2addr v6, v1

    add-int/lit8 v9, v9, 0xd

    move/from16 v1, v23

    goto :goto_20

    :cond_2e
    shl-int/2addr v1, v9

    or-int/2addr v6, v1

    move/from16 v1, v23

    :cond_2f
    add-int v9, v7, v7

    div-int/lit8 v23, v6, 0x20

    add-int v9, v9, v23

    aget-object v14, v15, v9

    move/from16 v29, v1

    instance-of v1, v14, Ljava/lang/reflect/Field;

    if-eqz v1, :cond_30

    check-cast v14, Ljava/lang/reflect/Field;

    :goto_21
    move/from16 v30, v2

    goto :goto_22

    :cond_30
    check-cast v14, Ljava/lang/String;

    invoke-static {v3, v14}, Lcom/google/android/gms/internal/play_billing/l3;->O(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v14

    aput-object v14, v15, v9

    goto :goto_21

    :goto_22
    invoke-virtual {v10, v14}, Lsun/misc/Unsafe;->objectFieldOffset(Ljava/lang/reflect/Field;)J

    move-result-wide v1

    long-to-int v1, v1

    rem-int/lit8 v6, v6, 0x20

    move v9, v1

    goto :goto_23

    :cond_31
    move/from16 v30, v2

    move/from16 v29, v6

    const/4 v6, 0x0

    :goto_23
    const/16 v1, 0x12

    if-lt v5, v1, :cond_32

    const/16 v1, 0x31

    if-gt v5, v1, :cond_32

    add-int/lit8 v1, v22, 0x1

    aput v0, v16, v22

    move/from16 v22, v1

    :cond_32
    move/from16 v2, v30

    :goto_24
    add-int/lit8 v1, v20, 0x1

    aput v27, v11, v20

    add-int/lit8 v14, v20, 0x2

    move-object/from16 v27, v3

    and-int/lit16 v3, v8, 0x200

    if-eqz v3, :cond_33

    const/high16 v3, 0x20000000

    goto :goto_25

    :cond_33
    const/4 v3, 0x0

    :goto_25
    and-int/lit16 v8, v8, 0x100

    if-eqz v8, :cond_34

    const/high16 v8, 0x10000000

    goto :goto_26

    :cond_34
    const/4 v8, 0x0

    :goto_26
    if-eqz v2, :cond_35

    const/high16 v2, -0x80000000

    goto :goto_27

    :cond_35
    const/4 v2, 0x0

    :goto_27
    shl-int/lit8 v5, v5, 0x14

    or-int/2addr v3, v8

    or-int/2addr v2, v3

    or-int/2addr v2, v5

    or-int/2addr v0, v2

    aput v0, v11, v1

    add-int/lit8 v20, v20, 0x3

    shl-int/lit8 v0, v6, 0x14

    or-int/2addr v0, v9

    aput v0, v11, v14

    move-object v1, v4

    move v9, v13

    move/from16 v2, v25

    move/from16 v14, v26

    move-object/from16 v3, v27

    move-object/from16 v0, v28

    move/from16 v4, v29

    move/from16 v13, v32

    const v5, 0xd800

    goto/16 :goto_b

    :cond_36
    move-object/from16 v28, v0

    move/from16 v32, v13

    move/from16 v26, v14

    new-instance v0, Lcom/google/android/gms/internal/play_billing/l3;

    invoke-virtual/range {v28 .. v28}, Lcom/google/android/gms/internal/play_billing/s3;->a()Lcom/google/android/gms/internal/play_billing/i3;

    move-result-object v14

    const/4 v15, 0x0

    move-object v9, v0

    move-object v10, v11

    move-object v11, v12

    move/from16 v12, v32

    move/from16 v13, v26

    move-object/from16 v19, p2

    move-object/from16 v20, p3

    move-object/from16 v21, p4

    move-object/from16 v22, p5

    move-object/from16 v23, p6

    invoke-direct/range {v9 .. v23}, Lcom/google/android/gms/internal/play_billing/l3;-><init>([I[Ljava/lang/Object;IILcom/google/android/gms/internal/play_billing/i3;Z[IIILcom/google/android/gms/internal/play_billing/n3;Lcom/google/android/gms/internal/play_billing/V2;Lcom/google/android/gms/internal/play_billing/z3;Lcom/google/android/gms/internal/play_billing/B2;Lcom/google/android/gms/internal/play_billing/d3;)V

    return-object v0

    :cond_37
    invoke-static/range {p1 .. p1}, Landroidx/appcompat/app/D;->a(Ljava/lang/Object;)V

    const/4 v0, 0x0

    throw v0
.end method

.method private static B(Ljava/lang/Object;J)D
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/google/android/gms/internal/play_billing/G3;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Double;

    invoke-virtual {p0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide p0

    return-wide p0
.end method

.method private static C(Ljava/lang/Object;J)F
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/google/android/gms/internal/play_billing/G3;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Float;

    invoke-virtual {p0}, Ljava/lang/Float;->floatValue()F

    move-result p0

    return p0
.end method

.method private static D(Ljava/lang/Object;J)I
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/google/android/gms/internal/play_billing/G3;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Integer;

    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0

    return p0
.end method

.method private final E(I)I
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/play_billing/l3;->a:[I

    add-int/lit8 p1, p1, 0x2

    aget p1, v0, p1

    return p1
.end method

.method private final F(II)I
    .locals 5

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/play_billing/l3;->a:[I

    array-length v0, v0

    div-int/lit8 v0, v0, 0x3

    const/4 v1, -0x1

    add-int/2addr v0, v1

    :goto_0
    if-gt p2, v0, :cond_2

    add-int v2, v0, p2

    ushr-int/lit8 v2, v2, 0x1

    mul-int/lit8 v3, v2, 0x3

    iget-object v4, p0, Lcom/google/android/gms/internal/play_billing/l3;->a:[I

    aget v4, v4, v3

    if-ne p1, v4, :cond_0

    return v3

    :cond_0
    if-ge p1, v4, :cond_1

    add-int/lit8 v0, v2, -0x1

    goto :goto_0

    :cond_1
    add-int/lit8 p2, v2, 0x1

    goto :goto_0

    :cond_2
    return v1
.end method

.method private static G(I)I
    .locals 0

    ushr-int/lit8 p0, p0, 0x14

    and-int/lit16 p0, p0, 0xff

    return p0
.end method

.method private final H(I)I
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/play_billing/l3;->a:[I

    add-int/lit8 p1, p1, 0x1

    aget p1, v0, p1

    return p1
.end method

.method private static I(Ljava/lang/Object;J)J
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/google/android/gms/internal/play_billing/G3;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Long;

    invoke-virtual {p0}, Ljava/lang/Long;->longValue()J

    move-result-wide p0

    return-wide p0
.end method

.method private final J(I)Lcom/google/android/gms/internal/play_billing/N2;
    .locals 1

    div-int/lit8 p1, p1, 0x3

    add-int/2addr p1, p1

    iget-object v0, p0, Lcom/google/android/gms/internal/play_billing/l3;->b:[Ljava/lang/Object;

    add-int/lit8 p1, p1, 0x1

    aget-object p1, v0, p1

    check-cast p1, Lcom/google/android/gms/internal/play_billing/N2;

    return-object p1
.end method

.method private final K(I)Lcom/google/android/gms/internal/play_billing/t3;
    .locals 3

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/play_billing/l3;->b:[Ljava/lang/Object;

    div-int/lit8 p1, p1, 0x3

    add-int/2addr p1, p1

    aget-object v1, v0, p1

    check-cast v1, Lcom/google/android/gms/internal/play_billing/t3;

    if-eqz v1, :cond_0

    return-object v1

    :cond_0
    add-int/lit8 v1, p1, 0x1

    invoke-static {}, Lcom/google/android/gms/internal/play_billing/q3;->a()Lcom/google/android/gms/internal/play_billing/q3;

    move-result-object v2

    aget-object v0, v0, v1

    check-cast v0, Ljava/lang/Class;

    invoke-virtual {v2, v0}, Lcom/google/android/gms/internal/play_billing/q3;->b(Ljava/lang/Class;)Lcom/google/android/gms/internal/play_billing/t3;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/play_billing/l3;->b:[Ljava/lang/Object;

    aput-object v0, v1, p1

    return-object v0
.end method

.method private final L(I)Ljava/lang/Object;
    .locals 1

    div-int/lit8 p1, p1, 0x3

    iget-object v0, p0, Lcom/google/android/gms/internal/play_billing/l3;->b:[Ljava/lang/Object;

    add-int/2addr p1, p1

    aget-object p1, v0, p1

    return-object p1
.end method

.method private final M(Ljava/lang/Object;I)Ljava/lang/Object;
    .locals 3

    .prologue
    invoke-direct {p0, p2}, Lcom/google/android/gms/internal/play_billing/l3;->K(I)Lcom/google/android/gms/internal/play_billing/t3;

    move-result-object v0

    invoke-direct {p0, p2}, Lcom/google/android/gms/internal/play_billing/l3;->H(I)I

    move-result v1

    const v2, 0xfffff

    and-int/2addr v1, v2

    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/internal/play_billing/l3;->r(Ljava/lang/Object;I)Z

    move-result p2

    if-nez p2, :cond_0

    invoke-interface {v0}, Lcom/google/android/gms/internal/play_billing/t3;->d()Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_0
    int-to-long v1, v1

    sget-object p2, Lcom/google/android/gms/internal/play_billing/l3;->m:Lsun/misc/Unsafe;

    invoke-virtual {p2, p1, v1, v2}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lcom/google/android/gms/internal/play_billing/l3;->u(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_1

    return-object p1

    :cond_1
    invoke-interface {v0}, Lcom/google/android/gms/internal/play_billing/t3;->d()Ljava/lang/Object;

    move-result-object p2

    if-eqz p1, :cond_2

    invoke-interface {v0, p2, p1}, Lcom/google/android/gms/internal/play_billing/t3;->e(Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_2
    return-object p2
.end method

.method private final N(Ljava/lang/Object;II)Ljava/lang/Object;
    .locals 3

    .prologue
    invoke-direct {p0, p3}, Lcom/google/android/gms/internal/play_billing/l3;->K(I)Lcom/google/android/gms/internal/play_billing/t3;

    move-result-object v0

    invoke-direct {p0, p1, p2, p3}, Lcom/google/android/gms/internal/play_billing/l3;->v(Ljava/lang/Object;II)Z

    move-result p2

    if-nez p2, :cond_0

    invoke-interface {v0}, Lcom/google/android/gms/internal/play_billing/t3;->d()Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_0
    sget-object p2, Lcom/google/android/gms/internal/play_billing/l3;->m:Lsun/misc/Unsafe;

    invoke-direct {p0, p3}, Lcom/google/android/gms/internal/play_billing/l3;->H(I)I

    move-result p3

    const v1, 0xfffff

    and-int/2addr p3, v1

    int-to-long v1, p3

    invoke-virtual {p2, p1, v1, v2}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lcom/google/android/gms/internal/play_billing/l3;->u(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_1

    return-object p1

    :cond_1
    invoke-interface {v0}, Lcom/google/android/gms/internal/play_billing/t3;->d()Ljava/lang/Object;

    move-result-object p2

    if-eqz p1, :cond_2

    invoke-interface {v0, p2, p1}, Lcom/google/android/gms/internal/play_billing/t3;->e(Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_2
    return-object p2
.end method

.method private static O(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;
    .locals 5

    .prologue
    :try_start_0
    invoke-virtual {p0, p1}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/NoSuchFieldException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    invoke-virtual {p0}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    move-result-object v0

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, v0, v2

    invoke-virtual {v3}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    return-object v3

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p0

    invoke-static {v0}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Field "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " for "

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, " not found. Known fields are "

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method private static j(Ljava/lang/Object;)V
    .locals 2

    .prologue
    invoke-static {p0}, Lcom/google/android/gms/internal/play_billing/l3;->u(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    const-string v1, "Mutating immutable message: "

    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private final k(Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 5

    .prologue
    invoke-direct {p0, p2, p3}, Lcom/google/android/gms/internal/play_billing/l3;->r(Ljava/lang/Object;I)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-direct {p0, p3}, Lcom/google/android/gms/internal/play_billing/l3;->H(I)I

    move-result v0

    const v1, 0xfffff

    and-int/2addr v0, v1

    sget-object v1, Lcom/google/android/gms/internal/play_billing/l3;->m:Lsun/misc/Unsafe;

    int-to-long v2, v0

    invoke-virtual {v1, p2, v2, v3}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_4

    invoke-direct {p0, p3}, Lcom/google/android/gms/internal/play_billing/l3;->K(I)Lcom/google/android/gms/internal/play_billing/t3;

    move-result-object p2

    invoke-direct {p0, p1, p3}, Lcom/google/android/gms/internal/play_billing/l3;->r(Ljava/lang/Object;I)Z

    move-result v4

    if-nez v4, :cond_2

    invoke-static {v0}, Lcom/google/android/gms/internal/play_billing/l3;->u(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_1

    invoke-virtual {v1, p1, v2, v3, v0}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    goto :goto_0

    :cond_1
    invoke-interface {p2}, Lcom/google/android/gms/internal/play_billing/t3;->d()Ljava/lang/Object;

    move-result-object v4

    invoke-interface {p2, v4, v0}, Lcom/google/android/gms/internal/play_billing/t3;->e(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v1, p1, v2, v3, v4}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    :goto_0
    invoke-direct {p0, p1, p3}, Lcom/google/android/gms/internal/play_billing/l3;->m(Ljava/lang/Object;I)V

    return-void

    :cond_2
    invoke-virtual {v1, p1, v2, v3}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p3

    invoke-static {p3}, Lcom/google/android/gms/internal/play_billing/l3;->u(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_3

    invoke-interface {p2}, Lcom/google/android/gms/internal/play_billing/t3;->d()Ljava/lang/Object;

    move-result-object v4

    invoke-interface {p2, v4, p3}, Lcom/google/android/gms/internal/play_billing/t3;->e(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v1, p1, v2, v3, v4}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    move-object p3, v4

    :cond_3
    invoke-interface {p2, p3, v0}, Lcom/google/android/gms/internal/play_billing/t3;->e(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void

    :cond_4
    iget-object p1, p0, Lcom/google/android/gms/internal/play_billing/l3;->a:[I

    new-instance v0, Ljava/lang/IllegalStateException;

    aget p1, p1, p3

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Source subfield "

    invoke-virtual {p3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " is present but null: "

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private final l(Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 6

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/play_billing/l3;->a:[I

    aget v0, v0, p3

    invoke-direct {p0, p2, v0, p3}, Lcom/google/android/gms/internal/play_billing/l3;->v(Ljava/lang/Object;II)Z

    move-result v1

    if-nez v1, :cond_0

    return-void

    :cond_0
    invoke-direct {p0, p3}, Lcom/google/android/gms/internal/play_billing/l3;->H(I)I

    move-result v1

    const v2, 0xfffff

    and-int/2addr v1, v2

    sget-object v2, Lcom/google/android/gms/internal/play_billing/l3;->m:Lsun/misc/Unsafe;

    int-to-long v3, v1

    invoke-virtual {v2, p2, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_4

    invoke-direct {p0, p3}, Lcom/google/android/gms/internal/play_billing/l3;->K(I)Lcom/google/android/gms/internal/play_billing/t3;

    move-result-object p2

    invoke-direct {p0, p1, v0, p3}, Lcom/google/android/gms/internal/play_billing/l3;->v(Ljava/lang/Object;II)Z

    move-result v5

    if-nez v5, :cond_2

    invoke-static {v1}, Lcom/google/android/gms/internal/play_billing/l3;->u(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_1

    invoke-virtual {v2, p1, v3, v4, v1}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    goto :goto_0

    :cond_1
    invoke-interface {p2}, Lcom/google/android/gms/internal/play_billing/t3;->d()Ljava/lang/Object;

    move-result-object v5

    invoke-interface {p2, v5, v1}, Lcom/google/android/gms/internal/play_billing/t3;->e(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v2, p1, v3, v4, v5}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    :goto_0
    invoke-direct {p0, p1, v0, p3}, Lcom/google/android/gms/internal/play_billing/l3;->n(Ljava/lang/Object;II)V

    return-void

    :cond_2
    invoke-virtual {v2, p1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p3

    invoke-static {p3}, Lcom/google/android/gms/internal/play_billing/l3;->u(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    invoke-interface {p2}, Lcom/google/android/gms/internal/play_billing/t3;->d()Ljava/lang/Object;

    move-result-object v0

    invoke-interface {p2, v0, p3}, Lcom/google/android/gms/internal/play_billing/t3;->e(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v2, p1, v3, v4, v0}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    move-object p3, v0

    :cond_3
    invoke-interface {p2, p3, v1}, Lcom/google/android/gms/internal/play_billing/t3;->e(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void

    :cond_4
    iget-object p1, p0, Lcom/google/android/gms/internal/play_billing/l3;->a:[I

    new-instance v0, Ljava/lang/IllegalStateException;

    aget p1, p1, p3

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Source subfield "

    invoke-virtual {p3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " is present but null: "

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private final m(Ljava/lang/Object;I)V
    .locals 4

    .prologue
    invoke-direct {p0, p2}, Lcom/google/android/gms/internal/play_billing/l3;->E(I)I

    move-result p2

    const v0, 0xfffff

    and-int/2addr v0, p2

    int-to-long v0, v0

    const-wide/32 v2, 0xfffff

    cmp-long v2, v0, v2

    if-nez v2, :cond_0

    return-void

    :cond_0
    ushr-int/lit8 p2, p2, 0x14

    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/play_billing/G3;->h(Ljava/lang/Object;J)I

    move-result v2

    const/4 v3, 0x1

    shl-int p2, v3, p2

    or-int/2addr p2, v2

    invoke-static {p1, v0, v1, p2}, Lcom/google/android/gms/internal/play_billing/G3;->v(Ljava/lang/Object;JI)V

    return-void
.end method

.method private final n(Ljava/lang/Object;II)V
    .locals 2

    invoke-direct {p0, p3}, Lcom/google/android/gms/internal/play_billing/l3;->E(I)I

    move-result p3

    const v0, 0xfffff

    and-int/2addr p3, v0

    int-to-long v0, p3

    invoke-static {p1, v0, v1, p2}, Lcom/google/android/gms/internal/play_billing/G3;->v(Ljava/lang/Object;JI)V

    return-void
.end method

.method private final o(Ljava/lang/Object;ILjava/lang/Object;)V
    .locals 3

    sget-object v0, Lcom/google/android/gms/internal/play_billing/l3;->m:Lsun/misc/Unsafe;

    invoke-direct {p0, p2}, Lcom/google/android/gms/internal/play_billing/l3;->H(I)I

    move-result v1

    const v2, 0xfffff

    and-int/2addr v1, v2

    int-to-long v1, v1

    invoke-virtual {v0, p1, v1, v2, p3}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/internal/play_billing/l3;->m(Ljava/lang/Object;I)V

    return-void
.end method

.method private final p(Ljava/lang/Object;IILjava/lang/Object;)V
    .locals 3

    sget-object v0, Lcom/google/android/gms/internal/play_billing/l3;->m:Lsun/misc/Unsafe;

    invoke-direct {p0, p3}, Lcom/google/android/gms/internal/play_billing/l3;->H(I)I

    move-result v1

    const v2, 0xfffff

    and-int/2addr v1, v2

    int-to-long v1, v1

    invoke-virtual {v0, p1, v1, v2, p4}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    invoke-direct {p0, p1, p2, p3}, Lcom/google/android/gms/internal/play_billing/l3;->n(Ljava/lang/Object;II)V

    return-void
.end method

.method private final q(Ljava/lang/Object;Ljava/lang/Object;I)Z
    .locals 0

    .prologue
    invoke-direct {p0, p1, p3}, Lcom/google/android/gms/internal/play_billing/l3;->r(Ljava/lang/Object;I)Z

    move-result p1

    invoke-direct {p0, p2, p3}, Lcom/google/android/gms/internal/play_billing/l3;->r(Ljava/lang/Object;I)Z

    move-result p2

    if-ne p1, p2, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method private final r(Ljava/lang/Object;I)Z
    .locals 7

    .prologue
    invoke-direct {p0, p2}, Lcom/google/android/gms/internal/play_billing/l3;->E(I)I

    move-result v0

    const v1, 0xfffff

    and-int v2, v0, v1

    int-to-long v2, v2

    const-wide/32 v4, 0xfffff

    cmp-long v4, v2, v4

    const/4 v5, 0x0

    const/4 v6, 0x1

    if-nez v4, :cond_14

    invoke-direct {p0, p2}, Lcom/google/android/gms/internal/play_billing/l3;->H(I)I

    move-result p2

    and-int v0, p2, v1

    invoke-static {p2}, Lcom/google/android/gms/internal/play_billing/l3;->G(I)I

    move-result p2

    int-to-long v0, v0

    const-wide/16 v2, 0x0

    packed-switch p2, :pswitch_data_0

    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p1

    :pswitch_0
    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/play_billing/G3;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_0

    return v6

    :cond_0
    return v5

    :pswitch_1
    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/play_billing/G3;->i(Ljava/lang/Object;J)J

    move-result-wide p1

    cmp-long p1, p1, v2

    if-eqz p1, :cond_1

    return v6

    :cond_1
    return v5

    :pswitch_2
    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/play_billing/G3;->h(Ljava/lang/Object;J)I

    move-result p1

    if-eqz p1, :cond_2

    return v6

    :cond_2
    return v5

    :pswitch_3
    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/play_billing/G3;->i(Ljava/lang/Object;J)J

    move-result-wide p1

    cmp-long p1, p1, v2

    if-eqz p1, :cond_3

    return v6

    :cond_3
    return v5

    :pswitch_4
    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/play_billing/G3;->h(Ljava/lang/Object;J)I

    move-result p1

    if-eqz p1, :cond_4

    return v6

    :cond_4
    return v5

    :pswitch_5
    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/play_billing/G3;->h(Ljava/lang/Object;J)I

    move-result p1

    if-eqz p1, :cond_5

    return v6

    :cond_5
    return v5

    :pswitch_6
    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/play_billing/G3;->h(Ljava/lang/Object;J)I

    move-result p1

    if-eqz p1, :cond_6

    return v6

    :cond_6
    return v5

    :pswitch_7
    sget-object p2, Lcom/google/android/gms/internal/play_billing/o2;->D:Lcom/google/android/gms/internal/play_billing/o2;

    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/play_billing/G3;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p2, p1}, Lcom/google/android/gms/internal/play_billing/o2;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_7

    return v6

    :cond_7
    return v5

    :pswitch_8
    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/play_billing/G3;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_8

    return v6

    :cond_8
    return v5

    :pswitch_9
    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/play_billing/G3;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p1

    instance-of p2, p1, Ljava/lang/String;

    if-eqz p2, :cond_a

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_9

    return v6

    :cond_9
    return v5

    :cond_a
    instance-of p2, p1, Lcom/google/android/gms/internal/play_billing/o2;

    if-eqz p2, :cond_c

    sget-object p2, Lcom/google/android/gms/internal/play_billing/o2;->D:Lcom/google/android/gms/internal/play_billing/o2;

    invoke-virtual {p2, p1}, Lcom/google/android/gms/internal/play_billing/o2;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_b

    return v6

    :cond_b
    return v5

    :cond_c
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p1

    :pswitch_a
    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/play_billing/G3;->B(Ljava/lang/Object;J)Z

    move-result p1

    return p1

    :pswitch_b
    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/play_billing/G3;->h(Ljava/lang/Object;J)I

    move-result p1

    if-eqz p1, :cond_d

    return v6

    :cond_d
    return v5

    :pswitch_c
    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/play_billing/G3;->i(Ljava/lang/Object;J)J

    move-result-wide p1

    cmp-long p1, p1, v2

    if-eqz p1, :cond_e

    return v6

    :cond_e
    return v5

    :pswitch_d
    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/play_billing/G3;->h(Ljava/lang/Object;J)I

    move-result p1

    if-eqz p1, :cond_f

    return v6

    :cond_f
    return v5

    :pswitch_e
    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/play_billing/G3;->i(Ljava/lang/Object;J)J

    move-result-wide p1

    cmp-long p1, p1, v2

    if-eqz p1, :cond_10

    return v6

    :cond_10
    return v5

    :pswitch_f
    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/play_billing/G3;->i(Ljava/lang/Object;J)J

    move-result-wide p1

    cmp-long p1, p1, v2

    if-eqz p1, :cond_11

    return v6

    :cond_11
    return v5

    :pswitch_10
    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/play_billing/G3;->g(Ljava/lang/Object;J)F

    move-result p1

    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result p1

    if-eqz p1, :cond_12

    return v6

    :cond_12
    return v5

    :pswitch_11
    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/play_billing/G3;->f(Ljava/lang/Object;J)D

    move-result-wide p1

    invoke-static {p1, p2}, Ljava/lang/Double;->doubleToRawLongBits(D)J

    move-result-wide p1

    cmp-long p1, p1, v2

    if-eqz p1, :cond_13

    return v6

    :cond_13
    return v5

    :cond_14
    ushr-int/lit8 p2, v0, 0x14

    shl-int p2, v6, p2

    invoke-static {p1, v2, v3}, Lcom/google/android/gms/internal/play_billing/G3;->h(Ljava/lang/Object;J)I

    move-result p1

    and-int/2addr p1, p2

    if-eqz p1, :cond_15

    return v6

    :cond_15
    return v5

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private final s(Ljava/lang/Object;IIII)Z
    .locals 1

    .prologue
    const v0, 0xfffff

    if-ne p3, v0, :cond_0

    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/internal/play_billing/l3;->r(Ljava/lang/Object;I)Z

    move-result p1

    return p1

    :cond_0
    and-int p1, p4, p5

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method private static t(Ljava/lang/Object;ILcom/google/android/gms/internal/play_billing/t3;)Z
    .locals 2

    const v0, 0xfffff

    and-int/2addr p1, v0

    int-to-long v0, p1

    invoke-static {p0, v0, v1}, Lcom/google/android/gms/internal/play_billing/G3;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p0

    invoke-interface {p2, p0}, Lcom/google/android/gms/internal/play_billing/t3;->g(Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method private static u(Ljava/lang/Object;)Z
    .locals 1

    .prologue
    if-nez p0, :cond_0

    const/4 p0, 0x0

    return p0

    :cond_0
    instance-of v0, p0, Lcom/google/android/gms/internal/play_billing/L2;

    if-eqz v0, :cond_1

    check-cast p0, Lcom/google/android/gms/internal/play_billing/L2;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/play_billing/L2;->e()Z

    move-result p0

    return p0

    :cond_1
    const/4 p0, 0x1

    return p0
.end method

.method private final v(Ljava/lang/Object;II)Z
    .locals 2

    .prologue
    invoke-direct {p0, p3}, Lcom/google/android/gms/internal/play_billing/l3;->E(I)I

    move-result p3

    const v0, 0xfffff

    and-int/2addr p3, v0

    int-to-long v0, p3

    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/play_billing/G3;->h(Ljava/lang/Object;J)I

    move-result p1

    if-ne p1, p2, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method private static w(Ljava/lang/Object;J)Z
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/google/android/gms/internal/play_billing/G3;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    return p0
.end method

.method private static final x(ILjava/lang/Object;Lcom/google/android/gms/internal/play_billing/K3;)V
    .locals 1

    .prologue
    instance-of v0, p1, Ljava/lang/String;

    if-eqz v0, :cond_0

    check-cast p1, Ljava/lang/String;

    invoke-interface {p2, p0, p1}, Lcom/google/android/gms/internal/play_billing/K3;->j(ILjava/lang/String;)V

    return-void

    :cond_0
    check-cast p1, Lcom/google/android/gms/internal/play_billing/o2;

    invoke-interface {p2, p0, p1}, Lcom/google/android/gms/internal/play_billing/K3;->I(ILcom/google/android/gms/internal/play_billing/o2;)V

    return-void
.end method

.method static z(Ljava/lang/Object;)Lcom/google/android/gms/internal/play_billing/A3;
    .locals 2

    .prologue
    check-cast p0, Lcom/google/android/gms/internal/play_billing/L2;

    iget-object v0, p0, Lcom/google/android/gms/internal/play_billing/L2;->zzc:Lcom/google/android/gms/internal/play_billing/A3;

    invoke-static {}, Lcom/google/android/gms/internal/play_billing/A3;->c()Lcom/google/android/gms/internal/play_billing/A3;

    move-result-object v1

    if-ne v0, v1, :cond_0

    invoke-static {}, Lcom/google/android/gms/internal/play_billing/A3;->f()Lcom/google/android/gms/internal/play_billing/A3;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/play_billing/L2;->zzc:Lcom/google/android/gms/internal/play_billing/A3;

    :cond_0
    return-object v0
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)V
    .locals 7

    .prologue
    invoke-static {p1}, Lcom/google/android/gms/internal/play_billing/l3;->u(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto/16 :goto_3

    :cond_0
    instance-of v0, p1, Lcom/google/android/gms/internal/play_billing/L2;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    move-object v0, p1

    check-cast v0, Lcom/google/android/gms/internal/play_billing/L2;

    const v2, 0x7fffffff

    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/play_billing/L2;->y(I)V

    iput v1, v0, Lcom/google/android/gms/internal/play_billing/Z1;->zza:I

    invoke-virtual {v0}, Lcom/google/android/gms/internal/play_billing/L2;->w()V

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/play_billing/l3;->a:[I

    :goto_0
    array-length v2, v0

    if-ge v1, v2, :cond_5

    invoke-direct {p0, v1}, Lcom/google/android/gms/internal/play_billing/l3;->H(I)I

    move-result v2

    const v3, 0xfffff

    and-int/2addr v3, v2

    invoke-static {v2}, Lcom/google/android/gms/internal/play_billing/l3;->G(I)I

    move-result v2

    int-to-long v3, v3

    const/16 v5, 0x9

    if-eq v2, v5, :cond_3

    const/16 v5, 0x3c

    if-eq v2, v5, :cond_2

    const/16 v5, 0x44

    if-eq v2, v5, :cond_2

    packed-switch v2, :pswitch_data_0

    goto :goto_2

    :pswitch_0
    sget-object v2, Lcom/google/android/gms/internal/play_billing/l3;->m:Lsun/misc/Unsafe;

    invoke-virtual {v2, p1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    if-eqz v5, :cond_4

    move-object v6, v5

    check-cast v6, Lcom/google/android/gms/internal/play_billing/c3;

    invoke-virtual {v6}, Lcom/google/android/gms/internal/play_billing/c3;->c()V

    invoke-virtual {v2, p1, v3, v4, v5}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    goto :goto_2

    :pswitch_1
    invoke-static {p1, v3, v4}, Lcom/google/android/gms/internal/play_billing/G3;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/internal/play_billing/P2;

    invoke-interface {v2}, Lcom/google/android/gms/internal/play_billing/P2;->b()V

    goto :goto_2

    :cond_2
    iget-object v2, p0, Lcom/google/android/gms/internal/play_billing/l3;->a:[I

    aget v2, v2, v1

    invoke-direct {p0, p1, v2, v1}, Lcom/google/android/gms/internal/play_billing/l3;->v(Ljava/lang/Object;II)Z

    move-result v2

    if-eqz v2, :cond_4

    :goto_1
    invoke-direct {p0, v1}, Lcom/google/android/gms/internal/play_billing/l3;->K(I)Lcom/google/android/gms/internal/play_billing/t3;

    move-result-object v2

    sget-object v5, Lcom/google/android/gms/internal/play_billing/l3;->m:Lsun/misc/Unsafe;

    invoke-virtual {v5, p1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v2, v3}, Lcom/google/android/gms/internal/play_billing/t3;->a(Ljava/lang/Object;)V

    goto :goto_2

    :cond_3
    :pswitch_2
    invoke-direct {p0, p1, v1}, Lcom/google/android/gms/internal/play_billing/l3;->r(Ljava/lang/Object;I)Z

    move-result v2

    if-eqz v2, :cond_4

    goto :goto_1

    :cond_4
    :goto_2
    add-int/lit8 v1, v1, 0x3

    goto :goto_0

    :cond_5
    iget-object v0, p0, Lcom/google/android/gms/internal/play_billing/l3;->j:Lcom/google/android/gms/internal/play_billing/z3;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/play_billing/z3;->a(Ljava/lang/Object;)V

    iget-boolean v0, p0, Lcom/google/android/gms/internal/play_billing/l3;->f:Z

    if-eqz v0, :cond_6

    iget-object v0, p0, Lcom/google/android/gms/internal/play_billing/l3;->k:Lcom/google/android/gms/internal/play_billing/B2;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/play_billing/B2;->a(Ljava/lang/Object;)V

    :cond_6
    :goto_3
    return-void

    :pswitch_data_0
    .packed-switch 0x11
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final b(Ljava/lang/Object;)I
    .locals 20

    .prologue
    move-object/from16 v6, p0

    move-object/from16 v7, p1

    const/4 v8, 0x1

    sget-object v9, Lcom/google/android/gms/internal/play_billing/l3;->m:Lsun/misc/Unsafe;

    const v11, 0xfffff

    move v0, v11

    const/4 v1, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    :goto_0
    iget-object v2, v6, Lcom/google/android/gms/internal/play_billing/l3;->a:[I

    array-length v2, v2

    const/4 v3, 0x0

    if-ge v12, v2, :cond_1d

    invoke-direct {v6, v12}, Lcom/google/android/gms/internal/play_billing/l3;->H(I)I

    move-result v2

    invoke-static {v2}, Lcom/google/android/gms/internal/play_billing/l3;->G(I)I

    move-result v4

    iget-object v5, v6, Lcom/google/android/gms/internal/play_billing/l3;->a:[I

    add-int/lit8 v14, v12, 0x2

    aget v15, v5, v12

    aget v5, v5, v14

    and-int v14, v5, v11

    const/16 v10, 0x11

    if-gt v4, v10, :cond_2

    if-eq v14, v0, :cond_1

    if-ne v14, v11, :cond_0

    const/4 v1, 0x0

    goto :goto_1

    :cond_0
    int-to-long v0, v14

    invoke-virtual {v9, v7, v0, v1}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v0

    move v1, v0

    :goto_1
    move v0, v14

    :cond_1
    ushr-int/lit8 v5, v5, 0x14

    shl-int v5, v8, v5

    move v10, v0

    move v14, v1

    goto :goto_2

    :cond_2
    move v10, v0

    move v14, v1

    const/4 v5, 0x0

    :goto_2
    and-int v0, v2, v11

    sget-object v1, Lcom/google/android/gms/internal/play_billing/F2;->m0:Lcom/google/android/gms/internal/play_billing/F2;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/play_billing/F2;->a()I

    move-result v1

    if-lt v4, v1, :cond_3

    sget-object v1, Lcom/google/android/gms/internal/play_billing/F2;->z0:Lcom/google/android/gms/internal/play_billing/F2;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/play_billing/F2;->a()I

    :cond_3
    int-to-long v1, v0

    const/16 v17, 0x3f

    packed-switch v4, :pswitch_data_0

    :goto_3
    goto :goto_5

    :pswitch_0
    invoke-direct {v6, v7, v15, v12}, Lcom/google/android/gms/internal/play_billing/l3;->v(Ljava/lang/Object;II)Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-virtual {v9, v7, v1, v2}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/play_billing/i3;

    invoke-direct {v6, v12}, Lcom/google/android/gms/internal/play_billing/l3;->K(I)Lcom/google/android/gms/internal/play_billing/t3;

    move-result-object v1

    invoke-static {v15, v0, v1}, Lcom/google/android/gms/internal/play_billing/v2;->w(ILcom/google/android/gms/internal/play_billing/i3;Lcom/google/android/gms/internal/play_billing/t3;)I

    move-result v0

    :goto_4
    add-int/2addr v13, v0

    :cond_4
    :goto_5
    move/from16 v17, v12

    const/16 v16, 0x0

    goto/16 :goto_2c

    :pswitch_1
    invoke-direct {v6, v7, v15, v12}, Lcom/google/android/gms/internal/play_billing/l3;->v(Ljava/lang/Object;II)Z

    move-result v0

    if-eqz v0, :cond_4

    shl-int/lit8 v0, v15, 0x3

    invoke-static {v7, v1, v2}, Lcom/google/android/gms/internal/play_billing/l3;->I(Ljava/lang/Object;J)J

    move-result-wide v1

    add-long v3, v1, v1

    shr-long v1, v1, v17

    invoke-static {v0}, Lcom/google/android/gms/internal/play_billing/v2;->z(I)I

    move-result v0

    xor-long/2addr v1, v3

    :goto_6
    invoke-static {v1, v2}, Lcom/google/android/gms/internal/play_billing/v2;->a(J)I

    move-result v1

    :goto_7
    add-int/2addr v0, v1

    goto :goto_4

    :pswitch_2
    invoke-direct {v6, v7, v15, v12}, Lcom/google/android/gms/internal/play_billing/l3;->v(Ljava/lang/Object;II)Z

    move-result v0

    if-eqz v0, :cond_4

    shl-int/lit8 v0, v15, 0x3

    invoke-static {v7, v1, v2}, Lcom/google/android/gms/internal/play_billing/l3;->D(Ljava/lang/Object;J)I

    move-result v1

    add-int v2, v1, v1

    shr-int/lit8 v1, v1, 0x1f

    invoke-static {v0}, Lcom/google/android/gms/internal/play_billing/v2;->z(I)I

    move-result v0

    xor-int/2addr v1, v2

    :goto_8
    invoke-static {v1}, Lcom/google/android/gms/internal/play_billing/v2;->z(I)I

    move-result v1

    goto :goto_7

    :pswitch_3
    invoke-direct {v6, v7, v15, v12}, Lcom/google/android/gms/internal/play_billing/l3;->v(Ljava/lang/Object;II)Z

    move-result v0

    if-eqz v0, :cond_4

    :goto_9
    shl-int/lit8 v0, v15, 0x3

    invoke-static {v0}, Lcom/google/android/gms/internal/play_billing/v2;->z(I)I

    move-result v0

    add-int/lit8 v0, v0, 0x8

    goto :goto_4

    :pswitch_4
    invoke-direct {v6, v7, v15, v12}, Lcom/google/android/gms/internal/play_billing/l3;->v(Ljava/lang/Object;II)Z

    move-result v0

    if-eqz v0, :cond_4

    :goto_a
    shl-int/lit8 v0, v15, 0x3

    invoke-static {v0}, Lcom/google/android/gms/internal/play_billing/v2;->z(I)I

    move-result v0

    add-int/lit8 v0, v0, 0x4

    goto :goto_4

    :pswitch_5
    invoke-direct {v6, v7, v15, v12}, Lcom/google/android/gms/internal/play_billing/l3;->v(Ljava/lang/Object;II)Z

    move-result v0

    if-eqz v0, :cond_4

    :goto_b
    shl-int/lit8 v0, v15, 0x3

    invoke-static {v7, v1, v2}, Lcom/google/android/gms/internal/play_billing/l3;->D(Ljava/lang/Object;J)I

    move-result v1

    int-to-long v1, v1

    :goto_c
    invoke-static {v0}, Lcom/google/android/gms/internal/play_billing/v2;->z(I)I

    move-result v0

    goto :goto_6

    :pswitch_6
    invoke-direct {v6, v7, v15, v12}, Lcom/google/android/gms/internal/play_billing/l3;->v(Ljava/lang/Object;II)Z

    move-result v0

    if-eqz v0, :cond_4

    shl-int/lit8 v0, v15, 0x3

    invoke-static {v7, v1, v2}, Lcom/google/android/gms/internal/play_billing/l3;->D(Ljava/lang/Object;J)I

    move-result v1

    invoke-static {v0}, Lcom/google/android/gms/internal/play_billing/v2;->z(I)I

    move-result v0

    goto :goto_8

    :pswitch_7
    invoke-direct {v6, v7, v15, v12}, Lcom/google/android/gms/internal/play_billing/l3;->v(Ljava/lang/Object;II)Z

    move-result v0

    if-eqz v0, :cond_4

    shl-int/lit8 v0, v15, 0x3

    invoke-virtual {v9, v7, v1, v2}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v1

    :goto_d
    check-cast v1, Lcom/google/android/gms/internal/play_billing/o2;

    invoke-static {v0}, Lcom/google/android/gms/internal/play_billing/v2;->z(I)I

    move-result v0

    invoke-virtual {v1}, Lcom/google/android/gms/internal/play_billing/o2;->f()I

    move-result v1

    invoke-static {v1}, Lcom/google/android/gms/internal/play_billing/v2;->z(I)I

    move-result v2

    add-int/2addr v2, v1

    add-int/2addr v0, v2

    goto/16 :goto_4

    :pswitch_8
    invoke-direct {v6, v7, v15, v12}, Lcom/google/android/gms/internal/play_billing/l3;->v(Ljava/lang/Object;II)Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-virtual {v9, v7, v1, v2}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v0

    invoke-direct {v6, v12}, Lcom/google/android/gms/internal/play_billing/l3;->K(I)Lcom/google/android/gms/internal/play_billing/t3;

    move-result-object v1

    invoke-static {v15, v0, v1}, Lcom/google/android/gms/internal/play_billing/v3;->m(ILjava/lang/Object;Lcom/google/android/gms/internal/play_billing/t3;)I

    move-result v0

    goto/16 :goto_4

    :pswitch_9
    invoke-direct {v6, v7, v15, v12}, Lcom/google/android/gms/internal/play_billing/l3;->v(Ljava/lang/Object;II)Z

    move-result v0

    if-eqz v0, :cond_4

    shl-int/lit8 v0, v15, 0x3

    invoke-virtual {v9, v7, v1, v2}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v1

    instance-of v2, v1, Lcom/google/android/gms/internal/play_billing/o2;

    if-eqz v2, :cond_5

    goto :goto_d

    :cond_5
    check-cast v1, Ljava/lang/String;

    invoke-static {v0}, Lcom/google/android/gms/internal/play_billing/v2;->z(I)I

    move-result v0

    invoke-static {v1}, Lcom/google/android/gms/internal/play_billing/v2;->y(Ljava/lang/String;)I

    move-result v1

    goto/16 :goto_7

    :pswitch_a
    invoke-direct {v6, v7, v15, v12}, Lcom/google/android/gms/internal/play_billing/l3;->v(Ljava/lang/Object;II)Z

    move-result v0

    if-eqz v0, :cond_4

    shl-int/lit8 v0, v15, 0x3

    invoke-static {v0}, Lcom/google/android/gms/internal/play_billing/v2;->z(I)I

    move-result v0

    add-int/2addr v0, v8

    goto/16 :goto_4

    :pswitch_b
    invoke-direct {v6, v7, v15, v12}, Lcom/google/android/gms/internal/play_billing/l3;->v(Ljava/lang/Object;II)Z

    move-result v0

    if-eqz v0, :cond_4

    goto/16 :goto_a

    :pswitch_c
    invoke-direct {v6, v7, v15, v12}, Lcom/google/android/gms/internal/play_billing/l3;->v(Ljava/lang/Object;II)Z

    move-result v0

    if-eqz v0, :cond_4

    goto/16 :goto_9

    :pswitch_d
    invoke-direct {v6, v7, v15, v12}, Lcom/google/android/gms/internal/play_billing/l3;->v(Ljava/lang/Object;II)Z

    move-result v0

    if-eqz v0, :cond_4

    goto/16 :goto_b

    :pswitch_e
    invoke-direct {v6, v7, v15, v12}, Lcom/google/android/gms/internal/play_billing/l3;->v(Ljava/lang/Object;II)Z

    move-result v0

    if-eqz v0, :cond_4

    :goto_e
    shl-int/lit8 v0, v15, 0x3

    invoke-static {v7, v1, v2}, Lcom/google/android/gms/internal/play_billing/l3;->I(Ljava/lang/Object;J)J

    move-result-wide v1

    goto/16 :goto_c

    :pswitch_f
    invoke-direct {v6, v7, v15, v12}, Lcom/google/android/gms/internal/play_billing/l3;->v(Ljava/lang/Object;II)Z

    move-result v0

    if-eqz v0, :cond_4

    goto :goto_e

    :pswitch_10
    invoke-direct {v6, v7, v15, v12}, Lcom/google/android/gms/internal/play_billing/l3;->v(Ljava/lang/Object;II)Z

    move-result v0

    if-eqz v0, :cond_4

    goto/16 :goto_a

    :pswitch_11
    invoke-direct {v6, v7, v15, v12}, Lcom/google/android/gms/internal/play_billing/l3;->v(Ljava/lang/Object;II)Z

    move-result v0

    if-eqz v0, :cond_4

    goto/16 :goto_9

    :pswitch_12
    invoke-virtual {v9, v7, v1, v2}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v0

    invoke-direct {v6, v12}, Lcom/google/android/gms/internal/play_billing/l3;->L(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v0, Lcom/google/android/gms/internal/play_billing/c3;

    invoke-static {v1}, Landroidx/appcompat/app/D;->a(Ljava/lang/Object;)V

    invoke-virtual {v0}, Ljava/util/AbstractMap;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_4

    invoke-virtual {v0}, Lcom/google/android/gms/internal/play_billing/c3;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-nez v1, :cond_6

    goto/16 :goto_3

    :cond_6
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    throw v3

    :pswitch_13
    invoke-virtual {v9, v7, v1, v2}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-direct {v6, v12}, Lcom/google/android/gms/internal/play_billing/l3;->K(I)Lcom/google/android/gms/internal/play_billing/t3;

    move-result-object v1

    sget v2, Lcom/google/android/gms/internal/play_billing/v3;->b:I

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    if-nez v2, :cond_7

    :goto_f
    const/4 v4, 0x0

    goto :goto_11

    :cond_7
    const/4 v3, 0x0

    const/4 v4, 0x0

    :goto_10
    if-ge v3, v2, :cond_8

    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/google/android/gms/internal/play_billing/i3;

    invoke-static {v15, v5, v1}, Lcom/google/android/gms/internal/play_billing/v2;->w(ILcom/google/android/gms/internal/play_billing/i3;Lcom/google/android/gms/internal/play_billing/t3;)I

    move-result v5

    add-int/2addr v4, v5

    add-int/2addr v3, v8

    goto :goto_10

    :cond_8
    :goto_11
    add-int/2addr v13, v4

    goto/16 :goto_5

    :pswitch_14
    invoke-virtual {v9, v7, v1, v2}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-static {v0}, Lcom/google/android/gms/internal/play_billing/v3;->o(Ljava/util/List;)I

    move-result v0

    if-lez v0, :cond_4

    :goto_12
    shl-int/lit8 v1, v15, 0x3

    invoke-static {v1}, Lcom/google/android/gms/internal/play_billing/v2;->z(I)I

    move-result v1

    invoke-static {v0}, Lcom/google/android/gms/internal/play_billing/v2;->z(I)I

    move-result v2

    add-int/2addr v1, v2

    add-int/2addr v1, v0

    add-int/2addr v13, v1

    goto/16 :goto_5

    :pswitch_15
    invoke-virtual {v9, v7, v1, v2}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-static {v0}, Lcom/google/android/gms/internal/play_billing/v3;->n(Ljava/util/List;)I

    move-result v0

    if-lez v0, :cond_4

    goto :goto_12

    :pswitch_16
    invoke-virtual {v9, v7, v1, v2}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-static {v0}, Lcom/google/android/gms/internal/play_billing/v3;->j(Ljava/util/List;)I

    move-result v0

    if-lez v0, :cond_4

    goto :goto_12

    :pswitch_17
    invoke-virtual {v9, v7, v1, v2}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-static {v0}, Lcom/google/android/gms/internal/play_billing/v3;->h(Ljava/util/List;)I

    move-result v0

    if-lez v0, :cond_4

    goto :goto_12

    :pswitch_18
    invoke-virtual {v9, v7, v1, v2}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-static {v0}, Lcom/google/android/gms/internal/play_billing/v3;->f(Ljava/util/List;)I

    move-result v0

    if-lez v0, :cond_4

    goto :goto_12

    :pswitch_19
    invoke-virtual {v9, v7, v1, v2}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-static {v0}, Lcom/google/android/gms/internal/play_billing/v3;->p(Ljava/util/List;)I

    move-result v0

    if-lez v0, :cond_4

    goto :goto_12

    :pswitch_1a
    invoke-virtual {v9, v7, v1, v2}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    sget v1, Lcom/google/android/gms/internal/play_billing/v3;->b:I

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_4

    goto :goto_12

    :pswitch_1b
    invoke-virtual {v9, v7, v1, v2}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-static {v0}, Lcom/google/android/gms/internal/play_billing/v3;->h(Ljava/util/List;)I

    move-result v0

    if-lez v0, :cond_4

    goto :goto_12

    :pswitch_1c
    invoke-virtual {v9, v7, v1, v2}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-static {v0}, Lcom/google/android/gms/internal/play_billing/v3;->j(Ljava/util/List;)I

    move-result v0

    if-lez v0, :cond_4

    goto :goto_12

    :pswitch_1d
    invoke-virtual {v9, v7, v1, v2}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-static {v0}, Lcom/google/android/gms/internal/play_billing/v3;->k(Ljava/util/List;)I

    move-result v0

    if-lez v0, :cond_4

    goto/16 :goto_12

    :pswitch_1e
    invoke-virtual {v9, v7, v1, v2}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-static {v0}, Lcom/google/android/gms/internal/play_billing/v3;->q(Ljava/util/List;)I

    move-result v0

    if-lez v0, :cond_4

    goto/16 :goto_12

    :pswitch_1f
    invoke-virtual {v9, v7, v1, v2}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-static {v0}, Lcom/google/android/gms/internal/play_billing/v3;->l(Ljava/util/List;)I

    move-result v0

    if-lez v0, :cond_4

    goto/16 :goto_12

    :pswitch_20
    invoke-virtual {v9, v7, v1, v2}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-static {v0}, Lcom/google/android/gms/internal/play_billing/v3;->h(Ljava/util/List;)I

    move-result v0

    if-lez v0, :cond_4

    goto/16 :goto_12

    :pswitch_21
    invoke-virtual {v9, v7, v1, v2}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-static {v0}, Lcom/google/android/gms/internal/play_billing/v3;->j(Ljava/util/List;)I

    move-result v0

    if-lez v0, :cond_4

    goto/16 :goto_12

    :pswitch_22
    invoke-virtual {v9, v7, v1, v2}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    sget v1, Lcom/google/android/gms/internal/play_billing/v3;->b:I

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    if-nez v1, :cond_9

    :goto_13
    const/4 v0, 0x0

    goto/16 :goto_4

    :cond_9
    shl-int/lit8 v2, v15, 0x3

    invoke-static {v0}, Lcom/google/android/gms/internal/play_billing/v3;->o(Ljava/util/List;)I

    move-result v0

    :goto_14
    invoke-static {v2}, Lcom/google/android/gms/internal/play_billing/v2;->z(I)I

    move-result v2

    mul-int/2addr v1, v2

    goto/16 :goto_7

    :pswitch_23
    invoke-virtual {v9, v7, v1, v2}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    sget v1, Lcom/google/android/gms/internal/play_billing/v3;->b:I

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    if-nez v1, :cond_a

    goto :goto_13

    :cond_a
    shl-int/lit8 v2, v15, 0x3

    invoke-static {v0}, Lcom/google/android/gms/internal/play_billing/v3;->n(Ljava/util/List;)I

    move-result v0

    goto :goto_14

    :pswitch_24
    invoke-virtual {v9, v7, v1, v2}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    const/4 v3, 0x0

    invoke-static {v15, v0, v3}, Lcom/google/android/gms/internal/play_billing/v3;->i(ILjava/util/List;Z)I

    move-result v0

    :goto_15
    add-int/2addr v13, v0

    move/from16 v16, v3

    :cond_b
    :goto_16
    move/from16 v17, v12

    goto/16 :goto_2c

    :pswitch_25
    const/4 v3, 0x0

    invoke-virtual {v9, v7, v1, v2}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-static {v15, v0, v3}, Lcom/google/android/gms/internal/play_billing/v3;->g(ILjava/util/List;Z)I

    move-result v0

    goto/16 :goto_4

    :pswitch_26
    invoke-virtual {v9, v7, v1, v2}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    sget v1, Lcom/google/android/gms/internal/play_billing/v3;->b:I

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    if-nez v1, :cond_c

    goto :goto_13

    :cond_c
    shl-int/lit8 v2, v15, 0x3

    invoke-static {v0}, Lcom/google/android/gms/internal/play_billing/v3;->f(Ljava/util/List;)I

    move-result v0

    goto :goto_14

    :pswitch_27
    invoke-virtual {v9, v7, v1, v2}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    sget v1, Lcom/google/android/gms/internal/play_billing/v3;->b:I

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    if-nez v1, :cond_d

    goto :goto_13

    :cond_d
    shl-int/lit8 v2, v15, 0x3

    invoke-static {v0}, Lcom/google/android/gms/internal/play_billing/v3;->p(Ljava/util/List;)I

    move-result v0

    goto :goto_14

    :pswitch_28
    invoke-virtual {v9, v7, v1, v2}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    sget v1, Lcom/google/android/gms/internal/play_billing/v3;->b:I

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    if-nez v1, :cond_e

    const/4 v2, 0x0

    goto :goto_18

    :cond_e
    shl-int/lit8 v2, v15, 0x3

    invoke-static {v2}, Lcom/google/android/gms/internal/play_billing/v2;->z(I)I

    move-result v2

    mul-int/2addr v1, v2

    move v2, v1

    const/4 v1, 0x0

    :goto_17
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v3

    if-ge v1, v3, :cond_f

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/google/android/gms/internal/play_billing/o2;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/play_billing/o2;->f()I

    move-result v3

    invoke-static {v3}, Lcom/google/android/gms/internal/play_billing/v2;->z(I)I

    move-result v4

    add-int/2addr v4, v3

    add-int/2addr v2, v4

    add-int/2addr v1, v8

    goto :goto_17

    :cond_f
    :goto_18
    add-int/2addr v13, v2

    goto/16 :goto_5

    :pswitch_29
    invoke-virtual {v9, v7, v1, v2}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-direct {v6, v12}, Lcom/google/android/gms/internal/play_billing/l3;->K(I)Lcom/google/android/gms/internal/play_billing/t3;

    move-result-object v1

    sget v2, Lcom/google/android/gms/internal/play_billing/v3;->b:I

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    if-nez v2, :cond_10

    goto/16 :goto_f

    :cond_10
    shl-int/lit8 v3, v15, 0x3

    invoke-static {v3}, Lcom/google/android/gms/internal/play_billing/v2;->z(I)I

    move-result v3

    mul-int/2addr v3, v2

    move v4, v3

    const/4 v3, 0x0

    :goto_19
    if-ge v3, v2, :cond_8

    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/google/android/gms/internal/play_billing/i3;

    invoke-static {v5, v1}, Lcom/google/android/gms/internal/play_billing/v2;->x(Lcom/google/android/gms/internal/play_billing/i3;Lcom/google/android/gms/internal/play_billing/t3;)I

    move-result v5

    add-int/2addr v4, v5

    add-int/2addr v3, v8

    goto :goto_19

    :pswitch_2a
    invoke-virtual {v9, v7, v1, v2}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    sget v1, Lcom/google/android/gms/internal/play_billing/v3;->b:I

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    if-nez v1, :cond_11

    :goto_1a
    const/4 v3, 0x0

    goto :goto_1f

    :cond_11
    shl-int/lit8 v2, v15, 0x3

    invoke-static {v2}, Lcom/google/android/gms/internal/play_billing/v2;->z(I)I

    move-result v2

    mul-int/2addr v2, v1

    instance-of v3, v0, Lcom/google/android/gms/internal/play_billing/U2;

    if-eqz v3, :cond_13

    check-cast v0, Lcom/google/android/gms/internal/play_billing/U2;

    move v3, v2

    const/4 v2, 0x0

    :goto_1b
    if-ge v2, v1, :cond_15

    invoke-interface {v0}, Lcom/google/android/gms/internal/play_billing/U2;->c()Ljava/lang/Object;

    move-result-object v4

    instance-of v5, v4, Lcom/google/android/gms/internal/play_billing/o2;

    if-eqz v5, :cond_12

    check-cast v4, Lcom/google/android/gms/internal/play_billing/o2;

    invoke-virtual {v4}, Lcom/google/android/gms/internal/play_billing/o2;->f()I

    move-result v4

    invoke-static {v4}, Lcom/google/android/gms/internal/play_billing/v2;->z(I)I

    move-result v5

    add-int/2addr v5, v4

    add-int/2addr v3, v5

    goto :goto_1c

    :cond_12
    check-cast v4, Ljava/lang/String;

    invoke-static {v4}, Lcom/google/android/gms/internal/play_billing/v2;->y(Ljava/lang/String;)I

    move-result v4

    add-int/2addr v3, v4

    :goto_1c
    add-int/2addr v2, v8

    goto :goto_1b

    :cond_13
    move v3, v2

    const/4 v2, 0x0

    :goto_1d
    if-ge v2, v1, :cond_15

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    instance-of v5, v4, Lcom/google/android/gms/internal/play_billing/o2;

    if-eqz v5, :cond_14

    check-cast v4, Lcom/google/android/gms/internal/play_billing/o2;

    invoke-virtual {v4}, Lcom/google/android/gms/internal/play_billing/o2;->f()I

    move-result v4

    invoke-static {v4}, Lcom/google/android/gms/internal/play_billing/v2;->z(I)I

    move-result v5

    add-int/2addr v5, v4

    add-int/2addr v3, v5

    goto :goto_1e

    :cond_14
    check-cast v4, Ljava/lang/String;

    invoke-static {v4}, Lcom/google/android/gms/internal/play_billing/v2;->y(Ljava/lang/String;)I

    move-result v4

    add-int/2addr v3, v4

    :goto_1e
    add-int/2addr v2, v8

    goto :goto_1d

    :cond_15
    :goto_1f
    add-int/2addr v13, v3

    goto/16 :goto_5

    :pswitch_2b
    invoke-virtual {v9, v7, v1, v2}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    sget v1, Lcom/google/android/gms/internal/play_billing/v3;->b:I

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_16

    goto/16 :goto_13

    :cond_16
    shl-int/lit8 v1, v15, 0x3

    invoke-static {v1}, Lcom/google/android/gms/internal/play_billing/v2;->z(I)I

    move-result v1

    add-int/2addr v1, v8

    mul-int/2addr v0, v1

    goto/16 :goto_4

    :pswitch_2c
    invoke-virtual {v9, v7, v1, v2}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    const/4 v3, 0x0

    invoke-static {v15, v0, v3}, Lcom/google/android/gms/internal/play_billing/v3;->g(ILjava/util/List;Z)I

    move-result v0

    goto/16 :goto_15

    :pswitch_2d
    const/4 v3, 0x0

    invoke-virtual {v9, v7, v1, v2}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-static {v15, v0, v3}, Lcom/google/android/gms/internal/play_billing/v3;->i(ILjava/util/List;Z)I

    move-result v0

    goto/16 :goto_4

    :pswitch_2e
    invoke-virtual {v9, v7, v1, v2}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    sget v1, Lcom/google/android/gms/internal/play_billing/v3;->b:I

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    if-nez v1, :cond_17

    goto/16 :goto_1a

    :cond_17
    shl-int/lit8 v2, v15, 0x3

    invoke-static {v0}, Lcom/google/android/gms/internal/play_billing/v3;->k(Ljava/util/List;)I

    move-result v0

    :goto_20
    invoke-static {v2}, Lcom/google/android/gms/internal/play_billing/v2;->z(I)I

    move-result v2

    mul-int/2addr v1, v2

    add-int v3, v0, v1

    goto :goto_1f

    :pswitch_2f
    invoke-virtual {v9, v7, v1, v2}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    sget v1, Lcom/google/android/gms/internal/play_billing/v3;->b:I

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    if-nez v1, :cond_18

    goto/16 :goto_1a

    :cond_18
    shl-int/lit8 v2, v15, 0x3

    invoke-static {v0}, Lcom/google/android/gms/internal/play_billing/v3;->q(Ljava/util/List;)I

    move-result v0

    goto :goto_20

    :pswitch_30
    invoke-virtual {v9, v7, v1, v2}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    sget v1, Lcom/google/android/gms/internal/play_billing/v3;->b:I

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    if-nez v1, :cond_19

    goto/16 :goto_1a

    :cond_19
    shl-int/lit8 v1, v15, 0x3

    invoke-static {v0}, Lcom/google/android/gms/internal/play_billing/v3;->l(Ljava/util/List;)I

    move-result v2

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    invoke-static {v1}, Lcom/google/android/gms/internal/play_billing/v2;->z(I)I

    move-result v1

    mul-int/2addr v0, v1

    add-int v3, v2, v0

    goto/16 :goto_1f

    :pswitch_31
    invoke-virtual {v9, v7, v1, v2}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    const/4 v4, 0x0

    invoke-static {v15, v0, v4}, Lcom/google/android/gms/internal/play_billing/v3;->g(ILjava/util/List;Z)I

    move-result v0

    :goto_21
    add-int/2addr v13, v0

    move/from16 v16, v4

    goto/16 :goto_16

    :pswitch_32
    const/4 v4, 0x0

    invoke-virtual {v9, v7, v1, v2}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-static {v15, v0, v4}, Lcom/google/android/gms/internal/play_billing/v3;->i(ILjava/util/List;Z)I

    move-result v0

    goto :goto_21

    :pswitch_33
    const/4 v4, 0x0

    move-object/from16 v0, p0

    move-wide v2, v1

    move-object/from16 v1, p1

    move-wide/from16 v18, v2

    move v2, v12

    move v3, v10

    move/from16 v16, v4

    move v4, v14

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/play_billing/l3;->s(Ljava/lang/Object;IIII)Z

    move-result v0

    if-eqz v0, :cond_b

    move-wide/from16 v3, v18

    invoke-virtual {v9, v7, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/play_billing/i3;

    invoke-direct {v6, v12}, Lcom/google/android/gms/internal/play_billing/l3;->K(I)Lcom/google/android/gms/internal/play_billing/t3;

    move-result-object v1

    invoke-static {v15, v0, v1}, Lcom/google/android/gms/internal/play_billing/v2;->w(ILcom/google/android/gms/internal/play_billing/i3;Lcom/google/android/gms/internal/play_billing/t3;)I

    move-result v0

    add-int/2addr v13, v0

    goto/16 :goto_16

    :pswitch_34
    move-wide v3, v1

    const/16 v16, 0x0

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move v2, v12

    move/from16 v19, v12

    move-wide v11, v3

    move v3, v10

    move v4, v14

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/play_billing/l3;->s(Ljava/lang/Object;IIII)Z

    move-result v0

    if-eqz v0, :cond_1a

    shl-int/lit8 v0, v15, 0x3

    invoke-virtual {v9, v7, v11, v12}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    move-result-wide v1

    add-long v3, v1, v1

    shr-long v1, v1, v17

    invoke-static {v0}, Lcom/google/android/gms/internal/play_billing/v2;->z(I)I

    move-result v0

    xor-long/2addr v1, v3

    :goto_22
    invoke-static {v1, v2}, Lcom/google/android/gms/internal/play_billing/v2;->a(J)I

    move-result v1

    :goto_23
    add-int/2addr v0, v1

    :goto_24
    add-int/2addr v13, v0

    :cond_1a
    move/from16 v17, v19

    goto/16 :goto_2c

    :pswitch_35
    move/from16 v19, v12

    const/16 v16, 0x0

    move-wide v11, v1

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, v19

    move v3, v10

    move v4, v14

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/play_billing/l3;->s(Ljava/lang/Object;IIII)Z

    move-result v0

    if-eqz v0, :cond_1a

    shl-int/lit8 v0, v15, 0x3

    invoke-virtual {v9, v7, v11, v12}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v1

    add-int v2, v1, v1

    shr-int/lit8 v1, v1, 0x1f

    invoke-static {v0}, Lcom/google/android/gms/internal/play_billing/v2;->z(I)I

    move-result v0

    xor-int/2addr v1, v2

    :goto_25
    invoke-static {v1}, Lcom/google/android/gms/internal/play_billing/v2;->z(I)I

    move-result v1

    goto :goto_23

    :pswitch_36
    move/from16 v19, v12

    const/16 v16, 0x0

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, v19

    move v3, v10

    move v4, v14

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/play_billing/l3;->s(Ljava/lang/Object;IIII)Z

    move-result v0

    if-eqz v0, :cond_1a

    shl-int/lit8 v0, v15, 0x3

    invoke-static {v0}, Lcom/google/android/gms/internal/play_billing/v2;->z(I)I

    move-result v0

    add-int/lit8 v0, v0, 0x8

    goto :goto_24

    :pswitch_37
    move/from16 v19, v12

    const/16 v16, 0x0

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, v19

    move v3, v10

    move v4, v14

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/play_billing/l3;->s(Ljava/lang/Object;IIII)Z

    move-result v0

    if-eqz v0, :cond_1a

    shl-int/lit8 v0, v15, 0x3

    invoke-static {v0}, Lcom/google/android/gms/internal/play_billing/v2;->z(I)I

    move-result v0

    add-int/lit8 v0, v0, 0x4

    goto :goto_24

    :pswitch_38
    move/from16 v19, v12

    const/16 v16, 0x0

    move-wide v11, v1

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, v19

    move v3, v10

    move v4, v14

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/play_billing/l3;->s(Ljava/lang/Object;IIII)Z

    move-result v0

    if-eqz v0, :cond_1a

    shl-int/lit8 v0, v15, 0x3

    invoke-virtual {v9, v7, v11, v12}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v1

    int-to-long v1, v1

    invoke-static {v0}, Lcom/google/android/gms/internal/play_billing/v2;->z(I)I

    move-result v0

    goto/16 :goto_22

    :pswitch_39
    move/from16 v19, v12

    const/16 v16, 0x0

    move-wide v11, v1

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, v19

    move v3, v10

    move v4, v14

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/play_billing/l3;->s(Ljava/lang/Object;IIII)Z

    move-result v0

    if-eqz v0, :cond_1a

    shl-int/lit8 v0, v15, 0x3

    invoke-virtual {v9, v7, v11, v12}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v1

    invoke-static {v0}, Lcom/google/android/gms/internal/play_billing/v2;->z(I)I

    move-result v0

    goto :goto_25

    :pswitch_3a
    move/from16 v19, v12

    const/16 v16, 0x0

    move-wide v11, v1

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, v19

    move v3, v10

    move v4, v14

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/play_billing/l3;->s(Ljava/lang/Object;IIII)Z

    move-result v0

    if-eqz v0, :cond_1a

    shl-int/lit8 v0, v15, 0x3

    invoke-virtual {v9, v7, v11, v12}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/play_billing/o2;

    invoke-static {v0}, Lcom/google/android/gms/internal/play_billing/v2;->z(I)I

    move-result v0

    invoke-virtual {v1}, Lcom/google/android/gms/internal/play_billing/o2;->f()I

    move-result v1

    invoke-static {v1}, Lcom/google/android/gms/internal/play_billing/v2;->z(I)I

    move-result v2

    add-int/2addr v2, v1

    add-int/2addr v0, v2

    goto/16 :goto_24

    :pswitch_3b
    move/from16 v19, v12

    const/16 v16, 0x0

    move-wide v11, v1

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, v19

    move v3, v10

    move v4, v14

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/play_billing/l3;->s(Ljava/lang/Object;IIII)Z

    move-result v0

    if-eqz v0, :cond_1a

    invoke-virtual {v9, v7, v11, v12}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v0

    move/from16 v4, v19

    invoke-direct {v6, v4}, Lcom/google/android/gms/internal/play_billing/l3;->K(I)Lcom/google/android/gms/internal/play_billing/t3;

    move-result-object v1

    invoke-static {v15, v0, v1}, Lcom/google/android/gms/internal/play_billing/v3;->m(ILjava/lang/Object;Lcom/google/android/gms/internal/play_billing/t3;)I

    move-result v0

    add-int/2addr v13, v0

    move/from16 v17, v4

    goto/16 :goto_2c

    :pswitch_3c
    move v4, v12

    const/16 v16, 0x0

    move-wide v11, v1

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move v2, v4

    move v3, v10

    move/from16 v17, v4

    move v4, v14

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/play_billing/l3;->s(Ljava/lang/Object;IIII)Z

    move-result v0

    if-eqz v0, :cond_1c

    shl-int/lit8 v0, v15, 0x3

    invoke-virtual {v9, v7, v11, v12}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v1

    instance-of v2, v1, Lcom/google/android/gms/internal/play_billing/o2;

    if-eqz v2, :cond_1b

    check-cast v1, Lcom/google/android/gms/internal/play_billing/o2;

    invoke-static {v0}, Lcom/google/android/gms/internal/play_billing/v2;->z(I)I

    move-result v0

    invoke-virtual {v1}, Lcom/google/android/gms/internal/play_billing/o2;->f()I

    move-result v1

    invoke-static {v1}, Lcom/google/android/gms/internal/play_billing/v2;->z(I)I

    move-result v2

    add-int/2addr v2, v1

    add-int/2addr v0, v2

    :goto_26
    add-int/2addr v13, v0

    goto/16 :goto_2c

    :cond_1b
    check-cast v1, Ljava/lang/String;

    invoke-static {v0}, Lcom/google/android/gms/internal/play_billing/v2;->z(I)I

    move-result v0

    invoke-static {v1}, Lcom/google/android/gms/internal/play_billing/v2;->y(Ljava/lang/String;)I

    move-result v1

    :goto_27
    add-int/2addr v0, v1

    goto :goto_26

    :pswitch_3d
    move/from16 v17, v12

    const/16 v16, 0x0

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, v17

    move v3, v10

    move v4, v14

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/play_billing/l3;->s(Ljava/lang/Object;IIII)Z

    move-result v0

    if-eqz v0, :cond_1c

    shl-int/lit8 v0, v15, 0x3

    invoke-static {v0}, Lcom/google/android/gms/internal/play_billing/v2;->z(I)I

    move-result v0

    add-int/2addr v0, v8

    goto :goto_26

    :pswitch_3e
    move/from16 v17, v12

    const/16 v16, 0x0

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, v17

    move v3, v10

    move v4, v14

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/play_billing/l3;->s(Ljava/lang/Object;IIII)Z

    move-result v0

    if-eqz v0, :cond_1c

    :goto_28
    shl-int/lit8 v0, v15, 0x3

    invoke-static {v0}, Lcom/google/android/gms/internal/play_billing/v2;->z(I)I

    move-result v0

    add-int/lit8 v0, v0, 0x4

    goto :goto_26

    :pswitch_3f
    move/from16 v17, v12

    const/16 v16, 0x0

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, v17

    move v3, v10

    move v4, v14

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/play_billing/l3;->s(Ljava/lang/Object;IIII)Z

    move-result v0

    if-eqz v0, :cond_1c

    :goto_29
    shl-int/lit8 v0, v15, 0x3

    invoke-static {v0}, Lcom/google/android/gms/internal/play_billing/v2;->z(I)I

    move-result v0

    add-int/lit8 v0, v0, 0x8

    goto :goto_26

    :pswitch_40
    move/from16 v17, v12

    const/16 v16, 0x0

    move-wide v11, v1

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, v17

    move v3, v10

    move v4, v14

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/play_billing/l3;->s(Ljava/lang/Object;IIII)Z

    move-result v0

    if-eqz v0, :cond_1c

    shl-int/lit8 v0, v15, 0x3

    invoke-virtual {v9, v7, v11, v12}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v1

    int-to-long v1, v1

    :goto_2a
    invoke-static {v0}, Lcom/google/android/gms/internal/play_billing/v2;->z(I)I

    move-result v0

    invoke-static {v1, v2}, Lcom/google/android/gms/internal/play_billing/v2;->a(J)I

    move-result v1

    goto :goto_27

    :pswitch_41
    move/from16 v17, v12

    const/16 v16, 0x0

    move-wide v11, v1

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, v17

    move v3, v10

    move v4, v14

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/play_billing/l3;->s(Ljava/lang/Object;IIII)Z

    move-result v0

    if-eqz v0, :cond_1c

    :goto_2b
    shl-int/lit8 v0, v15, 0x3

    invoke-virtual {v9, v7, v11, v12}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    move-result-wide v1

    goto :goto_2a

    :pswitch_42
    move/from16 v17, v12

    const/16 v16, 0x0

    move-wide v11, v1

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, v17

    move v3, v10

    move v4, v14

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/play_billing/l3;->s(Ljava/lang/Object;IIII)Z

    move-result v0

    if-eqz v0, :cond_1c

    goto :goto_2b

    :pswitch_43
    move/from16 v17, v12

    const/16 v16, 0x0

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, v17

    move v3, v10

    move v4, v14

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/play_billing/l3;->s(Ljava/lang/Object;IIII)Z

    move-result v0

    if-eqz v0, :cond_1c

    goto/16 :goto_28

    :pswitch_44
    move/from16 v17, v12

    const/16 v16, 0x0

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, v17

    move v3, v10

    move v4, v14

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/play_billing/l3;->s(Ljava/lang/Object;IIII)Z

    move-result v0

    if-eqz v0, :cond_1c

    goto/16 :goto_29

    :cond_1c
    :goto_2c
    add-int/lit8 v12, v17, 0x3

    move v0, v10

    move v1, v14

    const v11, 0xfffff

    goto/16 :goto_0

    :cond_1d
    move-object v0, v7

    check-cast v0, Lcom/google/android/gms/internal/play_billing/L2;

    iget-object v0, v0, Lcom/google/android/gms/internal/play_billing/L2;->zzc:Lcom/google/android/gms/internal/play_billing/A3;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/play_billing/A3;->a()I

    move-result v0

    add-int/2addr v13, v0

    iget-boolean v0, v6, Lcom/google/android/gms/internal/play_billing/l3;->f:Z

    if-nez v0, :cond_1e

    return v13

    :cond_1e
    invoke-static/range {p1 .. p1}, Landroidx/appcompat/app/D;->a(Ljava/lang/Object;)V

    throw v3

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_44
        :pswitch_43
        :pswitch_42
        :pswitch_41
        :pswitch_40
        :pswitch_3f
        :pswitch_3e
        :pswitch_3d
        :pswitch_3c
        :pswitch_3b
        :pswitch_3a
        :pswitch_39
        :pswitch_38
        :pswitch_37
        :pswitch_36
        :pswitch_35
        :pswitch_34
        :pswitch_33
        :pswitch_32
        :pswitch_31
        :pswitch_30
        :pswitch_2f
        :pswitch_2e
        :pswitch_2d
        :pswitch_2c
        :pswitch_2b
        :pswitch_2a
        :pswitch_29
        :pswitch_28
        :pswitch_27
        :pswitch_26
        :pswitch_25
        :pswitch_24
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final c(Ljava/lang/Object;)I
    .locals 8

    .prologue
    const/4 v0, 0x0

    move v1, v0

    :goto_0
    iget-object v2, p0, Lcom/google/android/gms/internal/play_billing/l3;->a:[I

    array-length v2, v2

    if-ge v0, v2, :cond_2

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/play_billing/l3;->H(I)I

    move-result v2

    iget-object v3, p0, Lcom/google/android/gms/internal/play_billing/l3;->a:[I

    const v4, 0xfffff

    and-int/2addr v4, v2

    invoke-static {v2}, Lcom/google/android/gms/internal/play_billing/l3;->G(I)I

    move-result v2

    aget v3, v3, v0

    int-to-long v4, v4

    const/16 v6, 0x25

    const/16 v7, 0x20

    packed-switch v2, :pswitch_data_0

    goto/16 :goto_a

    :pswitch_0
    invoke-direct {p0, p1, v3, v0}, Lcom/google/android/gms/internal/play_billing/l3;->v(Ljava/lang/Object;II)Z

    move-result v2

    if-eqz v2, :cond_1

    :goto_1
    :pswitch_1
    mul-int/lit8 v1, v1, 0x35

    invoke-static {p1, v4, v5}, Lcom/google/android/gms/internal/play_billing/G3;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v1, v2

    goto/16 :goto_a

    :pswitch_2
    invoke-direct {p0, p1, v3, v0}, Lcom/google/android/gms/internal/play_billing/l3;->v(Ljava/lang/Object;II)Z

    move-result v2

    if-eqz v2, :cond_1

    :goto_3
    mul-int/lit8 v1, v1, 0x35

    invoke-static {p1, v4, v5}, Lcom/google/android/gms/internal/play_billing/l3;->I(Ljava/lang/Object;J)J

    move-result-wide v2

    :goto_4
    sget-object v4, Lcom/google/android/gms/internal/play_billing/Q2;->b:[B

    ushr-long v4, v2, v7

    xor-long/2addr v2, v4

    long-to-int v2, v2

    goto :goto_2

    :pswitch_3
    invoke-direct {p0, p1, v3, v0}, Lcom/google/android/gms/internal/play_billing/l3;->v(Ljava/lang/Object;II)Z

    move-result v2

    if-eqz v2, :cond_1

    :goto_5
    mul-int/lit8 v1, v1, 0x35

    invoke-static {p1, v4, v5}, Lcom/google/android/gms/internal/play_billing/l3;->D(Ljava/lang/Object;J)I

    move-result v2

    goto :goto_2

    :pswitch_4
    invoke-direct {p0, p1, v3, v0}, Lcom/google/android/gms/internal/play_billing/l3;->v(Ljava/lang/Object;II)Z

    move-result v2

    if-eqz v2, :cond_1

    goto :goto_3

    :pswitch_5
    invoke-direct {p0, p1, v3, v0}, Lcom/google/android/gms/internal/play_billing/l3;->v(Ljava/lang/Object;II)Z

    move-result v2

    if-eqz v2, :cond_1

    goto :goto_5

    :pswitch_6
    invoke-direct {p0, p1, v3, v0}, Lcom/google/android/gms/internal/play_billing/l3;->v(Ljava/lang/Object;II)Z

    move-result v2

    if-eqz v2, :cond_1

    goto :goto_5

    :pswitch_7
    invoke-direct {p0, p1, v3, v0}, Lcom/google/android/gms/internal/play_billing/l3;->v(Ljava/lang/Object;II)Z

    move-result v2

    if-eqz v2, :cond_1

    goto :goto_5

    :pswitch_8
    invoke-direct {p0, p1, v3, v0}, Lcom/google/android/gms/internal/play_billing/l3;->v(Ljava/lang/Object;II)Z

    move-result v2

    if-eqz v2, :cond_1

    goto :goto_1

    :pswitch_9
    invoke-direct {p0, p1, v3, v0}, Lcom/google/android/gms/internal/play_billing/l3;->v(Ljava/lang/Object;II)Z

    move-result v2

    if-eqz v2, :cond_1

    goto :goto_1

    :pswitch_a
    invoke-direct {p0, p1, v3, v0}, Lcom/google/android/gms/internal/play_billing/l3;->v(Ljava/lang/Object;II)Z

    move-result v2

    if-eqz v2, :cond_1

    :pswitch_b
    mul-int/lit8 v1, v1, 0x35

    invoke-static {p1, v4, v5}, Lcom/google/android/gms/internal/play_billing/G3;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    goto :goto_2

    :pswitch_c
    invoke-direct {p0, p1, v3, v0}, Lcom/google/android/gms/internal/play_billing/l3;->v(Ljava/lang/Object;II)Z

    move-result v2

    if-eqz v2, :cond_1

    mul-int/lit8 v1, v1, 0x35

    invoke-static {p1, v4, v5}, Lcom/google/android/gms/internal/play_billing/l3;->w(Ljava/lang/Object;J)Z

    move-result v2

    :goto_6
    invoke-static {v2}, Lcom/google/android/gms/internal/play_billing/Q2;->a(Z)I

    move-result v2

    goto :goto_2

    :pswitch_d
    invoke-direct {p0, p1, v3, v0}, Lcom/google/android/gms/internal/play_billing/l3;->v(Ljava/lang/Object;II)Z

    move-result v2

    if-eqz v2, :cond_1

    goto :goto_5

    :pswitch_e
    invoke-direct {p0, p1, v3, v0}, Lcom/google/android/gms/internal/play_billing/l3;->v(Ljava/lang/Object;II)Z

    move-result v2

    if-eqz v2, :cond_1

    goto :goto_3

    :pswitch_f
    invoke-direct {p0, p1, v3, v0}, Lcom/google/android/gms/internal/play_billing/l3;->v(Ljava/lang/Object;II)Z

    move-result v2

    if-eqz v2, :cond_1

    goto :goto_5

    :pswitch_10
    invoke-direct {p0, p1, v3, v0}, Lcom/google/android/gms/internal/play_billing/l3;->v(Ljava/lang/Object;II)Z

    move-result v2

    if-eqz v2, :cond_1

    goto/16 :goto_3

    :pswitch_11
    invoke-direct {p0, p1, v3, v0}, Lcom/google/android/gms/internal/play_billing/l3;->v(Ljava/lang/Object;II)Z

    move-result v2

    if-eqz v2, :cond_1

    goto/16 :goto_3

    :pswitch_12
    invoke-direct {p0, p1, v3, v0}, Lcom/google/android/gms/internal/play_billing/l3;->v(Ljava/lang/Object;II)Z

    move-result v2

    if-eqz v2, :cond_1

    mul-int/lit8 v1, v1, 0x35

    invoke-static {p1, v4, v5}, Lcom/google/android/gms/internal/play_billing/l3;->C(Ljava/lang/Object;J)F

    move-result v2

    :goto_7
    invoke-static {v2}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v2

    goto/16 :goto_2

    :pswitch_13
    invoke-direct {p0, p1, v3, v0}, Lcom/google/android/gms/internal/play_billing/l3;->v(Ljava/lang/Object;II)Z

    move-result v2

    if-eqz v2, :cond_1

    mul-int/lit8 v1, v1, 0x35

    invoke-static {p1, v4, v5}, Lcom/google/android/gms/internal/play_billing/l3;->B(Ljava/lang/Object;J)D

    move-result-wide v2

    :goto_8
    invoke-static {v2, v3}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide v2

    goto/16 :goto_4

    :pswitch_14
    mul-int/lit8 v1, v1, 0x35

    invoke-static {p1, v4, v5}, Lcom/google/android/gms/internal/play_billing/G3;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_0

    :goto_9
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v6

    :cond_0
    add-int/2addr v1, v6

    goto :goto_a

    :pswitch_15
    mul-int/lit8 v1, v1, 0x35

    invoke-static {p1, v4, v5}, Lcom/google/android/gms/internal/play_billing/G3;->i(Ljava/lang/Object;J)J

    move-result-wide v2

    goto/16 :goto_4

    :pswitch_16
    mul-int/lit8 v1, v1, 0x35

    invoke-static {p1, v4, v5}, Lcom/google/android/gms/internal/play_billing/G3;->h(Ljava/lang/Object;J)I

    move-result v2

    goto/16 :goto_2

    :pswitch_17
    mul-int/lit8 v1, v1, 0x35

    invoke-static {p1, v4, v5}, Lcom/google/android/gms/internal/play_billing/G3;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_0

    goto :goto_9

    :pswitch_18
    mul-int/lit8 v1, v1, 0x35

    invoke-static {p1, v4, v5}, Lcom/google/android/gms/internal/play_billing/G3;->B(Ljava/lang/Object;J)Z

    move-result v2

    goto :goto_6

    :pswitch_19
    mul-int/lit8 v1, v1, 0x35

    invoke-static {p1, v4, v5}, Lcom/google/android/gms/internal/play_billing/G3;->g(Ljava/lang/Object;J)F

    move-result v2

    goto :goto_7

    :pswitch_1a
    mul-int/lit8 v1, v1, 0x35

    invoke-static {p1, v4, v5}, Lcom/google/android/gms/internal/play_billing/G3;->f(Ljava/lang/Object;J)D

    move-result-wide v2

    goto :goto_8

    :cond_1
    :goto_a
    add-int/lit8 v0, v0, 0x3

    goto/16 :goto_0

    :cond_2
    mul-int/lit8 v1, v1, 0x35

    move-object v0, p1

    check-cast v0, Lcom/google/android/gms/internal/play_billing/L2;

    iget-object v0, v0, Lcom/google/android/gms/internal/play_billing/L2;->zzc:Lcom/google/android/gms/internal/play_billing/A3;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    add-int/2addr v1, v0

    iget-boolean v0, p0, Lcom/google/android/gms/internal/play_billing/l3;->f:Z

    if-nez v0, :cond_3

    return v1

    :cond_3
    invoke-static {p1}, Landroidx/appcompat/app/D;->a(Ljava/lang/Object;)V

    const/4 p1, 0x0

    throw p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1a
        :pswitch_19
        :pswitch_15
        :pswitch_15
        :pswitch_16
        :pswitch_15
        :pswitch_16
        :pswitch_18
        :pswitch_b
        :pswitch_17
        :pswitch_1
        :pswitch_16
        :pswitch_16
        :pswitch_16
        :pswitch_15
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_0
    .end packed-switch
.end method

.method public final d()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/play_billing/l3;->e:Lcom/google/android/gms/internal/play_billing/i3;

    check-cast v0, Lcom/google/android/gms/internal/play_billing/L2;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/play_billing/L2;->p()Lcom/google/android/gms/internal/play_billing/L2;

    move-result-object v0

    return-object v0
.end method

.method public final e(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 8

    .prologue
    invoke-static {p1}, Lcom/google/android/gms/internal/play_billing/l3;->j(Ljava/lang/Object;)V

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lcom/google/android/gms/internal/play_billing/l3;->a:[I

    array-length v1, v1

    if-ge v0, v1, :cond_4

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/play_billing/l3;->H(I)I

    move-result v1

    const v2, 0xfffff

    and-int/2addr v2, v1

    iget-object v3, p0, Lcom/google/android/gms/internal/play_billing/l3;->a:[I

    invoke-static {v1}, Lcom/google/android/gms/internal/play_billing/l3;->G(I)I

    move-result v1

    aget v3, v3, v0

    int-to-long v4, v2

    packed-switch v1, :pswitch_data_0

    goto/16 :goto_7

    :pswitch_0
    invoke-direct {p0, p1, p2, v0}, Lcom/google/android/gms/internal/play_billing/l3;->l(Ljava/lang/Object;Ljava/lang/Object;I)V

    goto/16 :goto_7

    :pswitch_1
    invoke-direct {p0, p2, v3, v0}, Lcom/google/android/gms/internal/play_billing/l3;->v(Ljava/lang/Object;II)Z

    move-result v1

    if-eqz v1, :cond_3

    :goto_1
    invoke-static {p2, v4, v5}, Lcom/google/android/gms/internal/play_billing/G3;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v1

    invoke-static {p1, v4, v5, v1}, Lcom/google/android/gms/internal/play_billing/G3;->x(Ljava/lang/Object;JLjava/lang/Object;)V

    invoke-direct {p0, p1, v3, v0}, Lcom/google/android/gms/internal/play_billing/l3;->n(Ljava/lang/Object;II)V

    goto/16 :goto_7

    :pswitch_2
    invoke-direct {p0, p2, v3, v0}, Lcom/google/android/gms/internal/play_billing/l3;->v(Ljava/lang/Object;II)Z

    move-result v1

    if-eqz v1, :cond_3

    goto :goto_1

    :pswitch_3
    sget v1, Lcom/google/android/gms/internal/play_billing/v3;->b:I

    invoke-static {p1, v4, v5}, Lcom/google/android/gms/internal/play_billing/G3;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v1

    invoke-static {p2, v4, v5}, Lcom/google/android/gms/internal/play_billing/G3;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/google/android/gms/internal/play_billing/d3;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {p1, v4, v5, v1}, Lcom/google/android/gms/internal/play_billing/G3;->x(Ljava/lang/Object;JLjava/lang/Object;)V

    goto/16 :goto_7

    :pswitch_4
    invoke-static {p1, v4, v5}, Lcom/google/android/gms/internal/play_billing/G3;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/play_billing/P2;

    invoke-static {p2, v4, v5}, Lcom/google/android/gms/internal/play_billing/G3;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/internal/play_billing/P2;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v3

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v6

    if-lez v3, :cond_1

    if-lez v6, :cond_1

    invoke-interface {v1}, Lcom/google/android/gms/internal/play_billing/P2;->c()Z

    move-result v7

    if-nez v7, :cond_0

    add-int/2addr v6, v3

    invoke-interface {v1, v6}, Lcom/google/android/gms/internal/play_billing/P2;->m(I)Lcom/google/android/gms/internal/play_billing/P2;

    move-result-object v1

    :cond_0
    invoke-interface {v1, v2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_1
    if-gtz v3, :cond_2

    goto :goto_2

    :cond_2
    move-object v2, v1

    :goto_2
    invoke-static {p1, v4, v5, v2}, Lcom/google/android/gms/internal/play_billing/G3;->x(Ljava/lang/Object;JLjava/lang/Object;)V

    goto/16 :goto_7

    :pswitch_5
    invoke-direct {p0, p1, p2, v0}, Lcom/google/android/gms/internal/play_billing/l3;->k(Ljava/lang/Object;Ljava/lang/Object;I)V

    goto/16 :goto_7

    :pswitch_6
    invoke-direct {p0, p2, v0}, Lcom/google/android/gms/internal/play_billing/l3;->r(Ljava/lang/Object;I)Z

    move-result v1

    if-eqz v1, :cond_3

    :goto_3
    invoke-static {p2, v4, v5}, Lcom/google/android/gms/internal/play_billing/G3;->i(Ljava/lang/Object;J)J

    move-result-wide v1

    invoke-static {p1, v4, v5, v1, v2}, Lcom/google/android/gms/internal/play_billing/G3;->w(Ljava/lang/Object;JJ)V

    :goto_4
    invoke-direct {p0, p1, v0}, Lcom/google/android/gms/internal/play_billing/l3;->m(Ljava/lang/Object;I)V

    goto/16 :goto_7

    :pswitch_7
    invoke-direct {p0, p2, v0}, Lcom/google/android/gms/internal/play_billing/l3;->r(Ljava/lang/Object;I)Z

    move-result v1

    if-eqz v1, :cond_3

    :goto_5
    invoke-static {p2, v4, v5}, Lcom/google/android/gms/internal/play_billing/G3;->h(Ljava/lang/Object;J)I

    move-result v1

    invoke-static {p1, v4, v5, v1}, Lcom/google/android/gms/internal/play_billing/G3;->v(Ljava/lang/Object;JI)V

    goto :goto_4

    :pswitch_8
    invoke-direct {p0, p2, v0}, Lcom/google/android/gms/internal/play_billing/l3;->r(Ljava/lang/Object;I)Z

    move-result v1

    if-eqz v1, :cond_3

    goto :goto_3

    :pswitch_9
    invoke-direct {p0, p2, v0}, Lcom/google/android/gms/internal/play_billing/l3;->r(Ljava/lang/Object;I)Z

    move-result v1

    if-eqz v1, :cond_3

    goto :goto_5

    :pswitch_a
    invoke-direct {p0, p2, v0}, Lcom/google/android/gms/internal/play_billing/l3;->r(Ljava/lang/Object;I)Z

    move-result v1

    if-eqz v1, :cond_3

    goto :goto_5

    :pswitch_b
    invoke-direct {p0, p2, v0}, Lcom/google/android/gms/internal/play_billing/l3;->r(Ljava/lang/Object;I)Z

    move-result v1

    if-eqz v1, :cond_3

    goto :goto_5

    :pswitch_c
    invoke-direct {p0, p2, v0}, Lcom/google/android/gms/internal/play_billing/l3;->r(Ljava/lang/Object;I)Z

    move-result v1

    if-eqz v1, :cond_3

    :goto_6
    invoke-static {p2, v4, v5}, Lcom/google/android/gms/internal/play_billing/G3;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v1

    invoke-static {p1, v4, v5, v1}, Lcom/google/android/gms/internal/play_billing/G3;->x(Ljava/lang/Object;JLjava/lang/Object;)V

    goto :goto_4

    :pswitch_d
    invoke-direct {p0, p2, v0}, Lcom/google/android/gms/internal/play_billing/l3;->r(Ljava/lang/Object;I)Z

    move-result v1

    if-eqz v1, :cond_3

    goto :goto_6

    :pswitch_e
    invoke-direct {p0, p2, v0}, Lcom/google/android/gms/internal/play_billing/l3;->r(Ljava/lang/Object;I)Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-static {p2, v4, v5}, Lcom/google/android/gms/internal/play_billing/G3;->B(Ljava/lang/Object;J)Z

    move-result v1

    invoke-static {p1, v4, v5, v1}, Lcom/google/android/gms/internal/play_billing/G3;->r(Ljava/lang/Object;JZ)V

    goto :goto_4

    :pswitch_f
    invoke-direct {p0, p2, v0}, Lcom/google/android/gms/internal/play_billing/l3;->r(Ljava/lang/Object;I)Z

    move-result v1

    if-eqz v1, :cond_3

    goto :goto_5

    :pswitch_10
    invoke-direct {p0, p2, v0}, Lcom/google/android/gms/internal/play_billing/l3;->r(Ljava/lang/Object;I)Z

    move-result v1

    if-eqz v1, :cond_3

    goto :goto_3

    :pswitch_11
    invoke-direct {p0, p2, v0}, Lcom/google/android/gms/internal/play_billing/l3;->r(Ljava/lang/Object;I)Z

    move-result v1

    if-eqz v1, :cond_3

    goto :goto_5

    :pswitch_12
    invoke-direct {p0, p2, v0}, Lcom/google/android/gms/internal/play_billing/l3;->r(Ljava/lang/Object;I)Z

    move-result v1

    if-eqz v1, :cond_3

    goto :goto_3

    :pswitch_13
    invoke-direct {p0, p2, v0}, Lcom/google/android/gms/internal/play_billing/l3;->r(Ljava/lang/Object;I)Z

    move-result v1

    if-eqz v1, :cond_3

    goto :goto_3

    :pswitch_14
    invoke-direct {p0, p2, v0}, Lcom/google/android/gms/internal/play_billing/l3;->r(Ljava/lang/Object;I)Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-static {p2, v4, v5}, Lcom/google/android/gms/internal/play_billing/G3;->g(Ljava/lang/Object;J)F

    move-result v1

    invoke-static {p1, v4, v5, v1}, Lcom/google/android/gms/internal/play_billing/G3;->u(Ljava/lang/Object;JF)V

    goto/16 :goto_4

    :pswitch_15
    invoke-direct {p0, p2, v0}, Lcom/google/android/gms/internal/play_billing/l3;->r(Ljava/lang/Object;I)Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-static {p2, v4, v5}, Lcom/google/android/gms/internal/play_billing/G3;->f(Ljava/lang/Object;J)D

    move-result-wide v1

    invoke-static {p1, v4, v5, v1, v2}, Lcom/google/android/gms/internal/play_billing/G3;->t(Ljava/lang/Object;JD)V

    goto/16 :goto_4

    :cond_3
    :goto_7
    add-int/lit8 v0, v0, 0x3

    goto/16 :goto_0

    :cond_4
    iget-object v0, p0, Lcom/google/android/gms/internal/play_billing/l3;->j:Lcom/google/android/gms/internal/play_billing/z3;

    invoke-static {v0, p1, p2}, Lcom/google/android/gms/internal/play_billing/v3;->u(Lcom/google/android/gms/internal/play_billing/z3;Ljava/lang/Object;Ljava/lang/Object;)V

    iget-boolean v0, p0, Lcom/google/android/gms/internal/play_billing/l3;->f:Z

    if-eqz v0, :cond_5

    iget-object v0, p0, Lcom/google/android/gms/internal/play_billing/l3;->k:Lcom/google/android/gms/internal/play_billing/B2;

    invoke-static {v0, p1, p2}, Lcom/google/android/gms/internal/play_billing/v3;->t(Lcom/google/android/gms/internal/play_billing/B2;Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_5
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_5
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_0
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final f(Ljava/lang/Object;[BIILcom/google/android/gms/internal/play_billing/c2;)V
    .locals 7

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v3, p3

    move v4, p4

    move-object v6, p5

    invoke-virtual/range {v0 .. v6}, Lcom/google/android/gms/internal/play_billing/l3;->y(Ljava/lang/Object;[BIIILcom/google/android/gms/internal/play_billing/c2;)I

    return-void
.end method

.method public final g(Ljava/lang/Object;)Z
    .locals 18

    .prologue
    move-object/from16 v6, p0

    move-object/from16 v7, p1

    const/4 v8, 0x0

    const v9, 0xfffff

    move v1, v8

    move v10, v1

    move v0, v9

    :goto_0
    iget v2, v6, Lcom/google/android/gms/internal/play_billing/l3;->h:I

    const/4 v11, 0x0

    const/4 v3, 0x1

    if-ge v10, v2, :cond_b

    iget-object v2, v6, Lcom/google/android/gms/internal/play_billing/l3;->g:[I

    iget-object v4, v6, Lcom/google/android/gms/internal/play_billing/l3;->a:[I

    aget v12, v2, v10

    aget v13, v4, v12

    invoke-direct {v6, v12}, Lcom/google/android/gms/internal/play_billing/l3;->H(I)I

    move-result v14

    iget-object v2, v6, Lcom/google/android/gms/internal/play_billing/l3;->a:[I

    add-int/lit8 v4, v12, 0x2

    aget v2, v2, v4

    and-int v4, v2, v9

    ushr-int/lit8 v2, v2, 0x14

    shl-int v15, v3, v2

    if-eq v4, v0, :cond_1

    if-eq v4, v9, :cond_0

    int-to-long v0, v4

    sget-object v2, Lcom/google/android/gms/internal/play_billing/l3;->m:Lsun/misc/Unsafe;

    invoke-virtual {v2, v7, v0, v1}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v1

    :cond_0
    move/from16 v17, v1

    move/from16 v16, v4

    goto :goto_1

    :cond_1
    move/from16 v16, v0

    move/from16 v17, v1

    :goto_1
    const/high16 v0, 0x10000000

    and-int/2addr v0, v14

    if-eqz v0, :cond_3

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move v2, v12

    move/from16 v3, v16

    move/from16 v4, v17

    move v5, v15

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/play_billing/l3;->s(Ljava/lang/Object;IIII)Z

    move-result v0

    if-eqz v0, :cond_2

    goto :goto_2

    :cond_2
    return v8

    :cond_3
    :goto_2
    invoke-static {v14}, Lcom/google/android/gms/internal/play_billing/l3;->G(I)I

    move-result v0

    const/16 v1, 0x9

    if-eq v0, v1, :cond_9

    const/16 v1, 0x11

    if-eq v0, v1, :cond_9

    const/16 v1, 0x1b

    if-eq v0, v1, :cond_7

    const/16 v1, 0x3c

    if-eq v0, v1, :cond_6

    const/16 v1, 0x44

    if-eq v0, v1, :cond_6

    const/16 v1, 0x31

    if-eq v0, v1, :cond_7

    const/16 v1, 0x32

    if-eq v0, v1, :cond_4

    goto/16 :goto_4

    :cond_4
    and-int v0, v14, v9

    int-to-long v0, v0

    invoke-static {v7, v0, v1}, Lcom/google/android/gms/internal/play_billing/G3;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/play_billing/c3;

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_5

    goto :goto_4

    :cond_5
    invoke-direct {v6, v12}, Lcom/google/android/gms/internal/play_billing/l3;->L(I)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Landroidx/appcompat/app/D;->a(Ljava/lang/Object;)V

    throw v11

    :cond_6
    invoke-direct {v6, v7, v13, v12}, Lcom/google/android/gms/internal/play_billing/l3;->v(Ljava/lang/Object;II)Z

    move-result v0

    if-eqz v0, :cond_a

    invoke-direct {v6, v12}, Lcom/google/android/gms/internal/play_billing/l3;->K(I)Lcom/google/android/gms/internal/play_billing/t3;

    move-result-object v0

    invoke-static {v7, v14, v0}, Lcom/google/android/gms/internal/play_billing/l3;->t(Ljava/lang/Object;ILcom/google/android/gms/internal/play_billing/t3;)Z

    move-result v0

    if-nez v0, :cond_a

    return v8

    :cond_7
    and-int v0, v14, v9

    int-to-long v0, v0

    invoke-static {v7, v0, v1}, Lcom/google/android/gms/internal/play_billing/G3;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_a

    invoke-direct {v6, v12}, Lcom/google/android/gms/internal/play_billing/l3;->K(I)Lcom/google/android/gms/internal/play_billing/t3;

    move-result-object v1

    move v2, v8

    :goto_3
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v3

    if-ge v2, v3, :cond_a

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v1, v3}, Lcom/google/android/gms/internal/play_billing/t3;->g(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_8

    return v8

    :cond_8
    add-int/lit8 v2, v2, 0x1

    goto :goto_3

    :cond_9
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move v2, v12

    move/from16 v3, v16

    move/from16 v4, v17

    move v5, v15

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/play_billing/l3;->s(Ljava/lang/Object;IIII)Z

    move-result v0

    if-eqz v0, :cond_a

    invoke-direct {v6, v12}, Lcom/google/android/gms/internal/play_billing/l3;->K(I)Lcom/google/android/gms/internal/play_billing/t3;

    move-result-object v0

    invoke-static {v7, v14, v0}, Lcom/google/android/gms/internal/play_billing/l3;->t(Ljava/lang/Object;ILcom/google/android/gms/internal/play_billing/t3;)Z

    move-result v0

    if-nez v0, :cond_a

    return v8

    :cond_a
    :goto_4
    add-int/lit8 v10, v10, 0x1

    move/from16 v0, v16

    move/from16 v1, v17

    goto/16 :goto_0

    :cond_b
    iget-boolean v0, v6, Lcom/google/android/gms/internal/play_billing/l3;->f:Z

    if-nez v0, :cond_c

    return v3

    :cond_c
    invoke-static/range {p1 .. p1}, Landroidx/appcompat/app/D;->a(Ljava/lang/Object;)V

    throw v11
.end method

.method public final h(Ljava/lang/Object;Lcom/google/android/gms/internal/play_billing/K3;)V
    .locals 19

    .prologue
    move-object/from16 v6, p0

    move-object/from16 v7, p1

    move-object/from16 v8, p2

    const/4 v9, 0x1

    iget-boolean v0, v6, Lcom/google/android/gms/internal/play_billing/l3;->f:Z

    const/4 v10, 0x0

    if-nez v0, :cond_7

    iget-object v11, v6, Lcom/google/android/gms/internal/play_billing/l3;->a:[I

    sget-object v12, Lcom/google/android/gms/internal/play_billing/l3;->m:Lsun/misc/Unsafe;

    const v13, 0xfffff

    move v0, v13

    const/4 v1, 0x0

    const/4 v15, 0x0

    :goto_0
    array-length v2, v11

    if-ge v15, v2, :cond_6

    invoke-direct {v6, v15}, Lcom/google/android/gms/internal/play_billing/l3;->H(I)I

    move-result v2

    iget-object v3, v6, Lcom/google/android/gms/internal/play_billing/l3;->a:[I

    invoke-static {v2}, Lcom/google/android/gms/internal/play_billing/l3;->G(I)I

    move-result v4

    aget v5, v3, v15

    const/16 v14, 0x11

    if-gt v4, v14, :cond_2

    add-int/lit8 v14, v15, 0x2

    aget v3, v3, v14

    and-int v14, v3, v13

    if-eq v14, v0, :cond_1

    if-ne v14, v13, :cond_0

    const/4 v1, 0x0

    goto :goto_1

    :cond_0
    int-to-long v0, v14

    invoke-virtual {v12, v7, v0, v1}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v0

    move v1, v0

    :goto_1
    move v0, v14

    :cond_1
    ushr-int/lit8 v3, v3, 0x14

    shl-int v3, v9, v3

    move v14, v0

    move/from16 v16, v1

    move/from16 v17, v3

    goto :goto_2

    :cond_2
    move v14, v0

    move/from16 v16, v1

    const/16 v17, 0x0

    :goto_2
    and-int v0, v2, v13

    int-to-long v2, v0

    packed-switch v4, :pswitch_data_0

    :cond_3
    :goto_3
    const/16 v18, 0x0

    goto/16 :goto_7

    :pswitch_0
    invoke-direct {v6, v7, v5, v15}, Lcom/google/android/gms/internal/play_billing/l3;->v(Ljava/lang/Object;II)Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {v12, v7, v2, v3}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v0

    invoke-direct {v6, v15}, Lcom/google/android/gms/internal/play_billing/l3;->K(I)Lcom/google/android/gms/internal/play_billing/t3;

    move-result-object v1

    invoke-interface {v8, v5, v0, v1}, Lcom/google/android/gms/internal/play_billing/K3;->e(ILjava/lang/Object;Lcom/google/android/gms/internal/play_billing/t3;)V

    goto :goto_3

    :pswitch_1
    invoke-direct {v6, v7, v5, v15}, Lcom/google/android/gms/internal/play_billing/l3;->v(Ljava/lang/Object;II)Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-static {v7, v2, v3}, Lcom/google/android/gms/internal/play_billing/l3;->I(Ljava/lang/Object;J)J

    move-result-wide v0

    invoke-interface {v8, v5, v0, v1}, Lcom/google/android/gms/internal/play_billing/K3;->w(IJ)V

    goto :goto_3

    :pswitch_2
    invoke-direct {v6, v7, v5, v15}, Lcom/google/android/gms/internal/play_billing/l3;->v(Ljava/lang/Object;II)Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-static {v7, v2, v3}, Lcom/google/android/gms/internal/play_billing/l3;->D(Ljava/lang/Object;J)I

    move-result v0

    invoke-interface {v8, v5, v0}, Lcom/google/android/gms/internal/play_billing/K3;->D(II)V

    goto :goto_3

    :pswitch_3
    invoke-direct {v6, v7, v5, v15}, Lcom/google/android/gms/internal/play_billing/l3;->v(Ljava/lang/Object;II)Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-static {v7, v2, v3}, Lcom/google/android/gms/internal/play_billing/l3;->I(Ljava/lang/Object;J)J

    move-result-wide v0

    invoke-interface {v8, v5, v0, v1}, Lcom/google/android/gms/internal/play_billing/K3;->s(IJ)V

    goto :goto_3

    :pswitch_4
    invoke-direct {v6, v7, v5, v15}, Lcom/google/android/gms/internal/play_billing/l3;->v(Ljava/lang/Object;II)Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-static {v7, v2, v3}, Lcom/google/android/gms/internal/play_billing/l3;->D(Ljava/lang/Object;J)I

    move-result v0

    invoke-interface {v8, v5, v0}, Lcom/google/android/gms/internal/play_billing/K3;->A(II)V

    goto :goto_3

    :pswitch_5
    invoke-direct {v6, v7, v5, v15}, Lcom/google/android/gms/internal/play_billing/l3;->v(Ljava/lang/Object;II)Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-static {v7, v2, v3}, Lcom/google/android/gms/internal/play_billing/l3;->D(Ljava/lang/Object;J)I

    move-result v0

    invoke-interface {v8, v5, v0}, Lcom/google/android/gms/internal/play_billing/K3;->t(II)V

    goto :goto_3

    :pswitch_6
    invoke-direct {v6, v7, v5, v15}, Lcom/google/android/gms/internal/play_billing/l3;->v(Ljava/lang/Object;II)Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-static {v7, v2, v3}, Lcom/google/android/gms/internal/play_billing/l3;->D(Ljava/lang/Object;J)I

    move-result v0

    invoke-interface {v8, v5, v0}, Lcom/google/android/gms/internal/play_billing/K3;->k(II)V

    goto :goto_3

    :pswitch_7
    invoke-direct {v6, v7, v5, v15}, Lcom/google/android/gms/internal/play_billing/l3;->v(Ljava/lang/Object;II)Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {v12, v7, v2, v3}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/play_billing/o2;

    invoke-interface {v8, v5, v0}, Lcom/google/android/gms/internal/play_billing/K3;->I(ILcom/google/android/gms/internal/play_billing/o2;)V

    goto :goto_3

    :pswitch_8
    invoke-direct {v6, v7, v5, v15}, Lcom/google/android/gms/internal/play_billing/l3;->v(Ljava/lang/Object;II)Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {v12, v7, v2, v3}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v0

    invoke-direct {v6, v15}, Lcom/google/android/gms/internal/play_billing/l3;->K(I)Lcom/google/android/gms/internal/play_billing/t3;

    move-result-object v1

    invoke-interface {v8, v5, v0, v1}, Lcom/google/android/gms/internal/play_billing/K3;->a(ILjava/lang/Object;Lcom/google/android/gms/internal/play_billing/t3;)V

    goto/16 :goto_3

    :pswitch_9
    invoke-direct {v6, v7, v5, v15}, Lcom/google/android/gms/internal/play_billing/l3;->v(Ljava/lang/Object;II)Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {v12, v7, v2, v3}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v5, v0, v8}, Lcom/google/android/gms/internal/play_billing/l3;->x(ILjava/lang/Object;Lcom/google/android/gms/internal/play_billing/K3;)V

    goto/16 :goto_3

    :pswitch_a
    invoke-direct {v6, v7, v5, v15}, Lcom/google/android/gms/internal/play_billing/l3;->v(Ljava/lang/Object;II)Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-static {v7, v2, v3}, Lcom/google/android/gms/internal/play_billing/l3;->w(Ljava/lang/Object;J)Z

    move-result v0

    invoke-interface {v8, v5, v0}, Lcom/google/android/gms/internal/play_billing/K3;->n(IZ)V

    goto/16 :goto_3

    :pswitch_b
    invoke-direct {v6, v7, v5, v15}, Lcom/google/android/gms/internal/play_billing/l3;->v(Ljava/lang/Object;II)Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-static {v7, v2, v3}, Lcom/google/android/gms/internal/play_billing/l3;->D(Ljava/lang/Object;J)I

    move-result v0

    invoke-interface {v8, v5, v0}, Lcom/google/android/gms/internal/play_billing/K3;->m(II)V

    goto/16 :goto_3

    :pswitch_c
    invoke-direct {v6, v7, v5, v15}, Lcom/google/android/gms/internal/play_billing/l3;->v(Ljava/lang/Object;II)Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-static {v7, v2, v3}, Lcom/google/android/gms/internal/play_billing/l3;->I(Ljava/lang/Object;J)J

    move-result-wide v0

    invoke-interface {v8, v5, v0, v1}, Lcom/google/android/gms/internal/play_billing/K3;->E(IJ)V

    goto/16 :goto_3

    :pswitch_d
    invoke-direct {v6, v7, v5, v15}, Lcom/google/android/gms/internal/play_billing/l3;->v(Ljava/lang/Object;II)Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-static {v7, v2, v3}, Lcom/google/android/gms/internal/play_billing/l3;->D(Ljava/lang/Object;J)I

    move-result v0

    invoke-interface {v8, v5, v0}, Lcom/google/android/gms/internal/play_billing/K3;->f(II)V

    goto/16 :goto_3

    :pswitch_e
    invoke-direct {v6, v7, v5, v15}, Lcom/google/android/gms/internal/play_billing/l3;->v(Ljava/lang/Object;II)Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-static {v7, v2, v3}, Lcom/google/android/gms/internal/play_billing/l3;->I(Ljava/lang/Object;J)J

    move-result-wide v0

    invoke-interface {v8, v5, v0, v1}, Lcom/google/android/gms/internal/play_billing/K3;->G(IJ)V

    goto/16 :goto_3

    :pswitch_f
    invoke-direct {v6, v7, v5, v15}, Lcom/google/android/gms/internal/play_billing/l3;->v(Ljava/lang/Object;II)Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-static {v7, v2, v3}, Lcom/google/android/gms/internal/play_billing/l3;->I(Ljava/lang/Object;J)J

    move-result-wide v0

    invoke-interface {v8, v5, v0, v1}, Lcom/google/android/gms/internal/play_billing/K3;->o(IJ)V

    goto/16 :goto_3

    :pswitch_10
    invoke-direct {v6, v7, v5, v15}, Lcom/google/android/gms/internal/play_billing/l3;->v(Ljava/lang/Object;II)Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-static {v7, v2, v3}, Lcom/google/android/gms/internal/play_billing/l3;->C(Ljava/lang/Object;J)F

    move-result v0

    invoke-interface {v8, v5, v0}, Lcom/google/android/gms/internal/play_billing/K3;->y(IF)V

    goto/16 :goto_3

    :pswitch_11
    invoke-direct {v6, v7, v5, v15}, Lcom/google/android/gms/internal/play_billing/l3;->v(Ljava/lang/Object;II)Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-static {v7, v2, v3}, Lcom/google/android/gms/internal/play_billing/l3;->B(Ljava/lang/Object;J)D

    move-result-wide v0

    invoke-interface {v8, v5, v0, v1}, Lcom/google/android/gms/internal/play_billing/K3;->v(ID)V

    goto/16 :goto_3

    :pswitch_12
    invoke-virtual {v12, v7, v2, v3}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_4

    goto/16 :goto_3

    :cond_4
    invoke-direct {v6, v15}, Lcom/google/android/gms/internal/play_billing/l3;->L(I)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Landroidx/appcompat/app/D;->a(Ljava/lang/Object;)V

    throw v10

    :pswitch_13
    iget-object v0, v6, Lcom/google/android/gms/internal/play_billing/l3;->a:[I

    aget v0, v0, v15

    invoke-virtual {v12, v7, v2, v3}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    invoke-direct {v6, v15}, Lcom/google/android/gms/internal/play_billing/l3;->K(I)Lcom/google/android/gms/internal/play_billing/t3;

    move-result-object v2

    sget v3, Lcom/google/android/gms/internal/play_billing/v3;->b:I

    if-eqz v1, :cond_3

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_3

    const/4 v3, 0x0

    :goto_4
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v4

    if-ge v3, v4, :cond_3

    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    move-object v5, v8

    check-cast v5, Lcom/google/android/gms/internal/play_billing/w2;

    invoke-virtual {v5, v0, v4, v2}, Lcom/google/android/gms/internal/play_billing/w2;->e(ILjava/lang/Object;Lcom/google/android/gms/internal/play_billing/t3;)V

    add-int/2addr v3, v9

    goto :goto_4

    :pswitch_14
    iget-object v0, v6, Lcom/google/android/gms/internal/play_billing/l3;->a:[I

    aget v0, v0, v15

    invoke-virtual {v12, v7, v2, v3}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    invoke-static {v0, v1, v8, v9}, Lcom/google/android/gms/internal/play_billing/v3;->b(ILjava/util/List;Lcom/google/android/gms/internal/play_billing/K3;Z)V

    goto/16 :goto_3

    :pswitch_15
    iget-object v0, v6, Lcom/google/android/gms/internal/play_billing/l3;->a:[I

    aget v0, v0, v15

    invoke-virtual {v12, v7, v2, v3}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    invoke-static {v0, v1, v8, v9}, Lcom/google/android/gms/internal/play_billing/v3;->a(ILjava/util/List;Lcom/google/android/gms/internal/play_billing/K3;Z)V

    goto/16 :goto_3

    :pswitch_16
    iget-object v0, v6, Lcom/google/android/gms/internal/play_billing/l3;->a:[I

    aget v0, v0, v15

    invoke-virtual {v12, v7, v2, v3}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    invoke-static {v0, v1, v8, v9}, Lcom/google/android/gms/internal/play_billing/v3;->E(ILjava/util/List;Lcom/google/android/gms/internal/play_billing/K3;Z)V

    goto/16 :goto_3

    :pswitch_17
    iget-object v0, v6, Lcom/google/android/gms/internal/play_billing/l3;->a:[I

    aget v0, v0, v15

    invoke-virtual {v12, v7, v2, v3}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    invoke-static {v0, v1, v8, v9}, Lcom/google/android/gms/internal/play_billing/v3;->D(ILjava/util/List;Lcom/google/android/gms/internal/play_billing/K3;Z)V

    goto/16 :goto_3

    :pswitch_18
    iget-object v0, v6, Lcom/google/android/gms/internal/play_billing/l3;->a:[I

    aget v0, v0, v15

    invoke-virtual {v12, v7, v2, v3}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    invoke-static {v0, v1, v8, v9}, Lcom/google/android/gms/internal/play_billing/v3;->x(ILjava/util/List;Lcom/google/android/gms/internal/play_billing/K3;Z)V

    goto/16 :goto_3

    :pswitch_19
    iget-object v0, v6, Lcom/google/android/gms/internal/play_billing/l3;->a:[I

    aget v0, v0, v15

    invoke-virtual {v12, v7, v2, v3}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    invoke-static {v0, v1, v8, v9}, Lcom/google/android/gms/internal/play_billing/v3;->c(ILjava/util/List;Lcom/google/android/gms/internal/play_billing/K3;Z)V

    goto/16 :goto_3

    :pswitch_1a
    iget-object v0, v6, Lcom/google/android/gms/internal/play_billing/l3;->a:[I

    aget v0, v0, v15

    invoke-virtual {v12, v7, v2, v3}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    invoke-static {v0, v1, v8, v9}, Lcom/google/android/gms/internal/play_billing/v3;->v(ILjava/util/List;Lcom/google/android/gms/internal/play_billing/K3;Z)V

    goto/16 :goto_3

    :pswitch_1b
    iget-object v0, v6, Lcom/google/android/gms/internal/play_billing/l3;->a:[I

    aget v0, v0, v15

    invoke-virtual {v12, v7, v2, v3}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    invoke-static {v0, v1, v8, v9}, Lcom/google/android/gms/internal/play_billing/v3;->y(ILjava/util/List;Lcom/google/android/gms/internal/play_billing/K3;Z)V

    goto/16 :goto_3

    :pswitch_1c
    iget-object v0, v6, Lcom/google/android/gms/internal/play_billing/l3;->a:[I

    aget v0, v0, v15

    invoke-virtual {v12, v7, v2, v3}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    invoke-static {v0, v1, v8, v9}, Lcom/google/android/gms/internal/play_billing/v3;->z(ILjava/util/List;Lcom/google/android/gms/internal/play_billing/K3;Z)V

    goto/16 :goto_3

    :pswitch_1d
    iget-object v0, v6, Lcom/google/android/gms/internal/play_billing/l3;->a:[I

    aget v0, v0, v15

    invoke-virtual {v12, v7, v2, v3}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    invoke-static {v0, v1, v8, v9}, Lcom/google/android/gms/internal/play_billing/v3;->B(ILjava/util/List;Lcom/google/android/gms/internal/play_billing/K3;Z)V

    goto/16 :goto_3

    :pswitch_1e
    iget-object v0, v6, Lcom/google/android/gms/internal/play_billing/l3;->a:[I

    aget v0, v0, v15

    invoke-virtual {v12, v7, v2, v3}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    invoke-static {v0, v1, v8, v9}, Lcom/google/android/gms/internal/play_billing/v3;->d(ILjava/util/List;Lcom/google/android/gms/internal/play_billing/K3;Z)V

    goto/16 :goto_3

    :pswitch_1f
    iget-object v0, v6, Lcom/google/android/gms/internal/play_billing/l3;->a:[I

    aget v0, v0, v15

    invoke-virtual {v12, v7, v2, v3}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    invoke-static {v0, v1, v8, v9}, Lcom/google/android/gms/internal/play_billing/v3;->C(ILjava/util/List;Lcom/google/android/gms/internal/play_billing/K3;Z)V

    goto/16 :goto_3

    :pswitch_20
    iget-object v0, v6, Lcom/google/android/gms/internal/play_billing/l3;->a:[I

    aget v0, v0, v15

    invoke-virtual {v12, v7, v2, v3}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    invoke-static {v0, v1, v8, v9}, Lcom/google/android/gms/internal/play_billing/v3;->A(ILjava/util/List;Lcom/google/android/gms/internal/play_billing/K3;Z)V

    goto/16 :goto_3

    :pswitch_21
    iget-object v0, v6, Lcom/google/android/gms/internal/play_billing/l3;->a:[I

    aget v0, v0, v15

    invoke-virtual {v12, v7, v2, v3}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    invoke-static {v0, v1, v8, v9}, Lcom/google/android/gms/internal/play_billing/v3;->w(ILjava/util/List;Lcom/google/android/gms/internal/play_billing/K3;Z)V

    goto/16 :goto_3

    :pswitch_22
    iget-object v0, v6, Lcom/google/android/gms/internal/play_billing/l3;->a:[I

    aget v0, v0, v15

    invoke-virtual {v12, v7, v2, v3}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    const/4 v4, 0x0

    invoke-static {v0, v1, v8, v4}, Lcom/google/android/gms/internal/play_billing/v3;->b(ILjava/util/List;Lcom/google/android/gms/internal/play_billing/K3;Z)V

    :goto_5
    move/from16 v18, v4

    goto/16 :goto_7

    :pswitch_23
    const/4 v4, 0x0

    iget-object v0, v6, Lcom/google/android/gms/internal/play_billing/l3;->a:[I

    aget v0, v0, v15

    invoke-virtual {v12, v7, v2, v3}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    invoke-static {v0, v1, v8, v4}, Lcom/google/android/gms/internal/play_billing/v3;->a(ILjava/util/List;Lcom/google/android/gms/internal/play_billing/K3;Z)V

    goto :goto_5

    :pswitch_24
    const/4 v4, 0x0

    iget-object v0, v6, Lcom/google/android/gms/internal/play_billing/l3;->a:[I

    aget v0, v0, v15

    invoke-virtual {v12, v7, v2, v3}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    invoke-static {v0, v1, v8, v4}, Lcom/google/android/gms/internal/play_billing/v3;->E(ILjava/util/List;Lcom/google/android/gms/internal/play_billing/K3;Z)V

    goto :goto_5

    :pswitch_25
    const/4 v4, 0x0

    iget-object v0, v6, Lcom/google/android/gms/internal/play_billing/l3;->a:[I

    aget v0, v0, v15

    invoke-virtual {v12, v7, v2, v3}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    invoke-static {v0, v1, v8, v4}, Lcom/google/android/gms/internal/play_billing/v3;->D(ILjava/util/List;Lcom/google/android/gms/internal/play_billing/K3;Z)V

    goto :goto_5

    :pswitch_26
    const/4 v4, 0x0

    iget-object v0, v6, Lcom/google/android/gms/internal/play_billing/l3;->a:[I

    aget v0, v0, v15

    invoke-virtual {v12, v7, v2, v3}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    invoke-static {v0, v1, v8, v4}, Lcom/google/android/gms/internal/play_billing/v3;->x(ILjava/util/List;Lcom/google/android/gms/internal/play_billing/K3;Z)V

    goto :goto_5

    :pswitch_27
    const/4 v4, 0x0

    iget-object v0, v6, Lcom/google/android/gms/internal/play_billing/l3;->a:[I

    aget v0, v0, v15

    invoke-virtual {v12, v7, v2, v3}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    invoke-static {v0, v1, v8, v4}, Lcom/google/android/gms/internal/play_billing/v3;->c(ILjava/util/List;Lcom/google/android/gms/internal/play_billing/K3;Z)V

    goto :goto_5

    :pswitch_28
    iget-object v0, v6, Lcom/google/android/gms/internal/play_billing/l3;->a:[I

    aget v0, v0, v15

    invoke-virtual {v12, v7, v2, v3}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    sget v2, Lcom/google/android/gms/internal/play_billing/v3;->b:I

    if-eqz v1, :cond_3

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_3

    invoke-interface {v8, v0, v1}, Lcom/google/android/gms/internal/play_billing/K3;->i(ILjava/util/List;)V

    goto/16 :goto_3

    :pswitch_29
    iget-object v0, v6, Lcom/google/android/gms/internal/play_billing/l3;->a:[I

    aget v0, v0, v15

    invoke-virtual {v12, v7, v2, v3}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    invoke-direct {v6, v15}, Lcom/google/android/gms/internal/play_billing/l3;->K(I)Lcom/google/android/gms/internal/play_billing/t3;

    move-result-object v2

    sget v3, Lcom/google/android/gms/internal/play_billing/v3;->b:I

    if-eqz v1, :cond_3

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_3

    const/4 v4, 0x0

    :goto_6
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v3

    if-ge v4, v3, :cond_3

    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    move-object v5, v8

    check-cast v5, Lcom/google/android/gms/internal/play_billing/w2;

    invoke-virtual {v5, v0, v3, v2}, Lcom/google/android/gms/internal/play_billing/w2;->a(ILjava/lang/Object;Lcom/google/android/gms/internal/play_billing/t3;)V

    add-int/2addr v4, v9

    goto :goto_6

    :pswitch_2a
    iget-object v0, v6, Lcom/google/android/gms/internal/play_billing/l3;->a:[I

    aget v0, v0, v15

    invoke-virtual {v12, v7, v2, v3}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    sget v2, Lcom/google/android/gms/internal/play_billing/v3;->b:I

    if-eqz v1, :cond_3

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_3

    invoke-interface {v8, v0, v1}, Lcom/google/android/gms/internal/play_billing/K3;->F(ILjava/util/List;)V

    goto/16 :goto_3

    :pswitch_2b
    iget-object v0, v6, Lcom/google/android/gms/internal/play_billing/l3;->a:[I

    aget v0, v0, v15

    invoke-virtual {v12, v7, v2, v3}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    const/4 v4, 0x0

    invoke-static {v0, v1, v8, v4}, Lcom/google/android/gms/internal/play_billing/v3;->v(ILjava/util/List;Lcom/google/android/gms/internal/play_billing/K3;Z)V

    goto/16 :goto_5

    :pswitch_2c
    const/4 v4, 0x0

    iget-object v0, v6, Lcom/google/android/gms/internal/play_billing/l3;->a:[I

    aget v0, v0, v15

    invoke-virtual {v12, v7, v2, v3}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    invoke-static {v0, v1, v8, v4}, Lcom/google/android/gms/internal/play_billing/v3;->y(ILjava/util/List;Lcom/google/android/gms/internal/play_billing/K3;Z)V

    goto/16 :goto_5

    :pswitch_2d
    const/4 v4, 0x0

    iget-object v0, v6, Lcom/google/android/gms/internal/play_billing/l3;->a:[I

    aget v0, v0, v15

    invoke-virtual {v12, v7, v2, v3}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    invoke-static {v0, v1, v8, v4}, Lcom/google/android/gms/internal/play_billing/v3;->z(ILjava/util/List;Lcom/google/android/gms/internal/play_billing/K3;Z)V

    goto/16 :goto_5

    :pswitch_2e
    const/4 v4, 0x0

    iget-object v0, v6, Lcom/google/android/gms/internal/play_billing/l3;->a:[I

    aget v0, v0, v15

    invoke-virtual {v12, v7, v2, v3}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    invoke-static {v0, v1, v8, v4}, Lcom/google/android/gms/internal/play_billing/v3;->B(ILjava/util/List;Lcom/google/android/gms/internal/play_billing/K3;Z)V

    goto/16 :goto_5

    :pswitch_2f
    const/4 v4, 0x0

    iget-object v0, v6, Lcom/google/android/gms/internal/play_billing/l3;->a:[I

    aget v0, v0, v15

    invoke-virtual {v12, v7, v2, v3}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    invoke-static {v0, v1, v8, v4}, Lcom/google/android/gms/internal/play_billing/v3;->d(ILjava/util/List;Lcom/google/android/gms/internal/play_billing/K3;Z)V

    goto/16 :goto_5

    :pswitch_30
    const/4 v4, 0x0

    iget-object v0, v6, Lcom/google/android/gms/internal/play_billing/l3;->a:[I

    aget v0, v0, v15

    invoke-virtual {v12, v7, v2, v3}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    invoke-static {v0, v1, v8, v4}, Lcom/google/android/gms/internal/play_billing/v3;->C(ILjava/util/List;Lcom/google/android/gms/internal/play_billing/K3;Z)V

    goto/16 :goto_5

    :pswitch_31
    const/4 v4, 0x0

    iget-object v0, v6, Lcom/google/android/gms/internal/play_billing/l3;->a:[I

    aget v0, v0, v15

    invoke-virtual {v12, v7, v2, v3}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    invoke-static {v0, v1, v8, v4}, Lcom/google/android/gms/internal/play_billing/v3;->A(ILjava/util/List;Lcom/google/android/gms/internal/play_billing/K3;Z)V

    goto/16 :goto_5

    :pswitch_32
    const/4 v4, 0x0

    iget-object v0, v6, Lcom/google/android/gms/internal/play_billing/l3;->a:[I

    aget v0, v0, v15

    invoke-virtual {v12, v7, v2, v3}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    invoke-static {v0, v1, v8, v4}, Lcom/google/android/gms/internal/play_billing/v3;->w(ILjava/util/List;Lcom/google/android/gms/internal/play_billing/K3;Z)V

    goto/16 :goto_5

    :pswitch_33
    const/4 v4, 0x0

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-wide v9, v2

    move v2, v15

    move v3, v14

    move/from16 v18, v4

    move/from16 v4, v16

    move v13, v5

    move/from16 v5, v17

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/play_billing/l3;->s(Ljava/lang/Object;IIII)Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-virtual {v12, v7, v9, v10}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v0

    invoke-direct {v6, v15}, Lcom/google/android/gms/internal/play_billing/l3;->K(I)Lcom/google/android/gms/internal/play_billing/t3;

    move-result-object v1

    invoke-interface {v8, v13, v0, v1}, Lcom/google/android/gms/internal/play_billing/K3;->e(ILjava/lang/Object;Lcom/google/android/gms/internal/play_billing/t3;)V

    goto/16 :goto_7

    :pswitch_34
    move-wide v9, v2

    move v13, v5

    const/16 v18, 0x0

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move v2, v15

    move v3, v14

    move/from16 v4, v16

    move/from16 v5, v17

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/play_billing/l3;->s(Ljava/lang/Object;IIII)Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-virtual {v12, v7, v9, v10}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    move-result-wide v0

    invoke-interface {v8, v13, v0, v1}, Lcom/google/android/gms/internal/play_billing/K3;->w(IJ)V

    goto/16 :goto_7

    :pswitch_35
    move-wide v9, v2

    move v13, v5

    const/16 v18, 0x0

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move v2, v15

    move v3, v14

    move/from16 v4, v16

    move/from16 v5, v17

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/play_billing/l3;->s(Ljava/lang/Object;IIII)Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-virtual {v12, v7, v9, v10}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v0

    invoke-interface {v8, v13, v0}, Lcom/google/android/gms/internal/play_billing/K3;->D(II)V

    goto/16 :goto_7

    :pswitch_36
    move-wide v9, v2

    move v13, v5

    const/16 v18, 0x0

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move v2, v15

    move v3, v14

    move/from16 v4, v16

    move/from16 v5, v17

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/play_billing/l3;->s(Ljava/lang/Object;IIII)Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-virtual {v12, v7, v9, v10}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    move-result-wide v0

    invoke-interface {v8, v13, v0, v1}, Lcom/google/android/gms/internal/play_billing/K3;->s(IJ)V

    goto/16 :goto_7

    :pswitch_37
    move-wide v9, v2

    move v13, v5

    const/16 v18, 0x0

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move v2, v15

    move v3, v14

    move/from16 v4, v16

    move/from16 v5, v17

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/play_billing/l3;->s(Ljava/lang/Object;IIII)Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-virtual {v12, v7, v9, v10}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v0

    invoke-interface {v8, v13, v0}, Lcom/google/android/gms/internal/play_billing/K3;->A(II)V

    goto/16 :goto_7

    :pswitch_38
    move-wide v9, v2

    move v13, v5

    const/16 v18, 0x0

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move v2, v15

    move v3, v14

    move/from16 v4, v16

    move/from16 v5, v17

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/play_billing/l3;->s(Ljava/lang/Object;IIII)Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-virtual {v12, v7, v9, v10}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v0

    invoke-interface {v8, v13, v0}, Lcom/google/android/gms/internal/play_billing/K3;->t(II)V

    goto/16 :goto_7

    :pswitch_39
    move-wide v9, v2

    move v13, v5

    const/16 v18, 0x0

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move v2, v15

    move v3, v14

    move/from16 v4, v16

    move/from16 v5, v17

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/play_billing/l3;->s(Ljava/lang/Object;IIII)Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-virtual {v12, v7, v9, v10}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v0

    invoke-interface {v8, v13, v0}, Lcom/google/android/gms/internal/play_billing/K3;->k(II)V

    goto/16 :goto_7

    :pswitch_3a
    move-wide v9, v2

    move v13, v5

    const/16 v18, 0x0

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move v2, v15

    move v3, v14

    move/from16 v4, v16

    move/from16 v5, v17

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/play_billing/l3;->s(Ljava/lang/Object;IIII)Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-virtual {v12, v7, v9, v10}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/play_billing/o2;

    invoke-interface {v8, v13, v0}, Lcom/google/android/gms/internal/play_billing/K3;->I(ILcom/google/android/gms/internal/play_billing/o2;)V

    goto/16 :goto_7

    :pswitch_3b
    move-wide v9, v2

    move v13, v5

    const/16 v18, 0x0

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move v2, v15

    move v3, v14

    move/from16 v4, v16

    move/from16 v5, v17

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/play_billing/l3;->s(Ljava/lang/Object;IIII)Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-virtual {v12, v7, v9, v10}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v0

    invoke-direct {v6, v15}, Lcom/google/android/gms/internal/play_billing/l3;->K(I)Lcom/google/android/gms/internal/play_billing/t3;

    move-result-object v1

    invoke-interface {v8, v13, v0, v1}, Lcom/google/android/gms/internal/play_billing/K3;->a(ILjava/lang/Object;Lcom/google/android/gms/internal/play_billing/t3;)V

    goto/16 :goto_7

    :pswitch_3c
    move-wide v9, v2

    move v13, v5

    const/16 v18, 0x0

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move v2, v15

    move v3, v14

    move/from16 v4, v16

    move/from16 v5, v17

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/play_billing/l3;->s(Ljava/lang/Object;IIII)Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-virtual {v12, v7, v9, v10}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v13, v0, v8}, Lcom/google/android/gms/internal/play_billing/l3;->x(ILjava/lang/Object;Lcom/google/android/gms/internal/play_billing/K3;)V

    goto/16 :goto_7

    :pswitch_3d
    move-wide v9, v2

    move v13, v5

    const/16 v18, 0x0

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move v2, v15

    move v3, v14

    move/from16 v4, v16

    move/from16 v5, v17

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/play_billing/l3;->s(Ljava/lang/Object;IIII)Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-static {v7, v9, v10}, Lcom/google/android/gms/internal/play_billing/G3;->B(Ljava/lang/Object;J)Z

    move-result v0

    invoke-interface {v8, v13, v0}, Lcom/google/android/gms/internal/play_billing/K3;->n(IZ)V

    goto/16 :goto_7

    :pswitch_3e
    move-wide v9, v2

    move v13, v5

    const/16 v18, 0x0

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move v2, v15

    move v3, v14

    move/from16 v4, v16

    move/from16 v5, v17

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/play_billing/l3;->s(Ljava/lang/Object;IIII)Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-virtual {v12, v7, v9, v10}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v0

    invoke-interface {v8, v13, v0}, Lcom/google/android/gms/internal/play_billing/K3;->m(II)V

    goto/16 :goto_7

    :pswitch_3f
    move-wide v9, v2

    move v13, v5

    const/16 v18, 0x0

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move v2, v15

    move v3, v14

    move/from16 v4, v16

    move/from16 v5, v17

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/play_billing/l3;->s(Ljava/lang/Object;IIII)Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-virtual {v12, v7, v9, v10}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    move-result-wide v0

    invoke-interface {v8, v13, v0, v1}, Lcom/google/android/gms/internal/play_billing/K3;->E(IJ)V

    goto/16 :goto_7

    :pswitch_40
    move-wide v9, v2

    move v13, v5

    const/16 v18, 0x0

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move v2, v15

    move v3, v14

    move/from16 v4, v16

    move/from16 v5, v17

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/play_billing/l3;->s(Ljava/lang/Object;IIII)Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-virtual {v12, v7, v9, v10}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v0

    invoke-interface {v8, v13, v0}, Lcom/google/android/gms/internal/play_billing/K3;->f(II)V

    goto/16 :goto_7

    :pswitch_41
    move-wide v9, v2

    move v13, v5

    const/16 v18, 0x0

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move v2, v15

    move v3, v14

    move/from16 v4, v16

    move/from16 v5, v17

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/play_billing/l3;->s(Ljava/lang/Object;IIII)Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-virtual {v12, v7, v9, v10}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    move-result-wide v0

    invoke-interface {v8, v13, v0, v1}, Lcom/google/android/gms/internal/play_billing/K3;->G(IJ)V

    goto/16 :goto_7

    :pswitch_42
    move-wide v9, v2

    move v13, v5

    const/16 v18, 0x0

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move v2, v15

    move v3, v14

    move/from16 v4, v16

    move/from16 v5, v17

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/play_billing/l3;->s(Ljava/lang/Object;IIII)Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-virtual {v12, v7, v9, v10}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    move-result-wide v0

    invoke-interface {v8, v13, v0, v1}, Lcom/google/android/gms/internal/play_billing/K3;->o(IJ)V

    goto :goto_7

    :pswitch_43
    move-wide v9, v2

    move v13, v5

    const/16 v18, 0x0

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move v2, v15

    move v3, v14

    move/from16 v4, v16

    move/from16 v5, v17

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/play_billing/l3;->s(Ljava/lang/Object;IIII)Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-static {v7, v9, v10}, Lcom/google/android/gms/internal/play_billing/G3;->g(Ljava/lang/Object;J)F

    move-result v0

    invoke-interface {v8, v13, v0}, Lcom/google/android/gms/internal/play_billing/K3;->y(IF)V

    goto :goto_7

    :pswitch_44
    move-wide v9, v2

    move v13, v5

    const/16 v18, 0x0

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move v2, v15

    move v3, v14

    move/from16 v4, v16

    move/from16 v5, v17

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/play_billing/l3;->s(Ljava/lang/Object;IIII)Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-static {v7, v9, v10}, Lcom/google/android/gms/internal/play_billing/G3;->f(Ljava/lang/Object;J)D

    move-result-wide v0

    invoke-interface {v8, v13, v0, v1}, Lcom/google/android/gms/internal/play_billing/K3;->v(ID)V

    :cond_5
    :goto_7
    add-int/lit8 v15, v15, 0x3

    move v0, v14

    move/from16 v1, v16

    const/4 v9, 0x1

    const/4 v10, 0x0

    const v13, 0xfffff

    goto/16 :goto_0

    :cond_6
    move-object v0, v7

    check-cast v0, Lcom/google/android/gms/internal/play_billing/L2;

    iget-object v0, v0, Lcom/google/android/gms/internal/play_billing/L2;->zzc:Lcom/google/android/gms/internal/play_billing/A3;

    invoke-virtual {v0, v8}, Lcom/google/android/gms/internal/play_billing/A3;->k(Lcom/google/android/gms/internal/play_billing/K3;)V

    return-void

    :cond_7
    invoke-static/range {p1 .. p1}, Landroidx/appcompat/app/D;->a(Ljava/lang/Object;)V

    const/4 v0, 0x0

    throw v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_44
        :pswitch_43
        :pswitch_42
        :pswitch_41
        :pswitch_40
        :pswitch_3f
        :pswitch_3e
        :pswitch_3d
        :pswitch_3c
        :pswitch_3b
        :pswitch_3a
        :pswitch_39
        :pswitch_38
        :pswitch_37
        :pswitch_36
        :pswitch_35
        :pswitch_34
        :pswitch_33
        :pswitch_32
        :pswitch_31
        :pswitch_30
        :pswitch_2f
        :pswitch_2e
        :pswitch_2d
        :pswitch_2c
        :pswitch_2b
        :pswitch_2a
        :pswitch_29
        :pswitch_28
        :pswitch_27
        :pswitch_26
        :pswitch_25
        :pswitch_24
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final i(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 7

    .prologue
    const/4 v0, 0x0

    move v1, v0

    :goto_0
    iget-object v2, p0, Lcom/google/android/gms/internal/play_billing/l3;->a:[I

    array-length v2, v2

    if-ge v1, v2, :cond_2

    invoke-direct {p0, v1}, Lcom/google/android/gms/internal/play_billing/l3;->H(I)I

    move-result v2

    const v3, 0xfffff

    and-int v4, v2, v3

    invoke-static {v2}, Lcom/google/android/gms/internal/play_billing/l3;->G(I)I

    move-result v2

    int-to-long v4, v4

    packed-switch v2, :pswitch_data_0

    goto/16 :goto_1

    :pswitch_0
    invoke-direct {p0, v1}, Lcom/google/android/gms/internal/play_billing/l3;->E(I)I

    move-result v2

    and-int/2addr v2, v3

    int-to-long v2, v2

    invoke-static {p1, v2, v3}, Lcom/google/android/gms/internal/play_billing/G3;->h(Ljava/lang/Object;J)I

    move-result v6

    invoke-static {p2, v2, v3}, Lcom/google/android/gms/internal/play_billing/G3;->h(Ljava/lang/Object;J)I

    move-result v2

    if-ne v6, v2, :cond_1

    invoke-static {p1, v4, v5}, Lcom/google/android/gms/internal/play_billing/G3;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v2

    invoke-static {p2, v4, v5}, Lcom/google/android/gms/internal/play_billing/G3;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/google/android/gms/internal/play_billing/v3;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    goto/16 :goto_2

    :pswitch_1
    invoke-static {p1, v4, v5}, Lcom/google/android/gms/internal/play_billing/G3;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v2

    invoke-static {p2, v4, v5}, Lcom/google/android/gms/internal/play_billing/G3;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/google/android/gms/internal/play_billing/v3;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    goto/16 :goto_2

    :pswitch_2
    invoke-direct {p0, p1, p2, v1}, Lcom/google/android/gms/internal/play_billing/l3;->q(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-static {p1, v4, v5}, Lcom/google/android/gms/internal/play_billing/G3;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v2

    invoke-static {p2, v4, v5}, Lcom/google/android/gms/internal/play_billing/G3;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/google/android/gms/internal/play_billing/v3;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    goto/16 :goto_1

    :pswitch_3
    invoke-direct {p0, p1, p2, v1}, Lcom/google/android/gms/internal/play_billing/l3;->q(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-static {p1, v4, v5}, Lcom/google/android/gms/internal/play_billing/G3;->i(Ljava/lang/Object;J)J

    move-result-wide v2

    invoke-static {p2, v4, v5}, Lcom/google/android/gms/internal/play_billing/G3;->i(Ljava/lang/Object;J)J

    move-result-wide v4

    cmp-long v2, v2, v4

    if-nez v2, :cond_1

    goto/16 :goto_1

    :pswitch_4
    invoke-direct {p0, p1, p2, v1}, Lcom/google/android/gms/internal/play_billing/l3;->q(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-static {p1, v4, v5}, Lcom/google/android/gms/internal/play_billing/G3;->h(Ljava/lang/Object;J)I

    move-result v2

    invoke-static {p2, v4, v5}, Lcom/google/android/gms/internal/play_billing/G3;->h(Ljava/lang/Object;J)I

    move-result v3

    if-ne v2, v3, :cond_1

    goto/16 :goto_1

    :pswitch_5
    invoke-direct {p0, p1, p2, v1}, Lcom/google/android/gms/internal/play_billing/l3;->q(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-static {p1, v4, v5}, Lcom/google/android/gms/internal/play_billing/G3;->i(Ljava/lang/Object;J)J

    move-result-wide v2

    invoke-static {p2, v4, v5}, Lcom/google/android/gms/internal/play_billing/G3;->i(Ljava/lang/Object;J)J

    move-result-wide v4

    cmp-long v2, v2, v4

    if-nez v2, :cond_1

    goto/16 :goto_1

    :pswitch_6
    invoke-direct {p0, p1, p2, v1}, Lcom/google/android/gms/internal/play_billing/l3;->q(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-static {p1, v4, v5}, Lcom/google/android/gms/internal/play_billing/G3;->h(Ljava/lang/Object;J)I

    move-result v2

    invoke-static {p2, v4, v5}, Lcom/google/android/gms/internal/play_billing/G3;->h(Ljava/lang/Object;J)I

    move-result v3

    if-ne v2, v3, :cond_1

    goto/16 :goto_1

    :pswitch_7
    invoke-direct {p0, p1, p2, v1}, Lcom/google/android/gms/internal/play_billing/l3;->q(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-static {p1, v4, v5}, Lcom/google/android/gms/internal/play_billing/G3;->h(Ljava/lang/Object;J)I

    move-result v2

    invoke-static {p2, v4, v5}, Lcom/google/android/gms/internal/play_billing/G3;->h(Ljava/lang/Object;J)I

    move-result v3

    if-ne v2, v3, :cond_1

    goto/16 :goto_1

    :pswitch_8
    invoke-direct {p0, p1, p2, v1}, Lcom/google/android/gms/internal/play_billing/l3;->q(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-static {p1, v4, v5}, Lcom/google/android/gms/internal/play_billing/G3;->h(Ljava/lang/Object;J)I

    move-result v2

    invoke-static {p2, v4, v5}, Lcom/google/android/gms/internal/play_billing/G3;->h(Ljava/lang/Object;J)I

    move-result v3

    if-ne v2, v3, :cond_1

    goto/16 :goto_1

    :pswitch_9
    invoke-direct {p0, p1, p2, v1}, Lcom/google/android/gms/internal/play_billing/l3;->q(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-static {p1, v4, v5}, Lcom/google/android/gms/internal/play_billing/G3;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v2

    invoke-static {p2, v4, v5}, Lcom/google/android/gms/internal/play_billing/G3;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/google/android/gms/internal/play_billing/v3;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    goto/16 :goto_1

    :pswitch_a
    invoke-direct {p0, p1, p2, v1}, Lcom/google/android/gms/internal/play_billing/l3;->q(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-static {p1, v4, v5}, Lcom/google/android/gms/internal/play_billing/G3;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v2

    invoke-static {p2, v4, v5}, Lcom/google/android/gms/internal/play_billing/G3;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/google/android/gms/internal/play_billing/v3;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    goto/16 :goto_1

    :pswitch_b
    invoke-direct {p0, p1, p2, v1}, Lcom/google/android/gms/internal/play_billing/l3;->q(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-static {p1, v4, v5}, Lcom/google/android/gms/internal/play_billing/G3;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v2

    invoke-static {p2, v4, v5}, Lcom/google/android/gms/internal/play_billing/G3;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/google/android/gms/internal/play_billing/v3;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    goto/16 :goto_1

    :pswitch_c
    invoke-direct {p0, p1, p2, v1}, Lcom/google/android/gms/internal/play_billing/l3;->q(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-static {p1, v4, v5}, Lcom/google/android/gms/internal/play_billing/G3;->B(Ljava/lang/Object;J)Z

    move-result v2

    invoke-static {p2, v4, v5}, Lcom/google/android/gms/internal/play_billing/G3;->B(Ljava/lang/Object;J)Z

    move-result v3

    if-ne v2, v3, :cond_1

    goto/16 :goto_1

    :pswitch_d
    invoke-direct {p0, p1, p2, v1}, Lcom/google/android/gms/internal/play_billing/l3;->q(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-static {p1, v4, v5}, Lcom/google/android/gms/internal/play_billing/G3;->h(Ljava/lang/Object;J)I

    move-result v2

    invoke-static {p2, v4, v5}, Lcom/google/android/gms/internal/play_billing/G3;->h(Ljava/lang/Object;J)I

    move-result v3

    if-ne v2, v3, :cond_1

    goto/16 :goto_1

    :pswitch_e
    invoke-direct {p0, p1, p2, v1}, Lcom/google/android/gms/internal/play_billing/l3;->q(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-static {p1, v4, v5}, Lcom/google/android/gms/internal/play_billing/G3;->i(Ljava/lang/Object;J)J

    move-result-wide v2

    invoke-static {p2, v4, v5}, Lcom/google/android/gms/internal/play_billing/G3;->i(Ljava/lang/Object;J)J

    move-result-wide v4

    cmp-long v2, v2, v4

    if-nez v2, :cond_1

    goto :goto_1

    :pswitch_f
    invoke-direct {p0, p1, p2, v1}, Lcom/google/android/gms/internal/play_billing/l3;->q(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-static {p1, v4, v5}, Lcom/google/android/gms/internal/play_billing/G3;->h(Ljava/lang/Object;J)I

    move-result v2

    invoke-static {p2, v4, v5}, Lcom/google/android/gms/internal/play_billing/G3;->h(Ljava/lang/Object;J)I

    move-result v3

    if-ne v2, v3, :cond_1

    goto :goto_1

    :pswitch_10
    invoke-direct {p0, p1, p2, v1}, Lcom/google/android/gms/internal/play_billing/l3;->q(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-static {p1, v4, v5}, Lcom/google/android/gms/internal/play_billing/G3;->i(Ljava/lang/Object;J)J

    move-result-wide v2

    invoke-static {p2, v4, v5}, Lcom/google/android/gms/internal/play_billing/G3;->i(Ljava/lang/Object;J)J

    move-result-wide v4

    cmp-long v2, v2, v4

    if-nez v2, :cond_1

    goto :goto_1

    :pswitch_11
    invoke-direct {p0, p1, p2, v1}, Lcom/google/android/gms/internal/play_billing/l3;->q(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-static {p1, v4, v5}, Lcom/google/android/gms/internal/play_billing/G3;->i(Ljava/lang/Object;J)J

    move-result-wide v2

    invoke-static {p2, v4, v5}, Lcom/google/android/gms/internal/play_billing/G3;->i(Ljava/lang/Object;J)J

    move-result-wide v4

    cmp-long v2, v2, v4

    if-nez v2, :cond_1

    goto :goto_1

    :pswitch_12
    invoke-direct {p0, p1, p2, v1}, Lcom/google/android/gms/internal/play_billing/l3;->q(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-static {p1, v4, v5}, Lcom/google/android/gms/internal/play_billing/G3;->g(Ljava/lang/Object;J)F

    move-result v2

    invoke-static {v2}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v2

    invoke-static {p2, v4, v5}, Lcom/google/android/gms/internal/play_billing/G3;->g(Ljava/lang/Object;J)F

    move-result v3

    invoke-static {v3}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v3

    if-ne v2, v3, :cond_1

    goto :goto_1

    :pswitch_13
    invoke-direct {p0, p1, p2, v1}, Lcom/google/android/gms/internal/play_billing/l3;->q(Ljava/lang/Object;Ljava/lang/Object;I)Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-static {p1, v4, v5}, Lcom/google/android/gms/internal/play_billing/G3;->f(Ljava/lang/Object;J)D

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide v2

    invoke-static {p2, v4, v5}, Lcom/google/android/gms/internal/play_billing/G3;->f(Ljava/lang/Object;J)D

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide v4

    cmp-long v2, v2, v4

    if-nez v2, :cond_1

    :cond_0
    :goto_1
    add-int/lit8 v1, v1, 0x3

    goto/16 :goto_0

    :cond_1
    :goto_2
    return v0

    :cond_2
    move-object v1, p1

    check-cast v1, Lcom/google/android/gms/internal/play_billing/L2;

    iget-object v1, v1, Lcom/google/android/gms/internal/play_billing/L2;->zzc:Lcom/google/android/gms/internal/play_billing/A3;

    check-cast p2, Lcom/google/android/gms/internal/play_billing/L2;

    iget-object p2, p2, Lcom/google/android/gms/internal/play_billing/L2;->zzc:Lcom/google/android/gms/internal/play_billing/A3;

    invoke-virtual {v1, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_3

    return v0

    :cond_3
    iget-boolean p2, p0, Lcom/google/android/gms/internal/play_billing/l3;->f:Z

    if-nez p2, :cond_4

    const/4 p1, 0x1

    return p1

    :cond_4
    invoke-static {p1}, Landroidx/appcompat/app/D;->a(Ljava/lang/Object;)V

    const/4 p1, 0x0

    throw p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method final y(Ljava/lang/Object;[BIIILcom/google/android/gms/internal/play_billing/c2;)I
    .locals 45

    .prologue
    move-object/from16 v0, p0

    move-object/from16 v7, p1

    move-object/from16 v15, p2

    move/from16 v5, p4

    move/from16 v6, p5

    move-object/from16 v3, p6

    const/4 v4, 0x3

    const/4 v1, 0x1

    invoke-static/range {p1 .. p1}, Lcom/google/android/gms/internal/play_billing/l3;->j(Ljava/lang/Object;)V

    sget-object v14, Lcom/google/android/gms/internal/play_billing/l3;->m:Lsun/misc/Unsafe;

    const/4 v13, 0x0

    const/4 v12, -0x1

    move/from16 v8, p3

    move v9, v12

    move v10, v13

    move/from16 v17, v10

    move/from16 v18, v17

    const v16, 0xfffff

    :goto_0
    const/16 v19, 0x0

    if-ge v8, v5, :cond_7d

    add-int/lit8 v2, v8, 0x1

    aget-byte v8, v15, v8

    if-gez v8, :cond_0

    invoke-static {v8, v15, v2, v3}, Lcom/google/android/gms/internal/play_billing/e2;->i(I[BILcom/google/android/gms/internal/play_billing/c2;)I

    move-result v2

    iget v8, v3, Lcom/google/android/gms/internal/play_billing/c2;->a:I

    :cond_0
    ushr-int/lit8 v11, v8, 0x3

    if-le v11, v9, :cond_2

    div-int/2addr v10, v4

    iget v9, v0, Lcom/google/android/gms/internal/play_billing/l3;->c:I

    if-lt v11, v9, :cond_1

    iget v9, v0, Lcom/google/android/gms/internal/play_billing/l3;->d:I

    if-gt v11, v9, :cond_1

    invoke-direct {v0, v11, v10}, Lcom/google/android/gms/internal/play_billing/l3;->F(II)I

    move-result v9

    goto :goto_1

    :cond_1
    move v9, v12

    :goto_1
    move v10, v9

    goto :goto_2

    :cond_2
    iget v9, v0, Lcom/google/android/gms/internal/play_billing/l3;->c:I

    if-lt v11, v9, :cond_3

    iget v9, v0, Lcom/google/android/gms/internal/play_billing/l3;->d:I

    if-gt v11, v9, :cond_3

    invoke-direct {v0, v11, v13}, Lcom/google/android/gms/internal/play_billing/l3;->F(II)I

    move-result v9

    goto :goto_1

    :cond_3
    move v10, v12

    :goto_2
    if-ne v10, v12, :cond_4

    move/from16 v23, v4

    move v0, v6

    move v4, v8

    move/from16 v22, v12

    move v10, v13

    move/from16 v20, v10

    move-object/from16 v41, v14

    move-object v12, v15

    move-object v13, v3

    move v3, v2

    goto/16 :goto_49

    :cond_4
    and-int/lit8 v9, v8, 0x7

    iget-object v12, v0, Lcom/google/android/gms/internal/play_billing/l3;->a:[I

    add-int/lit8 v18, v10, 0x1

    aget v13, v12, v18

    invoke-static {v13}, Lcom/google/android/gms/internal/play_billing/l3;->G(I)I

    move-result v4

    const v18, 0xfffff

    and-int v1, v13, v18

    int-to-long v5, v1

    const/high16 v18, 0x20000000

    const-wide/16 v26, 0x0

    const-string v1, "Protocol message had invalid UTF-8."

    move/from16 v28, v8

    const-string v8, ""

    move-object/from16 v29, v1

    const-string v1, "CodedInputStream encountered an embedded string or message which claimed to have negative size."

    move-object/from16 v30, v1

    const/16 v1, 0x11

    if-gt v4, v1, :cond_21

    const/16 v20, 0x2

    add-int/lit8 v1, v10, 0x2

    aget v1, v12, v1

    ushr-int/lit8 v12, v1, 0x14

    const/16 v25, 0x1

    shl-int v12, v25, v12

    move/from16 p3, v13

    const v13, 0xfffff

    and-int/2addr v1, v13

    move-object/from16 v21, v8

    move/from16 v8, v16

    move-wide/from16 v31, v5

    if-eq v1, v8, :cond_7

    if-eq v8, v13, :cond_5

    int-to-long v5, v8

    move/from16 v8, v17

    invoke-virtual {v14, v7, v5, v6, v8}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    :cond_5
    if-ne v1, v13, :cond_6

    const/4 v5, 0x0

    goto :goto_3

    :cond_6
    int-to-long v5, v1

    invoke-virtual {v14, v7, v5, v6}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v5

    :goto_3
    move/from16 v16, v1

    move/from16 v17, v5

    goto :goto_4

    :cond_7
    move/from16 v16, v17

    move/from16 v16, v8

    :goto_4
    packed-switch v4, :pswitch_data_0

    const/4 v4, 0x3

    if-ne v9, v4, :cond_8

    or-int v17, v17, v12

    invoke-direct {v0, v7, v10}, Lcom/google/android/gms/internal/play_billing/l3;->M(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object v1

    shl-int/lit8 v5, v11, 0x3

    or-int/lit8 v5, v5, 0x4

    invoke-direct {v0, v10}, Lcom/google/android/gms/internal/play_billing/l3;->K(I)Lcom/google/android/gms/internal/play_billing/t3;

    move-result-object v9

    move/from16 v6, v28

    move-object v8, v1

    move v12, v10

    move-object/from16 v10, p2

    move v13, v11

    move v11, v2

    move v2, v12

    const/16 v22, -0x1

    move/from16 v12, p4

    move/from16 v33, v13

    move v13, v5

    move-object v5, v14

    move-object/from16 v14, p6

    invoke-static/range {v8 .. v14}, Lcom/google/android/gms/internal/play_billing/e2;->l(Ljava/lang/Object;Lcom/google/android/gms/internal/play_billing/t3;[BIIILcom/google/android/gms/internal/play_billing/c2;)I

    move-result v8

    invoke-direct {v0, v7, v2, v1}, Lcom/google/android/gms/internal/play_billing/l3;->o(Ljava/lang/Object;ILjava/lang/Object;)V

    move v10, v2

    move-object v14, v5

    move/from16 v18, v6

    move/from16 v12, v22

    move/from16 v1, v25

    move/from16 v9, v33

    const/4 v13, 0x0

    move/from16 v5, p4

    move/from16 v6, p5

    goto/16 :goto_0

    :cond_8
    move/from16 v33, v11

    move-object v5, v14

    const/16 v22, -0x1

    move v14, v10

    move-object v10, v3

    move/from16 v21, v4

    move-object v13, v5

    move/from16 v3, v25

    :goto_5
    const/4 v11, 0x0

    move v4, v2

    goto/16 :goto_1a

    :pswitch_0
    move/from16 v33, v11

    move-object v5, v14

    move/from16 v6, v28

    const/4 v4, 0x3

    const/16 v22, -0x1

    move v14, v10

    if-nez v9, :cond_9

    or-int v17, v17, v12

    invoke-static {v15, v2, v3}, Lcom/google/android/gms/internal/play_billing/e2;->k([BILcom/google/android/gms/internal/play_billing/c2;)I

    move-result v8

    iget-wide v1, v3, Lcom/google/android/gms/internal/play_billing/c2;->b:J

    invoke-static {v1, v2}, Lcom/google/android/gms/internal/play_billing/r2;->b(J)J

    move-result-wide v9

    move/from16 v13, v25

    move-object v1, v5

    move/from16 v11, v20

    move-object/from16 v2, p1

    move-object v12, v3

    move-wide/from16 v3, v31

    move-object v13, v5

    move v11, v6

    move-wide v5, v9

    invoke-virtual/range {v1 .. v6}, Lsun/misc/Unsafe;->putLong(Ljava/lang/Object;JJ)V

    move/from16 v5, p4

    move/from16 v6, p5

    move/from16 v18, v11

    move-object v3, v12

    :goto_6
    move v10, v14

    move/from16 v12, v22

    move/from16 v9, v33

    const/4 v1, 0x1

    const/4 v4, 0x3

    move-object v14, v13

    const/4 v13, 0x0

    goto/16 :goto_0

    :cond_9
    move-object v13, v5

    move-object v10, v3

    move/from16 v21, v4

    move/from16 v28, v6

    const/4 v3, 0x1

    goto :goto_5

    :pswitch_1
    move/from16 v33, v11

    move-object v13, v14

    move/from16 v11, v28

    const/16 v22, -0x1

    move v14, v10

    move-object v10, v3

    if-nez v9, :cond_a

    or-int v17, v17, v12

    invoke-static {v15, v2, v10}, Lcom/google/android/gms/internal/play_billing/e2;->h([BILcom/google/android/gms/internal/play_billing/c2;)I

    move-result v8

    iget v1, v10, Lcom/google/android/gms/internal/play_billing/c2;->a:I

    invoke-static {v1}, Lcom/google/android/gms/internal/play_billing/r2;->a(I)I

    move-result v1

    move-wide/from16 v5, v31

    :goto_7
    invoke-virtual {v13, v7, v5, v6, v1}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    :goto_8
    move/from16 v5, p4

    move/from16 v6, p5

    :goto_9
    move-object v3, v10

    move/from16 v18, v11

    goto :goto_6

    :cond_a
    move v4, v2

    move/from16 v28, v11

    const/4 v3, 0x1

    const/4 v11, 0x0

    :goto_a
    const/16 v21, 0x3

    goto/16 :goto_1a

    :pswitch_2
    move/from16 v33, v11

    move-object v13, v14

    move/from16 v11, v28

    move-wide/from16 v5, v31

    const/16 v22, -0x1

    move v14, v10

    move-object v10, v3

    if-nez v9, :cond_a

    invoke-static {v15, v2, v10}, Lcom/google/android/gms/internal/play_billing/e2;->h([BILcom/google/android/gms/internal/play_billing/c2;)I

    move-result v8

    iget v1, v10, Lcom/google/android/gms/internal/play_billing/c2;->a:I

    invoke-direct {v0, v14}, Lcom/google/android/gms/internal/play_billing/l3;->J(I)Lcom/google/android/gms/internal/play_billing/N2;

    move-result-object v2

    const/high16 v3, -0x80000000

    and-int v3, p3, v3

    if-eqz v3, :cond_c

    if-eqz v2, :cond_c

    invoke-interface {v2, v1}, Lcom/google/android/gms/internal/play_billing/N2;->r(I)Z

    move-result v2

    if-eqz v2, :cond_b

    goto :goto_b

    :cond_b
    invoke-static/range {p1 .. p1}, Lcom/google/android/gms/internal/play_billing/l3;->z(Ljava/lang/Object;)Lcom/google/android/gms/internal/play_billing/A3;

    move-result-object v2

    int-to-long v3, v1

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v2, v11, v1}, Lcom/google/android/gms/internal/play_billing/A3;->j(ILjava/lang/Object;)V

    goto :goto_8

    :cond_c
    :goto_b
    or-int v17, v17, v12

    goto :goto_7

    :pswitch_3
    move/from16 v33, v11

    move-object v13, v14

    move/from16 v1, v20

    move/from16 v11, v28

    move-wide/from16 v5, v31

    const/16 v22, -0x1

    move v14, v10

    move-object v10, v3

    if-ne v9, v1, :cond_a

    or-int v17, v17, v12

    invoke-static {v15, v2, v10}, Lcom/google/android/gms/internal/play_billing/e2;->a([BILcom/google/android/gms/internal/play_billing/c2;)I

    move-result v8

    iget-object v2, v10, Lcom/google/android/gms/internal/play_billing/c2;->c:Ljava/lang/Object;

    invoke-virtual {v13, v7, v5, v6, v2}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    goto :goto_8

    :pswitch_4
    move/from16 v33, v11

    move-object v13, v14

    move/from16 v1, v20

    move/from16 v11, v28

    const/16 v22, -0x1

    move v14, v10

    move-object v10, v3

    if-ne v9, v1, :cond_a

    or-int v17, v17, v12

    invoke-direct {v0, v7, v14}, Lcom/google/android/gms/internal/play_billing/l3;->M(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object v8

    invoke-direct {v0, v14}, Lcom/google/android/gms/internal/play_billing/l3;->K(I)Lcom/google/android/gms/internal/play_billing/t3;

    move-result-object v3

    move-object v1, v8

    move v4, v2

    move-object v2, v3

    move-object/from16 v3, p2

    move/from16 v5, p4

    move-object/from16 v6, p6

    invoke-static/range {v1 .. v6}, Lcom/google/android/gms/internal/play_billing/e2;->m(Ljava/lang/Object;Lcom/google/android/gms/internal/play_billing/t3;[BIILcom/google/android/gms/internal/play_billing/c2;)I

    move-result v1

    invoke-direct {v0, v7, v14, v8}, Lcom/google/android/gms/internal/play_billing/l3;->o(Ljava/lang/Object;ILjava/lang/Object;)V

    move/from16 v6, p5

    move v8, v1

    goto/16 :goto_9

    :pswitch_5
    move v4, v2

    move/from16 v33, v11

    move-object v13, v14

    move/from16 v1, v20

    move/from16 v11, v28

    move-wide/from16 v5, v31

    const/16 v22, -0x1

    move v14, v10

    move-object v10, v3

    if-ne v9, v1, :cond_1c

    and-int v1, p3, v18

    if-eqz v1, :cond_19

    or-int v1, v17, v12

    invoke-static {v15, v4, v10}, Lcom/google/android/gms/internal/play_billing/e2;->h([BILcom/google/android/gms/internal/play_billing/c2;)I

    move-result v2

    iget v3, v10, Lcom/google/android/gms/internal/play_billing/c2;->a:I

    if-ltz v3, :cond_18

    if-nez v3, :cond_d

    move-object/from16 v8, v21

    iput-object v8, v10, Lcom/google/android/gms/internal/play_billing/c2;->c:Ljava/lang/Object;

    move/from16 p3, v1

    move/from16 v28, v11

    const/4 v11, 0x0

    goto/16 :goto_11

    :cond_d
    sget v4, Lcom/google/android/gms/internal/play_billing/J3;->a:I

    array-length v4, v15

    sub-int v8, v4, v2

    or-int v9, v2, v3

    sub-int/2addr v8, v3

    or-int/2addr v8, v9

    if-ltz v8, :cond_17

    add-int v4, v2, v3

    new-array v3, v3, [C

    const/4 v8, 0x0

    :goto_c
    if-ge v2, v4, :cond_e

    aget-byte v9, v15, v2

    invoke-static {v9}, Lcom/google/android/gms/internal/play_billing/H3;->d(B)Z

    move-result v12

    if-eqz v12, :cond_e

    const/4 v12, 0x1

    add-int/2addr v2, v12

    add-int/lit8 v17, v8, 0x1

    int-to-char v9, v9

    aput-char v9, v3, v8

    move/from16 v8, v17

    goto :goto_c

    :cond_e
    const/4 v12, 0x1

    :goto_d
    if-ge v2, v4, :cond_16

    add-int/lit8 v9, v2, 0x1

    aget-byte v12, v15, v2

    invoke-static {v12}, Lcom/google/android/gms/internal/play_billing/H3;->d(B)Z

    move-result v17

    if-eqz v17, :cond_10

    const/16 v17, 0x1

    add-int/lit8 v2, v8, 0x1

    int-to-char v12, v12

    aput-char v12, v3, v8

    move v8, v2

    move v2, v9

    :goto_e
    if-ge v2, v4, :cond_f

    aget-byte v9, v15, v2

    invoke-static {v9}, Lcom/google/android/gms/internal/play_billing/H3;->d(B)Z

    move-result v12

    if-eqz v12, :cond_f

    add-int/lit8 v2, v2, 0x1

    add-int/lit8 v12, v8, 0x1

    int-to-char v9, v9

    aput-char v9, v3, v8

    move v8, v12

    goto :goto_e

    :cond_f
    move/from16 v12, v17

    goto :goto_d

    :cond_10
    move/from16 p3, v1

    const/16 v17, 0x1

    const/16 v1, -0x20

    if-ge v12, v1, :cond_12

    if-ge v9, v4, :cond_11

    add-int/lit8 v1, v8, 0x1

    const/16 v17, 0x2

    add-int/lit8 v2, v2, 0x2

    aget-byte v9, v15, v9

    invoke-static {v12, v9, v3, v8}, Lcom/google/android/gms/internal/play_billing/H3;->c(BB[CI)V

    move v8, v1

    :goto_f
    const/4 v12, 0x1

    move/from16 v1, p3

    goto :goto_d

    :cond_11
    new-instance v1, Lcom/google/android/gms/internal/play_billing/S2;

    move-object/from16 v2, v29

    invoke-direct {v1, v2}, Lcom/google/android/gms/internal/play_billing/S2;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_12
    move/from16 v28, v11

    move-object/from16 v1, v29

    const/16 v11, -0x10

    if-ge v12, v11, :cond_14

    add-int/lit8 v11, v4, -0x1

    if-ge v9, v11, :cond_13

    const/4 v11, 0x1

    add-int/lit8 v17, v8, 0x1

    const/4 v11, 0x2

    add-int/lit8 v18, v2, 0x2

    aget-byte v9, v15, v9

    const/4 v11, 0x3

    add-int/2addr v2, v11

    aget-byte v11, v15, v18

    invoke-static {v12, v9, v11, v3, v8}, Lcom/google/android/gms/internal/play_billing/H3;->b(BBB[CI)V

    move-object/from16 v29, v1

    move/from16 v8, v17

    :goto_10
    move/from16 v11, v28

    goto :goto_f

    :cond_13
    new-instance v2, Lcom/google/android/gms/internal/play_billing/S2;

    invoke-direct {v2, v1}, Lcom/google/android/gms/internal/play_billing/S2;-><init>(Ljava/lang/String;)V

    throw v2

    :cond_14
    add-int/lit8 v11, v4, -0x2

    if-ge v9, v11, :cond_15

    const/4 v11, 0x2

    add-int/lit8 v17, v2, 0x2

    aget-byte v35, v15, v9

    const/4 v9, 0x3

    add-int/lit8 v11, v2, 0x3

    aget-byte v36, v15, v17

    add-int/lit8 v2, v2, 0x4

    aget-byte v37, v15, v11

    move/from16 v34, v12

    move-object/from16 v38, v3

    move/from16 v39, v8

    invoke-static/range {v34 .. v39}, Lcom/google/android/gms/internal/play_billing/H3;->a(BBBB[CI)V

    const/4 v9, 0x2

    add-int/2addr v8, v9

    move-object/from16 v29, v1

    goto :goto_10

    :cond_15
    new-instance v2, Lcom/google/android/gms/internal/play_billing/S2;

    invoke-direct {v2, v1}, Lcom/google/android/gms/internal/play_billing/S2;-><init>(Ljava/lang/String;)V

    throw v2

    :cond_16
    move/from16 p3, v1

    move/from16 v28, v11

    new-instance v1, Ljava/lang/String;

    const/4 v11, 0x0

    invoke-direct {v1, v3, v11, v8}, Ljava/lang/String;-><init>([CII)V

    iput-object v1, v10, Lcom/google/android/gms/internal/play_billing/c2;->c:Ljava/lang/Object;

    move v2, v4

    :goto_11
    move/from16 v17, p3

    move v8, v2

    const/4 v9, 0x3

    goto :goto_13

    :cond_17
    const/4 v11, 0x0

    new-instance v1, Ljava/lang/ArrayIndexOutOfBoundsException;

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v9, 0x3

    new-array v5, v9, [Ljava/lang/Object;

    aput-object v4, v5, v11

    const/4 v4, 0x1

    aput-object v2, v5, v4

    const/4 v2, 0x2

    aput-object v3, v5, v2

    const-string v2, "buffer length=%d, index=%d, size=%d"

    invoke-static {v2, v5}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_18
    new-instance v1, Lcom/google/android/gms/internal/play_billing/S2;

    move-object/from16 v2, v30

    invoke-direct {v1, v2}, Lcom/google/android/gms/internal/play_billing/S2;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_19
    move/from16 v28, v11

    move-object/from16 v8, v21

    move-object/from16 v2, v30

    const/4 v9, 0x3

    const/4 v11, 0x0

    invoke-static {v15, v4, v10}, Lcom/google/android/gms/internal/play_billing/e2;->h([BILcom/google/android/gms/internal/play_billing/c2;)I

    move-result v1

    iget v3, v10, Lcom/google/android/gms/internal/play_billing/c2;->a:I

    if-ltz v3, :cond_1b

    or-int v2, v17, v12

    if-nez v3, :cond_1a

    iput-object v8, v10, Lcom/google/android/gms/internal/play_billing/c2;->c:Ljava/lang/Object;

    :goto_12
    move v8, v1

    move/from16 v17, v2

    goto :goto_13

    :cond_1a
    new-instance v4, Ljava/lang/String;

    sget-object v8, Lcom/google/android/gms/internal/play_billing/Q2;->a:Ljava/nio/charset/Charset;

    invoke-direct {v4, v15, v1, v3, v8}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    iput-object v4, v10, Lcom/google/android/gms/internal/play_billing/c2;->c:Ljava/lang/Object;

    add-int/2addr v1, v3

    goto :goto_12

    :goto_13
    iget-object v1, v10, Lcom/google/android/gms/internal/play_billing/c2;->c:Ljava/lang/Object;

    invoke-virtual {v13, v7, v5, v6, v1}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    move/from16 v5, p4

    move/from16 v6, p5

    move v4, v9

    move-object v3, v10

    move v10, v14

    :goto_14
    move/from16 v12, v22

    move/from16 v18, v28

    move/from16 v9, v33

    const/4 v1, 0x1

    :goto_15
    move-object v14, v13

    move v13, v11

    goto/16 :goto_0

    :cond_1b
    new-instance v1, Lcom/google/android/gms/internal/play_billing/S2;

    invoke-direct {v1, v2}, Lcom/google/android/gms/internal/play_billing/S2;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1c
    move/from16 v28, v11

    const/4 v11, 0x0

    const/4 v3, 0x1

    goto/16 :goto_a

    :pswitch_6
    move v4, v2

    move/from16 v33, v11

    move-object v13, v14

    move-wide/from16 v5, v31

    const/4 v11, 0x0

    const/16 v21, 0x3

    const/16 v22, -0x1

    move v14, v10

    move-object v10, v3

    if-nez v9, :cond_1e

    or-int v17, v17, v12

    invoke-static {v15, v4, v10}, Lcom/google/android/gms/internal/play_billing/e2;->k([BILcom/google/android/gms/internal/play_billing/c2;)I

    move-result v8

    iget-wide v1, v10, Lcom/google/android/gms/internal/play_billing/c2;->b:J

    cmp-long v1, v1, v26

    if-eqz v1, :cond_1d

    const/4 v1, 0x1

    goto :goto_16

    :cond_1d
    move v1, v11

    :goto_16
    invoke-static {v7, v5, v6, v1}, Lcom/google/android/gms/internal/play_billing/G3;->r(Ljava/lang/Object;JZ)V

    :goto_17
    move/from16 v5, p4

    move/from16 v6, p5

    move-object v3, v10

    move v10, v14

    move/from16 v4, v21

    goto :goto_14

    :cond_1e
    const/4 v3, 0x1

    goto/16 :goto_1a

    :pswitch_7
    move v4, v2

    move/from16 v33, v11

    move-object v13, v14

    move-wide/from16 v5, v31

    const/4 v1, 0x5

    const/4 v11, 0x0

    const/16 v21, 0x3

    const/16 v22, -0x1

    move v14, v10

    move-object v10, v3

    if-ne v9, v1, :cond_1e

    add-int/lit8 v8, v4, 0x4

    or-int v17, v17, v12

    invoke-static {v15, v4}, Lcom/google/android/gms/internal/play_billing/e2;->b([BI)I

    move-result v1

    :goto_18
    invoke-virtual {v13, v7, v5, v6, v1}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    goto :goto_17

    :pswitch_8
    move v4, v2

    move/from16 v33, v11

    move-object v13, v14

    move/from16 v1, v25

    move-wide/from16 v5, v31

    const/4 v11, 0x0

    const/16 v21, 0x3

    const/16 v22, -0x1

    move v14, v10

    move-object v10, v3

    if-ne v9, v1, :cond_1f

    add-int/lit8 v8, v4, 0x8

    or-int v17, v17, v12

    invoke-static {v15, v4}, Lcom/google/android/gms/internal/play_billing/e2;->n([BI)J

    move-result-wide v18

    move-object v1, v13

    move-object/from16 v2, p1

    :goto_19
    move-wide v3, v5

    move-wide/from16 v5, v18

    invoke-virtual/range {v1 .. v6}, Lsun/misc/Unsafe;->putLong(Ljava/lang/Object;JJ)V

    goto :goto_17

    :cond_1f
    move v3, v1

    goto/16 :goto_1a

    :pswitch_9
    move v4, v2

    move/from16 v33, v11

    move-object v13, v14

    move-wide/from16 v5, v31

    const/4 v11, 0x0

    const/16 v21, 0x3

    const/16 v22, -0x1

    move v14, v10

    move-object v10, v3

    if-nez v9, :cond_1e

    or-int v17, v17, v12

    invoke-static {v15, v4, v10}, Lcom/google/android/gms/internal/play_billing/e2;->h([BILcom/google/android/gms/internal/play_billing/c2;)I

    move-result v8

    iget v1, v10, Lcom/google/android/gms/internal/play_billing/c2;->a:I

    goto :goto_18

    :pswitch_a
    move v4, v2

    move/from16 v33, v11

    move-object v13, v14

    move-wide/from16 v5, v31

    const/4 v11, 0x0

    const/16 v21, 0x3

    const/16 v22, -0x1

    move v14, v10

    move-object v10, v3

    if-nez v9, :cond_1e

    or-int v17, v17, v12

    invoke-static {v15, v4, v10}, Lcom/google/android/gms/internal/play_billing/e2;->k([BILcom/google/android/gms/internal/play_billing/c2;)I

    move-result v8

    iget-wide v3, v10, Lcom/google/android/gms/internal/play_billing/c2;->b:J

    move-object v1, v13

    move-object/from16 v2, p1

    move-wide/from16 v18, v3

    goto :goto_19

    :pswitch_b
    move v4, v2

    move/from16 v33, v11

    move-object v13, v14

    move-wide/from16 v5, v31

    const/4 v1, 0x5

    const/4 v11, 0x0

    const/16 v21, 0x3

    const/16 v22, -0x1

    move v14, v10

    move-object v10, v3

    if-ne v9, v1, :cond_1e

    add-int/lit8 v8, v4, 0x4

    or-int v17, v17, v12

    invoke-static {v15, v4}, Lcom/google/android/gms/internal/play_billing/e2;->b([BI)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v1

    invoke-static {v7, v5, v6, v1}, Lcom/google/android/gms/internal/play_billing/G3;->u(Ljava/lang/Object;JF)V

    goto/16 :goto_17

    :pswitch_c
    move v4, v2

    move/from16 v33, v11

    move-object v13, v14

    move-wide/from16 v5, v31

    const/4 v11, 0x0

    const/16 v21, 0x3

    const/16 v22, -0x1

    move v14, v10

    move-object v10, v3

    move/from16 v3, v25

    if-ne v9, v3, :cond_20

    add-int/lit8 v8, v4, 0x8

    or-int v17, v17, v12

    invoke-static {v15, v4}, Lcom/google/android/gms/internal/play_billing/e2;->n([BI)J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Double;->longBitsToDouble(J)D

    move-result-wide v1

    invoke-static {v7, v5, v6, v1, v2}, Lcom/google/android/gms/internal/play_billing/G3;->t(Ljava/lang/Object;JD)V

    move/from16 v5, p4

    move/from16 v6, p5

    move v1, v3

    move-object v3, v10

    move v10, v14

    move/from16 v4, v21

    move/from16 v12, v22

    move/from16 v18, v28

    move/from16 v9, v33

    goto/16 :goto_15

    :cond_20
    :goto_1a
    move/from16 v0, p5

    move v3, v4

    move/from16 v20, v11

    move-object/from16 v41, v13

    move-object v12, v15

    move/from16 v23, v21

    move/from16 v4, v28

    move/from16 v11, v33

    move-object v13, v10

    move v10, v14

    goto/16 :goto_49

    :cond_21
    move/from16 v23, v2

    move/from16 v33, v11

    move/from16 p3, v13

    move-object v13, v14

    move-object/from16 v1, v29

    move-object/from16 v2, v30

    const/16 v21, 0x3

    const/16 v22, -0x1

    move v14, v10

    move-object v10, v3

    move-object v3, v8

    move/from16 v8, v16

    move/from16 v16, v17

    const/16 v11, 0x1b

    if-ne v4, v11, :cond_25

    const/4 v11, 0x2

    if-ne v9, v11, :cond_24

    invoke-virtual {v13, v7, v5, v6}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/play_billing/P2;

    invoke-interface {v1}, Lcom/google/android/gms/internal/play_billing/P2;->c()Z

    move-result v2

    if-nez v2, :cond_23

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    if-nez v2, :cond_22

    const/16 v2, 0xa

    goto :goto_1b

    :cond_22
    add-int/2addr v2, v2

    :goto_1b
    invoke-interface {v1, v2}, Lcom/google/android/gms/internal/play_billing/P2;->m(I)Lcom/google/android/gms/internal/play_billing/P2;

    move-result-object v1

    invoke-virtual {v13, v7, v5, v6, v1}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    :cond_23
    invoke-direct {v0, v14}, Lcom/google/android/gms/internal/play_billing/l3;->K(I)Lcom/google/android/gms/internal/play_billing/t3;

    move-result-object v2

    move/from16 v17, v8

    move-object v8, v2

    move/from16 v9, v28

    move-object v2, v10

    move-object/from16 v10, p2

    move v4, v11

    move/from16 v5, v21

    move/from16 v3, v28

    const/16 v20, 0x0

    move/from16 v11, v23

    move/from16 v12, p4

    move-object v6, v13

    move-object v13, v1

    move v1, v14

    move-object/from16 v14, p6

    invoke-static/range {v8 .. v14}, Lcom/google/android/gms/internal/play_billing/e2;->e(Lcom/google/android/gms/internal/play_billing/t3;I[BIILcom/google/android/gms/internal/play_billing/P2;Lcom/google/android/gms/internal/play_billing/c2;)I

    move-result v8

    move v10, v1

    move/from16 v18, v3

    move v4, v5

    move-object v14, v6

    move/from16 v13, v20

    move/from16 v12, v22

    move/from16 v9, v33

    const/4 v1, 0x1

    move/from16 v5, p4

    move/from16 v6, p5

    move-object v3, v2

    :goto_1c
    move/from16 v43, v17

    move/from16 v17, v16

    move/from16 v16, v43

    goto/16 :goto_0

    :cond_24
    move/from16 v17, v8

    move-object v2, v10

    const/16 v20, 0x0

    move-object v10, v0

    move v2, v11

    move-object/from16 v41, v13

    move v11, v14

    move/from16 v13, v23

    move/from16 v3, v28

    move/from16 v42, v33

    move/from16 v0, p4

    goto/16 :goto_3b

    :cond_25
    move/from16 v17, v8

    move/from16 v11, v28

    const/16 v20, 0x0

    move/from16 v43, v14

    move-object v14, v10

    move/from16 v10, v43

    const/16 v8, 0x31

    if-gt v4, v8, :cond_6b

    move/from16 v8, p3

    move-object/from16 p3, v13

    int-to-long v12, v8

    sget-object v8, Lcom/google/android/gms/internal/play_billing/l3;->m:Lsun/misc/Unsafe;

    invoke-virtual {v8, v7, v5, v6}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v18

    move-object/from16 v29, v1

    move-object/from16 v1, v18

    check-cast v1, Lcom/google/android/gms/internal/play_billing/P2;

    invoke-interface {v1}, Lcom/google/android/gms/internal/play_billing/P2;->c()Z

    move-result v18

    if-nez v18, :cond_26

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v18

    move-object/from16 v24, v3

    add-int v3, v18, v18

    invoke-interface {v1, v3}, Lcom/google/android/gms/internal/play_billing/P2;->m(I)Lcom/google/android/gms/internal/play_billing/P2;

    move-result-object v1

    invoke-virtual {v8, v7, v5, v6, v1}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    :goto_1d
    move-object v8, v1

    goto :goto_1e

    :cond_26
    move-object/from16 v24, v3

    goto :goto_1d

    :goto_1e
    const-string v1, "While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length."

    packed-switch v4, :pswitch_data_1

    const/4 v6, 0x3

    if-ne v9, v6, :cond_28

    and-int/lit8 v1, v11, -0x8

    or-int/lit8 v9, v1, 0x4

    invoke-direct {v0, v10}, Lcom/google/android/gms/internal/play_billing/l3;->K(I)Lcom/google/android/gms/internal/play_billing/t3;

    move-result-object v12

    move-object v1, v12

    move-object/from16 v2, p2

    move/from16 v3, v23

    move/from16 v4, p4

    move v5, v9

    move v13, v6

    move-object/from16 v6, p6

    invoke-static/range {v1 .. v6}, Lcom/google/android/gms/internal/play_billing/e2;->c(Lcom/google/android/gms/internal/play_billing/t3;[BIIILcom/google/android/gms/internal/play_billing/c2;)I

    move-result v1

    iget-object v2, v14, Lcom/google/android/gms/internal/play_billing/c2;->c:Ljava/lang/Object;

    invoke-interface {v8, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    move/from16 v6, p4

    :goto_1f
    if-ge v1, v6, :cond_27

    invoke-static {v15, v1, v14}, Lcom/google/android/gms/internal/play_billing/e2;->h([BILcom/google/android/gms/internal/play_billing/c2;)I

    move-result v3

    iget v2, v14, Lcom/google/android/gms/internal/play_billing/c2;->a:I

    if-ne v11, v2, :cond_27

    move-object v1, v12

    move-object/from16 v2, p2

    move/from16 v4, p4

    move v5, v9

    move v13, v6

    move-object/from16 v6, p6

    invoke-static/range {v1 .. v6}, Lcom/google/android/gms/internal/play_billing/e2;->c(Lcom/google/android/gms/internal/play_billing/t3;[BIIILcom/google/android/gms/internal/play_billing/c2;)I

    move-result v1

    iget-object v2, v14, Lcom/google/android/gms/internal/play_billing/c2;->c:Ljava/lang/Object;

    invoke-interface {v8, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    move v6, v13

    const/4 v13, 0x3

    goto :goto_1f

    :cond_27
    move v13, v6

    move-object/from16 v41, p3

    move v3, v11

    move v12, v13

    move/from16 v13, v23

    const/4 v2, 0x2

    const/4 v8, 0x1

    move v11, v10

    move-object v10, v0

    goto/16 :goto_39

    :cond_28
    move-object/from16 v41, p3

    move/from16 v12, p4

    move v3, v11

    move/from16 v13, v23

    const/4 v2, 0x2

    const/4 v8, 0x1

    move v11, v10

    move-object v10, v0

    goto/16 :goto_38

    :pswitch_d
    move/from16 v13, p4

    const/4 v2, 0x2

    if-ne v9, v2, :cond_2b

    sget v2, Lcom/google/android/gms/internal/play_billing/e2;->b:I

    invoke-static {v8}, Landroidx/appcompat/app/D;->a(Ljava/lang/Object;)V

    move/from16 v12, v23

    invoke-static {v15, v12, v14}, Lcom/google/android/gms/internal/play_billing/e2;->h([BILcom/google/android/gms/internal/play_billing/c2;)I

    move-result v2

    iget v3, v14, Lcom/google/android/gms/internal/play_billing/c2;->a:I

    add-int/2addr v3, v2

    if-lt v2, v3, :cond_2a

    if-ne v2, v3, :cond_29

    :goto_20
    move-object/from16 v41, p3

    move v1, v2

    :goto_21
    move v3, v11

    const/4 v2, 0x2

    const/4 v8, 0x1

    move v11, v10

    move-object v10, v0

    :goto_22
    move/from16 v43, v13

    move v13, v12

    move/from16 v12, v43

    goto/16 :goto_39

    :cond_29
    new-instance v2, Lcom/google/android/gms/internal/play_billing/S2;

    invoke-direct {v2, v1}, Lcom/google/android/gms/internal/play_billing/S2;-><init>(Ljava/lang/String;)V

    throw v2

    :cond_2a
    invoke-static {v15, v2, v14}, Lcom/google/android/gms/internal/play_billing/e2;->k([BILcom/google/android/gms/internal/play_billing/c2;)I

    iget-wide v1, v14, Lcom/google/android/gms/internal/play_billing/c2;->b:J

    invoke-static {v1, v2}, Lcom/google/android/gms/internal/play_billing/r2;->b(J)J

    throw v19

    :cond_2b
    move/from16 v12, v23

    if-eqz v9, :cond_2d

    :cond_2c
    move-object/from16 v41, p3

    move v3, v11

    const/4 v2, 0x2

    const/4 v8, 0x1

    move v11, v10

    move-object v10, v0

    :goto_23
    move/from16 v43, v13

    move v13, v12

    move/from16 v12, v43

    goto/16 :goto_38

    :cond_2d
    sget v1, Lcom/google/android/gms/internal/play_billing/e2;->b:I

    invoke-static {v8}, Landroidx/appcompat/app/D;->a(Ljava/lang/Object;)V

    invoke-static {v15, v12, v14}, Lcom/google/android/gms/internal/play_billing/e2;->k([BILcom/google/android/gms/internal/play_billing/c2;)I

    iget-wide v1, v14, Lcom/google/android/gms/internal/play_billing/c2;->b:J

    invoke-static {v1, v2}, Lcom/google/android/gms/internal/play_billing/r2;->b(J)J

    throw v19

    :pswitch_e
    move/from16 v13, p4

    move/from16 v12, v23

    const/4 v2, 0x2

    if-ne v9, v2, :cond_30

    sget v2, Lcom/google/android/gms/internal/play_billing/e2;->b:I

    check-cast v8, Lcom/google/android/gms/internal/play_billing/M2;

    invoke-static {v15, v12, v14}, Lcom/google/android/gms/internal/play_billing/e2;->h([BILcom/google/android/gms/internal/play_billing/c2;)I

    move-result v2

    iget v3, v14, Lcom/google/android/gms/internal/play_billing/c2;->a:I

    add-int/2addr v3, v2

    :goto_24
    if-ge v2, v3, :cond_2e

    invoke-static {v15, v2, v14}, Lcom/google/android/gms/internal/play_billing/e2;->h([BILcom/google/android/gms/internal/play_billing/c2;)I

    move-result v2

    iget v4, v14, Lcom/google/android/gms/internal/play_billing/c2;->a:I

    invoke-static {v4}, Lcom/google/android/gms/internal/play_billing/r2;->a(I)I

    move-result v4

    invoke-virtual {v8, v4}, Lcom/google/android/gms/internal/play_billing/M2;->g(I)V

    goto :goto_24

    :cond_2e
    if-ne v2, v3, :cond_2f

    goto :goto_20

    :cond_2f
    new-instance v2, Lcom/google/android/gms/internal/play_billing/S2;

    invoke-direct {v2, v1}, Lcom/google/android/gms/internal/play_billing/S2;-><init>(Ljava/lang/String;)V

    throw v2

    :cond_30
    if-nez v9, :cond_2c

    sget v1, Lcom/google/android/gms/internal/play_billing/e2;->b:I

    check-cast v8, Lcom/google/android/gms/internal/play_billing/M2;

    invoke-static {v15, v12, v14}, Lcom/google/android/gms/internal/play_billing/e2;->h([BILcom/google/android/gms/internal/play_billing/c2;)I

    move-result v1

    :goto_25
    iget v2, v14, Lcom/google/android/gms/internal/play_billing/c2;->a:I

    invoke-static {v2}, Lcom/google/android/gms/internal/play_billing/r2;->a(I)I

    move-result v2

    invoke-virtual {v8, v2}, Lcom/google/android/gms/internal/play_billing/M2;->g(I)V

    if-ge v1, v13, :cond_31

    invoke-static {v15, v1, v14}, Lcom/google/android/gms/internal/play_billing/e2;->h([BILcom/google/android/gms/internal/play_billing/c2;)I

    move-result v2

    iget v3, v14, Lcom/google/android/gms/internal/play_billing/c2;->a:I

    if-ne v11, v3, :cond_31

    invoke-static {v15, v2, v14}, Lcom/google/android/gms/internal/play_billing/e2;->h([BILcom/google/android/gms/internal/play_billing/c2;)I

    move-result v1

    goto :goto_25

    :cond_31
    move-object/from16 v41, p3

    goto/16 :goto_21

    :pswitch_f
    move/from16 v13, p4

    move/from16 v12, v23

    const/4 v1, 0x2

    if-ne v9, v1, :cond_32

    invoke-static {v15, v12, v8, v14}, Lcom/google/android/gms/internal/play_billing/e2;->f([BILcom/google/android/gms/internal/play_billing/P2;Lcom/google/android/gms/internal/play_billing/c2;)I

    move-result v1

    goto :goto_26

    :cond_32
    if-nez v9, :cond_3a

    move v1, v11

    move-object/from16 v2, p2

    move v3, v12

    move/from16 v4, p4

    move-object v5, v8

    move-object/from16 v6, p6

    invoke-static/range {v1 .. v6}, Lcom/google/android/gms/internal/play_billing/e2;->j(I[BIILcom/google/android/gms/internal/play_billing/P2;Lcom/google/android/gms/internal/play_billing/c2;)I

    move-result v1

    :goto_26
    invoke-direct {v0, v10}, Lcom/google/android/gms/internal/play_billing/l3;->J(I)Lcom/google/android/gms/internal/play_billing/N2;

    move-result-object v2

    iget-object v3, v0, Lcom/google/android/gms/internal/play_billing/l3;->j:Lcom/google/android/gms/internal/play_billing/z3;

    sget v4, Lcom/google/android/gms/internal/play_billing/v3;->b:I

    if-eqz v2, :cond_38

    instance-of v4, v8, Ljava/util/RandomAccess;

    if-eqz v4, :cond_36

    invoke-interface {v8}, Ljava/util/List;->size()I

    move-result v4

    move-object/from16 v9, v19

    move/from16 v5, v20

    move v6, v5

    :goto_27
    if-ge v5, v4, :cond_35

    invoke-interface {v8, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v18

    move/from16 v23, v1

    move-object/from16 v1, v18

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-interface {v2, v0}, Lcom/google/android/gms/internal/play_billing/N2;->r(I)Z

    move-result v18

    if-eqz v18, :cond_34

    if-eq v5, v6, :cond_33

    invoke-interface {v8, v6, v1}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    :cond_33
    const/4 v1, 0x1

    add-int/2addr v6, v1

    move v0, v1

    move/from16 v1, v33

    goto :goto_28

    :cond_34
    move/from16 v1, v33

    invoke-static {v7, v1, v0, v9, v3}, Lcom/google/android/gms/internal/play_billing/v3;->s(Ljava/lang/Object;IILjava/lang/Object;Lcom/google/android/gms/internal/play_billing/z3;)Ljava/lang/Object;

    move-result-object v9

    const/4 v0, 0x1

    :goto_28
    add-int/2addr v5, v0

    move-object/from16 v0, p0

    move/from16 v33, v1

    move/from16 v1, v23

    goto :goto_27

    :cond_35
    move/from16 v23, v1

    move/from16 v1, v33

    const/4 v0, 0x1

    if-eq v6, v4, :cond_39

    invoke-interface {v8, v6, v4}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->clear()V

    goto :goto_2a

    :cond_36
    move/from16 v23, v1

    move/from16 v1, v33

    const/4 v0, 0x1

    invoke-interface {v8}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    move-object/from16 v5, v19

    :cond_37
    :goto_29
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_39

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Integer;

    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    move-result v6

    invoke-interface {v2, v6}, Lcom/google/android/gms/internal/play_billing/N2;->r(I)Z

    move-result v8

    if-nez v8, :cond_37

    invoke-static {v7, v1, v6, v5, v3}, Lcom/google/android/gms/internal/play_billing/v3;->s(Ljava/lang/Object;IILjava/lang/Object;Lcom/google/android/gms/internal/play_billing/z3;)Ljava/lang/Object;

    move-result-object v5

    invoke-interface {v4}, Ljava/util/Iterator;->remove()V

    goto :goto_29

    :cond_38
    move/from16 v23, v1

    move/from16 v1, v33

    const/4 v0, 0x1

    :cond_39
    :goto_2a
    move-object/from16 v41, p3

    move v8, v0

    move/from16 v33, v1

    move v3, v11

    move/from16 v1, v23

    :goto_2b
    const/4 v2, 0x2

    move v11, v10

    move-object/from16 v10, p0

    goto/16 :goto_22

    :cond_3a
    move-object/from16 v41, p3

    move v3, v11

    const/4 v2, 0x2

    const/4 v8, 0x1

    :goto_2c
    move v11, v10

    move-object/from16 v10, p0

    goto/16 :goto_23

    :pswitch_10
    move/from16 v13, p4

    move-object v0, v1

    move/from16 v12, v23

    move/from16 v1, v33

    const/4 v3, 0x2

    const/4 v6, 0x1

    if-ne v9, v3, :cond_41

    invoke-static {v15, v12, v14}, Lcom/google/android/gms/internal/play_billing/e2;->h([BILcom/google/android/gms/internal/play_billing/c2;)I

    move-result v3

    iget v4, v14, Lcom/google/android/gms/internal/play_billing/c2;->a:I

    if-ltz v4, :cond_40

    array-length v5, v15

    sub-int/2addr v5, v3

    if-gt v4, v5, :cond_3f

    if-nez v4, :cond_3b

    :goto_2d
    sget-object v4, Lcom/google/android/gms/internal/play_billing/o2;->D:Lcom/google/android/gms/internal/play_billing/o2;

    invoke-interface {v8, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_2e

    :cond_3b
    invoke-static {v15, v3, v4}, Lcom/google/android/gms/internal/play_billing/o2;->C([BII)Lcom/google/android/gms/internal/play_billing/o2;

    move-result-object v5

    invoke-interface {v8, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/2addr v3, v4

    :goto_2e
    if-ge v3, v13, :cond_3e

    invoke-static {v15, v3, v14}, Lcom/google/android/gms/internal/play_billing/e2;->h([BILcom/google/android/gms/internal/play_billing/c2;)I

    move-result v4

    iget v5, v14, Lcom/google/android/gms/internal/play_billing/c2;->a:I

    if-ne v11, v5, :cond_3e

    invoke-static {v15, v4, v14}, Lcom/google/android/gms/internal/play_billing/e2;->h([BILcom/google/android/gms/internal/play_billing/c2;)I

    move-result v3

    iget v4, v14, Lcom/google/android/gms/internal/play_billing/c2;->a:I

    if-ltz v4, :cond_3d

    array-length v5, v15

    sub-int/2addr v5, v3

    if-gt v4, v5, :cond_3c

    if-nez v4, :cond_3b

    goto :goto_2d

    :cond_3c
    new-instance v1, Lcom/google/android/gms/internal/play_billing/S2;

    invoke-direct {v1, v0}, Lcom/google/android/gms/internal/play_billing/S2;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_3d
    new-instance v0, Lcom/google/android/gms/internal/play_billing/S2;

    invoke-direct {v0, v2}, Lcom/google/android/gms/internal/play_billing/S2;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3e
    move-object/from16 v41, p3

    move/from16 v33, v1

    move v1, v3

    move v8, v6

    move v3, v11

    goto :goto_2b

    :cond_3f
    new-instance v1, Lcom/google/android/gms/internal/play_billing/S2;

    invoke-direct {v1, v0}, Lcom/google/android/gms/internal/play_billing/S2;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_40
    new-instance v0, Lcom/google/android/gms/internal/play_billing/S2;

    invoke-direct {v0, v2}, Lcom/google/android/gms/internal/play_billing/S2;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_41
    move-object/from16 v41, p3

    move/from16 v33, v1

    move v2, v3

    move v8, v6

    move v3, v11

    goto :goto_2c

    :pswitch_11
    move/from16 v13, p4

    move/from16 v12, v23

    move/from16 v1, v33

    const/4 v0, 0x2

    const/4 v6, 0x1

    if-ne v9, v0, :cond_42

    move-object/from16 v5, p0

    invoke-direct {v5, v10}, Lcom/google/android/gms/internal/play_billing/l3;->K(I)Lcom/google/android/gms/internal/play_billing/t3;

    move-result-object v2

    move v3, v0

    move-object v4, v8

    const/4 v0, 0x3

    move-object v8, v2

    move v9, v11

    move v2, v10

    move-object/from16 v10, p2

    move v6, v11

    move v11, v12

    move/from16 v40, v12

    move/from16 v12, p4

    move-object/from16 v41, p3

    move-object v13, v4

    move-object v4, v14

    move-object/from16 v14, p6

    invoke-static/range {v8 .. v14}, Lcom/google/android/gms/internal/play_billing/e2;->e(Lcom/google/android/gms/internal/play_billing/t3;I[BIILcom/google/android/gms/internal/play_billing/P2;Lcom/google/android/gms/internal/play_billing/c2;)I

    move-result v8

    move/from16 v33, v1

    move v11, v2

    move v2, v3

    move-object v14, v4

    move-object v10, v5

    move v3, v6

    move v1, v8

    move/from16 v13, v40

    :goto_2f
    const/4 v8, 0x1

    goto/16 :goto_39

    :cond_42
    move-object/from16 v41, p3

    move v3, v0

    move/from16 v33, v1

    move v2, v3

    move v8, v6

    move v3, v11

    move v13, v12

    move/from16 v12, p4

    move v11, v10

    move-object/from16 v10, p0

    goto/16 :goto_38

    :pswitch_12
    move-object/from16 v41, p3

    move-object v5, v0

    move-object v4, v8

    move v6, v11

    move/from16 v40, v23

    move/from16 v1, v33

    const/4 v0, 0x3

    const/4 v3, 0x2

    move v11, v10

    if-ne v9, v3, :cond_50

    const-wide/32 v8, 0x20000000

    and-long/2addr v8, v12

    cmp-long v8, v8, v26

    if-nez v8, :cond_48

    move/from16 v13, v40

    invoke-static {v15, v13, v14}, Lcom/google/android/gms/internal/play_billing/e2;->h([BILcom/google/android/gms/internal/play_billing/c2;)I

    move-result v8

    iget v9, v14, Lcom/google/android/gms/internal/play_billing/c2;->a:I

    if-ltz v9, :cond_47

    move-object/from16 v10, v24

    if-nez v9, :cond_43

    invoke-interface {v4, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_30
    move/from16 v12, p4

    goto :goto_31

    :cond_43
    new-instance v12, Ljava/lang/String;

    sget-object v0, Lcom/google/android/gms/internal/play_billing/Q2;->a:Ljava/nio/charset/Charset;

    invoke-direct {v12, v15, v8, v9, v0}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    invoke-interface {v4, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/2addr v8, v9

    goto :goto_30

    :goto_31
    if-ge v8, v12, :cond_46

    invoke-static {v15, v8, v14}, Lcom/google/android/gms/internal/play_billing/e2;->h([BILcom/google/android/gms/internal/play_billing/c2;)I

    move-result v0

    iget v9, v14, Lcom/google/android/gms/internal/play_billing/c2;->a:I

    if-ne v6, v9, :cond_46

    invoke-static {v15, v0, v14}, Lcom/google/android/gms/internal/play_billing/e2;->h([BILcom/google/android/gms/internal/play_billing/c2;)I

    move-result v8

    iget v0, v14, Lcom/google/android/gms/internal/play_billing/c2;->a:I

    if-ltz v0, :cond_45

    if-nez v0, :cond_44

    invoke-interface {v4, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_31

    :cond_44
    new-instance v9, Ljava/lang/String;

    sget-object v3, Lcom/google/android/gms/internal/play_billing/Q2;->a:Ljava/nio/charset/Charset;

    invoke-direct {v9, v15, v8, v0, v3}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    invoke-interface {v4, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/2addr v8, v0

    const/4 v3, 0x2

    goto :goto_31

    :cond_45
    new-instance v0, Lcom/google/android/gms/internal/play_billing/S2;

    invoke-direct {v0, v2}, Lcom/google/android/gms/internal/play_billing/S2;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_46
    move/from16 v33, v1

    move-object v10, v5

    move v3, v6

    move v1, v8

    :goto_32
    const/4 v2, 0x2

    goto :goto_2f

    :cond_47
    new-instance v0, Lcom/google/android/gms/internal/play_billing/S2;

    invoke-direct {v0, v2}, Lcom/google/android/gms/internal/play_billing/S2;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_48
    move/from16 v12, p4

    move-object/from16 v10, v24

    move/from16 v13, v40

    invoke-static {v15, v13, v14}, Lcom/google/android/gms/internal/play_billing/e2;->h([BILcom/google/android/gms/internal/play_billing/c2;)I

    move-result v0

    iget v3, v14, Lcom/google/android/gms/internal/play_billing/c2;->a:I

    if-ltz v3, :cond_4f

    if-nez v3, :cond_49

    invoke-interface {v4, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    move/from16 v33, v1

    goto :goto_33

    :cond_49
    add-int v8, v0, v3

    invoke-static {v15, v0, v8}, Lcom/google/android/gms/internal/play_billing/J3;->d([BII)Z

    move-result v9

    if-eqz v9, :cond_4e

    new-instance v9, Ljava/lang/String;

    move/from16 v33, v1

    sget-object v1, Lcom/google/android/gms/internal/play_billing/Q2;->a:Ljava/nio/charset/Charset;

    invoke-direct {v9, v15, v0, v3, v1}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    invoke-interface {v4, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    move v0, v8

    :goto_33
    if-ge v0, v12, :cond_4d

    invoke-static {v15, v0, v14}, Lcom/google/android/gms/internal/play_billing/e2;->h([BILcom/google/android/gms/internal/play_billing/c2;)I

    move-result v1

    iget v3, v14, Lcom/google/android/gms/internal/play_billing/c2;->a:I

    if-ne v6, v3, :cond_4d

    invoke-static {v15, v1, v14}, Lcom/google/android/gms/internal/play_billing/e2;->h([BILcom/google/android/gms/internal/play_billing/c2;)I

    move-result v0

    iget v1, v14, Lcom/google/android/gms/internal/play_billing/c2;->a:I

    if-ltz v1, :cond_4c

    if-nez v1, :cond_4a

    invoke-interface {v4, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_33

    :cond_4a
    add-int v3, v0, v1

    invoke-static {v15, v0, v3}, Lcom/google/android/gms/internal/play_billing/J3;->d([BII)Z

    move-result v8

    if-eqz v8, :cond_4b

    new-instance v8, Ljava/lang/String;

    sget-object v9, Lcom/google/android/gms/internal/play_billing/Q2;->a:Ljava/nio/charset/Charset;

    invoke-direct {v8, v15, v0, v1, v9}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    invoke-interface {v4, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    move v0, v3

    goto :goto_33

    :cond_4b
    new-instance v0, Lcom/google/android/gms/internal/play_billing/S2;

    move-object/from16 v1, v29

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/play_billing/S2;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_4c
    new-instance v0, Lcom/google/android/gms/internal/play_billing/S2;

    invoke-direct {v0, v2}, Lcom/google/android/gms/internal/play_billing/S2;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_4d
    move v1, v0

    :goto_34
    move-object v10, v5

    move v3, v6

    goto :goto_32

    :cond_4e
    move-object/from16 v1, v29

    new-instance v0, Lcom/google/android/gms/internal/play_billing/S2;

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/play_billing/S2;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_4f
    new-instance v0, Lcom/google/android/gms/internal/play_billing/S2;

    invoke-direct {v0, v2}, Lcom/google/android/gms/internal/play_billing/S2;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_50
    move/from16 v12, p4

    move/from16 v13, v40

    move/from16 v33, v1

    move v2, v3

    move-object v10, v5

    move v3, v6

    :goto_35
    const/4 v8, 0x1

    goto/16 :goto_38

    :pswitch_13
    move-object/from16 v41, p3

    move/from16 v12, p4

    move-object v5, v0

    move-object v0, v1

    move-object v4, v8

    move v6, v11

    move/from16 v13, v23

    const/4 v1, 0x2

    const/4 v8, 0x3

    move v11, v10

    if-ne v9, v1, :cond_53

    sget v1, Lcom/google/android/gms/internal/play_billing/e2;->b:I

    invoke-static {v4}, Landroidx/appcompat/app/D;->a(Ljava/lang/Object;)V

    invoke-static {v15, v13, v14}, Lcom/google/android/gms/internal/play_billing/e2;->h([BILcom/google/android/gms/internal/play_billing/c2;)I

    move-result v1

    iget v2, v14, Lcom/google/android/gms/internal/play_billing/c2;->a:I

    add-int/2addr v2, v1

    if-lt v1, v2, :cond_52

    if-ne v1, v2, :cond_51

    goto :goto_34

    :cond_51
    new-instance v1, Lcom/google/android/gms/internal/play_billing/S2;

    invoke-direct {v1, v0}, Lcom/google/android/gms/internal/play_billing/S2;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_52
    invoke-static {v15, v1, v14}, Lcom/google/android/gms/internal/play_billing/e2;->k([BILcom/google/android/gms/internal/play_billing/c2;)I

    throw v19

    :cond_53
    if-eqz v9, :cond_55

    :cond_54
    move-object v10, v5

    move v3, v6

    const/4 v2, 0x2

    goto :goto_35

    :cond_55
    sget v0, Lcom/google/android/gms/internal/play_billing/e2;->b:I

    invoke-static {v4}, Landroidx/appcompat/app/D;->a(Ljava/lang/Object;)V

    invoke-static {v15, v13, v14}, Lcom/google/android/gms/internal/play_billing/e2;->k([BILcom/google/android/gms/internal/play_billing/c2;)I

    iget-wide v0, v14, Lcom/google/android/gms/internal/play_billing/c2;->b:J

    throw v19

    :pswitch_14
    move-object/from16 v41, p3

    move/from16 v12, p4

    move-object v5, v0

    move-object v0, v1

    move-object v4, v8

    move v6, v11

    move/from16 v13, v23

    const/4 v1, 0x2

    const/4 v8, 0x3

    move v11, v10

    if-ne v9, v1, :cond_5a

    sget v1, Lcom/google/android/gms/internal/play_billing/e2;->b:I

    move-object v1, v4

    check-cast v1, Lcom/google/android/gms/internal/play_billing/M2;

    invoke-static {v15, v13, v14}, Lcom/google/android/gms/internal/play_billing/e2;->h([BILcom/google/android/gms/internal/play_billing/c2;)I

    move-result v2

    iget v3, v14, Lcom/google/android/gms/internal/play_billing/c2;->a:I

    add-int v4, v2, v3

    array-length v9, v15

    if-gt v4, v9, :cond_59

    invoke-virtual {v1}, Lcom/google/android/gms/internal/play_billing/M2;->size()I

    move-result v9

    div-int/lit8 v3, v3, 0x4

    add-int/2addr v9, v3

    invoke-virtual {v1, v9}, Lcom/google/android/gms/internal/play_billing/M2;->n(I)V

    :goto_36
    if-ge v2, v4, :cond_56

    invoke-static {v15, v2}, Lcom/google/android/gms/internal/play_billing/e2;->b([BI)I

    move-result v3

    invoke-virtual {v1, v3}, Lcom/google/android/gms/internal/play_billing/M2;->g(I)V

    add-int/lit8 v2, v2, 0x4

    goto :goto_36

    :cond_56
    if-ne v2, v4, :cond_58

    :cond_57
    move v1, v2

    goto/16 :goto_34

    :cond_58
    new-instance v1, Lcom/google/android/gms/internal/play_billing/S2;

    invoke-direct {v1, v0}, Lcom/google/android/gms/internal/play_billing/S2;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_59
    new-instance v1, Lcom/google/android/gms/internal/play_billing/S2;

    invoke-direct {v1, v0}, Lcom/google/android/gms/internal/play_billing/S2;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_5a
    const/4 v0, 0x5

    if-ne v9, v0, :cond_54

    add-int/lit8 v2, v13, 0x4

    sget v0, Lcom/google/android/gms/internal/play_billing/e2;->b:I

    move-object v0, v4

    check-cast v0, Lcom/google/android/gms/internal/play_billing/M2;

    invoke-static {v15, v13}, Lcom/google/android/gms/internal/play_billing/e2;->b([BI)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/play_billing/M2;->g(I)V

    :goto_37
    if-ge v2, v12, :cond_57

    invoke-static {v15, v2, v14}, Lcom/google/android/gms/internal/play_billing/e2;->h([BILcom/google/android/gms/internal/play_billing/c2;)I

    move-result v1

    iget v3, v14, Lcom/google/android/gms/internal/play_billing/c2;->a:I

    if-ne v6, v3, :cond_57

    invoke-static {v15, v1}, Lcom/google/android/gms/internal/play_billing/e2;->b([BI)I

    move-result v2

    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/play_billing/M2;->g(I)V

    add-int/lit8 v2, v1, 0x4

    goto :goto_37

    :pswitch_15
    move-object/from16 v41, p3

    move/from16 v12, p4

    move-object v5, v0

    move-object v0, v1

    move-object v4, v8

    move v6, v11

    move/from16 v13, v23

    const/4 v1, 0x2

    const/4 v8, 0x3

    move v11, v10

    if-ne v9, v1, :cond_5c

    sget v1, Lcom/google/android/gms/internal/play_billing/e2;->b:I

    invoke-static {v4}, Landroidx/appcompat/app/D;->a(Ljava/lang/Object;)V

    invoke-static {v15, v13, v14}, Lcom/google/android/gms/internal/play_billing/e2;->h([BILcom/google/android/gms/internal/play_billing/c2;)I

    move-result v1

    iget v2, v14, Lcom/google/android/gms/internal/play_billing/c2;->a:I

    add-int/2addr v1, v2

    array-length v2, v15

    if-le v1, v2, :cond_5b

    new-instance v1, Lcom/google/android/gms/internal/play_billing/S2;

    invoke-direct {v1, v0}, Lcom/google/android/gms/internal/play_billing/S2;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_5b
    throw v19

    :cond_5c
    const/4 v0, 0x1

    if-eq v9, v0, :cond_5d

    move v8, v0

    move-object v10, v5

    move v3, v6

    const/4 v2, 0x2

    goto/16 :goto_38

    :cond_5d
    sget v0, Lcom/google/android/gms/internal/play_billing/e2;->b:I

    invoke-static {v4}, Landroidx/appcompat/app/D;->a(Ljava/lang/Object;)V

    invoke-static {v15, v13}, Lcom/google/android/gms/internal/play_billing/e2;->n([BI)J

    throw v19

    :pswitch_16
    move-object/from16 v41, p3

    move/from16 v12, p4

    move-object v5, v0

    move-object v4, v8

    move v6, v11

    move/from16 v13, v23

    const/4 v0, 0x1

    const/4 v3, 0x2

    const/4 v8, 0x3

    move v11, v10

    if-ne v9, v3, :cond_5e

    invoke-static {v15, v13, v4, v14}, Lcom/google/android/gms/internal/play_billing/e2;->f([BILcom/google/android/gms/internal/play_billing/P2;Lcom/google/android/gms/internal/play_billing/c2;)I

    move-result v1

    move v8, v0

    move v2, v3

    move-object v10, v5

    move v3, v6

    goto/16 :goto_39

    :cond_5e
    if-nez v9, :cond_5f

    move/from16 v10, v33

    move v1, v6

    move-object/from16 v2, p2

    move v9, v3

    move v3, v13

    move-object/from16 v18, v4

    move/from16 v4, p4

    move-object v10, v5

    move-object/from16 v5, v18

    move v8, v0

    move v0, v6

    move-object/from16 v6, p6

    invoke-static/range {v1 .. v6}, Lcom/google/android/gms/internal/play_billing/e2;->j(I[BIILcom/google/android/gms/internal/play_billing/P2;Lcom/google/android/gms/internal/play_billing/c2;)I

    move-result v1

    move v3, v0

    move v2, v9

    goto/16 :goto_39

    :cond_5f
    move v8, v0

    move-object v10, v5

    move v2, v3

    move v3, v6

    goto/16 :goto_38

    :pswitch_17
    move-object/from16 v41, p3

    move/from16 v12, p4

    move-object/from16 v18, v8

    move v3, v11

    move/from16 v13, v23

    const/4 v2, 0x2

    const/4 v8, 0x1

    move v11, v10

    move-object v10, v0

    move-object v0, v1

    if-ne v9, v2, :cond_62

    sget v1, Lcom/google/android/gms/internal/play_billing/e2;->b:I

    invoke-static/range {v18 .. v18}, Landroidx/appcompat/app/D;->a(Ljava/lang/Object;)V

    invoke-static {v15, v13, v14}, Lcom/google/android/gms/internal/play_billing/e2;->h([BILcom/google/android/gms/internal/play_billing/c2;)I

    move-result v1

    iget v4, v14, Lcom/google/android/gms/internal/play_billing/c2;->a:I

    add-int/2addr v4, v1

    if-lt v1, v4, :cond_61

    if-ne v1, v4, :cond_60

    goto/16 :goto_39

    :cond_60
    new-instance v1, Lcom/google/android/gms/internal/play_billing/S2;

    invoke-direct {v1, v0}, Lcom/google/android/gms/internal/play_billing/S2;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_61
    invoke-static {v15, v1, v14}, Lcom/google/android/gms/internal/play_billing/e2;->k([BILcom/google/android/gms/internal/play_billing/c2;)I

    throw v19

    :cond_62
    if-eqz v9, :cond_63

    goto/16 :goto_38

    :cond_63
    sget v0, Lcom/google/android/gms/internal/play_billing/e2;->b:I

    invoke-static/range {v18 .. v18}, Landroidx/appcompat/app/D;->a(Ljava/lang/Object;)V

    invoke-static {v15, v13, v14}, Lcom/google/android/gms/internal/play_billing/e2;->k([BILcom/google/android/gms/internal/play_billing/c2;)I

    iget-wide v0, v14, Lcom/google/android/gms/internal/play_billing/c2;->b:J

    throw v19

    :pswitch_18
    move-object/from16 v41, p3

    move/from16 v12, p4

    move-object/from16 v18, v8

    move v3, v11

    move/from16 v13, v23

    const/4 v2, 0x2

    const/4 v8, 0x1

    move v11, v10

    move-object v10, v0

    move-object v0, v1

    if-ne v9, v2, :cond_65

    sget v1, Lcom/google/android/gms/internal/play_billing/e2;->b:I

    invoke-static/range {v18 .. v18}, Landroidx/appcompat/app/D;->a(Ljava/lang/Object;)V

    invoke-static {v15, v13, v14}, Lcom/google/android/gms/internal/play_billing/e2;->h([BILcom/google/android/gms/internal/play_billing/c2;)I

    move-result v1

    iget v2, v14, Lcom/google/android/gms/internal/play_billing/c2;->a:I

    add-int/2addr v1, v2

    array-length v2, v15

    if-le v1, v2, :cond_64

    new-instance v1, Lcom/google/android/gms/internal/play_billing/S2;

    invoke-direct {v1, v0}, Lcom/google/android/gms/internal/play_billing/S2;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_64
    throw v19

    :cond_65
    const/4 v0, 0x5

    if-eq v9, v0, :cond_66

    goto :goto_38

    :cond_66
    sget v0, Lcom/google/android/gms/internal/play_billing/e2;->b:I

    invoke-static/range {v18 .. v18}, Landroidx/appcompat/app/D;->a(Ljava/lang/Object;)V

    invoke-static {v15, v13}, Lcom/google/android/gms/internal/play_billing/e2;->b([BI)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    throw v19

    :pswitch_19
    move-object/from16 v41, p3

    move/from16 v12, p4

    move-object/from16 v18, v8

    move v3, v11

    move/from16 v13, v23

    const/4 v2, 0x2

    const/4 v8, 0x1

    move v11, v10

    move-object v10, v0

    move-object v0, v1

    if-ne v9, v2, :cond_68

    sget v1, Lcom/google/android/gms/internal/play_billing/e2;->b:I

    invoke-static/range {v18 .. v18}, Landroidx/appcompat/app/D;->a(Ljava/lang/Object;)V

    invoke-static {v15, v13, v14}, Lcom/google/android/gms/internal/play_billing/e2;->h([BILcom/google/android/gms/internal/play_billing/c2;)I

    move-result v1

    iget v2, v14, Lcom/google/android/gms/internal/play_billing/c2;->a:I

    add-int/2addr v1, v2

    array-length v2, v15

    if-le v1, v2, :cond_67

    new-instance v1, Lcom/google/android/gms/internal/play_billing/S2;

    invoke-direct {v1, v0}, Lcom/google/android/gms/internal/play_billing/S2;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_67
    throw v19

    :cond_68
    if-eq v9, v8, :cond_6a

    :goto_38
    move v1, v13

    :goto_39
    if-eq v1, v13, :cond_69

    move/from16 v6, p5

    move/from16 v18, v3

    move-object v0, v10

    move v10, v11

    move v5, v12

    move-object v3, v14

    move/from16 v13, v20

    move/from16 v12, v22

    move/from16 v9, v33

    move-object/from16 v14, v41

    const/4 v4, 0x3

    move/from16 v43, v8

    move v8, v1

    move/from16 v1, v43

    move/from16 v44, v17

    move/from16 v17, v16

    move/from16 v16, v44

    goto/16 :goto_0

    :cond_69
    move/from16 v0, p5

    move v4, v3

    move v10, v11

    move-object v13, v14

    move-object v12, v15

    move/from16 v11, v33

    const/16 v23, 0x3

    move v3, v1

    :goto_3a
    move/from16 v43, v17

    move/from16 v17, v16

    move/from16 v16, v43

    goto/16 :goto_49

    :cond_6a
    sget v0, Lcom/google/android/gms/internal/play_billing/e2;->b:I

    invoke-static/range {v18 .. v18}, Landroidx/appcompat/app/D;->a(Ljava/lang/Object;)V

    invoke-static {v15, v13}, Lcom/google/android/gms/internal/play_billing/e2;->n([BI)J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Double;->longBitsToDouble(J)D

    throw v19

    :cond_6b
    move/from16 v21, p3

    move-object v8, v3

    move v3, v11

    move-object/from16 v41, v13

    move/from16 v13, v23

    move/from16 v42, v33

    const/4 v2, 0x2

    move v11, v10

    move-object v10, v0

    move/from16 v0, p4

    const/16 v14, 0x32

    if-ne v4, v14, :cond_6e

    if-ne v9, v2, :cond_6d

    sget-object v0, Lcom/google/android/gms/internal/play_billing/l3;->m:Lsun/misc/Unsafe;

    invoke-direct {v10, v11}, Lcom/google/android/gms/internal/play_billing/l3;->L(I)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v7, v5, v6}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Lcom/google/android/gms/internal/play_billing/c3;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/play_billing/c3;->e()Z

    move-result v3

    if-nez v3, :cond_6c

    invoke-static {}, Lcom/google/android/gms/internal/play_billing/c3;->a()Lcom/google/android/gms/internal/play_billing/c3;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/android/gms/internal/play_billing/c3;->b()Lcom/google/android/gms/internal/play_billing/c3;

    move-result-object v3

    invoke-static {v3, v2}, Lcom/google/android/gms/internal/play_billing/d3;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v0, v7, v5, v6, v3}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    :cond_6c
    invoke-static {v1}, Landroidx/appcompat/app/D;->a(Ljava/lang/Object;)V

    throw v19

    :cond_6d
    :goto_3b
    move/from16 v0, p5

    move v4, v3

    move v10, v11

    move v3, v13

    move-object v12, v15

    move/from16 v11, v42

    const/16 v23, 0x3

    move-object/from16 v13, p6

    goto :goto_3a

    :cond_6e
    add-int/lit8 v14, v11, 0x2

    sget-object v2, Lcom/google/android/gms/internal/play_billing/l3;->m:Lsun/misc/Unsafe;

    aget v12, v12, v14

    const v14, 0xfffff

    and-int/2addr v12, v14

    int-to-long v14, v12

    packed-switch v4, :pswitch_data_2

    move-object/from16 v12, p2

    move v4, v3

    move/from16 p3, v11

    move v0, v13

    move/from16 v11, v42

    const/16 v23, 0x3

    move-object/from16 v13, p6

    goto/16 :goto_47

    :pswitch_1a
    const/4 v4, 0x3

    if-ne v9, v4, :cond_6f

    and-int/lit8 v1, v3, -0x8

    or-int/lit8 v1, v1, 0x4

    move/from16 v2, v42

    invoke-direct {v10, v7, v2, v11}, Lcom/google/android/gms/internal/play_billing/l3;->N(Ljava/lang/Object;II)Ljava/lang/Object;

    move-result-object v5

    invoke-direct {v10, v11}, Lcom/google/android/gms/internal/play_billing/l3;->K(I)Lcom/google/android/gms/internal/play_billing/t3;

    move-result-object v9

    const/4 v6, 0x1

    move-object v8, v5

    move-object v15, v10

    move-object/from16 v10, p2

    move v14, v11

    move v11, v13

    move/from16 v12, p4

    move v0, v13

    move v13, v1

    move-object/from16 v1, p6

    move v4, v14

    move-object/from16 v14, p6

    invoke-static/range {v8 .. v14}, Lcom/google/android/gms/internal/play_billing/e2;->l(Ljava/lang/Object;Lcom/google/android/gms/internal/play_billing/t3;[BIIILcom/google/android/gms/internal/play_billing/c2;)I

    move-result v8

    invoke-direct {v15, v7, v2, v4, v5}, Lcom/google/android/gms/internal/play_billing/l3;->p(Ljava/lang/Object;IILjava/lang/Object;)V

    move-object/from16 v12, p2

    move-object v13, v1

    move v11, v2

    :goto_3c
    move/from16 p3, v4

    :goto_3d
    const/16 v23, 0x3

    move v4, v3

    goto/16 :goto_48

    :cond_6f
    move-object v15, v10

    move v0, v13

    move-object/from16 v12, p2

    move-object/from16 v13, p6

    move/from16 v23, v4

    move/from16 p3, v11

    move/from16 v11, v42

    :goto_3e
    move v4, v3

    goto/16 :goto_47

    :pswitch_1b
    move-object/from16 v1, p6

    move v4, v11

    move v0, v13

    move/from16 v11, v42

    const/4 v12, 0x1

    if-nez v9, :cond_70

    move-object/from16 v13, p2

    invoke-static {v13, v0, v1}, Lcom/google/android/gms/internal/play_billing/e2;->k([BILcom/google/android/gms/internal/play_billing/c2;)I

    move-result v8

    iget-wide v12, v1, Lcom/google/android/gms/internal/play_billing/c2;->b:J

    invoke-static {v12, v13}, Lcom/google/android/gms/internal/play_billing/r2;->b(J)J

    move-result-wide v12

    invoke-static {v12, v13}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v9

    invoke-virtual {v2, v7, v5, v6, v9}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    invoke-virtual {v2, v7, v14, v15, v11}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    move-object/from16 v12, p2

    :goto_3f
    move-object v13, v1

    goto :goto_3c

    :cond_70
    move-object/from16 v12, p2

    :cond_71
    move-object v13, v1

    move/from16 p3, v4

    const/16 v23, 0x3

    goto :goto_3e

    :pswitch_1c
    move-object/from16 v1, p6

    move v4, v11

    move v0, v13

    move/from16 v11, v42

    if-nez v9, :cond_70

    move-object/from16 v12, p2

    invoke-static {v12, v0, v1}, Lcom/google/android/gms/internal/play_billing/e2;->h([BILcom/google/android/gms/internal/play_billing/c2;)I

    move-result v8

    iget v9, v1, Lcom/google/android/gms/internal/play_billing/c2;->a:I

    invoke-static {v9}, Lcom/google/android/gms/internal/play_billing/r2;->a(I)I

    move-result v9

    :cond_72
    :goto_40
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-virtual {v2, v7, v5, v6, v9}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    invoke-virtual {v2, v7, v14, v15, v11}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    goto :goto_3f

    :pswitch_1d
    move-object/from16 v12, p2

    move-object/from16 v1, p6

    move v4, v11

    move v0, v13

    move/from16 v11, v42

    if-nez v9, :cond_71

    invoke-static {v12, v0, v1}, Lcom/google/android/gms/internal/play_billing/e2;->h([BILcom/google/android/gms/internal/play_billing/c2;)I

    move-result v8

    iget v9, v1, Lcom/google/android/gms/internal/play_billing/c2;->a:I

    invoke-direct {v10, v4}, Lcom/google/android/gms/internal/play_billing/l3;->J(I)Lcom/google/android/gms/internal/play_billing/N2;

    move-result-object v13

    if-eqz v13, :cond_72

    invoke-interface {v13, v9}, Lcom/google/android/gms/internal/play_billing/N2;->r(I)Z

    move-result v13

    if-eqz v13, :cond_73

    goto :goto_40

    :cond_73
    invoke-static/range {p1 .. p1}, Lcom/google/android/gms/internal/play_billing/l3;->z(Ljava/lang/Object;)Lcom/google/android/gms/internal/play_billing/A3;

    move-result-object v2

    int-to-long v5, v9

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    invoke-virtual {v2, v3, v5}, Lcom/google/android/gms/internal/play_billing/A3;->j(ILjava/lang/Object;)V

    goto :goto_3f

    :pswitch_1e
    move-object/from16 v12, p2

    move-object/from16 v1, p6

    move v4, v11

    move v0, v13

    move/from16 v11, v42

    const/4 v8, 0x2

    if-ne v9, v8, :cond_71

    invoke-static {v12, v0, v1}, Lcom/google/android/gms/internal/play_billing/e2;->a([BILcom/google/android/gms/internal/play_billing/c2;)I

    move-result v9

    iget-object v13, v1, Lcom/google/android/gms/internal/play_billing/c2;->c:Ljava/lang/Object;

    invoke-virtual {v2, v7, v5, v6, v13}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    invoke-virtual {v2, v7, v14, v15, v11}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    move-object v13, v1

    move/from16 p3, v4

    move v8, v9

    goto/16 :goto_3d

    :pswitch_1f
    move-object/from16 v12, p2

    move-object/from16 v1, p6

    move v4, v11

    move v0, v13

    move/from16 v11, v42

    const/4 v8, 0x2

    if-ne v9, v8, :cond_74

    invoke-direct {v10, v7, v11, v4}, Lcom/google/android/gms/internal/play_billing/l3;->N(Ljava/lang/Object;II)Ljava/lang/Object;

    move-result-object v9

    invoke-direct {v10, v4}, Lcom/google/android/gms/internal/play_billing/l3;->K(I)Lcom/google/android/gms/internal/play_billing/t3;

    move-result-object v2

    move-object v13, v1

    move-object v1, v9

    move v14, v3

    move-object/from16 v3, p2

    move v15, v4

    const/16 v23, 0x3

    move v4, v0

    move/from16 v5, p4

    move-object/from16 v6, p6

    invoke-static/range {v1 .. v6}, Lcom/google/android/gms/internal/play_billing/e2;->m(Ljava/lang/Object;Lcom/google/android/gms/internal/play_billing/t3;[BIILcom/google/android/gms/internal/play_billing/c2;)I

    move-result v1

    invoke-direct {v10, v7, v11, v15, v9}, Lcom/google/android/gms/internal/play_billing/l3;->p(Ljava/lang/Object;IILjava/lang/Object;)V

    move v8, v1

    move v4, v14

    move/from16 p3, v15

    goto/16 :goto_48

    :cond_74
    move-object v13, v1

    const/16 v23, 0x3

    move/from16 p3, v4

    goto/16 :goto_3e

    :pswitch_20
    move-object/from16 v12, p2

    move v4, v3

    move/from16 p3, v11

    move v0, v13

    move/from16 v11, v42

    const/4 v3, 0x2

    const/16 v23, 0x3

    move-object/from16 v13, p6

    if-ne v9, v3, :cond_79

    invoke-static {v12, v0, v13}, Lcom/google/android/gms/internal/play_billing/e2;->h([BILcom/google/android/gms/internal/play_billing/c2;)I

    move-result v9

    iget v3, v13, Lcom/google/android/gms/internal/play_billing/c2;->a:I

    if-nez v3, :cond_75

    invoke-virtual {v2, v7, v5, v6, v8}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    goto :goto_42

    :cond_75
    and-int v8, v21, v18

    add-int v10, v9, v3

    if-eqz v8, :cond_77

    invoke-static {v12, v9, v10}, Lcom/google/android/gms/internal/play_billing/J3;->d([BII)Z

    move-result v8

    if-eqz v8, :cond_76

    goto :goto_41

    :cond_76
    new-instance v0, Lcom/google/android/gms/internal/play_billing/S2;

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/play_billing/S2;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_77
    :goto_41
    new-instance v1, Ljava/lang/String;

    sget-object v8, Lcom/google/android/gms/internal/play_billing/Q2;->a:Ljava/nio/charset/Charset;

    invoke-direct {v1, v12, v9, v3, v8}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    invoke-virtual {v2, v7, v5, v6, v1}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    move v9, v10

    :goto_42
    invoke-virtual {v2, v7, v14, v15, v11}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    move v8, v9

    goto/16 :goto_48

    :pswitch_21
    move-object/from16 v12, p2

    move v4, v3

    move/from16 p3, v11

    move v0, v13

    move/from16 v11, v42

    const/16 v23, 0x3

    move-object/from16 v13, p6

    if-nez v9, :cond_79

    invoke-static {v12, v0, v13}, Lcom/google/android/gms/internal/play_billing/e2;->k([BILcom/google/android/gms/internal/play_billing/c2;)I

    move-result v1

    iget-wide v8, v13, Lcom/google/android/gms/internal/play_billing/c2;->b:J

    cmp-long v3, v8, v26

    if-eqz v3, :cond_78

    const/4 v3, 0x1

    goto :goto_43

    :cond_78
    move/from16 v3, v20

    :goto_43
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    :goto_44
    invoke-virtual {v2, v7, v5, v6, v3}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    invoke-virtual {v2, v7, v14, v15, v11}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    move v8, v1

    goto/16 :goto_48

    :pswitch_22
    move-object/from16 v12, p2

    move v4, v3

    move/from16 p3, v11

    move v0, v13

    move/from16 v11, v42

    const/4 v1, 0x5

    const/16 v23, 0x3

    move-object/from16 v13, p6

    if-ne v9, v1, :cond_79

    add-int/lit8 v1, v0, 0x4

    invoke-static {v12, v0}, Lcom/google/android/gms/internal/play_billing/e2;->b([BI)I

    move-result v3

    :goto_45
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    goto :goto_44

    :pswitch_23
    move-object/from16 v12, p2

    move v4, v3

    move/from16 p3, v11

    move v0, v13

    move/from16 v11, v42

    const/4 v1, 0x1

    const/16 v23, 0x3

    move-object/from16 v13, p6

    if-ne v9, v1, :cond_79

    add-int/lit8 v1, v0, 0x8

    invoke-static {v12, v0}, Lcom/google/android/gms/internal/play_billing/e2;->n([BI)J

    move-result-wide v8

    :goto_46
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    goto :goto_44

    :pswitch_24
    move-object/from16 v12, p2

    move v4, v3

    move/from16 p3, v11

    move v0, v13

    move/from16 v11, v42

    const/16 v23, 0x3

    move-object/from16 v13, p6

    if-nez v9, :cond_79

    invoke-static {v12, v0, v13}, Lcom/google/android/gms/internal/play_billing/e2;->h([BILcom/google/android/gms/internal/play_billing/c2;)I

    move-result v1

    iget v3, v13, Lcom/google/android/gms/internal/play_billing/c2;->a:I

    goto :goto_45

    :pswitch_25
    move-object/from16 v12, p2

    move v4, v3

    move/from16 p3, v11

    move v0, v13

    move/from16 v11, v42

    const/16 v23, 0x3

    move-object/from16 v13, p6

    if-nez v9, :cond_79

    invoke-static {v12, v0, v13}, Lcom/google/android/gms/internal/play_billing/e2;->k([BILcom/google/android/gms/internal/play_billing/c2;)I

    move-result v1

    iget-wide v8, v13, Lcom/google/android/gms/internal/play_billing/c2;->b:J

    goto :goto_46

    :pswitch_26
    move-object/from16 v12, p2

    move v4, v3

    move/from16 p3, v11

    move v0, v13

    move/from16 v11, v42

    const/4 v1, 0x5

    const/16 v23, 0x3

    move-object/from16 v13, p6

    if-ne v9, v1, :cond_79

    add-int/lit8 v1, v0, 0x4

    invoke-static {v12, v0}, Lcom/google/android/gms/internal/play_billing/e2;->b([BI)I

    move-result v3

    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v3

    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    goto/16 :goto_44

    :pswitch_27
    move-object/from16 v12, p2

    move v4, v3

    move/from16 p3, v11

    move v0, v13

    move/from16 v11, v42

    const/4 v1, 0x1

    const/16 v23, 0x3

    move-object/from16 v13, p6

    if-ne v9, v1, :cond_79

    add-int/lit8 v1, v0, 0x8

    invoke-static {v12, v0}, Lcom/google/android/gms/internal/play_billing/e2;->n([BI)J

    move-result-wide v8

    invoke-static {v8, v9}, Ljava/lang/Double;->longBitsToDouble(J)D

    move-result-wide v8

    invoke-static {v8, v9}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v3

    goto/16 :goto_44

    :cond_79
    :goto_47
    move v8, v0

    :goto_48
    if-eq v8, v0, :cond_7a

    move-object/from16 v0, p0

    move/from16 v10, p3

    move/from16 v5, p4

    move/from16 v6, p5

    move/from16 v18, v4

    move v9, v11

    move-object v15, v12

    move-object v3, v13

    move/from16 v13, v20

    move/from16 v12, v22

    move/from16 v4, v23

    move-object/from16 v14, v41

    const/4 v1, 0x1

    goto/16 :goto_1c

    :cond_7a
    move/from16 v10, p3

    move/from16 v0, p5

    move v3, v8

    goto/16 :goto_3a

    :goto_49
    if-ne v4, v0, :cond_7b

    if-eqz v0, :cond_7b

    move-object/from16 v9, p0

    move v8, v3

    move/from16 v1, v16

    move/from16 v2, v17

    :goto_4a
    const v3, 0xfffff

    goto/16 :goto_4c

    :cond_7b
    move-object/from16 v9, p0

    iget-boolean v1, v9, Lcom/google/android/gms/internal/play_billing/l3;->f:Z

    if-eqz v1, :cond_7c

    iget-object v1, v13, Lcom/google/android/gms/internal/play_billing/c2;->d:Lcom/google/android/gms/internal/play_billing/A2;

    sget-object v2, Lcom/google/android/gms/internal/play_billing/A2;->c:Lcom/google/android/gms/internal/play_billing/A2;

    sget v2, Lcom/google/android/gms/internal/play_billing/q3;->d:I

    sget-object v2, Lcom/google/android/gms/internal/play_billing/A2;->c:Lcom/google/android/gms/internal/play_billing/A2;

    if-eq v1, v2, :cond_7c

    iget-object v2, v9, Lcom/google/android/gms/internal/play_billing/l3;->e:Lcom/google/android/gms/internal/play_billing/i3;

    sget v5, Lcom/google/android/gms/internal/play_billing/e2;->b:I

    invoke-virtual {v1, v2, v11}, Lcom/google/android/gms/internal/play_billing/A2;->b(Lcom/google/android/gms/internal/play_billing/i3;I)Lcom/google/android/gms/internal/play_billing/K2;

    invoke-static/range {p1 .. p1}, Lcom/google/android/gms/internal/play_billing/l3;->z(Ljava/lang/Object;)Lcom/google/android/gms/internal/play_billing/A3;

    move-result-object v5

    move v1, v4

    move-object/from16 v2, p2

    const/4 v14, 0x2

    move v8, v4

    move/from16 v4, p4

    move-object/from16 v6, p6

    invoke-static/range {v1 .. v6}, Lcom/google/android/gms/internal/play_billing/e2;->g(I[BIILcom/google/android/gms/internal/play_billing/A3;Lcom/google/android/gms/internal/play_billing/c2;)I

    move-result v1

    goto :goto_4b

    :cond_7c
    move v8, v4

    const/4 v14, 0x2

    invoke-static/range {p1 .. p1}, Lcom/google/android/gms/internal/play_billing/l3;->z(Ljava/lang/Object;)Lcom/google/android/gms/internal/play_billing/A3;

    move-result-object v5

    move v1, v8

    move-object/from16 v2, p2

    move/from16 v4, p4

    move-object/from16 v6, p6

    invoke-static/range {v1 .. v6}, Lcom/google/android/gms/internal/play_billing/e2;->g(I[BIILcom/google/android/gms/internal/play_billing/A3;Lcom/google/android/gms/internal/play_billing/c2;)I

    move-result v1

    :goto_4b
    move/from16 v5, p4

    move v6, v0

    move/from16 v18, v8

    move-object v0, v9

    move v9, v11

    move-object v15, v12

    move-object v3, v13

    move/from16 v13, v20

    move/from16 v12, v22

    move/from16 v4, v23

    move-object/from16 v14, v41

    move v8, v1

    const/4 v1, 0x1

    goto/16 :goto_0

    :cond_7d
    move-object v9, v0

    move v0, v6

    move-object/from16 v41, v14

    move/from16 v43, v17

    move/from16 v17, v16

    move/from16 v16, v43

    move/from16 v2, v16

    move/from16 v1, v17

    move/from16 v4, v18

    goto :goto_4a

    :goto_4c
    if-eq v1, v3, :cond_7e

    int-to-long v5, v1

    move-object/from16 v1, v41

    invoke-virtual {v1, v7, v5, v6, v2}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    :cond_7e
    iget v1, v9, Lcom/google/android/gms/internal/play_billing/l3;->h:I

    :goto_4d
    iget v2, v9, Lcom/google/android/gms/internal/play_billing/l3;->i:I

    if-ge v1, v2, :cond_81

    iget-object v2, v9, Lcom/google/android/gms/internal/play_billing/l3;->g:[I

    iget-object v5, v9, Lcom/google/android/gms/internal/play_billing/l3;->a:[I

    aget v2, v2, v1

    aget v5, v5, v2

    invoke-direct {v9, v2}, Lcom/google/android/gms/internal/play_billing/l3;->H(I)I

    move-result v5

    and-int/2addr v5, v3

    int-to-long v5, v5

    invoke-static {v7, v5, v6}, Lcom/google/android/gms/internal/play_billing/G3;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    if-nez v5, :cond_7f

    :goto_4e
    const/4 v6, 0x1

    goto :goto_4f

    :cond_7f
    invoke-direct {v9, v2}, Lcom/google/android/gms/internal/play_billing/l3;->J(I)Lcom/google/android/gms/internal/play_billing/N2;

    move-result-object v6

    if-nez v6, :cond_80

    goto :goto_4e

    :goto_4f
    add-int/2addr v1, v6

    goto :goto_4d

    :cond_80
    check-cast v5, Lcom/google/android/gms/internal/play_billing/c3;

    invoke-direct {v9, v2}, Lcom/google/android/gms/internal/play_billing/l3;->L(I)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Landroidx/appcompat/app/D;->a(Ljava/lang/Object;)V

    throw v19

    :cond_81
    const-string v1, "Failed to parse the message."

    move/from16 v2, p4

    if-nez v0, :cond_83

    if-ne v8, v2, :cond_82

    goto :goto_50

    :cond_82
    new-instance v0, Lcom/google/android/gms/internal/play_billing/S2;

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/play_billing/S2;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_83
    if-gt v8, v2, :cond_84

    if-ne v4, v0, :cond_84

    :goto_50
    return v8

    :cond_84
    new-instance v0, Lcom/google/android/gms/internal/play_billing/S2;

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/play_billing/S2;-><init>(Ljava/lang/String;)V

    throw v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_9
        :pswitch_2
        :pswitch_7
        :pswitch_8
        :pswitch_1
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x12
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_16
        :pswitch_f
        :pswitch_14
        :pswitch_15
        :pswitch_e
        :pswitch_d
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_16
        :pswitch_f
        :pswitch_14
        :pswitch_15
        :pswitch_e
        :pswitch_d
    .end packed-switch

    :pswitch_data_2
    .packed-switch 0x33
        :pswitch_27
        :pswitch_26
        :pswitch_25
        :pswitch_25
        :pswitch_24
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_24
        :pswitch_1d
        :pswitch_22
        :pswitch_23
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
    .end packed-switch
.end method
