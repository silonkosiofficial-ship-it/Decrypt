.class public Lcom/google/android/gms/internal/ads/pH;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/ZH;

.field private final b:Lcom/google/android/gms/internal/ads/Ot;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/ZH;Lcom/google/android/gms/internal/ads/Ot;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/pH;->a:Lcom/google/android/gms/internal/ads/ZH;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/pH;->b:Lcom/google/android/gms/internal/ads/Ot;

    return-void
.end method


# virtual methods
.method public final a()Landroid/view/View;
    .locals 1

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/pH;->b:Lcom/google/android/gms/internal/ads/Ot;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/Ot;->i0()Landroid/webkit/WebView;

    move-result-object v0

    return-object v0
.end method

.method public final b()Landroid/view/View;
    .locals 1

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/pH;->b:Lcom/google/android/gms/internal/ads/Ot;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/Ot;->i0()Landroid/webkit/WebView;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final c()Lcom/google/android/gms/internal/ads/Ot;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/pH;->b:Lcom/google/android/gms/internal/ads/Ot;

    return-object v0
.end method

.method public final d(Ljava/util/concurrent/Executor;)Lcom/google/android/gms/internal/ads/EG;
    .locals 3

    new-instance v0, Lcom/google/android/gms/internal/ads/EG;

    new-instance v1, Lcom/google/android/gms/internal/ads/oH;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/pH;->b:Lcom/google/android/gms/internal/ads/Ot;

    invoke-direct {v1, v2}, Lcom/google/android/gms/internal/ads/oH;-><init>(Lcom/google/android/gms/internal/ads/Ot;)V

    invoke-direct {v0, v1, p1}, Lcom/google/android/gms/internal/ads/EG;-><init>(Ljava/lang/Object;Ljava/util/concurrent/Executor;)V

    return-object v0
.end method

.method public final e()Lcom/google/android/gms/internal/ads/ZH;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/pH;->a:Lcom/google/android/gms/internal/ads/ZH;

    return-object v0
.end method

.method public f(Lcom/google/android/gms/internal/ads/YB;)Ljava/util/Set;
    .locals 2

    sget-object v0, Lcom/google/android/gms/internal/ads/dr;->g:Lcom/google/android/gms/internal/ads/Yk0;

    new-instance v1, Lcom/google/android/gms/internal/ads/EG;

    invoke-direct {v1, p1, v0}, Lcom/google/android/gms/internal/ads/EG;-><init>(Ljava/lang/Object;Ljava/util/concurrent/Executor;)V

    invoke-static {v1}, Ljava/util/Collections;->singleton(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object p1

    return-object p1
.end method

.method public g(Lcom/google/android/gms/internal/ads/YB;)Ljava/util/Set;
    .locals 2

    sget-object v0, Lcom/google/android/gms/internal/ads/dr;->g:Lcom/google/android/gms/internal/ads/Yk0;

    new-instance v1, Lcom/google/android/gms/internal/ads/EG;

    invoke-direct {v1, p1, v0}, Lcom/google/android/gms/internal/ads/EG;-><init>(Ljava/lang/Object;Ljava/util/concurrent/Executor;)V

    invoke-static {v1}, Ljava/util/Collections;->singleton(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object p1

    return-object p1
.end method
