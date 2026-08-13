.class public final LU7/B;
.super LU7/p;
.source "SourceFile"

# interfaces
.implements Le8/B;


# instance fields
.field private final a:LU7/z;

.field private final b:[Ljava/lang/annotation/Annotation;

.field private final c:Ljava/lang/String;

.field private final d:Z


# direct methods
.method public constructor <init>(LU7/z;[Ljava/lang/annotation/Annotation;Ljava/lang/String;Z)V
    .locals 1

    const-string v0, "type"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "reflectAnnotations"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, LU7/p;-><init>()V

    iput-object p1, p0, LU7/B;->a:LU7/z;

    iput-object p2, p0, LU7/B;->b:[Ljava/lang/annotation/Annotation;

    iput-object p3, p0, LU7/B;->c:Ljava/lang/String;

    iput-boolean p4, p0, LU7/B;->d:Z

    return-void
.end method


# virtual methods
.method public X()LU7/z;
    .locals 1

    iget-object v0, p0, LU7/B;->a:LU7/z;

    return-object v0
.end method

.method public getName()Ln8/f;
    .locals 1

    .prologue
    iget-object v0, p0, LU7/B;->c:Ljava/lang/String;

    if-eqz v0, :cond_0

    invoke-static {v0}, Ln8/f;->n(Ljava/lang/String;)Ln8/f;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public bridge synthetic getType()Le8/x;
    .locals 1

    invoke-virtual {p0}, LU7/B;->X()LU7/z;

    move-result-object v0

    return-object v0
.end method

.method public j(Ln8/c;)LU7/e;
    .locals 1

    const-string v0, "fqName"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LU7/B;->b:[Ljava/lang/annotation/Annotation;

    invoke-static {v0, p1}, LU7/i;->a([Ljava/lang/annotation/Annotation;Ln8/c;)LU7/e;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic j(Ln8/c;)Le8/a;
    .locals 0

    invoke-virtual {p0, p1}, LU7/B;->j(Ln8/c;)LU7/e;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic k()Ljava/util/Collection;
    .locals 1

    invoke-virtual {p0}, LU7/B;->k()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    return-object v0
.end method

.method public k()Ljava/util/List;
    .locals 1

    iget-object v0, p0, LU7/B;->b:[Ljava/lang/annotation/Annotation;

    invoke-static {v0}, LU7/i;->b([Ljava/lang/annotation/Annotation;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public m()Z
    .locals 1

    iget-boolean v0, p0, LU7/B;->d:Z

    return v0
.end method

.method public o()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .prologue
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-class v1, LU7/B;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ": "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, LU7/B;->m()Z

    move-result v2

    if-eqz v2, :cond_0

    const-string v2, "vararg "

    goto :goto_0

    :cond_0
    const-string v2, ""

    :goto_0
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, LU7/B;->getName()Ln8/f;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, LU7/B;->X()LU7/z;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
