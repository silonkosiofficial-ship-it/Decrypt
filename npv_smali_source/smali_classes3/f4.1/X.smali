.class public final Lf4/X;
.super Landroid/webkit/WebView;
.source "SourceFile"


# instance fields
.field private final C:Landroid/os/Handler;

.field private final D:Lf4/e0;

.field private E:Z


# direct methods
.method public constructor <init>(Lf4/Z;Landroid/os/Handler;Lf4/e0;)V
    .locals 0

    invoke-direct {p0, p1}, Landroid/webkit/WebView;-><init>(Landroid/content/Context;)V

    const/4 p1, 0x0

    iput-boolean p1, p0, Lf4/X;->E:Z

    iput-object p2, p0, Lf4/X;->C:Landroid/os/Handler;

    iput-object p3, p0, Lf4/X;->D:Lf4/e0;

    return-void
.end method

.method static bridge synthetic a(Lf4/X;)Lf4/e0;
    .locals 0

    iget-object p0, p0, Lf4/X;->D:Lf4/e0;

    return-object p0
.end method

.method static bridge synthetic b(Lf4/X;Z)V
    .locals 0

    const/4 p1, 0x1

    iput-boolean p1, p0, Lf4/X;->E:Z

    return-void
.end method

.method static bridge synthetic e(Lf4/X;)Z
    .locals 0

    iget-boolean p0, p0, Lf4/X;->E:Z

    return p0
.end method

.method static bridge synthetic f(Lf4/X;Ljava/lang/String;)Z
    .locals 0

    .prologue
    if-eqz p1, :cond_0

    const-string p0, "consent://"

    invoke-virtual {p1, p0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method


# virtual methods
.method public final c()V
    .locals 2

    iget-object v0, p0, Lf4/X;->D:Lf4/e0;

    invoke-static {v0}, Lj$/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Lf4/U;

    invoke-direct {v1, v0}, Lf4/U;-><init>(Lf4/e0;)V

    iget-object v0, p0, Lf4/X;->C:Landroid/os/Handler;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public final d(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "("

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ");"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Lf4/T;

    invoke-direct {p2, p0, p1}, Lf4/T;-><init>(Lf4/X;Ljava/lang/String;)V

    iget-object p1, p0, Lf4/X;->C:Landroid/os/Handler;

    invoke-virtual {p1, p2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method
