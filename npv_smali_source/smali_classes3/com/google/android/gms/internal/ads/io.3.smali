.class public final synthetic Lcom/google/android/gms/internal/ads/io;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic C:Lw3/v;

.field public final synthetic D:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lw3/v;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/io;->C:Lw3/v;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/io;->D:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/io;->C:Lw3/v;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/io;->D:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lw3/v;->o(Ljava/lang/String;)Lw3/u;

    return-void
.end method
