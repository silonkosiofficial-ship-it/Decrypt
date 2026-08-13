.class public abstract Lf8/p;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lf8/o;)Z
    .locals 1

    .prologue
    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lf8/o;->E:Lf8/o;

    if-eq p0, v0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method
