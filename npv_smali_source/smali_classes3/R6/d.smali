.class public abstract LR6/d;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lx7/l;)LT6/p;
    .locals 4

    const-string v0, "block"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LT6/q;

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {v0, v3, v1, v2}, LT6/q;-><init>(IILy7/k;)V

    invoke-interface {p0, v0}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v0}, LT6/q;->q()LT6/p;

    move-result-object p0

    return-object p0
.end method
