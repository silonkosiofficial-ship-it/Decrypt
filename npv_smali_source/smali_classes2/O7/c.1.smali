.class final LO7/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LO7/f0;


# instance fields
.field private final C:LO7/f0;

.field private final D:LO7/m;

.field private final E:I


# direct methods
.method public constructor <init>(LO7/f0;LO7/m;I)V
    .locals 1

    const-string v0, "originalDescriptor"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "declarationDescriptor"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LO7/c;->C:LO7/f0;

    iput-object p2, p0, LO7/c;->D:LO7/m;

    iput p3, p0, LO7/c;->E:I

    return-void
.end method


# virtual methods
.method public K()Z
    .locals 1

    iget-object v0, p0, LO7/c;->C:LO7/f0;

    invoke-interface {v0}, LO7/f0;->K()Z

    move-result v0

    return v0
.end method

.method public a()LO7/f0;
    .locals 2

    iget-object v0, p0, LO7/c;->C:LO7/f0;

    invoke-interface {v0}, LO7/f0;->a()LO7/f0;

    move-result-object v0

    const-string v1, "getOriginal(...)"

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public bridge synthetic a()LO7/h;
    .locals 1

    invoke-virtual {p0}, LO7/c;->a()LO7/f0;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic a()LO7/m;
    .locals 1

    invoke-virtual {p0}, LO7/c;->a()LO7/f0;

    move-result-object v0

    return-object v0
.end method

.method public b()LO7/m;
    .locals 1

    iget-object v0, p0, LO7/c;->D:LO7/m;

    return-object v0
.end method

.method public getIndex()I
    .locals 2

    iget v0, p0, LO7/c;->E:I

    iget-object v1, p0, LO7/c;->C:LO7/f0;

    invoke-interface {v1}, LO7/f0;->getIndex()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public getName()Ln8/f;
    .locals 1

    iget-object v0, p0, LO7/c;->C:LO7/f0;

    invoke-interface {v0}, LO7/I;->getName()Ln8/f;

    move-result-object v0

    return-object v0
.end method

.method public getUpperBounds()Ljava/util/List;
    .locals 1

    iget-object v0, p0, LO7/c;->C:LO7/f0;

    invoke-interface {v0}, LO7/f0;->getUpperBounds()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public k()LP7/g;
    .locals 1

    iget-object v0, p0, LO7/c;->C:LO7/f0;

    invoke-interface {v0}, LP7/a;->k()LP7/g;

    move-result-object v0

    return-object v0
.end method

.method public o()LO7/a0;
    .locals 1

    iget-object v0, p0, LO7/c;->C:LO7/f0;

    invoke-interface {v0}, LO7/p;->o()LO7/a0;

    move-result-object v0

    return-object v0
.end method

.method public p()LF8/e0;
    .locals 1

    iget-object v0, p0, LO7/c;->C:LO7/f0;

    invoke-interface {v0}, LO7/f0;->p()LF8/e0;

    move-result-object v0

    return-object v0
.end method

.method public p0()LE8/n;
    .locals 1

    iget-object v0, p0, LO7/c;->C:LO7/f0;

    invoke-interface {v0}, LO7/f0;->p0()LE8/n;

    move-result-object v0

    return-object v0
.end method

.method public r0(LO7/o;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LO7/c;->C:LO7/f0;

    invoke-interface {v0, p1, p2}, LO7/m;->r0(LO7/o;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public s()LF8/u0;
    .locals 1

    iget-object v0, p0, LO7/c;->C:LO7/f0;

    invoke-interface {v0}, LO7/f0;->s()LF8/u0;

    move-result-object v0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, LO7/c;->C:LO7/f0;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "[inner-copy]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public w()LF8/M;
    .locals 1

    iget-object v0, p0, LO7/c;->C:LO7/f0;

    invoke-interface {v0}, LO7/h;->w()LF8/M;

    move-result-object v0

    return-object v0
.end method

.method public x0()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method
