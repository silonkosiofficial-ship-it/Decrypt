.class final Lz9/T;
.super Lz9/e;
.source "SourceFile"


# instance fields
.field private final g:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Ly9/b;Lx7/l;)V
    .locals 1

    const-string v0, "json"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "nodeConsumer"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lz9/e;-><init>(Ly9/b;Lx7/l;Ly7/k;)V

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lz9/T;->g:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method protected Z(Lv9/f;I)Ljava/lang/String;
    .locals 1

    const-string v0, "descriptor"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public q0()Ly9/i;
    .locals 2

    new-instance v0, Ly9/c;

    iget-object v1, p0, Lz9/T;->g:Ljava/util/ArrayList;

    invoke-direct {v0, v1}, Ly9/c;-><init>(Ljava/util/List;)V

    return-object v0
.end method

.method public v0(Ljava/lang/String;Ly9/i;)V
    .locals 1

    const-string v0, "key"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "element"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p1

    iget-object v0, p0, Lz9/T;->g:Ljava/util/ArrayList;

    invoke-virtual {v0, p1, p2}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    return-void
.end method
