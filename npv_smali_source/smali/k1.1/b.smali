.class public final Lk1/b;
.super Lj1/e;
.source "SourceFile"


# instance fields
.field private final s0:F


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lj1/g;)V
    .locals 1

    const-string v0, "state"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lj1/g$e;->F:Lj1/g$e;

    invoke-direct {p0, p1, v0}, Lj1/e;-><init>(Lj1/g;Lj1/g$e;)V

    const/high16 p1, 0x3f000000    # 0.5f

    iput p1, p0, Lk1/b;->s0:F

    return-void
.end method


# virtual methods
.method public apply()V
    .locals 4

    .prologue
    invoke-virtual {p0}, Lj1/e;->X0()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {p0}, Lj1/e;->W0()Lj1/g;

    move-result-object v2

    invoke-virtual {v2, v1}, Lj1/g;->d(Ljava/lang/Object;)Lj1/a;

    move-result-object v1

    invoke-static {v1}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v1}, Lj1/a;->u()Lj1/a;

    invoke-virtual {p0}, Lj1/a;->a0()Ljava/lang/Object;

    move-result-object v2

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    invoke-virtual {p0}, Lj1/a;->a0()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2}, Ly7/t;->c(Ljava/lang/Object;)V

    :goto_1
    invoke-virtual {v1, v2}, Lj1/a;->N0(Ljava/lang/Object;)Lj1/a;

    goto :goto_2

    :cond_0
    invoke-virtual {p0}, Lj1/a;->Z()Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-virtual {p0}, Lj1/a;->Z()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v1, v2}, Lj1/a;->M0(Ljava/lang/Object;)Lj1/a;

    goto :goto_2

    :cond_1
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    goto :goto_1

    :goto_2
    invoke-virtual {p0}, Lj1/a;->D()Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_2

    invoke-virtual {p0}, Lj1/a;->D()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v1, v2}, Lj1/a;->p(Ljava/lang/Object;)Lj1/a;

    goto :goto_4

    :cond_2
    invoke-virtual {p0}, Lj1/a;->C()Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_3

    invoke-virtual {p0}, Lj1/a;->C()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2}, Ly7/t;->c(Ljava/lang/Object;)V

    :goto_3
    invoke-virtual {v1, v2}, Lj1/a;->o(Ljava/lang/Object;)Lj1/a;

    goto :goto_4

    :cond_3
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    goto :goto_3

    :goto_4
    iget v2, p0, Lk1/b;->s0:F

    const/high16 v3, 0x3f000000    # 0.5f

    cmpg-float v3, v2, v3

    if-nez v3, :cond_4

    goto :goto_0

    :cond_4
    invoke-virtual {v1, v2}, Lj1/a;->R0(F)Lj1/a;

    goto :goto_0

    :cond_5
    return-void
.end method
