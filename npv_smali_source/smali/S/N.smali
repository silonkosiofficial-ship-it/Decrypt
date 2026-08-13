.class public final LS/N;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LS/N;

.field private static final b:LE7/i;

.field private static final c:F

.field private static final d:LS/P0;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, LS/N;

    invoke-direct {v0}, LS/N;-><init>()V

    sput-object v0, LS/N;->a:LS/N;

    new-instance v0, LE7/i;

    const/16 v1, 0x76c

    const/16 v2, 0x834

    invoke-direct {v0, v1, v2}, LE7/i;-><init>(II)V

    sput-object v0, LS/N;->b:LE7/i;

    sget-object v0, LU/j;->a:LU/j;

    invoke-virtual {v0}, LU/j;->a()F

    move-result v0

    sput v0, LS/N;->c:F

    new-instance v0, LS/N$a;

    invoke-direct {v0}, LS/N$a;-><init>()V

    sput-object v0, LS/N;->d:LS/P0;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic e(LS/N;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)LS/Q;
    .locals 0

    .prologue
    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    const-string p1, "yMMMM"

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    const-string p2, "yMMMd"

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    const-string p3, "yMMMMEEEEd"

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, LS/N;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)LS/Q;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a(Ljava/lang/Long;ILS/Q;Landroidx/compose/ui/d;LV/n;II)V
    .locals 36

    .prologue
    move-object/from16 v6, p1

    move/from16 v7, p2

    move-object/from16 v8, p3

    move/from16 v9, p6

    const/4 v10, 0x0

    const/4 v0, 0x2

    const/4 v1, 0x4

    const v2, 0x59937465

    move-object/from16 v3, p5

    invoke-interface {v3, v2}, LV/n;->r(I)LV/n;

    move-result-object v11

    const/4 v12, 0x1

    and-int/lit8 v3, p7, 0x1

    if-eqz v3, :cond_0

    or-int/lit8 v3, v9, 0x6

    goto :goto_1

    :cond_0
    and-int/lit8 v3, v9, 0x6

    if-nez v3, :cond_2

    invoke-interface {v11, v6}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    move v3, v1

    goto :goto_0

    :cond_1
    move v3, v0

    :goto_0
    or-int/2addr v3, v9

    goto :goto_1

    :cond_2
    move v3, v9

    :goto_1
    and-int/lit8 v0, p7, 0x2

    if-eqz v0, :cond_3

    or-int/lit8 v3, v3, 0x30

    goto :goto_3

    :cond_3
    and-int/lit8 v0, v9, 0x30

    if-nez v0, :cond_5

    invoke-interface {v11, v7}, LV/n;->i(I)Z

    move-result v0

    if-eqz v0, :cond_4

    const/16 v0, 0x20

    goto :goto_2

    :cond_4
    const/16 v0, 0x10

    :goto_2
    or-int/2addr v3, v0

    :cond_5
    :goto_3
    and-int/lit8 v0, p7, 0x4

    if-eqz v0, :cond_6

    or-int/lit16 v3, v3, 0x180

    goto :goto_6

    :cond_6
    and-int/lit16 v0, v9, 0x180

    if-nez v0, :cond_9

    and-int/lit16 v0, v9, 0x200

    if-nez v0, :cond_7

    invoke-interface {v11, v8}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_4

    :cond_7
    invoke-interface {v11, v8}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v0

    :goto_4
    if-eqz v0, :cond_8

    const/16 v0, 0x100

    goto :goto_5

    :cond_8
    const/16 v0, 0x80

    :goto_5
    or-int/2addr v3, v0

    :cond_9
    :goto_6
    and-int/lit8 v0, p7, 0x8

    if-eqz v0, :cond_b

    or-int/lit16 v3, v3, 0xc00

    :cond_a
    move-object/from16 v1, p4

    goto :goto_8

    :cond_b
    and-int/lit16 v1, v9, 0xc00

    if-nez v1, :cond_a

    move-object/from16 v1, p4

    invoke-interface {v11, v1}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_c

    const/16 v4, 0x800

    goto :goto_7

    :cond_c
    const/16 v4, 0x400

    :goto_7
    or-int/2addr v3, v4

    :goto_8
    and-int/lit16 v4, v3, 0x493

    const/16 v5, 0x492

    if-ne v4, v5, :cond_e

    invoke-interface {v11}, LV/n;->u()Z

    move-result v4

    if-nez v4, :cond_d

    goto :goto_9

    :cond_d
    invoke-interface {v11}, LV/n;->A()V

    move-object v5, v1

    move-object v1, v11

    goto/16 :goto_12

    :cond_e
    :goto_9
    if-eqz v0, :cond_f

    sget-object v0, Landroidx/compose/ui/d;->a:Landroidx/compose/ui/d$a;

    move-object v15, v0

    goto :goto_a

    :cond_f
    move-object v15, v1

    :goto_a
    invoke-static {}, LV/q;->H()Z

    move-result v0

    if-eqz v0, :cond_10

    const/4 v0, -0x1

    const-string v1, "androidx.compose.material3.DatePickerDefaults.DatePickerHeadline (DatePicker.kt:654)"

    invoke-static {v2, v3, v0, v1}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_10
    invoke-static {v11, v10}, LS/o;->a(LV/n;I)Ljava/util/Locale;

    move-result-object v13

    const/4 v4, 0x4

    const/4 v5, 0x0

    const/4 v3, 0x0

    move-object/from16 v0, p3

    move-object/from16 v1, p1

    move-object v2, v13

    invoke-static/range {v0 .. v5}, LS/P;->a(LS/Q;Ljava/lang/Long;Ljava/util/Locale;ZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v8, v6, v13, v12}, LS/Q;->a(Ljava/lang/Long;Ljava/util/Locale;Z)Ljava/lang/String;

    move-result-object v1

    const v2, 0x4479d549

    invoke-interface {v11, v2}, LV/n;->T(I)V

    const-string v2, ""

    if-nez v1, :cond_13

    sget-object v1, LS/Y;->b:LS/Y$a;

    invoke-virtual {v1}, LS/Y$a;->b()I

    move-result v3

    invoke-static {v7, v3}, LS/Y;->f(II)Z

    move-result v3

    if-eqz v3, :cond_11

    const v1, 0x4479f3c0

    invoke-interface {v11, v1}, LV/n;->T(I)V

    sget-object v1, LT/x;->a:LT/x$a;

    sget v1, LS/C0;->l:I

    :goto_b
    invoke-static {v1}, LT/x;->a(I)I

    move-result v1

    invoke-static {v1, v11, v10}, LT/y;->a(ILV/n;I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v11}, LV/n;->J()V

    goto :goto_c

    :cond_11
    invoke-virtual {v1}, LS/Y$a;->a()I

    move-result v1

    invoke-static {v7, v1}, LS/Y;->f(II)Z

    move-result v1

    if-eqz v1, :cond_12

    const v1, 0x4479ff5b    # 999.9899f

    invoke-interface {v11, v1}, LV/n;->T(I)V

    sget-object v1, LT/x;->a:LT/x$a;

    sget v1, LS/C0;->g:I

    goto :goto_b

    :cond_12
    const v1, 0x4ac70951    # 6522024.5f

    invoke-interface {v11, v1}, LV/n;->T(I)V

    invoke-interface {v11}, LV/n;->J()V

    move-object v1, v2

    :cond_13
    :goto_c
    invoke-interface {v11}, LV/n;->J()V

    const v3, 0x447a1131    # 1000.2686f

    invoke-interface {v11, v3}, LV/n;->T(I)V

    if-nez v0, :cond_16

    sget-object v0, LS/Y;->b:LS/Y$a;

    invoke-virtual {v0}, LS/Y$a;->b()I

    move-result v3

    invoke-static {v7, v3}, LS/Y;->f(II)Z

    move-result v3

    if-eqz v3, :cond_14

    const v0, 0x447a1c52    # 1000.4425f

    invoke-interface {v11, v0}, LV/n;->T(I)V

    sget-object v0, LT/x;->a:LT/x$a;

    sget v0, LS/C0;->i:I

    :goto_d
    invoke-static {v0}, LT/x;->a(I)I

    move-result v0

    invoke-static {v0, v11, v10}, LT/y;->a(ILV/n;I)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v11}, LV/n;->J()V

    goto :goto_e

    :cond_14
    invoke-virtual {v0}, LS/Y$a;->a()I

    move-result v0

    invoke-static {v7, v0}, LS/Y;->f(II)Z

    move-result v0

    if-eqz v0, :cond_15

    const v0, 0x447a2631    # 1000.59674f

    invoke-interface {v11, v0}, LV/n;->T(I)V

    sget-object v0, LT/x;->a:LT/x$a;

    sget v0, LS/C0;->a:I

    goto :goto_d

    :cond_15
    const v0, 0x4acb97b1    # 6671320.5f

    invoke-interface {v11, v0}, LV/n;->T(I)V

    invoke-interface {v11}, LV/n;->J()V

    move-object v0, v2

    :cond_16
    :goto_e
    invoke-interface {v11}, LV/n;->J()V

    sget-object v3, LS/Y;->b:LS/Y$a;

    invoke-virtual {v3}, LS/Y$a;->b()I

    move-result v4

    invoke-static {v7, v4}, LS/Y;->f(II)Z

    move-result v4

    if-eqz v4, :cond_17

    const v2, 0x447a3e3d    # 1000.9725f

    invoke-interface {v11, v2}, LV/n;->T(I)V

    sget-object v2, LT/x;->a:LT/x$a;

    sget v2, LS/C0;->j:I

    :goto_f
    invoke-static {v2}, LT/x;->a(I)I

    move-result v2

    invoke-static {v2, v11, v10}, LT/y;->a(ILV/n;I)Ljava/lang/String;

    move-result-object v2

    :goto_10
    invoke-interface {v11}, LV/n;->J()V

    goto :goto_11

    :cond_17
    invoke-virtual {v3}, LS/Y$a;->a()I

    move-result v3

    invoke-static {v7, v3}, LS/Y;->f(II)Z

    move-result v3

    if-eqz v3, :cond_18

    const v2, 0x447a48fc

    invoke-interface {v11, v2}, LV/n;->T(I)V

    sget-object v2, LT/x;->a:LT/x$a;

    sget v2, LS/C0;->b:I

    goto :goto_f

    :cond_18
    const v3, 0x4acfe811    # 6812680.5f

    invoke-interface {v11, v3}, LV/n;->T(I)V

    goto :goto_10

    :goto_11
    new-array v3, v12, [Ljava/lang/Object;

    aput-object v1, v3, v10

    invoke-static {v3, v12}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v1

    invoke-static {v2, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "format(this, *args)"

    invoke-static {v1, v2}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v11, v1}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v2

    invoke-interface {v11}, LV/n;->g()Ljava/lang/Object;

    move-result-object v3

    if-nez v2, :cond_19

    sget-object v2, LV/n;->a:LV/n$a;

    invoke-virtual {v2}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object v2

    if-ne v3, v2, :cond_1a

    :cond_19
    new-instance v3, LS/N$b;

    invoke-direct {v3, v1}, LS/N$b;-><init>(Ljava/lang/String;)V

    invoke-interface {v11, v3}, LV/n;->K(Ljava/lang/Object;)V

    :cond_1a
    check-cast v3, Lx7/l;

    const/4 v1, 0x0

    invoke-static {v15, v10, v3, v12, v1}, LK0/n;->d(Landroidx/compose/ui/d;ZLx7/l;ILjava/lang/Object;)Landroidx/compose/ui/d;

    move-result-object v12

    const/16 v34, 0xc00

    const v35, 0x1dffc

    const-wide/16 v13, 0x0

    const-wide/16 v1, 0x0

    move-object v3, v15

    move-wide v15, v1

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const-wide/16 v20, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const-wide/16 v24, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x1

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v33, 0x0

    move-object v1, v11

    move-object v11, v0

    move-object/from16 v32, v1

    invoke-static/range {v11 .. v35}, LS/m1;->b(Ljava/lang/String;Landroidx/compose/ui/d;JJLR0/o;LR0/q;LR0/h;JLX0/k;LX0/j;JIZIILx7/l;LM0/P;LV/n;III)V

    invoke-static {}, LV/q;->H()Z

    move-result v0

    if-eqz v0, :cond_1b

    invoke-static {}, LV/q;->P()V

    :cond_1b
    move-object v5, v3

    :goto_12
    invoke-interface {v1}, LV/n;->x()LV/e1;

    move-result-object v10

    if-eqz v10, :cond_1c

    new-instance v11, LS/N$c;

    move-object v0, v11

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move/from16 v3, p2

    move-object/from16 v4, p3

    move/from16 v6, p6

    move/from16 v7, p7

    invoke-direct/range {v0 .. v7}, LS/N$c;-><init>(LS/N;Ljava/lang/Long;ILS/Q;Landroidx/compose/ui/d;II)V

    invoke-interface {v10, v11}, LV/e1;->a(Lx7/p;)V

    :cond_1c
    return-void
.end method

.method public final b(ILandroidx/compose/ui/d;LV/n;II)V
    .locals 28

    .prologue
    move/from16 v2, p1

    const/4 v0, 0x2

    const v1, 0x1383ef3b

    move-object/from16 v3, p3

    invoke-interface {v3, v1}, LV/n;->r(I)LV/n;

    move-result-object v4

    and-int/lit8 v3, p5, 0x1

    if-eqz v3, :cond_0

    or-int/lit8 v3, p4, 0x6

    goto :goto_1

    :cond_0
    and-int/lit8 v3, p4, 0x6

    if-nez v3, :cond_2

    invoke-interface {v4, v2}, LV/n;->i(I)Z

    move-result v3

    if-eqz v3, :cond_1

    const/4 v3, 0x4

    goto :goto_0

    :cond_1
    move v3, v0

    :goto_0
    or-int v3, p4, v3

    goto :goto_1

    :cond_2
    move/from16 v3, p4

    :goto_1
    and-int/lit8 v0, p5, 0x2

    if-eqz v0, :cond_4

    or-int/lit8 v3, v3, 0x30

    :cond_3
    move-object/from16 v5, p2

    :goto_2
    move v6, v3

    goto :goto_4

    :cond_4
    and-int/lit8 v5, p4, 0x30

    if-nez v5, :cond_3

    move-object/from16 v5, p2

    invoke-interface {v4, v5}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_5

    const/16 v6, 0x20

    goto :goto_3

    :cond_5
    const/16 v6, 0x10

    :goto_3
    or-int/2addr v3, v6

    goto :goto_2

    :goto_4
    and-int/lit8 v3, v6, 0x13

    const/16 v7, 0x12

    if-ne v3, v7, :cond_7

    invoke-interface {v4}, LV/n;->u()Z

    move-result v3

    if-nez v3, :cond_6

    goto :goto_5

    :cond_6
    invoke-interface {v4}, LV/n;->A()V

    move-object v1, v4

    move-object v3, v5

    goto/16 :goto_a

    :cond_7
    :goto_5
    if-eqz v0, :cond_8

    sget-object v0, Landroidx/compose/ui/d;->a:Landroidx/compose/ui/d$a;

    goto :goto_6

    :cond_8
    move-object v0, v5

    :goto_6
    invoke-static {}, LV/q;->H()Z

    move-result v3

    if-eqz v3, :cond_9

    const/4 v3, -0x1

    const-string v5, "androidx.compose.material3.DatePickerDefaults.DatePickerTitle (DatePicker.kt:629)"

    invoke-static {v1, v6, v3, v5}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_9
    sget-object v1, LS/Y;->b:LS/Y$a;

    invoke-virtual {v1}, LS/Y$a;->b()I

    move-result v3

    invoke-static {v2, v3}, LS/Y;->f(II)Z

    move-result v3

    const/4 v5, 0x0

    if-eqz v3, :cond_a

    const v1, 0x1839c4ec

    invoke-interface {v4, v1}, LV/n;->T(I)V

    sget-object v1, LT/x;->a:LT/x$a;

    sget v1, LS/C0;->u:I

    :goto_7
    invoke-static {v1}, LT/x;->a(I)I

    move-result v1

    invoke-static {v1, v4, v5}, LT/y;->a(ILV/n;I)Ljava/lang/String;

    move-result-object v3

    and-int/lit8 v25, v6, 0x70

    const/16 v26, 0x0

    const v27, 0x1fffc

    const-wide/16 v5, 0x0

    const-wide/16 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const-wide/16 v12, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const-wide/16 v16, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    move-object v1, v4

    move-object v4, v0

    move-object/from16 v24, v1

    invoke-static/range {v3 .. v27}, LS/m1;->b(Ljava/lang/String;Landroidx/compose/ui/d;JJLR0/o;LR0/q;LR0/h;JLX0/k;LX0/j;JIZIILx7/l;LM0/P;LV/n;III)V

    :goto_8
    invoke-interface {v1}, LV/n;->J()V

    goto :goto_9

    :cond_a
    invoke-virtual {v1}, LS/Y$a;->a()I

    move-result v1

    invoke-static {v2, v1}, LS/Y;->f(II)Z

    move-result v1

    if-eqz v1, :cond_b

    const v1, 0x1839d4cb

    invoke-interface {v4, v1}, LV/n;->T(I)V

    sget-object v1, LT/x;->a:LT/x$a;

    sget v1, LS/C0;->h:I

    goto :goto_7

    :cond_b
    move-object v1, v4

    const v3, -0x10fdf75d

    invoke-interface {v1, v3}, LV/n;->T(I)V

    goto :goto_8

    :goto_9
    invoke-static {}, LV/q;->H()Z

    move-result v3

    if-eqz v3, :cond_c

    invoke-static {}, LV/q;->P()V

    :cond_c
    move-object v3, v0

    :goto_a
    invoke-interface {v1}, LV/n;->x()LV/e1;

    move-result-object v6

    if-eqz v6, :cond_d

    new-instance v7, LS/N$d;

    move-object v0, v7

    move-object/from16 v1, p0

    move/from16 v2, p1

    move/from16 v4, p4

    move/from16 v5, p5

    invoke-direct/range {v0 .. v5}, LS/N$d;-><init>(LS/N;ILandroidx/compose/ui/d;II)V

    invoke-interface {v6, v7}, LV/e1;->a(Lx7/p;)V

    :cond_d
    return-void
.end method

.method public final c(LV/n;I)LS/M;
    .locals 3

    .prologue
    invoke-static {}, LV/q;->H()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    const-string v1, "androidx.compose.material3.DatePickerDefaults.colors (DatePicker.kt:432)"

    const v2, -0x1067849b

    invoke-static {v2, p2, v0, v1}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_0
    sget-object v0, LS/o0;->a:LS/o0;

    const/4 v1, 0x6

    invoke-virtual {v0, p1, v1}, LS/o0;->a(LV/n;I)LS/z;

    move-result-object v0

    shl-int/lit8 p2, p2, 0x3

    and-int/lit8 p2, p2, 0x70

    invoke-virtual {p0, v0, p1, p2}, LS/N;->g(LS/z;LV/n;I)LS/M;

    move-result-object p1

    invoke-static {}, LV/q;->H()Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-static {}, LV/q;->P()V

    :cond_1
    return-object p1
.end method

.method public final d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)LS/Q;
    .locals 1

    new-instance v0, LS/S;

    invoke-direct {v0, p1, p2, p3}, LS/S;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public final f()LS/P0;
    .locals 1

    sget-object v0, LS/N;->d:LS/P0;

    return-object v0
