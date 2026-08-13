.class public final Lu/P0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lu/F0;


# instance fields
.field private final a:I

.field private final b:I

.field private final c:Lu/F;

.field private final d:Lu/I0;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(IILu/F;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lu/P0;->a:I

    iput p2, p0, Lu/P0;->b:I

    iput-object p3, p0, Lu/P0;->c:Lu/F;

    new-instance p1, Lu/I0;

    new-instance p2, Lu/O;

    invoke-virtual {p0}, Lu/P0;->f()I

    move-result v0

    invoke-virtual {p0}, Lu/P0;->d()I

    move-result v1

    invoke-direct {p2, v0, v1, p3}, Lu/O;-><init>(IILu/F;)V

    invoke-direct {p1, p2}, Lu/I0;-><init>(Lu/K;)V

    iput-object p1, p0, Lu/P0;->d:Lu/I0;

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
    .locals 6

    iget-object v0, p0, Lu/P0;->d:Lu/I0;

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

    iget-object v0, p0, Lu/P0;->d:Lu/I0;

    move-wide v1, p1

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    invoke-virtual/range {v0 .. v5}, Lu/I0;->c(JLu/r;Lu/r;Lu/r;)Lu/r;

    move-result-object p1

    return-object p1
.end method

.method public d()I
    .locals 1

    iget v0, p0, Lu/P0;->b:I

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

    iget v0, p0, Lu/P0;->a:I

    return v0
.end method

.method public synthetic g(Lu/r;Lu/r;Lu/r;)Lu/r;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lu/A0;->a(Lu/B0;Lu/r;Lu/r;Lu/r;)Lu/r;

    move-result-object p1

    return-object p1
.end method
