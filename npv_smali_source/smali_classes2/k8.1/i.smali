.class public abstract Lk8/i;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lk8/a;)Z
    .locals 3

    .prologue
    const-string v0, "version"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lk8/a;->a()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    invoke-virtual {p0}, Lk8/a;->b()I

    move-result v0

    const/4 v2, 0x4

    if-ge v0, v2, :cond_2

    :cond_0
    invoke-virtual {p0}, Lk8/a;->a()I

    move-result p0

    if-le p0, v1, :cond_1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :cond_2
    :goto_0
    return v1
.end method

.method public static final b(Lk8/a;)Z
    .locals 1

    const-string v0, "version"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lk8/i;->a(Lk8/a;)Z

    move-result p0

    return p0
.end method
