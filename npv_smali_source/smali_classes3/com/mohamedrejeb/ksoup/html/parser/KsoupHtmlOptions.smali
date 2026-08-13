.class public final Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlOptions;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlOptions$Builder;,
        Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlOptions$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0be9"
    }
    d2 = {
        "\u0bea",
        "",
        "\u0beb",
        "",
        "\u0bec",
        "\u0bed",
        "\u0bee",
        "\u0bef",
        "\u0bf0",
        "\u0bf1",
        "\u0bf2",
        "\u0bf3",
        "\u0bf4",
        "\u0bf5",
        "\u0bf6",
        "\u0bf7",
        "\u0bf8",
        "\u0bf9",
        "\u0bfa",
        "\u0bfb",
        "\u0bfc",
        "\u0bfd",
        "\u0bfe",
        "\u0bff",
        "\u0c00",
        "\u0c01",
        "\u0c02",
        "\u0c03",
        "",
        "\u0c04",
        "",
        "\u0c05",
        "\u0c06",
        "\u0c07"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final Companion:Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlOptions$Companion;

.field private static final Default:Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlOptions;


# instance fields
.field private final decodeEntities:Z

.field private final lowerCaseAttributeNames:Z

.field private final lowerCaseTags:Z

.field private final recognizeCDATA:Z

.field private final recognizeSelfClosing:Z

.field private final xmlMode:Z


# direct methods
.method static constructor <clinit>()V
    .locals 11

    new-instance v0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlOptions$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlOptions$Companion;-><init>(Ly7/k;)V

    sput-object v0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlOptions;->Companion:Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlOptions$Companion;

    new-instance v0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlOptions;

    const/16 v9, 0x3f

    const/4 v10, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v2, v0

    invoke-direct/range {v2 .. v10}, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlOptions;-><init>(ZZZZZZILy7/k;)V

    sput-object v0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlOptions;->Default:Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlOptions;

    return-void
.end method

.method public constructor <init>()V
    .locals 9

    const/16 v7, 0x3f

    const/4 v8, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v8}, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlOptions;-><init>(ZZZZZZILy7/k;)V

    return-void
.end method

.method public constructor <init>(ZZZZZZ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlOptions;->xmlMode:Z

    iput-boolean p2, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlOptions;->decodeEntities:Z

    iput-boolean p3, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlOptions;->lowerCaseTags:Z

    iput-boolean p4, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlOptions;->lowerCaseAttributeNames:Z

    iput-boolean p5, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlOptions;->recognizeCDATA:Z

    iput-boolean p6, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlOptions;->recognizeSelfClosing:Z

    return-void
.end method

.method public synthetic constructor <init>(ZZZZZZILy7/k;)V
    .locals 4

    .prologue
    and-int/lit8 p8, p7, 0x1

    if-eqz p8, :cond_0

    const/4 p1, 0x0

    :cond_0
    and-int/lit8 p8, p7, 0x2

    if-eqz p8, :cond_1

    const/4 p2, 0x1

    :cond_1
    move p8, p2

    and-int/lit8 p2, p7, 0x4

    if-eqz p2, :cond_2

    xor-int/lit8 p3, p1, 0x1

    :cond_2
    move v0, p3

    and-int/lit8 p2, p7, 0x8

    if-eqz p2, :cond_3

    xor-int/lit8 p4, p1, 0x1

    :cond_3
    move v1, p4

    and-int/lit8 p2, p7, 0x10

    if-eqz p2, :cond_4

    move v2, p1

    goto :goto_0

    :cond_4
    move v2, p5

    :goto_0
    and-int/lit8 p2, p7, 0x20

    if-eqz p2, :cond_5

    move v3, p1

    goto :goto_1

    :cond_5
    move v3, p6

    :goto_1
    move-object p2, p0

    move p3, p1

    move p4, p8

    move p5, v0

    move p6, v1

    move p7, v2

    move p8, v3

    invoke-direct/range {p2 .. p8}, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlOptions;-><init>(ZZZZZZ)V

    return-void
.end method

.method public static final synthetic access$getDefault$cp()Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlOptions;
    .locals 1

    sget-object v0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlOptions;->Default:Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlOptions;

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlOptions;ZZZZZZILjava/lang/Object;)Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlOptions;
    .locals 4

    .prologue
    and-int/lit8 p8, p7, 0x1

    if-eqz p8, :cond_0

    iget-boolean p1, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlOptions;->xmlMode:Z

    :cond_0
    and-int/lit8 p8, p7, 0x2

    if-eqz p8, :cond_1

    iget-boolean p2, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlOptions;->decodeEntities:Z

    :cond_1
    move p8, p2

    and-int/lit8 p2, p7, 0x4

    if-eqz p2, :cond_2

    iget-boolean p3, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlOptions;->lowerCaseTags:Z

    :cond_2
    move v0, p3

    and-int/lit8 p2, p7, 0x8

    if-eqz p2, :cond_3

    iget-boolean p4, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlOptions;->lowerCaseAttributeNames:Z

    :cond_3
    move v1, p4

    and-int/lit8 p2, p7, 0x10

    if-eqz p2, :cond_4

    iget-boolean p5, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlOptions;->recognizeCDATA:Z

    :cond_4
    move v2, p5

    and-int/lit8 p2, p7, 0x20

    if-eqz p2, :cond_5

    iget-boolean p6, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlOptions;->recognizeSelfClosing:Z

    :cond_5
    move v3, p6

    move-object p2, p0

    move p3, p1

    move p4, p8

    move p5, v0

    move p6, v1

    move p7, v2

    move p8, v3

    invoke-virtual/range {p2 .. p8}, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlOptions;->copy(ZZZZZZ)Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlOptions;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Z
    .locals 1

    iget-boolean v0, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlOptions;->xmlMode:Z

    return v0
