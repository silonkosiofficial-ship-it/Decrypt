.class public abstract LW8/U0;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(LW8/z0;)LW8/y;
    .locals 1

    new-instance v0, LW8/T0;

    invoke-direct {v0, p0}, LW8/T0;-><init>(LW8/z0;)V

    return-object v0
.end method

.method public static synthetic b(LW8/z0;ILjava/lang/Object;)LW8/y;
    .locals 0

    .prologue
    and-int/lit8 p1, p1, 0x1

    if-eqz p1, :cond_0

    const/4 p0, 0x0

    :cond_0
    invoke-static {p0}, LW8/U0;->a(LW8/z0;)LW8/y;

    move-result-object p0

    return-object p0
.end method
