.class public abstract Lcom/google/android/gms/internal/measurement/h3$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/measurement/h3;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# static fields
.field private static volatile a:LM4/g;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static a(Landroid/content/Context;)LM4/g;
    .locals 3

    .prologue
    sget-object v0, Lcom/google/android/gms/internal/measurement/h3$a;->a:LM4/g;

    if-nez v0, :cond_4

    const-class v1, Lcom/google/android/gms/internal/measurement/h3$a;

    monitor-enter v1

    :try_start_0
    sget-object v0, Lcom/google/android/gms/internal/measurement/h3$a;->a:LM4/g;

    if-nez v0, :cond_3

    new-instance v0, Lcom/google/android/gms/internal/measurement/h3;

    invoke-direct {v0}, Lcom/google/android/gms/internal/measurement/h3;-><init>()V

    sget-object v0, Landroid/os/Build;->TYPE:Ljava/lang/String;

    sget-object v2, Landroid/os/Build;->TAGS:Ljava/lang/String;

    invoke-static {v0, v2}, Lcom/google/android/gms/internal/measurement/l3;->c(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {}, LM4/g;->a()LM4/g;

    move-result-object p0

    goto :goto_1

    :catchall_0
    move-exception p0

    goto :goto_2

    :cond_0
    invoke-static {}, Lcom/google/android/gms/internal/measurement/T2;->a()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-static {p0}, LJ2/i;->a(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    invoke-static {p0}, Landroidx/profileinstaller/b;->a(Landroid/content/Context;)Landroid/content/Context;

    move-result-object p0

    :cond_2
    :goto_0
    invoke-static {p0}, Lcom/google/android/gms/internal/measurement/h3;->a(Landroid/content/Context;)LM4/g;

    move-result-object p0

    :goto_1
    sput-object p0, Lcom/google/android/gms/internal/measurement/h3$a;->a:LM4/g;

    move-object v0, p0

    :cond_3
    monitor-exit v1

    goto :goto_3

    :goto_2
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0

    :cond_4
    :goto_3
    return-object v0
.end method
