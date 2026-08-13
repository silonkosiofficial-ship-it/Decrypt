.class public final synthetic Lcom/google/android/gms/internal/ads/Cx;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/tk0;


# instance fields
.field public final synthetic a:Lcom/google/android/gms/internal/ads/Lx;

.field public final synthetic b:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/Lx;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/Cx;->a:Lcom/google/android/gms/internal/ads/Lx;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/Cx;->b:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;)LP4/d;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Cx;->a:Lcom/google/android/gms/internal/ads/Lx;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/Cx;->b:Ljava/lang/String;

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {v0, v1, p1}, Lcom/google/android/gms/internal/ads/Lx;->c(Ljava/lang/String;Ljava/lang/Throwable;)LP4/d;

    move-result-object p1

    return-object p1
.end method
