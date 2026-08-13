.class public final Lu/N0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lu/F0;


# instance fields
.field private final a:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lu/N0;->a:I

    return-void
.end method


# virtual methods
.method public synthetic a()Z
    .locals 1

    invoke-static {p0}, Lu/G0;->a(Lu/H0;)Z

    move-result v0

    return v0
.end method

.method public b(JLu/r;Lu/r;Lu/r;)Lu/r;
    .locals 0

    return-object p5
.end method

.method public c(JLu/r;Lu/r;Lu/r;)Lu/r;
    .locals 4

    .prologue
    invoke-virtual {p0}, Lu/N0;->d()I

    move-result p5

    int-to-long v0, p5

    const-wide/32 v2, 0xf4240

    mul-long/2addr v0, v2

    cmp-long p1, p1, v0

    if-gez p1, :cond_0

    return-object p3

    :cond_0
    return-object p4
.end method

.method public d()I
    .locals 1

    iget v0, p0, Lu/N0;->a:I

    return v0
.end method

.method public synthetic e(Lu/r;Lu/r;Lu/r;)J
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lu/E0;->a(Lu/F0;Lu/r;Lu/r;Lu/r;)J

    move-result-wide p1

    return-wide p1
.end method

.method public f()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public synthetic g(Lu/r;Lu/r;Lu/r;)Lu/r;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lu/A0;->a(Lu/B0;Lu/r;Lu/r;Lu/r;)Lu/r;

    move-result-object p1

    return-object p1
.end method