.end method

.method public final component2()Z
    .locals 1

    iget-boolean v0, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlOptions;->decodeEntities:Z

    return v0
.end method

.method public final component3()Z
    .locals 1

    iget-boolean v0, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlOptions;->lowerCaseTags:Z

    return v0
.end method

.method public final component4()Z
    .locals 1

    iget-boolean v0, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlOptions;->lowerCaseAttributeNames:Z

    return v0
.end method

.method public final component5()Z
    .locals 1

    iget-boolean v0, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlOptions;->recognizeCDATA:Z

    return v0
.end method

.method public final component6()Z
    .locals 1

    iget-boolean v0, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlOptions;->recognizeSelfClosing:Z

    return v0
.end method

.method public final copy(ZZZZZZ)Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlOptions;
    .locals 8

    new-instance v7, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlOptions;

    move-object v0, v7

    move v1, p1

    move v2, p2

    move v3, p3

    move v4, p4

    move v5, p5

    move v6, p6

    invoke-direct/range {v0 .. v6}, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlOptions;-><init>(ZZZZZZ)V

    return-object v7
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    .prologue
    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlOptions;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlOptions;

    iget-boolean v1, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlOptions;->xmlMode:Z

    iget-boolean v3, p1, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlOptions;->xmlMode:Z

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-boolean v1, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlOptions;->decodeEntities:Z

    iget-boolean v3, p1, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlOptions;->decodeEntities:Z

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-boolean v1, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlOptions;->lowerCaseTags:Z

    iget-boolean v3, p1, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlOptions;->lowerCaseTags:Z

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-boolean v1, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlOptions;->lowerCaseAttributeNames:Z

    iget-boolean v3, p1, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlOptions;->lowerCaseAttributeNames:Z

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-boolean v1, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlOptions;->recognizeCDATA:Z

    iget-boolean v3, p1, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlOptions;->recognizeCDATA:Z

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget-boolean v1, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlOptions;->recognizeSelfClosing:Z

    iget-boolean p1, p1, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlOptions;->recognizeSelfClosing:Z

    if-eq v1, p1, :cond_7

    return v2

    :cond_7
    return v0
.end method

.method public final getDecodeEntities()Z
    .locals 1

    iget-boolean v0, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlOptions;->decodeEntities:Z

    return v0
.end method

.method public final getLowerCaseAttributeNames()Z
    .locals 1

    iget-boolean v0, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlOptions;->lowerCaseAttributeNames:Z

    return v0
.end method

.method public final getLowerCaseTags()Z
    .locals 1

    iget-boolean v0, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlOptions;->lowerCaseTags:Z

    return v0
.end method

.method public final getRecognizeCDATA()Z
    .locals 1

    iget-boolean v0, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlOptions;->recognizeCDATA:Z

    return v0
.end method

.method public final getRecognizeSelfClosing()Z
    .locals 1

    iget-boolean v0, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlOptions;->recognizeSelfClosing:Z

    return v0
.end method

.method public final getXmlMode()Z
    .locals 1

    iget-boolean v0, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlOptions;->xmlMode:Z

    return v0
.end method

.method public hashCode()I
    .locals 2

    iget-boolean v0, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlOptions;->xmlMode:Z

    invoke-static {v0}, Lt/h;->a(Z)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlOptions;->decodeEntities:Z

    invoke-static {v1}, Lt/h;->a(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlOptions;->lowerCaseTags:Z

    invoke-static {v1}, Lt/h;->a(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlOptions;->lowerCaseAttributeNames:Z

    invoke-static {v1}, Lt/h;->a(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlOptions;->recognizeCDATA:Z

    invoke-static {v1}, Lt/h;->a(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlOptions;->recognizeSelfClosing:Z

    invoke-static {v1}, Lt/h;->a(Z)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "KsoupHtmlOptions(xmlMode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlOptions;->xmlMode:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", decodeEntities="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlOptions;->decodeEntities:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", lowerCaseTags="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlOptions;->lowerCaseTags:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", lowerCaseAttributeNames="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlOptions;->lowerCaseAttributeNames:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", recognizeCDATA="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlOptions;->recognizeCDATA:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", recognizeSelfClosing="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlOptions;->recognizeSelfClosing:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
