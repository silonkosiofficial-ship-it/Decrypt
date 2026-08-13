.class public Ln1/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ln1/d;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ln1/f$a;
    }
.end annotation


# instance fields
.field private a:Ln1/p;

.field private b:Ln1/d;

.field private c:Z

.field private d:Z

.field private e:Ln1/f$a;

.field private f:I

.field private g:I

.field private h:I

.field private i:Ln1/g;

.field private j:Z

.field private final k:Ljava/util/ArrayList;

.field private final l:Ljava/util/ArrayList;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Ln1/p;)V
    .locals 1

    const-string v0, "mRun"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ln1/f;->a:Ln1/p;

    sget-object p1, Ln1/f$a;->C:Ln1/f$a;

    iput-object p1, p0, Ln1/f;->e:Ln1/f$a;

    const/4 p1, 0x1

    iput p1, p0, Ln1/f;->h:I

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Ln1/f;->k:Ljava/util/ArrayList;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Ln1/f;->l:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public a(Ln1/d;)V
    .locals 5

    .prologue
    const-string v0, "node"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Ln1/f;->l:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ln1/f;

    iget-boolean v0, v0, Ln1/f;->j:Z

    if-nez v0, :cond_0

    return-void

    :cond_1
    const/4 p1, 0x1

    iput-boolean p1, p0, Ln1/f;->d:Z

    iget-object v0, p0, Ln1/f;->b:Ln1/d;

    if-eqz v0, :cond_2

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-interface {v0, p0}, Ln1/d;->a(Ln1/d;)V

    :cond_2
    iget-boolean v0, p0, Ln1/f;->c:Z

    if-eqz v0, :cond_3

    iget-object p1, p0, Ln1/f;->a:Ln1/p;

    invoke-virtual {p1, p0}, Ln1/p;->a(Ln1/d;)V

    return-void

    :cond_3
    iget-object v0, p0, Ln1/f;->l:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ln1/f;

    instance-of v4, v3, Ln1/g;

    if-eqz v4, :cond_4

    goto :goto_0

    :cond_4
    add-int/lit8 v2, v2, 0x1

    move-object v1, v3

    goto :goto_0

    :cond_5
    if-eqz v1, :cond_8

    if-ne v2, p1, :cond_8

    iget-boolean p1, v1, Ln1/f;->j:Z

    if-eqz p1, :cond_8

    iget-object p1, p0, Ln1/f;->i:Ln1/g;

    if-eqz p1, :cond_7

    invoke-static {p1}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {p1}, Ln1/f;->i()Z

    move-result p1

    if-eqz p1, :cond_6

    iget p1, p0, Ln1/f;->h:I

    iget-object v0, p0, Ln1/f;->i:Ln1/g;

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v0}, Ln1/f;->j()I

    move-result v0

    mul-int/2addr p1, v0

    iput p1, p0, Ln1/f;->f:I

    goto :goto_1

    :cond_6
    return-void

    :cond_7
    :goto_1
    iget p1, v1, Ln1/f;->g:I

    iget v0, p0, Ln1/f;->f:I

    add-int/2addr p1, v0

    invoke-virtual {p0, p1}, Ln1/f;->k(I)V

    :cond_8
    iget-object p1, p0, Ln1/f;->b:Ln1/d;

    if-eqz p1, :cond_9

    invoke-static {p1}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-interface {p1, p0}, Ln1/d;->a(Ln1/d;)V

    :cond_9
    return-void
.end method

.method public final b(Ln1/d;)V
    .locals 1

    .prologue
    const-string v0, "dependency"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Ln1/f;->k:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-boolean v0, p0, Ln1/f;->j:Z

    if-eqz v0, :cond_0

    invoke-interface {p1, p1}, Ln1/d;->a(Ln1/d;)V

    :cond_0
    return-void
.end method

.method public final c()V
    .locals 1

    iget-object v0, p0, Ln1/f;->l:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    iget-object v0, p0, Ln1/f;->k:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Ln1/f;->j:Z

    iput v0, p0, Ln1/f;->g:I

    iput-boolean v0, p0, Ln1/f;->d:Z

    iput-boolean v0, p0, Ln1/f;->c:Z

    return-void
.end method

.method public final d()Ljava/util/ArrayList;
    .locals 1

    iget-object v0, p0, Ln1/f;->k:Ljava/util/ArrayList;

    return-object v0
.end method

.method public final e()I
    .locals 1

    iget v0, p0, Ln1/f;->f:I

    return v0
.end method

.method public final f()Ln1/p;
    .locals 1

    iget-object v0, p0, Ln1/f;->a:Ln1/p;

    return-object v0
.end method

.method public final g()Ljava/util/ArrayList;
    .locals 1

    iget-object v0, p0, Ln1/f;->l:Ljava/util/ArrayList;

    return-object v0
.end method

.method public final h()Z
    .locals 1

    iget-boolean v0, p0, Ln1/f;->d:Z

    return v0
.end method

.method public final i()Z
    .locals 1

    iget-boolean v0, p0, Ln1/f;->j:Z

    return v0
.end method

.method public final j()I
    .locals 1

    iget v0, p0, Ln1/f;->g:I

    return v0
.end method

.method public k(I)V
    .locals 1

    .prologue
    iget-boolean v0, p0, Ln1/f;->j:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Ln1/f;->j:Z

    iput p1, p0, Ln1/f;->g:I

    iget-object p1, p0, Ln1/f;->k:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ln1/d;

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-interface {v0, v0}, Ln1/d;->a(Ln1/d;)V

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final l(Z)V
    .locals 0

    iput-boolean p1, p0, Ln1/f;->c:Z

    return-void
.end method

.method public final m(I)V
    .locals 0

    iput p1, p0, Ln1/f;->f:I

    return-void
.end method

.method public final n(Ln1/g;)V
    .locals 0

    iput-object p1, p0, Ln1/f;->i:Ln1/g;

    return-void
.end method

.method public final o(I)V
    .locals 0

    iput p1, p0, Ln1/f;->h:I

    return-void
.end method

.method public final p(Ln1/f$a;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Ln1/f;->e:Ln1/f$a;

    return-void
.end method

.method public final q(Z)V
    .locals 0

    iput-boolean p1, p0, Ln1/f;->d:Z

    return-void
.end method

.method public final r(Z)V
    .locals 0

    iput-boolean p1, p0, Ln1/f;->j:Z

    return-void
.end method

.method public final s(Ln1/d;)V
    .locals 0

    iput-object p1, p0, Ln1/f;->b:Ln1/d;

    return-void
.end method

.method public final t(I)V
    .locals 0

    iput p1, p0, Ln1/f;->g:I

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    .prologue
    iget-object v0, p0, Ln1/f;->a:Ln1/p;

    invoke-virtual {v0}, Ln1/p;->n()Lm1/e;

    move-result-object v0

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lm1/e;->q()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Ln1/f;->e:Ln1/f$a;

    iget-boolean v2, p0, Ln1/f;->j:Z

    if-eqz v2, :cond_0

    iget v2, p0, Ln1/f;->g:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    goto :goto_0

    :cond_0
    const-string v2, "unresolved"

    :goto_0
    iget-object v3, p0, Ln1/f;->l:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    iget-object v4, p0, Ln1/f;->k:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v4

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ":"

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, "("

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ") <t="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ":d="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ">"

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
