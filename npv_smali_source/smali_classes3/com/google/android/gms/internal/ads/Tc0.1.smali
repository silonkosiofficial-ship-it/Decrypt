.class public final synthetic Lcom/google/android/gms/internal/ads/Tc0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic C:Landroid/content/Context;

.field public final synthetic D:Ll4/m;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;Ll4/m;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/Tc0;->C:Landroid/content/Context;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/Tc0;->D:Ll4/m;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Tc0;->C:Landroid/content/Context;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/Tc0;->D:Ll4/m;

    const/4 v2, 0x0

    const-string v3, "GLAS"

    invoke-static {v0, v3, v2}, Lcom/google/android/gms/internal/ads/Zd0;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/internal/ads/Zd0;

    move-result-object v0

    invoke-virtual {v1, v0}, Ll4/m;->c(Ljava/lang/Object;)V

    return-void
.end method
