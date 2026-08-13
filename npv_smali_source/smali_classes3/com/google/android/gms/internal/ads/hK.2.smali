.class public final Lcom/google/android/gms/internal/ads/hK;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/ZC;


# instance fields
.field private final C:Lcom/google/android/gms/internal/ads/eJ;

.field private final D:Lcom/google/android/gms/internal/ads/jJ;

.field private final E:Ljava/util/concurrent/Executor;

.field private final F:Ljava/util/concurrent/Executor;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/eJ;Lcom/google/android/gms/internal/ads/jJ;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/hK;->C:Lcom/google/android/gms/internal/ads/eJ;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/hK;->D:Lcom/google/android/gms/internal/ads/jJ;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/hK;->E:Ljava/util/concurrent/Executor;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/hK;->F:Ljava/util/concurrent/Executor;

    return-void
.end method

.method static bridge synthetic a(Lcom/google/android/gms/internal/ads/hK;Lcom/google/android/gms/internal/ads/Ot;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/hK;->b(Lcom/google/android/gms/internal/ads/Ot;)V

    return-void
.end method

.method private final b(Lcom/google/android/gms/internal/ads/Ot;)V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/ads/fK;

    invoke-direct {v0, p1}, Lcom/google/android/gms/internal/ads/fK;-><init>(Lcom/google/android/gms/internal/ads/Ot;)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/hK;->E:Ljava/util/concurrent/Executor;

    invoke-interface {p1, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method


# virtual methods
.method public final t()V
    .locals 4

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/hK;->D:Lcom/google/android/gms/internal/ads/jJ;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/jJ;->d()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/hK;->C:Lcom/google/android/gms/internal/ads/eJ;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/eJ;->h0()Lcom/google/android/gms/internal/ads/QT;

    move-result-object v1

    if-nez v1, :cond_1

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/eJ;->j0()LP4/d;

    move-result-object v0

    if-eqz v0, :cond_1

    sget-object v0, Lcom/google/android/gms/internal/ads/Af;->l5:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v2

    invoke-virtual {v2, v0}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/hK;->C:Lcom/google/android/gms/internal/ads/eJ;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/eJ;->j0()LP4/d;

    move-result-object v1

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/eJ;->c0()Lcom/google/android/gms/internal/ads/mr;

    move-result-object v0

    if-eqz v1, :cond_4

    if-eqz v0, :cond_4

    const/4 v2, 0x2

    new-array v2, v2, [LP4/d;

    const/4 v3, 0x0

    aput-object v1, v2, v3

    const/4 v1, 0x1

    aput-object v0, v2, v1

    invoke-static {v2}, Lcom/google/android/gms/internal/ads/Nk0;->l([LP4/d;)LP4/d;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/internal/ads/gK;

    invoke-direct {v1, p0}, Lcom/google/android/gms/internal/ads/gK;-><init>(Lcom/google/android/gms/internal/ads/hK;)V

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/hK;->F:Ljava/util/concurrent/Executor;

    invoke-static {v0, v1, v2}, Lcom/google/android/gms/internal/ads/Nk0;->r(LP4/d;Lcom/google/android/gms/internal/ads/Jk0;Ljava/util/concurrent/Executor;)V

    return-void

    :cond_1
    if-eqz v1, :cond_4

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/hK;->C:Lcom/google/android/gms/internal/ads/eJ;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/eJ;->e0()Lcom/google/android/gms/internal/ads/Ot;

    move-result-object v1

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/eJ;->f0()Lcom/google/android/gms/internal/ads/Ot;

    move-result-object v0

    if-eqz v1, :cond_2

    goto :goto_0

    :cond_2
    if-eqz v0, :cond_3

    move-object v1, v0

    goto :goto_0

    :cond_3
    const/4 v1, 0x0

    :goto_0
    if-eqz v1, :cond_4

    invoke-direct {p0, v1}, Lcom/google/android/gms/internal/ads/hK;->b(Lcom/google/android/gms/internal/ads/Ot;)V

    :cond_4
    :goto_1
    return-void
.end method
