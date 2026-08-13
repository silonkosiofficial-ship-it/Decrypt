.class final Lcom/google/android/gms/internal/ads/XI;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/Jk0;


# instance fields
.field final synthetic a:Landroid/view/View;

.field final synthetic b:Lcom/google/android/gms/internal/ads/ZI;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/ZI;Landroid/view/View;)V
    .locals 0

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/XI;->a:Landroid/view/View;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/XI;->b:Lcom/google/android/gms/internal/ads/ZI;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Throwable;)V
    .locals 2

    .prologue
    sget-object v0, Lcom/google/android/gms/internal/ads/Af;->m5:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "omid native display exp"

    invoke-static {}, Lr3/v;->s()Lcom/google/android/gms/internal/ads/Uq;

    move-result-object v1

    invoke-virtual {v1, p1, v0}, Lcom/google/android/gms/internal/ads/Uq;->w(Ljava/lang/Throwable;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public final bridge synthetic c(Ljava/lang/Object;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/XI;->b:Lcom/google/android/gms/internal/ads/ZI;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/XI;->a:Landroid/view/View;

    check-cast p1, Lcom/google/android/gms/internal/ads/QT;

    invoke-static {v0, v1, p1}, Lcom/google/android/gms/internal/ads/ZI;->Z(Lcom/google/android/gms/internal/ads/ZI;Landroid/view/View;Lcom/google/android/gms/internal/ads/QT;)V

    return-void
.end method
