.class public abstract synthetic Lu/t0;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Lu/s0$b;Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 1

    .prologue
    invoke-interface {p0}, Lu/s0$b;->b()Ljava/lang/Object;

    move-result-object v0

    invoke-static {p1, v0}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-interface {p0}, Lu/s0$b;->d()Ljava/lang/Object;

    move-result-object p0

    invoke-static {p2, p0}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method
