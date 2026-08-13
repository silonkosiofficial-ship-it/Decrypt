.class public final synthetic Lcom/google/android/gms/internal/ads/Uc0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic C:Ll4/m;


# direct methods
.method public synthetic constructor <init>(Ll4/m;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/Uc0;->C:Ll4/m;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Uc0;->C:Ll4/m;

    invoke-static {}, Lcom/google/android/gms/internal/ads/Zd0;->c()Lcom/google/android/gms/internal/ads/Zd0;

    move-result-object v1

    invoke-virtual {v0, v1}, Ll4/m;->c(Ljava/lang/Object;)V

    return-void
.end method
