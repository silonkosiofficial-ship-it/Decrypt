.class public final Lb1/t;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:LY0/i;

.field private b:Ljava/lang/String;

.field private final c:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>(LY0/i;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const-string v0, "debugName"

    invoke-static {p3, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb1/t;->a:LY0/i;

    iput-object p2, p0, Lb1/t;->b:Ljava/lang/String;

    iput-object p3, p0, Lb1/t;->c:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(LY0/i;Ljava/lang/String;Ljava/lang/String;Ly7/k;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lb1/t;-><init>(LY0/i;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final a()Li1/c;
    .locals 4

    .prologue
    iget-object v0, p0, Lb1/t;->a:LY0/i;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LY0/i;->v()F

    move-result v0

    new-instance v1, Li1/e;

    invoke-direct {v1, v0}, Li1/e;-><init>(F)V

    return-object v1

    :cond_0
    iget-object v0, p0, Lb1/t;->b:Ljava/lang/String;

    if-eqz v0, :cond_1

    sget-object v1, Li1/h;->K:Li1/h$a;

    invoke-virtual {v1, v0}, Li1/h$a;->a(Ljava/lang/String;)Li1/h;

    move-result-object v0

    return-object v0

    :cond_1
    sget-object v0, Ld1/a;->a:Ld1/a;

    iget-object v1, p0, Lb1/t;->c:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "DimensionDescription: Null value & symbol for "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ". Using WrapContent."

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "CCL"

    invoke-virtual {v0, v2, v1}, Ld1/a;->b(Ljava/lang/String;Ljava/lang/String;)V

    sget-object v0, Li1/h;->K:Li1/h$a;

    const-string v1, "wrap"

    invoke-virtual {v0, v1}, Li1/h$a;->a(Ljava/lang/String;)Li1/h;

    move-result-object v0

    return-object v0
.end method

.method public final b()Z
    .locals 1

    .prologue
    iget-object v0, p0, Lb1/t;->a:LY0/i;

    if-nez v0, :cond_0

    iget-object v0, p0, Lb1/t;->b:Ljava/lang/String;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method
