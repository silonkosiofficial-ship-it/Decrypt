.class public abstract LR5/a;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(LL5/a;)Lcom/google/firebase/remoteconfig/a;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Lcom/google/firebase/remoteconfig/a;->k()Lcom/google/firebase/remoteconfig/a;

    move-result-object p0

    const-string v0, "getInstance()"

    invoke-static {p0, v0}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public static final b(Lx7/l;)LN5/n;
    .locals 1

    const-string v0, "init"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LN5/n$b;

    invoke-direct {v0}, LN5/n$b;-><init>()V

    invoke-interface {p0, v0}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v0}, LN5/n$b;->c()LN5/n;

    move-result-object p0

    const-string v0, "builder.build()"

    invoke-static {p0, v0}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method
