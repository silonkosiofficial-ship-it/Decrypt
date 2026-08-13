.class public final LM7/d;
.super Ly8/e;
.source "SourceFile"


# direct methods
.method public constructor <init>(LE8/n;LM7/b;)V
    .locals 1

    const-string v0, "storageManager"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "containingClass"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2}, Ly8/e;-><init>(LE8/n;LO7/e;)V

    return-void
.end method


# virtual methods
.method protected i()Ljava/util/List;
    .locals 3

    .prologue
    invoke-virtual {p0}, Ly8/e;->l()LO7/e;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type org.jetbrains.kotlin.builtins.functions.FunctionClassDescriptor"

    invoke-static {v0, v1}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, LM7/b;

    invoke-virtual {v0}, LM7/b;->d1()LM7/f;

    move-result-object v0

    sget-object v1, LM7/f$a;->e:LM7/f$a;

    invoke-static {v0, v1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    sget-object v0, LM7/e;->g0:LM7/e$a;

    invoke-virtual {p0}, Ly8/e;->l()LO7/e;

    move-result-object v1

    check-cast v1, LM7/b;

    const/4 v2, 0x0

    :goto_0
    invoke-virtual {v0, v1, v2}, LM7/e$a;->a(LM7/b;Z)LM7/e;

    move-result-object v0

    invoke-static {v0}, Lj7/v;->e(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    goto :goto_1

    :cond_0
    sget-object v1, LM7/f$d;->e:LM7/f$d;

    invoke-static {v0, v1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object v0, LM7/e;->g0:LM7/e$a;

    invoke-virtual {p0}, Ly8/e;->l()LO7/e;

    move-result-object v1

    check-cast v1, LM7/b;

    const/4 v2, 0x1

    goto :goto_0

    :cond_1
    invoke-static {}, Lj7/v;->m()Ljava/util/List;

    move-result-object v0

    :goto_1
    return-object v0
.end method
