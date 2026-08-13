.class public abstract LS/c1;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:LV/O0;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    sget-object v0, LS/c1$a;->D:LS/c1$a;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-static {v2, v0, v1, v2}, LV/y;->d(LV/u1;Lx7/a;ILjava/lang/Object;)LV/O0;

    move-result-object v0

    sput-object v0, LS/c1;->a:LV/O0;

    return-void
.end method

.method public static final a(Landroidx/compose/ui/d;Lo0/e2;JJFFLv/g;Lx7/p;LV/n;II)V
    .locals 16

    .prologue
    move-object/from16 v0, p10

    move/from16 v1, p11

    const/4 v2, 0x0

    const/4 v3, 0x6

    const/4 v4, 0x2

    const/4 v5, 0x1

    and-int/lit8 v6, p12, 0x1

    if-eqz v6, :cond_0

    sget-object v6, Landroidx/compose/ui/d;->a:Landroidx/compose/ui/d$a;

    goto :goto_0

    :cond_0
    move-object/from16 v6, p0

    :goto_0
    and-int/lit8 v7, p12, 0x2

    if-eqz v7, :cond_1

    invoke-static {}, Lo0/Y1;->a()Lo0/e2;

    move-result-object v7

    goto :goto_1

    :cond_1
    move-object/from16 v7, p1

    :goto_1
    and-int/lit8 v8, p12, 0x4

    if-eqz v8, :cond_2

    sget-object v8, LS/o0;->a:LS/o0;

    invoke-virtual {v8, v0, v3}, LS/o0;->a(LV/n;I)LS/z;

    move-result-object v8

    invoke-virtual {v8}, LS/z;->O()J

    move-result-wide v8

    goto :goto_2

    :cond_2
    move-wide/from16 v8, p2

    :goto_2
    and-int/lit8 v10, p12, 0x8

    if-eqz v10, :cond_3

    shr-int/lit8 v3, v1, 0x6

    and-int/lit8 v3, v3, 0xe

    invoke-static {v8, v9, v0, v3}, LS/A;->c(JLV/n;I)J

    move-result-wide v10

    goto :goto_3

    :cond_3
    move-wide/from16 v10, p4

    :goto_3
    and-int/lit8 v3, p12, 0x10

    if-eqz v3, :cond_4

    int-to-float v3, v2

    invoke-static {v3}, LY0/i;->q(F)F

    move-result v3

    goto :goto_4

    :cond_4
    move/from16 v3, p6

    :goto_4
    and-int/lit8 v12, p12, 0x20

    if-eqz v12, :cond_5

    int-to-float v12, v2

    invoke-static {v12}, LY0/i;->q(F)F

    move-result v12

    goto :goto_5

    :cond_5
    move/from16 v12, p7

    :goto_5
    and-int/lit8 v13, p12, 0x40

    if-eqz v13, :cond_6

    const/4 v13, 0x0

    goto :goto_6

    :cond_6
    move-object/from16 v13, p8

    :goto_6
    invoke-static {}, LV/q;->H()Z

    move-result v14

    if-eqz v14, :cond_7

    const/4 v14, -0x1

    const-string v15, "androidx.compose.material3.Surface (Surface.kt:102)"

    const v5, -0x1ea1368d

    invoke-static {v5, v1, v14, v15}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_7
    sget-object v1, LS/c1;->a:LV/O0;

    invoke-interface {v0, v1}, LV/n;->n(LV/w;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, LY0/i;

    invoke-virtual {v5}, LY0/i;->v()F

    move-result v5

    add-float/2addr v5, v3

    invoke-static {v5}, LY0/i;->q(F)F

    move-result v3

    invoke-static {}, LS/J;->a()LV/O0;

    move-result-object v5

    invoke-static {v10, v11}, Lo0/y0;->i(J)Lo0/y0;

    move-result-object v10

    invoke-virtual {v5, v10}, LV/O0;->d(Ljava/lang/Object;)LV/P0;

    move-result-object v5

    invoke-static {v3}, LY0/i;->m(F)LY0/i;

    move-result-object v10

    invoke-virtual {v1, v10}, LV/O0;->d(Ljava/lang/Object;)LV/P0;

    move-result-object v1

    new-array v4, v4, [LV/P0;

    aput-object v5, v4, v2

    const/4 v2, 0x1

    aput-object v1, v4, v2

    new-instance v1, LS/c1$b;

    move-object/from16 p0, v1

    move-object/from16 p1, v6

    move-object/from16 p2, v7

    move-wide/from16 p3, v8

    move/from16 p5, v3

    move-object/from16 p6, v13

    move/from16 p7, v12

    move-object/from16 p8, p9

    invoke-direct/range {p0 .. p8}, LS/c1$b;-><init>(Landroidx/compose/ui/d;Lo0/e2;JFLv/g;FLx7/p;)V

    const/16 v2, 0x36

    const v3, -0x43a11cd

    const/4 v5, 0x1

    invoke-static {v3, v5, v1, v0, v2}, Ld0/c;->e(IZLjava/lang/Object;LV/n;I)Ld0/a;

    move-result-object v1

    sget v2, LV/P0;->i:I

    or-int/lit8 v2, v2, 0x30

    invoke-static {v4, v1, v0, v2}, LV/y;->b([LV/P0;Lx7/p;LV/n;I)V

    invoke-static {}, LV/q;->H()Z

    move-result v0

    if-eqz v0, :cond_8

    invoke-static {}, LV/q;->P()V

    :cond_8
    return-void
.end method

.method public static final b(ZLx7/a;Landroidx/compose/ui/d;ZLo0/e2;JJFFLv/g;Lz/l;Lx7/p;LV/n;III)V
    .locals 19

    .prologue
    move-object/from16 v0, p14

    move/from16 v1, p15

    move/from16 v2, p17

    const/4 v3, 0x0

    and-int/lit8 v5, v2, 0x4

    if-eqz v5, :cond_0

    sget-object v5, Landroidx/compose/ui/d;->a:Landroidx/compose/ui/d$a;

    move-object v7, v5

    goto :goto_0

    :cond_0
    move-object/from16 v7, p2

    :goto_0
    and-int/lit8 v5, v2, 0x8

    if-eqz v5, :cond_1

    const/4 v15, 0x1

    goto :goto_1

    :cond_1
    move/from16 v15, p3

    :goto_1
    and-int/lit8 v5, v2, 0x10

    if-eqz v5, :cond_2

    invoke-static {}, Lo0/Y1;->a()Lo0/e2;

    move-result-object v5

    move-object v8, v5

    goto :goto_2

    :cond_2
    move-object/from16 v8, p4

    :goto_2
    and-int/lit8 v5, v2, 0x20

    if-eqz v5, :cond_3

    sget-object v5, LS/o0;->a:LS/o0;

    const/4 v6, 0x6

    invoke-virtual {v5, v0, v6}, LS/o0;->a(LV/n;I)LS/z;

    move-result-object v5

    invoke-virtual {v5}, LS/z;->O()J

    move-result-wide v5

    move-wide v9, v5

    goto :goto_3

    :cond_3
    move-wide/from16 v9, p5

    :goto_3
    and-int/lit8 v5, v2, 0x40

    if-eqz v5, :cond_4

    shr-int/lit8 v5, v1, 0xf

    and-int/lit8 v5, v5, 0xe

    invoke-static {v9, v10, v0, v5}, LS/A;->c(JLV/n;I)J

    move-result-wide v5

    goto :goto_4

    :cond_4
    move-wide/from16 v5, p7

    :goto_4
    and-int/lit16 v11, v2, 0x80

    if-eqz v11, :cond_5

    int-to-float v11, v3

    invoke-static {v11}, LY0/i;->q(F)F

    move-result v11

    goto :goto_5

    :cond_5
    move/from16 v11, p9

    :goto_5
    and-int/lit16 v12, v2, 0x100

    if-eqz v12, :cond_6

    int-to-float v12, v3

    invoke-static {v12}, LY0/i;->q(F)F

    move-result v12

    move/from16 v17, v12

    goto :goto_6

    :cond_6
    move/from16 v17, p10

    :goto_6
    and-int/lit16 v12, v2, 0x200

    const/4 v13, 0x0

    if-eqz v12, :cond_7

    move-object v12, v13

    goto :goto_7

    :cond_7
    move-object/from16 v12, p11

    :goto_7
    and-int/lit16 v2, v2, 0x400

    if-eqz v2, :cond_8

    move-object v14, v13

    goto :goto_8

    :cond_8
    move-object/from16 v14, p12

    :goto_8
    invoke-static {}, LV/q;->H()Z

    move-result v2

    if-eqz v2, :cond_9

    const v2, 0x20344540

    const-string v13, "androidx.compose.material3.Surface (Surface.kt:306)"

    move/from16 v4, p16

    invoke-static {v2, v1, v4, v13}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_9
    sget-object v1, LS/c1;->a:LV/O0;

    invoke-interface {v0, v1}, LV/n;->n(LV/w;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LY0/i;

    invoke-virtual {v2}, LY0/i;->v()F

    move-result v2

    add-float/2addr v2, v11

    invoke-static {v2}, LY0/i;->q(F)F

    move-result v11

    invoke-static {}, LS/J;->a()LV/O0;

    move-result-object v2

    invoke-static {v5, v6}, Lo0/y0;->i(J)Lo0/y0;

    move-result-object v4

    invoke-virtual {v2, v4}, LV/O0;->d(Ljava/lang/Object;)LV/P0;

    move-result-object v2

    invoke-static {v11}, LY0/i;->m(F)LY0/i;

    move-result-object v4

    invoke-virtual {v1, v4}, LV/O0;->d(Ljava/lang/Object;)LV/P0;

    move-result-object v1

    const/4 v4, 0x2

    new-array v4, v4, [LV/P0;

    aput-object v2, v4, v3

    const/4 v2, 0x1

    aput-object v1, v4, v2

    new-instance v1, LS/c1$d;

    move-object v6, v1

    move/from16 v13, p0

    move-object/from16 v16, p1

    move-object/from16 v18, p13

    invoke-direct/range {v6 .. v18}, LS/c1$d;-><init>(Landroidx/compose/ui/d;Lo0/e2;JFLv/g;ZLz/l;ZLx7/a;FLx7/p;)V

    const/16 v2, 0x36

    const v3, -0x45699780

    const/4 v5, 0x1

    invoke-static {v3, v5, v1, v0, v2}, Ld0/c;->e(IZLjava/lang/Object;LV/n;I)Ld0/a;

    move-result-object v1

    sget v2, LV/P0;->i:I

    or-int/lit8 v2, v2, 0x30

    invoke-static {v4, v1, v0, v2}, LV/y;->b([LV/P0;Lx7/p;LV/n;I)V

    invoke-static {}, LV/q;->H()Z

    move-result v0

    if-eqz v0, :cond_a

    invoke-static {}, LV/q;->P()V

    :cond_a
    return-void
.end method

.method public static final c(Lx7/a;Landroidx/compose/ui/d;ZLo0/e2;JJFFLv/g;Lz/l;Lx7/p;LV/n;III)V
    .locals 19

    .prologue
    move-object/from16 v0, p13

    move/from16 v1, p14

    move/from16 v2, p16

    const/4 v3, 0x0

    const/4 v5, 0x2

    and-int/lit8 v6, v2, 0x2

    if-eqz v6, :cond_0

    sget-object v6, Landroidx/compose/ui/d;->a:Landroidx/compose/ui/d$a;

    move-object v8, v6

    goto :goto_0

    :cond_0
    move-object/from16 v8, p1

    :goto_0
    and-int/lit8 v6, v2, 0x4

    if-eqz v6, :cond_1

    const/4 v15, 0x1

    goto :goto_1

    :cond_1
    move/from16 v15, p2

    :goto_1
    and-int/lit8 v6, v2, 0x8

    if-eqz v6, :cond_2

    invoke-static {}, Lo0/Y1;->a()Lo0/e2;

    move-result-object v6

    move-object v9, v6

    goto :goto_2

    :cond_2
    move-object/from16 v9, p3

    :goto_2
    and-int/lit8 v6, v2, 0x10

    if-eqz v6, :cond_3

    sget-object v6, LS/o0;->a:LS/o0;

    const/4 v7, 0x6

    invoke-virtual {v6, v0, v7}, LS/o0;->a(LV/n;I)LS/z;

    move-result-object v6

    invoke-virtual {v6}, LS/z;->O()J

    move-result-wide v6

    move-wide v10, v6

    goto :goto_3

    :cond_3
    move-wide/from16 v10, p4

    :goto_3
    and-int/lit8 v6, v2, 0x20

    if-eqz v6, :cond_4

    shr-int/lit8 v6, v1, 0xc

    and-int/lit8 v6, v6, 0xe

    invoke-static {v10, v11, v0, v6}, LS/A;->c(JLV/n;I)J

    move-result-wide v6

    goto :goto_4

    :cond_4
    move-wide/from16 v6, p6

    :goto_4
    and-int/lit8 v12, v2, 0x40

    if-eqz v12, :cond_5

    int-to-float v12, v3

    invoke-static {v12}, LY0/i;->q(F)F

    move-result v12

    goto :goto_5

    :cond_5
    move/from16 v12, p8

    :goto_5
    and-int/lit16 v13, v2, 0x80

    if-eqz v13, :cond_6

    int-to-float v13, v3

    invoke-static {v13}, LY0/i;->q(F)F

    move-result v13

    move/from16 v17, v13

    goto :goto_6

    :cond_6
    move/from16 v17, p9

    :goto_6
    and-int/lit16 v13, v2, 0x100

    const/4 v14, 0x0

    if-eqz v13, :cond_7

    move-object v13, v14

    goto :goto_7

    :cond_7
    move-object/from16 v13, p10

    :goto_7
    and-int/lit16 v2, v2, 0x200

    if-eqz v2, :cond_8

    goto :goto_8

    :cond_8
    move-object/from16 v14, p11

    :goto_8
    invoke-static {}, LV/q;->H()Z

    move-result v2

    if-eqz v2, :cond_9

    const v2, -0x2f12abe4

    const-string v4, "androidx.compose.material3.Surface (Surface.kt:203)"

    move/from16 v3, p15

    invoke-static {v2, v1, v3, v4}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_9
    sget-object v1, LS/c1;->a:LV/O0;

    invoke-interface {v0, v1}, LV/n;->n(LV/w;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LY0/i;

    invoke-virtual {v2}, LY0/i;->v()F

    move-result v2

    add-float/2addr v2, v12

    invoke-static {v2}, LY0/i;->q(F)F

    move-result v12

    invoke-static {}, LS/J;->a()LV/O0;

    move-result-object v2

    invoke-static {v6, v7}, Lo0/y0;->i(J)Lo0/y0;

    move-result-object v3

    invoke-virtual {v2, v3}, LV/O0;->d(Ljava/lang/Object;)LV/P0;

    move-result-object v2

    invoke-static {v12}, LY0/i;->m(F)LY0/i;

    move-result-object v3

    invoke-virtual {v1, v3}, LV/O0;->d(Ljava/lang/Object;)LV/P0;

    move-result-object v1

    new-array v3, v5, [LV/P0;

    const/4 v4, 0x0

    aput-object v2, v3, v4

    const/4 v2, 0x1

    aput-object v1, v3, v2

    new-instance v1, LS/c1$c;

    move-object v7, v1

    move-object/from16 v16, p0

    move-object/from16 v18, p12

    invoke-direct/range {v7 .. v18}, LS/c1$c;-><init>(Landroidx/compose/ui/d;Lo0/e2;JFLv/g;Lz/l;ZLx7/a;FLx7/p;)V

    const/16 v2, 0x36

    const v4, 0x4c46b75c    # 5.2092272E7f

    const/4 v5, 0x1

    invoke-static {v4, v5, v1, v0, v2}, Ld0/c;->e(IZLjava/lang/Object;LV/n;I)Ld0/a;

    move-result-object v1

    sget v2, LV/P0;->i:I

    or-int/lit8 v2, v2, 0x30

    invoke-static {v3, v1, v0, v2}, LV/y;->b([LV/P0;Lx7/p;LV/n;I)V

    invoke-static {}, LV/q;->H()Z

    move-result v0

    if-eqz v0, :cond_a

    invoke-static {}, LV/q;->P()V

    :cond_a
    return-void
.end method

.method public static final synthetic d(Landroidx/compose/ui/d;Lo0/e2;JLv/g;F)Landroidx/compose/ui/d;
    .locals 0

    invoke-static/range {p0 .. p5}, LS/c1;->f(Landroidx/compose/ui/d;Lo0/e2;JLv/g;F)Landroidx/compose/ui/d;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic e(JFLV/n;I)J
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, LS/c1;->g(JFLV/n;I)J

    move-result-wide p0

    return-wide p0
.end method

.method private static final f(Landroidx/compose/ui/d;Lo0/e2;JLv/g;F)Landroidx/compose/ui/d;
    .locals 23

    .prologue
    move-object/from16 v13, p1

    move-object/from16 v6, p4

    const/4 v0, 0x0

    cmpl-float v0, p5, v0

    if-lez v0, :cond_0

    sget-object v0, Landroidx/compose/ui/d;->a:Landroidx/compose/ui/d$a;

    const v21, 0x1e7df

    const/16 v22, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const-wide/16 v11, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const-wide/16 v16, 0x0

    const-wide/16 v18, 0x0

    const/16 v20, 0x0

    move/from16 v6, p5

    move-object/from16 v13, p1

    invoke-static/range {v0 .. v22}, Landroidx/compose/ui/graphics/b;->c(Landroidx/compose/ui/d;FFFFFFFFFFJLo0/e2;ZLo0/Z1;JJIILjava/lang/Object;)Landroidx/compose/ui/d;

    move-result-object v0

    :goto_0
    move-object/from16 v1, p0

    goto :goto_1

    :cond_0
    sget-object v0, Landroidx/compose/ui/d;->a:Landroidx/compose/ui/d$a;

    goto :goto_0

    :goto_1
    invoke-interface {v1, v0}, Landroidx/compose/ui/d;->b(Landroidx/compose/ui/d;)Landroidx/compose/ui/d;

    move-result-object v0

    move-object/from16 v1, p4

    if-eqz v1, :cond_1

    sget-object v2, Landroidx/compose/ui/d;->a:Landroidx/compose/ui/d$a;

    move-object/from16 v3, p1

    invoke-static {v2, v1, v3}, Lv/e;->e(Landroidx/compose/ui/d;Lv/g;Lo0/e2;)Landroidx/compose/ui/d;

    move-result-object v1

    goto :goto_2

    :cond_1
    move-object/from16 v3, p1

    sget-object v1, Landroidx/compose/ui/d;->a:Landroidx/compose/ui/d$a;

    :goto_2
    invoke-interface {v0, v1}, Landroidx/compose/ui/d;->b(Landroidx/compose/ui/d;)Landroidx/compose/ui/d;

    move-result-object v0

    move-wide/from16 v1, p2

    invoke-static {v0, v1, v2, v3}, Landroidx/compose/foundation/b;->a(Landroidx/compose/ui/d;JLo0/e2;)Landroidx/compose/ui/d;

    move-result-object v0

    invoke-static {v0, v3}, Ll0/e;->a(Landroidx/compose/ui/d;Lo0/e2;)Landroidx/compose/ui/d;

    move-result-object v0

    return-object v0
.end method

.method private static final g(JFLV/n;I)J
    .locals 8

    .prologue
    invoke-static {}, LV/q;->H()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    const-string v1, "androidx.compose.material3.surfaceColorAtElevation (Surface.kt:465)"

    const v2, -0x7bf9080a

    invoke-static {v2, p4, v0, v1}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_0
    sget-object v0, LS/o0;->a:LS/o0;

    const/4 v1, 0x6

    invoke-virtual {v0, p3, v1}, LS/o0;->a(LV/n;I)LS/z;

    move-result-object v2

    shl-int/lit8 p4, p4, 0x3

    and-int/lit16 v7, p4, 0x3f0

    move-wide v3, p0

    move v5, p2

    move-object v6, p3

    invoke-static/range {v2 .. v7}, LS/A;->a(LS/z;JFLV/n;I)J

    move-result-wide p0

    invoke-static {}, LV/q;->H()Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-static {}, LV/q;->P()V

    :cond_1
    return-wide p0
.end method
