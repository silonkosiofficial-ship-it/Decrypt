.class public final synthetic LD3/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic C:Landroid/content/Context;

.field public final synthetic D:Lk3/c;

.field public final synthetic E:Lk3/g;

.field public final synthetic F:Ljava/lang/String;

.field public final synthetic G:LD3/b;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;Lk3/c;Lk3/g;Ljava/lang/String;LD3/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LD3/c;->C:Landroid/content/Context;

    iput-object p2, p0, LD3/c;->D:Lk3/c;

    iput-object p3, p0, LD3/c;->E:Lk3/g;

    iput-object p4, p0, LD3/c;->F:Ljava/lang/String;

    iput-object p5, p0, LD3/c;->G:LD3/b;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    .prologue
    iget-object v0, p0, LD3/c;->E:Lk3/g;

    new-instance v1, Lcom/google/android/gms/internal/ads/eo;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lk3/g;->a()Ls3/f1;

    move-result-object v0

    :goto_0
    iget-object v2, p0, LD3/c;->G:LD3/b;

    iget-object v3, p0, LD3/c;->F:Ljava/lang/String;

    iget-object v4, p0, LD3/c;->D:Lk3/c;

    iget-object v5, p0, LD3/c;->C:Landroid/content/Context;

    invoke-direct {v1, v5, v4, v0, v3}, Lcom/google/android/gms/internal/ads/eo;-><init>(Landroid/content/Context;Lk3/c;Ls3/f1;Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/ads/eo;->b(LD3/b;)V

    return-void
.end method
