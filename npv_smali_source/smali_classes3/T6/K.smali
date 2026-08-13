.class public abstract LT6/K;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(I)LT6/H;
    .locals 1

    new-instance v0, LT6/I;

    invoke-direct {v0, p0}, LT6/I;-><init>(I)V

    return-object v0
.end method

.method public static synthetic b(IILjava/lang/Object;)LT6/H;
    .locals 0

    .prologue
    and-int/lit8 p1, p1, 0x1

    if-eqz p1, :cond_0

    const/16 p0, 0x8

    :cond_0
    invoke-static {p0}, LT6/K;->a(I)LT6/H;

    move-result-object p0

    return-object p0
.end method
