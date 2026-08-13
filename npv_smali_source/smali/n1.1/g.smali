.class public Ln1/g;
.super Ln1/f;
.source "SourceFile"


# instance fields
.field private m:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Ln1/p;)V
    .locals 1

    .prologue
    const-string v0, "run"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Ln1/f;-><init>(Ln1/p;)V

    instance-of p1, p1, Ln1/l;

    if-eqz p1, :cond_0

    sget-object p1, Ln1/f$a;->D:Ln1/f$a;

    goto :goto_0

    :cond_0
    sget-object p1, Ln1/f$a;->E:Ln1/f$a;

    :goto_0
    invoke-virtual {p0, p1}, Ln1/f;->p(Ln1/f$a;)V

    return-void
.end method


# virtual methods
.method public k(I)V
    .locals 1

    .prologue
    invoke-virtual {p0}, Ln1/f;->i()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Ln1/f;->r(Z)V

    invoke-virtual {p0, p1}, Ln1/f;->t(I)V

    invoke-virtual {p0}, Ln1/f;->d()Ljava/util/ArrayList;

    move-result-object p1

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

.method public final u()I
    .locals 1

    iget v0, p0, Ln1/g;->m:I

    return v0
.end method

.method public final v(I)V
    .locals 0

    iput p1, p0, Ln1/g;->m:I

    return-void
.end method
