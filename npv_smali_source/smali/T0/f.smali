.class public abstract LT0/f;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a()LT0/i;
    .locals 2

    .prologue
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x18

    if-lt v0, v1, :cond_0

    new-instance v0, LT0/d;

    invoke-direct {v0}, LT0/d;-><init>()V

    goto :goto_0

    :cond_0
    new-instance v0, LT0/a;

    invoke-direct {v0}, LT0/a;-><init>()V

    :goto_0
    return-object v0
.end method
