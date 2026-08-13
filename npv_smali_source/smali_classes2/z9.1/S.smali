.class final Lz9/S;
.super Lz9/c;
.source "SourceFile"


# instance fields
.field private final h:Ly9/c;

.field private final i:I

.field private j:I


# direct methods
.method public constructor <init>(Ly9/b;Ly9/c;)V
    .locals 7

    const-string v0, "json"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-direct/range {v1 .. v6}, Lz9/c;-><init>(Ly9/b;Ly9/i;Ljava/lang/String;ILy7/k;)V

    iput-object p2, p0, Lz9/S;->h:Ly9/c;

    invoke-virtual {p0}, Lz9/S;->B0()Ly9/c;

    move-result-object p1

    invoke-virtual {p1}, Ly9/c;->size()I

    move-result p1

    iput p1, p0, Lz9/S;->i:I

    const/4 p1, -0x1

    iput p1, p0, Lz9/S;->j:I

    return-void
.end method


# virtual methods
.method public B0()Ly9/c;
    .locals 1

    iget-object v0, p0, Lz9/S;->h:Ly9/c;

    return-object v0
.end method

.method protected d0(Lv9/f;I)Ljava/lang/String;
    .locals 1

    const-string v0, "descriptor"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method protected j0(Ljava/lang/String;)Ly9/i;
    .locals 1

    const-string v0, "tag"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lz9/S;->B0()Ly9/c;

    move-result-object v0

    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p1

    invoke-virtual {v0, p1}, Ly9/c;->e(I)Ly9/i;

    move-result-object p1

    return-object p1
.end method

.method public r(Lv9/f;)I
    .locals 1

    .prologue
    const-string v0, "descriptor"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget p1, p0, Lz9/S;->j:I

    iget v0, p0, Lz9/S;->i:I

    add-int/lit8 v0, v0, -0x1

    if-ge p1, v0, :cond_0

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Lz9/S;->j:I

    return p1

    :cond_0
    const/4 p1, -0x1

    return p1
.end method

.method public bridge synthetic y0()Ly9/i;
    .locals 1

    invoke-virtual {p0}, Lz9/S;->B0()Ly9/c;

    move-result-object v0

    return-object v0
.end method
