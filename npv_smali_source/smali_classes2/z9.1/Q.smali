.class Lz9/Q;
.super Lz9/e;
.source "SourceFile"


# instance fields
.field private final g:Ljava/util/Map;


# direct methods
.method public constructor <init>(Ly9/b;Lx7/l;)V
    .locals 1

    const-string v0, "json"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "nodeConsumer"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lz9/e;-><init>(Ly9/b;Lx7/l;Ly7/k;)V

    new-instance p1, Ljava/util/LinkedHashMap;

    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object p1, p0, Lz9/Q;->g:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public q0()Ly9/i;
    .locals 2

    new-instance v0, Ly9/D;

    iget-object v1, p0, Lz9/Q;->g:Ljava/util/Map;

    invoke-direct {v0, v1}, Ly9/D;-><init>(Ljava/util/Map;)V

    return-object v0
.end method

.method public v0(Ljava/lang/String;Ly9/i;)V
    .locals 1

    const-string v0, "key"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "element"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lz9/Q;->g:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method protected final w0()Ljava/util/Map;
    .locals 1

    iget-object v0, p0, Lz9/Q;->g:Ljava/util/Map;

    return-object v0
.end method

.method public x(Lv9/f;ILt9/e;Ljava/lang/Object;)V
    .locals 1

    .prologue
    const-string v0, "descriptor"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "serializer"

    invoke-static {p3, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    if-nez p4, :cond_0

    iget-object v0, p0, Lz9/e;->d:Ly9/g;

    invoke-virtual {v0}, Ly9/g;->j()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    invoke-super {p0, p1, p2, p3, p4}, Lx9/C0;->x(Lv9/f;ILt9/e;Ljava/lang/Object;)V

    :cond_1
    return-void
.end method
