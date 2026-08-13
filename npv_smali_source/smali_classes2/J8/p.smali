.class public abstract LJ8/p;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LJ8/p$a;
    }
.end annotation


# direct methods
.method public static final a(LF8/u0;)LJ8/s;
    .locals 1

    .prologue
    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LJ8/p$a;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    const/4 v0, 0x1

    if-eq p0, v0, :cond_2

    const/4 v0, 0x2

    if-eq p0, v0, :cond_1

    const/4 v0, 0x3

    if-ne p0, v0, :cond_0

    sget-object p0, LJ8/s;->E:LJ8/s;

    goto :goto_0

    :cond_0
    new-instance p0, Li7/s;

    invoke-direct {p0}, Li7/s;-><init>()V

    throw p0

    :cond_1
    sget-object p0, LJ8/s;->D:LJ8/s;

    goto :goto_0

    :cond_2
    sget-object p0, LJ8/s;->F:LJ8/s;

    :goto_0
    return-object p0
.end method
