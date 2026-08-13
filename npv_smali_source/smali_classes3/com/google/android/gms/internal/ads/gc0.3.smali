.class public final Lcom/google/android/gms/internal/ads/gc0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final d:Lcom/google/android/gms/internal/ads/gc0;


# instance fields
.field private a:Ljava/lang/ref/WeakReference;

.field private b:Z

.field private c:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/ads/gc0;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/gc0;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/ads/gc0;->d:Lcom/google/android/gms/internal/ads/gc0;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/gc0;->b:Z

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/gc0;->c:Z

    return-void
.end method

.method public static a()Lcom/google/android/gms/internal/ads/gc0;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/ads/gc0;->d:Lcom/google/android/gms/internal/ads/gc0;

    return-object v0
.end method

.method static bridge synthetic b(Lcom/google/android/gms/internal/ads/gc0;Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/google/android/gms/internal/ads/gc0;->b:Z

    return-void
.end method

.method static bridge synthetic f(Lcom/google/android/gms/internal/ads/gc0;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/google/android/gms/internal/ads/gc0;->c:Z

    return p0
.end method


# virtual methods
.method public final c()V
    .locals 2

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/gc0;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    if-nez v0, :cond_0

    return-void

    :cond_0
    const-string v1, "keyguard"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/KeyguardManager;

    invoke-virtual {v0}, Landroid/app/KeyguardManager;->isDeviceLocked()Z

    move-result v0

    iget-boolean v1, p0, Lcom/google/android/gms/internal/ads/gc0;->b:Z

    invoke-virtual {p0, v1, v0}, Lcom/google/android/gms/internal/ads/gc0;->d(ZZ)V

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/gc0;->c:Z

    return-void
.end method

.method public final d(ZZ)V
    .locals 5

    .prologue
    const/4 v0, 0x0

    const/4 v1, 0x1

    if-nez p2, :cond_0

    if-eqz p1, :cond_1

    :cond_0
    move v2, v1

    goto :goto_0

    :cond_1
    move v2, v0

    :goto_0
    iget-boolean v3, p0, Lcom/google/android/gms/internal/ads/gc0;->c:Z

    if-nez v3, :cond_2

    iget-boolean v3, p0, Lcom/google/android/gms/internal/ads/gc0;->b:Z

    if-eqz v3, :cond_3

    :cond_2
    move v3, v1

    goto :goto_1

    :cond_3
    move v3, v0

    :goto_1
    if-ne v2, v3, :cond_4

    goto :goto_4

    :cond_4
    invoke-static {}, Lcom/google/android/gms/internal/ads/Wb0;->a()Lcom/google/android/gms/internal/ads/Wb0;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/Wb0;->c()Ljava/util/Collection;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_7

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/google/android/gms/internal/ads/Fb0;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/Fb0;->g()Lcom/google/android/gms/internal/ads/nc0;

    move-result-object v3

    if-nez p2, :cond_5

    if-eqz p1, :cond_6

    :cond_5
    move v4, v1

    goto :goto_3

    :cond_6
    move v4, v0

    :goto_3
    invoke-virtual {v3, v4}, Lcom/google/android/gms/internal/ads/nc0;->m(Z)V

    goto :goto_2

    :cond_7
    :goto_4
    return-void
.end method

.method public final e(Landroid/content/Context;)V
    .locals 2

    .prologue
    if-nez p1, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/gc0;->a:Ljava/lang/ref/WeakReference;

    new-instance v0, Landroid/content/IntentFilter;

    const-string v1, "android.intent.action.SCREEN_OFF"

    invoke-direct {v0, v1}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    const-string v1, "android.intent.action.SCREEN_ON"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    new-instance v1, Lcom/google/android/gms/internal/ads/fc0;

    invoke-direct {v1, p0}, Lcom/google/android/gms/internal/ads/fc0;-><init>(Lcom/google/android/gms/internal/ads/gc0;)V

    invoke-virtual {p1, v1, v0}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    return-void
.end method