.end method

.method public final g(LS/z;LV/n;I)LS/M;
    .locals 56

    .prologue
    move-object/from16 v0, p1

    move-object/from16 v1, p2

    move/from16 v2, p3

    invoke-static {}, LV/q;->H()Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v3, -0x1

    const-string v4, "androidx.compose.material3.DatePickerDefaults.<get-defaultDatePickerColors> (DatePicker.kt:531)"

    const v5, 0x465dd82c

    invoke-static {v5, v2, v3, v4}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_0
    invoke-virtual/range {p1 .. p1}, LS/z;->f()LS/M;

    move-result-object v3

    const v4, -0x26f6618d

    invoke-interface {v1, v4}, LV/n;->T(I)V

    if-nez v3, :cond_1

    sget-object v3, LU/f;->a:LU/f;

    invoke-virtual {v3}, LU/f;->a()LU/e;

    move-result-object v4

    invoke-static {v0, v4}, LS/A;->f(LS/z;LU/e;)J

    move-result-wide v6

    invoke-virtual {v3}, LU/f;->r()LU/e;

    move-result-object v4

    invoke-static {v0, v4}, LS/A;->f(LS/z;LU/e;)J

    move-result-wide v8

    invoke-virtual {v3}, LU/f;->p()LU/e;

    move-result-object v4

    invoke-static {v0, v4}, LS/A;->f(LS/z;LU/e;)J

    move-result-wide v10

    invoke-virtual {v3}, LU/f;->D()LU/e;

    move-result-object v4

    invoke-static {v0, v4}, LS/A;->f(LS/z;LU/e;)J

    move-result-wide v12

    invoke-virtual {v3}, LU/f;->u()LU/e;

    move-result-object v4

    invoke-static {v0, v4}, LS/A;->f(LS/z;LU/e;)J

    move-result-wide v14

    invoke-virtual/range {p1 .. p1}, LS/z;->E()J

    move-result-wide v16

    invoke-virtual {v3}, LU/f;->C()LU/e;

    move-result-object v4

    invoke-static {v0, v4}, LS/A;->f(LS/z;LU/e;)J

    move-result-wide v18

    invoke-virtual {v3}, LU/f;->C()LU/e;

    move-result-object v4

    invoke-static {v0, v4}, LS/A;->f(LS/z;LU/e;)J

    move-result-wide v20

    const/16 v26, 0xe

    const/16 v27, 0x0

    const v22, 0x3ec28f5c    # 0.38f

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    invoke-static/range {v20 .. v27}, Lo0/y0;->m(JFFFFILjava/lang/Object;)J

    move-result-wide v20

    invoke-virtual {v3}, LU/f;->m()LU/e;

    move-result-object v4

    invoke-static {v0, v4}, LS/A;->f(LS/z;LU/e;)J

    move-result-wide v22

    invoke-virtual {v3}, LU/f;->A()LU/e;

    move-result-object v4

    invoke-static {v0, v4}, LS/A;->f(LS/z;LU/e;)J

    move-result-wide v24

    invoke-virtual {v3}, LU/f;->A()LU/e;

    move-result-object v4

    invoke-static {v0, v4}, LS/A;->f(LS/z;LU/e;)J

    move-result-wide v26

    const/16 v32, 0xe

    const/16 v33, 0x0

    const v28, 0x3ec28f5c    # 0.38f

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    invoke-static/range {v26 .. v33}, Lo0/y0;->m(JFFFFILjava/lang/Object;)J

    move-result-wide v26

    invoke-virtual {v3}, LU/f;->z()LU/e;

    move-result-object v4

    invoke-static {v0, v4}, LS/A;->f(LS/z;LU/e;)J

    move-result-wide v28

    invoke-virtual {v3}, LU/f;->z()LU/e;

    move-result-object v4

    invoke-static {v0, v4}, LS/A;->f(LS/z;LU/e;)J

    move-result-wide v30

    const/16 v36, 0xe

    const/16 v37, 0x0

    const v32, 0x3ec28f5c    # 0.38f

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    invoke-static/range {v30 .. v37}, Lo0/y0;->m(JFFFFILjava/lang/Object;)J

    move-result-wide v30

    invoke-virtual {v3}, LU/f;->n()LU/e;

    move-result-object v4

    invoke-static {v0, v4}, LS/A;->f(LS/z;LU/e;)J

    move-result-wide v32

    invoke-virtual {v3}, LU/f;->n()LU/e;

    move-result-object v4

    invoke-static {v0, v4}, LS/A;->f(LS/z;LU/e;)J

    move-result-wide v34

    const/16 v40, 0xe

    const/16 v41, 0x0

    const v36, 0x3ec28f5c    # 0.38f

    const/16 v37, 0x0

    const/16 v38, 0x0

    const/16 v39, 0x0

    invoke-static/range {v34 .. v41}, Lo0/y0;->m(JFFFFILjava/lang/Object;)J

    move-result-wide v34

    invoke-virtual {v3}, LU/f;->h()LU/e;

    move-result-object v4

    invoke-static {v0, v4}, LS/A;->f(LS/z;LU/e;)J

    move-result-wide v36

    invoke-virtual {v3}, LU/f;->h()LU/e;

    move-result-object v4

    invoke-static {v0, v4}, LS/A;->f(LS/z;LU/e;)J

    move-result-wide v38

    const/16 v44, 0xe

    const/16 v45, 0x0

    const v40, 0x3ec28f5c    # 0.38f

    const/16 v41, 0x0

    const/16 v42, 0x0

    const/16 v43, 0x0

    invoke-static/range {v38 .. v45}, Lo0/y0;->m(JFFFFILjava/lang/Object;)J

    move-result-wide v38

    invoke-virtual {v3}, LU/f;->g()LU/e;

    move-result-object v4

    invoke-static {v0, v4}, LS/A;->f(LS/z;LU/e;)J

    move-result-wide v40

    invoke-virtual {v3}, LU/f;->g()LU/e;

    move-result-object v4

    invoke-static {v0, v4}, LS/A;->f(LS/z;LU/e;)J

    move-result-wide v42

    const/16 v48, 0xe

    const/16 v49, 0x0

    const v44, 0x3ec28f5c    # 0.38f

    const/16 v45, 0x0

    const/16 v46, 0x0

    const/16 v47, 0x0

    invoke-static/range {v42 .. v49}, Lo0/y0;->m(JFFFFILjava/lang/Object;)J

    move-result-wide v42

    invoke-virtual {v3}, LU/f;->m()LU/e;

    move-result-object v4

    invoke-static {v0, v4}, LS/A;->f(LS/z;LU/e;)J

    move-result-wide v44

    invoke-virtual {v3}, LU/f;->k()LU/e;

    move-result-object v4

    invoke-static {v0, v4}, LS/A;->f(LS/z;LU/e;)J

    move-result-wide v46

    invoke-virtual {v3}, LU/f;->v()LU/e;

    move-result-object v4

    invoke-static {v0, v4}, LS/A;->f(LS/z;LU/e;)J

    move-result-wide v50

    invoke-virtual {v3}, LU/f;->t()LU/e;

    move-result-object v3

    invoke-static {v0, v3}, LS/A;->f(LS/z;LU/e;)J

    move-result-wide v48

    sget-object v3, LU/h;->a:LU/h;

    invoke-virtual {v3}, LU/h;->a()LU/e;

    move-result-object v3

    invoke-static {v0, v3}, LS/A;->f(LS/z;LU/e;)J

    move-result-wide v52

    sget-object v3, LS/x0;->a:LS/x0;

    and-int/lit8 v2, v2, 0xe

    or-int/lit8 v2, v2, 0x30

    invoke-virtual {v3, v0, v1, v2}, LS/x0;->f(LS/z;LV/n;I)LS/i1;

    move-result-object v54

    new-instance v3, LS/M;

    move-object v5, v3

    const/16 v55, 0x0

    invoke-direct/range {v5 .. v55}, LS/M;-><init>(JJJJJJJJJJJJJJJJJJJJJJJJLS/i1;Ly7/k;)V

    invoke-virtual {v0, v3}, LS/z;->e0(LS/M;)V

    :cond_1
    invoke-interface/range {p2 .. p2}, LV/n;->J()V

    invoke-static {}, LV/q;->H()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-static {}, LV/q;->P()V

    :cond_2
    return-object v3
