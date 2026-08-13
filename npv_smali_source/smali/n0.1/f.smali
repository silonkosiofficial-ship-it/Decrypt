.class public abstract Ln0/f;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Ln0/e;)Ln0/i;
    .locals 4

    new-instance v0, Ln0/i;

    invoke-virtual {p0}, Ln0/e;->b()F

    move-result v1

    invoke-virtual {p0}, Ln0/e;->d()F

    move-result v2

    invoke-virtual {p0}, Ln0/e;->c()F

    move-result v3

    invoke-virtual {p0}, Ln0/e;->a()F

    move-result p0

    invoke-direct {v0, v1, v2, v3, p0}, Ln0/i;-><init>(FFFF)V

    return-object v0
.end method
