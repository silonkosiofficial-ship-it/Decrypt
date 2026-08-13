.class public final LY6/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Comparable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LY6/b$a;,
        LY6/b$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/lang/Comparable<",
        "LY6/b;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0b1f"
    }
    d2 = {
        "\u0b20",
        "",
        "",
        "\u0b21",
        "\u0b22",
        "\u0b23",
        "\u0b24",
        "\u0b25",
        "\u0b26",
        "\u0b27",
        "\u0b28",
        "\u0b29",
        "\u0b2a",
        "",
        "\u0b2b",
        "\u0b2c",
        "\u0b2d",
        "\u0b2e",
        "\u0b2f",
        "\u0b30",
        "\u0b31",
        "\u0b32",
        "\u0b33",
        "\u0b34",
        "\u0b35",
        "\u0b36",
        "\u0b37",
        "\u0b38",
        "\u0b39",
        "\u0b3a",
        "\u0b3b",
        "\u0b3c",
        "",
        "\u0b3d",
        "\u0b3e",
        "\u0b3f",
        "\u0b40",
        "",
        "",
        "\u0b41",
        "\u0b42",
        "\u0b43",
        "\u0b44",
        "\u0b45",
        "\u0b46",
        "\u0b47",
        "\u0b48",
        "\u0b49",
        "\u0b4a",
        "\u0b4b",
        "\u0b4c",
        "\u0b4d",
        "\u0b4e",
        "\u0b4f",
        "\u0b50",
        "\u0b51",
        "\u0b52",
        "\u0b53",
        "\u0b54",
        "\u0b55",
        "\u0b56",
        "\u0b57",
        "\u0b58",
        "\u0b59",
        "\u0b5a",
        "\u0b5b",
        "\u0b5c",
        "\u0b5d"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
.end annotation


# static fields
.field public static final Companion:LY6/b$b;

.field private static final L:[Lt9/b;

.field private static final M:LY6/b;


# instance fields
.field private final C:I

.field private final D:I

.field private final E:I

.field private final F:LY6/d;

.field private final G:I

.field private final H:I

.field private final I:LY6/c;

.field private final J:I

.field private final K:J


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, LY6/b$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LY6/b$b;-><init>(Ly7/k;)V

    sput-object v0, LY6/b;->Companion:LY6/b$b;

    const-string v0, "io.ktor.util.date.WeekDay"

    invoke-static {}, LY6/d;->values()[LY6/d;

    move-result-object v2

    invoke-static {v0, v2}, Lx9/z;->a(Ljava/lang/String;[Ljava/lang/Enum;)Lt9/b;

    move-result-object v0

    const-string v2, "io.ktor.util.date.Month"

    invoke-static {}, LY6/c;->values()[LY6/c;

    move-result-object v3

    invoke-static {v2, v3}, Lx9/z;->a(Ljava/lang/String;[Ljava/lang/Enum;)Lt9/b;

    move-result-object v2

    const/16 v3, 0x9

    new-array v3, v3, [Lt9/b;

    const/4 v4, 0x0

    aput-object v1, v3, v4

    const/4 v4, 0x1

    aput-object v1, v3, v4

    const/4 v4, 0x2

    aput-object v1, v3, v4

    const/4 v4, 0x3

    aput-object v0, v3, v4

    const/4 v0, 0x4

    aput-object v1, v3, v0

    const/4 v0, 0x5

    aput-object v1, v3, v0

    const/4 v0, 0x6

    aput-object v2, v3, v0

    const/4 v0, 0x7

    aput-object v1, v3, v0

    const/16 v0, 0x8

    aput-object v1, v3, v0

    sput-object v3, LY6/b;->L:[Lt9/b;

    const-wide/16 v0, 0x0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-static {v0}, LY6/a;->a(Ljava/lang/Long;)LY6/b;

    move-result-object v0

    sput-object v0, LY6/b;->M:LY6/b;

    return-void
.end method

.method public synthetic constructor <init>(IIIILY6/d;IILY6/c;IJLx9/u0;)V
    .locals 1

    .prologue
    and-int/lit16 p12, p1, 0x1ff

    const/16 v0, 0x1ff

    if-eq v0, p12, :cond_0

    sget-object p12, LY6/b$a;->a:LY6/b$a;

    invoke-virtual {p12}, LY6/b$a;->a()Lv9/f;

    move-result-object p12

    invoke-static {p1, v0, p12}, Lx9/f0;->a(IILv9/f;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p2, p0, LY6/b;->C:I

    iput p3, p0, LY6/b;->D:I

    iput p4, p0, LY6/b;->E:I

    iput-object p5, p0, LY6/b;->F:LY6/d;

    iput p6, p0, LY6/b;->G:I

    iput p7, p0, LY6/b;->H:I

    iput-object p8, p0, LY6/b;->I:LY6/c;

    iput p9, p0, LY6/b;->J:I

    iput-wide p10, p0, LY6/b;->K:J

    return-void
.end method

.method public constructor <init>(IIILY6/d;IILY6/c;IJ)V
    .locals 1

    const-string v0, "dayOfWeek"

    invoke-static {p4, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "month"

    invoke-static {p7, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, LY6/b;->C:I

    iput p2, p0, LY6/b;->D:I

    iput p3, p0, LY6/b;->E:I

    iput-object p4, p0, LY6/b;->F:LY6/d;

    iput p5, p0, LY6/b;->G:I

    iput p6, p0, LY6/b;->H:I

    iput-object p7, p0, LY6/b;->I:LY6/c;

    iput p8, p0, LY6/b;->J:I

    iput-wide p9, p0, LY6/b;->K:J

    return-void
.end method

.method public static final synthetic e()[Lt9/b;
    .locals 1

    sget-object v0, LY6/b;->L:[Lt9/b;

    return-object v0
.end method

.method public static final synthetic i(LY6/b;Lw9/f;Lv9/f;)V
    .locals 4

    sget-object v0, LY6/b;->L:[Lt9/b;

    iget v1, p0, LY6/b;->C:I

    const/4 v2, 0x0

    invoke-interface {p1, p2, v2, v1}, Lw9/f;->m(Lv9/f;II)V

    const/4 v1, 0x1

    iget v2, p0, LY6/b;->D:I

    invoke-interface {p1, p2, v1, v2}, Lw9/f;->m(Lv9/f;II)V

    const/4 v1, 0x2

    iget v2, p0, LY6/b;->E:I

    invoke-interface {p1, p2, v1, v2}, Lw9/f;->m(Lv9/f;II)V

    const/4 v1, 0x3

    aget-object v2, v0, v1

    iget-object v3, p0, LY6/b;->F:LY6/d;

    invoke-interface {p1, p2, v1, v2, v3}, Lw9/f;->r(Lv9/f;ILt9/e;Ljava/lang/Object;)V

    const/4 v1, 0x4

    iget v2, p0, LY6/b;->G:I

    invoke-interface {p1, p2, v1, v2}, Lw9/f;->m(Lv9/f;II)V

    const/4 v1, 0x5

    iget v2, p0, LY6/b;->H:I

    invoke-interface {p1, p2, v1, v2}, Lw9/f;->m(Lv9/f;II)V

    const/4 v1, 0x6

    aget-object v0, v0, v1

    iget-object v2, p0, LY6/b;->I:LY6/c;

    invoke-interface {p1, p2, v1, v0, v2}, Lw9/f;->r(Lv9/f;ILt9/e;Ljava/lang/Object;)V

    const/4 v0, 0x7

    iget v1, p0, LY6/b;->J:I

    invoke-interface {p1, p2, v0, v1}, Lw9/f;->m(Lv9/f;II)V

    const/16 v0, 0x8

    iget-wide v1, p0, LY6/b;->K:J

    invoke-interface {p1, p2, v0, v1, v2}, Lw9/f;->B(Lv9/f;IJ)V

    return-void
.end method


# virtual methods
.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, LY6/b;

    invoke-virtual {p0, p1}, LY6/b;->g(LY6/b;)I

    move-result p1

    return p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    .prologue
    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, LY6/b;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, LY6/b;

    iget v1, p0, LY6/b;->C:I

    iget v3, p1, LY6/b;->C:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget v1, p0, LY6/b;->D:I

    iget v3, p1, LY6/b;->D:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget v1, p0, LY6/b;->E:I

    iget v3, p1, LY6/b;->E:I

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, LY6/b;->F:LY6/d;

    iget-object v3, p1, LY6/b;->F:LY6/d;

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget v1, p0, LY6/b;->G:I

    iget v3, p1, LY6/b;->G:I

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget v1, p0, LY6/b;->H:I

    iget v3, p1, LY6/b;->H:I

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, LY6/b;->I:LY6/c;

    iget-object v3, p1, LY6/b;->I:LY6/c;

    if-eq v1, v3, :cond_8

    return v2

    :cond_8
    iget v1, p0, LY6/b;->J:I

    iget v3, p1, LY6/b;->J:I

    if-eq v1, v3, :cond_9

    return v2

    :cond_9
    iget-wide v3, p0, LY6/b;->K:J

    iget-wide v5, p1, LY6/b;->K:J

    cmp-long p1, v3, v5

    if-eqz p1, :cond_a

    return v2

    :cond_a
    return v0
.end method

.method public g(LY6/b;)I
    .locals 4

    const-string v0, "other"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-wide v0, p0, LY6/b;->K:J

    iget-wide v2, p1, LY6/b;->K:J

    invoke-static {v0, v1, v2, v3}, Ly7/t;->h(JJ)I

    move-result p1

    return p1
.end method

.method public hashCode()I
    .locals 3

    iget v0, p0, LY6/b;->C:I

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, LY6/b;->D:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, LY6/b;->E:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, LY6/b;->F:LY6/d;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, LY6/b;->G:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, LY6/b;->H:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, LY6/b;->I:LY6/c;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, LY6/b;->J:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, LY6/b;->K:J

    invoke-static {v1, v2}, Lr/r;->a(J)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "GMTDate(seconds="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, LY6/b;->C:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", minutes="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, LY6/b;->D:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", hours="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, LY6/b;->E:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", dayOfWeek="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LY6/b;->F:LY6/d;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", dayOfMonth="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, LY6/b;->G:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", dayOfYear="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, LY6/b;->H:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", month="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LY6/b;->I:LY6/c;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", year="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, LY6/b;->J:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", timestamp="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, LY6/b;->K:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
