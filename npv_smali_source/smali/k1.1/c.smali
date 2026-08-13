.class public final Lk1/c;
.super Lj1/e;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lk1/c$a;
    }
.end annotation


# instance fields
.field private s0:Lj1/g$d;

.field private t0:I

.field private u0:Lm1/a;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lj1/g;)V
    .locals 1

    const-string v0, "state"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lj1/g$e;->G:Lj1/g$e;

    invoke-direct {p0, p1, v0}, Lj1/e;-><init>(Lj1/g;Lj1/g$e;)V

    return-void
.end method


# virtual methods
.method public V0()Lm1/j;
    .locals 1

    .prologue
    iget-object v0, p0, Lk1/c;->u0:Lm1/a;

    if-nez v0, :cond_0

    new-instance v0, Lm1/a;

    invoke-direct {v0}, Lm1/a;-><init>()V

    iput-object v0, p0, Lk1/c;->u0:Lm1/a;

    :cond_0
    iget-object v0, p0, Lk1/c;->u0:Lm1/a;

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    return-object v0
.end method

.method public final Z0(Lj1/g$d;)V
    .locals 1

    const-string v0, "barrierDirection"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lk1/c;->s0:Lj1/g$d;

    return-void
.end method

.method public apply()V
    .locals 3

    .prologue
    invoke-virtual {p0}, Lk1/c;->V0()Lm1/j;

    iget-object v0, p0, Lk1/c;->s0:Lj1/g$d;

    if-nez v0, :cond_0

    const/4 v0, -0x1

    goto :goto_0

    :cond_0
    sget-object v1, Lk1/c$a;->a:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    :goto_0
    const/4 v1, 0x3

    if-eq v0, v1, :cond_2

    const/4 v2, 0x4

    if-eq v0, v2, :cond_2

    const/4 v2, 0x5

    if-eq v0, v2, :cond_1

    const/4 v2, 0x6

    if-eq v0, v2, :cond_3

    const/4 v1, 0x0

    goto :goto_1

    :cond_1
    const/4 v1, 0x2

    goto :goto_1

    :cond_2
    const/4 v1, 0x1

    :cond_3
    :goto_1
    iget-object v0, p0, Lk1/c;->u0:Lm1/a;

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Lm1/a;->l2(I)V

    iget-object v0, p0, Lk1/c;->u0:Lm1/a;

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    iget v1, p0, Lk1/c;->t0:I

    invoke-virtual {v0, v1}, Lm1/a;->m2(I)V

    return-void
.end method

.method public i0(I)Lj1/a;
    .locals 0

    iput p1, p0, Lk1/c;->t0:I

    return-object p0
.end method

.method public j0(Ljava/lang/Object;)Lj1/a;
    .locals 1

    const-string v0, "marginValue"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lj1/e;->W0()Lj1/g;

    move-result-object v0

    invoke-virtual {v0, p1}, Lj1/g;->e(Ljava/lang/Object;)I

    move-result p1

    invoke-virtual {p0, p1}, Lk1/c;->i0(I)Lj1/a;

    return-object p0
.end method
