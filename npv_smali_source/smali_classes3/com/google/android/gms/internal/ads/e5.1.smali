.class final Lcom/google/android/gms/internal/ads/e5;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final c:Ljava/util/Comparator;


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/f5;

.field private final b:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/ads/d5;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/d5;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/ads/e5;->c:Ljava/util/Comparator;

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/internal/ads/f5;ILcom/google/android/gms/internal/ads/i5;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/e5;->a:Lcom/google/android/gms/internal/ads/f5;

    iput p2, p0, Lcom/google/android/gms/internal/ads/e5;->b:I

    return-void
.end method

.method static bridge synthetic a(Lcom/google/android/gms/internal/ads/e5;)I
    .locals 0

    iget p0, p0, Lcom/google/android/gms/internal/ads/e5;->b:I

    return p0
.end method

.method static synthetic b(Lcom/google/android/gms/internal/ads/e5;Lcom/google/android/gms/internal/ads/e5;)I
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/e5;->a:Lcom/google/android/gms/internal/ads/f5;

    iget p0, p0, Lcom/google/android/gms/internal/ads/f5;->b:I

    iget-object p1, p1, Lcom/google/android/gms/internal/ads/e5;->a:Lcom/google/android/gms/internal/ads/f5;

    iget p1, p1, Lcom/google/android/gms/internal/ads/f5;->b:I

    invoke-static {p0, p1}, Ljava/lang/Integer;->compare(II)I

    move-result p0

    return p0
.end method

.method static bridge synthetic c(Lcom/google/android/gms/internal/ads/e5;)Lcom/google/android/gms/internal/ads/f5;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/e5;->a:Lcom/google/android/gms/internal/ads/f5;

    return-object p0
.end method

.method static bridge synthetic d()Ljava/util/Comparator;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/ads/e5;->c:Ljava/util/Comparator;

    return-object v0
.end method
