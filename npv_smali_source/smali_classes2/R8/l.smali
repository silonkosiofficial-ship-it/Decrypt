.class abstract LR8/l;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Lx7/p;)Ljava/util/Iterator;
    .locals 1

    const-string v0, "block"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LR8/i;

    invoke-direct {v0}, LR8/i;-><init>()V

    invoke-static {p0, v0, v0}, Ln7/b;->b(Lx7/p;Ljava/lang/Object;Lm7/e;)Lm7/e;

    move-result-object p0

    invoke-virtual {v0, p0}, LR8/i;->e(Lm7/e;)V

    return-object v0
.end method

.method public static b(Lx7/p;)LR8/h;
    .locals 1

    const-string v0, "block"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LR8/l$a;

    invoke-direct {v0, p0}, LR8/l$a;-><init>(Lx7/p;)V

    return-object v0
.end method
