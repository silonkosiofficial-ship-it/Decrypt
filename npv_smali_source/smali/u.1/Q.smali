.class public final Lu/Q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lu/j;


# static fields
.field public static final d:I = 0x8


# instance fields
.field private final a:Lu/E;

.field private final b:Lu/f0;

.field private final c:J


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>(Lu/E;Lu/f0;J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu/Q;->a:Lu/E;

    iput-object p2, p0, Lu/Q;->b:Lu/f0;

    iput-wide p3, p0, Lu/Q;->c:J

    return-void
.end method

.method public synthetic constructor <init>(Lu/E;Lu/f0;JLy7/k;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Lu/Q;-><init>(Lu/E;Lu/f0;J)V

    return-void
.end method


# virtual methods
.method public a(Lu/x0;)Lu/B0;
    .locals 7

    new-instance v6, Lu/K0;

    iget-object v0, p0, Lu/Q;->a:Lu/E;

    invoke-interface {v0, p1}, Lu/E;->a(Lu/x0;)Lu/F0;

    move-result-object v1

    iget-object v2, p0, Lu/Q;->b:Lu/f0;

    iget-wide v3, p0, Lu/Q;->c:J

    const/4 v5, 0x0

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Lu/K0;-><init>(Lu/F0;Lu/f0;JLy7/k;)V

    return-object v6
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 6

    .prologue
    instance-of v0, p1, Lu/Q;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    check-cast p1, Lu/Q;

    iget-object v0, p1, Lu/Q;->a:Lu/E;

    iget-object v2, p0, Lu/Q;->a:Lu/E;

    invoke-static {v0, v2}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p1, Lu/Q;->b:Lu/f0;

    iget-object v2, p0, Lu/Q;->b:Lu/f0;

    if-ne v0, v2, :cond_0

    iget-wide v2, p1, Lu/Q;->c:J

    iget-wide v4, p0, Lu/Q;->c:J

    invoke-static {v2, v3, v4, v5}, Lu/o0;->d(JJ)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 v1, 0x1

    :cond_0
    return v1
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lu/Q;->a:Lu/E;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lu/Q;->b:Lu/f0;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lu/Q;->c:J

    invoke-static {v1, v2}, Lu/o0;->e(J)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method
