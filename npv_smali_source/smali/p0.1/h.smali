.class public Lp0/h;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lp0/h$a;,
        Lp0/h$b;
    }
.end annotation


# static fields
.field public static final g:Lp0/h$a;


# instance fields
.field private final a:Lp0/c;

.field private final b:Lp0/c;

.field private final c:Lp0/c;

.field private final d:Lp0/c;

.field private final e:I

.field private final f:[F


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lp0/h$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lp0/h$a;-><init>(Ly7/k;)V

    sput-object v0, Lp0/h;->g:Lp0/h$a;

    return-void
.end method

.method private constructor <init>(Lp0/c;Lp0/c;I)V
    .locals 12

    .prologue
    invoke-virtual {p1}, Lp0/c;->e()J

    move-result-wide v0

    sget-object v2, Lp0/b;->a:Lp0/b$a;

    invoke-virtual {v2}, Lp0/b$a;->b()J

    move-result-wide v3

    invoke-static {v0, v1, v3, v4}, Lp0/b;->e(JJ)Z

    move-result v0

    const/4 v1, 0x2

    const/4 v3, 0x0

    if-eqz v0, :cond_0

    sget-object v0, Lp0/k;->a:Lp0/k;

    invoke-virtual {v0}, Lp0/k;->b()Lp0/z;

    move-result-object v0

    invoke-static {p1, v0, v3, v1, v3}, Lp0/d;->d(Lp0/c;Lp0/z;Lp0/a;ILjava/lang/Object;)Lp0/c;

    move-result-object v0

    move-object v7, v0

    goto :goto_0

    :cond_0
    move-object v7, p1

    :goto_0
    invoke-virtual {p2}, Lp0/c;->e()J

    move-result-wide v4

    invoke-virtual {v2}, Lp0/b$a;->b()J

    move-result-wide v8

    invoke-static {v4, v5, v8, v9}, Lp0/b;->e(JJ)Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object v0, Lp0/k;->a:Lp0/k;

    invoke-virtual {v0}, Lp0/k;->b()Lp0/z;

    move-result-object v0

    invoke-static {p2, v0, v3, v1, v3}, Lp0/d;->d(Lp0/c;Lp0/z;Lp0/a;ILjava/lang/Object;)Lp0/c;

    move-result-object v0

    move-object v8, v0

    goto :goto_1

    :cond_1
    move-object v8, p2

    :goto_1
    sget-object v0, Lp0/h;->g:Lp0/h$a;

    invoke-static {v0, p1, p2, p3}, Lp0/h$a;->a(Lp0/h$a;Lp0/c;Lp0/c;I)[F

    move-result-object v10

    const/4 v11, 0x0

    move-object v4, p0

    move-object v5, p1

    move-object v6, p2

    move v9, p3

    invoke-direct/range {v4 .. v11}, Lp0/h;-><init>(Lp0/c;Lp0/c;Lp0/c;Lp0/c;I[FLy7/k;)V

    return-void
.end method

.method public synthetic constructor <init>(Lp0/c;Lp0/c;ILy7/k;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lp0/h;-><init>(Lp0/c;Lp0/c;I)V

    return-void
.end method

.method private constructor <init>(Lp0/c;Lp0/c;Lp0/c;Lp0/c;I[F)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp0/h;->a:Lp0/c;

    iput-object p2, p0, Lp0/h;->b:Lp0/c;

    iput-object p3, p0, Lp0/h;->c:Lp0/c;

    iput-object p4, p0, Lp0/h;->d:Lp0/c;

    iput p5, p0, Lp0/h;->e:I

    iput-object p6, p0, Lp0/h;->f:[F

    return-void
.end method

.method public synthetic constructor <init>(Lp0/c;Lp0/c;Lp0/c;Lp0/c;I[FLy7/k;)V
    .locals 0

    invoke-direct/range {p0 .. p6}, Lp0/h;-><init>(Lp0/c;Lp0/c;Lp0/c;Lp0/c;I[F)V

    return-void
.end method


# virtual methods
.method public a(J)J
    .locals 9

    .prologue
    invoke-static {p1, p2}, Lo0/y0;->t(J)F

    move-result v0

    invoke-static {p1, p2}, Lo0/y0;->s(J)F

    move-result v1

    invoke-static {p1, p2}, Lo0/y0;->q(J)F

    move-result v2

    invoke-static {p1, p2}, Lo0/y0;->p(J)F

    move-result v7

    iget-object p1, p0, Lp0/h;->c:Lp0/c;

    invoke-virtual {p1, v0, v1, v2}, Lp0/c;->h(FFF)J

    move-result-wide p1

    const/16 v3, 0x20

    shr-long v3, p1, v3

    long-to-int v3, v3

    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v3

    const-wide v4, 0xffffffffL

    and-long/2addr p1, v4

    long-to-int p1, p1

    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p1

    iget-object p2, p0, Lp0/h;->c:Lp0/c;

    invoke-virtual {p2, v0, v1, v2}, Lp0/c;->i(FFF)F

    move-result p2

    iget-object v0, p0, Lp0/h;->f:[F

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    aget v1, v0, v1

    mul-float/2addr v3, v1

    const/4 v1, 0x1

    aget v1, v0, v1

    mul-float/2addr p1, v1

    const/4 v1, 0x2

    aget v0, v0, v1

    mul-float/2addr p2, v0

    :cond_0
    move v5, p1

    move v6, p2

    move v4, v3

    iget-object v3, p0, Lp0/h;->d:Lp0/c;

    iget-object v8, p0, Lp0/h;->b:Lp0/c;

    invoke-virtual/range {v3 .. v8}, Lp0/c;->j(FFFFLp0/c;)J

    move-result-wide p1

    return-wide p1
.end method
