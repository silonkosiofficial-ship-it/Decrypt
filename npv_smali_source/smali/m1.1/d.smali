.class public final Lm1/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lm1/d$a;,
        Lm1/d$b;,
        Lm1/d$c;
    }
.end annotation


# static fields
.field public static final j:Lm1/d$a;

.field public static final k:I


# instance fields
.field private a:Ljava/util/HashSet;

.field private b:I

.field private c:Z

.field private d:Lm1/e;

.field private e:Lm1/d$b;

.field private f:Lm1/d;

.field private g:I

.field private h:I

.field private i:Le1/i;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lm1/d$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lm1/d$a;-><init>(Ly7/k;)V

    sput-object v0, Lm1/d;->j:Lm1/d$a;

    const/16 v0, 0x8

    sput v0, Lm1/d;->k:I

    return-void
.end method

.method public constructor <init>(Lm1/e;Lm1/d$b;)V
    .locals 1

    const-string v0, "owner"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "type"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/high16 v0, -0x80000000

    iput v0, p0, Lm1/d;->h:I

    iput-object p1, p0, Lm1/d;->d:Lm1/e;

    iput-object p2, p0, Lm1/d;->e:Lm1/d$b;

    return-void
.end method


# virtual methods
.method public final A(I)V
    .locals 0

    iput p1, p0, Lm1/d;->g:I

    return-void
.end method

.method public final B(Le1/i;)V
    .locals 0

    iput-object p1, p0, Lm1/d;->i:Le1/i;

    return-void
.end method

.method public final a(Lm1/d;I)Z
    .locals 2

    const/high16 v0, -0x80000000

    const/4 v1, 0x0

    invoke-virtual {p0, p1, p2, v0, v1}, Lm1/d;->b(Lm1/d;IIZ)Z

    move-result p1

    return p1
.end method

.method public final b(Lm1/d;IIZ)Z
    .locals 1

    .prologue
    const/4 v0, 0x1

    if-nez p1, :cond_0

    invoke-virtual {p0}, Lm1/d;->v()V

    return v0

    :cond_0
    if-nez p4, :cond_1

    invoke-virtual {p0, p1}, Lm1/d;->u(Lm1/d;)Z

    move-result p4

    if-nez p4, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    iput-object p1, p0, Lm1/d;->f:Lm1/d;

    invoke-static {p1}, Ly7/t;->c(Ljava/lang/Object;)V

    iget-object p1, p1, Lm1/d;->a:Ljava/util/HashSet;

    if-nez p1, :cond_2

    iget-object p1, p0, Lm1/d;->f:Lm1/d;

    invoke-static {p1}, Ly7/t;->c(Ljava/lang/Object;)V

    new-instance p4, Ljava/util/HashSet;

    invoke-direct {p4}, Ljava/util/HashSet;-><init>()V

    iput-object p4, p1, Lm1/d;->a:Ljava/util/HashSet;

    :cond_2
    iget-object p1, p0, Lm1/d;->f:Lm1/d;

    invoke-static {p1}, Ly7/t;->c(Ljava/lang/Object;)V

    iget-object p1, p1, Lm1/d;->a:Ljava/util/HashSet;

    if-eqz p1, :cond_3

    iget-object p1, p0, Lm1/d;->f:Lm1/d;

    invoke-static {p1}, Ly7/t;->c(Ljava/lang/Object;)V

    iget-object p1, p1, Lm1/d;->a:Ljava/util/HashSet;

    invoke-static {p1}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {p1, p0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    :cond_3
    iput p2, p0, Lm1/d;->g:I

    iput p3, p0, Lm1/d;->h:I

    return v0
.end method

.method public final c(ILjava/util/ArrayList;Ln1/o;)V
    .locals 3

    .prologue
    iget-object v0, p0, Lm1/d;->a:Ljava/util/HashSet;

    if-eqz v0, :cond_0

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lm1/d;

    sget-object v2, Ln1/i;->a:Ln1/i$a;

    iget-object v1, v1, Lm1/d;->d:Lm1/e;

    invoke-static {p2}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v2, v1, p1, p2, p3}, Ln1/i$a;->a(Lm1/e;ILjava/util/ArrayList;Ln1/o;)Ln1/o;

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final d()Ljava/util/HashSet;
    .locals 1

    iget-object v0, p0, Lm1/d;->a:Ljava/util/HashSet;

    return-object v0
