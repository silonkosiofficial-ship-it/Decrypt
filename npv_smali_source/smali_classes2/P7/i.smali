.class public abstract LP7/i;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(LP7/g;LP7/g;)LP7/g;
    .locals 3

    .prologue
    const-string v0, "first"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "second"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, LP7/g;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    move-object p0, p1

    goto :goto_0

    :cond_0
    invoke-interface {p1}, LP7/g;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    new-instance v0, LP7/k;

    const/4 v1, 0x2

    new-array v1, v1, [LP7/g;

    const/4 v2, 0x0

    aput-object p0, v1, v2

    const/4 p0, 0x1

    aput-object p1, v1, p0

    invoke-direct {v0, v1}, LP7/k;-><init>([LP7/g;)V

    move-object p0, v0

    :goto_0
    return-object p0
.end method
