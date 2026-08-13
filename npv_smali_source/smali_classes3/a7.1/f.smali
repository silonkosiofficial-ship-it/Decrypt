.class public abstract La7/f;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Ljava/lang/Object;Ljava/util/List;Ljava/lang/Object;Lm7/i;Z)La7/e;
    .locals 1

    .prologue
    const-string v0, "context"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "interceptors"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "subject"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "coroutineContext"

    invoke-static {p3, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, La7/g;->a()Z

    move-result v0

    if-nez v0, :cond_1

    if-eqz p4, :cond_0

    goto :goto_0

    :cond_0
    new-instance p3, La7/o;

    invoke-direct {p3, p2, p0, p1}, La7/o;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/List;)V

    goto :goto_1

    :cond_1
    :goto_0
    new-instance p4, La7/a;

    invoke-direct {p4, p0, p1, p2, p3}, La7/a;-><init>(Ljava/lang/Object;Ljava/util/List;Ljava/lang/Object;Lm7/i;)V

    move-object p3, p4

    :goto_1
    return-object p3
.end method
