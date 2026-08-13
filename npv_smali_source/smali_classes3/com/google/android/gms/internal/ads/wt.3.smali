.class public final Lcom/google/android/gms/internal/ads/wt;
.super Lcom/google/android/gms/internal/ads/Wr;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/Pv0;
.implements Lcom/google/android/gms/internal/ads/NB0;


# static fields
.field public static final synthetic Y:I


# instance fields
.field private final E:Landroid/content/Context;

.field private final F:Lcom/google/android/gms/internal/ads/ft;

.field private final G:Lcom/google/android/gms/internal/ads/GJ0;

.field private final H:Lcom/google/android/gms/internal/ads/es;

.field private final I:Ljava/lang/ref/WeakReference;

.field private final J:Lcom/google/android/gms/internal/ads/tI0;

.field private K:Lcom/google/android/gms/internal/ads/bA0;

.field private L:Ljava/nio/ByteBuffer;

.field private M:Z

.field private N:Lcom/google/android/gms/internal/ads/Vr;

.field private O:I

.field private P:I

.field private Q:J

.field private final R:Ljava/lang/String;

.field private final S:I

.field private final T:Ljava/lang/Object;

.field private U:Ljava/lang/Integer;

.field private final V:Ljava/util/ArrayList;

.field private volatile W:Lcom/google/android/gms/internal/ads/ht;

