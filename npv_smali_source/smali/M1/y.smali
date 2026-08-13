.class public abstract LM1/y;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(LM1/x;Lm7/e;)Ljava/lang/Object;
    .locals 2

    new-instance v0, LM1/y$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LM1/y$a;-><init>(Lm7/e;)V

    invoke-interface {p0, v0, p1}, LM1/x;->a(Lx7/q;Lm7/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method
