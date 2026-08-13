.class public abstract Lh2/S;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lx7/p;)LZ8/f;
    .locals 3

    const-string v0, "block"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lh2/S$a;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lh2/S$a;-><init>(Lx7/p;Lm7/e;)V

    invoke-static {v0}, LZ8/h;->x(Lx7/p;)LZ8/f;

    move-result-object p0

    const/4 v0, -0x2

    const/4 v2, 0x2

    invoke-static {p0, v0, v1, v2, v1}, LZ8/h;->d(LZ8/f;ILY8/d;ILjava/lang/Object;)LZ8/f;

    move-result-object p0

    return-object p0
.end method
