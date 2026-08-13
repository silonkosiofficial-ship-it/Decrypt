.class public abstract Ly/h;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:F


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x190

    int-to-float v0, v0

    invoke-static {v0}, LY0/i;->q(F)F

    move-result v0

    sput v0, Ly/h;->a:F

    return-void
.end method

.method public static final synthetic a(Lx/w;FLu/l;Lu/B;Lx7/l;Lm7/e;)Ljava/lang/Object;
    .locals 0

    invoke-static/range {p0 .. p5}, Ly/h;->f(Lx/w;FLu/l;Lu/B;Lx7/l;Lm7/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic b(Lu/i;Lx/w;Lx7/l;F)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, Ly/h;->g(Lu/i;Lx/w;Lx7/l;F)V

    return-void
.end method

.method public static final synthetic c(Lx/w;FFLu/l;Lu/j;Lx7/l;Lm7/e;)Ljava/lang/Object;
    .locals 0

    invoke-static/range {p0 .. p6}, Ly/h;->h(Lx/w;FFLu/l;Lu/j;Lx7/l;Lm7/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic d(Lx/w;FFLy/b;Lx7/l;Lm7/e;)Ljava/lang/Object;
    .locals 0

    invoke-static/range {p0 .. p5}, Ly/h;->i(Lx/w;FFLy/b;Lx7/l;Lm7/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic e(FF)F
    .locals 0

    invoke-static {p0, p1}, Ly/h;->l(FF)F

    move-result p0

    return p0
.end method

.method private static final f(Lx/w;FLu/l;Lu/B;Lx7/l;Lm7/e;)Ljava/lang/Object;
    .locals 5

    .prologue
    instance-of v0, p5, Ly/h$a;

    if-eqz v0, :cond_0

    move-object v0, p5

    check-cast v0, Ly/h$a;

    iget v1, v0, Ly/h$a;->J:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Ly/h$a;->J:I

    goto :goto_0

    :cond_0
    new-instance v0, Ly/h$a;

    invoke-direct {v0, p5}, Ly/h$a;-><init>(Lm7/e;)V

    :goto_0
    iget-object p5, v0, Ly/h$a;->I:Ljava/lang/Object;

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Ly/h$a;->J:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget p1, v0, Ly/h$a;->F:F

    iget-object p0, v0, Ly/h$a;->H:Ljava/lang/Object;

    check-cast p0, Ly7/L;

    iget-object p2, v0, Ly/h$a;->G:Ljava/lang/Object;

    check-cast p2, Lu/l;

    invoke-static {p5}, Li7/x;->b(Ljava/lang/Object;)V

    goto :goto_2

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p5}, Li7/x;->b(Ljava/lang/Object;)V

    new-instance p5, Ly7/L;

    invoke-direct {p5}, Ly7/L;-><init>()V

    invoke-virtual {p2}, Lu/l;->o()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    move-result v2

    const/4 v4, 0x0

    cmpg-float v2, v2, v4

    if-nez v2, :cond_3

    move v2, v3

    goto :goto_1

    :cond_3
    const/4 v2, 0x0

    :goto_1
    xor-int/2addr v2, v3

    new-instance v4, Ly/h$b;

    invoke-direct {v4, p1, p5, p0, p4}, Ly/h$b;-><init>(FLy7/L;Lx/w;Lx7/l;)V

    iput-object p2, v0, Ly/h$a;->G:Ljava/lang/Object;

    iput-object p5, v0, Ly/h$a;->H:Ljava/lang/Object;

    iput p1, v0, Ly/h$a;->F:F

    iput v3, v0, Ly/h$a;->J:I

    invoke-static {p2, p3, v2, v4, v0}, Lu/q0;->g(Lu/l;Lu/B;ZLx7/l;Lm7/e;)Ljava/lang/Object;

    move-result-object p0

    if-ne p0, v1, :cond_4

    return-object v1

    :cond_4
    move-object p0, p5

    :goto_2
    new-instance p3, Ly/a;

    iget p0, p0, Ly7/L;->C:F

    sub-float/2addr p1, p0

    invoke-static {p1}, Lo7/b;->b(F)Ljava/lang/Float;

    move-result-object p0

    invoke-direct {p3, p0, p2}, Ly/a;-><init>(Ljava/lang/Object;Lu/l;)V

    return-object p3
.end method

.method private static final g(Lu/i;Lx/w;Lx7/l;F)V
    .locals 1

    .prologue
    invoke-interface {p1, p3}, Lx/w;->a(F)F

    move-result p1

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-interface {p2, v0}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    sub-float/2addr p3, p1

    invoke-static {p3}, Ljava/lang/Math;->abs(F)F

    move-result p1

    const/high16 p2, 0x3f000000    # 0.5f

    cmpl-float p1, p1, p2

    if-lez p1, :cond_0

    invoke-virtual {p0}, Lu/i;->a()V

    :cond_0
    return-void
.end method

.method private static final h(Lx/w;FFLu/l;Lu/j;Lx7/l;Lm7/e;)Ljava/lang/Object;
    .locals 12

    .prologue
    move-object/from16 v0, p6

    instance-of v1, v0, Ly/h$c;

    if-eqz v1, :cond_0

    move-object v1, v0

    check-cast v1, Ly/h$c;

    iget v2, v1, Ly/h$c;->K:I

    const/high16 v3, -0x80000000

    and-int v4, v2, v3

    if-eqz v4, :cond_0

    sub-int/2addr v2, v3

    iput v2, v1, Ly/h$c;->K:I

    :goto_0
    move-object v7, v1

    goto :goto_1

    :cond_0
    new-instance v1, Ly/h$c;

    invoke-direct {v1, v0}, Ly/h$c;-><init>(Lm7/e;)V

    goto :goto_0

    :goto_1
    iget-object v0, v7, Ly/h$c;->J:Ljava/lang/Object;

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v7, Ly/h$c;->K:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget v1, v7, Ly/h$c;->G:F

    iget v2, v7, Ly/h$c;->F:F

    iget-object v3, v7, Ly/h$c;->I:Ljava/lang/Object;

    check-cast v3, Ly7/L;

    iget-object v4, v7, Ly/h$c;->H:Ljava/lang/Object;

    check-cast v4, Lu/l;

    invoke-static {v0}, Li7/x;->b(Ljava/lang/Object;)V

    move v10, v2

    move-object v0, v4

    goto :goto_3

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    invoke-static {v0}, Li7/x;->b(Ljava/lang/Object;)V

    new-instance v0, Ly7/L;

    invoke-direct {v0}, Ly7/L;-><init>()V

    invoke-virtual {p3}, Lu/l;->o()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    move-result v8

    invoke-static {p1}, Lo7/b;->b(F)Ljava/lang/Float;

    move-result-object v4

    invoke-virtual {p3}, Lu/l;->o()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    move-result v2

    const/4 v5, 0x0

    cmpg-float v2, v2, v5

    if-nez v2, :cond_3

    move v2, v3

    goto :goto_2

    :cond_3
    const/4 v2, 0x0

    :goto_2
    xor-int/lit8 v5, v2, 0x1

    new-instance v6, Ly/h$d;

    move-object v2, p0

    move v9, p2

    move-object/from16 v10, p5

    invoke-direct {v6, p2, v0, p0, v10}, Ly/h$d;-><init>(FLy7/L;Lx/w;Lx7/l;)V

    move-object v9, p3

    iput-object v9, v7, Ly/h$c;->H:Ljava/lang/Object;

    iput-object v0, v7, Ly/h$c;->I:Ljava/lang/Object;

    move v10, p1

    iput v10, v7, Ly/h$c;->F:F

    iput v8, v7, Ly/h$c;->G:F

    iput v3, v7, Ly/h$c;->K:I

    move-object v2, p3

    move-object v3, v4

    move-object/from16 v4, p4

    invoke-static/range {v2 .. v7}, Lu/q0;->i(Lu/l;Ljava/lang/Object;Lu/j;ZLx7/l;Lm7/e;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_4

    return-object v1

    :cond_4
    move-object v3, v0

    move v1, v8

    move-object v0, v9

    :goto_3
    invoke-virtual {v0}, Lu/l;->o()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    move-result v2

    invoke-static {v2, v1}, Ly/h;->l(FF)F

    move-result v2

    new-instance v11, Ly/a;

    iget v1, v3, Ly7/L;->C:F

    sub-float/2addr v10, v1

    invoke-static {v10}, Lo7/b;->b(F)Ljava/lang/Float;

    move-result-object v10

    const/16 v8, 0x1d

    const/4 v9, 0x0

    const/4 v1, 0x0

    const-wide/16 v3, 0x0

    const-wide/16 v5, 0x0

    const/4 v7, 0x0

    invoke-static/range {v0 .. v9}, Lu/m;->g(Lu/l;FFJJZILjava/lang/Object;)Lu/l;

    move-result-object v0

    invoke-direct {v11, v10, v0}, Ly/a;-><init>(Ljava/lang/Object;Lu/l;)V

    return-object v11
.end method

.method private static final i(Lx/w;FFLy/b;Lx7/l;Lm7/e;)Ljava/lang/Object;
    .locals 6

    invoke-static {p1}, Lo7/b;->b(F)Ljava/lang/Float;

    move-result-object v2

    invoke-static {p2}, Lo7/b;->b(F)Ljava/lang/Float;

    move-result-object v3

    move-object v0, p3

    move-object v1, p0

    move-object v4, p4

    move-object v5, p5

    invoke-interface/range {v0 .. v5}, Ly/b;->a(Lx/w;Ljava/lang/Object;Ljava/lang/Object;Lx7/l;Lm7/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final j(IFF)F
    .locals 3

    .prologue
    sget-object v0, Ly/d;->a:Ly/d$a;

    invoke-virtual {v0}, Ly/d$a;->a()I

    move-result v1

    invoke-static {p0, v1}, Ly/d;->e(II)Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    invoke-static {p2}, Ljava/lang/Math;->abs(F)F

    move-result p0

    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    move-result v0

    cmpg-float p0, p0, v0

    if-gtz p0, :cond_3

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ly/d$a;->b()I

    move-result v1

    invoke-static {p0, v1}, Ly/d;->e(II)Z

    move-result v1

    if-eqz v1, :cond_1

    :goto_0
    move p1, p2

    goto :goto_1

    :cond_1
    invoke-virtual {v0}, Ly/d$a;->c()I

    move-result p2

    invoke-static {p0, p2}, Ly/d;->e(II)Z

    move-result p0

    if-eqz p0, :cond_2

    goto :goto_1

    :cond_2
    move p1, v2

    :cond_3
    :goto_1
    invoke-static {p1}, Ly/h;->k(F)Z

    move-result p0

    if-eqz p0, :cond_4

    move v2, p1

    :cond_4
    return v2
.end method

.method private static final k(F)Z
    .locals 1

    .prologue
    const/high16 v0, 0x7f800000    # Float.POSITIVE_INFINITY

    cmpg-float v0, p0, v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/high16 v0, -0x800000    # Float.NEGATIVE_INFINITY

    cmpg-float p0, p0, v0

    if-nez p0, :cond_1

    :goto_0
    const/4 p0, 0x0

    goto :goto_1

    :cond_1
    const/4 p0, 0x1

    :goto_1
    return p0
.end method

.method private static final l(FF)F
    .locals 2

    .prologue
    const/4 v0, 0x0

    cmpg-float v1, p1, v0

    if-nez v1, :cond_0

    return v0

    :cond_0
    cmpl-float v0, p1, v0

    if-lez v0, :cond_1

    invoke-static {p0, p1}, LE7/j;->f(FF)F

    move-result p0

    goto :goto_0

    :cond_1
    invoke-static {p0, p1}, LE7/j;->c(FF)F

    move-result p0

    :goto_0
    return p0
.end method

.method public static final m()F
    .locals 1

    sget v0, Ly/h;->a:F

    return v0
.end method

.method public static final n(Ly/i;Lu/B;Lu/j;)Lx/F;
    .locals 1

    new-instance v0, Ly/g;

    invoke-direct {v0, p0, p1, p2}, Ly/g;-><init>(Ly/i;Lu/B;Lu/j;)V

    return-object v0
.end method
