.class public abstract Ly9/r;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final synthetic a(Lx7/a;)Lv9/f;
    .locals 0

    invoke-static {p0}, Ly9/r;->f(Lx7/a;)Lv9/f;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic b(Lw9/h;)V
    .locals 0

    invoke-static {p0}, Ly9/r;->g(Lw9/h;)V

    return-void
.end method

.method public static final synthetic c(Lw9/j;)V
    .locals 0

    invoke-static {p0}, Ly9/r;->h(Lw9/j;)V

    return-void
.end method

.method public static final d(Lw9/h;)Ly9/h;
    .locals 3

    .prologue
    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, Ly9/h;

    if-eqz v0, :cond_0

    move-object v0, p0

    check-cast v0, Ly9/h;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    return-object v0

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "This serializer can be used only with Json format.Expected Decoder to be JsonDecoder, got "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    invoke-static {p0}, Ly7/P;->b(Ljava/lang/Class;)LF7/c;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static final e(Lw9/j;)Ly9/s;
    .locals 3

    .prologue
    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, Ly9/s;

    if-eqz v0, :cond_0

    move-object v0, p0

    check-cast v0, Ly9/s;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    return-object v0

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "This serializer can be used only with Json format.Expected Encoder to be JsonEncoder, got "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    invoke-static {p0}, Ly7/P;->b(Ljava/lang/Class;)LF7/c;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private static final f(Lx7/a;)Lv9/f;
    .locals 1

    new-instance v0, Ly9/r$a;

    invoke-direct {v0, p0}, Ly9/r$a;-><init>(Lx7/a;)V

    return-object v0
.end method

.method private static final g(Lw9/h;)V
    .locals 0

    invoke-static {p0}, Ly9/r;->d(Lw9/h;)Ly9/h;

    return-void
.end method

.method private static final h(Lw9/j;)V
    .locals 0

    invoke-static {p0}, Ly9/r;->e(Lw9/j;)Ly9/s;

    return-void
.end method
