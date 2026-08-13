.class public abstract LQ3/u;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Landroid/content/Context;)LQ3/v;
    .locals 1

    sget-object v0, LQ3/w;->D:LQ3/w;

    invoke-static {p0, v0}, LQ3/u;->b(Landroid/content/Context;LQ3/w;)LQ3/v;

    move-result-object p0

    return-object p0
.end method

.method public static b(Landroid/content/Context;LQ3/w;)LQ3/v;
    .locals 1

    new-instance v0, LS3/d;

    invoke-direct {v0, p0, p1}, LS3/d;-><init>(Landroid/content/Context;LQ3/w;)V

    return-object v0
.end method
