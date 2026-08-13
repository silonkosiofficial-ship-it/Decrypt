.class public final Lu/O0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lu/H0;


# instance fields
.field private final a:F

.field private final b:F

.field private final synthetic c:Lu/I0;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(FFLu/r;)V
    .locals 0

    invoke-static {p3, p1, p2}, Lu/C0;->a(Lu/r;FF)Lu/t;

    move-result-object p3

    invoke-direct {p0, p1, p2, p3}, Lu/O0;-><init>(FFLu/t;)V

    return-void
.end method

.method private constructor <init>(FFLu/t;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lu/O0;->a:F

    iput p2, p0, Lu/O0;->b:F

    new-instance p1, Lu/I0;

    invoke-direct {p1, p3}, Lu/I0;-><init>(Lu/t;)V

    iput-object p1, p0, Lu/O0;->c:Lu/I0;

    return-void
.end method


# virtual methods
.method public a()Z
    .locals 1

    iget-object v0, p0, Lu/O0;->c:Lu/I0;

    invoke-virtual {v0}, Lu/I0;->a()Z

    move-result v0

    return v0
.end method

.method public b(JLu/r;Lu/r;Lu/r;)Lu/r;
    .locals 6

    iget-object v0, p0, Lu/O0;->c:Lu/I0;

    move-wide v1, p1

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    invoke-virtual/range {v0 .. v5}, Lu/I0;->b(JLu/r;Lu/r;Lu/r;)Lu/r;

    move-result-object p1

    return-object p1
.end method

.method public c(JLu/r;Lu/r;Lu/r;)Lu/r;
    .locals 6

    iget-object v0, p0, Lu/O0;->c:Lu/I0;

    move-wide v1, p1

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    invoke-virtual/range {v0 .. v5}, Lu/I0;->c(JLu/r;Lu/r;Lu/r;)Lu/r;

    move-result-object p1

    return-object p1
.end method

.method public e(Lu/r;Lu/r;Lu/r;)J
    .locals 1

    iget-object v0, p0, Lu/O0;->c:Lu/I0;

    invoke-virtual {v0, p1, p2, p3}, Lu/I0;->e(Lu/r;Lu/r;Lu/r;)J

    move-result-wide p1

    return-wide p1
.end method

.method public g(Lu/r;Lu/r;Lu/r;)Lu/r;
    .locals 1

    iget-object v0, p0, Lu/O0;->c:Lu/I0;

    invoke-virtual {v0, p1, p2, p3}, Lu/I0;->g(Lu/r;Lu/r;Lu/r;)Lu/r;

    move-result-object p1

    return-object p1
.end method
