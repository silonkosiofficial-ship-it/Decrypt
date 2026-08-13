.class public final Lu0/d$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lu0/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lu0/d$a$a;
    }
.end annotation


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:F

.field private final c:F

.field private final d:F

.field private final e:F

.field private final f:J

.field private final g:I

.field private final h:Z

.field private final i:Ljava/util/ArrayList;

.field private j:Lu0/d$a$a;

.field private k:Z


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;FFFFJIZ)V
    .locals 16

    move-object/from16 v0, p0

    invoke-direct/range {p0 .. p0}, Ljava/lang/Object;-><init>()V

    move-object/from16 v1, p1

    iput-object v1, v0, Lu0/d$a;->a:Ljava/lang/String;

    move/from16 v1, p2

    iput v1, v0, Lu0/d$a;->b:F

    move/from16 v1, p3

    iput v1, v0, Lu0/d$a;->c:F

    move/from16 v1, p4

    iput v1, v0, Lu0/d$a;->d:F

    move/from16 v1, p5

    iput v1, v0, Lu0/d$a;->e:F

    move-wide/from16 v1, p6

    iput-wide v1, v0, Lu0/d$a;->f:J

    move/from16 v1, p8

    iput v1, v0, Lu0/d$a;->g:I

    move/from16 v1, p9

    iput-boolean v1, v0, Lu0/d$a;->h:Z

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, v0, Lu0/d$a;->i:Ljava/util/ArrayList;

    new-instance v15, Lu0/d$a$a;

    const/16 v13, 0x3ff

    const/4 v14, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    move-object v2, v15

    invoke-direct/range {v2 .. v14}, Lu0/d$a$a;-><init>(Ljava/lang/String;FFFFFFFLjava/util/List;Ljava/util/List;ILy7/k;)V

    iput-object v15, v0, Lu0/d$a;->j:Lu0/d$a$a;

    invoke-static {v1, v15}, Lu0/e;->c(Ljava/util/ArrayList;Ljava/lang/Object;)Z

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;FFFFJIZILy7/k;)V
    .locals 13

    .prologue
    move/from16 v0, p10

    and-int/lit8 v1, v0, 0x1

    if-eqz v1, :cond_0

    const-string v1, ""

    move-object v3, v1

    goto :goto_0

    :cond_0
    move-object v3, p1

    :goto_0
    and-int/lit8 v1, v0, 0x20

    if-eqz v1, :cond_1

    sget-object v1, Lo0/y0;->b:Lo0/y0$a;

    invoke-virtual {v1}, Lo0/y0$a;->g()J

    move-result-wide v1

    move-wide v8, v1

    goto :goto_1

    :cond_1
    move-wide/from16 v8, p6

    :goto_1
    and-int/lit8 v1, v0, 0x40

    if-eqz v1, :cond_2

    sget-object v1, Lo0/f0;->a:Lo0/f0$a;

    invoke-virtual {v1}, Lo0/f0$a;->z()I

    move-result v1

    move v10, v1

    goto :goto_2

    :cond_2
    move/from16 v10, p8

    :goto_2
    and-int/lit16 v0, v0, 0x80

    if-eqz v0, :cond_3

    const/4 v0, 0x0

    move v11, v0

    goto :goto_3

    :cond_3
    move/from16 v11, p9

    :goto_3
    const/4 v12, 0x0

    move-object v2, p0

    move v4, p2

    move/from16 v5, p3

    move/from16 v6, p4

    move/from16 v7, p5

    invoke-direct/range {v2 .. v12}, Lu0/d$a;-><init>(Ljava/lang/String;FFFFJIZLy7/k;)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;FFFFJIZLy7/k;)V
    .locals 0

    invoke-direct/range {p0 .. p9}, Lu0/d$a;-><init>(Ljava/lang/String;FFFFJIZ)V

    return-void
.end method

