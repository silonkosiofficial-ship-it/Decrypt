.class public abstract Landroidx/compose/foundation/gestures/d;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Lx7/l;

.field private static final b:Lx/w;

.field private static final c:Lh0/k;

.field private static final d:Landroidx/compose/foundation/gestures/d$d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Landroidx/compose/foundation/gestures/d$a;->D:Landroidx/compose/foundation/gestures/d$a;

    sput-object v0, Landroidx/compose/foundation/gestures/d;->a:Lx7/l;

    new-instance v0, Landroidx/compose/foundation/gestures/d$c;

    invoke-direct {v0}, Landroidx/compose/foundation/gestures/d$c;-><init>()V

    sput-object v0, Landroidx/compose/foundation/gestures/d;->b:Lx/w;

    new-instance v0, Landroidx/compose/foundation/gestures/d$b;

    invoke-direct {v0}, Landroidx/compose/foundation/gestures/d$b;-><init>()V

    sput-object v0, Landroidx/compose/foundation/gestures/d;->c:Lh0/k;

    new-instance v0, Landroidx/compose/foundation/gestures/d$d;

    invoke-direct {v0}, Landroidx/compose/foundation/gestures/d$d;-><init>()V

    sput-object v0, Landroidx/compose/foundation/gestures/d;->d:Landroidx/compose/foundation/gestures/d$d;

    return-void
.end method

.method public static final synthetic a()Lx7/l;
    .locals 1

    sget-object v0, Landroidx/compose/foundation/gestures/d;->a:Lx7/l;

    return-object v0
.end method

.method public static final synthetic b()Lx/w;
    .locals 1

    sget-object v0, Landroidx/compose/foundation/gestures/d;->b:Lx/w;

    return-object v0
.end method

.method public static final synthetic c()Landroidx/compose/foundation/gestures/d$d;
    .locals 1

    sget-object v0, Landroidx/compose/foundation/gestures/d;->d:Landroidx/compose/foundation/gestures/d$d;

    return-object v0
.end method

