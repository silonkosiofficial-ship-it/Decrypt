.class public final Lcom/google/android/gms/internal/ads/O10;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/L20;


# static fields
.field private static d:Ljava/lang/String;


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/Yk0;

.field private final b:Landroid/content/Context;

.field private final c:Ljava/util/Set;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/internal/ads/Yk0;Landroid/content/Context;Ljava/util/Set;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/O10;->a:Lcom/google/android/gms/internal/ads/Yk0;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/O10;->b:Landroid/content/Context;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/O10;->c:Ljava/util/Set;

    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    const/16 v0, 0x1b

    return v0
.end method

.method public final b()LP4/d;
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/ads/N10;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/ads/N10;-><init>(Lcom/google/android/gms/internal/ads/O10;)V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/O10;->a:Lcom/google/android/gms/internal/ads/Yk0;

    invoke-interface {v1, v0}, Lcom/google/android/gms/internal/ads/Yk0;->H0(Ljava/util/concurrent/Callable;)LP4/d;

    move-result-object v0

    return-object v0
.end method

.method final synthetic c()Lcom/google/android/gms/internal/ads/Q10;
    .locals 3

    .prologue
    sget-object v0, Lcom/google/android/gms/internal/ads/Af;->c5:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_3

    sget-object v0, Lcom/google/android/gms/internal/ads/Af;->n5:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/O10;->c:Ljava/util/Set;

    const-string v1, "rewarded"

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    const-string v1, "interstitial"

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    const-string v1, "native"

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    const-string v1, "banner"

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    :cond_0
    sget-object v0, Lcom/google/android/gms/internal/ads/Af;->o5:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_2

    sget-object v0, Lcom/google/android/gms/internal/ads/O10;->d:Ljava/lang/String;

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/O10;->b:Landroid/content/Context;

    invoke-static {}, Lr3/v;->b()Lcom/google/android/gms/internal/ads/LT;

    move-result-object v1

    invoke-interface {v1, v0}, Lcom/google/android/gms/internal/ads/LT;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/ads/O10;->d:Ljava/lang/String;

    :cond_1
    new-instance v0, Lcom/google/android/gms/internal/ads/Q10;

    sget-object v1, Lcom/google/android/gms/internal/ads/O10;->d:Ljava/lang/String;

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ads/Q10;-><init>(Ljava/lang/String;)V

    return-object v0

    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/O10;->b:Landroid/content/Context;

    new-instance v1, Lcom/google/android/gms/internal/ads/Q10;

    invoke-static {}, Lr3/v;->b()Lcom/google/android/gms/internal/ads/LT;

    move-result-object v2

    invoke-interface {v2, v0}, Lcom/google/android/gms/internal/ads/LT;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Lcom/google/android/gms/internal/ads/Q10;-><init>(Ljava/lang/String;)V

    return-object v1

    :cond_3
    new-instance v0, Lcom/google/android/gms/internal/ads/Q10;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ads/Q10;-><init>(Ljava/lang/String;)V

    return-object v0
.end method