.end method

.method public final e()I
    .locals 1

    .prologue
    iget-boolean v0, p0, Lm1/d;->c:Z

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    iget v0, p0, Lm1/d;->b:I

    :goto_0
    return v0
.end method

.method public final f()I
    .locals 1

    iget v0, p0, Lm1/d;->g:I

    return v0
.end method

.method public final g()Lm1/e;
    .locals 1

    iget-object v0, p0, Lm1/d;->d:Lm1/e;

    return-object v0
.end method

.method public final h()Le1/i;
    .locals 1

    iget-object v0, p0, Lm1/d;->i:Le1/i;

    return-object v0
.end method

.method public final i()Lm1/d;
    .locals 1

    iget-object v0, p0, Lm1/d;->f:Lm1/d;

    return-object v0
.end method

.method public final j()Lm1/d$b;
    .locals 1

    iget-object v0, p0, Lm1/d;->e:Lm1/d$b;

    return-object v0
.end method

.method public final k()I
    .locals 3

    .prologue
    iget-object v0, p0, Lm1/d;->d:Lm1/e;

    invoke-virtual {v0}, Lm1/e;->A0()I

    move-result v0

    const/16 v1, 0x8

    if-ne v0, v1, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    iget v0, p0, Lm1/d;->h:I

    const/high16 v2, -0x80000000

    if-eq v0, v2, :cond_1

    iget-object v0, p0, Lm1/d;->f:Lm1/d;

    if-eqz v0, :cond_1

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    iget-object v0, v0, Lm1/d;->d:Lm1/e;

    invoke-virtual {v0}, Lm1/e;->A0()I

    move-result v0

    if-ne v0, v1, :cond_1

    iget v0, p0, Lm1/d;->h:I

    goto :goto_0

    :cond_1
    iget v0, p0, Lm1/d;->g:I

    :goto_0
    return v0
.end method

.method public final l()Lm1/d;
    .locals 2

    .prologue
    iget-object v0, p0, Lm1/d;->e:Lm1/d$b;

    sget-object v1, Lm1/d$c;->a:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    packed-switch v0, :pswitch_data_0

    new-instance v0, Li7/s;

    invoke-direct {v0}, Li7/s;-><init>()V

    throw v0

    :pswitch_0
    iget-object v0, p0, Lm1/d;->d:Lm1/e;

    invoke-virtual {v0}, Lm1/e;->c0()Lm1/d;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget-object v0, p0, Lm1/d;->d:Lm1/e;

    invoke-virtual {v0}, Lm1/e;->G()Lm1/d;

    move-result-object v0

    return-object v0

    :pswitch_2
    iget-object v0, p0, Lm1/d;->d:Lm1/e;

    invoke-virtual {v0}, Lm1/e;->L()Lm1/d;

    move-result-object v0

    return-object v0

    :pswitch_3
    iget-object v0, p0, Lm1/d;->d:Lm1/e;

    invoke-virtual {v0}, Lm1/e;->b0()Lm1/d;

    move-result-object v0

    return-object v0

    :pswitch_4
    const/4 v0, 0x0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
    .end packed-switch
.end method

.method public final m()Lm1/e;
    .locals 1

    iget-object v0, p0, Lm1/d;->d:Lm1/e;

    return-object v0
.end method

.method public final n()Le1/i;
    .locals 1

    iget-object v0, p0, Lm1/d;->i:Le1/i;

    return-object v0
.end method

