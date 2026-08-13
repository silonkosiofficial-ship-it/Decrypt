.class public final LS/f1;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LS/f1;

.field private static final b:F


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LS/f1;

    invoke-direct {v0}, LS/f1;-><init>()V

    sput-object v0, LS/f1;->a:LS/f1;

    const/16 v0, 0x34

    int-to-float v0, v0

    invoke-static {v0}, LY0/i;->q(F)F

    move-result v0

    sput v0, LS/f1;->b:F

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroidx/compose/ui/d;FJLV/n;II)V
    .locals 15

    .prologue
    move/from16 v6, p6

    const v0, -0x594d9a64

    move-object/from16 v1, p5

    invoke-interface {v1, v0}, LV/n;->r(I)LV/n;

    move-result-object v1

    and-int/lit8 v2, p7, 0x1

    if-eqz v2, :cond_0

    or-int/lit8 v3, v6, 0x6

    move v4, v3

    move-object/from16 v3, p1

    goto :goto_1

    :cond_0
    and-int/lit8 v3, v6, 0x6

    if-nez v3, :cond_2

    move-object/from16 v3, p1

    invoke-interface {v1, v3}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    const/4 v4, 0x4

    goto :goto_0

    :cond_1
    const/4 v4, 0x2

    :goto_0
    or-int/2addr v4, v6

    goto :goto_1

    :cond_2
    move-object/from16 v3, p1

    move v4, v6

    :goto_1
    and-int/lit8 v5, p7, 0x2

    if-eqz v5, :cond_4

    or-int/lit8 v4, v4, 0x30

    :cond_3
    move/from16 v7, p2

    goto :goto_3

    :cond_4
    and-int/lit8 v7, v6, 0x30

    if-nez v7, :cond_3

    move/from16 v7, p2

    invoke-interface {v1, v7}, LV/n;->h(F)Z

    move-result v8

    if-eqz v8, :cond_5

    const/16 v8, 0x20

    goto :goto_2

    :cond_5
    const/16 v8, 0x10

    :goto_2
    or-int/2addr v4, v8

    :goto_3
    and-int/lit16 v8, v6, 0x180

    if-nez v8, :cond_8

    and-int/lit8 v8, p7, 0x4

    if-nez v8, :cond_6

    move-wide/from16 v8, p3

    invoke-interface {v1, v8, v9}, LV/n;->j(J)Z

    move-result v10

    if-eqz v10, :cond_7

    const/16 v10, 0x100

    goto :goto_4

    :cond_6
    move-wide/from16 v8, p3

    :cond_7
    const/16 v10, 0x80

    :goto_4
    or-int/2addr v4, v10

    goto :goto_5

    :cond_8
    move-wide/from16 v8, p3

    :goto_5
    and-int/lit16 v10, v4, 0x93

    const/16 v11, 0x92

    if-ne v10, v11, :cond_a

    invoke-interface {v1}, LV/n;->u()Z

    move-result v10

    if-nez v10, :cond_9

    goto :goto_6

    :cond_9
    invoke-interface {v1}, LV/n;->A()V

    move-object v2, v3

    move v3, v7

    move-wide v4, v8

    goto/16 :goto_b

    :cond_a
    :goto_6
    invoke-interface {v1}, LV/n;->q()V

    and-int/lit8 v10, v6, 0x1

    if-eqz v10, :cond_e

    invoke-interface {v1}, LV/n;->G()Z

    move-result v10

    if-eqz v10, :cond_b

    goto :goto_7

    :cond_b
    invoke-interface {v1}, LV/n;->A()V

    and-int/lit8 v2, p7, 0x4

    if-eqz v2, :cond_c

    and-int/lit16 v4, v4, -0x381

    :cond_c
    move-object v2, v3

    move v3, v7

    :cond_d
    move v7, v4

    move-wide v4, v8

    goto :goto_a

    :cond_e
    :goto_7
    if-eqz v2, :cond_f

    sget-object v2, Landroidx/compose/ui/d;->a:Landroidx/compose/ui/d$a;

    goto :goto_8

    :cond_f
    move-object v2, v3

    :goto_8
    if-eqz v5, :cond_10

    sget-object v3, LU/w;->a:LU/w;

    invoke-virtual {v3}, LU/w;->b()F

    move-result v3

    goto :goto_9

    :cond_10
    move v3, v7

    :goto_9
    and-int/lit8 v5, p7, 0x4

    if-eqz v5, :cond_d

    sget-object v5, LU/w;->a:LU/w;

    invoke-virtual {v5}, LU/w;->a()LU/e;

    move-result-object v5

    const/4 v7, 0x6

    invoke-static {v5, v1, v7}, LS/A;->h(LU/e;LV/n;I)J

    move-result-wide v7

    and-int/lit16 v4, v4, -0x381

    move-wide v13, v7

    move v7, v4

    move-wide v4, v13

    :goto_a
    invoke-interface {v1}, LV/n;->R()V

    invoke-static {}, LV/q;->H()Z

    move-result v8

    if-eqz v8, :cond_11

    const/4 v8, -0x1

    const-string v9, "androidx.compose.material3.TabRowDefaults.SecondaryIndicator (TabRow.kt:1246)"

    invoke-static {v0, v7, v8, v9}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_11
    const/4 v0, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x1

    invoke-static {v2, v0, v8, v7}, Landroidx/compose/foundation/layout/p;->f(Landroidx/compose/ui/d;FILjava/lang/Object;)Landroidx/compose/ui/d;

    move-result-object v0

    invoke-static {v0, v3}, Landroidx/compose/foundation/layout/p;->g(Landroidx/compose/ui/d;F)Landroidx/compose/ui/d;

    move-result-object v7

    const/4 v11, 0x2

    const/4 v12, 0x0

    const/4 v10, 0x0

    move-wide v8, v4

    invoke-static/range {v7 .. v12}, Landroidx/compose/foundation/b;->b(Landroidx/compose/ui/d;JLo0/e2;ILjava/lang/Object;)Landroidx/compose/ui/d;

    move-result-object v0

    const/4 v7, 0x0

    invoke-static {v0, v1, v7}, Landroidx/compose/foundation/layout/d;->a(Landroidx/compose/ui/d;LV/n;I)V

    invoke-static {}, LV/q;->H()Z

    move-result v0

    if-eqz v0, :cond_12

    invoke-static {}, LV/q;->P()V

    :cond_12
    :goto_b
    invoke-interface {v1}, LV/n;->x()LV/e1;

    move-result-object v8

    if-eqz v8, :cond_13

    new-instance v9, LS/f1$a;

    move-object v0, v9

    move-object v1, p0

    move/from16 v6, p6

    move/from16 v7, p7

    invoke-direct/range {v0 .. v7}, LS/f1$a;-><init>(LS/f1;Landroidx/compose/ui/d;FJII)V

    invoke-interface {v8, v9}, LV/e1;->a(Lx7/p;)V

    :cond_13
    return-void
