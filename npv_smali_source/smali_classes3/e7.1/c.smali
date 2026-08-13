.class public abstract Le7/c;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Ljava/io/InputStream;Lm7/i;Lf7/c;)Lio/ktor/utils/io/d;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "context"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "pool"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p2, Le7/b;

    invoke-static {p0}, Lo9/e;->a(Ljava/io/InputStream;)Lo9/h;

    move-result-object p0

    invoke-direct {p2, p0, p1}, Le7/b;-><init>(Lo9/h;Lm7/i;)V

    return-object p2
.end method

.method public static synthetic b(Ljava/io/InputStream;Lm7/i;Lf7/c;ILjava/lang/Object;)Lio/ktor/utils/io/d;
    .locals 0

    .prologue
    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    invoke-static {}, LW8/d0;->b()LW8/J;

    move-result-object p1

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    invoke-static {}, Lf7/a;->a()Lf7/c;

    move-result-object p2

    :cond_1
    invoke-static {p0, p1, p2}, Le7/c;->a(Ljava/io/InputStream;Lm7/i;Lf7/c;)Lio/ktor/utils/io/d;

    move-result-object p0

    return-object p0
.end method
