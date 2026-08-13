.class public final Lcom/google/android/gms/internal/ads/WQ;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zR;


# static fields
.field private static final h:Ljava/util/regex/Pattern;


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/xQ;

.field private final b:Lcom/google/android/gms/internal/ads/Yk0;

.field private final c:Lcom/google/android/gms/internal/ads/n70;

.field private final d:Ljava/util/concurrent/ScheduledExecutorService;

.field private final e:Lcom/google/android/gms/internal/ads/DS;

.field private final f:Lcom/google/android/gms/internal/ads/Q90;

.field private final g:Landroid/content/Context;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "Received error HTTP response code: (.*)"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/ads/WQ;->h:Ljava/util/regex/Pattern;

    return-void
.end method

.method constructor <init>(Landroid/content/Context;Lcom/google/android/gms/internal/ads/n70;Lcom/google/android/gms/internal/ads/xQ;Lcom/google/android/gms/internal/ads/Yk0;Ljava/util/concurrent/ScheduledExecutorService;Lcom/google/android/gms/internal/ads/DS;Lcom/google/android/gms/internal/ads/Q90;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/WQ;->g:Landroid/content/Context;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/WQ;->c:Lcom/google/android/gms/internal/ads/n70;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/WQ;->a:Lcom/google/android/gms/internal/ads/xQ;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/WQ;->b:Lcom/google/android/gms/internal/ads/Yk0;

    iput-object p5, p0, Lcom/google/android/gms/internal/ads/WQ;->d:Ljava/util/concurrent/ScheduledExecutorService;

    iput-object p6, p0, Lcom/google/android/gms/internal/ads/WQ;->e:Lcom/google/android/gms/internal/ads/DS;

    iput-object p7, p0, Lcom/google/android/gms/internal/ads/WQ;->f:Lcom/google/android/gms/internal/ads/Q90;

    return-void
.end method

.method static bridge synthetic b(Lcom/google/android/gms/internal/ads/WQ;)Lcom/google/android/gms/internal/ads/DS;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/WQ;->e:Lcom/google/android/gms/internal/ads/DS;

    return-object p0
.end method

.method static bridge synthetic d()Ljava/util/regex/Pattern;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/ads/WQ;->h:Ljava/util/regex/Pattern;

    return-object v0
.end method


# virtual methods
.method public final a(Lcom/google/android/gms/internal/ads/Po;)LP4/d;
    .locals 5

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/WQ;->g:Landroid/content/Context;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/WQ;->a:Lcom/google/android/gms/internal/ads/xQ;

    invoke-virtual {v1, p1}, Lcom/google/android/gms/internal/ads/xQ;->c(Lcom/google/android/gms/internal/ads/Po;)LP4/d;

    move-result-object p1

    const/16 v1, 0xb

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/D90;->a(Landroid/content/Context;I)Lcom/google/android/gms/internal/ads/E90;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/google/android/gms/internal/ads/P90;->d(LP4/d;Lcom/google/android/gms/internal/ads/E90;)V

    new-instance v1, Lcom/google/android/gms/internal/ads/TQ;

    invoke-direct {v1, p0}, Lcom/google/android/gms/internal/ads/TQ;-><init>(Lcom/google/android/gms/internal/ads/WQ;)V

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/WQ;->b:Lcom/google/android/gms/internal/ads/Yk0;

    invoke-static {p1, v1, v2}, Lcom/google/android/gms/internal/ads/Nk0;->n(LP4/d;Lcom/google/android/gms/internal/ads/tk0;Ljava/util/concurrent/Executor;)LP4/d;

    move-result-object p1

    sget-object v1, Lcom/google/android/gms/internal/ads/Af;->x5:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_0

    sget-object v1, Lcom/google/android/gms/internal/ads/Af;->y5:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    int-to-long v1, v1

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/WQ;->d:Ljava/util/concurrent/ScheduledExecutorService;

    sget-object v4, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-static {p1, v1, v2, v4, v3}, Lcom/google/android/gms/internal/ads/Nk0;->o(LP4/d;JLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/ScheduledExecutorService;)LP4/d;

    move-result-object p1

    new-instance v1, Lcom/google/android/gms/internal/ads/UQ;

    invoke-direct {v1}, Lcom/google/android/gms/internal/ads/UQ;-><init>()V

    sget-object v2, Lcom/google/android/gms/internal/ads/dr;->g:Lcom/google/android/gms/internal/ads/Yk0;

    const-class v3, Ljava/util/concurrent/TimeoutException;

    invoke-static {p1, v3, v1, v2}, Lcom/google/android/gms/internal/ads/Nk0;->f(LP4/d;Ljava/lang/Class;Lcom/google/android/gms/internal/ads/tk0;Ljava/util/concurrent/Executor;)LP4/d;

    move-result-object p1

    :cond_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/WQ;->f:Lcom/google/android/gms/internal/ads/Q90;

    invoke-static {p1, v1, v0}, Lcom/google/android/gms/internal/ads/P90;->a(LP4/d;Lcom/google/android/gms/internal/ads/Q90;Lcom/google/android/gms/internal/ads/E90;)V

    new-instance v0, Lcom/google/android/gms/internal/ads/VQ;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/ads/VQ;-><init>(Lcom/google/android/gms/internal/ads/WQ;)V

    sget-object v1, Lcom/google/android/gms/internal/ads/dr;->g:Lcom/google/android/gms/internal/ads/Yk0;

    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/ads/Nk0;->r(LP4/d;Lcom/google/android/gms/internal/ads/Jk0;Ljava/util/concurrent/Executor;)V

    return-object p1
.end method

.method final synthetic c(Lcom/google/android/gms/internal/ads/BR;)LP4/d;
    .locals 4

    new-instance v0, Lcom/google/android/gms/internal/ads/e70;

    new-instance v1, Lcom/google/android/gms/internal/ads/a70;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/WQ;->c:Lcom/google/android/gms/internal/ads/n70;

    invoke-direct {v1, v2}, Lcom/google/android/gms/internal/ads/a70;-><init>(Lcom/google/android/gms/internal/ads/n70;)V

    new-instance v2, Ljava/io/InputStreamReader;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/BR;->b()Ljava/io/InputStream;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;)V

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/BR;->a()Lcom/google/android/gms/internal/ads/Po;

    move-result-object p1

    invoke-static {v2, p1}, Lcom/google/android/gms/internal/ads/c70;->a(Ljava/io/Reader;Lcom/google/android/gms/internal/ads/Po;)Lcom/google/android/gms/internal/ads/c70;

    move-result-object p1

    invoke-direct {v0, v1, p1}, Lcom/google/android/gms/internal/ads/e70;-><init>(Lcom/google/android/gms/internal/ads/a70;Lcom/google/android/gms/internal/ads/c70;)V

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/Nk0;->h(Ljava/lang/Object;)LP4/d;

    move-result-object p1

    return-object p1
.end method
