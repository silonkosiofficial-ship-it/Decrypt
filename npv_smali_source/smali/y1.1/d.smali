.class public abstract synthetic Ly1/d;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Landroid/content/Context;Landroid/net/Uri;)Ly1/e$a;
    .locals 2

    .prologue
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x18

    if-ge v0, v1, :cond_0

    new-instance v0, Ly1/e$b;

    invoke-direct {v0, p0, p1}, Ly1/e$b;-><init>(Landroid/content/Context;Landroid/net/Uri;)V

    return-object v0

    :cond_0
    new-instance v0, Ly1/e$c;

    invoke-direct {v0, p0, p1}, Ly1/e$c;-><init>(Landroid/content/Context;Landroid/net/Uri;)V

    return-object v0
.end method
