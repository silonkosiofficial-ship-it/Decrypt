.class public final Li1/h;
.super Li1/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Li1/h$a;
    }
.end annotation


# static fields
.field public static final K:Li1/h$a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Li1/h$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Li1/h$a;-><init>(Ly7/k;)V

    sput-object v0, Li1/h;->K:Li1/h$a;

    return-void
.end method

.method public constructor <init>(Li1/h;)V
    .locals 1

    const-string v0, "clString"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Li1/c;-><init>(Li1/c;)V

    return-void
.end method

.method public constructor <init>([C)V
    .locals 1

    const-string v0, "mContent"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Li1/c;-><init>([C)V

    return-void
.end method


# virtual methods
.method public d()Li1/c;
    .locals 1

    new-instance v0, Li1/h;

    invoke-direct {v0, p0}, Li1/h;-><init>(Li1/h;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    .prologue
    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Li1/h;

    if-eqz v1, :cond_1

    invoke-virtual {p0}, Li1/c;->e()Ljava/lang/String;

    move-result-object v1

    move-object v2, p1

    check-cast v2, Li1/h;

    invoke-virtual {v2}, Li1/c;->e()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_1
    invoke-super {p0, p1}, Li1/c;->equals(Ljava/lang/Object;)Z

    move-result v0

    :goto_0
    return v0
.end method

.method public hashCode()I
    .locals 1

    invoke-super {p0}, Li1/c;->hashCode()I

    move-result v0

    return v0
.end method