.end method

.method public final b(LV/n;I)J
    .locals 3

    .prologue
    invoke-static {}, LV/q;->H()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    const-string v1, "androidx.compose.material3.TabRowDefaults.<get-primaryContainerColor> (TabRow.kt:1163)"

    const v2, -0x7b54c8f5

    invoke-static {v2, p2, v0, v1}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_0
    sget-object p2, LU/w;->a:LU/w;

    invoke-virtual {p2}, LU/w;->d()LU/e;

    move-result-object p2

    const/4 v0, 0x6

    invoke-static {p2, p1, v0}, LS/A;->h(LU/e;LV/n;I)J

    move-result-wide p1

    invoke-static {}, LV/q;->H()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {}, LV/q;->P()V

    :cond_1
    return-wide p1
.end method

.method public final c(LV/n;I)J
    .locals 3

    .prologue
    invoke-static {}, LV/q;->H()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    const-string v1, "androidx.compose.material3.TabRowDefaults.<get-primaryContentColor> (TabRow.kt:1179)"

    const v2, 0x54106cfb

    invoke-static {v2, p2, v0, v1}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_0
    sget-object p2, LU/w;->a:LU/w;

    invoke-virtual {p2}, LU/w;->c()LU/e;

    move-result-object p2

    const/4 v0, 0x6

    invoke-static {p2, p1, v0}, LS/A;->h(LU/e;LV/n;I)J

    move-result-wide p1

    invoke-static {}, LV/q;->H()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {}, LV/q;->P()V

    :cond_1
    return-wide p1
.end method

.method public final d(Landroidx/compose/ui/d;LS/e1;)Landroidx/compose/ui/d;
    .locals 2

    .prologue
    invoke-static {}, Landroidx/compose/ui/platform/E0;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, LS/f1$b;

    invoke-direct {v0, p2}, LS/f1$b;-><init>(LS/e1;)V

    goto :goto_0

    :cond_0
    invoke-static {}, Landroidx/compose/ui/platform/E0;->a()Lx7/l;

    move-result-object v0

    :goto_0
    new-instance v1, LS/f1$c;

    invoke-direct {v1, p2}, LS/f1$c;-><init>(LS/e1;)V

    invoke-static {p1, v0, v1}, Landroidx/compose/ui/c;->b(Landroidx/compose/ui/d;Lx7/l;Lx7/q;)Landroidx/compose/ui/d;

    move-result-object p1

    return-object p1
.end method
