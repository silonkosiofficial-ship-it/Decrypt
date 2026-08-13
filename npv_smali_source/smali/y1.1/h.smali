.class public abstract Ly1/h;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ly1/h$b;,
        Ly1/h$a;,
        Ly1/h$c;
    }
.end annotation


# direct methods
.method public static a(Landroid/content/Context;Landroid/os/CancellationSignal;[Ly1/h$b;)Landroid/graphics/Typeface;
    .locals 1

    const/4 v0, 0x0

    invoke-static {p0, p1, p2, v0}, Landroidx/core/graphics/i;->b(Landroid/content/Context;Landroid/os/CancellationSignal;[Ly1/h$b;I)Landroid/graphics/Typeface;

    move-result-object p0

    return-object p0
.end method

.method public static b(Landroid/content/Context;Landroid/os/CancellationSignal;Ly1/f;)Ly1/h$a;
    .locals 0

    invoke-static {p0, p2, p1}, Ly1/e;->e(Landroid/content/Context;Ly1/f;Landroid/os/CancellationSignal;)Ly1/h$a;

    move-result-object p0

    return-object p0
.end method

.method public static c(Landroid/content/Context;Ly1/f;IZILandroid/os/Handler;Ly1/h$c;)Landroid/graphics/Typeface;
    .locals 1

    .prologue
    new-instance v0, Ly1/a;

    invoke-direct {v0, p6, p5}, Ly1/a;-><init>(Ly1/h$c;Landroid/os/Handler;)V

    if-eqz p3, :cond_0

    invoke-static {p0, p1, v0, p2, p4}, Ly1/g;->e(Landroid/content/Context;Ly1/f;Ly1/a;II)Landroid/graphics/Typeface;

    move-result-object p0

    return-object p0

    :cond_0
    const/4 p3, 0x0

    invoke-static {p0, p1, p2, p3, v0}, Ly1/g;->d(Landroid/content/Context;Ly1/f;ILjava/util/concurrent/Executor;Ly1/a;)Landroid/graphics/Typeface;

    move-result-object p0

    return-object p0
.end method
