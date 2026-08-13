.class public final Lcom/google/android/gms/internal/ads/bh;
.super Lcom/google/android/gms/internal/ads/nh;
.source "SourceFile"


# instance fields
.field private final C:Landroid/graphics/drawable/Drawable;

.field private final D:Landroid/net/Uri;

.field private final E:D

.field private final F:I

.field private final G:I


# direct methods
.method public constructor <init>(Landroid/graphics/drawable/Drawable;Landroid/net/Uri;DII)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/nh;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/bh;->C:Landroid/graphics/drawable/Drawable;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/bh;->D:Landroid/net/Uri;

    iput-wide p3, p0, Lcom/google/android/gms/internal/ads/bh;->E:D

    iput p5, p0, Lcom/google/android/gms/internal/ads/bh;->F:I

    iput p6, p0, Lcom/google/android/gms/internal/ads/bh;->G:I

    return-void
.end method


# virtual methods
.method public final b()D
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/internal/ads/bh;->E:D

    return-wide v0
.end method

.method public final c()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/ads/bh;->G:I

    return v0
.end method

.method public final d()Landroid/net/Uri;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/bh;->D:Landroid/net/Uri;

    return-object v0
.end method

.method public final e()LX3/a;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/bh;->C:Landroid/graphics/drawable/Drawable;

    invoke-static {v0}, LX3/b;->c2(Ljava/lang/Object;)LX3/a;

    move-result-object v0

    return-object v0
.end method

.method public final f()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/ads/bh;->F:I

    return v0
.end method
