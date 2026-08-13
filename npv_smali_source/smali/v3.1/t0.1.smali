.class public final synthetic Lv3/t0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic C:Lv3/v0;


# direct methods
.method public synthetic constructor <init>(Lv3/v0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lv3/t0;->C:Lv3/v0;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lv3/t0;->C:Lv3/v0;

    invoke-virtual {v0}, Lv3/v0;->K()Lcom/google/android/gms/internal/ads/mc;

    return-void
.end method