.end method

.method public final h(LV/n;I)Lo0/e2;
    .locals 3

    .prologue
    invoke-static {}, LV/q;->H()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    const-string v1, "androidx.compose.material3.DatePickerDefaults.<get-shape> (DatePicker.kt:734)"

    const v2, 0x29c74eb3

    invoke-static {v2, p2, v0, v1}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_0
    sget-object p2, LU/f;->a:LU/f;

    invoke-virtual {p2}, LU/f;->c()LU/z;

    move-result-object p2

    const/4 v0, 0x6

    invoke-static {p2, p1, v0}, LS/T0;->e(LU/z;LV/n;I)Lo0/e2;

    move-result-object p1

    invoke-static {}, LV/q;->H()Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-static {}, LV/q;->P()V

    :cond_1
    return-object p1
.end method

.method public final i()F
    .locals 1

    sget v0, LS/N;->c:F

    return v0
.end method

.method public final j()LE7/i;
    .locals 1

    sget-object v0, LS/N;->b:LE7/i;

    return-object v0
.end method

.method public final k(LB/D;Lu/B;LV/n;II)Lx/p;
    .locals 5

    .prologue
    const/4 v0, 0x2

    and-int/2addr p5, v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    if-eqz p5, :cond_0

    const/4 p2, 0x3

    invoke-static {v1, v1, p2, v2}, Lu/D;->c(FFILjava/lang/Object;)Lu/B;

    move-result-object p2

    :cond_0
    invoke-static {}, LV/q;->H()Z

    move-result p5

    if-eqz p5, :cond_1

    const/4 p5, -0x1

    const-string v3, "androidx.compose.material3.DatePickerDefaults.rememberSnapFlingBehavior (DatePicker.kt:707)"

    const v4, -0x795af2a6

    invoke-static {v4, p4, p5, v3}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_1
    invoke-interface {p3, p2}, LV/n;->S(Ljava/lang/Object;)Z

    move-result p5

    and-int/lit8 v3, p4, 0xe

    xor-int/lit8 v3, v3, 0x6

    const/4 v4, 0x4

    if-le v3, v4, :cond_2

    invoke-interface {p3, p1}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_3

    :cond_2
    and-int/lit8 p4, p4, 0x6

    if-ne p4, v4, :cond_4

    :cond_3
    const/4 p4, 0x1

    goto :goto_0

    :cond_4
    const/4 p4, 0x0

    :goto_0
    or-int/2addr p4, p5

    invoke-interface {p3}, LV/n;->g()Ljava/lang/Object;

    move-result-object p5

    if-nez p4, :cond_5

    sget-object p4, LV/n;->a:LV/n$a;

    invoke-virtual {p4}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object p4

    if-ne p5, p4, :cond_6

    :cond_5
    invoke-static {p1, v2, v0, v2}, Ly/f;->b(LB/D;Ly/j;ILjava/lang/Object;)Ly/i;

    move-result-object p1

    new-instance p4, LS/N$e;

    invoke-direct {p4, p1}, LS/N$e;-><init>(Ly/i;)V

    const/high16 p1, 0x43c80000    # 400.0f

    const/4 p5, 0x5

    invoke-static {v1, p1, v2, p5, v2}, Lu/k;->j(FFLjava/lang/Object;ILjava/lang/Object;)Lu/l0;

    move-result-object p1

    invoke-static {p4, p2, p1}, Ly/h;->n(Ly/i;Lu/B;Lu/j;)Lx/F;

    move-result-object p5

    invoke-interface {p3, p5}, LV/n;->K(Ljava/lang/Object;)V

    :cond_6
    check-cast p5, Lx/F;

    invoke-static {}, LV/q;->H()Z

    move-result p1

    if-eqz p1, :cond_7

    invoke-static {}, LV/q;->P()V

    :cond_7
    return-object p5
.end method
