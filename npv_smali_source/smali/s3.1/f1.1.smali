.class public final Ls3/f1;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Ljava/util/List;

.field private final c:Ljava/util/Set;

.field private final d:Landroid/os/Bundle;

.field private final e:Ljava/util/Map;

.field private final f:Ljava/lang/String;

.field private final g:Ljava/lang/String;

.field private final h:I

.field private final i:Ljava/util/Set;

.field private final j:Landroid/os/Bundle;

.field private final k:Ljava/util/Set;

.field private final l:Z

.field private final m:Ljava/lang/String;

.field private final n:I

.field private o:J


# direct methods
.method public constructor <init>(Ls3/e1;LG3/a;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Ls3/f1;->o:J

    invoke-static {p1}, Ls3/e1;->h(Ls3/e1;)Ljava/lang/String;

    move-result-object p2

    iput-object p2, p0, Ls3/f1;->a:Ljava/lang/String;

    invoke-static {p1}, Ls3/e1;->o(Ls3/e1;)Ljava/util/List;

    move-result-object p2

    iput-object p2, p0, Ls3/f1;->b:Ljava/util/List;

    invoke-static {p1}, Ls3/e1;->m(Ls3/e1;)Ljava/util/HashSet;

    move-result-object p2

    invoke-static {p2}, Lj$/util/DesugarCollections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object p2

    iput-object p2, p0, Ls3/f1;->c:Ljava/util/Set;

    invoke-static {p1}, Ls3/e1;->f(Ls3/e1;)Landroid/os/Bundle;

    move-result-object p2

    iput-object p2, p0, Ls3/f1;->d:Landroid/os/Bundle;

    invoke-static {p1}, Ls3/e1;->k(Ls3/e1;)Ljava/util/HashMap;

    move-result-object p2

    invoke-static {p2}, Lj$/util/DesugarCollections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object p2

    iput-object p2, p0, Ls3/f1;->e:Ljava/util/Map;

    invoke-static {p1}, Ls3/e1;->i(Ls3/e1;)Ljava/lang/String;

    move-result-object p2

    iput-object p2, p0, Ls3/f1;->f:Ljava/lang/String;

    invoke-static {p1}, Ls3/e1;->j(Ls3/e1;)Ljava/lang/String;

    move-result-object p2

    iput-object p2, p0, Ls3/f1;->g:Ljava/lang/String;

    invoke-static {p1}, Ls3/e1;->d(Ls3/e1;)I

    move-result p2

    iput p2, p0, Ls3/f1;->h:I

    invoke-static {p1}, Ls3/e1;->n(Ls3/e1;)Ljava/util/HashSet;

    move-result-object p2

    invoke-static {p2}, Lj$/util/DesugarCollections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object p2

    iput-object p2, p0, Ls3/f1;->i:Ljava/util/Set;

    invoke-static {p1}, Ls3/e1;->e(Ls3/e1;)Landroid/os/Bundle;

    move-result-object p2

    iput-object p2, p0, Ls3/f1;->j:Landroid/os/Bundle;

    invoke-static {p1}, Ls3/e1;->l(Ls3/e1;)Ljava/util/HashSet;

    move-result-object p2

    invoke-static {p2}, Lj$/util/DesugarCollections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object p2

    iput-object p2, p0, Ls3/f1;->k:Ljava/util/Set;

    invoke-static {p1}, Ls3/e1;->b(Ls3/e1;)Z

    move-result p2

    iput-boolean p2, p0, Ls3/f1;->l:Z

    invoke-static {p1}, Ls3/e1;->g(Ls3/e1;)Ljava/lang/String;

    move-result-object p2

    iput-object p2, p0, Ls3/f1;->m:Ljava/lang/String;

    invoke-static {p1}, Ls3/e1;->c(Ls3/e1;)I

    move-result p1

    iput p1, p0, Ls3/f1;->n:I

    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    iget v0, p0, Ls3/f1;->n:I

    return v0
.end method

.method public final b()I
    .locals 1

    iget v0, p0, Ls3/f1;->h:I

    return v0
.end method

.method public final c()J
    .locals 2

    iget-wide v0, p0, Ls3/f1;->o:J

    return-wide v0
.end method

.method public final d()Landroid/os/Bundle;
    .locals 1

    iget-object v0, p0, Ls3/f1;->j:Landroid/os/Bundle;

    return-object v0
.end method

.method public final e(Ljava/lang/Class;)Landroid/os/Bundle;
    .locals 1

    iget-object v0, p0, Ls3/f1;->d:Landroid/os/Bundle;

    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object p1

    return-object p1
.end method

.method public final f()Landroid/os/Bundle;
    .locals 1

    iget-object v0, p0, Ls3/f1;->d:Landroid/os/Bundle;

    return-object v0
.end method

.method public final g()LG3/a;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final h()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Ls3/f1;->m:Ljava/lang/String;

    return-object v0
.end method

.method public final i()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Ls3/f1;->a:Ljava/lang/String;

    return-object v0
.end method

.method public final j()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Ls3/f1;->f:Ljava/lang/String;

    return-object v0
.end method

.method public final k()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Ls3/f1;->g:Ljava/lang/String;

    return-object v0
.end method

.method public final l()Ljava/util/List;
    .locals 2

    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Ls3/f1;->b:Ljava/util/List;

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    return-object v0
.end method

.method public final m()Ljava/util/Set;
    .locals 1

    iget-object v0, p0, Ls3/f1;->k:Ljava/util/Set;

    return-object v0
.end method

.method public final n()Ljava/util/Set;
    .locals 1

    iget-object v0, p0, Ls3/f1;->c:Ljava/util/Set;

    return-object v0
.end method

.method public final o(J)V
    .locals 0

    iput-wide p1, p0, Ls3/f1;->o:J

    return-void
.end method

.method public final p()Z
    .locals 1

    iget-boolean v0, p0, Ls3/f1;->l:Z

    return v0
.end method

.method public final q(Landroid/content/Context;)Z
    .locals 2

    .prologue
    invoke-static {}, Ls3/o1;->h()Ls3/o1;

    move-result-object v0

    invoke-virtual {v0}, Ls3/o1;->e()Lk3/t;

    move-result-object v0

    invoke-static {}, Ls3/y;->b()Lw3/g;

    iget-object v1, p0, Ls3/f1;->i:Ljava/util/Set;

    invoke-static {p1}, Lw3/g;->A(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p1

    invoke-interface {v1, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    invoke-virtual {v0}, Lk3/t;->e()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    return p1
.end method
