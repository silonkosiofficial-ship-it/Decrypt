.class public abstract Lu0/o;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Ljava/util/List;

.field private static final b:I

.field private static final c:I

.field private static final d:I

.field private static final e:J

.field private static final f:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    invoke-static {}, Lj7/v;->m()Ljava/util/List;

    move-result-object v0

    sput-object v0, Lu0/o;->a:Ljava/util/List;

    sget-object v0, Lo0/g2;->a:Lo0/g2$a;

    invoke-virtual {v0}, Lo0/g2$a;->a()I

    move-result v0

    sput v0, Lu0/o;->b:I

    sget-object v0, Lo0/h2;->a:Lo0/h2$a;

    invoke-virtual {v0}, Lo0/h2$a;->b()I

    move-result v0

    sput v0, Lu0/o;->c:I

    sget-object v0, Lo0/f0;->a:Lo0/f0$a;

    invoke-virtual {v0}, Lo0/f0$a;->z()I

    move-result v0

    sput v0, Lu0/o;->d:I

    sget-object v0, Lo0/y0;->b:Lo0/y0$a;

    invoke-virtual {v0}, Lo0/y0$a;->f()J

    move-result-wide v0

    sput-wide v0, Lu0/o;->e:J

    sget-object v0, Lo0/S1;->a:Lo0/S1$a;

    invoke-virtual {v0}, Lo0/S1$a;->b()I

    move-result v0

    sput v0, Lu0/o;->f:I

    return-void
.end method

.method public static final a(Ljava/lang/String;)Ljava/util/List;
    .locals 1

    .prologue
    if-nez p0, :cond_0

    sget-object p0, Lu0/o;->a:Ljava/util/List;

    goto :goto_0

    :cond_0
    new-instance v0, Lu0/j;

    invoke-direct {v0}, Lu0/j;-><init>()V

    invoke-virtual {v0, p0}, Lu0/j;->a(Ljava/lang/String;)Lu0/j;

    move-result-object p0

    invoke-virtual {p0}, Lu0/j;->c()Ljava/util/List;

    move-result-object p0

    :goto_0
    return-object p0
.end method

.method public static final b()I
    .locals 1

    sget v0, Lu0/o;->f:I

    return v0
.end method

.method public static final c()I
    .locals 1

    sget v0, Lu0/o;->b:I

    return v0
.end method

.method public static final d()I
    .locals 1

    sget v0, Lu0/o;->c:I

    return v0
.end method

.method public static final e()Ljava/util/List;
    .locals 1

    sget-object v0, Lu0/o;->a:Ljava/util/List;

    return-object v0
.end method

.method public static final f(JJ)Z
    .locals 2

    .prologue
    invoke-static {p0, p1}, Lo0/y0;->t(J)F

    move-result v0

    invoke-static {p2, p3}, Lo0/y0;->t(J)F

    move-result v1

    cmpg-float v0, v0, v1

    if-nez v0, :cond_0

    invoke-static {p0, p1}, Lo0/y0;->s(J)F

    move-result v0

    invoke-static {p2, p3}, Lo0/y0;->s(J)F

    move-result v1

    cmpg-float v0, v0, v1

    if-nez v0, :cond_0

    invoke-static {p0, p1}, Lo0/y0;->q(J)F

    move-result p0

    invoke-static {p2, p3}, Lo0/y0;->q(J)F

    move-result p1

    cmpg-float p0, p0, p1

    if-nez p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static final g(Lo0/z0;)Z
    .locals 5

    .prologue
    instance-of v0, p0, Lo0/g0;

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_1

    check-cast p0, Lo0/g0;

    invoke-virtual {p0}, Lo0/g0;->b()I

    move-result v0

    sget-object v3, Lo0/f0;->a:Lo0/f0$a;

    invoke-virtual {v3}, Lo0/f0$a;->z()I

    move-result v4

    invoke-static {v0, v4}, Lo0/f0;->E(II)Z

    move-result v0

    if-nez v0, :cond_2

    invoke-virtual {p0}, Lo0/g0;->b()I

    move-result p0

    invoke-virtual {v3}, Lo0/f0$a;->B()I

    move-result v0

    invoke-static {p0, v0}, Lo0/f0;->E(II)Z

    move-result p0

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    move v1, v2

    goto :goto_0

    :cond_1
    if-nez p0, :cond_0

    :cond_2
    :goto_0
    return v1
.end method
