.class public abstract LW6/d;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Z)LW6/b;
    .locals 0

    .prologue
    if-eqz p0, :cond_0

    new-instance p0, LW6/p;

    invoke-direct {p0}, LW6/p;-><init>()V

    goto :goto_0

    :cond_0
    new-instance p0, LW6/t;

    invoke-direct {p0}, LW6/t;-><init>()V

    :goto_0
    return-object p0
.end method
