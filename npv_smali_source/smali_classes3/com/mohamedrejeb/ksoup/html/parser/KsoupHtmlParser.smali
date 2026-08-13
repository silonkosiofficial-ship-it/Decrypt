.class public final Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$Callbacks;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser$Companion;,
        Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser$QuoteType;,
        Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser$WhenMappings;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u15ff"
    }
    d2 = {
        "\u1600",
        "\u1601",
        "\u1602",
        "\u1603",
        "\u1604",
        "\u1605",
        "\u1606",
        "\u1607",
        "",
        "\u1608",
        "",
        "\u1609",
        "\u160a",
        "\u160b",
        "\u160c",
        "\u160d",
        "\u160e",
        "\u160f",
        "\u1610",
        "\u1611",
        "\u1612",
        "\u1613",
        "\u1614",
        "\u1615",
        "",
        "\u1616",
        "\u1617",
        "\u1618",
        "\u1619",
        "\u161a",
        "\u161b",
        "\u161c",
        "\u161d",
        "\u161e",
        "\u161f",
        "\u1620",
        "\u1621",
        "\u1622",
        "\u1623",
        "\u1624",
        "\u1625",
        "\u1626",
        "\u1627",
        "\u1628",
        "\u1629",
        "\u162a",
        "\u162b",
        "\u162c",
        "\u162d",
        "\u162e",
        "\u162f",
        "\u1630",
        "\u1631",
        "\u1632",
        "\u1633",
        "\u1634",
        "\u1635",
        "\u1636",
        "\u1637",
        "\u1638",
        "\u1639",
        "\u163a",
        "\u163b",
        "\u163c",
        "\u163d",
        "\u163e",
        "\u163f",
        "\u1640",
        "\u1641",
        "\u1642",
        "\u1643",
        "\u1644",
        "\u1645",
        "\u1646",
        "\u1647",
        "",
        "\u1648",
        "\u1649",
        "",
        "\u164a",
        "\u164b",
        "\u164c",
        "\u164d",
        "\u164e",
        "\u164f",
        "\u1650",
        "\u1651",
        "\u1652",
        "\u1653",
        "\u1654",
        "\u1655",
        "\u1656",
        "\u1657",
        "\u1658",
        "\u1659",
        "\u165a",
        "\u165b",
        "\u165c"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
.end annotation


# static fields
.field private static final Companion:Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser$Companion;

.field private static final ddtTags:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private static final foreignContextElements:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private static final formTags:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private static final htmlIntegrationElements:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private static final openImpliesClose:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation
.end field

.field private static final pTag:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private static final reNameEnd:LS8/o;

.field private static final rtpTags:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private static final tableSectionTags:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private static final voidElements:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private attribName:Ljava/lang/String;

.field private attribValue:Ljava/lang/String;

.field private attribs:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private bufferOffset:I

.field private final buffers:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private endIndex:I

.field private ended:Z

.field private final foreignContext:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final handler:Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler;

.field private final ksoupTokenizer:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;

.field private openTagStart:I

.field private final options:Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlOptions;

.field private final stack:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private startIndex:I

.field private tagName:Ljava/lang/String;

.field private writeIndex:I


# direct methods
.method static constructor <clinit>()V
    .locals 50

    new-instance v0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser$Companion;-><init>(Ly7/k;)V

    sput-object v0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser;->Companion:Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser$Companion;

    const-string v7, "datalist"

    const-string v8, "textarea"

    const-string v2, "input"

    const-string v3, "option"

    const-string v4, "optgroup"

    const-string v5, "select"

    const-string v6, "button"

    filled-new-array/range {v2 .. v8}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lj7/Z;->g([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    sput-object v0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser;->formTags:Ljava/util/Set;

    const-string v1, "p"

    invoke-static {v1}, Lj7/Z;->c(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v2

    sput-object v2, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser;->pTag:Ljava/util/Set;

    const-string v3, "thead"

    const-string v4, "tbody"

    filled-new-array {v3, v4}, [Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lj7/Z;->g([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v5

    sput-object v5, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser;->tableSectionTags:Ljava/util/Set;

    const-string v6, "dt"

    const-string v7, "dd"

    filled-new-array {v6, v7}, [Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Lj7/Z;->g([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v8

    sput-object v8, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser;->ddtTags:Ljava/util/Set;

    const-string v9, "rt"

    const-string v10, "rp"

    filled-new-array {v9, v10}, [Ljava/lang/String;

    move-result-object v11

    invoke-static {v11}, Lj7/Z;->g([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v11

    sput-object v11, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser;->rtpTags:Ljava/util/Set;

    const-string v12, "tr"

    const-string v13, "th"

    const-string v14, "td"

    filled-new-array {v12, v13, v14}, [Ljava/lang/String;

    move-result-object v15

    invoke-static {v15}, Lj7/Z;->g([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v15

    invoke-static {v12, v15}, Li7/B;->a(Ljava/lang/Object;Ljava/lang/Object;)Li7/u;

    move-result-object v12

    invoke-static {v13}, Lj7/Z;->c(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v15

    invoke-static {v13, v15}, Li7/B;->a(Ljava/lang/Object;Ljava/lang/Object;)Li7/u;

    move-result-object v15

    filled-new-array {v3, v13, v14}, [Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lj7/Z;->g([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v3

    invoke-static {v14, v3}, Li7/B;->a(Ljava/lang/Object;Ljava/lang/Object;)Li7/u;

    move-result-object v3

    const-string v13, "link"

    const-string v14, "script"

    move-object/from16 v16, v3

    const-string v3, "head"

    filled-new-array {v3, v13, v14}, [Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lj7/Z;->g([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v3

    const-string v13, "body"

    invoke-static {v13, v3}, Li7/B;->a(Ljava/lang/Object;Ljava/lang/Object;)Li7/u;

    move-result-object v3

    const-string v13, "li"

    invoke-static {v13}, Lj7/Z;->c(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v14

    invoke-static {v13, v14}, Li7/B;->a(Ljava/lang/Object;Ljava/lang/Object;)Li7/u;

    move-result-object v13

    invoke-static {v1, v2}, Li7/B;->a(Ljava/lang/Object;Ljava/lang/Object;)Li7/u;

    move-result-object v1

    const-string v14, "h1"

    invoke-static {v14, v2}, Li7/B;->a(Ljava/lang/Object;Ljava/lang/Object;)Li7/u;

    move-result-object v14

    move-object/from16 v17, v14

    const-string v14, "h2"

    invoke-static {v14, v2}, Li7/B;->a(Ljava/lang/Object;Ljava/lang/Object;)Li7/u;

    move-result-object v14

    move-object/from16 v18, v14

    const-string v14, "h3"

    invoke-static {v14, v2}, Li7/B;->a(Ljava/lang/Object;Ljava/lang/Object;)Li7/u;

    move-result-object v14

    move-object/from16 v19, v14

    const-string v14, "h4"

    invoke-static {v14, v2}, Li7/B;->a(Ljava/lang/Object;Ljava/lang/Object;)Li7/u;

    move-result-object v14

    move-object/from16 v20, v14

    const-string v14, "h5"

    invoke-static {v14, v2}, Li7/B;->a(Ljava/lang/Object;Ljava/lang/Object;)Li7/u;

    move-result-object v14

    move-object/from16 v21, v14

    const-string v14, "h6"

    invoke-static {v14, v2}, Li7/B;->a(Ljava/lang/Object;Ljava/lang/Object;)Li7/u;

    move-result-object v14

    move-object/from16 v22, v14

    const-string v14, "select"

    invoke-static {v14, v0}, Li7/B;->a(Ljava/lang/Object;Ljava/lang/Object;)Li7/u;

    move-result-object v14

    move-object/from16 v23, v14

    const-string v14, "input"

    invoke-static {v14, v0}, Li7/B;->a(Ljava/lang/Object;Ljava/lang/Object;)Li7/u;

    move-result-object v14

    move-object/from16 v24, v14

    const-string v14, "output"

    invoke-static {v14, v0}, Li7/B;->a(Ljava/lang/Object;Ljava/lang/Object;)Li7/u;

    move-result-object v14

    move-object/from16 v25, v14

    const-string v14, "button"

    invoke-static {v14, v0}, Li7/B;->a(Ljava/lang/Object;Ljava/lang/Object;)Li7/u;

    move-result-object v14

    move-object/from16 v26, v14

    const-string v14, "datalist"

    invoke-static {v14, v0}, Li7/B;->a(Ljava/lang/Object;Ljava/lang/Object;)Li7/u;

    move-result-object v14

    move-object/from16 v27, v14

    const-string v14, "textarea"

    invoke-static {v14, v0}, Li7/B;->a(Ljava/lang/Object;Ljava/lang/Object;)Li7/u;

    move-result-object v0

    const-string v14, "option"

    move-object/from16 v28, v0

    invoke-static {v14}, Lj7/Z;->c(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    invoke-static {v14, v0}, Li7/B;->a(Ljava/lang/Object;Ljava/lang/Object;)Li7/u;

    move-result-object v0

    move-object/from16 v29, v0

    const-string v0, "optgroup"

    filled-new-array {v0, v14}, [Ljava/lang/String;

    move-result-object v14

    invoke-static {v14}, Lj7/Z;->g([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v14

    invoke-static {v0, v14}, Li7/B;->a(Ljava/lang/Object;Ljava/lang/Object;)Li7/u;

    move-result-object v0

    invoke-static {v7, v8}, Li7/B;->a(Ljava/lang/Object;Ljava/lang/Object;)Li7/u;

    move-result-object v7

    invoke-static {v6, v8}, Li7/B;->a(Ljava/lang/Object;Ljava/lang/Object;)Li7/u;

    move-result-object v6

    const-string v8, "address"

    invoke-static {v8, v2}, Li7/B;->a(Ljava/lang/Object;Ljava/lang/Object;)Li7/u;

    move-result-object v8

    const-string v14, "article"

    invoke-static {v14, v2}, Li7/B;->a(Ljava/lang/Object;Ljava/lang/Object;)Li7/u;

    move-result-object v14

    move-object/from16 v30, v14

    const-string v14, "aside"

    invoke-static {v14, v2}, Li7/B;->a(Ljava/lang/Object;Ljava/lang/Object;)Li7/u;

    move-result-object v14

    move-object/from16 v31, v14

    const-string v14, "blockquote"

    invoke-static {v14, v2}, Li7/B;->a(Ljava/lang/Object;Ljava/lang/Object;)Li7/u;

    move-result-object v14

    move-object/from16 v32, v14

    const-string v14, "details"

    invoke-static {v14, v2}, Li7/B;->a(Ljava/lang/Object;Ljava/lang/Object;)Li7/u;

    move-result-object v14

    move-object/from16 v33, v14

    const-string v14, "div"

    invoke-static {v14, v2}, Li7/B;->a(Ljava/lang/Object;Ljava/lang/Object;)Li7/u;

    move-result-object v14

    move-object/from16 v34, v14

    const-string v14, "dl"

    invoke-static {v14, v2}, Li7/B;->a(Ljava/lang/Object;Ljava/lang/Object;)Li7/u;

    move-result-object v14

    move-object/from16 v35, v14

    const-string v14, "fieldset"

    invoke-static {v14, v2}, Li7/B;->a(Ljava/lang/Object;Ljava/lang/Object;)Li7/u;

    move-result-object v14

    move-object/from16 v36, v14

    const-string v14, "figcaption"

    invoke-static {v14, v2}, Li7/B;->a(Ljava/lang/Object;Ljava/lang/Object;)Li7/u;

    move-result-object v14

    move-object/from16 v37, v14

    const-string v14, "figure"

    invoke-static {v14, v2}, Li7/B;->a(Ljava/lang/Object;Ljava/lang/Object;)Li7/u;

    move-result-object v14

    move-object/from16 v38, v14

    const-string v14, "footer"

    invoke-static {v14, v2}, Li7/B;->a(Ljava/lang/Object;Ljava/lang/Object;)Li7/u;

    move-result-object v14

    move-object/from16 v39, v14

    const-string v14, "form"

    invoke-static {v14, v2}, Li7/B;->a(Ljava/lang/Object;Ljava/lang/Object;)Li7/u;

    move-result-object v14

    move-object/from16 v40, v14

    const-string v14, "header"

    invoke-static {v14, v2}, Li7/B;->a(Ljava/lang/Object;Ljava/lang/Object;)Li7/u;

    move-result-object v14

    move-object/from16 v41, v14

    const-string v14, "hr"

    invoke-static {v14, v2}, Li7/B;->a(Ljava/lang/Object;Ljava/lang/Object;)Li7/u;

    move-result-object v14

    move-object/from16 v42, v14

    const-string v14, "main"

    invoke-static {v14, v2}, Li7/B;->a(Ljava/lang/Object;Ljava/lang/Object;)Li7/u;

    move-result-object v14

    move-object/from16 v43, v14

    const-string v14, "menu"

    invoke-static {v14, v2}, Li7/B;->a(Ljava/lang/Object;Ljava/lang/Object;)Li7/u;

    move-result-object v14

    move-object/from16 v44, v14

    const-string v14, "nav"

    invoke-static {v14, v2}, Li7/B;->a(Ljava/lang/Object;Ljava/lang/Object;)Li7/u;

    move-result-object v14

    move-object/from16 v45, v14

    const-string v14, "ol"

    invoke-static {v14, v2}, Li7/B;->a(Ljava/lang/Object;Ljava/lang/Object;)Li7/u;

    move-result-object v14

    move-object/from16 v46, v14

    const-string v14, "pre"

    invoke-static {v14, v2}, Li7/B;->a(Ljava/lang/Object;Ljava/lang/Object;)Li7/u;

    move-result-object v14

    move-object/from16 v47, v14

    const-string v14, "section"

    invoke-static {v14, v2}, Li7/B;->a(Ljava/lang/Object;Ljava/lang/Object;)Li7/u;

    move-result-object v14

    move-object/from16 v48, v14

    const-string v14, "table"

    invoke-static {v14, v2}, Li7/B;->a(Ljava/lang/Object;Ljava/lang/Object;)Li7/u;

    move-result-object v14

    move-object/from16 v49, v14

    const-string v14, "ul"

    invoke-static {v14, v2}, Li7/B;->a(Ljava/lang/Object;Ljava/lang/Object;)Li7/u;

    move-result-object v2

    invoke-static {v9, v11}, Li7/B;->a(Ljava/lang/Object;Ljava/lang/Object;)Li7/u;

    move-result-object v9

    invoke-static {v10, v11}, Li7/B;->a(Ljava/lang/Object;Ljava/lang/Object;)Li7/u;

    move-result-object v10

    invoke-static {v4, v5}, Li7/B;->a(Ljava/lang/Object;Ljava/lang/Object;)Li7/u;

    move-result-object v4

    const-string v11, "tfoot"

    invoke-static {v11, v5}, Li7/B;->a(Ljava/lang/Object;Ljava/lang/Object;)Li7/u;

    move-result-object v5

    const/16 v11, 0x30

    new-array v11, v11, [Li7/u;

    const/4 v14, 0x0

    aput-object v12, v11, v14

    const/4 v12, 0x1

    aput-object v15, v11, v12

    const/4 v12, 0x2

    aput-object v16, v11, v12

    const/4 v12, 0x3

    aput-object v3, v11, v12

    const/4 v3, 0x4

    aput-object v13, v11, v3

    const/4 v3, 0x5

    aput-object v1, v11, v3

    const/4 v1, 0x6

    aput-object v17, v11, v1

    const/4 v1, 0x7

    aput-object v18, v11, v1

    const/16 v1, 0x8

    aput-object v19, v11, v1

    const/16 v1, 0x9

    aput-object v20, v11, v1

    const/16 v1, 0xa

    aput-object v21, v11, v1

    const/16 v1, 0xb

    aput-object v22, v11, v1

    const/16 v1, 0xc

    aput-object v23, v11, v1

    const/16 v1, 0xd

    aput-object v24, v11, v1

    const/16 v1, 0xe

    aput-object v25, v11, v1

    const/16 v1, 0xf

    aput-object v26, v11, v1

    const/16 v1, 0x10

    aput-object v27, v11, v1

    const/16 v1, 0x11

    aput-object v28, v11, v1

    const/16 v1, 0x12

    aput-object v29, v11, v1

    const/16 v1, 0x13

    aput-object v0, v11, v1

    const/16 v0, 0x14

    aput-object v7, v11, v0

    const/16 v0, 0x15

    aput-object v6, v11, v0

    const/16 v0, 0x16

    aput-object v8, v11, v0

    const/16 v0, 0x17

    aput-object v30, v11, v0

    const/16 v0, 0x18

    aput-object v31, v11, v0

    const/16 v0, 0x19

    aput-object v32, v11, v0

    const/16 v0, 0x1a

    aput-object v33, v11, v0

    const/16 v0, 0x1b

    aput-object v34, v11, v0

    const/16 v0, 0x1c

    aput-object v35, v11, v0

    const/16 v0, 0x1d

    aput-object v36, v11, v0

    const/16 v0, 0x1e

    aput-object v37, v11, v0

    const/16 v0, 0x1f

    aput-object v38, v11, v0

    const/16 v0, 0x20

    aput-object v39, v11, v0

    const/16 v0, 0x21

    aput-object v40, v11, v0

    const/16 v0, 0x22

    aput-object v41, v11, v0

    const/16 v0, 0x23

    aput-object v42, v11, v0

    const/16 v0, 0x24

    aput-object v43, v11, v0

    const/16 v0, 0x25

    aput-object v44, v11, v0

    const/16 v0, 0x26

    aput-object v45, v11, v0

    const/16 v0, 0x27

    aput-object v46, v11, v0

    const/16 v0, 0x28

    aput-object v47, v11, v0

    const/16 v0, 0x29

    aput-object v48, v11, v0

    const/16 v0, 0x2a

    aput-object v49, v11, v0

    const/16 v0, 0x2b

    aput-object v2, v11, v0

    const/16 v0, 0x2c

    aput-object v9, v11, v0

    const/16 v0, 0x2d

    aput-object v10, v11, v0

    const/16 v0, 0x2e

    aput-object v4, v11, v0

    const/16 v0, 0x2f

    aput-object v5, v11, v0

    invoke-static {v11}, Lj7/S;->k([Li7/u;)Ljava/util/Map;

    move-result-object v0

    sput-object v0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser;->openImpliesClose:Ljava/util/Map;

    const-string v18, "track"

    const-string v19, "wbr"

    const-string v1, "area"

    const-string v2, "base"

    const-string v3, "basefont"

    const-string v4, "br"

    const-string v5, "col"

    const-string v6, "command"

    const-string v7, "embed"

    const-string v8, "frame"

    const-string v9, "hr"

    const-string v10, "img"

    const-string v11, "input"

    const-string v12, "isindex"

    const-string v13, "keygen"

    const-string v14, "link"

    const-string v15, "meta"

    const-string v16, "param"

    const-string v17, "source"

    filled-new-array/range {v1 .. v19}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lj7/Z;->g([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    sput-object v0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser;->voidElements:Ljava/util/Set;

    const-string v0, "math"

    const-string v1, "svg"

    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lj7/Z;->g([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    sput-object v0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser;->foreignContextElements:Ljava/util/Set;

    const-string v8, "desc"

    const-string v9, "title"

    const-string v1, "mi"

    const-string v2, "mo"

    const-string v3, "mn"

    const-string v4, "ms"

    const-string v5, "mtext"

    const-string v6, "annotation-xml"

    const-string v7, "foreignobject"

    filled-new-array/range {v1 .. v9}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lj7/Z;->g([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    sput-object v0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser;->htmlIntegrationElements:Ljava/util/Set;

    new-instance v0, LS8/o;

    const-string v1, "\\s|/"

    invoke-direct {v0, v1}, LS8/o;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser;->reNameEnd:LS8/o;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x3

    invoke-direct {p0, v0, v0, v1, v0}, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser;-><init>(Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler;Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlOptions;ILy7/k;)V

    return-void
.end method

.method public constructor <init>(Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler;Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlOptions;)V
    .locals 1

    const-string v0, "handler"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "options"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser;->handler:Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler;

    iput-object p2, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser;->options:Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlOptions;

    const-string p1, ""

    iput-object p1, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser;->tagName:Ljava/lang/String;

    iput-object p1, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser;->attribName:Ljava/lang/String;

    iput-object p1, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser;->attribValue:Ljava/lang/String;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser;->stack:Ljava/util/List;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser;->foreignContext:Ljava/util/List;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser;->buffers:Ljava/util/List;

    new-instance p1, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;

    invoke-direct {p1, p2, p0}, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;-><init>(Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlOptions;Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer$Callbacks;)V

    iput-object p1, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser;->ksoupTokenizer:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler;Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlOptions;ILy7/k;)V
    .locals 0

    .prologue
    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    sget-object p1, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler$Default;->INSTANCE:Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler$Default;

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    sget-object p2, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlOptions;->Companion:Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlOptions$Companion;

    invoke-virtual {p2}, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlOptions$Companion;->getDefault()Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlOptions;

    move-result-object p2

    :cond_1
    invoke-direct {p0, p1, p2}, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser;-><init>(Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler;Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlOptions;)V

    return-void
.end method

.method private final closeCurrentTag(Z)V
    .locals 3

    .prologue
    iget-object v0, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser;->tagName:Ljava/lang/String;

    invoke-direct {p0, p1}, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser;->endOpenTag(Z)V

    iget-object v1, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser;->stack:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-lez v1, :cond_0

    iget-object v1, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser;->stack:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1, v0}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser;->handler:Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler;

    xor-int/lit8 p1, p1, 0x1

    invoke-interface {v1, v0, p1}, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler;->onCloseTag(Ljava/lang/String;Z)V

    iget-object p1, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser;->stack:Ljava/util/List;

    invoke-static {p1}, Lj7/v;->L(Ljava/util/List;)Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method private final emitOpenTag(Ljava/lang/String;)V
    .locals 4

    .prologue
    iget v0, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser;->startIndex:I

    iput v0, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser;->openTagStart:I

    iput-object p1, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser;->tagName:Ljava/lang/String;

    sget-object v0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser;->openImpliesClose:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Set;

    iget-object v1, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser;->options:Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlOptions;

    invoke-virtual {v1}, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlOptions;->getXmlMode()Z

    move-result v1

    if-nez v1, :cond_0

    if-eqz v0, :cond_0

    :goto_0
    iget-object v1, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser;->stack:Ljava/util/List;

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    const/4 v2, 0x1

    xor-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser;->stack:Ljava/util/List;

    invoke-static {v1}, Lj7/v;->t0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser;->stack:Ljava/util/List;

    invoke-static {v1}, Lj7/v;->L(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    iget-object v3, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser;->handler:Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler;

    invoke-interface {v3, v1, v2}, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler;->onCloseTag(Ljava/lang/String;Z)V

    goto :goto_0

    :cond_0
    invoke-direct {p0, p1}, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser;->isVoidElement(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser;->stack:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    sget-object v0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser;->foreignContextElements:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser;->foreignContext:Ljava/util/List;

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    :goto_1
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_1
    sget-object v0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser;->htmlIntegrationElements:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser;->foreignContext:Ljava/util/List;

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    goto :goto_1

    :cond_2
    :goto_2
    iget-object v0, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser;->handler:Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler;

    invoke-interface {v0, p1}, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler;->onOpenTagName(Ljava/lang/String;)V

    new-instance p1, Ljava/util/LinkedHashMap;

    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object p1, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser;->attribs:Ljava/util/Map;

    return-void
.end method

.method public static synthetic end$default(Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser;Ljava/lang/String;ILjava/lang/Object;)V
    .locals 0

    .prologue
    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    :cond_0
    invoke-virtual {p0, p1}, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser;->end(Ljava/lang/String;)V

    return-void
.end method

.method private final endOpenTag(Z)V
    .locals 3

    .prologue
    iget v0, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser;->openTagStart:I

    iput v0, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser;->startIndex:I

    iget-object v0, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser;->attribs:Ljava/util/Map;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser;->handler:Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler;

    iget-object v2, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser;->tagName:Ljava/lang/String;

    invoke-interface {v1, v2, v0, p1}, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler;->onOpenTag(Ljava/lang/String;Ljava/util/Map;Z)V

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser;->attribs:Ljava/util/Map;

    :cond_0
    iget-object p1, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser;->tagName:Ljava/lang/String;

    invoke-direct {p0, p1}, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser;->isVoidElement(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser;->handler:Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler;

    iget-object v0, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser;->tagName:Ljava/lang/String;

    const/4 v1, 0x1

    invoke-interface {p1, v0, v1}, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler;->onCloseTag(Ljava/lang/String;Z)V

    :cond_1
    const-string p1, ""

    iput-object p1, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser;->tagName:Ljava/lang/String;

    return-void
.end method

.method private final getInstructionName(Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    .prologue
    sget-object v0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser;->reNameEnd:LS8/o;

    const/4 v1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v0, p1, v3, v1, v2}, LS8/o;->b(LS8/o;Ljava/lang/CharSequence;IILjava/lang/Object;)LS8/l;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0}, LS8/l;->d()LE7/i;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LE7/i;->M()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, -0x1

    :goto_0
    if-gez v0, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {p1, v3, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p1

    const-string v0, "substring(...)"

    invoke-static {p1, v0}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_1
    invoke-direct {p0}, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser;->getLowerCaseTagNames()Z

    move-result v0

    if-eqz v0, :cond_2

    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {p1, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "toLowerCase(...)"

    invoke-static {p1, v0}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_2
    return-object p1
.end method

.method private final getLowerCaseAttributeNames()Z
    .locals 1

    iget-object v0, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser;->options:Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlOptions;

    invoke-virtual {v0}, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlOptions;->getLowerCaseAttributeNames()Z

    move-result v0

    return v0
.end method

.method private final getLowerCaseTagNames()Z
    .locals 1

    iget-object v0, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser;->options:Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlOptions;

    invoke-virtual {v0}, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlOptions;->getLowerCaseTags()Z

    move-result v0

    return v0
.end method

.method private final getSlice(II)Ljava/lang/String;
    .locals 4

    .prologue
    :goto_0
    iget v0, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser;->bufferOffset:I

    sub-int v0, p1, v0

    iget-object v1, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser;->buffers:Ljava/util/List;

    invoke-static {v1}, Lj7/v;->i0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    if-lt v0, v1, :cond_0

    invoke-direct {p0}, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser;->shiftBuffer()V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser;->buffers:Ljava/util/List;

    invoke-static {v0}, Lj7/v;->i0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iget v1, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser;->bufferOffset:I

    sub-int/2addr p1, v1

    sub-int v1, p2, v1

    invoke-virtual {v0, p1, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p1

    const-string v0, "substring(...)"

    invoke-static {p1, v0}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_1
    iget v1, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser;->bufferOffset:I

    sub-int v1, p2, v1

    iget-object v2, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser;->buffers:Ljava/util/List;

    invoke-static {v2}, Lj7/v;->i0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    if-le v1, v2, :cond_1

    invoke-direct {p0}, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser;->shiftBuffer()V

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p1, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser;->buffers:Ljava/util/List;

    invoke-static {p1}, Lj7/v;->i0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    iget v2, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser;->bufferOffset:I

    sub-int v2, p2, v2

    const/4 v3, 0x0

    invoke-virtual {p1, v3, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v0}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    goto :goto_1

    :cond_1
    return-object p1
.end method

.method private final isVoidElement(Ljava/lang/String;)Z
    .locals 1

    .prologue
    iget-object v0, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser;->options:Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlOptions;

    invoke-virtual {v0}, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlOptions;->getXmlMode()Z

    move-result v0

    if-nez v0, :cond_0

    sget-object v0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser;->voidElements:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method private final shiftBuffer()V
    .locals 2

    iget v0, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser;->bufferOffset:I

    iget-object v1, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser;->buffers:Ljava/util/List;

    invoke-static {v1}, Lj7/v;->i0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    add-int/2addr v0, v1

    iput v0, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser;->bufferOffset:I

    iget v0, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser;->writeIndex:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser;->writeIndex:I

    iget-object v0, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser;->buffers:Ljava/util/List;

    invoke-static {v0}, Lj7/v;->J(Ljava/util/List;)Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final end(Ljava/lang/String;)V
    .locals 2

    .prologue
    iget-boolean v0, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser;->ended:Z

    if-eqz v0, :cond_0

    iget-object p1, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser;->handler:Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler;

    new-instance v0, Ljava/lang/Exception;

    const-string v1, ".end() after done!"

    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    invoke-interface {p1, v0}, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler;->onError(Ljava/lang/Exception;)V

    return-void

    :cond_0
    if-eqz p1, :cond_1

    invoke-virtual {p0, p1}, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser;->write(Ljava/lang/String;)V

    :cond_1
    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser;->ended:Z

    iget-object p1, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser;->ksoupTokenizer:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;

    invoke-virtual {p1}, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->end()V

    return-void
.end method

.method public final getHandler()Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler;
    .locals 1

    iget-object v0, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser;->handler:Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler;

    return-object v0
.end method

.method public final getOptions()Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlOptions;
    .locals 1

    iget-object v0, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser;->options:Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlOptions;

    return-object v0
.end method

.method public onAttribData(II)V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser;->attribValue:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-direct {p0, p1, p2}, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser;->getSlice(II)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser;->attribValue:Ljava/lang/String;

    return-void
.end method

.method public onAttribEnd(Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser$QuoteType;I)V
    .locals 3

    .prologue
    const-string v0, "quote"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iput p2, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser;->endIndex:I

    iget-object p2, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser;->handler:Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler;

    iget-object v0, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser;->attribName:Ljava/lang/String;

    iget-object v1, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser;->attribValue:Ljava/lang/String;

    sget-object v2, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v2, p1

    const/4 v2, 0x1

    if-eq p1, v2, :cond_1

    const/4 v2, 0x2

    if-eq p1, v2, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    const-string p1, "\'"

    goto :goto_0

    :cond_1
    const-string p1, "\""

    :goto_0
    invoke-interface {p2, v0, v1, p1}, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler;->onAttribute(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser;->attribs:Ljava/util/Map;

    if-eqz p1, :cond_2

    iget-object p2, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser;->attribName:Ljava/lang/String;

    iget-object v0, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser;->attribValue:Ljava/lang/String;

    invoke-interface {p1, p2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    const-string p1, ""

    iput-object p1, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser;->attribValue:Ljava/lang/String;

    return-void
.end method

.method public onAttribEntity(I)V
    .locals 3

    .prologue
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser;->attribValue:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-ltz p1, :cond_0

    const v1, 0xffff

    if-gt p1, v1, :cond_0

    int-to-char p1, p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser;->attribValue:Ljava/lang/String;

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Invalid Char code: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public onAttribName(II)V
    .locals 0

    .prologue
    iput p1, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser;->startIndex:I

    invoke-direct {p0, p1, p2}, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser;->getSlice(II)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0}, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser;->getLowerCaseAttributeNames()Z

    move-result p2

    if-eqz p2, :cond_0

    sget-object p2, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {p1, p2}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p1

    const-string p2, "toLowerCase(...)"

    invoke-static {p1, p2}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_0
    iput-object p1, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser;->attribName:Ljava/lang/String;

    return-void
.end method

.method public onCData(III)V
    .locals 2

    .prologue
    iput p2, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser;->endIndex:I

    sub-int p3, p2, p3

    invoke-direct {p0, p1, p3}, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser;->getSlice(II)Ljava/lang/String;

    move-result-object p1

    iget-object p3, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser;->options:Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlOptions;

    invoke-virtual {p3}, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlOptions;->getXmlMode()Z

    move-result p3

    if-nez p3, :cond_1

    iget-object p3, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser;->options:Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlOptions;

    invoke-virtual {p3}, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlOptions;->getRecognizeCDATA()Z

    move-result p3

    if-eqz p3, :cond_0

    goto :goto_0

    :cond_0
    iget-object p3, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser;->handler:Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "[CDATA["

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "]]"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p3, p1}, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler;->onComment(Ljava/lang/String;)V

    iget-object p1, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser;->handler:Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler;

    invoke-interface {p1}, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler;->onCommentEnd()V

    goto :goto_1

    :cond_1
    :goto_0
    iget-object p3, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser;->handler:Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler;

    invoke-interface {p3}, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler;->onCDataStart()V

    iget-object p3, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser;->handler:Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler;

    invoke-interface {p3, p1}, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler;->onText(Ljava/lang/String;)V

    iget-object p1, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser;->handler:Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler;

    invoke-interface {p1}, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler;->onCDataEnd()V

    :goto_1
    add-int/lit8 p2, p2, 0x1

    iput p2, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser;->startIndex:I

    return-void
.end method

.method public onCloseTag(II)V
    .locals 5

    .prologue
    iput p2, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser;->endIndex:I

    invoke-direct {p0, p1, p2}, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser;->getSlice(II)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0}, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser;->getLowerCaseTagNames()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {p1, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "toLowerCase(...)"

    invoke-static {p1, v0}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_0
    sget-object v0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser;->foreignContextElements:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object v0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser;->htmlIntegrationElements:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser;->foreignContext:Ljava/util/List;

    invoke-static {v0}, Lj7/v;->L(Ljava/util/List;)Ljava/lang/Object;

    :cond_1
    invoke-direct {p0, p1}, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser;->isVoidElement(Ljava/lang/String;)Z

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-nez v0, :cond_4

    iget-object v0, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser;->stack:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->lastIndexOf(Ljava/lang/Object;)I

    move-result v0

    const/4 v3, -0x1

    if-eq v0, v3, :cond_3

    iget-object p1, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser;->stack:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    sub-int/2addr p1, v0

    :goto_0
    add-int/lit8 v0, p1, -0x1

    if-lez p1, :cond_5

    iget-object p1, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser;->stack:Ljava/util/List;

    invoke-static {p1}, Lj7/v;->L(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    iget-object v3, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser;->handler:Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler;

    if-eqz v0, :cond_2

    move v4, v2

    goto :goto_1

    :cond_2
    move v4, v1

    :goto_1
    invoke-interface {v3, p1, v4}, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler;->onCloseTag(Ljava/lang/String;Z)V

    move p1, v0

    goto :goto_0

    :cond_3
    iget-object v0, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser;->options:Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlOptions;

    invoke-virtual {v0}, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlOptions;->getXmlMode()Z

    move-result v0

    if-nez v0, :cond_5

    const-string v0, "p"

    invoke-static {p1, v0}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_5

    invoke-direct {p0, v0}, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser;->emitOpenTag(Ljava/lang/String;)V

    invoke-direct {p0, v2}, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser;->closeCurrentTag(Z)V

    goto :goto_2

    :cond_4
    iget-object v0, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser;->options:Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlOptions;

    invoke-virtual {v0}, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlOptions;->getXmlMode()Z

    move-result v0

    if-nez v0, :cond_5

    const-string v0, "br"

    invoke-static {p1, v0}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_5

    iget-object p1, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser;->handler:Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler;

    invoke-interface {p1, v0}, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler;->onOpenTagName(Ljava/lang/String;)V

    iget-object p1, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser;->handler:Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler;

    invoke-static {}, Lj7/S;->h()Ljava/util/Map;

    move-result-object v3

    invoke-interface {p1, v0, v3, v2}, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler;->onOpenTag(Ljava/lang/String;Ljava/util/Map;Z)V

    iget-object p1, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser;->handler:Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler;

    invoke-interface {p1, v0, v1}, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler;->onCloseTag(Ljava/lang/String;Z)V

    :cond_5
    :goto_2
    add-int/2addr p2, v2

    iput p2, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser;->startIndex:I

    return-void
.end method

.method public onComment(III)V
    .locals 1

    iput p2, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser;->endIndex:I

    iget-object v0, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser;->handler:Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler;

    sub-int p3, p2, p3

    invoke-direct {p0, p1, p3}, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser;->getSlice(II)Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler;->onComment(Ljava/lang/String;)V

    iget-object p1, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser;->handler:Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler;

    invoke-interface {p1}, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler;->onCommentEnd()V

    add-int/lit8 p2, p2, 0x1

    iput p2, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser;->startIndex:I

    return-void
.end method

.method public onDeclaration(II)V
    .locals 2

    iput p2, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser;->endIndex:I

    invoke-direct {p0, p1, p2}, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser;->getSlice(II)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser;->getInstructionName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser;->handler:Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler;

    invoke-interface {v1, v0, p1}, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler;->onProcessingInstruction(Ljava/lang/String;Ljava/lang/String;)V

    add-int/lit8 p2, p2, 0x1

    iput p2, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser;->startIndex:I

    return-void
.end method

.method public onEnd()V
    .locals 4

    .prologue
    iget v0, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser;->startIndex:I

    iput v0, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser;->endIndex:I

    iget-object v0, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser;->stack:Ljava/util/List;

    check-cast v0, Ljava/util/Collection;

    invoke-static {v0}, Lj7/v;->n(Ljava/util/Collection;)LE7/i;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    move-object v1, v0

    check-cast v1, Lj7/O;

    invoke-virtual {v1}, Lj7/O;->b()I

    move-result v1

    iget-object v2, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser;->stack:Ljava/util/List;

    invoke-static {v2}, Lj7/v;->o(Ljava/util/List;)I

    move-result v2

    sub-int/2addr v2, v1

    iget-object v1, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser;->handler:Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler;

    iget-object v3, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser;->stack:Ljava/util/List;

    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    const/4 v3, 0x1

    invoke-interface {v1, v2, v3}, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler;->onCloseTag(Ljava/lang/String;Z)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser;->handler:Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler;

    invoke-interface {v0}, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler;->onEnd()V

    return-void
.end method

.method public onOpenTagEnd(I)V
    .locals 1

    iput p1, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser;->endIndex:I

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser;->endOpenTag(Z)V

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser;->startIndex:I

    return-void
.end method

.method public onOpenTagName(II)V
    .locals 0

    .prologue
    iput p2, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser;->endIndex:I

    invoke-direct {p0, p1, p2}, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser;->getSlice(II)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0}, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser;->getLowerCaseTagNames()Z

    move-result p2

    if-eqz p2, :cond_0

    sget-object p2, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {p1, p2}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p1

    const-string p2, "toLowerCase(...)"

    invoke-static {p1, p2}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_0
    invoke-direct {p0, p1}, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser;->emitOpenTag(Ljava/lang/String;)V

    return-void
.end method

.method public onProcessingInstruction(II)V
    .locals 2

    iput p2, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser;->endIndex:I

    invoke-direct {p0, p1, p2}, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser;->getSlice(II)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser;->getInstructionName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser;->handler:Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler;

    invoke-interface {v1, v0, p1}, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler;->onProcessingInstruction(Ljava/lang/String;Ljava/lang/String;)V

    add-int/lit8 p2, p2, 0x1

    iput p2, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser;->startIndex:I

    return-void
.end method

.method public onSelfClosingTag(I)V
    .locals 2

    .prologue
    iput p1, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser;->endIndex:I

    iget-object v0, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser;->options:Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlOptions;

    invoke-virtual {v0}, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlOptions;->getXmlMode()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser;->options:Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlOptions;

    invoke-virtual {v0}, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlOptions;->getRecognizeSelfClosing()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser;->foreignContext:Ljava/util/List;

    invoke-static {v0}, Lj7/v;->v0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v0, v1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0, p1}, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser;->onOpenTagEnd(I)V

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser;->closeCurrentTag(Z)V

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser;->startIndex:I

    :goto_1
    return-void
.end method

.method public onText(II)V
    .locals 1

    invoke-direct {p0, p1, p2}, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser;->getSlice(II)Ljava/lang/String;

    move-result-object p1

    add-int/lit8 v0, p2, -0x1

    iput v0, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser;->endIndex:I

    iget-object v0, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser;->handler:Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler;

    invoke-interface {v0, p1}, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler;->onText(Ljava/lang/String;)V

    iput p2, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser;->startIndex:I

    return-void
.end method

.method public onTextEntity(II)V
    .locals 2

    .prologue
    add-int/lit8 v0, p2, -0x1

    iput v0, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser;->endIndex:I

    iget-object v0, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser;->handler:Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler;

    if-ltz p1, :cond_0

    const v1, 0xffff

    if-gt p1, v1, :cond_0

    int-to-char p1, p1

    invoke-static {p1}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler;->onText(Ljava/lang/String;)V

    iput p2, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser;->startIndex:I

    return-void

    :cond_0
    new-instance p2, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Invalid Char code: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public final parseComplete(Ljava/lang/String;)V
    .locals 1

    const-string v0, "data"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser;->reset()V

    invoke-virtual {p0, p1}, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser;->end(Ljava/lang/String;)V

    return-void
.end method

.method public final pause()V
    .locals 1

    iget-object v0, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser;->ksoupTokenizer:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;

    invoke-virtual {v0}, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->pause()V

    return-void
.end method

.method public final reset()V
    .locals 2

    iget-object v0, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser;->handler:Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler;

    invoke-interface {v0}, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler;->onReset()V

    iget-object v0, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser;->ksoupTokenizer:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;

    invoke-virtual {v0}, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->reset()V

    const-string v0, ""

    iput-object v0, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser;->tagName:Ljava/lang/String;

    iput-object v0, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser;->attribName:Ljava/lang/String;

    iput-object v0, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser;->attribValue:Ljava/lang/String;

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser;->attribs:Ljava/util/Map;

    iget-object v0, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser;->stack:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    const/4 v0, 0x0

    iput v0, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser;->startIndex:I

    iput v0, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser;->endIndex:I

    iget-object v1, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser;->handler:Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler;

    invoke-interface {v1, p0}, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler;->onParserInit(Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser;)V

    iget-object v1, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser;->buffers:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->clear()V

    iput v0, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser;->bufferOffset:I

    iput v0, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser;->writeIndex:I

    iput-boolean v0, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser;->ended:Z

    return-void
.end method

.method public final resume()V
    .locals 4

    .prologue
    iget-object v0, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser;->ksoupTokenizer:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;

    invoke-virtual {v0}, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->resume()V

    :goto_0
    iget-object v0, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser;->ksoupTokenizer:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;

    invoke-virtual {v0}, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->getRunning()Z

    move-result v0

    if-eqz v0, :cond_0

    iget v0, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser;->writeIndex:I

    iget-object v1, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser;->buffers:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_0

    iget-object v0, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser;->ksoupTokenizer:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;

    iget-object v1, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser;->buffers:Ljava/util/List;

    iget v2, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser;->writeIndex:I

    add-int/lit8 v3, v2, 0x1

    iput v3, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser;->writeIndex:I

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->write(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    iget-boolean v0, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser;->ended:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser;->ksoupTokenizer:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;

    invoke-virtual {v0}, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->end()V

    :cond_1
    return-void
.end method

.method public final write(Ljava/lang/String;)V
    .locals 2

    .prologue
    const-string v0, "chunk"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser;->ended:Z

    if-eqz v0, :cond_0

    iget-object p1, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser;->handler:Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler;

    new-instance v0, Ljava/lang/Exception;

    const-string v1, ".write() after done!"

    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    invoke-interface {p1, v0}, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlHandler;->onError(Ljava/lang/Exception;)V

    return-void

    :cond_0
    iget-object v0, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser;->buffers:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser;->ksoupTokenizer:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;

    invoke-virtual {v0}, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->getRunning()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser;->ksoupTokenizer:Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;

    invoke-virtual {v0, p1}, Lcom/mohamedrejeb/ksoup/html/tokenizer/KsoupTokenizer;->write(Ljava/lang/String;)V

    iget p1, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser;->writeIndex:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Lcom/mohamedrejeb/ksoup/html/parser/KsoupHtmlParser;->writeIndex:I

    :cond_1
    return-void
.end method
