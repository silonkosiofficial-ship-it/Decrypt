.class public abstract Lg9/b;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Ll4/l;Lm7/e;)Ljava/lang/Object;
    .locals 1

    const/4 v0, 0x0

    invoke-static {p0, v0, p1}, Lg9/b;->b(Ll4/l;Ll4/b;Lm7/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private static final b(Ll4/l;Ll4/b;Lm7/e;)Ljava/lang/Object;
    .locals 3

    .prologue
    invoke-virtual {p0}, Ll4/l;->n()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Ll4/l;->k()Ljava/lang/Exception;

    move-result-object p1

    if-nez p1, :cond_1

    invoke-virtual {p0}, Ll4/l;->m()Z

    move-result p1

    if-nez p1, :cond_0

    invoke-virtual {p0}, Ll4/l;->l()Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_0
    new-instance p1, Ljava/util/concurrent/CancellationException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Task "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, " was cancelled normally."

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    throw p1

    :cond_2
    new-instance v0, LW8/n;

    invoke-static {p2}, Ln7/b;->d(Lm7/e;)Lm7/e;

    move-result-object v1

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, LW8/n;-><init>(Lm7/e;I)V

    invoke-virtual {v0}, LW8/n;->E()V

    sget-object v1, Lg9/a;->C:Lg9/a;

    new-instance v2, Lg9/b$a;

    invoke-direct {v2, v0}, Lg9/b$a;-><init>(LW8/l;)V

    invoke-virtual {p0, v1, v2}, Ll4/l;->b(Ljava/util/concurrent/Executor;Ll4/f;)Ll4/l;

    if-eqz p1, :cond_3

    new-instance p0, Lg9/b$b;

    invoke-direct {p0, p1}, Lg9/b$b;-><init>(Ll4/b;)V

    invoke-interface {v0, p0}, LW8/l;->G(Lx7/l;)V

    :cond_3
    invoke-virtual {v0}, LW8/n;->x()Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_4

    invoke-static {p2}, Lo7/h;->c(Lm7/e;)V

    :cond_4
    return-object p0
.end method
