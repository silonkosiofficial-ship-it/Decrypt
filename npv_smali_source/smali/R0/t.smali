.class public abstract LR0/t;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(LR0/q;LR0/q;F)LR0/q;
    .locals 0

    invoke-virtual {p0}, LR0/q;->q()I

    move-result p0

    invoke-virtual {p1}, LR0/q;->q()I

    move-result p1

    invoke-static {p0, p1, p2}, La1/b;->c(IIF)I

    move-result p0

    const/4 p1, 0x1

    const/16 p2, 0x3e8

    invoke-static {p0, p1, p2}, LE7/j;->k(III)I

    move-result p0

    new-instance p1, LR0/q;

    invoke-direct {p1, p0}, LR0/q;-><init>(I)V

    return-object p1
.end method
