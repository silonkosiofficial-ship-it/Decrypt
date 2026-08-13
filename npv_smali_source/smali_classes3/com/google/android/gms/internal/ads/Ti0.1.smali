.class final Lcom/google/android/gms/internal/ads/Ti0;
.super Lcom/google/android/gms/internal/ads/ci0;
.source "SourceFile"


# instance fields
.field private final transient F:[Ljava/lang/Object;

.field private final transient G:I

.field private final transient H:I


# direct methods
.method constructor <init>([Ljava/lang/Object;II)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/ci0;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/Ti0;->F:[Ljava/lang/Object;

    iput p2, p0, Lcom/google/android/gms/internal/ads/Ti0;->G:I

    iput p3, p0, Lcom/google/android/gms/internal/ads/Ti0;->H:I

    return-void
.end method


# virtual methods
.method public final get(I)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lcom/google/android/gms/internal/ads/Ti0;->H:I

    const-string v1, "index"

    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/ads/Ag0;->a(IILjava/lang/String;)I

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Ti0;->F:[Ljava/lang/Object;

    add-int/2addr p1, p1

    iget v1, p0, Lcom/google/android/gms/internal/ads/Ti0;->G:I

    add-int/2addr p1, v1

    aget-object p1, v0, p1

    invoke-static {p1}, Lj$/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p1
.end method

.method final o()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final size()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/ads/Ti0;->H:I

    return v0
.end method
