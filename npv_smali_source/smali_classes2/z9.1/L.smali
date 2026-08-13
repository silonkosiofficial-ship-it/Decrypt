.class final Lz9/L;
.super Lz9/e;
.source "SourceFile"


# instance fields
.field private g:Ly9/i;


# direct methods
.method public constructor <init>(Ly9/b;Lx7/l;)V
    .locals 1

    const-string v0, "json"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "nodeConsumer"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lz9/e;-><init>(Ly9/b;Lx7/l;Ly7/k;)V

    const-string p1, "primitive"

    invoke-virtual {p0, p1}, Lx9/C0;->X(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public q0()Ly9/i;
    .locals 2

    .prologue
    iget-object v0, p0, Lz9/L;->g:Ly9/i;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Primitive element has not been recorded. Is call to .encodeXxx is missing in serializer?"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public v0(Ljava/lang/String;Ly9/i;)V
    .locals 1

    .prologue
    const-string v0, "key"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "element"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "primitive"

    if-ne p1, v0, :cond_1

    iget-object p1, p0, Lz9/L;->g:Ly9/i;

    if-nez p1, :cond_0

    iput-object p2, p0, Lz9/L;->g:Ly9/i;

    invoke-virtual {p0}, Lz9/e;->r0()Lx7/l;

    move-result-object p1

    invoke-interface {p1, p2}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Primitive element was already recorded. Does call to .encodeXxx happen more than once?"

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "This output can only consume primitives with \'primitive\' tag"

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
