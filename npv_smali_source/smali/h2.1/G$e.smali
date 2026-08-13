.class public final Lh2/G$e;
.super Lh2/G;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lh2/G;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "e"
.end annotation


# instance fields
.field private final a:Lh2/N;

.field private final b:Lh2/N;


# direct methods
.method public constructor <init>(Lh2/N;Lh2/N;)V
    .locals 1

    const-string v0, "newList"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "previousList"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lh2/G;-><init>(Ly7/k;)V

    iput-object p1, p0, Lh2/G$e;->a:Lh2/N;

    iput-object p2, p0, Lh2/G$e;->b:Lh2/N;

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 2

    .prologue
    instance-of v0, p1, Lh2/G$e;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lh2/G$e;->a:Lh2/N;

    invoke-interface {v0}, Lh2/N;->c()I

    move-result v0

    check-cast p1, Lh2/G$e;

    iget-object v1, p1, Lh2/G$e;->a:Lh2/N;

    invoke-interface {v1}, Lh2/N;->c()I

    move-result v1

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lh2/G$e;->a:Lh2/N;

    invoke-interface {v0}, Lh2/N;->d()I

    move-result v0

    iget-object v1, p1, Lh2/G$e;->a:Lh2/N;

    invoke-interface {v1}, Lh2/N;->d()I

    move-result v1

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lh2/G$e;->a:Lh2/N;

    invoke-interface {v0}, Lh2/N;->a()I

    move-result v0

    iget-object v1, p1, Lh2/G$e;->a:Lh2/N;

    invoke-interface {v1}, Lh2/N;->a()I

    move-result v1

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lh2/G$e;->a:Lh2/N;

    invoke-interface {v0}, Lh2/N;->b()I

    move-result v0

    iget-object v1, p1, Lh2/G$e;->a:Lh2/N;

    invoke-interface {v1}, Lh2/N;->b()I

    move-result v1

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lh2/G$e;->b:Lh2/N;

    invoke-interface {v0}, Lh2/N;->c()I

    move-result v0

    iget-object v1, p1, Lh2/G$e;->b:Lh2/N;

    invoke-interface {v1}, Lh2/N;->c()I

    move-result v1

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lh2/G$e;->b:Lh2/N;

    invoke-interface {v0}, Lh2/N;->d()I

    move-result v0

    iget-object v1, p1, Lh2/G$e;->b:Lh2/N;

    invoke-interface {v1}, Lh2/N;->d()I

    move-result v1

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lh2/G$e;->b:Lh2/N;

    invoke-interface {v0}, Lh2/N;->a()I

    move-result v0

    iget-object v1, p1, Lh2/G$e;->b:Lh2/N;

    invoke-interface {v1}, Lh2/N;->a()I

    move-result v1

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lh2/G$e;->b:Lh2/N;

    invoke-interface {v0}, Lh2/N;->b()I

    move-result v0

    iget-object p1, p1, Lh2/G$e;->b:Lh2/N;

    invoke-interface {p1}, Lh2/N;->b()I

    move-result p1

    if-ne v0, p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lh2/G$e;->a:Lh2/N;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    iget-object v1, p0, Lh2/G$e;->b:Lh2/N;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "PagingDataEvent.Refresh loaded newList\n                    |   newList (\n                    |       placeholdersBefore: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lh2/G$e;->a:Lh2/N;

    invoke-interface {v1}, Lh2/N;->c()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "\n                    |       placeholdersAfter: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lh2/G$e;->a:Lh2/N;

    invoke-interface {v2}, Lh2/N;->d()I

    move-result v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, "\n                    |       size: "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Lh2/G$e;->a:Lh2/N;

    invoke-interface {v3}, Lh2/N;->a()I

    move-result v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, "\n                    |       dataCount: "

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, p0, Lh2/G$e;->a:Lh2/N;

    invoke-interface {v4}, Lh2/N;->b()I

    move-result v4

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v4, "\n                    |   )\n                    |   previousList (\n                    |       placeholdersBefore: "

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, p0, Lh2/G$e;->b:Lh2/N;

    invoke-interface {v4}, Lh2/N;->c()I

    move-result v4

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lh2/G$e;->b:Lh2/N;

    invoke-interface {v1}, Lh2/N;->d()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lh2/G$e;->b:Lh2/N;

    invoke-interface {v1}, Lh2/N;->a()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lh2/G$e;->b:Lh2/N;

    invoke-interface {v1}, Lh2/N;->b()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "\n                    |   )\n                    |"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-static {v0, v1, v2, v1}, LS8/r;->q(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
