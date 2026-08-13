.class public final synthetic Lm3/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic C:Landroid/content/Context;

.field public final synthetic D:Ljava/lang/String;

.field public final synthetic E:Lk3/g;

.field public final synthetic F:I

.field public final synthetic G:Lm3/a$a;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;Ljava/lang/String;Lk3/g;ILm3/a$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm3/c;->C:Landroid/content/Context;

    iput-object p2, p0, Lm3/c;->D:Ljava/lang/String;

    iput-object p3, p0, Lm3/c;->E:Lk3/g;

    iput p4, p0, Lm3/c;->F:I

    iput-object p5, p0, Lm3/c;->G:Lm3/a$a;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 8

    .prologue
    iget-object v6, p0, Lm3/c;->C:Landroid/content/Context;

    iget v4, p0, Lm3/c;->F:I

    iget-object v2, p0, Lm3/c;->D:Ljava/lang/String;

    iget-object v0, p0, Lm3/c;->E:Lk3/g;

    iget-object v5, p0, Lm3/c;->G:Lm3/a$a;

    :try_start_0
    new-instance v7, Lcom/google/android/gms/internal/ads/Pc;

    invoke-virtual {v0}, Lk3/g;->a()Ls3/f1;

    move-result-object v3

    move-object v0, v7

    move-object v1, v6

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/ads/Pc;-><init>(Landroid/content/Context;Ljava/lang/String;Ls3/f1;ILm3/a$a;)V

    invoke-virtual {v7}, Lcom/google/android/gms/internal/ads/Pc;->a()V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    invoke-static {v6}, Lcom/google/android/gms/internal/ads/lo;->c(Landroid/content/Context;)Lcom/google/android/gms/internal/ads/no;

    move-result-object v1

    const-string v2, "AppOpenAd.load"

    invoke-interface {v1, v0, v2}, Lcom/google/android/gms/internal/ads/no;->a(Ljava/lang/Throwable;Ljava/lang/String;)V

    return-void
.end method
