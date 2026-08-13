.class public final Lk9/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lk9/s;


# instance fields
.field private final a:Lk9/o;

.field private final b:Ljava/util/List;


# direct methods
.method public constructor <init>(Lk9/o;Ljava/util/List;)V
    .locals 1

    const-string v0, "mainFormat"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "formats"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lk9/c;->a:Lk9/o;

    iput-object p2, p0, Lk9/c;->b:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public a()Ll9/e;
    .locals 1

    iget-object v0, p0, Lk9/c;->a:Lk9/o;

    invoke-interface {v0}, Lk9/o;->a()Ll9/e;

    move-result-object v0

    return-object v0
.end method

.method public b()Lm9/q;
    .locals 4

    .prologue
    invoke-static {}, Lj7/v;->m()Ljava/util/List;

    move-result-object v0

    invoke-static {}, Lj7/v;->c()Ljava/util/List;

    move-result-object v1

    iget-object v2, p0, Lk9/c;->a:Lk9/o;

    invoke-interface {v2}, Lk9/o;->b()Lm9/q;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v2, p0, Lk9/c;->b:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lk9/o;

    invoke-interface {v3}, Lk9/o;->b()Lm9/q;

    move-result-object v3

    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-static {v1}, Lj7/v;->a(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    new-instance v2, Lm9/q;

    invoke-direct {v2, v0, v1}, Lm9/q;-><init>(Ljava/util/List;Ljava/util/List;)V

    return-object v2
.end method

.method public final c()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lk9/c;->b:Ljava/util/List;

    return-object v0
.end method

.method public final d()Lk9/o;
    .locals 1

    iget-object v0, p0, Lk9/c;->a:Lk9/o;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 2

    .prologue
    instance-of v0, p1, Lk9/c;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lk9/c;->a:Lk9/o;

    check-cast p1, Lk9/c;

    iget-object v1, p1, Lk9/c;->a:Lk9/o;

    invoke-static {v0, v1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lk9/c;->b:Ljava/util/List;

    iget-object p1, p1, Lk9/c;->b:Ljava/util/List;

    invoke-static {v0, p1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lk9/c;->a:Lk9/o;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lk9/c;->b:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "AlternativesParsing("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lk9/c;->b:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
