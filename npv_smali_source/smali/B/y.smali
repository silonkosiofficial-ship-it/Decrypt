.class public abstract LB/y;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(I)LB/x;
    .locals 1

    new-instance v0, LB/a;

    invoke-direct {v0, p0}, LB/a;-><init>(I)V

    return-object v0
.end method

.method public static synthetic b(IILjava/lang/Object;)LB/x;
    .locals 0

    .prologue
    and-int/lit8 p1, p1, 0x1

    if-eqz p1, :cond_0

    const/4 p0, 0x2

    :cond_0
    invoke-static {p0}, LB/y;->a(I)LB/x;

    move-result-object p0

    return-object p0
.end method
