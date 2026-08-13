.class public final Lcom/google/android/gms/internal/ads/wl;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field static final b:Lv3/F;

.field static final c:Lv3/F;


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/hl;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/ads/ul;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/ul;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/ads/wl;->b:Lv3/F;

    new-instance v0, Lcom/google/android/gms/internal/ads/vl;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/vl;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/ads/wl;->c:Lv3/F;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lw3/a;Ljava/lang/String;Lcom/google/android/gms/internal/ads/T90;)V
    .locals 8

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v7, Lcom/google/android/gms/internal/ads/hl;

    sget-object v4, Lcom/google/android/gms/internal/ads/wl;->b:Lv3/F;

    sget-object v5, Lcom/google/android/gms/internal/ads/wl;->c:Lv3/F;

    move-object v0, v7

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v6, p4

    invoke-direct/range {v0 .. v6}, Lcom/google/android/gms/internal/ads/hl;-><init>(Landroid/content/Context;Lw3/a;Ljava/lang/String;Lv3/F;Lv3/F;Lcom/google/android/gms/internal/ads/T90;)V

    iput-object v7, p0, Lcom/google/android/gms/internal/ads/wl;->a:Lcom/google/android/gms/internal/ads/hl;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;Lcom/google/android/gms/internal/ads/ol;Lcom/google/android/gms/internal/ads/nl;)Lcom/google/android/gms/internal/ads/ll;
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/ads/Al;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/wl;->a:Lcom/google/android/gms/internal/ads/hl;

    invoke-direct {v0, v1, p1, p2, p3}, Lcom/google/android/gms/internal/ads/Al;-><init>(Lcom/google/android/gms/internal/ads/hl;Ljava/lang/String;Lcom/google/android/gms/internal/ads/ol;Lcom/google/android/gms/internal/ads/nl;)V

    return-object v0
.end method

.method public final b()Lcom/google/android/gms/internal/ads/Fl;
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/ads/Fl;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/wl;->a:Lcom/google/android/gms/internal/ads/hl;

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ads/Fl;-><init>(Lcom/google/android/gms/internal/ads/hl;)V

    return-object v0
.end method
