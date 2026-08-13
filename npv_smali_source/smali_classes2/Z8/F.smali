.class public final LZ8/F;
.super La9/d;
.source "SourceFile"


# instance fields
.field public a:J

.field public b:Lm7/e;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, La9/d;-><init>()V

    const-wide/16 v0, -0x1

    iput-wide v0, p0, LZ8/F;->a:J

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)Z
    .locals 0

    check-cast p1, LZ8/D;

    invoke-virtual {p0, p1}, LZ8/F;->c(LZ8/D;)Z

    move-result p1

    return p1
.end method

.method public bridge synthetic b(Ljava/lang/Object;)[Lm7/e;
    .locals 0

    check-cast p1, LZ8/D;

    invoke-virtual {p0, p1}, LZ8/F;->d(LZ8/D;)[Lm7/e;

    move-result-object p1

    return-object p1
.end method

.method public c(LZ8/D;)Z
    .locals 4

    .prologue
    iget-wide v0, p0, LZ8/F;->a:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-ltz v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    invoke-virtual {p1}, LZ8/D;->a0()J

    move-result-wide v0

    iput-wide v0, p0, LZ8/F;->a:J

    const/4 p1, 0x1

    return p1
.end method

.method public d(LZ8/D;)[Lm7/e;
    .locals 4

    iget-wide v0, p0, LZ8/F;->a:J

    const-wide/16 v2, -0x1

    iput-wide v2, p0, LZ8/F;->a:J

    const/4 v2, 0x0

    iput-object v2, p0, LZ8/F;->b:Lm7/e;

    invoke-virtual {p1, v0, v1}, LZ8/D;->Z(J)[Lm7/e;

    move-result-object p1

    return-object p1
.end method