.method public static final synthetic d(Lx/C;JLm7/e;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Landroidx/compose/foundation/gestures/d;->j(Lx/C;JLm7/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final e()Lh0/k;
    .locals 1

    sget-object v0, Landroidx/compose/foundation/gestures/d;->c:Lh0/k;

    return-object v0
.end method

.method public static final f(Landroidx/compose/ui/d;Lx/A;Lx/s;Lv/T;ZZLx/p;Lz/l;Lx/f;)Landroidx/compose/ui/d;
    .locals 10

    new-instance v9, Landroidx/compose/foundation/gestures/ScrollableElement;

    move-object v0, v9

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move v4, p4

    move v5, p5

    move-object/from16 v6, p6

    move-object/from16 v7, p7

    move-object/from16 v8, p8

    invoke-direct/range {v0 .. v8}, Landroidx/compose/foundation/gestures/ScrollableElement;-><init>(Lx/A;Lx/s;Lv/T;ZZLx/p;Lz/l;Lx/f;)V

    move-object v0, p0

    invoke-interface {p0, v9}, Landroidx/compose/ui/d;->b(Landroidx/compose/ui/d;)Landroidx/compose/ui/d;

    move-result-object v0

    return-object v0
.end method

.method public static final g(Landroidx/compose/ui/d;Lx/A;Lx/s;ZZLx/p;Lz/l;)Landroidx/compose/ui/d;
    .locals 11

    const/16 v9, 0x80

    const/4 v10, 0x0

    const/4 v3, 0x0

    const/4 v8, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v4, p3

    move v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    invoke-static/range {v0 .. v10}, Landroidx/compose/foundation/gestures/d;->h(Landroidx/compose/ui/d;Lx/A;Lx/s;Lv/T;ZZLx/p;Lz/l;Lx/f;ILjava/lang/Object;)Landroidx/compose/ui/d;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic h(Landroidx/compose/ui/d;Lx/A;Lx/s;Lv/T;ZZLx/p;Lz/l;Lx/f;ILjava/lang/Object;)Landroidx/compose/ui/d;
    .locals 11

    .prologue
    move/from16 v0, p9

    and-int/lit8 v1, v0, 0x8

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    move v6, v1

    goto :goto_0

    :cond_0
    move v6, p4

    :goto_0
    and-int/lit8 v1, v0, 0x10

    if-eqz v1, :cond_1

    const/4 v1, 0x0

    move v7, v1

    goto :goto_1

    :cond_1
    move/from16 v7, p5

    :goto_1
    and-int/lit8 v1, v0, 0x20

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    move-object v8, v2

    goto :goto_2

    :cond_2
    move-object/from16 v8, p6

    :goto_2
    and-int/lit8 v1, v0, 0x40

    if-eqz v1, :cond_3

    move-object v9, v2

    goto :goto_3

    :cond_3
    move-object/from16 v9, p7

    :goto_3
    and-int/lit16 v0, v0, 0x80

    if-eqz v0, :cond_4

    move-object v10, v2

    goto :goto_4

    :cond_4
    move-object/from16 v10, p8

    :goto_4
    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    invoke-static/range {v2 .. v10}, Landroidx/compose/foundation/gestures/d;->f(Landroidx/compose/ui/d;Lx/A;Lx/s;Lv/T;ZZLx/p;Lz/l;Lx/f;)Landroidx/compose/ui/d;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic i(Landroidx/compose/ui/d;Lx/A;Lx/s;ZZLx/p;Lz/l;ILjava/lang/Object;)Landroidx/compose/ui/d;
    .locals 7

    .prologue
    and-int/lit8 p8, p7, 0x4

    if-eqz p8, :cond_0

    const/4 p3, 0x1

    :cond_0
    move v3, p3

    and-int/lit8 p3, p7, 0x8

    if-eqz p3, :cond_1

    const/4 p4, 0x0

    :cond_1
    move v4, p4

    and-int/lit8 p3, p7, 0x10

    const/4 p4, 0x0

    if-eqz p3, :cond_2

    move-object v5, p4

    goto :goto_0

    :cond_2
    move-object v5, p5

    :goto_0
    and-int/lit8 p3, p7, 0x20

    if-eqz p3, :cond_3

    move-object v6, p4

    goto :goto_1

    :cond_3
    move-object v6, p6

    :goto_1
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    invoke-static/range {v0 .. v6}, Landroidx/compose/foundation/gestures/d;->g(Landroidx/compose/ui/d;Lx/A;Lx/s;ZZLx/p;Lz/l;)Landroidx/compose/ui/d;

    move-result-object p0

    return-object p0
.end method

.method private static final j(Lx/C;JLm7/e;)Ljava/lang/Object;
    .locals 11

    .prologue
    instance-of v0, p3, Landroidx/compose/foundation/gestures/d$e;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Landroidx/compose/foundation/gestures/d$e;

    iget v1, v0, Landroidx/compose/foundation/gestures/d$e;->I:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Landroidx/compose/foundation/gestures/d$e;->I:I

    goto :goto_0

    :cond_0
    new-instance v0, Landroidx/compose/foundation/gestures/d$e;

    invoke-direct {v0, p3}, Landroidx/compose/foundation/gestures/d$e;-><init>(Lm7/e;)V

    :goto_0
    iget-object p3, v0, Landroidx/compose/foundation/gestures/d$e;->H:Ljava/lang/Object;

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Landroidx/compose/foundation/gestures/d$e;->I:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p0, v0, Landroidx/compose/foundation/gestures/d$e;->G:Ljava/lang/Object;

    check-cast p0, Ly7/L;

    iget-object p1, v0, Landroidx/compose/foundation/gestures/d$e;->F:Ljava/lang/Object;

    check-cast p1, Lx/C;

    invoke-static {p3}, Li7/x;->b(Ljava/lang/Object;)V

    move-object p3, p0

    move-object p0, p1

    goto :goto_1

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p3}, Li7/x;->b(Ljava/lang/Object;)V

    new-instance p3, Ly7/L;

    invoke-direct {p3}, Ly7/L;-><init>()V

    sget-object v2, Lv/L;->C:Lv/L;

    new-instance v10, Landroidx/compose/foundation/gestures/d$f;

    const/4 v9, 0x0

    move-object v4, v10

    move-object v5, p0

    move-wide v6, p1

    move-object v8, p3

    invoke-direct/range {v4 .. v9}, Landroidx/compose/foundation/gestures/d$f;-><init>(Lx/C;JLy7/L;Lm7/e;)V

    iput-object p0, v0, Landroidx/compose/foundation/gestures/d$e;->F:Ljava/lang/Object;

    iput-object p3, v0, Landroidx/compose/foundation/gestures/d$e;->G:Ljava/lang/Object;

    iput v3, v0, Landroidx/compose/foundation/gestures/d$e;->I:I

    invoke-virtual {p0, v2, v10, v0}, Lx/C;->v(Lv/L;Lx7/p;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    iget p1, p3, Ly7/L;->C:F

    invoke-virtual {p0, p1}, Lx/C;->B(F)J

    move-result-wide p0

    invoke-static {p0, p1}, Ln0/g;->d(J)Ln0/g;

    move-result-object p0

    return-object p0
.end method
