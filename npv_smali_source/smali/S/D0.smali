.class public final LS/D0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:J

.field private final b:J

.field private final c:J

.field private final d:J


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>(JJJJ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, LS/D0;->a:J

    iput-wide p3, p0, LS/D0;->b:J

    iput-wide p5, p0, LS/D0;->c:J

    iput-wide p7, p0, LS/D0;->d:J

    return-void
.end method

.method public synthetic constructor <init>(JJJJLy7/k;)V
    .locals 0

    invoke-direct/range {p0 .. p8}, LS/D0;-><init>(JJJJ)V

    return-void
.end method


# virtual methods
.method public final a(ZZLV/n;I)LV/G1;
    .locals 10

    .prologue
    invoke-static {}, LV/q;->H()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    const-string v1, "androidx.compose.material3.RadioButtonColors.radioColor (RadioButton.kt:228)"

    const v2, -0x6dae638c

    invoke-static {v2, p4, v0, v1}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_0
    if-eqz p1, :cond_1

    if-eqz p2, :cond_1

    iget-wide v0, p0, LS/D0;->a:J

    :goto_0
    move-wide v2, v0

    goto :goto_1

    :cond_1
    if-eqz p1, :cond_2

    if-nez p2, :cond_2

    iget-wide v0, p0, LS/D0;->b:J

    goto :goto_0

    :cond_2
    if-nez p1, :cond_3

    if-eqz p2, :cond_3

    iget-wide v0, p0, LS/D0;->c:J

    goto :goto_0

    :cond_3
    iget-wide v0, p0, LS/D0;->d:J

    goto :goto_0

    :goto_1
    const/4 p2, 0x0

    if-eqz p1, :cond_4

    const p1, 0x14dd9d03

    invoke-interface {p3, p1}, LV/n;->T(I)V

    const/16 p1, 0x64

    const/4 p4, 0x6

    const/4 v0, 0x0

    invoke-static {p1, p2, v0, p4, v0}, Lu/k;->l(IILu/F;ILjava/lang/Object;)Lu/w0;

    move-result-object v4

    const/16 v8, 0x30

    const/16 v9, 0xc

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v7, p3

    invoke-static/range {v2 .. v9}, Lt/w;->a(JLu/j;Ljava/lang/String;Lx7/l;LV/n;II)LV/G1;

    move-result-object p1

    :goto_2
    invoke-interface {p3}, LV/n;->J()V

    goto :goto_3

    :cond_4
    const p1, 0x14df2e32

    invoke-interface {p3, p1}, LV/n;->T(I)V

    invoke-static {v2, v3}, Lo0/y0;->i(J)Lo0/y0;

    move-result-object p1

    invoke-static {p1, p3, p2}, LV/v1;->n(Ljava/lang/Object;LV/n;I)LV/G1;

    move-result-object p1

    goto :goto_2

    :goto_3
    invoke-static {}, LV/q;->H()Z

    move-result p2

    if-eqz p2, :cond_5

    invoke-static {}, LV/q;->P()V

    :cond_5
    return-object p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 6

    .prologue
    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_6

    instance-of v2, p1, LS/D0;

    if-nez v2, :cond_1

    goto :goto_0

    :cond_1
    iget-wide v2, p0, LS/D0;->a:J

    check-cast p1, LS/D0;

    iget-wide v4, p1, LS/D0;->a:J

    invoke-static {v2, v3, v4, v5}, Lo0/y0;->o(JJ)Z

    move-result v2

    if-nez v2, :cond_2

    return v1

    :cond_2
    iget-wide v2, p0, LS/D0;->b:J

    iget-wide v4, p1, LS/D0;->b:J

    invoke-static {v2, v3, v4, v5}, Lo0/y0;->o(JJ)Z

    move-result v2

    if-nez v2, :cond_3

    return v1

    :cond_3
    iget-wide v2, p0, LS/D0;->c:J

    iget-wide v4, p1, LS/D0;->c:J

    invoke-static {v2, v3, v4, v5}, Lo0/y0;->o(JJ)Z

    move-result v2

    if-nez v2, :cond_4

    return v1

    :cond_4
    iget-wide v2, p0, LS/D0;->d:J

    iget-wide v4, p1, LS/D0;->d:J

    invoke-static {v2, v3, v4, v5}, Lo0/y0;->o(JJ)Z

    move-result p1

    if-nez p1, :cond_5

    return v1

    :cond_5
    return v0

    :cond_6
    :goto_0
    return v1
.end method

.method public hashCode()I
    .locals 3

    iget-wide v0, p0, LS/D0;->a:J

    invoke-static {v0, v1}, Lo0/y0;->u(J)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, LS/D0;->b:J

    invoke-static {v1, v2}, Lo0/y0;->u(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, LS/D0;->c:J

    invoke-static {v1, v2}, Lo0/y0;->u(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, LS/D0;->d:J

    invoke-static {v1, v2}, Lo0/y0;->u(J)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method