.field private final X:Ljava/util/Set;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/internal/ads/es;Lcom/google/android/gms/internal/ads/fs;Ljava/lang/Integer;)V
    .locals 3

    .prologue
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/Wr;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/wt;->T:Ljava/lang/Object;

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/wt;->X:Ljava/util/Set;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/wt;->E:Landroid/content/Context;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/wt;->H:Lcom/google/android/gms/internal/ads/es;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/wt;->U:Ljava/lang/Integer;

    new-instance p4, Ljava/lang/ref/WeakReference;

    invoke-direct {p4, p3}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/wt;->I:Ljava/lang/ref/WeakReference;

    new-instance p4, Lcom/google/android/gms/internal/ads/ft;

    invoke-direct {p4}, Lcom/google/android/gms/internal/ads/ft;-><init>()V

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/wt;->F:Lcom/google/android/gms/internal/ads/ft;

    new-instance v0, Lcom/google/android/gms/internal/ads/GJ0;

    invoke-direct {v0, p1}, Lcom/google/android/gms/internal/ads/GJ0;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/wt;->G:Lcom/google/android/gms/internal/ads/GJ0;

    invoke-static {}, Lv3/q0;->m()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "SimpleExoPlayerAdapter initialize "

    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lv3/q0;->k(Ljava/lang/String;)V

    :cond_0
    invoke-static {}, Lcom/google/android/gms/internal/ads/Wr;->u()Ljava/util/concurrent/atomic/AtomicInteger;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    new-instance v1, Lcom/google/android/gms/internal/ads/HB0;

    new-instance v2, Lcom/google/android/gms/internal/ads/ut;

    invoke-direct {v2, p0}, Lcom/google/android/gms/internal/ads/ut;-><init>(Lcom/google/android/gms/internal/ads/wt;)V

    invoke-direct {v1, p1, v2}, Lcom/google/android/gms/internal/ads/HB0;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/ads/ut;)V

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/HB0;->b(Lcom/google/android/gms/internal/ads/PJ0;)Lcom/google/android/gms/internal/ads/HB0;

    invoke-virtual {v1, p4}, Lcom/google/android/gms/internal/ads/HB0;->a(Lcom/google/android/gms/internal/ads/WA0;)Lcom/google/android/gms/internal/ads/HB0;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/HB0;->c()Lcom/google/android/gms/internal/ads/IB0;

    move-result-object p4

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/wt;->K:Lcom/google/android/gms/internal/ads/bA0;

    invoke-interface {p4, p0}, Lcom/google/android/gms/internal/ads/bA0;->K(Lcom/google/android/gms/internal/ads/NB0;)V

    const/4 p4, 0x0

    iput p4, p0, Lcom/google/android/gms/internal/ads/wt;->O:I

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/google/android/gms/internal/ads/wt;->Q:J

    iput p4, p0, Lcom/google/android/gms/internal/ads/wt;->P:I

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/wt;->V:Ljava/util/ArrayList;

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/wt;->W:Lcom/google/android/gms/internal/ads/ht;

    if-eqz p3, :cond_1

    invoke-interface {p3}, Lcom/google/android/gms/internal/ads/fs;->t()Ljava/lang/String;

    move-result-object v0

    :cond_1
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/yg0;->d(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/yg0;

    move-result-object v0

    const-string v1, ""

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/yg0;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/wt;->R:Ljava/lang/String;

    if-eqz p3, :cond_2

    invoke-interface {p3}, Lcom/google/android/gms/internal/ads/fs;->e()I

    move-result v0

    goto :goto_0

    :cond_2
    move v0, p4

    :goto_0
    iput v0, p0, Lcom/google/android/gms/internal/ads/wt;->S:I

    new-instance v0, Lcom/google/android/gms/internal/ads/tI0;

    invoke-static {}, Lr3/v;->t()Lv3/E0;

    move-result-object v1

    invoke-interface {p3}, Lcom/google/android/gms/internal/ads/fs;->n()Lw3/a;

    move-result-object p3

    iget-object p3, p3, Lw3/a;->C:Ljava/lang/String;

    invoke-virtual {v1, p1, p3}, Lv3/E0;->H(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iget-boolean p3, p0, Lcom/google/android/gms/internal/ads/wt;->M:Z

    if-eqz p3, :cond_3

    iget-object p3, p0, Lcom/google/android/gms/internal/ads/wt;->L:Ljava/nio/ByteBuffer;

    invoke-virtual {p3}, Ljava/nio/Buffer;->limit()I

    move-result p3

    if-lez p3, :cond_3

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/wt;->L:Ljava/nio/ByteBuffer;

    invoke-virtual {p1}, Ljava/nio/Buffer;->limit()I

    move-result p1

    new-array p1, p1, [B

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/wt;->L:Ljava/nio/ByteBuffer;

    invoke-virtual {p2, p1}, Ljava/nio/ByteBuffer;->get([B)Ljava/nio/ByteBuffer;

    new-instance p2, Lcom/google/android/gms/internal/ads/kt;

    invoke-direct {p2, p1}, Lcom/google/android/gms/internal/ads/kt;-><init>([B)V

    goto/16 :goto_6

    :cond_3
    sget-object p3, Lcom/google/android/gms/internal/ads/Af;->g2:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v1

    invoke-virtual {v1, p3}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/lang/Boolean;

    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p3

    const/4 v1, 0x1

    if-eqz p3, :cond_5

    sget-object p3, Lcom/google/android/gms/internal/ads/Af;->Y1:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v2

    invoke-virtual {v2, p3}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/lang/Boolean;

    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p3

    if-nez p3, :cond_4

    goto :goto_2

    :cond_4
    :goto_1
    move p4, v1

    goto :goto_3

    :cond_5
    :goto_2
    iget-boolean p3, p2, Lcom/google/android/gms/internal/ads/es;->i:Z

    if-nez p3, :cond_6

    goto :goto_1

    :cond_6
    :goto_3
    iget-boolean p3, p2, Lcom/google/android/gms/internal/ads/es;->l:Z

    if-eqz p3, :cond_7

    new-instance p3, Lcom/google/android/gms/internal/ads/mt;

    invoke-direct {p3, p0, p1, p4}, Lcom/google/android/gms/internal/ads/mt;-><init>(Lcom/google/android/gms/internal/ads/wt;Ljava/lang/String;Z)V

    goto :goto_4

    :cond_7
    iget p3, p2, Lcom/google/android/gms/internal/ads/es;->h:I

    if-lez p3, :cond_8

    new-instance p3, Lcom/google/android/gms/internal/ads/nt;

    invoke-direct {p3, p0, p1, p4}, Lcom/google/android/gms/internal/ads/nt;-><init>(Lcom/google/android/gms/internal/ads/wt;Ljava/lang/String;Z)V

    goto :goto_4

    :cond_8
    new-instance p3, Lcom/google/android/gms/internal/ads/ot;

    invoke-direct {p3, p0, p1, p4}, Lcom/google/android/gms/internal/ads/ot;-><init>(Lcom/google/android/gms/internal/ads/wt;Ljava/lang/String;Z)V

    :goto_4
    iget-boolean p1, p2, Lcom/google/android/gms/internal/ads/es;->i:Z

    if-eqz p1, :cond_9

    new-instance p1, Lcom/google/android/gms/internal/ads/pt;

    invoke-direct {p1, p0, p3}, Lcom/google/android/gms/internal/ads/pt;-><init>(Lcom/google/android/gms/internal/ads/wt;Lcom/google/android/gms/internal/ads/Oh0;)V

    move-object p2, p1

    goto :goto_5

    :cond_9
    move-object p2, p3

    :goto_5
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/wt;->L:Ljava/nio/ByteBuffer;

    if-eqz p1, :cond_a

    invoke-virtual {p1}, Ljava/nio/Buffer;->limit()I

    move-result p1

    if-lez p1, :cond_a

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/wt;->L:Ljava/nio/ByteBuffer;

    invoke-virtual {p1}, Ljava/nio/Buffer;->limit()I

    move-result p1

    new-array p1, p1, [B

    iget-object p3, p0, Lcom/google/android/gms/internal/ads/wt;->L:Ljava/nio/ByteBuffer;

    invoke-virtual {p3, p1}, Ljava/nio/ByteBuffer;->get([B)Ljava/nio/ByteBuffer;

    new-instance p3, Lcom/google/android/gms/internal/ads/rt;

    invoke-direct {p3, p2, p1}, Lcom/google/android/gms/internal/ads/rt;-><init>(Lcom/google/android/gms/internal/ads/Oh0;[B)V

    move-object p2, p3

    :cond_a
    :goto_6
    sget-object p1, Lcom/google/android/gms/internal/ads/Af;->l:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object p3

    invoke-virtual {p3, p1}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_b

    new-instance p1, Lcom/google/android/gms/internal/ads/vt;

    invoke-direct {p1}, Lcom/google/android/gms/internal/ads/vt;-><init>()V

    goto :goto_7

    :cond_b
    new-instance p1, Lcom/google/android/gms/internal/ads/lt;

    invoke-direct {p1}, Lcom/google/android/gms/internal/ads/lt;-><init>()V

    :goto_7
    new-instance p3, Lcom/google/android/gms/internal/ads/sI0;

    invoke-direct {p3, p1}, Lcom/google/android/gms/internal/ads/sI0;-><init>(Lcom/google/android/gms/internal/ads/y0;)V

    invoke-direct {v0, p2, p3}, Lcom/google/android/gms/internal/ads/tI0;-><init>(Lcom/google/android/gms/internal/ads/Oh0;Lcom/google/android/gms/internal/ads/sI0;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/wt;->J:Lcom/google/android/gms/internal/ads/tI0;

    return-void
.end method

.method private final d0()Z
    .locals 1

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/wt;->W:Lcom/google/android/gms/internal/ads/ht;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/wt;->W:Lcom/google/android/gms/internal/ads/ht;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/ht;->q()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method


# virtual methods
.method public final A(I)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/wt;->F:Lcom/google/android/gms/internal/ads/ft;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/ft;->l(I)V

    return-void
.end method

.method public final B(I)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/wt;->F:Lcom/google/android/gms/internal/ads/ft;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/ft;->m(I)V

    return-void
.end method

.method public final C(Lcom/google/android/gms/internal/ads/Vr;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/wt;->N:Lcom/google/android/gms/internal/ads/Vr;

    return-void
.end method

.method public final D(I)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/wt;->F:Lcom/google/android/gms/internal/ads/ft;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/ft;->n(I)V

    return-void
.end method

.method public final E(I)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/wt;->F:Lcom/google/android/gms/internal/ads/ft;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/ft;->o(I)V

    return-void
.end method

.method public final F(Z)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/wt;->K:Lcom/google/android/gms/internal/ads/bA0;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/ads/rj;->o(Z)V

    return-void
.end method

.method public final G(Ljava/lang/Integer;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/wt;->U:Ljava/lang/Integer;

    return-void
.end method

.method public final H(Z)V
    .locals 4

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/wt;->K:Lcom/google/android/gms/internal/ads/bA0;

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/wt;->K:Lcom/google/android/gms/internal/ads/bA0;

    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/bA0;->C()I

    const/4 v1, 0x2

    if-ge v0, v1, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/wt;->G:Lcom/google/android/gms/internal/ads/GJ0;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/GJ0;->n()Lcom/google/android/gms/internal/ads/nJ0;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/nJ0;->c()Lcom/google/android/gms/internal/ads/mJ0;

    move-result-object v2

    xor-int/lit8 v3, p1, 0x1

    invoke-virtual {v2, v0, v3}, Lcom/google/android/gms/internal/ads/mJ0;->q(IZ)Lcom/google/android/gms/internal/ads/mJ0;

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/ads/GJ0;->r(Lcom/google/android/gms/internal/ads/mJ0;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final I(I)V
    .locals 2

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/wt;->X:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/ref/WeakReference;

    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/ads/et;

    if-eqz v1, :cond_0

    invoke-virtual {v1, p1}, Lcom/google/android/gms/internal/ads/et;->m(I)V

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final J(Landroid/view/Surface;Z)V
    .locals 0

    .prologue
    iget-object p2, p0, Lcom/google/android/gms/internal/ads/wt;->K:Lcom/google/android/gms/internal/ads/bA0;

    if-eqz p2, :cond_0

    invoke-interface {p2, p1}, Lcom/google/android/gms/internal/ads/rj;->a(Landroid/view/Surface;)V

    :cond_0
    return-void
.end method

.method public final K(FZ)V
    .locals 0

    .prologue
    iget-object p2, p0, Lcom/google/android/gms/internal/ads/wt;->K:Lcom/google/android/gms/internal/ads/bA0;

    if-eqz p2, :cond_0

    invoke-interface {p2, p1}, Lcom/google/android/gms/internal/ads/rj;->R(F)V

    :cond_0
    return-void
.end method

.method public final L()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/wt;->K:Lcom/google/android/gms/internal/ads/bA0;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/rj;->w()V

    return-void
.end method

.method public final M()Z
    .locals 1

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/wt;->K:Lcom/google/android/gms/internal/ads/bA0;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final N()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/ads/wt;->P:I

    return v0
.end method

.method public final P()I
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/wt;->K:Lcom/google/android/gms/internal/ads/bA0;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/rj;->e()I

    move-result v0

    return v0
.end method

.method public final R()J
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/wt;->K:Lcom/google/android/gms/internal/ads/bA0;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/rj;->h()J

    move-result-wide v0

    return-wide v0
.end method

.method public final S()J
    .locals 2

    iget v0, p0, Lcom/google/android/gms/internal/ads/wt;->O:I

    int-to-long v0, v0

    return-wide v0
.end method

.method public final T()J
    .locals 4

    .prologue
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/wt;->d0()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/wt;->W:Lcom/google/android/gms/internal/ads/ht;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/ht;->p()Z

    move-result v0

    if-eqz v0, :cond_1

    iget v0, p0, Lcom/google/android/gms/internal/ads/wt;->O:I

    int-to-long v0, v0

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/wt;->W:Lcom/google/android/gms/internal/ads/ht;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/ht;->k()J

    move-result-wide v2

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v0

    return-wide v0

    :cond_1
    :goto_0
    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method public final U()J
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/wt;->K:Lcom/google/android/gms/internal/ads/bA0;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/rj;->k()J

    move-result-wide v0

    return-wide v0
.end method

.method public final V()J
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/wt;->K:Lcom/google/android/gms/internal/ads/bA0;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/rj;->l()J

    move-result-wide v0

    return-wide v0
.end method

.method final synthetic W(Ljava/lang/String;Z)Lcom/google/android/gms/internal/ads/pi0;
    .locals 10

    .prologue
    const/4 v0, 0x1

    if-eq v0, p2, :cond_0

    const/4 p2, 0x0

    move-object v2, p2

    goto :goto_0

    :cond_0
    move-object v2, p0

    :goto_0
    iget-object p2, p0, Lcom/google/android/gms/internal/ads/wt;->H:Lcom/google/android/gms/internal/ads/es;

    new-instance v9, Lcom/google/android/gms/internal/ads/zt;

    iget v3, p2, Lcom/google/android/gms/internal/ads/es;->d:I

    iget v4, p2, Lcom/google/android/gms/internal/ads/es;->e:I

    iget-wide v5, p2, Lcom/google/android/gms/internal/ads/es;->m:J

    iget-wide v7, p2, Lcom/google/android/gms/internal/ads/es;->n:J

    move-object v0, v9

    move-object v1, p1

    invoke-direct/range {v0 .. v8}, Lcom/google/android/gms/internal/ads/zt;-><init>(Ljava/lang/String;Lcom/google/android/gms/internal/ads/Pv0;IIJJ)V

    return-object v9
.end method

.method final synthetic X(Ljava/lang/String;Z)Lcom/google/android/gms/internal/ads/pi0;
    .locals 7

    .prologue
    const/4 v0, 0x1

    if-eq v0, p2, :cond_0

    const/4 p2, 0x0

    move-object v2, p2

    goto :goto_0

    :cond_0
    move-object v2, p0

    :goto_0
    iget-object p2, p0, Lcom/google/android/gms/internal/ads/wt;->H:Lcom/google/android/gms/internal/ads/es;

    new-instance v6, Lcom/google/android/gms/internal/ads/et;

    iget v3, p2, Lcom/google/android/gms/internal/ads/es;->d:I

    iget v4, p2, Lcom/google/android/gms/internal/ads/es;->e:I

    iget v5, p2, Lcom/google/android/gms/internal/ads/es;->h:I

    move-object v0, v6

    move-object v1, p1

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/ads/et;-><init>(Ljava/lang/String;Lcom/google/android/gms/internal/ads/Pv0;III)V

    new-instance p1, Ljava/lang/ref/WeakReference;

    invoke-direct {p1, v6}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/wt;->X:Ljava/util/Set;

    invoke-interface {p2, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-object v6
.end method

.method final synthetic Y(Ljava/lang/String;Z)Lcom/google/android/gms/internal/ads/pi0;
    .locals 1

    .prologue
    new-instance v0, Lcom/google/android/gms/internal/ads/Jm0;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/Jm0;-><init>()V

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/Jm0;->f(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/Jm0;

    const/4 p1, 0x1

    if-eq p1, p2, :cond_0

    const/4 p2, 0x0

    goto :goto_0

    :cond_0
    move-object p2, p0

    :goto_0
    invoke-virtual {v0, p2}, Lcom/google/android/gms/internal/ads/Jm0;->e(Lcom/google/android/gms/internal/ads/Pv0;)Lcom/google/android/gms/internal/ads/Jm0;

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/wt;->H:Lcom/google/android/gms/internal/ads/es;

    iget p2, p2, Lcom/google/android/gms/internal/ads/es;->d:I

    invoke-virtual {v0, p2}, Lcom/google/android/gms/internal/ads/Jm0;->c(I)Lcom/google/android/gms/internal/ads/Jm0;

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/wt;->H:Lcom/google/android/gms/internal/ads/es;

    iget p2, p2, Lcom/google/android/gms/internal/ads/es;->e:I

    invoke-virtual {v0, p2}, Lcom/google/android/gms/internal/ads/Jm0;->d(I)Lcom/google/android/gms/internal/ads/Jm0;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/Jm0;->b(Z)Lcom/google/android/gms/internal/ads/Jm0;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/Jm0;->g()Lcom/google/android/gms/internal/ads/np0;

    move-result-object p1

    return-object p1
.end method

.method final synthetic Z(Lcom/google/android/gms/internal/ads/Oh0;)Lcom/google/android/gms/internal/ads/pi0;
    .locals 8

    new-instance v7, Lcom/google/android/gms/internal/ads/ht;

    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/Oh0;->a()Lcom/google/android/gms/internal/ads/pi0;

    move-result-object v2

    new-instance v6, Lcom/google/android/gms/internal/ads/tt;

    invoke-direct {v6, p0}, Lcom/google/android/gms/internal/ads/tt;-><init>(Lcom/google/android/gms/internal/ads/wt;)V

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/wt;->R:Ljava/lang/String;

    iget v4, p0, Lcom/google/android/gms/internal/ads/wt;->S:I

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/wt;->E:Landroid/content/Context;

    move-object v0, v7

    move-object v5, p0

    invoke-direct/range {v0 .. v6}, Lcom/google/android/gms/internal/ads/ht;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/ads/pi0;Ljava/lang/String;ILcom/google/android/gms/internal/ads/Pv0;Lcom/google/android/gms/internal/ads/tt;)V

    return-object v7
.end method

.method public final synthetic a(Lcom/google/android/gms/internal/ads/LB0;Lcom/google/android/gms/internal/ads/HH0;)V
    .locals 0

    return-void
.end method

.method final a0(Landroid/net/Uri;)Lcom/google/android/gms/internal/ads/NH0;
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/ads/I1;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/I1;-><init>()V

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/I1;->b(Landroid/net/Uri;)Lcom/google/android/gms/internal/ads/I1;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/I1;->c()Lcom/google/android/gms/internal/ads/Q7;

    move-result-object p1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/wt;->J:Lcom/google/android/gms/internal/ads/tI0;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/wt;->H:Lcom/google/android/gms/internal/ads/es;

    iget v1, v1, Lcom/google/android/gms/internal/ads/es;->f:I

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/tI0;->a(I)Lcom/google/android/gms/internal/ads/tI0;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/tI0;->b(Lcom/google/android/gms/internal/ads/Q7;)Lcom/google/android/gms/internal/ads/vI0;

    move-result-object p1

    return-object p1
.end method

.method public final b(Lcom/google/android/gms/internal/ads/LB0;Lcom/google/android/gms/internal/ads/D;Lcom/google/android/gms/internal/ads/Hz0;)V
    .locals 3

    .prologue
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/wt;->I:Ljava/lang/ref/WeakReference;

    invoke-virtual {p1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/ads/fs;

    sget-object p3, Lcom/google/android/gms/internal/ads/Af;->Y1:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v0

    invoke-virtual {v0, p3}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/lang/Boolean;

    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p3

    if-eqz p3, :cond_3

    if-eqz p1, :cond_3

    new-instance p3, Ljava/util/HashMap;

    invoke-direct {p3}, Ljava/util/HashMap;-><init>()V

    iget v0, p2, Lcom/google/android/gms/internal/ads/D;->x:F

    const-string v1, "frameRate"

    invoke-static {v0}, Ljava/lang/String;->valueOf(F)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p3, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget v0, p2, Lcom/google/android/gms/internal/ads/D;->j:I

    const-string v1, "bitRate"

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p3, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget v0, p2, Lcom/google/android/gms/internal/ads/D;->v:I

    iget v1, p2, Lcom/google/android/gms/internal/ads/D;->w:I

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, "x"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "resolution"

    invoke-interface {p3, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p2, Lcom/google/android/gms/internal/ads/D;->n:Ljava/lang/String;

    if-eqz v0, :cond_0

    const-string v1, "videoMime"

    invoke-interface {p3, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    iget-object v0, p2, Lcom/google/android/gms/internal/ads/D;->o:Ljava/lang/String;

    if-eqz v0, :cond_1

    const-string v1, "videoSampleMime"

    invoke-interface {p3, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    iget-object p2, p2, Lcom/google/android/gms/internal/ads/D;->k:Ljava/lang/String;

    if-eqz p2, :cond_2

    const-string v0, "videoCodec"

    invoke-interface {p3, v0, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    const-string p2, "onMetadataEvent"

    invoke-interface {p1, p2, p3}, Lcom/google/android/gms/internal/ads/yk;->O(Ljava/lang/String;Ljava/util/Map;)V

    :cond_3
    return-void
.end method

.method final synthetic b0(ZJ)V
    .locals 1

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/wt;->N:Lcom/google/android/gms/internal/ads/Vr;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1, p2, p3}, Lcom/google/android/gms/internal/ads/Vr;->A(ZJ)V

    :cond_0
    return-void
.end method

.method public final c(Lcom/google/android/gms/internal/ads/LB0;Ljava/lang/Object;J)V
    .locals 0

    .prologue
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/wt;->N:Lcom/google/android/gms/internal/ads/Vr;

    if-eqz p1, :cond_0

    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/Vr;->v()V

    :cond_0
    return-void
.end method

.method final synthetic c0(Landroid/os/Handler;Lcom/google/android/gms/internal/ads/G;Lcom/google/android/gms/internal/ads/KE0;Lcom/google/android/gms/internal/ads/SI0;Lcom/google/android/gms/internal/ads/jH0;)[Lcom/google/android/gms/internal/ads/AB0;
    .locals 21

    move-object/from16 v0, p0

    new-instance v9, Lcom/google/android/gms/internal/ads/KF0;

    sget-object v13, Lcom/google/android/gms/internal/ads/PG0;->a:Lcom/google/android/gms/internal/ads/PG0;

    new-instance v1, Lcom/google/android/gms/internal/ads/iF0;

    iget-object v2, v0, Lcom/google/android/gms/internal/ads/wt;->E:Landroid/content/Context;

    invoke-direct {v1, v2}, Lcom/google/android/gms/internal/ads/iF0;-><init>(Landroid/content/Context;)V

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/iF0;->d()Lcom/google/android/gms/internal/ads/EF0;

    move-result-object v8

    new-instance v3, Lcom/google/android/gms/internal/ads/oG0;

    invoke-direct {v3, v2}, Lcom/google/android/gms/internal/ads/oG0;-><init>(Landroid/content/Context;)V

    const/4 v5, 0x0

    move-object v1, v9

    move-object v4, v13

    move-object/from16 v6, p1

    move-object/from16 v7, p3

    invoke-direct/range {v1 .. v8}, Lcom/google/android/gms/internal/ads/KF0;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/ads/vG0;Lcom/google/android/gms/internal/ads/PG0;ZLandroid/os/Handler;Lcom/google/android/gms/internal/ads/KE0;Lcom/google/android/gms/internal/ads/RE0;)V

    new-instance v1, Lcom/google/android/gms/internal/ads/HK0;

    iget-object v11, v0, Lcom/google/android/gms/internal/ads/wt;->E:Landroid/content/Context;

    new-instance v12, Lcom/google/android/gms/internal/ads/oG0;

    invoke-direct {v12, v11}, Lcom/google/android/gms/internal/ads/oG0;-><init>(Landroid/content/Context;)V

    const/16 v19, -0x1

    const/high16 v20, 0x41f00000    # 30.0f

    const-wide/16 v14, 0x0

    const/16 v16, 0x0

    move-object v10, v1

    move-object/from16 v17, p1

    move-object/from16 v18, p2

    invoke-direct/range {v10 .. v20}, Lcom/google/android/gms/internal/ads/HK0;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/ads/vG0;Lcom/google/android/gms/internal/ads/PG0;JZLandroid/os/Handler;Lcom/google/android/gms/internal/ads/G;IF)V

    const/4 v2, 0x2

    new-array v2, v2, [Lcom/google/android/gms/internal/ads/AB0;

    const/4 v3, 0x0

    aput-object v9, v2, v3

    const/4 v3, 0x1

    aput-object v1, v2, v3

    return-object v2
.end method

.method public final synthetic d(Lcom/google/android/gms/internal/ads/rj;Lcom/google/android/gms/internal/ads/MB0;)V
    .locals 0

    return-void
.end method

.method public final e(Lcom/google/android/gms/internal/ads/LB0;IJ)V
    .locals 0

    iget p1, p0, Lcom/google/android/gms/internal/ads/wt;->P:I

    add-int/2addr p1, p2

    iput p1, p0, Lcom/google/android/gms/internal/ads/wt;->P:I

    return-void
.end method

.method public final f(Lcom/google/android/gms/internal/ads/pi0;Lcom/google/android/gms/internal/ads/gl0;Z)V
    .locals 0

    return-void
.end method

.method public final finalize()V
    .locals 2

    .prologue
    invoke-static {}, Lcom/google/android/gms/internal/ads/Wr;->u()Ljava/util/concurrent/atomic/AtomicInteger;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    invoke-static {}, Lv3/q0;->m()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "SimpleExoPlayerAdapter finalize "

    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lv3/q0;->k(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public final g(Lcom/google/android/gms/internal/ads/LB0;Lcom/google/android/gms/internal/ads/Os;)V
    .locals 1

    .prologue
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/wt;->N:Lcom/google/android/gms/internal/ads/Vr;

    if-eqz p1, :cond_0

    iget v0, p2, Lcom/google/android/gms/internal/ads/Os;->a:I

    iget p2, p2, Lcom/google/android/gms/internal/ads/Os;->b:I

    invoke-interface {p1, v0, p2}, Lcom/google/android/gms/internal/ads/Vr;->x(II)V

    :cond_0
    return-void
.end method

.method public final h(Lcom/google/android/gms/internal/ads/LB0;I)V
    .locals 0

    .prologue
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/wt;->N:Lcom/google/android/gms/internal/ads/Vr;

    if-eqz p1, :cond_0

    invoke-interface {p1, p2}, Lcom/google/android/gms/internal/ads/Vr;->y(I)V

    :cond_0
    return-void
.end method

.method public final i(Lcom/google/android/gms/internal/ads/pi0;Lcom/google/android/gms/internal/ads/gl0;ZI)V
    .locals 0

    iget p1, p0, Lcom/google/android/gms/internal/ads/wt;->O:I

    add-int/2addr p1, p4

    iput p1, p0, Lcom/google/android/gms/internal/ads/wt;->O:I

    return-void
.end method

.method public final j(Lcom/google/android/gms/internal/ads/LB0;Lcom/google/android/gms/internal/ads/Pf;)V
    .locals 1

    .prologue
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/wt;->N:Lcom/google/android/gms/internal/ads/Vr;

    if-eqz p1, :cond_0

    const-string v0, "onPlayerError"

    invoke-interface {p1, v0, p2}, Lcom/google/android/gms/internal/ads/Vr;->B(Ljava/lang/String;Ljava/lang/Exception;)V

    :cond_0
    return-void
.end method

.method public final synthetic k(Lcom/google/android/gms/internal/ads/LB0;Lcom/google/android/gms/internal/ads/ri;Lcom/google/android/gms/internal/ads/ri;I)V
    .locals 0

    return-void
.end method

.method public final synthetic l(Lcom/google/android/gms/internal/ads/LB0;Lcom/google/android/gms/internal/ads/Gz0;)V
    .locals 0

    return-void
.end method

.method public final m(Lcom/google/android/gms/internal/ads/LB0;Lcom/google/android/gms/internal/ads/BH0;Lcom/google/android/gms/internal/ads/HH0;Ljava/io/IOException;Z)V
    .locals 0

    .prologue
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/wt;->N:Lcom/google/android/gms/internal/ads/Vr;

    if-eqz p1, :cond_1

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/wt;->H:Lcom/google/android/gms/internal/ads/es;

    iget-boolean p2, p2, Lcom/google/android/gms/internal/ads/es;->j:Z

    if-eqz p2, :cond_0

    const-string p2, "onLoadException"

    invoke-interface {p1, p2, p4}, Lcom/google/android/gms/internal/ads/Vr;->z(Ljava/lang/String;Ljava/lang/Exception;)V

    return-void

    :cond_0
    const-string p2, "onLoadError"

    invoke-interface {p1, p2, p4}, Lcom/google/android/gms/internal/ads/Vr;->B(Ljava/lang/String;Ljava/lang/Exception;)V

    :cond_1
    return-void
.end method

.method public final n(Lcom/google/android/gms/internal/ads/LB0;Lcom/google/android/gms/internal/ads/D;Lcom/google/android/gms/internal/ads/Hz0;)V
    .locals 2

    .prologue
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/wt;->I:Ljava/lang/ref/WeakReference;

    invoke-virtual {p1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/ads/fs;

    sget-object p3, Lcom/google/android/gms/internal/ads/Af;->Y1:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v0

    invoke-virtual {v0, p3}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/lang/Boolean;

    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p3

    if-eqz p3, :cond_3

    if-eqz p1, :cond_3

    new-instance p3, Ljava/util/HashMap;

    invoke-direct {p3}, Ljava/util/HashMap;-><init>()V

    iget-object v0, p2, Lcom/google/android/gms/internal/ads/D;->n:Ljava/lang/String;

    if-eqz v0, :cond_0

    const-string v1, "audioMime"

    invoke-interface {p3, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    iget-object v0, p2, Lcom/google/android/gms/internal/ads/D;->o:Ljava/lang/String;

    if-eqz v0, :cond_1

    const-string v1, "audioSampleMime"

    invoke-interface {p3, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    iget-object p2, p2, Lcom/google/android/gms/internal/ads/D;->k:Ljava/lang/String;

    if-eqz p2, :cond_2

    const-string v0, "audioCodec"

    invoke-interface {p3, v0, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    const-string p2, "onMetadataEvent"

    invoke-interface {p1, p2, p3}, Lcom/google/android/gms/internal/ads/yk;->O(Ljava/lang/String;Ljava/util/Map;)V

    :cond_3
    return-void
.end method

.method public final o(Lcom/google/android/gms/internal/ads/pi0;Lcom/google/android/gms/internal/ads/gl0;Z)V
    .locals 0

    return-void
.end method

.method public final synthetic p(Lcom/google/android/gms/internal/ads/LB0;IJJ)V
    .locals 0

    return-void
.end method

.method public final q(Lcom/google/android/gms/internal/ads/pi0;Lcom/google/android/gms/internal/ads/gl0;Z)V
    .locals 1

    .prologue
    instance-of p2, p1, Lcom/google/android/gms/internal/ads/ut0;

    if-eqz p2, :cond_0

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/wt;->T:Ljava/lang/Object;

    monitor-enter p2

    :try_start_0
    iget-object p3, p0, Lcom/google/android/gms/internal/ads/wt;->V:Ljava/util/ArrayList;

    check-cast p1, Lcom/google/android/gms/internal/ads/ut0;

    invoke-virtual {p3, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    monitor-exit p2

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    :cond_0
    instance-of p2, p1, Lcom/google/android/gms/internal/ads/ht;

    if-eqz p2, :cond_1

    check-cast p1, Lcom/google/android/gms/internal/ads/ht;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/wt;->W:Lcom/google/android/gms/internal/ads/ht;

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/wt;->I:Ljava/lang/ref/WeakReference;

    invoke-virtual {p1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/ads/fs;

    sget-object p2, Lcom/google/android/gms/internal/ads/Af;->Y1:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object p3

    invoke-virtual {p3, p2}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    if-eqz p2, :cond_1

    if-eqz p1, :cond_1

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/wt;->W:Lcom/google/android/gms/internal/ads/ht;

    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/ht;->n()Z

    move-result p2

    if-eqz p2, :cond_1

    new-instance p2, Ljava/util/HashMap;

    invoke-direct {p2}, Ljava/util/HashMap;-><init>()V

    iget-object p3, p0, Lcom/google/android/gms/internal/ads/wt;->W:Lcom/google/android/gms/internal/ads/ht;

    invoke-virtual {p3}, Lcom/google/android/gms/internal/ads/ht;->p()Z

    move-result p3

    invoke-static {p3}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object p3

    const-string v0, "gcacheHit"

    invoke-interface {p2, v0, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p3, p0, Lcom/google/android/gms/internal/ads/wt;->W:Lcom/google/android/gms/internal/ads/ht;

    invoke-virtual {p3}, Lcom/google/android/gms/internal/ads/ht;->o()Z

    move-result p3

    invoke-static {p3}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object p3

    const-string v0, "gcacheDownloaded"

    invoke-interface {p2, v0, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p3, Lv3/E0;->l:Lcom/google/android/gms/internal/ads/Fe0;

    new-instance v0, Lcom/google/android/gms/internal/ads/st;

    invoke-direct {v0, p1, p2}, Lcom/google/android/gms/internal/ads/st;-><init>(Lcom/google/android/gms/internal/ads/fs;Ljava/util/Map;)V

    invoke-virtual {p3, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_1
    return-void
.end method

.method public final r()J
    .locals 2

    .prologue
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/wt;->d0()Z

    move-result v0

    if-nez v0, :cond_0

    iget v0, p0, Lcom/google/android/gms/internal/ads/wt;->O:I

    int-to-long v0, v0

    return-wide v0

    :cond_0
    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method public final s()J
    .locals 10

    .prologue
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/wt;->d0()Z

    move-result v0

    if-nez v0, :cond_3

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/wt;->T:Ljava/lang/Object;

    monitor-enter v0

    :goto_0
    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/wt;->V:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_2

    iget-wide v1, p0, Lcom/google/android/gms/internal/ads/wt;->Q:J

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/wt;->V:Ljava/util/ArrayList;

    const/4 v4, 0x0

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/google/android/gms/internal/ads/ut0;

    invoke-interface {v3}, Lcom/google/android/gms/internal/ads/ut0;->d()Ljava/util/Map;

    move-result-object v3

    const-wide/16 v5, 0x0

    if-eqz v3, :cond_1

    invoke-interface {v3}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :catch_0
    :cond_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/Map$Entry;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v7, :cond_0

    :try_start_1
    invoke-interface {v7}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v8

    if-eqz v8, :cond_0

    const-string v8, "content-length"

    invoke-interface {v7}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/CharSequence;

    invoke-static {v8, v9}, Lcom/google/android/gms/internal/ads/fg0;->c(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v8

    if-eqz v8, :cond_0

    invoke-interface {v7}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v8

    if-eqz v8, :cond_0

    invoke-interface {v7}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/List;

    invoke-interface {v8, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    if-eqz v8, :cond_0

    invoke-interface {v7}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    invoke-interface {v7, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;

    invoke-static {v7}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v5
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v1

    goto :goto_2

    :cond_1
    :goto_1
    add-long/2addr v1, v5

    :try_start_2
    iput-wide v1, p0, Lcom/google/android/gms/internal/ads/wt;->Q:J

    goto :goto_0

    :cond_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    iget-wide v0, p0, Lcom/google/android/gms/internal/ads/wt;->Q:J

    return-wide v0

    :goto_2
    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw v1

    :cond_3
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/wt;->W:Lcom/google/android/gms/internal/ads/ht;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/ht;->l()J

    move-result-wide v0

    return-wide v0
.end method

.method public final t()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/wt;->U:Ljava/lang/Integer;

    return-object v0
.end method

.method public final w([Landroid/net/Uri;Ljava/lang/String;)V
    .locals 2

    const/4 v0, 0x0

    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v1

    invoke-virtual {p0, p1, p2, v1, v0}, Lcom/google/android/gms/internal/ads/wt;->x([Landroid/net/Uri;Ljava/lang/String;Ljava/nio/ByteBuffer;Z)V

    return-void
.end method

.method public final x([Landroid/net/Uri;Ljava/lang/String;Ljava/nio/ByteBuffer;Z)V
    .locals 1

    .prologue
    iget-object p2, p0, Lcom/google/android/gms/internal/ads/wt;->K:Lcom/google/android/gms/internal/ads/bA0;

    if-eqz p2, :cond_2

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/wt;->L:Ljava/nio/ByteBuffer;

    iput-boolean p4, p0, Lcom/google/android/gms/internal/ads/wt;->M:Z

    array-length p2, p1

    const/4 p3, 0x1

    const/4 p4, 0x0

    if-ne p2, p3, :cond_0

    aget-object p1, p1, p4

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/ads/wt;->a0(Landroid/net/Uri;)Lcom/google/android/gms/internal/ads/NH0;

    move-result-object p1

    goto :goto_1

    :cond_0
    new-array p2, p2, [Lcom/google/android/gms/internal/ads/NH0;

    move p3, p4

    :goto_0
    array-length v0, p1

    if-ge p3, v0, :cond_1

    aget-object v0, p1, p3

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/ads/wt;->a0(Landroid/net/Uri;)Lcom/google/android/gms/internal/ads/NH0;

    move-result-object v0

    aput-object v0, p2, p3

    add-int/lit8 p3, p3, 0x1

    goto :goto_0

    :cond_1
    new-instance p1, Lcom/google/android/gms/internal/ads/dI0;

    new-instance p3, Lcom/google/android/gms/internal/ads/vH0;

    invoke-direct {p3}, Lcom/google/android/gms/internal/ads/vH0;-><init>()V

    invoke-direct {p1, p4, p4, p3, p2}, Lcom/google/android/gms/internal/ads/dI0;-><init>(ZZLcom/google/android/gms/internal/ads/vH0;[Lcom/google/android/gms/internal/ads/NH0;)V

    :goto_1
    iget-object p2, p0, Lcom/google/android/gms/internal/ads/wt;->K:Lcom/google/android/gms/internal/ads/bA0;

    invoke-interface {p2, p1}, Lcom/google/android/gms/internal/ads/bA0;->M(Lcom/google/android/gms/internal/ads/NH0;)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/wt;->K:Lcom/google/android/gms/internal/ads/bA0;

    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/rj;->q()V

    invoke-static {}, Lcom/google/android/gms/internal/ads/Wr;->v()Ljava/util/concurrent/atomic/AtomicInteger;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    :cond_2
    return-void
.end method

.method public final y()V
    .locals 1

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/wt;->K:Lcom/google/android/gms/internal/ads/bA0;

    if-eqz v0, :cond_0

    invoke-interface {v0, p0}, Lcom/google/android/gms/internal/ads/bA0;->L(Lcom/google/android/gms/internal/ads/NB0;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/wt;->K:Lcom/google/android/gms/internal/ads/bA0;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/bA0;->J()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/wt;->K:Lcom/google/android/gms/internal/ads/bA0;

    invoke-static {}, Lcom/google/android/gms/internal/ads/Wr;->v()Ljava/util/concurrent/atomic/AtomicInteger;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    :cond_0
    return-void
.end method

.method public final z(J)V
    .locals 7

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/wt;->K:Lcom/google/android/gms/internal/ads/bA0;

    move-object v1, v0

    check-cast v1, Lcom/google/android/gms/internal/ads/qj0;

    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/rj;->f()I

    move-result v2

    const/4 v5, 0x5

    const/4 v6, 0x0

    move-wide v3, p1

    invoke-virtual/range {v1 .. v6}, Lcom/google/android/gms/internal/ads/qj0;->r(IJIZ)V

    return-void
.end method
