.class public abstract Lq8/f$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lq8/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method public static a(Lq8/f;)Z
    .locals 0

    invoke-interface {p0}, Lq8/f;->o()Lq8/a;

    move-result-object p0

    invoke-virtual {p0}, Lq8/a;->g()Z

    move-result p0

    return p0
.end method

.method public static b(Lq8/f;)Z
    .locals 0

    invoke-interface {p0}, Lq8/f;->o()Lq8/a;

    move-result-object p0

    invoke-virtual {p0}, Lq8/a;->i()Z

    move-result p0

    return p0
.end method
