.class public abstract Lh2/d;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(LW8/z0;Lx7/p;)LZ8/f;
    .locals 2

    const-string v0, "controller"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "block"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lh2/d$a;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1}, Lh2/d$a;-><init>(LW8/z0;Lx7/p;Lm7/e;)V

    invoke-static {v0}, Lh2/S;->a(Lx7/p;)LZ8/f;

    move-result-object p0

    return-object p0
.end method
