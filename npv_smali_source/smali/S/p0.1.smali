.class public abstract LS/p0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:LV/O0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, LS/p0$a;->D:LS/p0$a;

    invoke-static {v0}, LV/y;->f(Lx7/a;)LV/O0;

    move-result-object v0

    sput-object v0, LS/p0;->a:LV/O0;

    return-void
.end method

.method public static final a(LS/z;LS/S0;LS/A1;Lx7/p;LV/n;II)V
    .locals 18

    .prologue
    move-object/from16 v4, p3

    move/from16 v5, p5

    const/4 v0, 0x2

    const/4 v1, 0x4

    const/4 v2, 0x1

    const v3, -0x7ec9fb7e

    move-object/from16 v6, p4

    invoke-interface {v6, v3}, LV/n;->r(I)LV/n;

    move-result-object v13

    const/4 v14, 0x6

    and-int/lit8 v6, v5, 0x6

    if-nez v6, :cond_2

    and-int/lit8 v6, p6, 0x1

    if-nez v6, :cond_0

    move-object/from16 v6, p0

    invoke-interface {v13, v6}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_1

    move v7, v1

    goto :goto_0

    :cond_0
    move-object/from16 v6, p0

    :cond_1
    move v7, v0

    :goto_0
    or-int/2addr v7, v5

    goto :goto_1

    :cond_2
    move-object/from16 v6, p0

    move v7, v5

    :goto_1
    and-int/lit8 v8, v5, 0x30

    if-nez v8, :cond_5

    and-int/lit8 v8, p6, 0x2

    if-nez v8, :cond_3

    move-object/from16 v8, p1

    invoke-interface {v13, v8}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_4

    const/16 v9, 0x20

    goto :goto_2

    :cond_3
    move-object/from16 v8, p1

    :cond_4
    const/16 v9, 0x10

    :goto_2
    or-int/2addr v7, v9

    goto :goto_3

    :cond_5
    move-object/from16 v8, p1

    :goto_3
    and-int/lit16 v9, v5, 0x180

    if-nez v9, :cond_8

    and-int/lit8 v9, p6, 0x4

    if-nez v9, :cond_6

    move-object/from16 v9, p2

    invoke-interface {v13, v9}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_7

    const/16 v10, 0x100

    goto :goto_4

    :cond_6
    move-object/from16 v9, p2

    :cond_7
    const/16 v10, 0x80

    :goto_4
    or-int/2addr v7, v10

    goto :goto_5

    :cond_8
    move-object/from16 v9, p2

    :goto_5
    and-int/lit8 v10, p6, 0x8

    if-eqz v10, :cond_9

    or-int/lit16 v7, v7, 0xc00

    goto :goto_7

    :cond_9
    and-int/lit16 v10, v5, 0xc00

    if-nez v10, :cond_b

    invoke-interface {v13, v4}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_a

    const/16 v10, 0x800

    goto :goto_6

    :cond_a
    const/16 v10, 0x400

    :goto_6
    or-int/2addr v7, v10

    :cond_b
    :goto_7
    and-int/lit16 v10, v7, 0x493

    const/16 v11, 0x492

    if-ne v10, v11, :cond_d

    invoke-interface {v13}, LV/n;->u()Z

    move-result v10

    if-nez v10, :cond_c

    goto :goto_8

    :cond_c
    invoke-interface {v13}, LV/n;->A()V

    move-object v1, v6

    move-object v2, v8

    move-object v3, v9

    goto/16 :goto_c

    :cond_d
    :goto_8
    invoke-interface {v13}, LV/n;->q()V

    and-int/lit8 v10, v5, 0x1

    if-eqz v10, :cond_12

    invoke-interface {v13}, LV/n;->G()Z

    move-result v10

    if-eqz v10, :cond_e

    goto :goto_a

    :cond_e
    invoke-interface {v13}, LV/n;->A()V

    and-int/lit8 v10, p6, 0x1

    if-eqz v10, :cond_f

    and-int/lit8 v7, v7, -0xf

    :cond_f
    and-int/lit8 v10, p6, 0x2

    if-eqz v10, :cond_10

    and-int/lit8 v7, v7, -0x71

    :cond_10
    and-int/lit8 v10, p6, 0x4

    if-eqz v10, :cond_11

    :goto_9
    and-int/lit16 v7, v7, -0x381

    :cond_11
    move-object v15, v6

    move v10, v7

    move-object v12, v8

    move-object v11, v9

    goto :goto_b

    :cond_12
    :goto_a
    and-int/lit8 v10, p6, 0x1

    if-eqz v10, :cond_13

    sget-object v6, LS/o0;->a:LS/o0;

    invoke-virtual {v6, v13, v14}, LS/o0;->a(LV/n;I)LS/z;

    move-result-object v6

    and-int/lit8 v7, v7, -0xf

    :cond_13
    and-int/lit8 v10, p6, 0x2

    if-eqz v10, :cond_14

    sget-object v8, LS/o0;->a:LS/o0;

    invoke-virtual {v8, v13, v14}, LS/o0;->b(LV/n;I)LS/S0;

    move-result-object v8

    and-int/lit8 v7, v7, -0x71

    :cond_14
    and-int/lit8 v10, p6, 0x4

    if-eqz v10, :cond_11

    sget-object v9, LS/o0;->a:LS/o0;

    invoke-virtual {v9, v13, v14}, LS/o0;->c(LV/n;I)LS/A1;

    move-result-object v9

    goto :goto_9

    :goto_b
    invoke-interface {v13}, LV/n;->R()V

    invoke-static {}, LV/q;->H()Z

    move-result v6

    if-eqz v6, :cond_15

    const/4 v6, -0x1

    const-string v7, "androidx.compose.material3.MaterialTheme (MaterialTheme.kt:55)"

    invoke-static {v3, v10, v6, v7}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_15
    const/4 v3, 0x0

    const/16 v16, 0x7

    const/4 v6, 0x0

    const/4 v7, 0x0

    const-wide/16 v8, 0x0

    move/from16 v17, v10

    move-object v10, v13

    move-object v1, v11

    move v11, v3

    move-object v3, v12

    move/from16 v12, v16

    invoke-static/range {v6 .. v12}, LS/I0;->c(ZFJLV/n;II)Lv/G;

    move-result-object v6

    and-int/lit8 v7, v17, 0xe

    invoke-static {v15, v13, v7}, LS/p0;->b(LS/z;LV/n;I)LN/J;

    move-result-object v7

    invoke-static {}, LS/A;->g()LV/O0;

    move-result-object v8

    invoke-virtual {v8, v15}, LV/O0;->d(Ljava/lang/Object;)LV/P0;

    move-result-object v8

    invoke-static {}, Landroidx/compose/foundation/h;->a()LV/O0;

    move-result-object v9

    invoke-virtual {v9, v6}, LV/O0;->d(Ljava/lang/Object;)LV/P0;

    move-result-object v6

    invoke-static {}, LR/s;->d()LV/O0;

    move-result-object v9

    sget-object v10, LS/B;->b:LS/B;

    invoke-virtual {v9, v10}, LV/O0;->d(Ljava/lang/Object;)LV/P0;

    move-result-object v9

    invoke-static {}, LS/T0;->d()LV/O0;

    move-result-object v10

    invoke-virtual {v10, v3}, LV/O0;->d(Ljava/lang/Object;)LV/P0;

    move-result-object v10

    invoke-static {}, LN/K;->b()LV/O0;

    move-result-object v11

    invoke-virtual {v11, v7}, LV/O0;->d(Ljava/lang/Object;)LV/P0;

    move-result-object v7

    invoke-static {}, LS/B1;->b()LV/O0;

    move-result-object v11

    invoke-virtual {v11, v1}, LV/O0;->d(Ljava/lang/Object;)LV/P0;

    move-result-object v11

    new-array v12, v14, [LV/P0;

    const/4 v14, 0x0

    aput-object v8, v12, v14

    aput-object v6, v12, v2

    aput-object v9, v12, v0

    const/4 v0, 0x3

    aput-object v10, v12, v0

    const/4 v0, 0x4

    aput-object v7, v12, v0

    const/4 v0, 0x5

    aput-object v11, v12, v0

    new-instance v0, LS/p0$b;

    invoke-direct {v0, v1, v4}, LS/p0$b;-><init>(LS/A1;Lx7/p;)V

    const/16 v6, 0x36

    const v7, -0x3f9276be

    invoke-static {v7, v2, v0, v13, v6}, Ld0/c;->e(IZLjava/lang/Object;LV/n;I)Ld0/a;

    move-result-object v0

    sget v2, LV/P0;->i:I

    or-int/lit8 v2, v2, 0x30

    invoke-static {v12, v0, v13, v2}, LV/y;->b([LV/P0;Lx7/p;LV/n;I)V

    invoke-static {}, LV/q;->H()Z

    move-result v0

    if-eqz v0, :cond_16

    invoke-static {}, LV/q;->P()V

    :cond_16
    move-object v2, v3

    move-object v3, v1

    move-object v1, v15

    :goto_c
    invoke-interface {v13}, LV/n;->x()LV/e1;

    move-result-object v7

    if-eqz v7, :cond_17

    new-instance v8, LS/p0$c;

    move-object v0, v8

    move-object/from16 v4, p3

    move/from16 v5, p5

    move/from16 v6, p6

    invoke-direct/range {v0 .. v6}, LS/p0$c;-><init>(LS/z;LS/S0;LS/A1;Lx7/p;II)V

    invoke-interface {v7, v8}, LV/e1;->a(Lx7/p;)V

    :cond_17
    return-void
.end method

.method public static final b(LS/z;LV/n;I)LN/J;
    .locals 11

    .prologue
    invoke-static {}, LV/q;->H()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    const-string v1, "androidx.compose.material3.rememberTextSelectionColors (MaterialTheme.kt:159)"

    const v2, 0x6f3fd9d8

    invoke-static {v2, p2, v0, v1}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_0
    invoke-virtual {p0}, LS/z;->J()J

    move-result-wide v0

    invoke-interface {p1, v0, v1}, LV/n;->j(J)Z

    move-result p0

    invoke-interface {p1}, LV/n;->g()Ljava/lang/Object;

    move-result-object p2

    if-nez p0, :cond_1

    sget-object p0, LV/n;->a:LV/n$a;

    invoke-virtual {p0}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object p0

    if-ne p2, p0, :cond_2

    :cond_1
    new-instance p2, LN/J;

    const/16 v9, 0xe

    const/4 v10, 0x0

    const v5, 0x3ecccccd    # 0.4f

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-wide v3, v0

    invoke-static/range {v3 .. v10}, Lo0/y0;->m(JFFFFILjava/lang/Object;)J

    move-result-wide v6

    const/4 v8, 0x0

    move-object v3, p2

    move-wide v4, v0

    invoke-direct/range {v3 .. v8}, LN/J;-><init>(JJLy7/k;)V

    invoke-interface {p1, p2}, LV/n;->K(Ljava/lang/Object;)V

    :cond_2
    check-cast p2, LN/J;

    invoke-static {}, LV/q;->H()Z

    move-result p0

    if-eqz p0, :cond_3

    invoke-static {}, LV/q;->P()V

    :cond_3
    return-object p2
.end method
