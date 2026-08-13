.class public abstract Ln0/l;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(FFFFFF)Ln0/k;
    .locals 15

    invoke-static/range {p4 .. p5}, Ln0/b;->a(FF)J

    move-result-wide v11

    new-instance v14, Ln0/k;

    const/4 v13, 0x0

    move-object v0, v14

    move v1, p0

    move/from16 v2, p1

    move/from16 v3, p2

    move/from16 v4, p3

    move-wide v5, v11

    move-wide v7, v11

    move-wide v9, v11

    invoke-direct/range {v0 .. v13}, Ln0/k;-><init>(FFFFJJJJLy7/k;)V

    return-object v14
.end method

.method public static final b(Ln0/i;JJJJ)Ln0/k;
    .locals 15

    new-instance v14, Ln0/k;

    invoke-virtual {p0}, Ln0/i;->i()F

    move-result v1

    invoke-virtual {p0}, Ln0/i;->l()F

    move-result v2

    invoke-virtual {p0}, Ln0/i;->j()F

    move-result v3

    invoke-virtual {p0}, Ln0/i;->e()F

    move-result v4

    const/4 v13, 0x0

    move-object v0, v14

    move-wide/from16 v5, p1

    move-wide/from16 v7, p3

    move-wide/from16 v9, p5

    move-wide/from16 v11, p7

    invoke-direct/range {v0 .. v13}, Ln0/k;-><init>(FFFFJJJJLy7/k;)V

    return-object v14
.end method

.method public static final c(FFFFJ)Ln0/k;
    .locals 6

    invoke-static {p4, p5}, Ln0/a;->d(J)F

    move-result v4

    invoke-static {p4, p5}, Ln0/a;->e(J)F

    move-result v5

    move v0, p0

    move v1, p1

    move v2, p2

    move v3, p3

    invoke-static/range {v0 .. v5}, Ln0/l;->a(FFFFFF)Ln0/k;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Ln0/k;)Ln0/i;
    .locals 4

    new-instance v0, Ln0/i;

    invoke-virtual {p0}, Ln0/k;->e()F

    move-result v1

    invoke-virtual {p0}, Ln0/k;->g()F

    move-result v2

    invoke-virtual {p0}, Ln0/k;->f()F

    move-result v3

    invoke-virtual {p0}, Ln0/k;->a()F

    move-result p0

    invoke-direct {v0, v1, v2, v3, p0}, Ln0/i;-><init>(FFFF)V

    return-object v0
.end method

.method public static final e(Ln0/k;)Z
    .locals 3

    .prologue
    invoke-virtual {p0}, Ln0/k;->h()J

    move-result-wide v0

    invoke-static {v0, v1}, Ln0/a;->d(J)F

    move-result v0

    invoke-virtual {p0}, Ln0/k;->h()J

    move-result-wide v1

    invoke-static {v1, v2}, Ln0/a;->e(J)F

    move-result v1

    cmpg-float v0, v0, v1

    if-nez v0, :cond_0

    invoke-virtual {p0}, Ln0/k;->h()J

    move-result-wide v0

    invoke-static {v0, v1}, Ln0/a;->d(J)F

    move-result v0

    invoke-virtual {p0}, Ln0/k;->i()J

    move-result-wide v1

    invoke-static {v1, v2}, Ln0/a;->d(J)F

    move-result v1

    cmpg-float v0, v0, v1

    if-nez v0, :cond_0

    invoke-virtual {p0}, Ln0/k;->h()J

    move-result-wide v0

    invoke-static {v0, v1}, Ln0/a;->d(J)F

    move-result v0

    invoke-virtual {p0}, Ln0/k;->i()J

    move-result-wide v1

    invoke-static {v1, v2}, Ln0/a;->e(J)F

    move-result v1

    cmpg-float v0, v0, v1

    if-nez v0, :cond_0

    invoke-virtual {p0}, Ln0/k;->h()J

    move-result-wide v0

    invoke-static {v0, v1}, Ln0/a;->d(J)F

    move-result v0

    invoke-virtual {p0}, Ln0/k;->c()J

    move-result-wide v1

    invoke-static {v1, v2}, Ln0/a;->d(J)F

    move-result v1

    cmpg-float v0, v0, v1

    if-nez v0, :cond_0

    invoke-virtual {p0}, Ln0/k;->h()J

    move-result-wide v0

    invoke-static {v0, v1}, Ln0/a;->d(J)F

    move-result v0

    invoke-virtual {p0}, Ln0/k;->c()J

    move-result-wide v1

    invoke-static {v1, v2}, Ln0/a;->e(J)F

    move-result v1

    cmpg-float v0, v0, v1

    if-nez v0, :cond_0

    invoke-virtual {p0}, Ln0/k;->h()J

    move-result-wide v0

    invoke-static {v0, v1}, Ln0/a;->d(J)F

    move-result v0

    invoke-virtual {p0}, Ln0/k;->b()J

    move-result-wide v1

    invoke-static {v1, v2}, Ln0/a;->d(J)F

    move-result v1

    cmpg-float v0, v0, v1

    if-nez v0, :cond_0

    invoke-virtual {p0}, Ln0/k;->h()J

    move-result-wide v0

    invoke-static {v0, v1}, Ln0/a;->d(J)F

    move-result v0

    invoke-virtual {p0}, Ln0/k;->b()J

    move-result-wide v1

    invoke-static {v1, v2}, Ln0/a;->e(J)F

    move-result p0

    cmpg-float p0, v0, p0

    if-nez p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method
