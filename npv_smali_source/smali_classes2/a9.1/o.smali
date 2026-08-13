.class public abstract La9/o;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lx7/p;Lm7/e;)Ljava/lang/Object;
    .locals 2

    .prologue
    new-instance v0, La9/n;

    invoke-interface {p1}, Lm7/e;->getContext()Lm7/i;

    move-result-object v1

    invoke-direct {v0, v1, p1}, La9/n;-><init>(Lm7/i;Lm7/e;)V

    invoke-static {v0, v0, p0}, Lc9/b;->b(Lb9/z;Ljava/lang/Object;Lx7/p;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v0

    if-ne p0, v0, :cond_0

    invoke-static {p1}, Lo7/h;->c(Lm7/e;)V

    :cond_0
    return-object p0
.end method
