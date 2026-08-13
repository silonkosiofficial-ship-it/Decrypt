.class public abstract Lo9/m;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lo9/k;)Z
    .locals 1

    .prologue
    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lo9/k;->j()I

    move-result p0

    if-nez p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method
