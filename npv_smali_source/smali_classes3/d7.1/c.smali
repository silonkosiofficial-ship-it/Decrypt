.class public abstract Ld7/c;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a()Lo9/p;
    .locals 1

    new-instance v0, Lo9/a;

    invoke-direct {v0}, Lo9/a;-><init>()V

    return-object v0
.end method

.method public static final b(Lo9/p;)Lo9/q;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Lo9/p;->d()Lo9/a;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Lo9/p;)I
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Lo9/p;->d()Lo9/a;

    move-result-object p0

    invoke-virtual {p0}, Lo9/a;->r()J

    move-result-wide v0

    long-to-int p0, v0

    return p0
.end method

.method public static final d(Lo9/p;[BII)V
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "buffer"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    add-int/2addr p3, p2

    invoke-interface {p0, p1, p2, p3}, Lo9/p;->write([BII)V

    return-void
.end method

.method public static synthetic e(Lo9/p;[BIIILjava/lang/Object;)V
    .locals 0

    .prologue
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    const/4 p2, 0x0

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    array-length p3, p1

    sub-int/2addr p3, p2

    :cond_1
    invoke-static {p0, p1, p2, p3}, Ld7/c;->d(Lo9/p;[BII)V

    return-void
.end method

.method public static final f(Lo9/p;Lo9/q;)V
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "packet"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lo9/p;->X(Lo9/h;)J

    return-void
.end method
