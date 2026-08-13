.class public final Lu/I0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lu/H0;


# instance fields
.field private final a:Lu/t;

.field private b:Lu/r;

.field private c:Lu/r;

.field private d:Lu/r;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lu/K;)V
    .locals 1

    new-instance v0, Lu/I0$a;

    invoke-direct {v0, p1}, Lu/I0$a;-><init>(Lu/K;)V

    invoke-direct {p0, v0}, Lu/I0;-><init>(Lu/t;)V

    return-void
.end method

.method public constructor <init>(Lu/t;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu/I0;->a:Lu/t;

    return-void
.end method


# virtual methods
.method public synthetic a()Z
    .locals 1

    invoke-static {p0}, Lu/G0;->a(Lu/H0;)Z

    move-result v0

    return v0
.end method

.method public b(JLu/r;Lu/r;Lu/r;)Lu/r;
    .locals 15

    .prologue
    move-object v0, p0

    iget-object v1, v0, Lu/I0;->c:Lu/r;

    if-nez v1, :cond_0

    invoke-static/range {p5 .. p5}, Lu/s;->g(Lu/r;)Lu/r;

    move-result-object v1

    iput-object v1, v0, Lu/I0;->c:Lu/r;

    :cond_0
    iget-object v1, v0, Lu/I0;->c:Lu/r;

    const/4 v2, 0x0

    const-string v3, "velocityVector"

    if-nez v1, :cond_1

    invoke-static {v3}, Ly7/t;->p(Ljava/lang/String;)V

    move-object v1, v2

    :cond_1
    invoke-virtual {v1}, Lu/r;->b()I

    move-result v1

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v1, :cond_3

    iget-object v5, v0, Lu/I0;->c:Lu/r;

    if-nez v5, :cond_2

    invoke-static {v3}, Ly7/t;->p(Ljava/lang/String;)V

    move-object v5, v2

    :cond_2
    iget-object v6, v0, Lu/I0;->a:Lu/t;

    invoke-interface {v6, v4}, Lu/t;->get(I)Lu/K;

    move-result-object v7

    move-object/from16 v6, p3

    invoke-virtual {v6, v4}, Lu/r;->a(I)F

    move-result v10

    move-object/from16 v13, p4

    invoke-virtual {v13, v4}, Lu/r;->a(I)F

    move-result v11

    move-object/from16 v14, p5

    invoke-virtual {v14, v4}, Lu/r;->a(I)F

    move-result v12

    move-wide/from16 v8, p1

    invoke-interface/range {v7 .. v12}, Lu/K;->b(JFFF)F

    move-result v7

    invoke-virtual {v5, v4, v7}, Lu/r;->e(IF)V

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_3
    iget-object v1, v0, Lu/I0;->c:Lu/r;

    if-nez v1, :cond_4

    invoke-static {v3}, Ly7/t;->p(Ljava/lang/String;)V

    goto :goto_1

    :cond_4
    move-object v2, v1

    :goto_1
    return-object v2
.end method

.method public c(JLu/r;Lu/r;Lu/r;)Lu/r;
    .locals 15

    .prologue
    move-object v0, p0

    iget-object v1, v0, Lu/I0;->b:Lu/r;

    if-nez v1, :cond_0

    invoke-static/range {p3 .. p3}, Lu/s;->g(Lu/r;)Lu/r;

    move-result-object v1

    iput-object v1, v0, Lu/I0;->b:Lu/r;

    :cond_0
    iget-object v1, v0, Lu/I0;->b:Lu/r;

    const/4 v2, 0x0

    const-string v3, "valueVector"

    if-nez v1, :cond_1

    invoke-static {v3}, Ly7/t;->p(Ljava/lang/String;)V

    move-object v1, v2

    :cond_1
    invoke-virtual {v1}, Lu/r;->b()I

    move-result v1

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v1, :cond_3

    iget-object v5, v0, Lu/I0;->b:Lu/r;

    if-nez v5, :cond_2

    invoke-static {v3}, Ly7/t;->p(Ljava/lang/String;)V

    move-object v5, v2

    :cond_2
    iget-object v6, v0, Lu/I0;->a:Lu/t;

    invoke-interface {v6, v4}, Lu/t;->get(I)Lu/K;

    move-result-object v7

    move-object/from16 v6, p3

    invoke-virtual {v6, v4}, Lu/r;->a(I)F

    move-result v10

    move-object/from16 v13, p4

    invoke-virtual {v13, v4}, Lu/r;->a(I)F

    move-result v11

    move-object/from16 v14, p5

    invoke-virtual {v14, v4}, Lu/r;->a(I)F

    move-result v12

    move-wide/from16 v8, p1

    invoke-interface/range {v7 .. v12}, Lu/K;->e(JFFF)F

    move-result v7

    invoke-virtual {v5, v4, v7}, Lu/r;->e(IF)V

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_3
    iget-object v1, v0, Lu/I0;->b:Lu/r;

    if-nez v1, :cond_4

    invoke-static {v3}, Ly7/t;->p(Ljava/lang/String;)V

    goto :goto_1

    :cond_4
    move-object v2, v1

    :goto_1
    return-object v2
.end method

.method public e(Lu/r;Lu/r;Lu/r;)J
    .locals 7

    .prologue
    invoke-virtual {p1}, Lu/r;->b()I

    move-result v0

    const/4 v1, 0x0

    invoke-static {v1, v0}, LE7/j;->q(II)LE7/i;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const-wide/16 v1, 0x0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    move-object v3, v0

    check-cast v3, Lj7/O;

    invoke-virtual {v3}, Lj7/O;->b()I

    move-result v3

    iget-object v4, p0, Lu/I0;->a:Lu/t;

    invoke-interface {v4, v3}, Lu/t;->get(I)Lu/K;

    move-result-object v4

    invoke-virtual {p1, v3}, Lu/r;->a(I)F

    move-result v5

    invoke-virtual {p2, v3}, Lu/r;->a(I)F

    move-result v6

    invoke-virtual {p3, v3}, Lu/r;->a(I)F

    move-result v3

    invoke-interface {v4, v5, v6, v3}, Lu/K;->c(FFF)J

    move-result-wide v3

    invoke-static {v1, v2, v3, v4}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v1

    goto :goto_0

    :cond_0
    return-wide v1
.end method

.method public g(Lu/r;Lu/r;Lu/r;)Lu/r;
    .locals 9

    .prologue
    iget-object v0, p0, Lu/I0;->d:Lu/r;

    if-nez v0, :cond_0

    invoke-static {p3}, Lu/s;->g(Lu/r;)Lu/r;

    move-result-object v0

    iput-object v0, p0, Lu/I0;->d:Lu/r;

    :cond_0
    iget-object v0, p0, Lu/I0;->d:Lu/r;

    const/4 v1, 0x0

    const-string v2, "endVelocityVector"

    if-nez v0, :cond_1

    invoke-static {v2}, Ly7/t;->p(Ljava/lang/String;)V

    move-object v0, v1

    :cond_1
    invoke-virtual {v0}, Lu/r;->b()I

    move-result v0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v0, :cond_3

    iget-object v4, p0, Lu/I0;->d:Lu/r;

    if-nez v4, :cond_2

    invoke-static {v2}, Ly7/t;->p(Ljava/lang/String;)V

    move-object v4, v1

    :cond_2
    iget-object v5, p0, Lu/I0;->a:Lu/t;

    invoke-interface {v5, v3}, Lu/t;->get(I)Lu/K;

    move-result-object v5

    invoke-virtual {p1, v3}, Lu/r;->a(I)F

    move-result v6

    invoke-virtual {p2, v3}, Lu/r;->a(I)F

    move-result v7

    invoke-virtual {p3, v3}, Lu/r;->a(I)F

    move-result v8

    invoke-interface {v5, v6, v7, v8}, Lu/K;->d(FFF)F

    move-result v5

    invoke-virtual {v4, v3, v5}, Lu/r;->e(IF)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_3
    iget-object p1, p0, Lu/I0;->d:Lu/r;

    if-nez p1, :cond_4

    invoke-static {v2}, Ly7/t;->p(Ljava/lang/String;)V

    goto :goto_1

    :cond_4
    move-object v1, p1

    :goto_1
    return-object v1
.end method
