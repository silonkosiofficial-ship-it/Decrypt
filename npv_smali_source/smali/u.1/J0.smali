.class final Lu/J0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lu/D0;


# instance fields
.field private final a:Lu/L;

.field private b:Lu/r;

.field private c:Lu/r;

.field private d:Lu/r;

.field private final e:F


# direct methods
.method public constructor <init>(Lu/L;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu/J0;->a:Lu/L;

    invoke-interface {p1}, Lu/L;->a()F

    move-result p1

    iput p1, p0, Lu/J0;->e:F

    return-void
.end method


# virtual methods
.method public a()F
    .locals 1

    iget v0, p0, Lu/J0;->e:F

    return v0
.end method

.method public b(Lu/r;Lu/r;)Lu/r;
    .locals 8

    .prologue
    iget-object v0, p0, Lu/J0;->d:Lu/r;

    if-nez v0, :cond_0

    invoke-static {p1}, Lu/s;->g(Lu/r;)Lu/r;

    move-result-object v0

    iput-object v0, p0, Lu/J0;->d:Lu/r;

    :cond_0
    iget-object v0, p0, Lu/J0;->d:Lu/r;

    const/4 v1, 0x0

    const-string v2, "targetVector"

    if-nez v0, :cond_1

    invoke-static {v2}, Ly7/t;->p(Ljava/lang/String;)V

    move-object v0, v1

    :cond_1
    invoke-virtual {v0}, Lu/r;->b()I

    move-result v0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v0, :cond_3

    iget-object v4, p0, Lu/J0;->d:Lu/r;

    if-nez v4, :cond_2

    invoke-static {v2}, Ly7/t;->p(Ljava/lang/String;)V

    move-object v4, v1

    :cond_2
    iget-object v5, p0, Lu/J0;->a:Lu/L;

    invoke-virtual {p1, v3}, Lu/r;->a(I)F

    move-result v6

    invoke-virtual {p2, v3}, Lu/r;->a(I)F

    move-result v7

    invoke-interface {v5, v6, v7}, Lu/L;->d(FF)F

    move-result v5

    invoke-virtual {v4, v3, v5}, Lu/r;->e(IF)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_3
    iget-object p1, p0, Lu/J0;->d:Lu/r;

    if-nez p1, :cond_4

    invoke-static {v2}, Ly7/t;->p(Ljava/lang/String;)V

    goto :goto_1

    :cond_4
    move-object v1, p1

    :goto_1
    return-object v1
.end method

.method public c(JLu/r;Lu/r;)Lu/r;
    .locals 8

    .prologue
    iget-object v0, p0, Lu/J0;->b:Lu/r;

    if-nez v0, :cond_0

    invoke-static {p3}, Lu/s;->g(Lu/r;)Lu/r;

    move-result-object v0

    iput-object v0, p0, Lu/J0;->b:Lu/r;

    :cond_0
    iget-object v0, p0, Lu/J0;->b:Lu/r;

    const/4 v1, 0x0

    const-string v2, "valueVector"

    if-nez v0, :cond_1

    invoke-static {v2}, Ly7/t;->p(Ljava/lang/String;)V

    move-object v0, v1

    :cond_1
    invoke-virtual {v0}, Lu/r;->b()I

    move-result v0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v0, :cond_3

    iget-object v4, p0, Lu/J0;->b:Lu/r;

    if-nez v4, :cond_2

    invoke-static {v2}, Ly7/t;->p(Ljava/lang/String;)V

    move-object v4, v1

    :cond_2
    iget-object v5, p0, Lu/J0;->a:Lu/L;

    invoke-virtual {p3, v3}, Lu/r;->a(I)F

    move-result v6

    invoke-virtual {p4, v3}, Lu/r;->a(I)F

    move-result v7

    invoke-interface {v5, p1, p2, v6, v7}, Lu/L;->e(JFF)F

    move-result v5

    invoke-virtual {v4, v3, v5}, Lu/r;->e(IF)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_3
    iget-object p1, p0, Lu/J0;->b:Lu/r;

    if-nez p1, :cond_4

    invoke-static {v2}, Ly7/t;->p(Ljava/lang/String;)V

    goto :goto_1

    :cond_4
    move-object v1, p1

    :goto_1
    return-object v1
.end method

.method public d(Lu/r;Lu/r;)J
    .locals 7

    .prologue
    iget-object v0, p0, Lu/J0;->c:Lu/r;

    if-nez v0, :cond_0

    invoke-static {p1}, Lu/s;->g(Lu/r;)Lu/r;

    move-result-object v0

    iput-object v0, p0, Lu/J0;->c:Lu/r;

    :cond_0
    iget-object v0, p0, Lu/J0;->c:Lu/r;

    if-nez v0, :cond_1

    const-string v0, "velocityVector"

    invoke-static {v0}, Ly7/t;->p(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_1
    invoke-virtual {v0}, Lu/r;->b()I

    move-result v0

    const-wide/16 v1, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v0, :cond_2

    iget-object v4, p0, Lu/J0;->a:Lu/L;

    invoke-virtual {p1, v3}, Lu/r;->a(I)F

    move-result v5

    invoke-virtual {p2, v3}, Lu/r;->a(I)F

    move-result v6

    invoke-interface {v4, v5, v6}, Lu/L;->c(FF)J

    move-result-wide v4

    invoke-static {v1, v2, v4, v5}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v1

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_2
    return-wide v1
.end method

.method public e(JLu/r;Lu/r;)Lu/r;
    .locals 8

    .prologue
    iget-object v0, p0, Lu/J0;->c:Lu/r;

    if-nez v0, :cond_0

    invoke-static {p3}, Lu/s;->g(Lu/r;)Lu/r;

    move-result-object v0

    iput-object v0, p0, Lu/J0;->c:Lu/r;

    :cond_0
    iget-object v0, p0, Lu/J0;->c:Lu/r;

    const/4 v1, 0x0

    const-string v2, "velocityVector"

    if-nez v0, :cond_1

    invoke-static {v2}, Ly7/t;->p(Ljava/lang/String;)V

    move-object v0, v1

    :cond_1
    invoke-virtual {v0}, Lu/r;->b()I

    move-result v0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v0, :cond_3

    iget-object v4, p0, Lu/J0;->c:Lu/r;

    if-nez v4, :cond_2

    invoke-static {v2}, Ly7/t;->p(Ljava/lang/String;)V

    move-object v4, v1

    :cond_2
    iget-object v5, p0, Lu/J0;->a:Lu/L;

    invoke-virtual {p3, v3}, Lu/r;->a(I)F

    move-result v6

    invoke-virtual {p4, v3}, Lu/r;->a(I)F

    move-result v7

    invoke-interface {v5, p1, p2, v6, v7}, Lu/L;->b(JFF)F

    move-result v5

    invoke-virtual {v4, v3, v5}, Lu/r;->e(IF)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_3
    iget-object p1, p0, Lu/J0;->c:Lu/r;

    if-nez p1, :cond_4

    invoke-static {v2}, Ly7/t;->p(Ljava/lang/String;)V

    goto :goto_1

    :cond_4
    move-object v1, p1

    :goto_1
    return-object v1
.end method
