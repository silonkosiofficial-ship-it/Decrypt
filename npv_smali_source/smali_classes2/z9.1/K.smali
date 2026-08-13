.class final Lz9/K;
.super Lz9/c;
.source "SourceFile"


# instance fields
.field private final h:Ly9/i;


# direct methods
.method public constructor <init>(Ly9/b;Ly9/i;Ljava/lang/String;)V
    .locals 1

    const-string v0, "json"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, p3, v0}, Lz9/c;-><init>(Ly9/b;Ly9/i;Ljava/lang/String;Ly7/k;)V

    iput-object p2, p0, Lz9/K;->h:Ly9/i;

    const-string p1, "primitive"

    invoke-virtual {p0, p1}, Lx9/B0;->a0(Ljava/lang/Object;)V

    return-void
.end method

.method public synthetic constructor <init>(Ly9/b;Ly9/i;Ljava/lang/String;ILy7/k;)V
    .locals 0

    .prologue
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    const/4 p3, 0x0

    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lz9/K;-><init>(Ly9/b;Ly9/i;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method protected j0(Ljava/lang/String;)Ly9/i;
    .locals 1

    .prologue
    const-string v0, "tag"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "primitive"

    if-ne p1, v0, :cond_0

    invoke-virtual {p0}, Lz9/K;->y0()Ly9/i;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "This input can only handle primitives with \'primitive\' tag"

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public r(Lv9/f;)I
    .locals 1

    const-string v0, "descriptor"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x0

    return p1
.end method

.method public y0()Ly9/i;
    .locals 1

    iget-object v0, p0, Lz9/K;->h:Ly9/i;

    return-object v0
.end method
