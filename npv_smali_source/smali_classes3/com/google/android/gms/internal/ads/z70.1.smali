.class public final Lcom/google/android/gms/internal/ads/z70;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/R60;

.field private final b:Lcom/google/android/gms/internal/ads/U60;

.field private final c:Lcom/google/android/gms/internal/ads/La0;

.field private final d:Lcom/google/android/gms/internal/ads/Ba0;

.field private final e:Lcom/google/android/gms/internal/ads/Q90;

.field private final f:Lcom/google/android/gms/internal/ads/Lx;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/La0;Lcom/google/android/gms/internal/ads/Ba0;Lcom/google/android/gms/internal/ads/R60;Lcom/google/android/gms/internal/ads/U60;Lcom/google/android/gms/internal/ads/Lx;Lcom/google/android/gms/internal/ads/Q90;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/z70;->a:Lcom/google/android/gms/internal/ads/R60;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/z70;->b:Lcom/google/android/gms/internal/ads/U60;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/z70;->c:Lcom/google/android/gms/internal/ads/La0;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/z70;->d:Lcom/google/android/gms/internal/ads/Ba0;

    iput-object p5, p0, Lcom/google/android/gms/internal/ads/z70;->f:Lcom/google/android/gms/internal/ads/Lx;

    iput-object p6, p0, Lcom/google/android/gms/internal/ads/z70;->e:Lcom/google/android/gms/internal/ads/Q90;

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/List;)V
    .locals 2

    .prologue
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    const/4 v1, 0x2

    invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/internal/ads/z70;->b(Ljava/lang/String;I)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final b(Ljava/lang/String;I)V
    .locals 2

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/z70;->a:Lcom/google/android/gms/internal/ads/R60;

    iget-boolean v1, v0, Lcom/google/android/gms/internal/ads/R60;->i0:Z

    if-nez v1, :cond_0

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/z70;->c:Lcom/google/android/gms/internal/ads/La0;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/z70;->e:Lcom/google/android/gms/internal/ads/Q90;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/R60;->x0:Lw3/w;

    invoke-virtual {p2, p1, v0, v1}, Lcom/google/android/gms/internal/ads/La0;->d(Ljava/lang/String;Lw3/w;Lcom/google/android/gms/internal/ads/Q90;)V

    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/z70;->d:Lcom/google/android/gms/internal/ads/Ba0;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/z70;->b:Lcom/google/android/gms/internal/ads/U60;

    iget-object v1, v1, Lcom/google/android/gms/internal/ads/U60;->b:Ljava/lang/String;

    invoke-virtual {v0, p1, v1, p2}, Lcom/google/android/gms/internal/ads/Ba0;->a(Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method

.method public final c(Ljava/util/List;I)V
    .locals 3

    .prologue
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    sget-object v1, Lcom/google/android/gms/internal/ads/Af;->U9:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/Lx;->j(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/z70;->f:Lcom/google/android/gms/internal/ads/Lx;

    invoke-static {}, Ls3/y;->e()Ljava/util/Random;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Lcom/google/android/gms/internal/ads/Lx;->b(Ljava/lang/String;Ljava/util/Random;)LP4/d;

    move-result-object v0

    goto :goto_1

    :cond_0
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/Nk0;->h(Ljava/lang/Object;)LP4/d;

    move-result-object v0

    :goto_1
    new-instance v1, Lcom/google/android/gms/internal/ads/y70;

    invoke-direct {v1, p0, p2}, Lcom/google/android/gms/internal/ads/y70;-><init>(Lcom/google/android/gms/internal/ads/z70;I)V

    sget-object v2, Lcom/google/android/gms/internal/ads/dr;->a:Lcom/google/android/gms/internal/ads/Yk0;

    invoke-static {v0, v1, v2}, Lcom/google/android/gms/internal/ads/Nk0;->r(LP4/d;Lcom/google/android/gms/internal/ads/Jk0;Ljava/util/concurrent/Executor;)V

    goto :goto_0

    :cond_1
    return-void
.end method