.method public static synthetic b(Lu0/d$a;Ljava/lang/String;FFFFFFFLjava/util/List;ILjava/lang/Object;)Lu0/d$a;
    .locals 10

    .prologue
    move/from16 v0, p10

    and-int/lit8 v1, v0, 0x1

    if-eqz v1, :cond_0

    const-string v1, ""

    goto :goto_0

    :cond_0
    move-object v1, p1

    :goto_0
    and-int/lit8 v2, v0, 0x2

    const/4 v3, 0x0

    if-eqz v2, :cond_1

    move v2, v3

    goto :goto_1

    :cond_1
    move v2, p2

    :goto_1
    and-int/lit8 v4, v0, 0x4

    if-eqz v4, :cond_2

    move v4, v3

    goto :goto_2

    :cond_2
    move v4, p3

    :goto_2
    and-int/lit8 v5, v0, 0x8

    if-eqz v5, :cond_3

    move v5, v3

    goto :goto_3

    :cond_3
    move v5, p4

    :goto_3
    and-int/lit8 v6, v0, 0x10

    const/high16 v7, 0x3f800000    # 1.0f

    if-eqz v6, :cond_4

    move v6, v7

    goto :goto_4

    :cond_4
    move v6, p5

    :goto_4
    and-int/lit8 v8, v0, 0x20

    if-eqz v8, :cond_5

    goto :goto_5

    :cond_5
    move/from16 v7, p6

    :goto_5
    and-int/lit8 v8, v0, 0x40

    if-eqz v8, :cond_6

    move v8, v3

    goto :goto_6

    :cond_6
    move/from16 v8, p7

    :goto_6
    and-int/lit16 v9, v0, 0x80

    if-eqz v9, :cond_7

    goto :goto_7

    :cond_7
    move/from16 v3, p8

    :goto_7
    and-int/lit16 v0, v0, 0x100

    if-eqz v0, :cond_8

    invoke-static {}, Lu0/o;->e()Ljava/util/List;

    move-result-object v0

    goto :goto_8

    :cond_8
    move-object/from16 v0, p9

    :goto_8
    move-object p1, v1

    move p2, v2

    move p3, v4

    move p4, v5

    move p5, v6

    move/from16 p6, v7

    move/from16 p7, v8

    move/from16 p8, v3

    move-object/from16 p9, v0

    invoke-virtual/range {p0 .. p9}, Lu0/d$a;->a(Ljava/lang/String;FFFFFFFLjava/util/List;)Lu0/d$a;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic d(Lu0/d$a;Ljava/util/List;ILjava/lang/String;Lo0/n0;FLo0/n0;FFIIFFFFILjava/lang/Object;)Lu0/d$a;
    .locals 15

    .prologue
    move/from16 v0, p15

    and-int/lit8 v1, v0, 0x2

    if-eqz v1, :cond_0

    invoke-static {}, Lu0/o;->b()I

    move-result v1

    goto :goto_0

    :cond_0
    move/from16 v1, p2

    :goto_0
    and-int/lit8 v2, v0, 0x4

    if-eqz v2, :cond_1

    const-string v2, ""

    goto :goto_1

    :cond_1
    move-object/from16 v2, p3

    :goto_1
    and-int/lit8 v3, v0, 0x8

    const/4 v4, 0x0

    if-eqz v3, :cond_2

    move-object v3, v4

    goto :goto_2

    :cond_2
    move-object/from16 v3, p4

    :goto_2
    and-int/lit8 v5, v0, 0x10

    const/high16 v6, 0x3f800000    # 1.0f

    if-eqz v5, :cond_3

    move v5, v6

    goto :goto_3

    :cond_3
    move/from16 v5, p5

    :goto_3
    and-int/lit8 v7, v0, 0x20

    if-eqz v7, :cond_4

    goto :goto_4

    :cond_4
    move-object/from16 v4, p6

    :goto_4
    and-int/lit8 v7, v0, 0x40

    if-eqz v7, :cond_5

    move v7, v6

    goto :goto_5

    :cond_5
    move/from16 v7, p7

    :goto_5
    and-int/lit16 v8, v0, 0x80

    const/4 v9, 0x0

    if-eqz v8, :cond_6

    move v8, v9

    goto :goto_6

    :cond_6
    move/from16 v8, p8

    :goto_6
    and-int/lit16 v10, v0, 0x100

    if-eqz v10, :cond_7

    invoke-static {}, Lu0/o;->c()I

    move-result v10

    goto :goto_7

    :cond_7
    move/from16 v10, p9

    :goto_7
    and-int/lit16 v11, v0, 0x200

    if-eqz v11, :cond_8

    invoke-static {}, Lu0/o;->d()I

    move-result v11

    goto :goto_8

    :cond_8
    move/from16 v11, p10

    :goto_8
    and-int/lit16 v12, v0, 0x400

    if-eqz v12, :cond_9

    const/high16 v12, 0x40800000    # 4.0f

    goto :goto_9

    :cond_9
    move/from16 v12, p11

    :goto_9
    and-int/lit16 v13, v0, 0x800

    if-eqz v13, :cond_a

    move v13, v9

    goto :goto_a

    :cond_a
    move/from16 v13, p12

    :goto_a
    and-int/lit16 v14, v0, 0x1000

    if-eqz v14, :cond_b

    goto :goto_b

    :cond_b
    move/from16 v6, p13

    :goto_b
    and-int/lit16 v0, v0, 0x2000

    if-eqz v0, :cond_c

    goto :goto_c

    :cond_c
    move/from16 v9, p14

    :goto_c
    move-object/from16 p2, p0

    move-object/from16 p3, p1

    move/from16 p4, v1

    move-object/from16 p5, v2

    move-object/from16 p6, v3

    move/from16 p7, v5

    move-object/from16 p8, v4

    move/from16 p9, v7

    move/from16 p10, v8

    move/from16 p11, v10

    move/from16 p12, v11

    move/from16 p13, v12

    move/from16 p14, v13

    move/from16 p15, v6

    move/from16 p16, v9

    invoke-virtual/range {p2 .. p16}, Lu0/d$a;->c(Ljava/util/List;ILjava/lang/String;Lo0/n0;FLo0/n0;FFIIFFFF)Lu0/d$a;

    move-result-object v0

    return-object v0
