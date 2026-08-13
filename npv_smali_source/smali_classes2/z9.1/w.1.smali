.class public final Lz9/w;
.super Lz9/n;
.source "SourceFile"


# instance fields
.field private final c:Ly9/b;

.field private d:I


# direct methods
.method public constructor <init>(Lz9/A;Ly9/b;)V
    .locals 1

    const-string v0, "writer"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "json"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lz9/n;-><init>(Lz9/A;)V

    iput-object p2, p0, Lz9/w;->c:Ly9/b;

    return-void
.end method


# virtual methods
.method public b()V
    .locals 2

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lz9/n;->o(Z)V

    iget v1, p0, Lz9/w;->d:I

    add-int/2addr v1, v0

    iput v1, p0, Lz9/w;->d:I

    return-void
.end method

.method public c()V
    .locals 3

    .prologue
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lz9/n;->o(Z)V

    const-string v1, "\n"

    invoke-virtual {p0, v1}, Lz9/n;->k(Ljava/lang/String;)V

    iget v1, p0, Lz9/w;->d:I

    :goto_0
    if-ge v0, v1, :cond_0

    iget-object v2, p0, Lz9/w;->c:Ly9/b;

    invoke-virtual {v2}, Ly9/b;->e()Ly9/g;

    move-result-object v2

    invoke-virtual {v2}, Ly9/g;->n()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v2}, Lz9/n;->k(Ljava/lang/String;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public d()V
    .locals 1

    .prologue
    invoke-virtual {p0}, Lz9/n;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lz9/n;->o(Z)V

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lz9/w;->c()V

    :goto_0
    return-void
.end method

.method public p()V
    .locals 1

    const/16 v0, 0x20

    invoke-virtual {p0, v0}, Lz9/n;->f(C)V

    return-void
.end method

.method public q()V
    .locals 1

    iget v0, p0, Lz9/w;->d:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lz9/w;->d:I

    return-void
.end method
