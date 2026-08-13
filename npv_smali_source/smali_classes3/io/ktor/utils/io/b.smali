.class public abstract Lio/ktor/utils/io/b;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lo9/q;)Lio/ktor/utils/io/d;
    .locals 1

    const-string v0, "source"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lio/ktor/utils/io/r;

    invoke-direct {v0, p0}, Lio/ktor/utils/io/r;-><init>(Lo9/q;)V

    return-object v0
.end method

.method public static final b([BII)Lio/ktor/utils/io/d;
    .locals 1

    const-string v0, "content"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lo9/a;

    invoke-direct {v0}, Lo9/a;-><init>()V

    add-int/2addr p2, p1

    invoke-virtual {v0, p0, p1, p2}, Lo9/a;->write([BII)V

    invoke-static {v0}, Lio/ktor/utils/io/b;->a(Lo9/q;)Lio/ktor/utils/io/d;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c([BIIILjava/lang/Object;)Lio/ktor/utils/io/d;
    .locals 0

    .prologue
    and-int/lit8 p4, p3, 0x2

    if-eqz p4, :cond_0

    const/4 p1, 0x0

    :cond_0
    and-int/lit8 p3, p3, 0x4

    if-eqz p3, :cond_1

    array-length p2, p0

    :cond_1
    invoke-static {p0, p1, p2}, Lio/ktor/utils/io/b;->b([BII)Lio/ktor/utils/io/d;

    move-result-object p0

    return-object p0
.end method
