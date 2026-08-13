.class public final Lb1/z;
.super Lj1/g;
.source "SourceFile"


# instance fields
.field private final m:LY0/e;

.field private n:J

.field private o:LY0/v;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(LY0/e;)V
    .locals 7

    const-string v0, "density"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lj1/g;-><init>()V

    iput-object p1, p0, Lb1/z;->m:LY0/e;

    const/16 v5, 0xf

    const/4 v6, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, LY0/c;->b(IIIIILjava/lang/Object;)J

    move-result-wide v0

    iput-wide v0, p0, Lb1/z;->n:J

    sget-object p1, LY0/v;->C:LY0/v;

    iput-object p1, p0, Lb1/z;->o:LY0/v;

    new-instance p1, Lb1/y;

    invoke-direct {p1, p0}, Lb1/y;-><init>(Lb1/z;)V

    invoke-virtual {p0, p1}, Lj1/g;->w(Lj1/c;)V

    return-void
.end method

.method public static synthetic E(Lb1/z;F)F
    .locals 0

    invoke-static {p0, p1}, Lb1/z;->F(Lb1/z;F)F

    move-result p0

    return p0
.end method

.method private static final F(Lb1/z;F)F
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Lb1/z;->m:LY0/e;

    invoke-interface {p0}, LY0/e;->getDensity()F

    move-result p0

    mul-float/2addr p0, p1

    return p0
.end method


# virtual methods
.method public final G()J
    .locals 2

    iget-wide v0, p0, Lb1/z;->n:J

    return-wide v0
.end method

.method public final H(J)V
    .locals 0

    iput-wide p1, p0, Lb1/z;->n:J

    return-void
.end method

.method public e(Ljava/lang/Object;)I
    .locals 1

    .prologue
    instance-of v0, p1, LY0/i;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lb1/z;->m:LY0/e;

    check-cast p1, LY0/i;

    invoke-virtual {p1}, LY0/i;->v()F

    move-result p1

    invoke-interface {v0, p1}, LY0/e;->S0(F)I

    move-result p1

    goto :goto_0

    :cond_0
    invoke-super {p0, p1}, Lj1/g;->e(Ljava/lang/Object;)I

    move-result p1

    :goto_0
    return p1
.end method
