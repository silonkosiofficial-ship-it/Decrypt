.class public abstract Le7/a;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lio/ktor/utils/io/d;LW8/z0;)Ljava/io/InputStream;
    .locals 0

    const-string p1, "<this>"

    invoke-static {p0, p1}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Le7/a$a;

    invoke-direct {p1, p0}, Le7/a$a;-><init>(Lio/ktor/utils/io/d;)V

    return-object p1
.end method

.method public static synthetic b(Lio/ktor/utils/io/d;LW8/z0;ILjava/lang/Object;)Ljava/io/InputStream;
    .locals 0

    .prologue
    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    :cond_0
    invoke-static {p0, p1}, Le7/a;->a(Lio/ktor/utils/io/d;LW8/z0;)Ljava/io/InputStream;

    move-result-object p0

    return-object p0
.end method