.end method

.method private final e(Lu0/d$a$a;)Lu0/n;
    .locals 12

    new-instance v11, Lu0/n;

    invoke-virtual {p1}, Lu0/d$a$a;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lu0/d$a$a;->f()F

    move-result v2

    invoke-virtual {p1}, Lu0/d$a$a;->d()F

    move-result v3

    invoke-virtual {p1}, Lu0/d$a$a;->e()F

    move-result v4

    invoke-virtual {p1}, Lu0/d$a$a;->g()F

    move-result v5

    invoke-virtual {p1}, Lu0/d$a$a;->h()F

    move-result v6

    invoke-virtual {p1}, Lu0/d$a$a;->i()F

    move-result v7

    invoke-virtual {p1}, Lu0/d$a$a;->j()F

    move-result v8

    invoke-virtual {p1}, Lu0/d$a$a;->b()Ljava/util/List;

    move-result-object v9

    invoke-virtual {p1}, Lu0/d$a$a;->a()Ljava/util/List;

    move-result-object v10

    move-object v0, v11

    invoke-direct/range {v0 .. v10}, Lu0/n;-><init>(Ljava/lang/String;FFFFFFFLjava/util/List;Ljava/util/List;)V

    return-object v11
.end method

.method private final h()V
    .locals 1

    .prologue
    iget-boolean v0, p0, Lu0/d$a;->k:Z

    xor-int/lit8 v0, v0, 0x1

    if-nez v0, :cond_0

    const-string v0, "ImageVector.Builder is single use, create a new instance to create a new ImageVector"

    invoke-static {v0}, LC0/a;->b(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method private final i()Lu0/d$a$a;
    .locals 1

    iget-object v0, p0, Lu0/d$a;->i:Ljava/util/ArrayList;

    invoke-static {v0}, Lu0/e;->a(Ljava/util/ArrayList;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lu0/d$a$a;

    return-object v0
.end method


# virtual methods
.method public final a(Ljava/lang/String;FFFFFFFLjava/util/List;)Lu0/d$a;
    .locals 15

    move-object v0, p0

    invoke-direct {p0}, Lu0/d$a;->h()V

    new-instance v14, Lu0/d$a$a;

    const/16 v12, 0x200

    const/4 v13, 0x0

    const/4 v11, 0x0

    move-object v1, v14

    move-object/from16 v2, p1

    move/from16 v3, p2

    move/from16 v4, p3

    move/from16 v5, p4

    move/from16 v6, p5

    move/from16 v7, p6

    move/from16 v8, p7

    move/from16 v9, p8

    move-object/from16 v10, p9

    invoke-direct/range {v1 .. v13}, Lu0/d$a$a;-><init>(Ljava/lang/String;FFFFFFFLjava/util/List;Ljava/util/List;ILy7/k;)V

    iget-object v1, v0, Lu0/d$a;->i:Ljava/util/ArrayList;

    invoke-static {v1, v14}, Lu0/e;->c(Ljava/util/ArrayList;Ljava/lang/Object;)Z

    return-object v0
.end method

.method public final c(Ljava/util/List;ILjava/lang/String;Lo0/n0;FLo0/n0;FFIIFFFF)Lu0/d$a;
    .locals 18

    invoke-direct/range {p0 .. p0}, Lu0/d$a;->h()V

    invoke-direct/range {p0 .. p0}, Lu0/d$a;->i()Lu0/d$a$a;

    move-result-object v0

    invoke-virtual {v0}, Lu0/d$a$a;->a()Ljava/util/List;

    move-result-object v0

    new-instance v15, Lu0/s;

    const/16 v16, 0x0

    move-object v1, v15

    move-object/from16 v2, p3

    move-object/from16 v3, p1

    move/from16 v4, p2

    move-object/from16 v5, p4

    move/from16 v6, p5

    move-object/from16 v7, p6

    move/from16 v8, p7

    move/from16 v9, p8

    move/from16 v10, p9

    move/from16 v11, p10

    move/from16 v12, p11

    move/from16 v13, p12

    move/from16 v14, p13

    move-object/from16 v17, v15

    move/from16 v15, p14

    invoke-direct/range {v1 .. v16}, Lu0/s;-><init>(Ljava/lang/String;Ljava/util/List;ILo0/n0;FLo0/n0;FFIIFFFFLy7/k;)V

    move-object/from16 v1, v17

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public final f()Lu0/d;
    .locals 17

    .prologue
    move-object/from16 v0, p0

    invoke-direct/range {p0 .. p0}, Lu0/d$a;->h()V

    :goto_0
    iget-object v1, v0, Lu0/d$a;->i:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v2, 0x1

    if-le v1, v2, :cond_0

    invoke-virtual/range {p0 .. p0}, Lu0/d$a;->g()Lu0/d$a;

    goto :goto_0

    :cond_0
    new-instance v1, Lu0/d;

    iget-object v4, v0, Lu0/d$a;->a:Ljava/lang/String;

    iget v5, v0, Lu0/d$a;->b:F

    iget v6, v0, Lu0/d$a;->c:F

    iget v7, v0, Lu0/d$a;->d:F

    iget v8, v0, Lu0/d$a;->e:F

    iget-object v3, v0, Lu0/d$a;->j:Lu0/d$a$a;

    invoke-direct {v0, v3}, Lu0/d$a;->e(Lu0/d$a$a;)Lu0/n;

    move-result-object v9

    iget-wide v10, v0, Lu0/d$a;->f:J

    iget v12, v0, Lu0/d$a;->g:I

    iget-boolean v13, v0, Lu0/d$a;->h:Z

    const/16 v15, 0x200

    const/16 v16, 0x0

    const/4 v14, 0x0

    move-object v3, v1

    invoke-direct/range {v3 .. v16}, Lu0/d;-><init>(Ljava/lang/String;FFFFLu0/n;JIZIILy7/k;)V

    iput-boolean v2, v0, Lu0/d$a;->k:Z

    return-object v1
.end method

.method public final g()Lu0/d$a;
    .locals 2

    invoke-direct {p0}, Lu0/d$a;->h()V

    iget-object v0, p0, Lu0/d$a;->i:Ljava/util/ArrayList;

    invoke-static {v0}, Lu0/e;->b(Ljava/util/ArrayList;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lu0/d$a$a;

    invoke-direct {p0}, Lu0/d$a;->i()Lu0/d$a$a;

    move-result-object v1

    invoke-virtual {v1}, Lu0/d$a$a;->a()Ljava/util/List;

    move-result-object v1

    invoke-direct {p0, v0}, Lu0/d$a;->e(Lu0/d$a$a;)Lu0/n;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object p0
.end method