.method public final o()Lm1/d;
    .locals 1

    iget-object v0, p0, Lm1/d;->f:Lm1/d;

    return-object v0
.end method

.method public final p()Lm1/d$b;
    .locals 1

    iget-object v0, p0, Lm1/d;->e:Lm1/d$b;

    return-object v0
.end method

.method public final q()Z
    .locals 3

    .prologue
    iget-object v0, p0, Lm1/d;->a:Ljava/util/HashSet;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lm1/d;

    invoke-virtual {v2}, Lm1/d;->l()Lm1/d;

    move-result-object v2

    invoke-static {v2}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v2}, Lm1/d;->t()Z

    move-result v2

    if-eqz v2, :cond_1

    const/4 v0, 0x1

    return v0

    :cond_2
    return v1
.end method

.method public final r()Z
    .locals 2

    .prologue
    iget-object v0, p0, Lm1/d;->a:Ljava/util/HashSet;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v0}, Ljava/util/HashSet;->size()I

    move-result v0

    if-lez v0, :cond_1

    const/4 v1, 0x1

    :cond_1
    :goto_0
    return v1
.end method

.method public final s()Z
    .locals 1

    iget-boolean v0, p0, Lm1/d;->c:Z

    return v0
.end method

.method public final t()Z
    .locals 1

    .prologue
    iget-object v0, p0, Lm1/d;->f:Lm1/d;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Lm1/d;->d:Lm1/e;

    invoke-virtual {v0}, Lm1/e;->q()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lm1/d;->e:Lm1/d$b;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ":"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final u(Lm1/d;)Z
    .locals 5

    .prologue
    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    :cond_0
    invoke-virtual {p1}, Lm1/d;->p()Lm1/d$b;

    move-result-object v1

    iget-object v2, p0, Lm1/d;->e:Lm1/d$b;

    const/4 v3, 0x1

    if-ne v1, v2, :cond_3

    sget-object v1, Lm1/d$b;->H:Lm1/d$b;

    if-ne v2, v1, :cond_1

    invoke-virtual {p1}, Lm1/d;->m()Lm1/e;

    move-result-object p1

    invoke-virtual {p1}, Lm1/e;->v()Z

    move-result p1

    if-eqz p1, :cond_2

    invoke-virtual {p0}, Lm1/d;->m()Lm1/e;

    move-result-object p1

    invoke-virtual {p1}, Lm1/e;->v()Z

    move-result p1

    if-eqz p1, :cond_2

    :cond_1
    move v0, v3

    :cond_2
    return v0

    :cond_3
    sget-object v4, Lm1/d$c;->a:[I

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v2, v4, v2

    packed-switch v2, :pswitch_data_0

    new-instance p1, Li7/s;

    invoke-direct {p1}, Li7/s;-><init>()V

    throw p1

    :pswitch_0
    return v0

    :pswitch_1
    sget-object p1, Lm1/d$b;->D:Lm1/d$b;

    if-eq v1, p1, :cond_4

    sget-object p1, Lm1/d$b;->F:Lm1/d$b;

    if-eq v1, p1, :cond_4

    move v0, v3

    :cond_4
    return v0

    :pswitch_2
    sget-object v2, Lm1/d$b;->E:Lm1/d$b;

    if-eq v1, v2, :cond_6

    sget-object v2, Lm1/d$b;->G:Lm1/d$b;

    if-ne v1, v2, :cond_5

    goto :goto_0

    :cond_5
    move v2, v0

    goto :goto_1

    :cond_6
    :goto_0
    move v2, v3

    :goto_1
    invoke-virtual {p1}, Lm1/d;->m()Lm1/e;

    move-result-object p1

    instance-of p1, p1, Lm1/h;

    if-eqz p1, :cond_9

    if-nez v2, :cond_7

    sget-object p1, Lm1/d$b;->K:Lm1/d$b;

    if-ne v1, p1, :cond_8

    :cond_7
    move v0, v3

    :cond_8
    move v2, v0

    :cond_9
    return v2

    :pswitch_3
    sget-object v2, Lm1/d$b;->D:Lm1/d$b;

    if-eq v1, v2, :cond_b

    sget-object v2, Lm1/d$b;->F:Lm1/d$b;

    if-ne v1, v2, :cond_a

    goto :goto_2

    :cond_a
    move v2, v0

    goto :goto_3

    :cond_b
    :goto_2
    move v2, v3

    :goto_3
    invoke-virtual {p1}, Lm1/d;->m()Lm1/e;

    move-result-object p1

    instance-of p1, p1, Lm1/h;

    if-eqz p1, :cond_e

    if-nez v2, :cond_c

    sget-object p1, Lm1/d$b;->J:Lm1/d$b;

    if-ne v1, p1, :cond_d

    :cond_c
    move v0, v3

    :cond_d
    move v2, v0

    :cond_e
    return v2

    :pswitch_4
    sget-object p1, Lm1/d$b;->H:Lm1/d$b;

    if-eq v1, p1, :cond_f

    sget-object p1, Lm1/d$b;->J:Lm1/d$b;

    if-eq v1, p1, :cond_f

    sget-object p1, Lm1/d$b;->K:Lm1/d$b;

    if-eq v1, p1, :cond_f

    move v0, v3

    :cond_f
    return v0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_4
        :pswitch_3
        :pswitch_3
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public final v()V
    .locals 2

    .prologue
    iget-object v0, p0, Lm1/d;->f:Lm1/d;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    iget-object v0, v0, Lm1/d;->a:Ljava/util/HashSet;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lm1/d;->f:Lm1/d;

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    iget-object v0, v0, Lm1/d;->a:Ljava/util/HashSet;

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v0, p0}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    iget-object v0, p0, Lm1/d;->f:Lm1/d;

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    iget-object v0, v0, Lm1/d;->a:Ljava/util/HashSet;

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v0}, Ljava/util/HashSet;->size()I

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lm1/d;->f:Lm1/d;

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    iput-object v1, v0, Lm1/d;->a:Ljava/util/HashSet;

    :cond_0
    iput-object v1, p0, Lm1/d;->a:Ljava/util/HashSet;

    iput-object v1, p0, Lm1/d;->f:Lm1/d;

    const/4 v0, 0x0

    iput v0, p0, Lm1/d;->g:I

    const/high16 v1, -0x80000000

    iput v1, p0, Lm1/d;->h:I

    iput-boolean v0, p0, Lm1/d;->c:Z

    iput v0, p0, Lm1/d;->b:I

    return-void
.end method

.method public final w()V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lm1/d;->c:Z

    iput v0, p0, Lm1/d;->b:I

    return-void
.end method

.method public final x(Le1/c;)V
    .locals 2

    .prologue
    iget-object p1, p0, Lm1/d;->i:Le1/i;

    if-nez p1, :cond_0

    new-instance p1, Le1/i;

    sget-object v0, Le1/i$b;->C:Le1/i$b;

    const/4 v1, 0x0

    invoke-direct {p1, v0, v1}, Le1/i;-><init>(Le1/i$b;Ljava/lang/String;)V

    iput-object p1, p0, Lm1/d;->i:Le1/i;

    goto :goto_0

    :cond_0
    invoke-static {p1}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {p1}, Le1/i;->C()V

    :goto_0
    return-void
.end method

.method public final y(I)V
    .locals 0

    iput p1, p0, Lm1/d;->b:I

    const/4 p1, 0x1

    iput-boolean p1, p0, Lm1/d;->c:Z

    return-void
.end method

.method public final z(I)V
    .locals 1

    .prologue
    invoke-virtual {p0}, Lm1/d;->t()Z

    move-result v0

    if-eqz v0, :cond_0

    iput p1, p0, Lm1/d;->h:I

    :cond_0
    return-void
.end method
