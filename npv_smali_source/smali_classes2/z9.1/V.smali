.class final Lz9/V;
.super Lz9/Q;
.source "SourceFile"


# instance fields
.field private h:Ljava/lang/String;

.field private i:Z


# direct methods
.method public constructor <init>(Ly9/b;Lx7/l;)V
    .locals 1

    const-string v0, "json"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "nodeConsumer"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2}, Lz9/Q;-><init>(Ly9/b;Lx7/l;)V

    const/4 p1, 0x1

    iput-boolean p1, p0, Lz9/V;->i:Z

    return-void
.end method


# virtual methods
.method public q0()Ly9/i;
    .locals 2

    new-instance v0, Ly9/D;

    invoke-virtual {p0}, Lz9/Q;->w0()Ljava/util/Map;

    move-result-object v1

    invoke-direct {v0, v1}, Ly9/D;-><init>(Ljava/util/Map;)V

    return-object v0
.end method

.method public v0(Ljava/lang/String;Ly9/i;)V
    .locals 1

    .prologue
    const-string v0, "key"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "element"

    invoke-static {p2, p1}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean p1, p0, Lz9/V;->i:Z

    if-eqz p1, :cond_3

    instance-of p1, p2, Ly9/F;

    if-eqz p1, :cond_0

    check-cast p2, Ly9/F;

    invoke-virtual {p2}, Ly9/F;->d()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lz9/V;->h:Ljava/lang/String;

    const/4 p1, 0x0

    :goto_0
    iput-boolean p1, p0, Lz9/V;->i:Z

    goto :goto_1

    :cond_0
    instance-of p1, p2, Ly9/D;

    if-nez p1, :cond_2

    instance-of p1, p2, Ly9/c;

    if-eqz p1, :cond_1

    sget-object p1, Ly9/d;->a:Ly9/d;

    invoke-virtual {p1}, Ly9/d;->a()Lv9/f;

    move-result-object p1

    invoke-static {p1}, Lz9/G;->d(Lv9/f;)Lz9/E;

    move-result-object p1

    throw p1

    :cond_1
    new-instance p1, Li7/s;

    invoke-direct {p1}, Li7/s;-><init>()V

    throw p1

    :cond_2
    sget-object p1, Ly9/E;->a:Ly9/E;

    invoke-virtual {p1}, Ly9/E;->a()Lv9/f;

    move-result-object p1

    invoke-static {p1}, Lz9/G;->d(Lv9/f;)Lz9/E;

    move-result-object p1

    throw p1

    :cond_3
    invoke-virtual {p0}, Lz9/Q;->w0()Ljava/util/Map;

    move-result-object p1

    iget-object v0, p0, Lz9/V;->h:Ljava/lang/String;

    if-nez v0, :cond_4

    const-string v0, "tag"

    invoke-static {v0}, Ly7/t;->p(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_4
    invoke-interface {p1, v0, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 p1, 0x1

    goto :goto_0

    :goto_1
    return-void
.end method
