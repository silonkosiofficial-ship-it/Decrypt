.class public final Lb1/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lb1/r$a;
.implements Lb1/r;


# instance fields
.field private final b:Lb1/t;

.field private final c:Lb1/t;

.field private final d:Lb1/t;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>(LY0/i;Ljava/lang/String;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lb1/t;

    const-string v1, "base"

    const/4 v2, 0x0

    invoke-direct {v0, p1, p2, v1, v2}, Lb1/t;-><init>(LY0/i;Ljava/lang/String;Ljava/lang/String;Ly7/k;)V

    iput-object v0, p0, Lb1/s;->b:Lb1/t;

    new-instance p1, Lb1/t;

    const-string p2, "min"

    invoke-direct {p1, v2, v2, p2, v2}, Lb1/t;-><init>(LY0/i;Ljava/lang/String;Ljava/lang/String;Ly7/k;)V

    iput-object p1, p0, Lb1/s;->c:Lb1/t;

    new-instance p1, Lb1/t;

    const-string p2, "max"

    invoke-direct {p1, v2, v2, p2, v2}, Lb1/t;-><init>(LY0/i;Ljava/lang/String;Ljava/lang/String;Ly7/k;)V

    iput-object p1, p0, Lb1/s;->d:Lb1/t;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    const-string v0, "valueSymbol"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, v0, p1}, Lb1/s;-><init>(LY0/i;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final a()Li1/c;
    .locals 3

    .prologue
    iget-object v0, p0, Lb1/s;->c:Lb1/t;

    invoke-virtual {v0}, Lb1/t;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lb1/s;->d:Lb1/t;

    invoke-virtual {v0}, Lb1/t;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lb1/s;->b:Lb1/t;

    invoke-virtual {v0}, Lb1/t;->a()Li1/c;

    move-result-object v0

    goto :goto_0

    :cond_0
    new-instance v0, Li1/f;

    const/4 v1, 0x0

    new-array v1, v1, [C

    invoke-direct {v0, v1}, Li1/f;-><init>([C)V

    iget-object v1, p0, Lb1/s;->c:Lb1/t;

    invoke-virtual {v1}, Lb1/t;->b()Z

    move-result v1

    if-nez v1, :cond_1

    iget-object v1, p0, Lb1/s;->c:Lb1/t;

    invoke-virtual {v1}, Lb1/t;->a()Li1/c;

    move-result-object v1

    const-string v2, "min"

    invoke-virtual {v0, v2, v1}, Li1/b;->k0(Ljava/lang/String;Li1/c;)V

    :cond_1
    iget-object v1, p0, Lb1/s;->d:Lb1/t;

    invoke-virtual {v1}, Lb1/t;->b()Z

    move-result v1

    if-nez v1, :cond_2

    iget-object v1, p0, Lb1/s;->d:Lb1/t;

    invoke-virtual {v1}, Lb1/t;->a()Li1/c;

    move-result-object v1

    const-string v2, "max"

    invoke-virtual {v0, v2, v1}, Li1/b;->k0(Ljava/lang/String;Li1/c;)V

    :cond_2
    iget-object v1, p0, Lb1/s;->b:Lb1/t;

    invoke-virtual {v1}, Lb1/t;->a()Li1/c;

    move-result-object v1

    const-string v2, "value"

    invoke-virtual {v0, v2, v1}, Li1/b;->k0(Ljava/lang/String;Li1/c;)V

    :goto_0
    return-object v0
.end method
