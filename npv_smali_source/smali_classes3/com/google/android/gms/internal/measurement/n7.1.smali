.class public final Lcom/google/android/gms/internal/measurement/n7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/measurement/k7;


# static fields
.field private static final a:Lcom/google/android/gms/internal/measurement/k3;

.field private static final b:Lcom/google/android/gms/internal/measurement/k3;

.field private static final c:Lcom/google/android/gms/internal/measurement/k3;

.field private static final d:Lcom/google/android/gms/internal/measurement/k3;

.field private static final e:Lcom/google/android/gms/internal/measurement/k3;

.field private static final f:Lcom/google/android/gms/internal/measurement/k3;

.field private static final g:Lcom/google/android/gms/internal/measurement/k3;

.field private static final h:Lcom/google/android/gms/internal/measurement/k3;

.field private static final i:Lcom/google/android/gms/internal/measurement/k3;

.field private static final j:Lcom/google/android/gms/internal/measurement/k3;

.field private static final k:Lcom/google/android/gms/internal/measurement/k3;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Lcom/google/android/gms/internal/measurement/s3;

    const-string v1, "com.google.android.gms.measurement"

    invoke-static {v1}, Lcom/google/android/gms/internal/measurement/l3;->a(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/measurement/s3;-><init>(Landroid/net/Uri;)V

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/s3;->f()Lcom/google/android/gms/internal/measurement/s3;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/s3;->e()Lcom/google/android/gms/internal/measurement/s3;

    move-result-object v0

    const-string v1, "measurement.rb.attribution.ad_campaign_info"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/measurement/s3;->d(Ljava/lang/String;Z)Lcom/google/android/gms/internal/measurement/k3;

    move-result-object v1

    sput-object v1, Lcom/google/android/gms/internal/measurement/n7;->a:Lcom/google/android/gms/internal/measurement/k3;

    const-string v1, "measurement.rb.attribution.client.bundle_on_backgrounded"

    const/4 v3, 0x1

    invoke-virtual {v0, v1, v3}, Lcom/google/android/gms/internal/measurement/s3;->d(Ljava/lang/String;Z)Lcom/google/android/gms/internal/measurement/k3;

    move-result-object v1

    sput-object v1, Lcom/google/android/gms/internal/measurement/n7;->b:Lcom/google/android/gms/internal/measurement/k3;

    const-string v1, "measurement.rb.attribution.service.bundle_on_backgrounded"

    invoke-virtual {v0, v1, v3}, Lcom/google/android/gms/internal/measurement/s3;->d(Ljava/lang/String;Z)Lcom/google/android/gms/internal/measurement/k3;

    move-result-object v1

    sput-object v1, Lcom/google/android/gms/internal/measurement/n7;->c:Lcom/google/android/gms/internal/measurement/k3;

    const-string v1, "measurement.rb.attribution.client2"

    invoke-virtual {v0, v1, v3}, Lcom/google/android/gms/internal/measurement/s3;->d(Ljava/lang/String;Z)Lcom/google/android/gms/internal/measurement/k3;

    move-result-object v1

    sput-object v1, Lcom/google/android/gms/internal/measurement/n7;->d:Lcom/google/android/gms/internal/measurement/k3;

    const-string v1, "measurement.rb.attribution.dma_fix"

    invoke-virtual {v0, v1, v3}, Lcom/google/android/gms/internal/measurement/s3;->d(Ljava/lang/String;Z)Lcom/google/android/gms/internal/measurement/k3;

    const-string v1, "measurement.rb.attribution.followup1.service"

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/measurement/s3;->d(Ljava/lang/String;Z)Lcom/google/android/gms/internal/measurement/k3;

    move-result-object v1

    sput-object v1, Lcom/google/android/gms/internal/measurement/n7;->e:Lcom/google/android/gms/internal/measurement/k3;

    const-string v1, "measurement.rb.attribution.index_out_of_bounds_fix"

    invoke-virtual {v0, v1, v3}, Lcom/google/android/gms/internal/measurement/s3;->d(Ljava/lang/String;Z)Lcom/google/android/gms/internal/measurement/k3;

    const-string v1, "measurement.rb.attribution.service.enable_max_trigger_uris_queried_at_once"

    invoke-virtual {v0, v1, v3}, Lcom/google/android/gms/internal/measurement/s3;->d(Ljava/lang/String;Z)Lcom/google/android/gms/internal/measurement/k3;

    move-result-object v1

    sput-object v1, Lcom/google/android/gms/internal/measurement/n7;->f:Lcom/google/android/gms/internal/measurement/k3;

    const-string v1, "measurement.rb.attribution.retry_disposition"

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/measurement/s3;->d(Ljava/lang/String;Z)Lcom/google/android/gms/internal/measurement/k3;

    move-result-object v1

    sput-object v1, Lcom/google/android/gms/internal/measurement/n7;->g:Lcom/google/android/gms/internal/measurement/k3;

    const-string v1, "measurement.rb.attribution.service"

    invoke-virtual {v0, v1, v3}, Lcom/google/android/gms/internal/measurement/s3;->d(Ljava/lang/String;Z)Lcom/google/android/gms/internal/measurement/k3;

    move-result-object v1

    sput-object v1, Lcom/google/android/gms/internal/measurement/n7;->h:Lcom/google/android/gms/internal/measurement/k3;

    const-string v1, "measurement.rb.attribution.enable_trigger_redaction"

    invoke-virtual {v0, v1, v3}, Lcom/google/android/gms/internal/measurement/s3;->d(Ljava/lang/String;Z)Lcom/google/android/gms/internal/measurement/k3;

    move-result-object v1

    sput-object v1, Lcom/google/android/gms/internal/measurement/n7;->i:Lcom/google/android/gms/internal/measurement/k3;

    const-string v1, "measurement.rb.attribution.uuid_generation"

    invoke-virtual {v0, v1, v3}, Lcom/google/android/gms/internal/measurement/s3;->d(Ljava/lang/String;Z)Lcom/google/android/gms/internal/measurement/k3;

    move-result-object v1

    sput-object v1, Lcom/google/android/gms/internal/measurement/n7;->j:Lcom/google/android/gms/internal/measurement/k3;

    const-string v1, "measurement.id.rb.attribution.retry_disposition"

    const-wide/16 v4, 0x0

    invoke-virtual {v0, v1, v4, v5}, Lcom/google/android/gms/internal/measurement/s3;->b(Ljava/lang/String;J)Lcom/google/android/gms/internal/measurement/k3;

    const-string v1, "measurement.rb.attribution.improved_retry"

    invoke-virtual {v0, v1, v3}, Lcom/google/android/gms/internal/measurement/s3;->d(Ljava/lang/String;Z)Lcom/google/android/gms/internal/measurement/k3;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/measurement/n7;->k:Lcom/google/android/gms/internal/measurement/k3;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final b()Z
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/measurement/n7;->a:Lcom/google/android/gms/internal/measurement/k3;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/k3;->f()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public final c()Z
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/measurement/n7;->b:Lcom/google/android/gms/internal/measurement/k3;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/k3;->f()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public final d()Z
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/measurement/n7;->d:Lcom/google/android/gms/internal/measurement/k3;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/k3;->f()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public final e()Z
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/measurement/n7;->e:Lcom/google/android/gms/internal/measurement/k3;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/k3;->f()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public final f()Z
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/measurement/n7;->c:Lcom/google/android/gms/internal/measurement/k3;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/k3;->f()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public final g()Z
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/measurement/n7;->g:Lcom/google/android/gms/internal/measurement/k3;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/k3;->f()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public final h()Z
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/measurement/n7;->h:Lcom/google/android/gms/internal/measurement/k3;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/k3;->f()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public final i()Z
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/measurement/n7;->f:Lcom/google/android/gms/internal/measurement/k3;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/k3;->f()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public final j()Z
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/measurement/n7;->i:Lcom/google/android/gms/internal/measurement/k3;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/k3;->f()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public final k()Z
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/measurement/n7;->j:Lcom/google/android/gms/internal/measurement/k3;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/k3;->f()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public final l()Z
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/measurement/n7;->k:Lcom/google/android/gms/internal/measurement/k3;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/k3;->f()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method
