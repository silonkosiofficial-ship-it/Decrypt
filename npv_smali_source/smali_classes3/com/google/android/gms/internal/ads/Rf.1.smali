.class public final Lcom/google/android/gms/internal/ads/Rf;
.super Lcom/google/android/gms/internal/ads/Sf;
.source "SourceFile"


# instance fields
.field private final C:Lr3/g;

.field private final D:Ljava/lang/String;

.field private final E:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lr3/g;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/Sf;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/Rf;->C:Lr3/g;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/Rf;->D:Ljava/lang/String;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/Rf;->E:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Rf;->D:Ljava/lang/String;

    return-object v0
.end method

.method public final c()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Rf;->E:Ljava/lang/String;

    return-object v0
.end method

.method public final d()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Rf;->C:Lr3/g;

    invoke-interface {v0}, Lr3/g;->b()V

    return-void
.end method

.method public final e()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Rf;->C:Lr3/g;

    invoke-interface {v0}, Lr3/g;->c()V

    return-void
.end method

.method public final s0(LX3/a;)V
    .locals 1

    .prologue
    if-nez p1, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Rf;->C:Lr3/g;

    invoke-static {p1}, LX3/b;->L0(LX3/a;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/view/View;

    invoke-interface {v0, p1}, Lr3/g;->a(Landroid/view/View;)V

    return-void
.end method
