.class public final Ly/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx/F;


# instance fields
.field private final a:Ly/i;

.field private final b:Lu/B;

.field private final c:Lu/j;

.field private d:Lh0/k;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Ly/i;Lu/B;Lu/j;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly/g;->a:Ly/i;

    iput-object p2, p0, Ly/g;->b:Lu/B;

    iput-object p3, p0, Ly/g;->c:Lu/j;

    invoke-static {}, Landroidx/compose/foundation/gestures/d;->e()Lh0/k;

    move-result-object p1

    iput-object p1, p0, Ly/g;->d:Lh0/k;

    return-void
.end method

.method public static final synthetic c(Ly/g;Lx/w;FLx7/l;Lm7/e;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Ly/g;->h(Lx/w;FLx7/l;Lm7/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic d(Ly/g;)Lu/B;
    .locals 0

    iget-object p0, p0, Ly/g;->b:Lu/B;

    return-object p0
.end method

.method public static final synthetic e(Ly/g;)Lu/j;
    .locals 0

    iget-object p0, p0, Ly/g;->c:Lu/j;

    return-object p0
.end method

.method public static final synthetic f(Ly/g;)Ly/i;
    .locals 0

    iget-object p0, p0, Ly/g;->a:Ly/i;

    return-object p0
.end method

.method public static final synthetic g(Ly/g;Lx/w;FFLx7/l;Lm7/e;)Ljava/lang/Object;
    .locals 0

    invoke-direct/range {p0 .. p5}, Ly/g;->k(Lx/w;FFLx7/l;Lm7/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private final h(Lx/w;FLx7/l;Lm7/e;)Ljava/lang/Object;
    .locals 10

    .prologue
    instance-of v0, p4, Ly/g$a;

    if-eqz v0, :cond_0

    move-object v0, p4

    check-cast v0, Ly/g$a;

    iget v1, v0, Ly/g$a;->I:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Ly/g$a;->I:I

    goto :goto_0

    :cond_0
    new-instance v0, Ly/g$a;

    invoke-direct {v0, p0, p4}, Ly/g$a;-><init>(Ly/g;Lm7/e;)V

    :goto_0
    iget-object p4, v0, Ly/g$a;->G:Ljava/lang/Object;

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Ly/g$a;->I:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Ly/g$a;->F:Ljava/lang/Object;

    move-object p3, p1

    check-cast p3, Lx7/l;

    invoke-static {p4}, Li7/x;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p4}, Li7/x;->b(Ljava/lang/Object;)V

    iget-object p4, p0, Ly/g;->d:Lh0/k;

    new-instance v2, Ly/g$b;

    const/4 v9, 0x0

    move-object v4, v2

    move-object v5, p0

    move v6, p2

    move-object v7, p3

    move-object v8, p1

    invoke-direct/range {v4 .. v9}, Ly/g$b;-><init>(Ly/g;FLx7/l;Lx/w;Lm7/e;)V

    iput-object p3, v0, Ly/g$a;->F:Ljava/lang/Object;

    iput v3, v0, Ly/g$a;->I:I

    invoke-static {p4, v2, v0}, LW8/g;->g(Lm7/i;Lx7/p;Lm7/e;)Ljava/lang/Object;

    move-result-object p4

    if-ne p4, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    check-cast p4, Ly/a;

    const/4 p1, 0x0

    invoke-static {p1}, Lo7/b;->b(F)Ljava/lang/Float;

    move-result-object p1

    invoke-interface {p3, p1}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p4
.end method

.method private final i(FF)Z
    .locals 2

    .prologue
    iget-object v0, p0, Ly/g;->b:Lu/B;

    const/4 v1, 0x0

    invoke-static {v0, v1, p2}, Lu/D;->a(Lu/B;FF)F

    move-result p2

    invoke-static {p2}, Ljava/lang/Math;->abs(F)F

    move-result p2

    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    move-result p1

    cmpl-float p1, p2, p1

    if-ltz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method private final j(Lx/w;FFLx7/l;Lm7/e;)Ljava/lang/Object;
    .locals 8

    .prologue
    invoke-direct {p0, p2, p3}, Ly/g;->i(FF)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Ly/c;

    iget-object v1, p0, Ly/g;->b:Lu/B;

    invoke-direct {v0, v1}, Ly/c;-><init>(Lu/B;)V

    :goto_0
    move-object v5, v0

    goto :goto_1

    :cond_0
    new-instance v0, Ly/l;

    iget-object v1, p0, Ly/g;->c:Lu/j;

    invoke-direct {v0, v1}, Ly/l;-><init>(Lu/j;)V

    goto :goto_0

    :goto_1
    move-object v2, p1

    move v3, p2

    move v4, p3

    move-object v6, p4

    move-object v7, p5

    invoke-static/range {v2 .. v7}, Ly/h;->d(Lx/w;FFLy/b;Lx7/l;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method private final k(Lx/w;FFLx7/l;Lm7/e;)Ljava/lang/Object;
    .locals 18

    .prologue
    move-object/from16 v0, p5

    instance-of v1, v0, Ly/g$d;

    if-eqz v1, :cond_0

    move-object v1, v0

    check-cast v1, Ly/g$d;

    iget v2, v1, Ly/g$d;->H:I

    const/high16 v3, -0x80000000

    and-int v4, v2, v3

    if-eqz v4, :cond_0

    sub-int/2addr v2, v3

    iput v2, v1, Ly/g$d;->H:I

    move-object/from16 v8, p0

    :goto_0
    move-object v7, v1

    goto :goto_1

    :cond_0
    new-instance v1, Ly/g$d;

    move-object/from16 v8, p0

    invoke-direct {v1, v8, v0}, Ly/g$d;-><init>(Ly/g;Lm7/e;)V

    goto :goto_0

    :goto_1
    iget-object v0, v7, Ly/g$d;->F:Ljava/lang/Object;

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v7, Ly/g$d;->H:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {v0}, Li7/x;->b(Ljava/lang/Object;)V

    goto :goto_3

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    invoke-static {v0}, Li7/x;->b(Ljava/lang/Object;)V

    invoke-static/range {p2 .. p2}, Ljava/lang/Math;->abs(F)F

    move-result v0

    const/4 v2, 0x0

    cmpg-float v0, v0, v2

    if-nez v0, :cond_3

    goto :goto_2

    :cond_3
    invoke-static/range {p3 .. p3}, Ljava/lang/Math;->abs(F)F

    move-result v0

    cmpg-float v0, v0, v2

    if-nez v0, :cond_4

    :goto_2
    const/16 v16, 0x1c

    const/16 v17, 0x0

    const-wide/16 v11, 0x0

    const-wide/16 v13, 0x0

    const/4 v15, 0x0

    move/from16 v9, p2

    move/from16 v10, p3

    invoke-static/range {v9 .. v17}, Lu/m;->c(FFJJZILjava/lang/Object;)Lu/l;

    move-result-object v0

    goto :goto_4

    :cond_4
    iput v3, v7, Ly/g$d;->H:I

    move-object/from16 v2, p0

    move-object/from16 v3, p1

    move/from16 v4, p2

    move/from16 v5, p3

    move-object/from16 v6, p4

    invoke-direct/range {v2 .. v7}, Ly/g;->j(Lx/w;FFLx7/l;Lm7/e;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v1, :cond_5

    return-object v1

    :cond_5
    :goto_3
    check-cast v0, Ly/a;

    invoke-virtual {v0}, Ly/a;->c()Lu/l;

    move-result-object v0

    :goto_4
    return-object v0
.end method


# virtual methods
.method public a(Lx/w;FLx7/l;Lm7/e;)Ljava/lang/Object;
    .locals 4

    .prologue
    instance-of v0, p4, Ly/g$c;

    if-eqz v0, :cond_0

    move-object v0, p4

    check-cast v0, Ly/g$c;

    iget v1, v0, Ly/g$c;->H:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Ly/g$c;->H:I

    goto :goto_0

    :cond_0
    new-instance v0, Ly/g$c;

    invoke-direct {v0, p0, p4}, Ly/g$c;-><init>(Ly/g;Lm7/e;)V

    :goto_0
    iget-object p4, v0, Ly/g$c;->F:Ljava/lang/Object;

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Ly/g$c;->H:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p4}, Li7/x;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p4}, Li7/x;->b(Ljava/lang/Object;)V

    iput v3, v0, Ly/g$c;->H:I

    invoke-direct {p0, p1, p2, p3, v0}, Ly/g;->h(Lx/w;FLx7/l;Lm7/e;)Ljava/lang/Object;

    move-result-object p4

    if-ne p4, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    check-cast p4, Ly/a;

    invoke-virtual {p4}, Ly/a;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    move-result p1

    invoke-virtual {p4}, Ly/a;->b()Lu/l;

    move-result-object p2

    const/4 p3, 0x0

    cmpg-float p1, p1, p3

    if-nez p1, :cond_4

    goto :goto_2

    :cond_4
    invoke-virtual {p2}, Lu/l;->o()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    move-result p3

    :goto_2
    invoke-static {p3}, Lo7/b;->b(F)Ljava/lang/Float;

    move-result-object p1

    return-object p1
.end method

.method public synthetic b(Lx/w;FLm7/e;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lx/E;->a(Lx/F;Lx/w;FLm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    .prologue
    instance-of v0, p1, Ly/g;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    check-cast p1, Ly/g;

    iget-object v0, p1, Ly/g;->c:Lu/j;

    iget-object v2, p0, Ly/g;->c:Lu/j;

    invoke-static {v0, v2}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p1, Ly/g;->b:Lu/B;

    iget-object v2, p0, Ly/g;->b:Lu/B;

    invoke-static {v0, v2}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p1, p1, Ly/g;->a:Ly/i;

    iget-object v0, p0, Ly/g;->a:Ly/i;

    invoke-static {p1, v0}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 v1, 0x1

    :cond_0
    return v1
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Ly/g;->c:Lu/j;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Ly/g;->b:Lu/B;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Ly/g;->a:Ly/i;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method
