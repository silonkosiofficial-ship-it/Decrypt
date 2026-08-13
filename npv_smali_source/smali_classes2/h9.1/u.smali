.class public abstract Lh9/u;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lh9/r;)Lh9/e;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lh9/e;

    invoke-direct {v0, p0}, Lh9/e;-><init>(Lh9/r;)V

    return-object v0
.end method

.method public static final b()Li9/n;
    .locals 1

    sget-object v0, Lh9/r$b;->a:Lh9/r$b;

    invoke-virtual {v0}, Lh9/r$b;->b()Li9/n;

    move-result-object v0

    return-object v0
.end method
