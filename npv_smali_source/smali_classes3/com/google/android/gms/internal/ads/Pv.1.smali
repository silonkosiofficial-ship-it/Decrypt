.class public final Lcom/google/android/gms/internal/ads/Pv;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Lcom/google/android/gms/internal/ads/Wu;

.field private b:Lcom/google/android/gms/internal/ads/lw;

.field private c:Lcom/google/android/gms/internal/ads/z90;

.field private d:Lcom/google/android/gms/internal/ads/zw;

.field private e:Lcom/google/android/gms/internal/ads/Q70;


# direct methods
.method synthetic constructor <init>(Lcom/google/android/gms/internal/ads/kw;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Lcom/google/android/gms/internal/ads/Su;
    .locals 8

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Pv;->a:Lcom/google/android/gms/internal/ads/Wu;

    const-class v1, Lcom/google/android/gms/internal/ads/Wu;

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/iz0;->c(Ljava/lang/Object;Ljava/lang/Class;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Pv;->b:Lcom/google/android/gms/internal/ads/lw;

    const-class v1, Lcom/google/android/gms/internal/ads/lw;

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/iz0;->c(Ljava/lang/Object;Ljava/lang/Class;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Pv;->c:Lcom/google/android/gms/internal/ads/z90;

    if-nez v0, :cond_0

    new-instance v0, Lcom/google/android/gms/internal/ads/z90;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/z90;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/Pv;->c:Lcom/google/android/gms/internal/ads/z90;

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Pv;->d:Lcom/google/android/gms/internal/ads/zw;

    if-nez v0, :cond_1

    new-instance v0, Lcom/google/android/gms/internal/ads/zw;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zw;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/Pv;->d:Lcom/google/android/gms/internal/ads/zw;

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Pv;->e:Lcom/google/android/gms/internal/ads/Q70;

    if-nez v0, :cond_2

    new-instance v0, Lcom/google/android/gms/internal/ads/Q70;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/Q70;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/Pv;->e:Lcom/google/android/gms/internal/ads/Q70;

    :cond_2
    new-instance v0, Lcom/google/android/gms/internal/ads/Ev;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/Pv;->a:Lcom/google/android/gms/internal/ads/Wu;

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/Pv;->b:Lcom/google/android/gms/internal/ads/lw;

    iget-object v4, p0, Lcom/google/android/gms/internal/ads/Pv;->c:Lcom/google/android/gms/internal/ads/z90;

    iget-object v5, p0, Lcom/google/android/gms/internal/ads/Pv;->d:Lcom/google/android/gms/internal/ads/zw;

    iget-object v6, p0, Lcom/google/android/gms/internal/ads/Pv;->e:Lcom/google/android/gms/internal/ads/Q70;

    const/4 v7, 0x0

    move-object v1, v0

    invoke-direct/range {v1 .. v7}, Lcom/google/android/gms/internal/ads/Ev;-><init>(Lcom/google/android/gms/internal/ads/Wu;Lcom/google/android/gms/internal/ads/lw;Lcom/google/android/gms/internal/ads/z90;Lcom/google/android/gms/internal/ads/zw;Lcom/google/android/gms/internal/ads/Q70;Lcom/google/android/gms/internal/ads/kw;)V

    return-object v0
.end method

.method public final b(Lcom/google/android/gms/internal/ads/Wu;)Lcom/google/android/gms/internal/ads/Pv;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/Pv;->a:Lcom/google/android/gms/internal/ads/Wu;

    return-object p0
.end method

.method public final c(Lcom/google/android/gms/internal/ads/lw;)Lcom/google/android/gms/internal/ads/Pv;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/Pv;->b:Lcom/google/android/gms/internal/ads/lw;

    return-object p0
.end method
