.class public final Lcom/google/android/gms/internal/ads/Up0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final b:Lcom/google/android/gms/internal/ads/Up0;

.field private static final c:Lcom/google/android/gms/internal/ads/Sp0;


# instance fields
.field private final a:Ljava/util/concurrent/atomic/AtomicReference;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/ads/Up0;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/Up0;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/ads/Up0;->b:Lcom/google/android/gms/internal/ads/Up0;

    new-instance v0, Lcom/google/android/gms/internal/ads/Sp0;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ads/Sp0;-><init>(Lcom/google/android/gms/internal/ads/Tp0;)V

    sput-object v0, Lcom/google/android/gms/internal/ads/Up0;->c:Lcom/google/android/gms/internal/ads/Sp0;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/Up0;->a:Ljava/util/concurrent/atomic/AtomicReference;

    return-void
.end method

.method public static b()Lcom/google/android/gms/internal/ads/Up0;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/ads/Up0;->b:Lcom/google/android/gms/internal/ads/Up0;

    return-object v0
.end method


# virtual methods
.method public final a()Lcom/google/android/gms/internal/ads/Ep0;
    .locals 1

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Up0;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ads/Ep0;

    if-nez v0, :cond_0

    sget-object v0, Lcom/google/android/gms/internal/ads/Up0;->c:Lcom/google/android/gms/internal/ads/Sp0;

    :cond_0
    return-object v0
.end method
